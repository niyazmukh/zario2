package com.niyaz.zario.usage

import com.niyaz.zario.usage.ingest.TrackedEventSource
import com.niyaz.zario.usage.storage.UsageRawEventDao
import com.niyaz.zario.usage.storage.UsageRawEventEntity
import com.niyaz.zario.usage.storage.UsageSessionDao
import com.niyaz.zario.usage.storage.UsageSessionEntity
import java.time.Duration
import java.time.Instant
import java.time.ZoneId
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Single source of truth for foreground usage data. Handles ingestion, persistence, and aggregated views.
 */
class UsageAggregationStore(
    private val trackedEventSource: TrackedEventSource,
    private val timelineReconciler: UsageTimelineReconciler,
    private val dao: UsageSessionDao,
    private val rawEventDao: UsageRawEventDao,
    private val config: UsageAggregationConfig
) {

    suspend fun ingestWindow(windowStartMs: Long, windowEndMs: Long) = withContext(Dispatchers.IO) {
        if (windowStartMs >= windowEndMs) return@withContext
        val trackedEvents = trackedEventSource.load(windowStartMs, windowEndMs)
        val sessions = timelineReconciler.reconcile(trackedEvents, windowStartMs, windowEndMs)
        if (sessions.isEmpty()) return@withContext

        val zoneId = config.zoneId
        val slices = sessions.flatMap { session ->
            splitAcrossCycles(session, zoneId)
        }
        if (slices.isEmpty()) return@withContext

        val entities = slices.map { slice ->
            UsageSessionEntity(
                packageName = slice.packageName,
                startMs = slice.startMs,
                endMs = slice.endMs,
                durationMs = slice.durationMs,
                dayStartMs = slice.dayStartMs,
                taskRootPackageName = slice.taskRootPackageName
            )
        }

        // Prevent historical re-ingestion from shrinking sessions that spill into other days.
        val existingByKey = dao
            .sessionsIntersecting(windowStartMs, windowEndMs)
            .associateBy { sessionKey(it.packageName, it.startMs) }
            .toMutableMap()

        val entitiesToPersist = mutableListOf<UsageSessionEntity>()
        for (entity in entities) {
            val key = sessionKey(entity.packageName, entity.startMs)
            val existing = existingByKey[key]
            if (existing == null) {
                entitiesToPersist += entity
                existingByKey[key] = entity
            } else {
                mergePreservingTail(existing, entity)?.let { merged ->
                    entitiesToPersist += merged
                    existingByKey[key] = merged
                }
            }
        }

        if (entitiesToPersist.isNotEmpty()) {
            dao.upsertAll(entitiesToPersist)
        }
    }

    suspend fun purgeSessionsOlderThan(cutoffMs: Long) = withContext(Dispatchers.IO) {
        dao.purgeBefore(cutoffMs)
        rawEventDao.purgeBefore(cutoffMs)
    }

    suspend fun purgeRawEventsBefore(cutoffMs: Long) = withContext(Dispatchers.IO) {
        rawEventDao.purgeBefore(cutoffMs)
    }

    suspend fun summarize(windowStartMs: Long, windowEndMs: Long): UsageSummary = withContext(Dispatchers.IO) {
        val sessions = dao.sessionsIntersecting(windowStartMs, windowEndMs)
        UsageSummary(windowStartMs, windowEndMs, computeTotals(sessions, windowStartMs, windowEndMs))
    }

    suspend fun summarizeDay(dayStartMs: Long): UsageSummary {
        val dayEnd = dayStartMs + ONE_DAY_MS
        return summarize(dayStartMs, dayEnd)
    }

    suspend fun foregroundPackageAt(timestampMs: Long): String? = withContext(Dispatchers.IO) {
        dao.sessionContaining(timestampMs)?.packageName
    }

    suspend fun hourlyBuckets(dayStartMs: Long, bucketSizeMs: Long = Duration.ofHours(1).toMillis()): List<UsageBucket> =
        withContext(Dispatchers.IO) {
            buckets(dayStartMs, dayStartMs + ONE_DAY_MS, bucketSizeMs)
        }

    suspend fun buckets(windowStartMs: Long, windowEndMs: Long, bucketSizeMs: Long): List<UsageBucket> =
        withContext(Dispatchers.IO) {
            require(bucketSizeMs > 0) { "bucketSizeMs must be positive" }
            if (windowStartMs >= windowEndMs) return@withContext emptyList()

            val sessions = dao.sessionsIntersecting(windowStartMs, windowEndMs)
            if (sessions.isEmpty()) return@withContext emptyList()

            val buckets = mutableListOf<UsageBucket>()
            val alignedStart = (windowStartMs / bucketSizeMs) * bucketSizeMs
            var cursor = alignedStart
            while (cursor < windowEndMs) {
                val bucketEnd = minOf(windowEndMs, cursor + bucketSizeMs)
                val effectiveStart = maxOf(cursor, windowStartMs)
                if (effectiveStart >= bucketEnd) {
                    cursor += bucketSizeMs
                    continue
                }
                val totals = computeTotals(sessions, effectiveStart, bucketEnd)
                buckets += UsageBucket(cursor, bucketEnd, totals)
                cursor = bucketEnd
            }
            buckets
        }

    /**
     * Returns buckets for a specific day. Uses day-specific query to prevent
     * cross-day contamination (e.g., historical queries returning today's sessions).
     */
    suspend fun bucketsForDay(dayStartMs: Long, windowStartMs: Long, windowEndMs: Long, bucketSizeMs: Long): List<UsageBucket> =
        withContext(Dispatchers.IO) {
            require(bucketSizeMs > 0) { "bucketSizeMs must be positive" }
            if (windowStartMs >= windowEndMs) return@withContext emptyList()

            val sessions = dao.sessionsIntersectingForDay(dayStartMs, windowStartMs, windowEndMs)
            if (sessions.isEmpty()) return@withContext emptyList()

            val buckets = mutableListOf<UsageBucket>()
            val alignedStart = (windowStartMs / bucketSizeMs) * bucketSizeMs
            var cursor = alignedStart
            while (cursor < windowEndMs) {
                val bucketEnd = minOf(windowEndMs, cursor + bucketSizeMs)
                val effectiveStart = maxOf(cursor, windowStartMs)
                if (effectiveStart >= bucketEnd) {
                    cursor += bucketSizeMs
                    continue
                }
                val totals = computeTotals(sessions, effectiveStart, bucketEnd)
                buckets += UsageBucket(cursor, bucketEnd, totals)
                cursor = bucketEnd
            }
            buckets
        }

    private fun computeTotals(
        sessions: List<UsageSessionEntity>,
        windowStart: Long,
        windowEnd: Long
    ): Map<String, Long> {
        if (sessions.isEmpty()) return emptyMap()
        val totals = LinkedHashMap<String, Long>()
        for (session in sessions) {
            val overlapStart = maxOf(windowStart, session.startMs)
            val overlapEnd = minOf(windowEnd, session.endMs)
            if (overlapEnd <= overlapStart) continue
            val duration = overlapEnd - overlapStart
            totals.merge(session.packageName, duration) { old, new -> old + new }
        }
        return totals
    }

    companion object {
        private val ONE_DAY_MS: Long = Duration.ofDays(1).toMillis()
    }

    private fun sessionKey(packageName: String, startMs: Long): Pair<String, Long> = packageName to startMs

    // Split each session at local day boundaries so every cycle owns only its portion.
    private fun splitAcrossCycles(session: UsageSession, zoneId: ZoneId): List<SessionSlice> {
        if (session.startMs >= session.endMs) return emptyList()
        val slices = mutableListOf<SessionSlice>()
        var segmentStart = session.startMs
        while (segmentStart < session.endMs) {
            val startZoned = Instant.ofEpochMilli(segmentStart).atZone(zoneId)
            val dayStart = startZoned.toLocalDate().atStartOfDay(zoneId)
            val nextDayStart = dayStart.plusDays(1)
            val dayStartMs = dayStart.toInstant().toEpochMilli()
            val nextDayStartMs = nextDayStart.toInstant().toEpochMilli()
            val segmentEnd = minOf(session.endMs, nextDayStartMs)
            if (segmentEnd > segmentStart) {
                slices += SessionSlice(
                    packageName = session.packageName,
                    startMs = segmentStart,
                    endMs = segmentEnd,
                    dayStartMs = dayStartMs,
                    taskRootPackageName = session.taskRootPackageName
                )
            }
            segmentStart = segmentEnd
        }
        return slices
    }

    private fun mergePreservingTail(
        existing: UsageSessionEntity,
        incoming: UsageSessionEntity
    ): UsageSessionEntity? {
        val mergedEnd = maxOf(existing.endMs, incoming.endMs)
        val mergedDuration = maxOf(
            existing.durationMs,
            incoming.durationMs,
            mergedEnd - existing.startMs
        )
        val mergedTaskRoot = existing.taskRootPackageName ?: incoming.taskRootPackageName
        val needsUpdate = mergedEnd != existing.endMs ||
            mergedDuration != existing.durationMs ||
            mergedTaskRoot != existing.taskRootPackageName
        return if (needsUpdate) {
            existing.copy(
                endMs = mergedEnd,
                durationMs = mergedDuration,
                taskRootPackageName = mergedTaskRoot
            )
        } else {
            null
        }
    }

    private data class SessionSlice(
        val packageName: String,
        val startMs: Long,
        val endMs: Long,
        val dayStartMs: Long,
        val taskRootPackageName: String?
    ) {
        val durationMs: Long
            get() = (endMs - startMs).coerceAtLeast(0L)
    }
}
