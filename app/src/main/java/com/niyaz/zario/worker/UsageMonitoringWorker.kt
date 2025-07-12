package com.niyaz.zario.worker

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.Data
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkerParameters
import com.niyaz.zario.Constants
import com.niyaz.zario.repository.EvaluationRepository
import com.niyaz.zario.utils.UsageStatsUtils
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.util.concurrent.TimeUnit
import com.niyaz.zario.utils.NotificationUtils
import androidx.work.OutOfQuotaPolicy
import com.niyaz.zario.worker.MonitoringSchedulerWorker

@HiltWorker
class UsageMonitoringWorker @AssistedInject constructor(
    @Assisted appContext: Context,
    @Assisted params: WorkerParameters,
    private val repository: EvaluationRepository,
    private val sessionRepository: com.niyaz.zario.repository.UserSessionRepository
) : CoroutineWorker(appContext, params) {

    init {
        Log.d(TAG, "UsageMonitoringWorker instantiated successfully with Hilt")
    }

    override suspend fun doWork(): Result = withContext(Dispatchers.IO) {
        return@withContext try {
            Log.d(TAG, "UsageMonitoringWorker started")
            
            // Note: Removed foreground promotion to avoid Android 14 background start restrictions
            // Expedited execution still ensures fresh usage stats via WorkManager priority

            val targetApp = repository.getCurrentTargetApp() ?: run {
                Log.w(TAG, "No target app found")
                return@withContext Result.failure()
            }

            val evaluationStartTime = targetApp.evaluationStartTime ?: run {
                Log.w(TAG, "Evaluation not started")
                return@withContext Result.failure()
            }

            val currentTime = System.currentTimeMillis()
            val elapsedTime = currentTime - evaluationStartTime
            
            // Check if evaluation period has ended
            if (elapsedTime >= Constants.EVALUATION_DURATION_MS) {
                Log.d(TAG, "Evaluation period completed")
                return@withContext completeEvaluation(targetApp.packageName, evaluationStartTime, currentTime)
            }

            // Track current usage using shared helper (reusable by ViewModel too)
            val currentUsage = UsageStatsUtils.preciseUsageSinceBaseline(
                applicationContext,
                targetApp.packageName,
                targetApp.baselineUsageMs,
                targetApp.evaluationStartTime
            )
            
            Log.d(TAG, "Current usage: ${currentUsage}ms, Elapsed: ${elapsedTime}ms")

            // Check 80% threshold notification
            val threshold = (targetApp.goalTimeMs * Constants.NOTIFICATION_THRESHOLD_PERCENTAGE).toLong()
            if (targetApp.goalTimeMs > 0 && currentUsage >= threshold && !repository.hasSent80PercentNotification()) {
                Log.i(TAG, "80% usage threshold reached – sending notification")
                com.niyaz.zario.utils.NotificationUtils.sendUsageThresholdReached(applicationContext, targetApp, targetApp.goalTimeMs)
                repository.mark80PercentNotificationSent()
            }
            
            // Build progress/output data
            val outputData = Data.Builder()
                .putString(OUTPUT_PACKAGE_NAME, targetApp.packageName)
                .putLong(OUTPUT_CURRENT_USAGE, currentUsage)
                .putLong(OUTPUT_ELAPSED_TIME, elapsedTime)
                .putLong(OUTPUT_GOAL_TIME, targetApp.goalTimeMs)
                .putLong(OUTPUT_TIMESTAMP, currentTime)
                .build()

            // Publish progress so observers see updates while RUNNING
            setProgress(outputData)
            
            Log.d(TAG, "UsageMonitoringWorker completed successfully")

            Result.success(outputData)
            
        } catch (e: Exception) {
            Log.e(TAG, "UsageMonitoringWorker failed", e)
            Result.failure()
        }
    }

    private fun completeEvaluation(packageName: String, startTime: Long, endTime: Long): Result {
        return try {
            val targetApp = repository.getCurrentTargetApp()
            val finalUsage = UsageStatsUtils.preciseUsageSinceBaseline(
                applicationContext,
                packageName,
                targetApp?.baselineUsageMs ?: 0L,
                targetApp?.evaluationStartTime
            )

            // Persist history entry (best-effort, ignore failures)
            if (targetApp != null) {
                val metGoal = finalUsage <= targetApp.goalTimeMs

                // -----------------------------------------------------------
                // Points adjustment logic (clamped)
                // -----------------------------------------------------------
                val condition = sessionRepository.session.value.user?.condition ?: com.niyaz.zario.data.Condition.CONTROL
                val delta = when (condition) {
                    com.niyaz.zario.data.Condition.CONTROL -> if (metGoal) com.niyaz.zario.Constants.CONTROL_REWARD else -com.niyaz.zario.Constants.CONTROL_PENALTY
                    com.niyaz.zario.data.Condition.DEPOSIT -> if (metGoal) com.niyaz.zario.Constants.DEPOSIT_REWARD else -com.niyaz.zario.Constants.DEPOSIT_PENALTY
                    com.niyaz.zario.data.Condition.FLEXIBLE -> {
                        val user = sessionRepository.session.value.user
                        val reward = user?.flexibleReward ?: com.niyaz.zario.Constants.FLEXIBLE_REWARD
                        val penalty = user?.flexiblePenalty ?: com.niyaz.zario.Constants.FLEXIBLE_PENALTY
                        if (metGoal) reward else -penalty
                    }
                }
                sessionRepository.adjustPoints(delta)

                // Get current user email for history entry
                val userEmail = sessionRepository.session.value.user?.email ?: ""

                val entry = EvaluationHistoryEntry(
                    userEmail = userEmail,
                    packageName = packageName,
                    appName = targetApp.appName,
                    goalTimeMs = targetApp.goalTimeMs,
                    finalUsageMs = finalUsage,
                    evaluationStartTime = startTime,
                    evaluationEndTime = endTime,
                    metGoal = metGoal
                )
                kotlinx.coroutines.runBlocking { repository.recordCycleResult(entry) }
            }

            // CRITICAL FIX: Mark evaluation as completed BEFORE starting next cycle
            // This prevents race conditions with ViewModel refresh operations
            repository.markEvaluationCompleted()

            // Notify user that the cycle has finished
            NotificationUtils.sendEvaluationCycleCompleted(applicationContext)

            // Start next evaluation cycle immediately (indefinite cycles)
            repository.startNextCycle()

            // Enqueue scheduler to start next monitoring immediately
            val nextScheduler = OneTimeWorkRequestBuilder<MonitoringSchedulerWorker>()
                .build()
            WorkManager.getInstance(applicationContext)
                .enqueueUniqueWork(
                    MonitoringSchedulerWorker.WORK_NAME,
                    ExistingWorkPolicy.REPLACE,
                    nextScheduler
                )
            Log.d(TAG, "Next scheduler enqueued for new cycle")

            val outputData = Data.Builder()
                .putString(OUTPUT_PACKAGE_NAME, packageName)
                .putLong(OUTPUT_CURRENT_USAGE, finalUsage)
                .putLong(OUTPUT_ELAPSED_TIME, Constants.EVALUATION_DURATION_MS)
                .putLong(OUTPUT_GOAL_TIME, repository.getCurrentTargetApp()?.goalTimeMs ?: 0L)
                .putLong(OUTPUT_TIMESTAMP, endTime)
                .putBoolean(OUTPUT_EVALUATION_COMPLETE, true)
                .build()

            Log.i(TAG, "Evaluation completed - Final usage: ${finalUsage}ms. Next cycle started.")
            Result.success(outputData)

        } catch (e: Exception) {
            Log.e(TAG, "Error completing evaluation", e)
            Result.failure()
        }
    }

    companion object {
        const val TAG = "UsageMonitoringWorker"
        const val WORK_NAME = "usage_monitoring"
        
        // Output data keys
        const val OUTPUT_PACKAGE_NAME = "package_name"
        const val OUTPUT_CURRENT_USAGE = "current_usage"
        const val OUTPUT_ELAPSED_TIME = "elapsed_time"
        const val OUTPUT_GOAL_TIME = "goal_time"
        const val OUTPUT_TIMESTAMP = "timestamp"
        const val OUTPUT_EVALUATION_COMPLETE = "evaluation_complete"
    }
} 