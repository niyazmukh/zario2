package com.niyaz.zario.core.evaluation

import com.niyaz.zario.data.ScreenTimePlan

/** Aggregated snapshot of the persisted evaluation cycle state. */
data class EvaluationStateSnapshot(
    val plan: ScreenTimePlan?,
    val usageThresholdReached: Int,
    val nextCycleStartTime: Long?,
    val evaluationCompleted: Boolean,
    val evaluationCompletionTime: Long?,
    val feedbackViewed: Boolean,
    val goalSuccessStreak: Int
) {
    companion object {
        val EMPTY = EvaluationStateSnapshot(
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
