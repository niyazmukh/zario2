package com.niyaz.zario.core.evaluation

import android.util.Log
import com.niyaz.zario.core.evaluation.storage.PlanPreferencesDataSource
import com.niyaz.zario.core.usage.UsageStatsRepository
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.utils.CalendarUtils
import com.niyaz.zario.worker.MonitoringWorkScheduler
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

@Singleton
class CycleSimulationDebugger @Inject constructor(
    private val evaluationRepository: EvaluationRepository,
    private val usageStatsRepository: UsageStatsRepository,
    private val resultProcessor: EvaluationResultProcessor,
    private val monitoringWorkScheduler: MonitoringWorkScheduler,
    private val planPreferencesDataSource: PlanPreferencesDataSource
) {

    private val simulationMutex = Mutex()

    internal var currentTimeProvider: () -> Long = { System.currentTimeMillis() }

    suspend fun simulateCycleCompletion(): Outcome = simulationMutex.withLock {
        // This debugger is intended for developer/debug builds only. Avoid executing
        // simulation logic in release builds to prevent accidental data changes.
        if (!com.niyaz.zario.BuildConfig.DEBUG) {
            val ex = IllegalStateException("CycleSimulationDebugger is disabled in non-debug builds")
            Log.w(TAG, "Attempted to run simulateCycleCompletion() in release build", ex)
            return Outcome.Failure(ex)
        }
        val existingPlan = evaluationRepository.getCurrentPlan()
            ?: return Outcome.NoPlan

        return runCatching {
            val activePlan = ensureEvaluationStart(existingPlan)
            val start = requireNotNull(activePlan.evaluationStartTime) {
                "Evaluation start time missing after initialization"
            }

            val completionTime = CalendarUtils.getEndOfDay(start)
            val usageSnapshot = usageStatsRepository.getSnapshot(forceRefresh = true)
            val hourlyBuckets = runCatching {
                usageStatsRepository.getUsageBuckets(
                    start,
                    completionTime,
                    TimeUnit.HOURS.toMillis(1)
                )
            }.getOrElse { error ->
                Log.w(TAG, "Failed to fetch hourly usage for simulation", error)
                emptyList()
            }

            resultProcessor.finalizeCycle(
                plan = activePlan,
                finalUsageMs = usageSnapshot.totalUsageMs,
                evaluationStartTime = start,
                evaluationEndTime = completionTime,
                hourlyUsage = hourlyBuckets
            )

            monitoringWorkScheduler.enqueueScheduler()

            Outcome.Success(completionTime)
        }.getOrElse { throwable ->
            Log.e(TAG, "Cycle simulation failed", throwable)
            Outcome.Failure(throwable)
        }
    }

    private suspend fun ensureEvaluationStart(plan: ScreenTimePlan): ScreenTimePlan {
        val existingStart = plan.evaluationStartTime
        if (existingStart != null) {
            return plan
        }

        val snapshot = planPreferencesDataSource.latest()
        val forcedStart = snapshot.nextCycleStartTime
            ?: CalendarUtils.getStartOfDay(currentTimeProvider.invoke())

        planPreferencesDataSource.markEvaluationStarted(forcedStart)
        return plan.copy(evaluationStartTime = forcedStart)
    }

    sealed class Outcome {
        data class Success(val evaluationEndTime: Long) : Outcome()
        object NoPlan : Outcome()
        data class Failure(val cause: Throwable) : Outcome()
    }

    companion object {
        private const val TAG = "CycleSimulationDebugger"
    }
}
