package com.niyaz.zario.ui.intervention

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.viewModelScope
import androidx.work.WorkInfo
import androidx.work.WorkManager
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.ExistingWorkPolicy
import androidx.work.OutOfQuotaPolicy
import com.niyaz.zario.Constants
import com.niyaz.zario.R
import com.niyaz.zario.data.EvaluationProgress
import com.niyaz.zario.data.EvaluationState
import com.niyaz.zario.data.TargetApp
import com.niyaz.zario.repository.EvaluationRepository
import com.niyaz.zario.worker.UsageMonitoringWorker
import com.niyaz.zario.worker.MonitoringSchedulerWorker
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class InterventionViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val repository: EvaluationRepository
) : ViewModel() {

    private val workManager = WorkManager.getInstance(context)

    private val _evaluationState = MutableStateFlow<EvaluationState>(EvaluationState.NotStarted)
    val evaluationState: StateFlow<EvaluationState> = _evaluationState.asStateFlow()

    private var workInfoLiveData: LiveData<List<WorkInfo>>? = null
    private var workInfoObserver: Observer<List<WorkInfo>>? = null

    init {
        // Start evaluation when ViewModel is created (when intervention screen is loaded)
        startEvaluation()
    }

    fun startEvaluation() {
        viewModelScope.launch {
            try {
                Log.d(TAG, "Starting evaluation process")
                _evaluationState.value = EvaluationState.Preparing
                
                // Get or start evaluation for current target
                val currentTarget = repository.startEvaluation()
                if (currentTarget == null) {
                    Log.e(TAG, "No target app found")
                    _evaluationState.value = EvaluationState.Error(context.getString(R.string.error_no_target_selected))
                    return@launch
                }

                Log.d(TAG, "Evaluation in progress for ${currentTarget.packageName}")
                
                // Compute current progress if evaluation already running
                val evaluationStart = currentTarget.evaluationStartTime
                val now = System.currentTimeMillis()
                val elapsed = if (evaluationStart != null) now - evaluationStart else 0L

                val currentUsage = if (evaluationStart != null) {
                    kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
                        com.niyaz.zario.utils.UsageStatsUtils.preciseUsageSinceBaseline(
                            context,
                            currentTarget.packageName,
                            currentTarget.baselineUsageMs,
                            currentTarget.evaluationStartTime
                        )
                    }
                } else 0L

                val remaining = Constants.EVALUATION_DURATION_MS - elapsed
                val usagePct = if (currentTarget.goalTimeMs > 0)
                    (currentUsage.toFloat() / currentTarget.goalTimeMs.toFloat()) * Constants.PROGRESS_MAX_PERCENTAGE else 0f
                val timePct = if (Constants.EVALUATION_DURATION_MS > 0)
                    (elapsed.toFloat() / Constants.EVALUATION_DURATION_MS.toFloat()) * Constants.PROGRESS_MAX_PERCENTAGE else 0f

                // Start monitoring work (idempotent – REPLACE policy in WorkManager ensures single chain)
                startUsageMonitoring()

                _evaluationState.value = EvaluationState.Active(
                    EvaluationProgress(
                        targetApp = currentTarget,
                        currentUsageMs = currentUsage,
                        elapsedTimeMs = elapsed,
                        remainingTimeMs = remaining,
                        isActive = true,
                        usagePercentage = usagePct,
                        timePercentage = timePct
                    )
                )
                
            } catch (e: Exception) {
                Log.e(TAG, "Error starting evaluation", e)
                _evaluationState.value = EvaluationState.Error(
                    context.getString(R.string.error_evaluation_start_failed, e.message ?: context.getString(R.string.debug_unknown_error))
                )
            }
        }
    }

    /**
     * Recomputes the current evaluation progress instantly (e.g. when app returns
     * to foreground) without restarting workers. Runs on IO dispatcher.
     */
    fun refreshProgress() {
        viewModelScope.launch {
            val currentTarget = repository.getCurrentTargetApp() ?: return@launch
            val evalStart = currentTarget.evaluationStartTime ?: return@launch

            // CRITICAL FIX: Check repository completion state first
            // This prevents race conditions where refreshProgress runs after worker completion
            if (repository.shouldShowCompletionState()) {
                Log.d(TAG, "Evaluation already completed - skipping refresh calculation")
                return@launch
            }

            val now = System.currentTimeMillis()
            val elapsed = now - evalStart

            // If the evaluation window has passed, compute the final outcome immediately
            // instead of waiting for the next worker tick. This prevents negative timers
            // and ensures the UI reflects the correct final state.
            if (elapsed >= Constants.EVALUATION_DURATION_MS) {
                val finalUsage = kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
                    com.niyaz.zario.utils.UsageStatsUtils.preciseUsageSinceBaseline(
                        context,
                        currentTarget.packageName,
                        currentTarget.baselineUsageMs,
                        currentTarget.evaluationStartTime
                    )
                }

                val usagePct = if (currentTarget.goalTimeMs > 0)
                    (finalUsage.toFloat() / currentTarget.goalTimeMs.toFloat()) * Constants.PROGRESS_MAX_PERCENTAGE else 0f

                // Mark completion in repository so subsequent refreshes shortcut.
                repository.markEvaluationCompleted()

                _evaluationState.value = if (usagePct <= Constants.PROGRESS_MAX_PERCENTAGE) {
                    EvaluationState.Success(
                        EvaluationProgress(
                            targetApp = currentTarget,
                            currentUsageMs = finalUsage,
                            elapsedTimeMs = Constants.EVALUATION_DURATION_MS,
                            remainingTimeMs = 0L,
                            isActive = false,
                            usagePercentage = usagePct,
                            timePercentage = Constants.PROGRESS_MAX_PERCENTAGE
                        )
                    )
                } else {
                    EvaluationState.GoalExceeded(
                        EvaluationProgress(
                            targetApp = currentTarget,
                            currentUsageMs = finalUsage,
                            elapsedTimeMs = Constants.EVALUATION_DURATION_MS,
                            remainingTimeMs = 0L,
                            isActive = false,
                            usagePercentage = usagePct,
                            timePercentage = Constants.PROGRESS_MAX_PERCENTAGE
                        )
                    )
                }
                return@launch
            }

            val currentUsage = kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
                com.niyaz.zario.utils.UsageStatsUtils.preciseUsageSinceBaseline(
                    context,
                    currentTarget.packageName,
                    currentTarget.baselineUsageMs,
                    currentTarget.evaluationStartTime
                )
            }

            val remaining = Constants.EVALUATION_DURATION_MS - elapsed
            val usagePct = if (currentTarget.goalTimeMs > 0)
                (currentUsage.toFloat() / currentTarget.goalTimeMs.toFloat()) * Constants.PROGRESS_MAX_PERCENTAGE else 0f
            val timePct = (elapsed.toFloat() / Constants.EVALUATION_DURATION_MS.toFloat()) * Constants.PROGRESS_MAX_PERCENTAGE

            _evaluationState.value = EvaluationState.Active(
                EvaluationProgress(
                    targetApp = currentTarget,
                    currentUsageMs = currentUsage,
                    elapsedTimeMs = elapsed,
                    remainingTimeMs = remaining,
                    isActive = true,
                    usagePercentage = usagePct,
                    timePercentage = timePct
                )
            )
        }
    }

    private fun startUsageMonitoring() {
        Log.d(TAG, "Starting usage monitoring worker")
        
        // Create one-time work request for real-time monitoring
        // Note: PeriodicWorkRequest has minimum 15-minute interval, so we use self-rescheduling OneTimeWorkRequest
        val workRequest = OneTimeWorkRequestBuilder<MonitoringSchedulerWorker>()
            .setExpedited(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST)  // Expedite for priority
            .build()

        // Start the work
        workManager.enqueueUniqueWork(
            MonitoringSchedulerWorker.WORK_NAME,
            ExistingWorkPolicy.REPLACE,
            workRequest
        )

        // Observe work progress
        observeWorkProgress()
    }

    private fun observeWorkProgress() {
        Log.d(TAG, "Setting up work progress observer")
        
        // Clean up existing observer
        cleanupWorkObserver()
        
        // Create new observer
        workInfoLiveData = workManager.getWorkInfosForUniqueWorkLiveData(UsageMonitoringWorker.WORK_NAME)
        workInfoObserver = Observer { workInfos ->
            Log.d(TAG, "Work info update received, count: ${workInfos?.size ?: 0}")
            
            workInfos?.forEach { workInfo ->
                when (workInfo.state) {
                    WorkInfo.State.RUNNING -> {
                        Log.d(TAG, "Worker is running – updating in-flight progress")
                        updateProgressFromWorkData(workInfo.progress)
                    }
                    WorkInfo.State.SUCCEEDED -> {
                        Log.d(TAG, "Worker succeeded, updating progress")
                        
                        // CRITICAL FIX: Check completion BEFORE rescheduling
                        val isComplete = workInfo.outputData.getBoolean(UsageMonitoringWorker.OUTPUT_EVALUATION_COMPLETE, false)
                        
                        // Update progress first
                        updateProgressFromWorkData(workInfo.outputData)
                        
                        // No longer reschedule here – worker self-reschedules. Just update UI.
                        if (isComplete) {
                            Log.i(TAG, "Evaluation completed – worker chain continues (next cycle scheduled)")
                        }
                    }
                    WorkInfo.State.FAILED -> {
                        Log.e(TAG, "Worker failed")
                        _evaluationState.value = EvaluationState.Error(context.getString(R.string.error_usage_monitoring_failed))
                    }
                    else -> {
                        Log.d(TAG, "Worker state: ${workInfo.state}")
                    }
                }
            }
        }
        
        // Start observing
        workInfoLiveData?.observeForever(workInfoObserver!!)
    }

    // scheduleNextMonitoring removed – worker self-reschedules internally

    private fun updateProgressFromWorkData(outputData: androidx.work.Data) {
        try {
            outputData.getString(UsageMonitoringWorker.OUTPUT_PACKAGE_NAME) ?: return
            val currentUsage = outputData.getLong(UsageMonitoringWorker.OUTPUT_CURRENT_USAGE, 0L)
            val elapsedTime = outputData.getLong(UsageMonitoringWorker.OUTPUT_ELAPSED_TIME, 0L)
            val goalTime = outputData.getLong(UsageMonitoringWorker.OUTPUT_GOAL_TIME, 0L)
            val isComplete = outputData.getBoolean(UsageMonitoringWorker.OUTPUT_EVALUATION_COMPLETE, false)
            
            Log.d(TAG, "Progress update: usage=${currentUsage}ms, elapsed=${elapsedTime}ms, goal=${goalTime}ms, complete=$isComplete")
            
            val currentTarget = repository.getCurrentTargetApp() ?: return
            
            if (isComplete) {
                // Evaluation completed – worker chain keeps running for next cycle
                Log.i(TAG, "Evaluation completed – monitoring continues for next cycle")
                
                val usagePercentage = if (goalTime > 0) (currentUsage.toFloat() / goalTime.toFloat()) * Constants.PROGRESS_MAX_PERCENTAGE else 0f
                
                if (usagePercentage <= Constants.PROGRESS_MAX_PERCENTAGE) {
                    _evaluationState.value = EvaluationState.Success(
                        EvaluationProgress(
                            targetApp = currentTarget,
                            currentUsageMs = currentUsage,
                            elapsedTimeMs = Constants.EVALUATION_DURATION_MS,
                            remainingTimeMs = 0L,
                            isActive = false,
                            usagePercentage = usagePercentage,
                            timePercentage = Constants.PROGRESS_MAX_PERCENTAGE
                        )
                    )
                } else {
                    _evaluationState.value = EvaluationState.GoalExceeded(
                        EvaluationProgress(
                            targetApp = currentTarget,
                            currentUsageMs = currentUsage,
                            elapsedTimeMs = Constants.EVALUATION_DURATION_MS,
                            remainingTimeMs = 0L,
                            isActive = false,
                            usagePercentage = usagePercentage,
                            timePercentage = Constants.PROGRESS_MAX_PERCENTAGE
                        )
                    )
                }
            } else {
                // CRITICAL FIX: Double-check completion state before updating active evaluation
                // This prevents stale worker data from overriding completion state
                if (repository.shouldShowCompletionState()) {
                    Log.d(TAG, "Evaluation marked as completed - ignoring active progress update")
                    return
                }
                
                // Update active evaluation
                val remainingTime = (Constants.EVALUATION_DURATION_MS - elapsedTime).coerceAtLeast(0L)
                val usagePercentage = if (goalTime > 0) (currentUsage.toFloat() / goalTime.toFloat()) * Constants.PROGRESS_MAX_PERCENTAGE else 0f
                val timePercentage = if (Constants.EVALUATION_DURATION_MS > 0) 
                    (elapsedTime.toFloat() / Constants.EVALUATION_DURATION_MS.toFloat()) * Constants.PROGRESS_MAX_PERCENTAGE else 0f
                
                _evaluationState.value = EvaluationState.Active(
                    EvaluationProgress(
                        targetApp = currentTarget,
                        currentUsageMs = currentUsage,
                        elapsedTimeMs = elapsedTime,
                        remainingTimeMs = remainingTime,
                        isActive = true,
                        usagePercentage = usagePercentage,
                        timePercentage = timePercentage
                    )
                )
            }
            
        } catch (e: Exception) {
            Log.e(TAG, "Error updating progress from work data", e)
        }
    }

    fun stopEvaluation() {
        Log.d(TAG, "Stopping evaluation")
        stopUsageMonitoring()
        _evaluationState.value = EvaluationState.NotStarted
    }

    private fun stopUsageMonitoring() {
        Log.d(TAG, "Stopping usage monitoring worker")
        workManager.cancelUniqueWork(UsageMonitoringWorker.WORK_NAME)
        workManager.cancelUniqueWork(MonitoringSchedulerWorker.WORK_NAME)
        cleanupWorkObserver()
    }

    private fun cleanupWorkObserver() {
        workInfoObserver?.let { observer ->
            workInfoLiveData?.removeObserver(observer)
            Log.d(TAG, "Work observer cleaned up")
        }
        workInfoObserver = null
        workInfoLiveData = null
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "ViewModel cleared")
        cleanupWorkObserver()
    }

    companion object {
        private const val TAG = Constants.LOG_TAG_INTERVENTION_VIEWMODEL
    }
} 