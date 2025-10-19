package com.niyaz.zario.usage

import com.niyaz.zario.usage.ingest.TrackedEventSource
import com.niyaz.zario.usage.ingest.model.ActivityLifecycleState
import com.niyaz.zario.usage.ingest.model.EventConfidence
import com.niyaz.zario.usage.ingest.model.TrackedEvent
import com.niyaz.zario.usage.storage.UsageRawEventDao
import com.niyaz.zario.usage.storage.UsageRawEventEntity
import com.niyaz.zario.usage.storage.UsageSessionDao
import com.niyaz.zario.usage.storage.UsageSessionEntity
import java.time.Clock
import java.time.Duration
import java.time.Instant
import java.time.ZoneId
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class UsageAggregationStoreTest {

    private val dispatcher = StandardTestDispatcher()
    private val zone = ZoneId.of("UTC")
    private val nowInstant = Instant.parse("2025-10-10T12:00:00Z")
    private lateinit var config: UsageAggregationConfig
    private lateinit var source: FakeTrackedEventSource
    private lateinit var dao: FakeUsageSessionDao
    private lateinit var rawDao: FakeUsageRawEventDao
    private lateinit var store: UsageAggregationStore

    @Before
    fun setUp() {
        config = UsageAggregationConfig(
            mergeGap = Duration.ofMinutes(1),
            clock = Clock.fixed(nowInstant, zone),
            zoneId = zone
        )
    dao = FakeUsageSessionDao()
    rawDao = FakeUsageRawEventDao()
    source = FakeTrackedEventSource()
    store = UsageAggregationStore(source, UsageTimelineReconciler(config), dao, rawDao, config)
    }

    @Test
    fun `ingest persists sessions and summarize aggregates durations`() = runTest(dispatcher) {
        val windowStart = nowInstant.minusSeconds(600).toEpochMilli()
        val windowEnd = nowInstant.toEpochMilli()
        val fakeEvents = listOf(
            TrackedEvent.ActivityLifecycle(
                epochMillis = windowStart + 10_000,
                confidence = EventConfidence.HIGH,
                packageName = "com.a",
                activityClass = "A",
                state = ActivityLifecycleState.RESUMED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = windowStart + 40_000,
                confidence = EventConfidence.HIGH,
                packageName = "com.a",
                activityClass = "A",
                state = ActivityLifecycleState.PAUSED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = windowStart + 50_000,
                confidence = EventConfidence.HIGH,
                packageName = "com.b",
                activityClass = "B",
                state = ActivityLifecycleState.RESUMED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = windowStart + 80_000,
                confidence = EventConfidence.HIGH,
                packageName = "com.b",
                activityClass = "B",
                state = ActivityLifecycleState.PAUSED
            )
        )
        source.events = fakeEvents

        store.ingestWindow(windowStart, windowEnd)

        val summary = store.summarize(windowStart, windowEnd)
    assertEquals("Totals: ${summary.totalsByPackage}", 2, summary.totalsByPackage.size)
        assertEquals(30_000L, summary.totalsByPackage.getValue("com.a"))
        assertEquals(30_000L, summary.totalsByPackage.getValue("com.b"))

        val dayStart = nowInstant.atZone(zone).toLocalDate().atStartOfDay(zone).toInstant().toEpochMilli()
        val buckets = store.hourlyBuckets(dayStart, Duration.ofMinutes(15).toMillis())
        assertEquals(96, buckets.size)
        assertEquals(30_000L, buckets.sumOf { it.totalsByPackage.getOrDefault("com.a", 0L) })
    }

    @Test
    fun `ingest splits cross day session into per cycle segments`() = runTest(dispatcher) {
        val previousDayStart = Instant.parse("2025-10-09T00:00:00Z").toEpochMilli()
        val currentDayStart = Instant.parse("2025-10-10T00:00:00Z").toEpochMilli()
        val windowStart = Instant.parse("2025-10-09T22:00:00Z").toEpochMilli()
        val windowEnd = Instant.parse("2025-10-10T02:00:00Z").toEpochMilli()
        val sessionStart = Instant.parse("2025-10-09T23:45:00Z").toEpochMilli()
        val sessionEnd = Instant.parse("2025-10-10T00:55:00Z").toEpochMilli()

        source.events = listOf(
            TrackedEvent.ActivityLifecycle(
                epochMillis = sessionStart,
                confidence = EventConfidence.HIGH,
                packageName = "com.chrome",
                activityClass = "TabbedActivity",
                state = ActivityLifecycleState.RESUMED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = sessionEnd,
                confidence = EventConfidence.HIGH,
                packageName = "com.chrome",
                activityClass = "TabbedActivity",
                state = ActivityLifecycleState.PAUSED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = sessionEnd,
                confidence = EventConfidence.HIGH,
                packageName = "com.chrome",
                activityClass = "TabbedActivity",
                state = ActivityLifecycleState.STOPPED
            )
        )

        store.ingestWindow(windowStart, windowEnd)

        val previousDaySummary = store.summarize(previousDayStart, currentDayStart)
        val currentDaySummary = store.summarize(currentDayStart, currentDayStart + Duration.ofDays(1).toMillis())

        assertEquals(900_000L, previousDaySummary.totalsByPackage.getValue("com.chrome"))
        assertEquals(3_300_000L, currentDaySummary.totalsByPackage.getValue("com.chrome"))
        val storedSegments = dao.sessionsIntersecting(windowStart, windowEnd)
        assertEquals(2, storedSegments.count { it.packageName == "com.chrome" })
        assertEquals(sessionStart, storedSegments.minOf { it.startMs })
        assertEquals(sessionEnd, storedSegments.maxOf { it.endMs })
    }

    @Test
    fun test_ingestWindow__when_existingSessionHasShorterTail__expectTailExtended() = runTest(dispatcher) {
        val windowStart = nowInstant.minusSeconds(300).toEpochMilli()
        val windowEnd = nowInstant.toEpochMilli()
        val sessionStart = windowStart + 10_000
        val existingEnd = sessionStart + 20_000
        val updatedEnd = sessionStart + 80_000
        val dayStart = Instant.ofEpochMilli(sessionStart)
            .atZone(zone)
            .toLocalDate()
            .atStartOfDay(zone)
            .toInstant()
            .toEpochMilli()

        dao.upsertAll(
            listOf(
                UsageSessionEntity(
                    packageName = "com.merge",
                    startMs = sessionStart,
                    endMs = existingEnd,
                    durationMs = existingEnd - sessionStart,
                    dayStartMs = dayStart,
                    taskRootPackageName = null
                )
            )
        )

        source.events = listOf(
            TrackedEvent.ActivityLifecycle(
                epochMillis = sessionStart,
                confidence = EventConfidence.HIGH,
                packageName = "com.merge",
                activityClass = "MergedActivity",
                state = ActivityLifecycleState.RESUMED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = updatedEnd,
                confidence = EventConfidence.HIGH,
                packageName = "com.merge",
                activityClass = "MergedActivity",
                state = ActivityLifecycleState.PAUSED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = updatedEnd,
                confidence = EventConfidence.HIGH,
                packageName = "com.merge",
                activityClass = "MergedActivity",
                state = ActivityLifecycleState.STOPPED
            )
        )

        store.ingestWindow(windowStart, windowEnd)

        val stored = dao.sessionsIntersecting(windowStart, windowEnd)
            .single { it.packageName == "com.merge" }

        assertEquals(sessionStart, stored.startMs)
        assertEquals(updatedEnd, stored.endMs)
        assertEquals(updatedEnd - sessionStart, stored.durationMs)
        assertEquals("MergedActivity", stored.taskRootPackageName)
    }

    /**
     * "Fake" indicates a simple in-memory test double that mimics the DAO contract without Room.
     */
    private class FakeUsageSessionDao : UsageSessionDao {
        private val storage = mutableListOf<UsageSessionEntity>()

        override suspend fun upsertAll(sessions: List<UsageSessionEntity>) {
            sessions.forEach { session ->
                storage.removeAll { it.packageName == session.packageName && it.startMs == session.startMs }
                storage += session
            }
        }

        override suspend fun sessionsIntersecting(windowStart: Long, windowEnd: Long): List<UsageSessionEntity> {
            return storage.filter { it.startMs < windowEnd && it.endMs > windowStart }
        }

        override suspend fun sessionsIntersectingForDay(
            dayStart: Long,
            windowStart: Long,
            windowEnd: Long
        ): List<UsageSessionEntity> {
            return storage
                .filter { it.dayStartMs == dayStart && it.startMs < windowEnd && it.endMs > windowStart }
                .sortedBy { it.startMs }
        }

        override suspend fun sessionsForDay(dayStart: Long): List<UsageSessionEntity> {
            return storage.filter { it.dayStartMs == dayStart }.sortedBy { it.startMs }
        }

        override suspend fun sessionContaining(timestamp: Long): UsageSessionEntity? {
            return storage
                .filter { it.startMs <= timestamp && it.endMs >= timestamp }
                .maxByOrNull { it.endMs }
        }

        override suspend fun purgeBefore(threshold: Long) {
            storage.removeAll { it.endMs < threshold }
        }

        override suspend fun count(): Int {
            return storage.size
        }
    }

    private class FakeTrackedEventSource : TrackedEventSource {
        var events: List<TrackedEvent> = emptyList()

        override suspend fun load(startMillis: Long, endMillis: Long): List<TrackedEvent> {
            return events.filter { it.epochMillis in startMillis until endMillis }
        }
    }

    private class FakeUsageRawEventDao : UsageRawEventDao {
        val events = mutableListOf<UsageRawEventEntity>()

        override suspend fun insertAll(events: List<UsageRawEventEntity>) {
            this.events += events
        }

        override suspend fun eventsBetween(start: Long, end: Long): List<UsageRawEventEntity> {
            return events.filter { it.timestampMs in start..end }
        }

        override suspend fun purgeBefore(cutoff: Long) {
            events.removeAll { it.timestampMs < cutoff }
        }
    }
}
