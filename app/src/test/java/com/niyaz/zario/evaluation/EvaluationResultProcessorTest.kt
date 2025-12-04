package com.niyaz.zario.core.evaluation

import android.util.Log
import com.niyaz.zario.Constants
import com.niyaz.zario.data.Condition
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.data.User
import com.niyaz.zario.data.UserSession
import com.niyaz.zario.repository.UserSessionRepository
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockkStatic
import io.mockk.just
import io.mockk.runs
import io.mockk.unmockkAll
import io.mockk.unmockkStatic
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class EvaluationResultProcessorTest {

    @MockK(relaxed = true)
    private lateinit var evaluationRepository: EvaluationRepository

    @MockK
    private lateinit var sessionRepository: UserSessionRepository

    @MockK(relaxed = true)
    private lateinit var remoteDataSource: EvaluationRemoteDataSource

    private lateinit var processor: EvaluationResultProcessor

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
    processor = EvaluationResultProcessor(evaluationRepository, sessionRepository, remoteDataSource)

        mockkStatic(Log::class)
        every { Log.d(any(), any()) } returns 0
        every { Log.i(any(), any()) } returns 0

        coEvery { sessionRepository.adjustPoints(Constants.CONTROL_REWARD) } returns 100 + Constants.CONTROL_REWARD
        coEvery { sessionRepository.awaitSession() } returns loggedInSession()
        coEvery { evaluationRepository.discardPendingFeedback(any()) } just runs
    }

    @After
    fun tearDown() {
        unmockkStatic(Log::class)
        unmockkAll()
    }

    @Test
    fun finalizeCycle_whenStreakReachesThreshold_reducesGoalByTenPercent() = runBlocking {
        val goalMs = TimeUnit.HOURS.toMillis(1)
        val reducedGoal = goalMs * 9 / 10
        val plan = ScreenTimePlan(goalTimeMs = goalMs, dailyAverageMs = goalMs * 2)
        val goalUpdates = mutableListOf<Long>()

        coEvery { evaluationRepository.incrementGoalSuccessStreak() } returns 3
        coEvery { evaluationRepository.updateGoalTime(capture(goalUpdates)) } just runs

        val result = processor.finalizeCycle(
            plan = plan,
            finalUsageMs = goalMs - TimeUnit.MINUTES.toMillis(5),
            evaluationStartTime = 1_000L,
            evaluationEndTime = 2_000L,
            hourlyUsage = emptyList()
        )

        assertTrue(result.metGoal)
        assertEquals(goalMs, result.goalTimeMs)
        assertEquals(100 + Constants.CONTROL_REWARD, result.newPointBalance)
        assertEquals(listOf(reducedGoal), goalUpdates)
        coVerify(exactly = 1) { evaluationRepository.resetGoalSuccessStreak() }
        coVerify(exactly = 1) { sessionRepository.adjustPoints(Constants.CONTROL_REWARD) }
        coVerify(exactly = 1) { evaluationRepository.incrementGoalSuccessStreak() }
    coVerify(exactly = 1) { remoteDataSource.syncCycleResult(any(), any(), any()) }
    }

    @Test
    fun finalizeCycle_whenGoalAtMinimum_doesNotReduceFurther() = runBlocking {
        val goalMs = TimeUnit.MINUTES.toMillis(10)
        val plan = ScreenTimePlan(goalTimeMs = goalMs, dailyAverageMs = goalMs * 2)
        val goalUpdates = mutableListOf<Long>()

        coEvery { evaluationRepository.incrementGoalSuccessStreak() } returns 3
        coEvery { evaluationRepository.updateGoalTime(capture(goalUpdates)) } just runs

        val result = processor.finalizeCycle(
            plan = plan,
            finalUsageMs = goalMs - TimeUnit.MINUTES.toMillis(1),
            evaluationStartTime = 2_000L,
            evaluationEndTime = 3_000L,
            hourlyUsage = emptyList()
        )

        assertTrue(result.metGoal)
        assertTrue(goalUpdates.isEmpty())
        coVerify(exactly = 1) { evaluationRepository.resetGoalSuccessStreak() }
    coVerify(exactly = 1) { remoteDataSource.syncCycleResult(any(), any(), any()) }
    }

    @Test
    fun finalizeCycle_alwaysClearsPendingFeedbackBeforeCompleting() = runBlocking {
        val plan = ScreenTimePlan(goalTimeMs = TimeUnit.HOURS.toMillis(2), dailyAverageMs = TimeUnit.HOURS.toMillis(3))

        processor.finalizeCycle(
            plan = plan,
            finalUsageMs = TimeUnit.HOURS.toMillis(1),
            evaluationStartTime = 5_000L,
            evaluationEndTime = 6_000L,
            hourlyUsage = emptyList()
        )

        coVerify(exactly = 1) { evaluationRepository.discardPendingFeedback(force = true) }
        coVerify(exactly = 1) { evaluationRepository.markEvaluationCompleted(any()) }
    }

    private fun loggedInSession(): UserSession {
        val user = User(
            email = "user@example.com",
            id = "user-id",
            yearOfBirth = "1990",
            gender = "other",
            condition = Condition.CONTROL
        )
        return UserSession(isLoggedIn = true, user = user)
    }
}
