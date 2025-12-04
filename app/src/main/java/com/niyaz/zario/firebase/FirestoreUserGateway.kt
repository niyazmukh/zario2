package com.niyaz.zario.firebase

import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.SetOptions
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.tasks.await
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.data.local.entities.AppUsageHourlyEntry
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry

@Singleton
class FirestoreUserGateway @Inject constructor(
    private val firestore: FirebaseFirestore
) {
    private val usersCollection get() = firestore.collection(FirestoreCollections.USERS)

    fun userDocument(userId: String) = usersCollection.document(userId)

    suspend fun upsertUserProfile(userId: String, profile: Map<String, Any?>) {
        withFirebaseTimeout {
            userDocument(userId)
                .set(profile, SetOptions.merge())
                .await()
        }
    }

    suspend fun fetchUserProfile(userId: String): DocumentSnapshot {
        return withFirebaseTimeout {
            userDocument(userId)
                .get()
                .await()
        }
    }

    suspend fun updatePlan(userId: String, planPayload: Map<String, Any?>) {
        withFirebaseTimeout {
            userDocument(userId)
                .set(mapOf(FirestoreFields.PLAN to planPayload), SetOptions.merge())
                .await()
        }
    }

    suspend fun recordCycleResult(
        userId: String,
        historyDocumentId: String,
        historyData: Map<String, Any?>,
        hourlyEntries: List<Map<String, Any?>>,
        pointsBalanceAfter: Int
    ) {
        val userDoc = userDocument(userId)
        val historyDoc = userDoc.collection(FirestoreCollections.EVALUATION_HISTORY)
            .document(historyDocumentId)

        // Use transaction for atomic points + history write (rollback on failure)
        withFirebaseTimeout {
            firestore.runTransaction { transaction ->
                transaction.set(
                    userDoc,
                    mapOf(FirestoreFields.POINTS_BALANCE to pointsBalanceAfter),
                    SetOptions.merge()
                )
                transaction.set(historyDoc, historyData, SetOptions.merge())
            }.await()
        }

        if (hourlyEntries.isEmpty()) return

        // Hourly entries uploaded in batches (non-critical, no rollback needed)
        hourlyEntries.chunked(MAX_HOURLY_BATCH).forEach { chunk ->
            withFirebaseTimeout {
                firestore.runBatch { batch ->
                    chunk.forEachIndexed { index, entry ->
                        val hourlyId = hourlyDocumentId(historyDocumentId, entry, index)
                        val hourlyDoc = historyDoc.collection(FirestoreCollections.HOURLY_USAGE)
                            .document(hourlyId)
                        batch.set(hourlyDoc, entry, SetOptions.merge())
                    }
                }.await()
            }
        }
    }

    suspend fun upsertLiveHourlyUsage(
        userId: String,
        cycleStartTime: Long,
        hourStartTime: Long,
        hourEndTime: Long,
        planLabel: String,
        hourlyEntries: List<Map<String, Any?>>
    ) {
        if (hourlyEntries.isEmpty()) return

        val userDoc = userDocument(userId)
        val liveDoc = userDoc.collection(FirestoreCollections.LIVE_USAGE)
            .document(cycleStartTime.toString())
            .collection(FirestoreCollections.HOURLY_USAGE)
            .document(hourStartTime.toString())

        withFirebaseTimeout {
            firestore.runBatch { batch ->
                batch.set(
                    liveDoc,
                    mapOf(
                        "planLabel" to planLabel,
                        "cycleStartTime" to cycleStartTime,
                        "hourStartTime" to hourStartTime,
                        "hourEndTime" to hourEndTime
                    ),
                    SetOptions.merge()
                )
            }.await()
        }

        hourlyEntries.chunked(MAX_HOURLY_BATCH).forEach { chunk ->
            withFirebaseTimeout {
                firestore.runBatch { batch ->
                    chunk.forEachIndexed { index, entry ->
                        val hourlyId = hourlyDocumentId(hourStartTime.toString(), entry, index)
                        val packageDoc = liveDoc.collection(FirestoreCollections.HOURLY_PACKAGES)
                            .document(hourlyId)
                        batch.set(packageDoc, entry, SetOptions.merge())
                    }
                }.await()
            }
        }
    }

    suspend fun updateGoalSuccessStreak(userId: String, streak: Int) {
        withFirebaseTimeout {
            userDocument(userId)
                .set(mapOf(FirestoreFields.GOAL_SUCCESS_STREAK to streak), SetOptions.merge())
                .await()
        }
    }

    suspend fun recordAppInteractions(userId: String, events: List<Map<String, Any?>>) {
        if (events.isEmpty()) return
        val interactions = userDocument(userId).collection(FirestoreCollections.APP_INTERACTIONS)
        events.chunked(MAX_EVENT_BATCH).forEach { chunk ->
            withFirebaseTimeout {
                firestore.runBatch { batch ->
                    chunk.forEach { event ->
                        val doc = interactions.document()
                        batch.set(doc, event, SetOptions.merge())
                    }
                }.await()
            }
        }
    }

    suspend fun recordNotificationEvents(userId: String, events: List<Map<String, Any?>>) {
        if (events.isEmpty()) return
        val notifications = userDocument(userId).collection(FirestoreCollections.NOTIFICATION_EVENTS)
        events.chunked(MAX_EVENT_BATCH).forEach { chunk ->
            withFirebaseTimeout {
                firestore.runBatch { batch ->
                    chunk.forEach { event ->
                        val doc = notifications.document()
                        batch.set(doc, event, SetOptions.merge())
                    }
                }.await()
            }
        }
    }

    data class RemoteUserState(
        val plan: ScreenTimePlan?,
        val goalSuccessStreak: Int?,
        val pointsBalance: Int?
    )

    data class RemoteCycle(
        val history: EvaluationHistoryEntry,
        val hourly: List<AppUsageHourlyEntry>
    )

    suspend fun fetchUserState(userId: String): RemoteUserState {
        val snapshot = withFirebaseTimeout {
            userDocument(userId).get().await()
        }
        val plan = snapshot.get(FirestoreFields.PLAN)
            .toStringAnyMap()
            ?.toScreenTimePlan()
        val goalStreak = snapshot.getLong(FirestoreFields.GOAL_SUCCESS_STREAK)?.toInt()
        val pointsBalance = snapshot.getLong(FirestoreFields.POINTS_BALANCE)?.toInt()
        return RemoteUserState(plan = plan, goalSuccessStreak = goalStreak, pointsBalance = pointsBalance)
    }

    suspend fun fetchEvaluationCycles(
        userId: String,
        userEmail: String,
        afterTimestamp: Long?,
        limit: Int
    ): List<RemoteCycle> {
        var query = userDocument(userId)
            .collection(FirestoreCollections.EVALUATION_HISTORY)
            .orderBy("evaluationEndTime", Query.Direction.ASCENDING)

        if (afterTimestamp != null) {
            query = query.startAfter(afterTimestamp)
        }

        query = query.limit(limit.toLong())

        val historySnapshots = withFirebaseTimeout {
            query.get().await().documents
        }

        if (historySnapshots.isEmpty()) return emptyList()

        return historySnapshots.map { historyDoc ->
            val historyEntry = historyDoc.toEvaluationHistoryEntry(userId, userEmail)
            val hourlySnapshots = withFirebaseTimeout {
                historyDoc.reference
                    .collection(FirestoreCollections.HOURLY_USAGE)
                    .get()
                    .await()
                    .documents
            }
            val hourlyEntries = hourlySnapshots.map { hourlyDoc ->
                hourlyDoc.toAppUsageHourlyEntry(userId, userEmail, historyEntry.planLabel)
            }
            RemoteCycle(history = historyEntry, hourly = hourlyEntries)
        }
    }
}

private const val MAX_HOURLY_BATCH = 400
private const val MAX_EVENT_BATCH = 100

private fun hourlyDocumentId(prefix: String, entry: Map<String, Any?>, fallbackIndex: Int): String {
    val hourStart = (entry["hourStartTime"] as? Number)?.toLong()
    val packageName = (entry["packageName"] as? String)?.ifBlank { "unknown" } ?: "unknown"
    val sanitizedPackage = packageName
        .replace('[', '_')
        .replace(']', '_')
        .replace('/', '_')
        .replace('.', '_')
        .replace('#', '_')
        .replace('$', '_')
    return listOfNotNull(prefix, hourStart?.toString(), sanitizedPackage.take(MAX_ID_LENGTH))
        .joinToString(separator = "-") { it }
        .ifBlank { "$prefix-$fallbackIndex" }
}

private const val MAX_ID_LENGTH = 50

private fun Any?.toStringAnyMap(): Map<String, Any?>? {
    val rawMap = this as? Map<*, *> ?: return null
    if (rawMap.isEmpty()) return emptyMap()
    return buildMap {
        rawMap.forEach { (key, value) ->
            if (key is String) put(key, value)
        }
    }
}
