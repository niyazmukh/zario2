package com.niyaz.zario.core.evaluation

import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.data.local.entities.AppUsageHourlyEntry
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import com.niyaz.zario.usage.UsageBucket
import javax.inject.Inject

/**
 * Abstraction for syncing local evaluation state with a remote backend (e.g. Firestore).
 * Default implementation is a no-op; app module should bind a concrete implementation.
 */
interface EvaluationRemoteDataSource {
    suspend fun syncPlan(plan: ScreenTimePlan)
    suspend fun syncCycleResult(
        entry: EvaluationHistoryEntry,
        hourlyEntries: List<AppUsageHourlyEntry>,
        pointsBalanceAfter: Int
    )
    suspend fun syncGoalSuccessStreak(streak: Int)
    suspend fun syncHourlySnapshots(
        planLabel: String,
        cycleStartTime: Long,
        buckets: List<UsageBucket>
    )
}

class NoOpEvaluationRemoteDataSource @Inject constructor() : EvaluationRemoteDataSource {
    override suspend fun syncPlan(plan: ScreenTimePlan) = Unit

    override suspend fun syncCycleResult(
        entry: EvaluationHistoryEntry,
        hourlyEntries: List<AppUsageHourlyEntry>,
        pointsBalanceAfter: Int
    ) = Unit

    override suspend fun syncGoalSuccessStreak(streak: Int) = Unit

    override suspend fun syncHourlySnapshots(
        planLabel: String,
        cycleStartTime: Long,
        buckets: List<UsageBucket>
    ) = Unit
}
