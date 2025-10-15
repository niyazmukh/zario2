package com.niyaz.zario.ui.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.niyaz.zario.Constants
import com.niyaz.zario.data.Condition
import com.niyaz.zario.data.User
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import com.niyaz.zario.repository.UserSessionRepository
import com.niyaz.zario.security.UserIdentity
import dagger.hilt.android.lifecycle.HiltViewModel
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.temporal.ChronoUnit
import java.time.format.DateTimeFormatter
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val userSessionRepository: UserSessionRepository,
    private val evaluationHistoryDao: EvaluationHistoryDao
) : ViewModel() {

    private val _uiState = MutableStateFlow(ProfileUiState())
    val uiState: StateFlow<ProfileUiState> = _uiState

    private val zoneId: ZoneId = ZoneId.systemDefault()
    private val dateFormatter: DateTimeFormatter =
        DateTimeFormatter.ofPattern(Constants.HISTORY_DATE_FORMAT)

    init {
        observeProfileData()
    }

    private fun observeProfileData() {
        viewModelScope.launch {
            userSessionRepository.session.collectLatest { session ->
                val user = session.user ?: run {
                    _uiState.value = ProfileUiState(isLoading = false)
                    return@collectLatest
                }

                _uiState.update { it.copy(isLoading = true) }

                val candidateIds = UserIdentity.candidateIds(user.id, user.email)
                val idsForQuery = if (candidateIds.isEmpty()) {
                    listOf(EMPTY_ID_SENTINEL)
                } else {
                    candidateIds
                }

                evaluationHistoryDao.getAllForUser(idsForQuery, user.email).collectLatest { entries ->
                    val sortedEntries = entries.sortedByDescending(EvaluationHistoryEntry::evaluationEndTime)
                    val daysSinceSignup = computeDaysSinceSignup(sortedEntries)
                    val cyclesMet = sortedEntries.count { it.metGoal }
                    val cyclesElapsed = sortedEntries.size
                    val cycles = sortedEntries.map { entry ->
                        val status = if (entry.metGoal) {
                            ProfileCycleStatus.MET
                        } else {
                            ProfileCycleStatus.MISSED
                        }
                        ProfileCycleItem(
                            id = entry.id,
                            dateLabel = formatDate(entry.evaluationEndTime),
                            statusLabel = status,
                            pointsAfter = entry.pointsBalanceAfter
                        )
                    }

                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            email = user.email,
                            daysSinceSignup = daysSinceSignup,
                            cyclesMet = cyclesMet,
                            cyclesElapsed = cyclesElapsed,
                            totalPoints = resolveTotalPoints(user, sortedEntries),
                            cycles = cycles,
                            condition = user.condition,
                            flexibleReward = user.flexibleReward,
                            flexiblePenalty = user.flexiblePenalty
                        )
                    }
                }
            }
        }
    }

    private fun computeDaysSinceSignup(
        entries: List<EvaluationHistoryEntry>
    ): Int {
        if (entries.isEmpty()) {
            return 0
        }
        val earliest = entries.minOf { it.evaluationStartTime }
        val signupDate = Instant.ofEpochMilli(earliest).atZone(zoneId).toLocalDate()
        val today = LocalDate.now(zoneId)
        val daysBetween = ChronoUnit.DAYS.between(signupDate, today).coerceAtLeast(0)
        return (daysBetween + 1).toInt()
    }

    private fun formatDate(epochMillis: Long): String {
        val date = Instant.ofEpochMilli(epochMillis).atZone(zoneId).toLocalDate()
        return date.format(dateFormatter)
    }

    private fun resolveTotalPoints(user: User, entries: List<EvaluationHistoryEntry>): Int {
        return entries.maxByOrNull(EvaluationHistoryEntry::evaluationEndTime)?.pointsBalanceAfter
            ?: user.points
    }

    data class ProfileUiState(
        val isLoading: Boolean = true,
        val email: String = "",
        val daysSinceSignup: Int = 0,
        val cyclesMet: Int = 0,
    val cyclesElapsed: Int = 0,
        val totalPoints: Int = 0,
        val cycles: List<ProfileCycleItem> = emptyList(),
        val condition: Condition? = null,
        val flexibleReward: Int? = null,
        val flexiblePenalty: Int? = null
    )

    data class ProfileCycleItem(
        val id: Long,
        val dateLabel: String,
        val statusLabel: ProfileCycleStatus,
        val pointsAfter: Int
    )

    enum class ProfileCycleStatus { MET, MISSED }

    companion object {
        private const val EMPTY_ID_SENTINEL = "__none__"
    }
}
