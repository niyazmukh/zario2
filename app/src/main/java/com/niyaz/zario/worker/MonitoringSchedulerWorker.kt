package com.niyaz.zario.worker

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.OutOfQuotaPolicy
import androidx.work.WorkManager
import androidx.work.WorkerParameters
import com.niyaz.zario.Constants
import com.niyaz.zario.repository.EvaluationRepository
import com.niyaz.zario.utils.UsageStatsUtils
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.util.concurrent.TimeUnit
import java.time.LocalTime

@HiltWorker
class MonitoringSchedulerWorker @AssistedInject constructor(
    @Assisted appContext: Context,
    @Assisted params: WorkerParameters,
    private val repository: EvaluationRepository
) : CoroutineWorker(appContext, params) {

    init {
        Log.d(TAG, "MonitoringSchedulerWorker instantiated successfully with Hilt")
    }

    override suspend fun doWork(): Result {
        return try {
            Log.i(TAG, "🔄 EXECUTING MonitoringSchedulerWorker - will call getCurrentDayUsagePrecise() for adaptive interval calculation")
            
            // Calculate the adaptive interval for the next check
            val intervalMs = calculateAdaptiveInterval()
            Log.d(TAG, "Calculated adaptive interval: ${intervalMs}ms")
            
            // Enqueue the usage monitoring worker immediately (expedited)
            val monitoringWork = OneTimeWorkRequestBuilder<UsageMonitoringWorker>()
                .setExpedited(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST)
                .build()

            // Calculate and clamp adaptive interval
            val adaptiveInterval = calculateAdaptiveInterval()

            val currentPlan = repository.getCurrentPlan()
            val timeRemainingMs = if (currentPlan?.evaluationStartTime != null &&
                com.niyaz.zario.utils.CalendarUtils.isWithinCurrentDay(currentPlan.evaluationStartTime)
            ) {
                com.niyaz.zario.utils.CalendarUtils.getTimeRemainingInCurrentDay()
            } else {
                com.niyaz.zario.utils.CalendarUtils.getTimeRemainingInCurrentDay()
            }

            val maxAllowed = (timeRemainingMs / 1000).coerceAtLeast(1)
            val interval = minOf(adaptiveInterval, maxAllowed)

            // Self-schedule next run with delay
            val nextScheduler = OneTimeWorkRequestBuilder<MonitoringSchedulerWorker>()
                .setInitialDelay(interval, TimeUnit.SECONDS)
                .build()
            WorkManager.getInstance(applicationContext).enqueueUniqueWork(
                WORK_NAME,
                ExistingWorkPolicy.REPLACE,
                nextScheduler
            )

            Log.d(TAG, "Next scheduler enqueued (delay ${interval}s, remaining ${timeRemainingMs}ms)")

            Result.success()
        } catch (e: Exception) {
            Log.e(TAG, "MonitoringSchedulerWorker failed", e)
            Result.failure()
        }
    }

    /**
     * Calculates the next monitoring interval based on current usage state.
     * Adaptive timing to balance responsiveness with battery efficiency.
     */
    private fun calculateAdaptiveInterval(): Long {
        val plan = repository.getCurrentPlan() ?: return Constants.WORKER_IDLE_INTERVAL_SECONDS

        // Get current usage percentage
        val currentUsage = UsageStatsUtils.getCurrentDayScreenTimePrecise(applicationContext)
        val usagePercentage = if (plan.goalTimeMs > 0) {
            (currentUsage.toFloat() / plan.goalTimeMs.toFloat()) * 100f
        } else 0f
        
        // Determine if device is actively being used (foreground app present)
        val foregroundPackage = UsageStatsUtils.getCurrentForegroundApp(applicationContext)
        val isDeviceActive = foregroundPackage != null
         
        // Get current hour for time-based adjustments
        val currentHour = LocalTime.now().hour
        
        return when {
            // Critical: Near goal threshold (80%+ usage) *and* user is actively using the target app
            usagePercentage >= 80f && isDeviceActive -> {
                Log.d(TAG, "Critical interval (30s) - usage at ${String.format("%.1f", usagePercentage)}% while device active ($foregroundPackage)")
                Constants.WORKER_CRITICAL_INTERVAL_SECONDS
            }
            
            // Active: Device is currently being used
            isDeviceActive -> {
                Log.d(TAG, "Active interval (60s) - device active ($foregroundPackage)")
                Constants.WORKER_ACTIVE_INTERVAL_SECONDS
            }
            
            // Night: Reduce monitoring during sleep hours
            currentHour in 0..6 -> {
                Log.d(TAG, "Night interval (600s) - hour $currentHour")
                Constants.WORKER_NIGHT_INTERVAL_SECONDS
            }
            
            // Idle: Default case - target app not active
            else -> {
                Log.d(TAG, "Idle interval (300s) - device idle, usage at ${String.format("%.1f", usagePercentage)}%")
                Constants.WORKER_IDLE_INTERVAL_SECONDS
            }
        }
    }

    companion object {
        const val TAG = "MonitoringSchedulerWorker"
        const val WORK_NAME = "usage_monitoring_scheduler"
    }
} 