package com.niyaz.zario.ui.feedback

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.niyaz.zario.data.Condition
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.domain.PointsCalculator
import com.niyaz.zario.repository.UserSessionRepository
import com.niyaz.zario.security.UserIdentity
import dagger.hilt.android.lifecycle.HiltViewModel
import com.niyaz.zario.data.User
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject

data class FeedbackData(
    val goalMet: Boolean,
    val pointsChange: Int,
    val goalStreak: Int,
    val planLabel: String,
    val isLoading: Boolean = false,
    val showPointsChange: Boolean = true
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
        isLoading = true,
        showPointsChange = true
    ))
    val feedbackData: StateFlow<FeedbackData> = _feedbackData.asStateFlow()

    init {
        loadLatestCycleResults()
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    private fun loadLatestCycleResults() {
        viewModelScope.launch {
            userSessionRepository.session
                .map { it.user }
                .distinctUntilChanged()
                .flatMapLatest { user ->
                    if (user == null) {
                        flowOf(FeedbackStream.NoUser)
                    } else {
                        val userEmail = user.email
                        val candidateIds = UserIdentity.candidateIds(user.id, userEmail)
                        val idsForQuery = if (candidateIds.isEmpty()) listOf(EMPTY_ID_SENTINEL) else candidateIds

                        combine(
                            historyDao.observeLatestForUser(idsForQuery, userEmail),
                            historyDao.observeGoalResultsForUser(idsForQuery, userEmail)
                        ) { latest, goals ->
                            if (latest == null) {
                                FeedbackStream.Empty
                            } else {
                                FeedbackStream.Data(user, latest, goals)
                            }
                        }.catch { emit(FeedbackStream.Error(it)) }
                    }
                }
                .collectLatest { stream ->
                    when (stream) {
                        FeedbackStream.NoUser, FeedbackStream.Empty -> emitEmptyFeedback()
                        is FeedbackStream.Error -> emitErrorFeedback()
                        is FeedbackStream.Data -> emitFeedbackFromHistory(stream.user, stream.latest, stream.goals)
                    }
                }
        }
    }

    private fun emitFeedbackFromHistory(user: User, latestEntry: EvaluationHistoryEntry, goals: List<Boolean>) {
        val showPoints = user.condition != Condition.BENCHMARK
        val pointsChange = if (showPoints) {
            PointsCalculator.calculateDelta(
                condition = user.condition,
                metGoal = latestEntry.metGoal,
                flexibleReward = user.flexibleReward,
                flexiblePenalty = user.flexiblePenalty
            )
        } else {
            0
        }
        val goalStreak = calculateGoalStreak(goals)

        _feedbackData.value = FeedbackData(
            goalMet = latestEntry.metGoal,
            pointsChange = pointsChange,
            goalStreak = goalStreak,
            planLabel = latestEntry.planLabel,
            showPointsChange = showPoints,
            isLoading = false
        )
    }

    private fun emitEmptyFeedback() {
        _feedbackData.value = FeedbackData(
            goalMet = false,
            pointsChange = 0,
            goalStreak = 0,
            planLabel = "",
            isLoading = false,
            showPointsChange = true
        )
    }

    private fun emitErrorFeedback() {
        _feedbackData.value = FeedbackData(
            goalMet = false,
            pointsChange = 0,
            goalStreak = 0,
            planLabel = "",
            isLoading = false,
            showPointsChange = false
        )
    }

    private sealed interface FeedbackStream {
        data object NoUser : FeedbackStream
        data object Empty : FeedbackStream
        data class Data(val user: User, val latest: EvaluationHistoryEntry, val goals: List<Boolean>) : FeedbackStream
        data class Error(val error: Throwable) : FeedbackStream
    }

    /**
     * Calculates the current goal streak by counting consecutive successful goals
     * from the most recent evaluation backwards.
     */
    private fun calculateGoalStreak(goals: List<Boolean>): Int {
        var streak = 0
        for (metGoal in goals) {
            if (metGoal) {
                streak++
            } else {
                break
            }
        }
        return streak
    }

    companion object {
        private const val EMPTY_ID_SENTINEL = "__none__"
    }
} 
