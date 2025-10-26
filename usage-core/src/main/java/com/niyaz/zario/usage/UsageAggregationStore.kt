package com.niyaz.zario.usage

import com.niyaz.zario.usage.ingest.TrackedEventSource
import com.niyaz.zario.usage.storage.UsageRawEventDao
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
    private val config: UsageAggregationConfig,
    private val telemetry: UsageIngestionTelemetry
) {

    suspend fun ingestWindow(windowStartMs: Long, windowEndMs: Long) = withContext(Dispatchers.IO) {
        if (windowStartMs >= windowEndMs) return@withContext
        val trackedEvents = trackedEventSource.load(windowStartMs, windowEndMs)
        val reconciledSessions = timelineReconciler.reconcile(trackedEvents, windowStartMs, windowEndMs)
        if (reconciledSessions.isEmpty()) return@withContext

        val suppressionRules = SuppressionRules.fromConfig(config)
        val navigationSanitization = sanitizeNavigationSessions(reconciledSessions, suppressionRules)
        val sessions = navigationSanitization.sessions
        if (sessions.isEmpty()) return@withContext

        if (navigationSanitization.reassignedDurationMs > 0L || navigationSanitization.droppedDurationMs > 0L) {
            telemetry.onNavigationSanitization(
                UsageIngestionTelemetry.NavigationSanitization(
                    windowStartMs = windowStartMs,
                    windowEndMs = windowEndMs,
                    reassignedDurationMs = navigationSanitization.reassignedDurationMs,
                    droppedDurationMs = navigationSanitization.droppedDurationMs
                )
            )
        }

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
        // Also deduplicate near-duplicate sessions by merging any existing session that
        // overlaps or is contiguous for the same package. This prevents small timestamp
        // jitter from creating separate persisted sessions and causing overcounting.
        val existing = dao.sessionsIntersecting(windowStartMs, windowEndMs).toMutableList()

        val entitiesToPersist = mutableListOf<UsageSessionEntity>()
        for (entity in entities) {
            // Find an existing session for the same package that overlaps or is contiguous
            // within the merge gap (handled by mergePreservingTail semantics).
            val matchIdx = existing.indexOfFirst { it.packageName == entity.packageName &&
                !(it.endMs <= entity.startMs || it.startMs >= entity.endMs) }

            if (matchIdx == -1) {
                // No overlapping existing session; persist new
                entitiesToPersist += entity
                existing += entity
            } else {
                val matched = existing[matchIdx]
                mergePreservingTail(matched, entity)?.let { merged ->
                    entitiesToPersist += merged
                    existing[matchIdx] = merged
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
            buildBuckets(windowStartMs, windowEndMs, bucketSizeMs, sessions)
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
            buildBuckets(windowStartMs, windowEndMs, bucketSizeMs, sessions)
        }

    private fun buildBuckets(
        windowStartMs: Long,
        windowEndMs: Long,
        bucketSizeMs: Long,
        sessions: List<UsageSessionEntity>
    ): List<UsageBucket> {
        if (sessions.isEmpty()) return emptyList()

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
        return buckets
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

    private data class NavigationSanitizerResult(
        val sessions: List<UsageSession>,
        val reassignedDurationMs: Long,
        val droppedDurationMs: Long
    )

    private fun sanitizeNavigationSessions(
        sessions: List<UsageSession>,
        suppressionRules: SuppressionRules
    ): NavigationSanitizerResult {
        if (sessions.isEmpty()) {
            return NavigationSanitizerResult(emptyList(), 0L, 0L)
        }

        val navigationPackages = suppressionRules.navigationPackages
        if (navigationPackages.isEmpty()) {
            return NavigationSanitizerResult(sessions.sortedBy { it.startMs }, 0L, 0L)
        }

        var dropped = 0L
        val filtered = sessions
            .sortedBy { it.startMs }
            .filter { session ->
                if (navigationPackages.contains(session.packageName)) {
                    dropped += session.durationMs
                    false
                } else {
                    true
                }
            }

        val normalized = mergeSessionsByPackage(filtered)
        return NavigationSanitizerResult(normalized, reassignedDurationMs = 0L, droppedDurationMs = dropped)
    }

    private fun mergeSessionsByPackage(
        sessions: List<UsageSession>
    ): List<UsageSession> {
        if (sessions.isEmpty()) return sessions
        val mergeGapMs = config.mergeGap.toMillis().coerceAtLeast(0L)
        val ordered = sessions.sortedBy { it.startMs }
        val merged = mutableListOf<UsageSession>()
        for (session in ordered) {
            if (merged.isEmpty()) {
                merged += session
                continue
            }
            val tail = merged.last()
            if (tail.packageName == session.packageName && session.startMs - tail.endMs <= mergeGapMs) {
                merged[merged.lastIndex] = tail.copy(
                    startMs = minOf(tail.startMs, session.startMs),
                    endMs = maxOf(tail.endMs, session.endMs),
                    taskRootPackageName = tail.taskRootPackageName ?: session.taskRootPackageName
                )
            } else {
                merged += session
            }
        }
        return merged
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
