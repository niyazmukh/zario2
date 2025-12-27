package com.niyaz.zario.firebase

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.niyaz.zario.core.evaluation.EvaluationRemoteDataSource
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.data.local.dao.RemoteSyncDao
import com.niyaz.zario.data.local.entities.AppUsageHourlyEntry
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import com.niyaz.zario.data.local.entities.HourlySyncStateEntity
import com.niyaz.zario.data.local.entities.PendingCycleSyncEntity
import com.niyaz.zario.data.local.entities.PendingHourlySyncEntity
import com.niyaz.zario.data.local.entities.PendingHourlySyncEntity.SyncType
import com.niyaz.zario.usage.UsageBucket
import com.niyaz.zario.utils.CalendarUtils
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

private const val TAG = "FirebaseEvalRemote"

class FirebaseEvaluationRemoteDataSource @Inject constructor(
    private val userGateway: FirestoreUserGateway,
    private val auth: FirebaseAuth,
    private val remoteSyncDao: RemoteSyncDao,
    private val remoteSyncScheduler: RemoteSyncScheduler
) : EvaluationRemoteDataSource {

    override suspend fun syncPlan(plan: ScreenTimePlan) {
        val userId = resolveUserIdOrNull()?.id ?: return
        val planData = plan.toRemote()
        runCatching { userGateway.updatePlan(userId, planData) }
            .onFailure { Log.w(TAG, "Failed to sync plan", it) }
    }

    override suspend fun syncCycleResult(
        entry: EvaluationHistoryEntry,
        hourlyEntries: List<AppUsageHourlyEntry>,
        pointsBalanceAfter: Int
    ) {
        val (userId, userEmail) = resolveUserIdOrNull() ?: return
        withContext(Dispatchers.IO) {
            val cycleEntity = PendingCycleSyncEntity(
                userId = userId,
                userEmail = userEmail,
                historyDocumentId = entry.evaluationEndTime.toString(),
                planLabel = entry.planLabel,
                goalTimeMs = entry.goalTimeMs,
                dailyAverageMs = entry.dailyAverageMs,
                finalUsageMs = entry.finalUsageMs,
                evaluationStartTime = entry.evaluationStartTime,
                evaluationEndTime = entry.evaluationEndTime,
                metGoal = entry.metGoal,
                pointsDelta = entry.pointsDelta,
                pointsBalanceAfter = pointsBalanceAfter
            )

            val hourlyEntities = hourlyEntries.map { hourly ->
                PendingHourlySyncEntity(
                    parentCycleId = null,
                    userId = userId,
                    userEmail = userEmail,
                    planLabel = hourly.planLabel,
                    cycleStartTime = hourly.cycleStartTime,
                    hourStartTime = hourly.hourStartTime,
                    hourEndTime = hourly.hourEndTime,
                    packageName = hourly.packageName,
                    usageMs = hourly.usageMs,
                    syncType = SyncType.CYCLE
                )
            }

            remoteSyncDao.insertCycleWithHourly(cycleEntity, hourlyEntities)
        }
        remoteSyncScheduler.scheduleSync()
    }

    override suspend fun syncGoalSuccessStreak(streak: Int) {
        val userId = resolveUserIdOrNull()?.id ?: return
        runCatching {
            userGateway.updateGoalSuccessStreak(userId, streak)
        }.onFailure { Log.w(TAG, "Failed to sync streak", it) }
    }

    override suspend fun syncHourlySnapshots(
        planLabel: String,
        cycleStartTime: Long,
        buckets: List<UsageBucket>
    ) {
        val (userId, userEmail) = resolveUserIdOrNull() ?: return
        val now = System.currentTimeMillis()
        val latestCompleteHourStart = CalendarUtils.floorToHour(now - ONE_MILLISECOND)

        if (buckets.isEmpty()) return

        val insertedNewEntries = withContext(Dispatchers.IO) {
            val stateKey = HourlySyncStateEntity.keyFor(userId, cycleStartTime)
            val existingState = remoteSyncDao.findStateByKey(stateKey)
            val lastProcessedHourStart = existingState?.lastSyncedHourStart ?: (cycleStartTime - HOUR_MS)

            val newEntries = mutableListOf<PendingHourlySyncEntity>()
            var maxProcessed = lastProcessedHourStart

            buckets.sortedBy { it.bucketStartMs }
                .filter { bucket ->
                    bucket.bucketStartMs > lastProcessedHourStart &&
                        bucket.bucketStartMs >= cycleStartTime &&
                        bucket.bucketStartMs <= latestCompleteHourStart &&
                        bucket.bucketStartMs < bucket.bucketEndMs
                }
                .forEach { bucket ->
                    if (bucket.bucketEndMs > latestCompleteHourStart + HOUR_MS) {
                        return@forEach
                    }
                    val filteredTotals = bucket.totalsByPackage.filterValues { usage -> usage > 0L }
                    filteredTotals.forEach { (packageName, usageMs) ->
                        newEntries += PendingHourlySyncEntity(
                            parentCycleId = null,
                            userId = userId,
                            userEmail = userEmail,
                            planLabel = planLabel,
                            cycleStartTime = cycleStartTime,
                            hourStartTime = bucket.bucketStartMs,
                            hourEndTime = bucket.bucketEndMs,
                            packageName = packageName,
                            usageMs = usageMs,
                            syncType = SyncType.LIVE
                        )
                    }
                    maxProcessed = maxOf(maxProcessed, bucket.bucketStartMs)
                }

            if (newEntries.isNotEmpty() || maxProcessed != lastProcessedHourStart) {
                if (newEntries.isNotEmpty()) {
                    remoteSyncDao.insertHourly(newEntries)
                }
                val updatedState = HourlySyncStateEntity(
                    key = stateKey,
                    userId = userId,
                    cycleStartTime = cycleStartTime,
                    lastSyncedHourStart = maxProcessed,
                    updatedAt = System.currentTimeMillis()
                )
                remoteSyncDao.upsertState(updatedState)
            }

            newEntries.isNotEmpty()
        }

        // Avoid scheduling RemoteSyncWorker on every monitoring tick.
        if (insertedNewEntries) {
            remoteSyncScheduler.scheduleSync()
        }
    }

    private fun resolveUserIdOrNull(): UserIdentity? {
        val currentUser = auth.currentUser
        if (currentUser == null) {
            Log.w(TAG, "Skipping remote sync – user not authenticated")
            return null
        }
        return UserIdentity(
            id = currentUser.uid,
            email = currentUser.email ?: ""
        )
    }

    private data class UserIdentity(
        val id: String,
        val email: String
    )

    companion object {
        private const val HOUR_MS = 60L * 60L * 1000L
        private const val ONE_MILLISECOND = 1L
    }
}

private fun ScreenTimePlan.toRemote(): Map<String, Any?> = mapOf(
    "goalTimeMs" to goalTimeMs,
    "dailyAverageMs" to dailyAverageMs,
    "label" to label,
    "planCreatedAt" to planCreatedAt,
    "evaluationStartTime" to evaluationStartTime
)
