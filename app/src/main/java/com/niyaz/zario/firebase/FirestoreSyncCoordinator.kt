package com.niyaz.zario.firebase

import android.util.Log
import com.niyaz.zario.core.evaluation.storage.PlanPreferencesDataSource
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

        runCatching {
            planPreferencesDataSource.restoreFromRemote(userState.plan, userState.goalSuccessStreak)
        }.onFailure { Log.w(TAG, "Failed to restore plan from remote", it) }

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

    companion object {
        private const val TAG = "FirestoreSyncCoord"
        private const val HISTORY_IMPORT_LIMIT = 180
        private const val EMPTY_ID_SENTINEL = "__none__"
    }
}
