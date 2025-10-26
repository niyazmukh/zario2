package com.niyaz.zario.worker

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.niyaz.zario.BuildFlags
import com.niyaz.zario.Constants
import com.niyaz.zario.core.evaluation.EvaluationRepository
import com.niyaz.zario.core.usage.UsageStatsRepository
import com.niyaz.zario.utils.CalendarUtils
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import java.time.LocalTime
import java.util.concurrent.TimeUnit

@HiltWorker
class MonitoringSchedulerWorker @AssistedInject constructor(
    @Assisted appContext: Context,
    @Assisted params: WorkerParameters,
    private val repository: EvaluationRepository,
    private val usageStatsRepository: UsageStatsRepository,
    private val monitoringWorkScheduler: MonitoringWorkScheduler
) : CoroutineWorker(appContext, params) {

    init {
        if (BuildFlags.isDebug) {
            Log.d(TAG, "MonitoringSchedulerWorker instantiated successfully with Hilt")
        }
    }

    override suspend fun doWork(): Result {
        return try {
            Log.i(TAG, "🔄 EXECUTING MonitoringSchedulerWorker - will call getCurrentDayUsagePrecise() for adaptive interval calculation")

            val plan = repository.getCurrentPlan()
            if (plan == null) {
                Log.w(TAG, "No screen-time plan configured; cancelling monitoring chain")
                monitoringWorkScheduler.cancelMonitoring()
                monitoringWorkScheduler.cancelScheduler()
                return Result.success()
            }

            val now = System.currentTimeMillis()
            val nextCycleStart = repository.getNextCycleStartTime()

            if (!repository.hasActiveEvaluation()) {
                if (nextCycleStart != null && now < nextCycleStart) {
                    val delaySeconds = TimeUnit.MILLISECONDS.toSeconds(nextCycleStart - now).coerceAtLeast(1)
                    if (BuildFlags.isDebug) {
                        Log.d(TAG, "Evaluation inactive – waiting ${delaySeconds}s for next cycle window")
                    }
                    scheduleSelf(delaySeconds)
                    return Result.success()
                }

                repository.startEvaluation()
            }

            if (!repository.hasActiveEvaluation()) {
                if (BuildFlags.isDebug) {
                    Log.d(TAG, "Evaluation still inactive after start attempt; retrying soon")
                }
                scheduleSelf(Constants.WORKER_IDLE_INTERVAL_SECONDS)
                return Result.success()
            }

            monitoringWorkScheduler.enqueueMonitoringWork()

            val timeRemainingMs = CalendarUtils.getTimeRemainingInCurrentDay()
            val maxAllowedSeconds = TimeUnit.MILLISECONDS.toSeconds(timeRemainingMs).coerceAtLeast(1)
            val adaptiveIntervalSeconds = calculateAdaptiveInterval().coerceAtLeast(1)
            val intervalSeconds = adaptiveIntervalSeconds.coerceAtMost(maxAllowedSeconds)

            scheduleSelf(intervalSeconds)

            Result.success()
        } catch (e: Exception) {
            Log.e(TAG, "MonitoringSchedulerWorker failed", e)
            Result.failure()
        }
    }

    private fun scheduleSelf(delaySeconds: Long) {
        monitoringWorkScheduler.enqueueScheduler(delaySeconds)
    }

    private suspend fun calculateAdaptiveInterval(): Long {
        val plan = repository.getCurrentPlan() ?: return Constants.WORKER_IDLE_INTERVAL_SECONDS

        val refreshFailures = usageStatsRepository.refreshStatus.value.consecutiveFailures
        if (refreshFailures >= USAGE_FAILURE_BACKOFF_THRESHOLD) {
            if (BuildFlags.isDebug) {
                val reason = usageStatsRepository.refreshStatus.value.lastErrorMessage ?: "unknown"
                Log.d(TAG, "Usage stats refresh failing ($refreshFailures consecutive). Backing off to idle interval. Reason: $reason")
            }
            return Constants.WORKER_IDLE_INTERVAL_SECONDS
        }

        val currentUsage = usageStatsRepository.getSnapshot().totalUsageMs
        val usagePercentage = if (plan.goalTimeMs > 0) {
            (currentUsage.toFloat() / plan.goalTimeMs.toFloat()) * 100f
        } else 0f

        val foregroundPackage = usageStatsRepository.getForegroundApp()
        val isDeviceActive = foregroundPackage != null

        val currentHour = LocalTime.now().hour

        return when {
            usagePercentage >= 80f && isDeviceActive -> {
                if (BuildFlags.isDebug) {
                    Log.d(TAG, "Critical interval (30s) - usage at ${String.format("%.1f", usagePercentage)}% while device active ($foregroundPackage)")
                }
                Constants.WORKER_CRITICAL_INTERVAL_SECONDS
            }
            isDeviceActive -> {
                if (BuildFlags.isDebug) {
                    Log.d(TAG, "Active interval (60s) - device active ($foregroundPackage)")
                }
                Constants.WORKER_ACTIVE_INTERVAL_SECONDS
            }
            currentHour in 0..6 -> {
                if (BuildFlags.isDebug) {
                    Log.d(TAG, "Night interval (600s) - hour $currentHour")
                }
                Constants.WORKER_NIGHT_INTERVAL_SECONDS
            }
            else -> {
                if (BuildFlags.isDebug) {
                    Log.d(TAG, "Idle interval (300s) - device idle, usage at ${String.format("%.1f", usagePercentage)}%")
                }
                Constants.WORKER_IDLE_INTERVAL_SECONDS
            }
        }
    }

    companion object {
        const val TAG = "MonitoringSchedulerWorker"
        const val WORK_NAME = "usage_monitoring_scheduler"
        private const val USAGE_FAILURE_BACKOFF_THRESHOLD = 3
    }
}
