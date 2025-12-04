package com.niyaz.zario.ui.feedback

import com.niyaz.zario.data.Condition
import com.niyaz.zario.data.User
import com.niyaz.zario.data.UserSession
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import com.niyaz.zario.domain.PointsCalculator
import com.niyaz.zario.repository.UserSessionRepository
import com.niyaz.zario.security.UserIdentity
import io.mockk.MockKAnnotations
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.impl.annotations.MockK
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class FeedbackViewModelTest {

    @MockK(relaxed = true)
    private lateinit var historyDao: EvaluationHistoryDao

    @MockK(relaxed = true)
    private lateinit var userSessionRepository: UserSessionRepository

    private val dispatcher = StandardTestDispatcher()
    private val sessionFlow = MutableStateFlow(UserSession())
    private val latestFlow = MutableStateFlow<EvaluationHistoryEntry?>(null)
    private val goalsFlow = MutableStateFlow<List<Boolean>>(emptyList())

    @Before
    fun setup() {
        MockKAnnotations.init(this)
        Dispatchers.setMain(dispatcher)
        every { userSessionRepository.session } returns sessionFlow
        every { historyDao.observeLatestForUser(any(), any()) } returns latestFlow
        every { historyDao.observeGoalResultsForUser(any(), any()) } returns goalsFlow
    }

    @After
    fun tearDown() {
        clearAllMocks()
        Dispatchers.resetMain()
    }

    @Test
    fun feedbackState_updatesWithLatestHistoryEmission() = runTest {
        val email = "user@example.com"
        val userId = UserIdentity.fromEmail(email)
        val user = User(
            email = email,
            id = userId,
            yearOfBirth = "1990",
            gender = "other",
            condition = Condition.CONTROL,
            points = 120
        )
        sessionFlow.value = UserSession(isLoggedIn = true, user = user)

        val viewModel = FeedbackViewModel(historyDao, userSessionRepository)

        val dayMillis = TimeUnit.DAYS.toMillis(1)
        val mondayEntry = EvaluationHistoryEntry(
            id = 1L,
            userId = userId,
            userEmail = email,
            planLabel = "M",
            goalTimeMs = TimeUnit.HOURS.toMillis(2),
            dailyAverageMs = TimeUnit.HOURS.toMillis(3),
            finalUsageMs = TimeUnit.HOURS.toMillis(1),
            evaluationStartTime = 1_000L,
            evaluationEndTime = 1_000L + dayMillis,
            metGoal = true,
            pointsDelta = 15,
            pointsBalanceAfter = 130
        )

        latestFlow.value = mondayEntry
        goalsFlow.value = listOf(true)
        advanceUntilIdle()

        val expectedMondayDelta = PointsCalculator.calculateDelta(
            condition = user.condition,
            metGoal = true,
            flexibleReward = user.flexibleReward,
            flexiblePenalty = user.flexiblePenalty
        )
        val firstState = viewModel.feedbackData.value
        assertTrue(firstState.goalMet)
        assertEquals(1, firstState.goalStreak)
        assertEquals(expectedMondayDelta, firstState.pointsChange)
        assertEquals("M", firstState.planLabel)

        val tuesdayEntry = mondayEntry.copy(
            id = 2L,
            planLabel = "T",
            evaluationEndTime = mondayEntry.evaluationEndTime + dayMillis,
            metGoal = false
        )

        latestFlow.value = tuesdayEntry
        goalsFlow.value = listOf(false, true)
        advanceUntilIdle()

        val expectedTuesdayDelta = PointsCalculator.calculateDelta(
            condition = user.condition,
            metGoal = false,
            flexibleReward = user.flexibleReward,
            flexiblePenalty = user.flexiblePenalty
        )
        val secondState = viewModel.feedbackData.value
        assertFalse(secondState.goalMet)
        assertEquals(0, secondState.goalStreak)
        assertEquals(expectedTuesdayDelta, secondState.pointsChange)
        assertEquals("T", secondState.planLabel)
    }
}
