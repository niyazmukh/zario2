package com.niyaz.zario.core.evaluation

import com.niyaz.zario.core.evaluation.storage.PlanPreferencesDataSource
import com.niyaz.zario.core.evaluation.storage.PlanPreferencesSnapshot
import com.niyaz.zario.core.usage.UsageStatsRepository
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.usage.UsageSummary
import com.niyaz.zario.utils.CalendarUtils
import com.niyaz.zario.worker.MonitoringWorkScheduler
import io.mockk.MockKAnnotations
import io.mockk.clearAllMocks
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.just
import io.mockk.mockkObject
import io.mockk.runs
import io.mockk.unmockkObject
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Before
import org.junit.Test

class CycleSimulationDebuggerTest {

    @MockK lateinit var evaluationRepository: EvaluationRepository
    @MockK lateinit var usageStatsRepository: UsageStatsRepository
    @MockK lateinit var resultProcessor: EvaluationResultProcessor
    @MockK lateinit var monitoringWorkScheduler: MonitoringWorkScheduler
    @MockK lateinit var planPreferencesDataSource: PlanPreferencesDataSource

    private lateinit var debugger: CycleSimulationDebugger

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
        debugger = CycleSimulationDebugger(
            evaluationRepository = evaluationRepository,
            usageStatsRepository = usageStatsRepository,
            resultProcessor = resultProcessor,
            monitoringWorkScheduler = monitoringWorkScheduler,
            planPreferencesDataSource = planPreferencesDataSource
        )
    }

    @After
    fun tearDown() {
        clearAllMocks()
    }

    @Test
    fun simulateCycleCompletion_whenPlanActive_returnsSuccess() = runBlocking {
        val start = 1_000L
        val end = 2_000L
        val plan = ScreenTimePlan(
            goalTimeMs = 3_600_000L,
            dailyAverageMs = 4_000_000L,
            label = "daily",
            planCreatedAt = 100L,
            evaluationStartTime = start
        )

        mockkObject(CalendarUtils)
        every { CalendarUtils.getEndOfDay(start) } returns end

        coEvery { evaluationRepository.getCurrentPlan() } returns plan
        coEvery { planPreferencesDataSource.latest() } returns PlanPreferencesSnapshot.EMPTY
        coEvery {
            usageStatsRepository.getSnapshot(forceRefresh = true)
        } returns UsageSummary(
            windowStartMs = start,
            windowEndMs = end,
            totalsByPackage = mapOf("test.app" to 11_000L)
        )
        coEvery { usageStatsRepository.getUsageBuckets(start, end, TimeUnit.HOURS.toMillis(1)) } returns emptyList()
        coEvery {
            resultProcessor.finalizeCycle(any(), any(), any(), any(), any())
        } returns EvaluationResultProcessor.Result(
            planLabel = plan.label,
            goalTimeMs = plan.goalTimeMs,
            finalUsageMs = 11_000L,
            metGoal = true,
            nextCycleStartTime = end + TimeUnit.DAYS.toMillis(1),
            newPointBalance = 150
        )
        coEvery { monitoringWorkScheduler.enqueueScheduler() } just runs

        try {
            val outcome = debugger.simulateCycleCompletion()

            when (outcome) {
                is CycleSimulationDebugger.Outcome.Success -> assertEquals(end, outcome.evaluationEndTime)
                CycleSimulationDebugger.Outcome.NoPlan -> fail("Expected success but no plan was available")
                is CycleSimulationDebugger.Outcome.Failure -> fail("Expected success but received failure: ${outcome.cause}")
            }

            coVerify {
                resultProcessor.finalizeCycle(
                    plan = plan,
                    finalUsageMs = 11_000L,
                    evaluationStartTime = start,
                    evaluationEndTime = end,
                    hourlyUsage = emptyList()
                )
            }
            coVerify(exactly = 1) { monitoringWorkScheduler.enqueueScheduler() }
        } finally {
            unmockkObject(CalendarUtils)
        }
    }

    @Test
    fun simulateCycleCompletion_whenPlanMissing_returnsNoPlan() = runBlocking {
        coEvery { evaluationRepository.getCurrentPlan() } returns null

        val outcome = debugger.simulateCycleCompletion()

        assertTrue(outcome is CycleSimulationDebugger.Outcome.NoPlan)
        coVerify(exactly = 0) { monitoringWorkScheduler.enqueueScheduler() }
    }

    @Test
    fun simulateCycleCompletion_whenPlanStartMissing_forcesScheduledStart() = runBlocking {
        val currentTime = 10_000_000L
        debugger.currentTimeProvider = { currentTime }
        val scheduledStart = 5_000_000L
        val scheduledEnd = scheduledStart + TimeUnit.HOURS.toMillis(12)
        val plan = ScreenTimePlan(
            goalTimeMs = 3_600_000L,
            dailyAverageMs = 4_000_000L,
            label = "daily",
            planCreatedAt = 50L,
            evaluationStartTime = null
        )

        mockkObject(CalendarUtils)
        every { CalendarUtils.getEndOfDay(scheduledStart) } returns scheduledEnd

        coEvery { evaluationRepository.getCurrentPlan() } returns plan
        coEvery { planPreferencesDataSource.latest() } returns PlanPreferencesSnapshot(
            plan = plan,
            usageThresholdReached = 0,
            nextCycleStartTime = scheduledStart,
            evaluationCompleted = false,
            evaluationCompletionTime = null,
            feedbackViewed = true,
            goalSuccessStreak = 0
        )
        coEvery { planPreferencesDataSource.markEvaluationStarted(scheduledStart) } just runs
        coEvery {
            usageStatsRepository.getSnapshot(forceRefresh = true)
        } returns UsageSummary(
            windowStartMs = scheduledStart,
            windowEndMs = scheduledEnd,
            totalsByPackage = mapOf("test.app" to 6_000L)
        )
        coEvery { usageStatsRepository.getUsageBuckets(scheduledStart, scheduledEnd, TimeUnit.HOURS.toMillis(1)) } returns emptyList()
        coEvery {
            resultProcessor.finalizeCycle(any(), any(), any(), any(), any())
        } returns EvaluationResultProcessor.Result(
            planLabel = plan.label,
            goalTimeMs = plan.goalTimeMs,
            finalUsageMs = 6_000L,
            metGoal = true,
            nextCycleStartTime = scheduledEnd + TimeUnit.DAYS.toMillis(1),
            newPointBalance = 120
        )
        coEvery { monitoringWorkScheduler.enqueueScheduler() } just runs

        try {
            val outcome = debugger.simulateCycleCompletion()
            assertTrue(outcome is CycleSimulationDebugger.Outcome.Success)

            coVerify {
                resultProcessor.finalizeCycle(
                    plan = match { it.evaluationStartTime == scheduledStart },
                    finalUsageMs = 6_000L,
                    evaluationStartTime = scheduledStart,
                    evaluationEndTime = scheduledEnd,
                    hourlyUsage = emptyList()
                )
            }
            coVerify(exactly = 1) { planPreferencesDataSource.markEvaluationStarted(scheduledStart) }
            coVerify(exactly = 1) { monitoringWorkScheduler.enqueueScheduler() }
        } finally {
            unmockkObject(CalendarUtils)
        }
    }

    @Test
    fun simulateCycleCompletion_whenPlanStartMissingAndNoSchedule_usesCurrentDay() = runBlocking {
        val currentTime = 20_000_000L
        debugger.currentTimeProvider = { currentTime }
        val startOfDay = 19_800_000L
        val endOfDay = startOfDay + TimeUnit.HOURS.toMillis(24) - 1
        val plan = ScreenTimePlan(
            goalTimeMs = 3_600_000L,
            dailyAverageMs = 4_000_000L,
            label = "daily",
            planCreatedAt = 75L,
            evaluationStartTime = null
        )

        mockkObject(CalendarUtils)
        every { CalendarUtils.getStartOfDay(currentTime) } returns startOfDay
        every { CalendarUtils.getEndOfDay(startOfDay) } returns endOfDay

        coEvery { evaluationRepository.getCurrentPlan() } returns plan
        coEvery { planPreferencesDataSource.latest() } returns PlanPreferencesSnapshot(
            plan = plan,
            usageThresholdReached = 0,
            nextCycleStartTime = null,
            evaluationCompleted = false,
            evaluationCompletionTime = null,
            feedbackViewed = true,
            goalSuccessStreak = 0
        )
        coEvery { planPreferencesDataSource.markEvaluationStarted(startOfDay) } just runs
        coEvery {
            usageStatsRepository.getSnapshot(forceRefresh = true)
        } returns UsageSummary(
            windowStartMs = startOfDay,
            windowEndMs = endOfDay,
            totalsByPackage = mapOf("pkg" to 4_000L)
        )
        coEvery { usageStatsRepository.getUsageBuckets(startOfDay, endOfDay, TimeUnit.HOURS.toMillis(1)) } returns emptyList()
        coEvery {
            resultProcessor.finalizeCycle(any(), any(), any(), any(), any())
        } returns EvaluationResultProcessor.Result(
            planLabel = plan.label,
            goalTimeMs = plan.goalTimeMs,
            finalUsageMs = 4_000L,
            metGoal = true,
            nextCycleStartTime = endOfDay + TimeUnit.DAYS.toMillis(1),
            newPointBalance = 200
        )
        coEvery { monitoringWorkScheduler.enqueueScheduler() } just runs

        try {
            val outcome = debugger.simulateCycleCompletion()
            assertTrue(outcome is CycleSimulationDebugger.Outcome.Success)

            coVerify { planPreferencesDataSource.markEvaluationStarted(startOfDay) }
            coVerify {
                resultProcessor.finalizeCycle(
                    plan = match { it.evaluationStartTime == startOfDay },
                    finalUsageMs = 4_000L,
                    evaluationStartTime = startOfDay,
                    evaluationEndTime = endOfDay,
                    hourlyUsage = emptyList()
                )
            }
        } finally {
            unmockkObject(CalendarUtils)
        }
    }
}
