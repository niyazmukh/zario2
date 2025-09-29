package com.niyaz.zario.ui.feedback

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.domain.PointsCalculator
import com.niyaz.zario.repository.UserSessionRepository
import com.niyaz.zario.security.UserIdentity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import javax.inject.Inject

data class FeedbackData(
    val goalMet: Boolean,
    val pointsChange: Int,
    val goalStreak: Int,
    val planLabel: String,
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
        planLabel = "",
        isLoading = true
    ))
    val feedbackData: StateFlow<FeedbackData> = _feedbackData.asStateFlow()

    init {
        loadLatestCycleResults()
    }

    private fun loadLatestCycleResults() {
        viewModelScope.launch {
            try {
                val user = userSessionRepository.session.value.user ?: return@launch
                val userEmail = user.email
                val condition = user.condition
                val candidateIds = UserIdentity.candidateIds(user.id, userEmail)
                val idsForQuery = if (candidateIds.isEmpty()) listOf(EMPTY_ID_SENTINEL) else candidateIds
                
                // Get all history entries for this user, ordered by end time descending
                val allHistory = historyDao.getAllForUser(idsForQuery, userEmail).first()
                
                if (allHistory.isEmpty()) {
                    _feedbackData.value = FeedbackData(
                        goalMet = false,
                        pointsChange = 0,
                        goalStreak = 0,
                        planLabel = ""
                    )
                    return@launch
                }

                // Latest entry is the first one (ordered by evaluationEndTime DESC)
                val latestEntry = allHistory.first()
                
                // Calculate points change based on condition and goal achievement
                val pointsChange = PointsCalculator.calculateDelta(
                    condition = condition,
                    metGoal = latestEntry.metGoal,
                    flexibleReward = user.flexibleReward,
                    flexiblePenalty = user.flexiblePenalty
                )

                // Calculate goal streak (consecutive goals met from most recent backwards)
                val goalStreak = calculateGoalStreak(allHistory)

                _feedbackData.value = FeedbackData(
                    goalMet = latestEntry.metGoal,
                    pointsChange = pointsChange,
                    goalStreak = goalStreak,
                    planLabel = latestEntry.planLabel
                )

            } catch (e: Exception) {
                // Handle error gracefully
                _feedbackData.value = FeedbackData(
                    goalMet = false,
                    pointsChange = 0,
                    goalStreak = 0,
                    planLabel = ""
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

    companion object {
        private const val EMPTY_ID_SENTINEL = "__none__"
    }
} 