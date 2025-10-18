package com.niyaz.zario.ui.target

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.niyaz.zario.Constants
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.core.evaluation.EvaluationRepository
import com.niyaz.zario.core.usage.UsageStatsRepository
import com.niyaz.zario.permissions.PermissionsManager
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.math.max

/**
 * ViewModel for Target screen that manages usage data loading and goal calculation.
 * Uses sealed UiState pattern to eliminate manual state management complexity.
 */
@HiltViewModel
class TargetViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val evaluationRepository: EvaluationRepository,
    private val usageStatsRepository: UsageStatsRepository,
    private val permissionsManager: PermissionsManager
) : ViewModel() {

    private val _uiState = MutableStateFlow<TargetUiState>(TargetUiState.Loading)
    val uiState: StateFlow<TargetUiState> = _uiState.asStateFlow()

    // Store these for plan confirmation
    private var baselineUsageMs: Long = Constants.MIN_USAGE_THRESHOLD_MS
    private var recommendedGoalMs: Long = 0L

    fun checkPermissionAndLoadData() {
        if (!permissionsManager.hasUsageStatsPermission(forceRefresh = true)) {
            _uiState.value = TargetUiState.PermissionRequired
            return
        }
        loadUsageData()
    }

    fun loadUsageData() {
        if (!permissionsManager.hasUsageStatsPermission(forceRefresh = true)) {
            _uiState.value = TargetUiState.PermissionRequired
            return
        }

        _uiState.value = TargetUiState.Loading

        viewModelScope.launch {
            try {
                val usageSummary = usageStatsRepository.getGlobalUsageSummary(Constants.USAGE_ANALYSIS_DAYS)

                val todayUsageMs = usageSummary.todayUsageMs
                val trailingAverageMs = usageSummary.trailingAverageMs

                val hasHistoricalUsage = usageSummary.validDayCount > 0 && trailingAverageMs > 0L
                val hasTodayUsage = todayUsageMs > 0L

                baselineUsageMs = when {
                    hasHistoricalUsage -> trailingAverageMs
                    hasTodayUsage -> todayUsageMs
                    else -> Constants.MIN_USAGE_THRESHOLD_MS
                }

                recommendedGoalMs = calculateRecommendedGoal(baselineUsageMs)

                if (!hasTodayUsage && !hasHistoricalUsage) {
                    Log.w(Constants.LOG_TAG_TARGET_FRAGMENT, "No usage detected yet; using minimum baseline for goal setup")
                }

                val averageForDisplay = if (hasHistoricalUsage) trailingAverageMs else baselineUsageMs

                _uiState.value = TargetUiState.Content(
                    averageUsageMs = averageForDisplay,
                    todayUsageMs = todayUsageMs,
                    recommendedGoalMs = recommendedGoalMs,
                    isEstimated = !hasHistoricalUsage && !hasTodayUsage
                )
            } catch (e: Exception) {
                Log.e(Constants.LOG_TAG_TARGET_FRAGMENT, "Error loading usage data", e)
                _uiState.value = TargetUiState.Error(
                    message = e.message ?: "Unknown error occurred"
                )
            }
        }
    }

    fun getScreenTimePlan(): ScreenTimePlan {
        return ScreenTimePlan(
            goalTimeMs = recommendedGoalMs,
            dailyAverageMs = baselineUsageMs,
            planCreatedAt = System.currentTimeMillis()
        )
    }

    private fun calculateRecommendedGoal(dailyUsageMs: Long): Long {
        val baseline = max(dailyUsageMs, Constants.MIN_USAGE_THRESHOLD_MS)
        return (baseline * Constants.GOAL_REDUCTION_RATIO).toLong()
            .coerceAtLeast(Constants.MIN_USAGE_THRESHOLD_MS)
    }

    companion object {
        private const val TAG = "TargetViewModel"
    }
}
