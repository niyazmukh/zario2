package com.niyaz.zario.ui.profile

import com.niyaz.zario.data.Condition
import com.niyaz.zario.data.User
import com.niyaz.zario.data.UserSession
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import com.niyaz.zario.repository.UserSessionRepository
import com.niyaz.zario.security.UserIdentity
import io.mockk.MockKAnnotations
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import java.time.Instant
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
import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue

@OptIn(ExperimentalCoroutinesApi::class)
class ProfileViewModelTest {

    @MockK(relaxed = true)
    private lateinit var userSessionRepository: UserSessionRepository

    @MockK(relaxed = true)
    private lateinit var evaluationHistoryDao: EvaluationHistoryDao

    private val dispatcher = StandardTestDispatcher()
    private val sessionFlow = MutableStateFlow(UserSession())
    private val historyFlow = MutableSharedFlow<List<EvaluationHistoryEntry>>(replay = 1)

    @Before
    fun setup() {
        MockKAnnotations.init(this)
        Dispatchers.setMain(dispatcher)
        every { userSessionRepository.session } returns sessionFlow
    every { evaluationHistoryDao.getAllForUser(any(), any()) } returns historyFlow
    }

    @After
    fun tearDown() {
        clearAllMocks()
        Dispatchers.resetMain()
    }

    @Test
    fun test_profileState__when_userIdMissing__expect_historyQueriedWithHashedEmail() = runTest {
        val email = "test@example.com"
        val hashedId = UserIdentity.fromEmail(email)
        val user = User(
            email = email,
            yearOfBirth = "1995",
            gender = "Other",
            condition = Condition.CONTROL,
            points = 120
        )
        sessionFlow.value = UserSession(isLoggedIn = true, user = user)

        val viewModel = ProfileViewModel(userSessionRepository, evaluationHistoryDao)

        val now = Instant.parse("2024-09-30T10:15:30Z").toEpochMilli()
        val entry = EvaluationHistoryEntry(
            id = 1L,
            userId = hashedId,
            userEmail = email,
            planLabel = "focus",
            goalTimeMs = 3_600_000L,
            dailyAverageMs = 3_000_000L,
            finalUsageMs = 2_700_000L,
            evaluationStartTime = now - 86_400_000L,
            evaluationEndTime = now,
            metGoal = true,
            pointsDelta = 10,
            pointsBalanceAfter = 130
        )

        historyFlow.tryEmit(listOf(entry))
        advanceUntilIdle()

    verify(exactly = 1) { evaluationHistoryDao.getAllForUser(listOf(hashedId), email) }

        val state = viewModel.uiState.value
        assertTrue("Expected cycles to be populated", state.cycles.isNotEmpty())
        assertEquals("Expected total points to match last entry", entry.pointsBalanceAfter, state.totalPoints)
        assertEquals("Expected met cycles count to reflect history entry", 1, state.cyclesMet)
    }
}
