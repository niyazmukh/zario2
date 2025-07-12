package com.niyaz.zario.data

data class TargetApp(
    val packageName: String,
    val appName: String,
    val goalTimeMs: Long,
    val dailyAverageMs: Long,
    val targetSelectedTime: Long = System.currentTimeMillis(),
    val evaluationStartTime: Long? = null, // Null until evaluation actually starts
    /** Cumulative foreground time (ms) at the moment evaluation starts – used for delta calculations */
    val baselineUsageMs: Long = 0L
)

data class EvaluationProgress(
    val targetApp: TargetApp,
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
    data class Completed(val finalProgress: EvaluationProgress) : EvaluationState() // Legacy state
    data class Error(val message: String, val isRetryable: Boolean = true) : EvaluationState()
    object Paused : EvaluationState() // For when app goes to background
}

sealed class UsageTrackingResult {
    data class Success(val usageMs: Long) : UsageTrackingResult()
    data class Error(val message: String, val isRetryable: Boolean = true) : UsageTrackingResult()
    object NoData : UsageTrackingResult()
} 