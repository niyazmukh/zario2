package com.niyaz.zario.core.evaluation

import com.niyaz.zario.core.evaluation.storage.CycleState
import com.niyaz.zario.core.evaluation.storage.CycleStateStore
import com.niyaz.zario.core.evaluation.storage.PlanPreferencesDataSource
import com.niyaz.zario.core.evaluation.storage.PlanPreferencesSnapshot
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.data.local.dao.HourlyUsageDao
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.just
import io.mockk.runs
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class EvaluationRepositoryTest {

    @MockK(relaxed = true)
    private lateinit var planPreferencesDataSource: PlanPreferencesDataSource

    @MockK(relaxed = true)
    private lateinit var cycleStateStore: CycleStateStore

    @MockK(relaxed = true)
    private lateinit var historyDao: EvaluationHistoryDao

    @MockK(relaxed = true)
    private lateinit var hourlyUsageDao: HourlyUsageDao

    @MockK(relaxed = true)
    private lateinit var remoteDataSource: EvaluationRemoteDataSource

    private lateinit var applicationScope: CoroutineScope
    private lateinit var repository: EvaluationRepository

    @Before
    fun setup() {
        MockKAnnotations.init(this)
        applicationScope = TestScope(UnconfinedTestDispatcher())

        every { cycleStateStore.cycleState } returns MutableStateFlow(CycleState.EMPTY)

        repository = EvaluationRepository(
            planPreferencesDataSource = planPreferencesDataSource,
            cycleStateStore = cycleStateStore,
            historyDao = historyDao,
            hourlyUsageDao = hourlyUsageDao,
            remoteDataSource = remoteDataSource,
            applicationScope = applicationScope
        )
    }

    @Test
    fun startNextCycle_whenFeedbackNotViewed_doesNotForceReset() = runTest {
        val plan = ScreenTimePlan(goalTimeMs = 10L, dailyAverageMs = 20L, evaluationStartTime = 1L)
        val snapshot = PlanPreferencesSnapshot(
            plan = plan,
            usageThresholdReached = 0,
            nextCycleStartTime = null,
            evaluationCompleted = true,
            evaluationCompletionTime = 2L,
            feedbackViewed = false,
            goalSuccessStreak = 0
        )
        coEvery { planPreferencesDataSource.latest() } returns snapshot
        coEvery { cycleStateStore.scheduleNextCycle(any()) } just runs
        coEvery { cycleStateStore.resetCompletionFlags(any()) } just runs

        repository.startNextCycle(5L)

        coVerify { cycleStateStore.scheduleNextCycle(5L) }
        coVerify { cycleStateStore.resetCompletionFlags(false) }
    }

    @Test
    fun markFeedbackViewed_clearsCompletionFlagWithForce() = runTest {
        coEvery { cycleStateStore.markFeedbackViewed() } just runs
        coEvery { cycleStateStore.resetCompletionFlags(any()) } just runs

        repository.markFeedbackViewed()

        coVerify { cycleStateStore.markFeedbackViewed() }
        coVerify { cycleStateStore.resetCompletionFlags(true) }
    }
}
