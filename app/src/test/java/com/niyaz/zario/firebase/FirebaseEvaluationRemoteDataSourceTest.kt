package com.niyaz.zario.firebase

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.data.local.dao.RemoteSyncDao
import com.niyaz.zario.data.local.entities.AppUsageHourlyEntry
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import com.niyaz.zario.data.local.entities.PendingHourlySyncEntity
import com.niyaz.zario.usage.UsageBucket
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

class FirebaseEvaluationRemoteDataSourceTest {

    private lateinit var userGateway: FirestoreUserGateway
    private lateinit var auth: FirebaseAuth
    private lateinit var remoteSyncDao: RemoteSyncDao
    private lateinit var remoteSyncScheduler: RemoteSyncScheduler
    private lateinit var dataSource: FirebaseEvaluationRemoteDataSource

    @Before
    fun setup() {
        userGateway = mockk(relaxed = true)
        auth = mockk(relaxed = true)
        remoteSyncDao = mockk(relaxed = true)
        remoteSyncScheduler = mockk(relaxed = true)
        dataSource = FirebaseEvaluationRemoteDataSource(userGateway, auth, remoteSyncDao, remoteSyncScheduler)
    }

    @Test
    fun `syncPlan ignores when user not signed in`() = runTest {
        every { auth.currentUser } returns null

        dataSource.syncPlan(ScreenTimePlan(goalTimeMs = 1L, dailyAverageMs = 1L))

        coVerify(exactly = 0) { userGateway.updatePlan(any(), any()) }
    }

    @Test
    fun `syncCycleResult enqueues payload when user present`() = runTest {
        val user = mockk<FirebaseUser> {
            every { uid } returns "user-123"
            every { email } returns "user@example.com"
        }
        every { auth.currentUser } returns user

        val entry = EvaluationHistoryEntry(
            userId = "user-123",
            userEmail = "user@example.com",
            planLabel = "Plan",
            goalTimeMs = 1000L,
            dailyAverageMs = 1200L,
            finalUsageMs = 1100L,
            evaluationStartTime = 10L,
            evaluationEndTime = 20L,
            metGoal = true,
            pointsDelta = 10,
            pointsBalanceAfter = 0
        )
        val hourlyEntries = listOf(
            AppUsageHourlyEntry(
                userId = "user-123",
                userEmail = "user@example.com",
                planLabel = "Plan",
                cycleStartTime = 10L,
                hourStartTime = 10L,
                hourEndTime = 11L,
                packageName = "pkg",
                usageMs = 100L
            )
        )

        coEvery { remoteSyncDao.insertCycleWithHourly(any(), any()) } returns 1L

        dataSource.syncCycleResult(entry, hourlyEntries, pointsBalanceAfter = 55)

        coVerify {
            remoteSyncDao.insertCycleWithHourly(any(), match { it.size == hourlyEntries.size })
        }
        verify { remoteSyncScheduler.scheduleSync() }
        coVerify(exactly = 0) { userGateway.recordCycleResult(any(), any(), any(), any(), any()) }
    }

    @Test
    fun `syncHourlySnapshots enqueues completed hours and schedules sync`() = runTest {
        val user = mockk<FirebaseUser> {
            every { uid } returns "user-123"
            every { email } returns "user@example.com"
        }
        every { auth.currentUser } returns user

        val buckets = listOf(
            UsageBucket(
                bucketStartMs = 3_600_000L,
                bucketEndMs = 7_200_000L,
                totalsByPackage = mapOf("pkg" to 1200L)
            ),
            UsageBucket(
                bucketStartMs = 7_200_000L,
                bucketEndMs = 10_800_000L,
                totalsByPackage = emptyMap()
            )
        )

        coEvery { remoteSyncDao.findStateByKey(any()) } returns null
        coEvery { remoteSyncDao.insertHourly(any()) } returns listOf(1L)

        dataSource.syncHourlySnapshots(planLabel = "Plan", cycleStartTime = 0L, buckets = buckets)

        coVerify {
            remoteSyncDao.insertHourly(match { pending ->
                pending.size == 1 && pending.first().syncType == PendingHourlySyncEntity.SyncType.LIVE
            })
        }
        verify { remoteSyncScheduler.scheduleSync() }
    }
}
