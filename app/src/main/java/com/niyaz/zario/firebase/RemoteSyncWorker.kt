package com.niyaz.zario.firebase

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.google.firebase.auth.FirebaseAuth
import com.niyaz.zario.data.local.dao.RemoteSyncDao
import com.niyaz.zario.data.local.dao.RemoteSyncDao.PendingCycleWithHourly
import com.niyaz.zario.data.local.entities.PendingCycleSyncEntity
import com.niyaz.zario.data.local.entities.PendingAppInteractionEntity
import com.niyaz.zario.data.local.entities.PendingHourlySyncEntity
import com.niyaz.zario.data.local.entities.PendingHourlySyncEntity.SyncType
import com.niyaz.zario.data.local.entities.PendingNotificationEventEntity
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import java.util.concurrent.TimeUnit

@HiltWorker
class RemoteSyncWorker @AssistedInject constructor(
    @Assisted appContext: Context,
    @Assisted params: WorkerParameters,
    private val auth: FirebaseAuth,
    private val userGateway: FirestoreUserGateway,
    private val remoteSyncDao: RemoteSyncDao,
    private val notifier: RemoteSyncNotifier
) : CoroutineWorker(appContext, params) {

    override suspend fun doWork(): Result = withContext(Dispatchers.IO) {
        if (auth.currentUser == null) {
            Log.i(TAG, "No authenticated user – clearing pending remote sync workload")
            runCatching { remoteSyncDao.clearAll() }
                .onFailure { error -> Log.w(TAG, "Failed to clear remote sync tables", error) }
            notifier.notifyRecovered(applicationContext)
            return@withContext Result.success()
        }

        runCatching {
            withFirebaseTimeout {
                auth.currentUser?.reload()?.await()
            }
        }.onFailure { Log.w(TAG, "Failed to refresh auth session before sync", it) }

        var anyFailure = false

        val pendingCycles = remoteSyncDao.loadPendingCycles(MAX_CYCLE_BATCH)
        pendingCycles.forEach { cycleWithHourly ->
            val success = processCycle(cycleWithHourly)
            if (!success) anyFailure = true
        }

        val pendingLiveHourly = remoteSyncDao.loadPendingHourly(SyncType.LIVE, MAX_HOURLY_BATCH)
        if (pendingLiveHourly.isNotEmpty()) {
            val success = processLiveHourly(pendingLiveHourly)
            if (!success) anyFailure = true
        }

        val pendingAppInteractions = remoteSyncDao.loadPendingAppInteractions(MAX_APP_INTERACTION_BATCH)
        if (pendingAppInteractions.isNotEmpty()) {
            val success = processAppInteractions(pendingAppInteractions)
            if (!success) anyFailure = true
        }

        val pendingNotificationEvents = remoteSyncDao.loadPendingNotificationEvents(MAX_NOTIFICATION_EVENT_BATCH)
        if (pendingNotificationEvents.isNotEmpty()) {
            val success = processNotificationEvents(pendingNotificationEvents)
            if (!success) anyFailure = true
        }

        val remainingCycles = remoteSyncDao.loadPendingCycles(1).isNotEmpty()
        val remainingHourly = remoteSyncDao.loadPendingHourly(SyncType.LIVE, 1).isNotEmpty()
        val remainingAppInteractions = remoteSyncDao.loadPendingAppInteractions(1).isNotEmpty()
        val remainingNotificationEvents = remoteSyncDao.loadPendingNotificationEvents(1).isNotEmpty()

        if (!anyFailure && !remainingCycles && !remainingHourly &&
            !remainingAppInteractions && !remainingNotificationEvents) {
            notifier.notifyRecovered(applicationContext)
        }

        // Prune old pending records to prevent indefinite accumulation
        pruneOldRecords()

        when {
            anyFailure -> Result.retry()
            remainingCycles || remainingHourly || remainingAppInteractions || remainingNotificationEvents -> Result.retry()
            else -> Result.success()
        }
    }

    private suspend fun pruneOldRecords() {
        val threshold = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(30)
        runCatching {
            remoteSyncDao.deleteOldCycles(threshold)
            remoteSyncDao.deleteOldHourly(threshold)
            remoteSyncDao.deleteOldAppInteractions(threshold)
            remoteSyncDao.deleteOldNotificationEvents(threshold)
        }.onFailure { Log.w(TAG, "Failed to prune old pending sync records", it) }
    }

    private suspend fun processCycle(cycleWithHourly: PendingCycleWithHourly): Boolean {
        val cycle = cycleWithHourly.cycle
        val hourlyEntries = cycleWithHourly.hourly
        return runCatching {
            userGateway.recordCycleResult(
                userId = cycle.userId,
                historyDocumentId = cycle.historyDocumentId,
                historyData = cycle.toRemote(),
                hourlyEntries = hourlyEntries.map { it.toRemote() },
                pointsBalanceAfter = cycle.pointsBalanceAfter
            )
            remoteSyncDao.deleteHourlyByParent(cycle.id)
            remoteSyncDao.deleteCycle(cycle)
            true
        }.getOrElse { error ->
            Log.w(TAG, "Failed to sync cycle ${cycle.historyDocumentId}", error)
            updateCycleAttempts(cycle, error)
            false
        }
    }

    private suspend fun processLiveHourly(entries: List<PendingHourlySyncEntity>): Boolean {
        var allSuccessful = true
        val grouped = entries.groupBy { Triple(it.userId, it.cycleStartTime, it.hourStartTime) }
        grouped.forEach { (_, hourlyGroup) ->
            val representative = hourlyGroup.firstOrNull() ?: return@forEach
            val success = runCatching {
                userGateway.upsertLiveHourlyUsage(
                    userId = representative.userId,
                    cycleStartTime = representative.cycleStartTime,
                    hourStartTime = representative.hourStartTime,
                    hourEndTime = representative.hourEndTime,
                    planLabel = representative.planLabel,
                    hourlyEntries = hourlyGroup.map { it.toRemote() }
                )
                remoteSyncDao.deleteHourly(hourlyGroup)
                true
            }.getOrElse { error ->
                Log.w(TAG, "Failed to sync live hourly usage for ${representative.hourStartTime}", error)
                hourlyGroup.forEach { entry ->
                    updateHourlyAttempts(entry, error)
                }
                allSuccessful = false
                false
            }
            if (!success) {
                allSuccessful = false
            }
        }
        return allSuccessful
    }

    private suspend fun processAppInteractions(entries: List<PendingAppInteractionEntity>): Boolean {
        val groupedByUser = entries.groupBy { it.userId }
        var allSuccessful = true
        groupedByUser.forEach { (userId, userEntries) ->
            val success = runCatching {
                userGateway.recordAppInteractions(userId, userEntries.map { it.toRemote() })
                remoteSyncDao.deleteAppInteractions(userEntries)
                true
            }.getOrElse { error ->
                Log.w(TAG, "Failed to sync app interactions for $userId", error)
                userEntries.forEach { updateAppInteractionAttempts(it, error) }
                allSuccessful = false
                false
            }
            if (!success) allSuccessful = false
        }
        return allSuccessful
    }

    private suspend fun processNotificationEvents(entries: List<PendingNotificationEventEntity>): Boolean {
        val groupedByUser = entries.groupBy { it.userId }
        var allSuccessful = true
        groupedByUser.forEach { (userId, userEntries) ->
            val success = runCatching {
                userGateway.recordNotificationEvents(userId, userEntries.map { it.toRemote() })
                remoteSyncDao.deleteNotificationEvents(userEntries)
                true
            }.getOrElse { error ->
                Log.w(TAG, "Failed to sync notification events for $userId", error)
                userEntries.forEach { updateNotificationEventAttempts(it, error) }
                allSuccessful = false
                false
            }
            if (!success) allSuccessful = false
        }
        return allSuccessful
    }

    private suspend fun updateCycleAttempts(entity: PendingCycleSyncEntity, error: Throwable) {
        val updated = entity.copy(
            attempts = entity.attempts + 1,
            lastAttemptAt = System.currentTimeMillis()
        )
        remoteSyncDao.updateCycle(updated)
        if (updated.attempts >= FAILURE_THRESHOLD) {
            notifier.notifyFailure(
                applicationContext,
                SyncFailureContext(attempts = updated.attempts, lastError = error.message)
            )
        }
    }

    private suspend fun updateHourlyAttempts(entity: PendingHourlySyncEntity, error: Throwable) {
        val updated = entity.copy(
            attempts = entity.attempts + 1,
            lastAttemptAt = System.currentTimeMillis()
        )
        remoteSyncDao.updateHourly(updated)
        if (updated.attempts >= FAILURE_THRESHOLD) {
            notifier.notifyFailure(
                applicationContext,
                SyncFailureContext(attempts = updated.attempts, lastError = error.message)
            )
        }
    }

    private suspend fun updateAppInteractionAttempts(entity: PendingAppInteractionEntity, error: Throwable) {
        val updated = entity.copy(
            attempts = entity.attempts + 1,
            lastAttemptAt = System.currentTimeMillis()
        )
        remoteSyncDao.updateAppInteraction(updated)
        if (updated.attempts >= FAILURE_THRESHOLD) {
            notifier.notifyFailure(
                applicationContext,
                SyncFailureContext(attempts = updated.attempts, lastError = error.message)
            )
        }
    }

    private suspend fun updateNotificationEventAttempts(entity: PendingNotificationEventEntity, error: Throwable) {
        val updated = entity.copy(
            attempts = entity.attempts + 1,
            lastAttemptAt = System.currentTimeMillis()
        )
        remoteSyncDao.updateNotificationEvent(updated)
        if (updated.attempts >= FAILURE_THRESHOLD) {
            notifier.notifyFailure(
                applicationContext,
                SyncFailureContext(attempts = updated.attempts, lastError = error.message)
            )
        }
    }

    companion object {
        const val WORK_NAME = "remote_firestore_sync"
        private const val TAG = "RemoteSyncWorker"
        private const val MAX_CYCLE_BATCH = 2
        private const val MAX_HOURLY_BATCH = 120
        private const val MAX_APP_INTERACTION_BATCH = 50
        private const val MAX_NOTIFICATION_EVENT_BATCH = 50
        private const val FAILURE_THRESHOLD = 3
    }
}

private fun PendingCycleSyncEntity.toRemote(): Map<String, Any?> = mapOf(
    "planLabel" to planLabel,
    "goalTimeMs" to goalTimeMs,
    "dailyAverageMs" to dailyAverageMs,
    "finalUsageMs" to finalUsageMs,
    "evaluationStartTime" to evaluationStartTime,
    "evaluationEndTime" to evaluationEndTime,
    "metGoal" to metGoal,
    "pointsDelta" to pointsDelta,
    "pointsBalanceAfter" to pointsBalanceAfter
)

private fun PendingHourlySyncEntity.toRemote(): Map<String, Any?> = mapOf(
    "planLabel" to planLabel,
    "cycleStartTime" to cycleStartTime,
    "hourStartTime" to hourStartTime,
    "hourEndTime" to hourEndTime,
    "packageName" to packageName,
    "usageMs" to usageMs
)

private fun PendingAppInteractionEntity.toRemote(): Map<String, Any?> = mapOf(
    "userId" to userId,
    "userEmail" to userEmail,
    "occurredAt" to occurredAt,
    "source" to source.name.lowercase(),
    "appVersionName" to appVersionName,
    "appVersionCode" to appVersionCode,
    "createdAt" to createdAt
)

private fun PendingNotificationEventEntity.toRemote(): Map<String, Any?> = mapOf(
    "userId" to userId,
    "userEmail" to userEmail,
    "occurredAt" to occurredAt,
    "eventType" to eventType.name.lowercase(),
    "category" to category.name.lowercase(),
    "notificationId" to notificationId,
    "channelId" to channelId,
    "metadata" to metadataJson,
    "createdAt" to createdAt
)
