package com.niyaz.zario.firebase

import android.util.Log
import com.niyaz.zario.core.evaluation.storage.PlanPreferencesDataSource
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.data.local.dao.HourlyUsageDao
import com.niyaz.zario.security.UserIdentity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FirestoreSyncCoordinator @Inject constructor(
    private val userGateway: FirestoreUserGateway,
    private val planPreferencesDataSource: PlanPreferencesDataSource,
    private val evaluationHistoryDao: EvaluationHistoryDao,
    private val hourlyUsageDao: HourlyUsageDao
) {

    suspend fun syncFromRemote(userId: String, userEmail: String) {
        val userState = runCatching { userGateway.fetchUserState(userId) }
            .onFailure { Log.w(TAG, "Failed to fetch remote user state", it) }
            .getOrNull() ?: return

        val candidateIds = UserIdentity.candidateIds(userId, userEmail)
        val idsForQuery = if (candidateIds.isEmpty()) listOf(EMPTY_ID_SENTINEL) else candidateIds

        val latestLocalEndTime = runCatching {
            evaluationHistoryDao.latestEvaluationEndTimeForUser(idsForQuery, userEmail)
        }
            .onFailure { Log.w(TAG, "Failed to resolve local evaluation baseline", it) }
            .getOrNull()

        val remoteCycles = runCatching {
            userGateway.fetchEvaluationCycles(
                userId = userId,
                userEmail = userEmail,
                afterTimestamp = latestLocalEndTime,
                limit = HISTORY_IMPORT_LIMIT
            )
        }.onFailure { Log.w(TAG, "Failed to fetch remote evaluation cycles", it) }
            .getOrNull().orEmpty()

        val effectivePlan = resolvePlanToRestore(userState.plan, remoteCycles)
        runCatching {
            // IMPORTANT: don't clear an existing local plan just because the remote user doc doesn't have one.
            // This also allows fresh installs to recover a goal from remote history when `plan` is missing.
            val planOrLocal = effectivePlan ?: planPreferencesDataSource.latest().plan
            planPreferencesDataSource.restoreFromRemote(planOrLocal, userState.goalSuccessStreak)

            // Backfill plan onto the user doc so future reinstalls/devices can restore without history inference.
            if (userState.plan == null && planOrLocal != null) {
                userGateway.updatePlan(userId, planOrLocal.toRemotePayload())
            }
        }.onFailure { Log.w(TAG, "Failed to restore plan from remote", it) }

        if (remoteCycles.isEmpty()) {
            return
        }

        val historyEntries = remoteCycles.map { it.history }
        runCatching {
            evaluationHistoryDao.insertAll(historyEntries)
        }.onFailure { Log.w(TAG, "Failed to persist remote evaluation history", it) }

        remoteCycles.forEach { cycle ->
            if (cycle.hourly.isEmpty()) return@forEach
            runCatching { hourlyUsageDao.insertAll(cycle.hourly) }
                .onFailure { Log.w(TAG, "Failed to persist hourly usage for ${cycle.history.evaluationEndTime}", it) }
        }
    }

    private fun resolvePlanToRestore(
        remotePlan: ScreenTimePlan?,
        remoteCycles: List<FirestoreUserGateway.RemoteCycle>
    ): ScreenTimePlan? {
        if (remotePlan != null) return remotePlan

        val latestHistory = remoteCycles.maxByOrNull { it.history.evaluationEndTime }?.history ?: return null
        if (latestHistory.goalTimeMs <= 0L) return null

        // Older accounts may not have `plan` on the user doc. Recover the goal from history so the user
        // doesn't get forced through goal setup after reinstall.
        return ScreenTimePlan(
            goalTimeMs = latestHistory.goalTimeMs,
            dailyAverageMs = latestHistory.dailyAverageMs,
            label = latestHistory.planLabel,
            // We don't know the original planCreatedAt; choose a stable value that won't accidentally
            // trigger "day one" suppression for returning users.
            planCreatedAt = 0L,
            evaluationStartTime = null
        )
    }

    private fun ScreenTimePlan.toRemotePayload(): Map<String, Any?> = mapOf(
        "goalTimeMs" to goalTimeMs,
        "dailyAverageMs" to dailyAverageMs,
        "label" to label,
        "planCreatedAt" to planCreatedAt,
        "evaluationStartTime" to evaluationStartTime
    )

    companion object {
        private const val TAG = "FirestoreSyncCoord"
        private const val HISTORY_IMPORT_LIMIT = 180
        private const val EMPTY_ID_SENTINEL = "__none__"
    }
}
