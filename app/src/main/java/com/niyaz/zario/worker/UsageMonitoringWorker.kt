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
import com.niyaz.zario.data.ScreenTimePlan
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
                Log.w(TAG, "Plan missing evaluation start, aborting cycle")
                return Result.success()
            }
            val currentTime = System.currentTimeMillis()
            val elapsedTime = currentTime - evaluationStartTime
            
            // Check if evaluation period has ended (end of calendar day)
            val dayExpired = !com.niyaz.zario.utils.CalendarUtils.isWithinCurrentDay(evaluationStartTime) || 
                           currentTime >= com.niyaz.zario.utils.CalendarUtils.getEndOfCurrentDay()
            
            if (dayExpired) {
                Log.d(TAG, "Evaluation period completed (end of calendar day)")
                val evaluationEndTime = com.niyaz.zario.utils.CalendarUtils.getEndOfCurrentDay()
                return completeEvaluation(evaluationStartTime, evaluationEndTime, activePlan)
            }

            // Track current usage using shared helper (reusable by ViewModel too)
            val currentUsage = UsageStatsUtils.getCurrentDayScreenTimePrecise(applicationContext)
            
            Log.d(TAG, "Current usage: ${currentUsage}ms, Elapsed: ${elapsedTime}ms")

            // Check 80% threshold notification
            val threshold = (activePlan.goalTimeMs * Constants.NOTIFICATION_THRESHOLD_PERCENTAGE).toLong()
            if (activePlan.goalTimeMs > 0 && currentUsage >= threshold && !repository.hasSent80PercentNotification()) {
                Log.i(TAG, "80% usage threshold reached – sending notification")
                com.niyaz.zario.utils.NotificationUtils.sendUsageThresholdReached(applicationContext, activePlan, currentUsage)
                repository.mark80PercentNotificationSent()
            }
            
            // Build progress/output data
            val outputData = Data.Builder()
                .putLong(OUTPUT_CURRENT_USAGE, currentUsage)
                .putLong(OUTPUT_ELAPSED_TIME, elapsedTime)
                .putLong(OUTPUT_GOAL_TIME, activePlan.goalTimeMs)
                .putString(OUTPUT_PLAN_LABEL, activePlan.label)
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

    private fun completeEvaluation(startTime: Long, endTime: Long, plan: ScreenTimePlan): Result {
        return try {
            val finalUsage = UsageStatsUtils.getCurrentDayScreenTimePrecise(applicationContext)

            // Persist history entry (best-effort, ignore failures)
            val metGoal = if (plan.goalTimeMs > 0) finalUsage <= plan.goalTimeMs else false

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
                    planLabel = plan.label,
                    goalTimeMs = plan.goalTimeMs,
                    dailyAverageMs = plan.dailyAverageMs,
                    finalUsageMs = finalUsage,
                    evaluationStartTime = startTime,
                    evaluationEndTime = endTime,
                    metGoal = metGoal
                )
                kotlinx.coroutines.runBlocking { repository.recordCycleResult(entry) }

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
                .putLong(OUTPUT_CURRENT_USAGE, finalUsage)
                .putLong(OUTPUT_ELAPSED_TIME, endTime - startTime)
                .putLong(OUTPUT_GOAL_TIME, plan.goalTimeMs)
                .putString(OUTPUT_PLAN_LABEL, plan.label)
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
        const val OUTPUT_CURRENT_USAGE = "current_usage"
        const val OUTPUT_ELAPSED_TIME = "elapsed_time"
        const val OUTPUT_GOAL_TIME = "goal_time"
        const val OUTPUT_TIMESTAMP = "timestamp"
        const val OUTPUT_PLAN_LABEL = "plan_label"
        const val OUTPUT_EVALUATION_COMPLETE = "evaluation_complete"
    }
} 