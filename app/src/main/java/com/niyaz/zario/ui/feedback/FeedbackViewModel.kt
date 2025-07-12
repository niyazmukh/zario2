package com.niyaz.zario.ui.feedback

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.niyaz.zario.Constants
import com.niyaz.zario.data.Condition
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.repository.UserSessionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

data class FeedbackData(
    val goalMet: Boolean,
    val pointsChange: Int,
    val goalStreak: Int,
    val appName: String,
    val isLoading: Boolean = false
)

@HiltViewModel
class FeedbackViewModel @Inject constructor(
    private val historyDao: EvaluationHistoryDao,
    private val userSessionRepository: UserSessionRepository
) : ViewModel() {

    private val _feedbackData = MutableStateFlow(FeedbackData(
        goalMet = false,
        pointsChange = 0,
        goalStreak = 0,
        appName = "",
        isLoading = true
    ))
    val feedbackData: StateFlow<FeedbackData> = _feedbackData.asStateFlow()

    init {
        loadLatestCycleResults()
    }

    private fun loadLatestCycleResults() {
        viewModelScope.launch {
            try {
                val userEmail = userSessionRepository.session.value.user?.email ?: return@launch
                val condition = userSessionRepository.session.value.user?.condition ?: Condition.CONTROL
                
                // Get all history entries for this user, ordered by end time descending
                val allHistory = historyDao.getAll(userEmail).first()
                
                if (allHistory.isEmpty()) {
                    _feedbackData.value = FeedbackData(
                        goalMet = false,
                        pointsChange = 0,
                        goalStreak = 0,
                        appName = "",
                        isLoading = false
                    )
                    return@launch
                }

                // Latest entry is the first one (ordered by evaluationEndTime DESC)
                val latestEntry = allHistory.first()
                
                // Calculate points change based on condition and goal achievement
                val pointsChange = when (condition) {
                    Condition.CONTROL -> if (latestEntry.metGoal) Constants.CONTROL_REWARD else -Constants.CONTROL_PENALTY
                    Condition.DEPOSIT -> if (latestEntry.metGoal) Constants.DEPOSIT_REWARD else -Constants.DEPOSIT_PENALTY
                    Condition.FLEXIBLE -> {
                        val user = userSessionRepository.session.value.user
                        val reward = user?.flexibleReward ?: Constants.FLEXIBLE_REWARD
                        val penalty = user?.flexiblePenalty ?: Constants.FLEXIBLE_PENALTY
                        if (latestEntry.metGoal) reward else -penalty
                    }
                }

                // Calculate goal streak (consecutive goals met from most recent backwards)
                val goalStreak = calculateGoalStreak(allHistory)

                _feedbackData.value = FeedbackData(
                    goalMet = latestEntry.metGoal,
                    pointsChange = pointsChange,
                    goalStreak = goalStreak,
                    appName = latestEntry.appName,
                    isLoading = false
                )

            } catch (e: Exception) {
                // Handle error gracefully
                _feedbackData.value = FeedbackData(
                    goalMet = false,
                    pointsChange = 0,
                    goalStreak = 0,
                    appName = "",
                    isLoading = false
                )
            }
        }
    }

    /**
     * Calculates the current goal streak by counting consecutive successful goals
     * from the most recent evaluation backwards.
     */
    private fun calculateGoalStreak(historyEntries: List<com.niyaz.zario.data.local.entities.EvaluationHistoryEntry>): Int {
        var streak = 0
        
        // Count consecutive goals met from the most recent entry backwards
        for (entry in historyEntries) {
            if (entry.metGoal) {
                streak++
            } else {
                // Streak broken, stop counting
                break
            }
        }
        
        return streak
    }
} 