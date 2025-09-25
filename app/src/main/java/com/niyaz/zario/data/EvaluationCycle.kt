package com.niyaz.zario.data

data class ScreenTimePlan(
    val goalTimeMs: Long,
    val dailyAverageMs: Long,
    val label: String = DEFAULT_LABEL,
    val planCreatedAt: Long = System.currentTimeMillis(),
    val evaluationStartTime: Long? = null
) {
    companion object {
        const val DEFAULT_LABEL = "Daily screen time"
    }
}

data class EvaluationProgress(
    val plan: ScreenTimePlan,
    val currentUsageMs: Long,
    val elapsedTimeMs: Long,
    val remainingTimeMs: Long,
    val isActive: Boolean = true,
    val timestamp: Long = System.currentTimeMillis(),
    val usagePercentage: Float = 0f, // Usage vs goal percentage
    val timePercentage: Float = 0f   // Time elapsed percentage
)

sealed class EvaluationState {
    object NotStarted : EvaluationState()
    object Preparing : EvaluationState()
    data class Active(val progress: EvaluationProgress) : EvaluationState()
    data class Success(val finalProgress: EvaluationProgress) : EvaluationState()
    data class GoalExceeded(val finalProgress: EvaluationProgress) : EvaluationState()
    data class Error(val message: String, val isRetryable: Boolean = true) : EvaluationState()
}

sealed class UsageTrackingResult {
    data class Success(val usageMs: Long) : UsageTrackingResult()
    data class Error(val message: String, val isRetryable: Boolean = true) : UsageTrackingResult()
    object NoData : UsageTrackingResult()
} 