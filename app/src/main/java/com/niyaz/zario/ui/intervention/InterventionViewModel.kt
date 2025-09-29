package com.niyaz.zario.ui.intervention

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.work.WorkInfo
import androidx.work.WorkManager
import com.niyaz.zario.BuildConfig
import com.niyaz.zario.Constants
import com.niyaz.zario.R
import com.niyaz.zario.data.EvaluationProgress
import com.niyaz.zario.data.EvaluationState
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.core.evaluation.EvaluationRepository
import com.niyaz.zario.core.usage.UsageStatsRepository
import com.niyaz.zario.utils.CalendarUtils
import com.niyaz.zario.worker.MonitoringWorkScheduler
import com.niyaz.zario.worker.UsageMonitoringWorker
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject
import kotlin.math.max

@HiltViewModel
class InterventionViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val repository: EvaluationRepository,
    private val monitoringWorkScheduler: MonitoringWorkScheduler,
    private val usageStatsRepository: UsageStatsRepository
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
                Log.i(TAG, "🚀 STARTING SCREEN-TIME EVALUATION")
                _evaluationState.value = EvaluationState.Preparing

                val activePlan = repository.startEvaluation()
                if (activePlan == null) {
                    Log.e(TAG, "No screen-time plan configured")
                    _evaluationState.value = EvaluationState.Error(context.getString(R.string.error_no_plan_configured))
                    return@launch
                }

                val nextCycleStart = repository.getNextCycleStartTime()
                val delayMs = nextCycleStart?.let { (it - System.currentTimeMillis()).coerceAtLeast(0L) } ?: 0L

                startUsageMonitoring(delayMs)

                val planSnapshot = repository.getCurrentPlan() ?: activePlan

                if (planSnapshot.evaluationStartTime == null && delayMs > 0L) {
                    Log.i(TAG, "Evaluation scheduled for future cycle at ${nextCycleStart}")
                    _evaluationState.value = EvaluationState.Preparing
                    return@launch
                }

                val usage = getCurrentUsage()

                _evaluationState.value = EvaluationState.Active(
                    buildProgress(
                        plan = planSnapshot,
                        currentUsage = usage,
                        isActive = true
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
            val plan = repository.getCurrentPlan() ?: return@launch
            val evaluationStart = plan.evaluationStartTime

            if (evaluationStart == null) {
                Log.d(TAG, "No active evaluation start time – resetting to preparing state")
                _evaluationState.value = EvaluationState.Preparing
                startEvaluation()
                return@launch
            }

            val now = System.currentTimeMillis()
            val dayExpired = !CalendarUtils.isWithinCurrentDay(evaluationStart) ||
                now >= CalendarUtils.getEndOfCurrentDay()

            val currentUsage = getCurrentUsage()

            if (repository.shouldShowCompletionState() || dayExpired) {
                Log.d(TAG, "Evaluation marked complete – restarting next cycle")
                _evaluationState.value = EvaluationState.Preparing
                startEvaluation()
                return@launch
            }

            val elapsed = max(0L, now - evaluationStart)
            val progress = buildProgress(
                plan = plan,
                currentUsage = currentUsage,
                isActive = true,
                elapsedOverride = elapsed
            )

            _evaluationState.value = EvaluationState.Active(progress)
        }
    }

    private fun startUsageMonitoring(initialDelayMs: Long = 0L) {
        if (BuildConfig.DEBUG) {
            Log.d(TAG, "Starting usage monitoring worker (delay=${initialDelayMs}ms)")
        }

        if (initialDelayMs > 0L) {
            monitoringWorkScheduler.enqueueSchedulerWithDelayMillis(initialDelayMs)
        } else {
            monitoringWorkScheduler.enqueueScheduler()
        }

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
        viewModelScope.launch {
            try {
                val currentUsage = outputData.getLong(UsageMonitoringWorker.OUTPUT_CURRENT_USAGE, 0L)
                val elapsedTime = outputData.getLong(UsageMonitoringWorker.OUTPUT_ELAPSED_TIME, 0L)
                val goalTime = outputData.getLong(UsageMonitoringWorker.OUTPUT_GOAL_TIME, 0L)
                val planLabel = outputData.getString(UsageMonitoringWorker.OUTPUT_PLAN_LABEL)
                val isComplete = outputData.getBoolean(UsageMonitoringWorker.OUTPUT_EVALUATION_COMPLETE, false)

                Log.d(TAG, "Progress update: usage=${currentUsage}ms, elapsed=${elapsedTime}ms, goal=${goalTime}ms, complete=$isComplete")

                val plan = repository.getCurrentPlan() ?: planLabel?.let {
                    ScreenTimePlan(
                        goalTimeMs = goalTime,
                        dailyAverageMs = 0L,
                        label = it
                    )
                } ?: return@launch

                if (isComplete) {
                    Log.d(TAG, "Cycle completion reported – restarting evaluation")
                    _evaluationState.value = EvaluationState.Preparing
                    startEvaluation()
                    return@launch
                }

                if (repository.shouldShowCompletionState()) {
                    Log.d(TAG, "Completion flag present – awaiting next cycle")
                    return@launch
                }

                val activeProgress = buildProgress(
                    plan = plan,
                    currentUsage = currentUsage,
                    isActive = true,
                    elapsedOverride = elapsedTime
                )

                _evaluationState.value = EvaluationState.Active(activeProgress)
            } catch (e: Exception) {
                Log.e(TAG, "Error updating progress from work data", e)
            }
        }
    }

    fun stopEvaluation() {
        Log.d(TAG, "Stopping evaluation")
        stopUsageMonitoring()
        _evaluationState.value = EvaluationState.NotStarted
    }

    private fun stopUsageMonitoring() {
        Log.d(TAG, "Stopping usage monitoring worker")
        monitoringWorkScheduler.cancelMonitoring()
        monitoringWorkScheduler.cancelScheduler()
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

    private suspend fun getCurrentUsage(): Long = withContext(Dispatchers.IO) {
        usageStatsRepository.getSnapshot().totalUsageMs
    }

    private fun buildProgress(
        plan: ScreenTimePlan,
        currentUsage: Long,
        isActive: Boolean,
        elapsedOverride: Long? = null,
        remainingOverride: Long? = null,
        timePercentageOverride: Float? = null
    ): EvaluationProgress {
        val start = plan.evaluationStartTime ?: CalendarUtils.getStartOfCurrentDay()
        val now = System.currentTimeMillis()
        val elapsed = elapsedOverride ?: max(0L, now - start)
        val remaining = remainingOverride ?: CalendarUtils.getTimeRemainingInCurrentDay()

        val usagePercentage = if (plan.goalTimeMs > 0) {
            (currentUsage.toFloat() / plan.goalTimeMs.toFloat()) * Constants.PROGRESS_MAX_PERCENTAGE
        } else 0f

        val dayDuration = CalendarUtils.getCurrentDayDurationMs()
        val timeElapsed = elapsedOverride ?: CalendarUtils.getTimeElapsedInCurrentDay()
        val timePercentage = timePercentageOverride ?: if (dayDuration > 0) {
            (timeElapsed.toFloat() / dayDuration.toFloat()) * Constants.PROGRESS_MAX_PERCENTAGE
        } else 0f

        return EvaluationProgress(
            plan = plan,
            currentUsageMs = currentUsage,
            elapsedTimeMs = elapsed,
            remainingTimeMs = remaining,
            isActive = isActive,
            usagePercentage = usagePercentage,
            timePercentage = timePercentage
        )
    }
} 