package com.niyaz.zario.core.evaluation.storage

import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

@Singleton
class CycleStateStore @Inject constructor(
    private val planPreferencesDataSource: PlanPreferencesDataSource,
    @ApplicationScope applicationScope: CoroutineScope
) {

    private val internalState: StateFlow<CycleState> = planPreferencesDataSource.snapshots
        .map { it.toCycleState() }
        .stateIn(
            scope = applicationScope,
            started = SharingStarted.Eagerly,
            initialValue = CycleState.EMPTY
        )

    val cycleState: StateFlow<CycleState> = internalState

    suspend fun latest(): CycleState = planPreferencesDataSource.latest().toCycleState()

    suspend fun markEvaluationStarted(startMillis: Long) {
        planPreferencesDataSource.markEvaluationStarted(startMillis)
    }

    suspend fun markUsageThresholdReached(thresholdPercent: Int) {
        planPreferencesDataSource.markUsageThresholdReached(thresholdPercent)
    }

    suspend fun markEvaluationCompleted(completionTime: Long) {
        planPreferencesDataSource.markEvaluationCompleted(completionTime)
    }

    suspend fun scheduleNextCycle(nextCycleStartMillis: Long?) {
        planPreferencesDataSource.scheduleNextCycle(nextCycleStartMillis)
    }

    suspend fun markFeedbackViewed() {
        planPreferencesDataSource.markFeedbackViewed()
    }

    suspend fun resetCompletionFlags() {
        planPreferencesDataSource.resetEvaluationCompletionFlag()
    }

    suspend fun incrementGoalSuccessStreak(): Int {
        return planPreferencesDataSource.incrementGoalSuccessStreak()
    }

    suspend fun resetGoalSuccessStreak() {
        planPreferencesDataSource.resetGoalSuccessStreak()
    }

    suspend fun updateGoalTime(goalTimeMs: Long) {
        planPreferencesDataSource.updateGoalTime(goalTimeMs)
    }

    private fun PlanPreferencesSnapshot.toCycleState(): CycleState {
        return CycleState(
            plan = plan,
            usageThresholdReached = usageThresholdReached,
            nextCycleStartTime = nextCycleStartTime,
            evaluationCompleted = evaluationCompleted,
            evaluationCompletionTime = evaluationCompletionTime,
            feedbackViewed = feedbackViewed,
            goalSuccessStreak = goalSuccessStreak
        )
    }
}

data class CycleState(
    val plan: ScreenTimePlan?,
    val usageThresholdReached: Int,
    val nextCycleStartTime: Long?,
    val evaluationCompleted: Boolean,
    val evaluationCompletionTime: Long?,
    val feedbackViewed: Boolean,
    val goalSuccessStreak: Int
) {
    companion object {
        val EMPTY = CycleState(
            plan = null,
            usageThresholdReached = 0,
            nextCycleStartTime = null,
            evaluationCompleted = false,
            evaluationCompletionTime = null,
            feedbackViewed = true,
            goalSuccessStreak = 0
        )
    }
}
