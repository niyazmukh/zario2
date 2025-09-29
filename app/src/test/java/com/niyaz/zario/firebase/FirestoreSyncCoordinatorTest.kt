package com.niyaz.zario.firebase

import com.niyaz.zario.core.evaluation.storage.PlanPreferencesDataSource
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.data.local.dao.HourlyUsageDao
import com.niyaz.zario.data.local.entities.AppUsageHourlyEntry
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import com.niyaz.zario.security.UserIdentity
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

class FirestoreSyncCoordinatorTest {

    private lateinit var userGateway: FirestoreUserGateway
    private lateinit var planPreferencesDataSource: PlanPreferencesDataSource
    private lateinit var evaluationHistoryDao: EvaluationHistoryDao
    private lateinit var hourlyUsageDao: HourlyUsageDao
    private lateinit var coordinator: FirestoreSyncCoordinator

    @Before
    fun setUp() {
        userGateway = mockk()
        planPreferencesDataSource = mockk(relaxed = true)
        evaluationHistoryDao = mockk(relaxed = true)
        hourlyUsageDao = mockk(relaxed = true)
        coordinator = FirestoreSyncCoordinator(
            userGateway = userGateway,
            planPreferencesDataSource = planPreferencesDataSource,
            evaluationHistoryDao = evaluationHistoryDao,
            hourlyUsageDao = hourlyUsageDao
        )
    }

    @Test
    fun syncFromRemote_restoresPlanAndPersistsHistory() = runTest {
        val plan = ScreenTimePlan(goalTimeMs = 60_000L, dailyAverageMs = 120_000L)
        val historyEntry = EvaluationHistoryEntry(
            userId = USER_ID,
            userEmail = USER_EMAIL,
            planLabel = plan.label,
            goalTimeMs = plan.goalTimeMs,
            dailyAverageMs = plan.dailyAverageMs,
            finalUsageMs = 90_000L,
            evaluationStartTime = 100L,
            evaluationEndTime = 200L,
            metGoal = true,
            pointsDelta = 5,
            pointsBalanceAfter = 150
        )
        val hourlyEntries = listOf(
            AppUsageHourlyEntry(
                userId = USER_ID,
                userEmail = USER_EMAIL,
                planLabel = plan.label,
                cycleStartTime = 100L,
                hourStartTime = 100L,
                hourEndTime = 160L,
                packageName = "com.app",
                usageMs = 30_000L
            )
        )

        coEvery { userGateway.fetchUserState(USER_ID) } returns FirestoreUserGateway.RemoteUserState(
            plan = plan,
            goalSuccessStreak = 3,
            pointsBalance = 150
        )
    val identifierCandidates = listOf(USER_ID, UserIdentity.fromEmail(USER_EMAIL))
    coEvery { evaluationHistoryDao.latestEvaluationEndTimeForUser(identifierCandidates, USER_EMAIL) } returns 50L
        coEvery {
            userGateway.fetchEvaluationCycles(
                userId = USER_ID,
                userEmail = USER_EMAIL,
                afterTimestamp = 50L,
                limit = any()
            )
        } returns listOf(FirestoreUserGateway.RemoteCycle(historyEntry, hourlyEntries))

        coordinator.syncFromRemote(USER_ID, USER_EMAIL)

        coVerify { planPreferencesDataSource.restoreFromRemote(plan, 3) }
        coVerify { evaluationHistoryDao.insertAll(match { it.size == 1 && it.first() == historyEntry }) }
        coVerify { hourlyUsageDao.insertAll(hourlyEntries) }
    }

    @Test
    fun syncFromRemote_noRemoteCycles_skipsInserts() = runTest {
        val plan = ScreenTimePlan(goalTimeMs = 60_000L, dailyAverageMs = 120_000L)
        coEvery { userGateway.fetchUserState(USER_ID) } returns FirestoreUserGateway.RemoteUserState(
            plan = plan,
            goalSuccessStreak = 1,
            pointsBalance = 120
        )
    val identifierCandidates = listOf(USER_ID, UserIdentity.fromEmail(USER_EMAIL))
    coEvery { evaluationHistoryDao.latestEvaluationEndTimeForUser(identifierCandidates, USER_EMAIL) } returns null
        coEvery {
            userGateway.fetchEvaluationCycles(
                userId = USER_ID,
                userEmail = USER_EMAIL,
                afterTimestamp = null,
                limit = any()
            )
        } returns emptyList()

        coordinator.syncFromRemote(USER_ID, USER_EMAIL)

        coVerify(exactly = 0) { evaluationHistoryDao.insertAll(any()) }
        coVerify(exactly = 0) { hourlyUsageDao.insertAll(any()) }
    }

    @Test
    fun syncFromRemote_failsFetchingUserState_aborts() = runTest {
        coEvery { userGateway.fetchUserState(USER_ID) } throws IllegalStateException("boom")

        coordinator.syncFromRemote(USER_ID, USER_EMAIL)

        coVerify(exactly = 0) { planPreferencesDataSource.restoreFromRemote(any(), any()) }
        coVerify(exactly = 0) { evaluationHistoryDao.insertAll(any()) }
    }

    companion object {
        private const val USER_ID = "user-123"
        private const val USER_EMAIL = "user@example.com"
    }
}
