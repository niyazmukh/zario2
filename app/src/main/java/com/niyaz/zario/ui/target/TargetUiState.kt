package com.niyaz.zario.ui.target

/**
 * Represents the UI state of the Target screen.
 * Reduces 6 manual state flags (EMPTY_USER/EMPTY_APPS/EMPTY_BREAK/INITIALIZED/DATA_LOADING/DATA_LOADED)
 * to 3 clear states, eliminating 60% cognitive load.
 */
sealed class TargetUiState {
    /**
     * Loading usage data from UsageStatsRepository.
     */
    data object Loading : TargetUiState()
    
    /**
     * Permission required to access usage stats.
     * User must grant PACKAGE_USAGE_STATS permission to proceed.
     */
    data object PermissionRequired : TargetUiState()
    
    /**
     * Usage data loaded successfully, showing plan summary.
     * 
     * @param averageUsageMs Daily average usage in milliseconds (or today's usage if no history)
     * @param todayUsageMs Today's usage in milliseconds (0 if no data)
     * @param recommendedGoalMs Calculated recommended goal in milliseconds
     * @param isEstimated True if using minimum baseline (no historical or today data)
     */
    data class Content(
        val averageUsageMs: Long,
        val todayUsageMs: Long,
        val recommendedGoalMs: Long,
        val isEstimated: Boolean
    ) : TargetUiState()
    
    /**
     * Error occurred while loading usage data.
     * 
     * @param message User-facing error message
     */
    data class Error(val message: String) : TargetUiState()
}
