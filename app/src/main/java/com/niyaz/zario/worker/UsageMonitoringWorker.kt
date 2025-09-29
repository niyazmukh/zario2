package com.niyaz.zario.worker

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.Data
import androidx.work.WorkerParameters
import com.niyaz.zario.BuildConfig
import com.niyaz.zario.Constants
import com.niyaz.zario.core.evaluation.EvaluationRepository
import com.niyaz.zario.core.evaluation.EvaluationResultProcessor
import com.niyaz.zario.core.evaluation.EvaluationRemoteDataSource
import com.niyaz.zario.core.usage.UsageStatsRepository
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.monitoring.MonitoringNotificationDispatcher
import com.niyaz.zario.utils.CalendarUtils
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import java.util.concurrent.TimeUnit

@HiltWorker
class UsageMonitoringWorker @AssistedInject constructor(
    @Assisted private val appContext: Context,
    @Assisted params: WorkerParameters,
    private val repository: EvaluationRepository,
    private val resultProcessor: EvaluationResultProcessor,
    private val usageStatsRepository: UsageStatsRepository,
    private val monitoringWorkScheduler: MonitoringWorkScheduler,
    private val notificationDispatcher: MonitoringNotificationDispatcher,
    private val remoteDataSource: EvaluationRemoteDataSource
) : CoroutineWorker(appContext, params) {

    init {
        if (BuildConfig.DEBUG) {
            Log.d(TAG, "UsageMonitoringWorker instantiated successfully with Hilt")
        }
    }

    override suspend fun doWork(): Result {
        return try {
            Log.i(TAG, "🔄 EXECUTING UsageMonitoringWorker - fetching global screen-time usage")

            val currentPlan = repository.getCurrentPlan() ?: run {
                Log.w(TAG, "No active screen-time plan configured, stopping monitoring")
                return Result.success()
            }

            val activePlan = if (currentPlan.evaluationStartTime == null) {
                repository.startEvaluation() ?: currentPlan
            } else currentPlan

            val evaluationStartTime = activePlan.evaluationStartTime ?: run {
                val nextCycleStart = repository.getNextCycleStartTime()
                val nextCycleLabel = nextCycleStart?.toString() ?: "unknown"
                if (BuildConfig.DEBUG) {
                    Log.d(TAG, "Evaluation start pending (next cycle at $nextCycleLabel), skipping usage check")
                }
                return Result.success()
            }

            val currentTime = System.currentTimeMillis()
            val elapsedTime = currentTime - evaluationStartTime

            val dayExpired = !CalendarUtils.isWithinCurrentDay(evaluationStartTime) ||
                currentTime >= CalendarUtils.getEndOfDay(evaluationStartTime)

            if (dayExpired) {
                Log.d(TAG, "Evaluation period completed (end of calendar day)")
                val evaluationEndTime = CalendarUtils.getEndOfDay(evaluationStartTime)
                return completeEvaluation(evaluationStartTime, evaluationEndTime, activePlan)
            }

            val usageSnapshot = usageStatsRepository.getSnapshot()
            val currentUsage = usageSnapshot.totalUsageMs

            captureHourlySnapshotsIfNeeded(activePlan, evaluationStartTime, currentTime)

            if (BuildConfig.DEBUG) {
                Log.d(TAG, "Current usage: ${currentUsage}ms, Elapsed: ${elapsedTime}ms")
            }

            if (activePlan.goalTimeMs > 0) {
                val highestNotified = repository.getHighestUsageNotification()
                val thresholds = Constants.USAGE_NOTIFICATION_THRESHOLDS
                var thresholdToNotify: Int? = null

                for (thresholdPercent in thresholds) {
                    if (thresholdPercent <= highestNotified) continue

                    val thresholdUsage = activePlan.goalTimeMs * thresholdPercent / 100
                    if (currentUsage >= thresholdUsage) {
                        thresholdToNotify = thresholdPercent
                    } else {
                        break
                    }
                }

                thresholdToNotify?.let { percent ->
                    Log.i(TAG, "$percent% usage threshold reached – triggering notification")
                    notificationDispatcher.notifyUsageThresholdReached(appContext, activePlan, currentUsage, percent)
                    repository.markUsageNotification(percent)
                }
            }

            val outputData = Data.Builder()
                .putLong(OUTPUT_CURRENT_USAGE, currentUsage)
                .putLong(OUTPUT_ELAPSED_TIME, elapsedTime)
                .putLong(OUTPUT_GOAL_TIME, activePlan.goalTimeMs)
                .putString(OUTPUT_PLAN_LABEL, activePlan.label)
                .putLong(OUTPUT_TIMESTAMP, currentTime)
                .build()

            setProgress(outputData)

            if (BuildConfig.DEBUG) {
                Log.d(TAG, "UsageMonitoringWorker completed successfully")
            }

            Result.success(outputData)
        } catch (e: Exception) {
            Log.e(TAG, "UsageMonitoringWorker failed", e)
            Result.failure()
        }
    }

    private suspend fun completeEvaluation(startTime: Long, endTime: Long, plan: ScreenTimePlan): Result {
        return try {
            val finalUsage = usageStatsRepository.getSnapshot(forceRefresh = true).totalUsageMs

            val hourlyUsage = usageStatsRepository.getUsageBuckets(
                startMillis = startTime,
                endMillis = endTime,
                bucketSizeMillis = TimeUnit.HOURS.toMillis(1)
            )

            val result = resultProcessor.finalizeCycle(
                plan = plan,
                finalUsageMs = finalUsage,
                evaluationStartTime = startTime,
                evaluationEndTime = endTime,
                hourlyUsage = hourlyUsage
            )

            notificationDispatcher.scheduleCycleCompletionNotification(appContext, endTime)

            val delayMs = (result.nextCycleStartTime - System.currentTimeMillis()).coerceAtLeast(0L)
            monitoringWorkScheduler.enqueueSchedulerWithDelayMillis(delayMs)
            if (BuildConfig.DEBUG) {
                Log.d(TAG, "Next scheduler enqueued for new cycle via MonitoringWorkScheduler")
            }

            val outputData = Data.Builder()
                .putLong(OUTPUT_CURRENT_USAGE, result.finalUsageMs)
                .putLong(OUTPUT_ELAPSED_TIME, endTime - startTime)
                .putLong(OUTPUT_GOAL_TIME, result.goalTimeMs)
                .putString(OUTPUT_PLAN_LABEL, result.planLabel)
                .putLong(OUTPUT_TIMESTAMP, endTime)
                .putBoolean(OUTPUT_EVALUATION_COMPLETE, true)
                .build()

            Log.i(
                TAG,
                "Evaluation completed - Final usage: ${finalUsage}ms. Next cycle at ${result.nextCycleStartTime}. Points balance: ${result.newPointBalance}"
            )
            Result.success(outputData)

        } catch (e: Exception) {
            Log.e(TAG, "Error completing evaluation", e)
            if (runAttemptCount < Constants.MAX_WORKER_RETRIES) Result.retry() else Result.failure()
        }
    }

    private suspend fun captureHourlySnapshotsIfNeeded(
        activePlan: ScreenTimePlan,
        evaluationStartTime: Long,
        now: Long
    ) {
        val lastCompleteHour = CalendarUtils.floorToHour(now)
        if (lastCompleteHour <= evaluationStartTime) return

        val buckets = usageStatsRepository.getUsageBuckets(
            startMillis = evaluationStartTime,
            endMillis = lastCompleteHour,
            bucketSizeMillis = TimeUnit.HOURS.toMillis(1)
        )

        if (buckets.isEmpty()) return

        remoteDataSource.syncHourlySnapshots(
            planLabel = activePlan.label,
            cycleStartTime = evaluationStartTime,
            buckets = buckets
        )
    }

    companion object {
        const val TAG = "UsageMonitoringWorker"
        const val WORK_NAME = "usage_monitoring"

        const val OUTPUT_CURRENT_USAGE = "current_usage"
        const val OUTPUT_ELAPSED_TIME = "elapsed_time"
        const val OUTPUT_GOAL_TIME = "goal_time"
        const val OUTPUT_TIMESTAMP = "timestamp"
        const val OUTPUT_PLAN_LABEL = "plan_label"
        const val OUTPUT_EVALUATION_COMPLETE = "evaluation_complete"
    }
}
