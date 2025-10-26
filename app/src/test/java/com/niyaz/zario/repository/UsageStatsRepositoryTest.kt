package com.niyaz.zario.repository

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.niyaz.zario.core.usage.UsageStatsRepository
import com.niyaz.zario.usage.UsageAggregationConfig
import com.niyaz.zario.usage.UsageAggregationStore
import com.niyaz.zario.usage.UsageTimelineReconciler
import com.niyaz.zario.usage.UsageIngestionTelemetry
import com.niyaz.zario.usage.ingest.TrackedEventSource
import com.niyaz.zario.usage.ingest.UsageEventBus
import com.niyaz.zario.usage.ingest.model.ActivityLifecycleState
import com.niyaz.zario.usage.ingest.model.EventConfidence
import com.niyaz.zario.usage.ingest.model.TrackedEvent
import com.niyaz.zario.usage.tracking.DevicePolicyAdvisor
import com.niyaz.zario.usage.storage.UsageAggregationDatabase
import java.time.Clock
import java.time.Duration
import java.time.Instant
import java.time.ZoneId
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
@OptIn(ExperimentalCoroutinesApi::class)
class UsageStatsRepositoryTest {

    @Test
    fun `snapshot reflects ingested sessions and active package`() = runTest {
        val harness = RepositoryHarness(this)
        harness.use { repository, scope, _ ->
            advanceUntilIdle()

            val snapshot = repository.getSnapshot(forceRefresh = true)
            assertEquals(TimeUnit.MINUTES.toMillis(30), snapshot.totalUsageMs)
            assertEquals("com.example.app", repository.foregroundPackage.value)
            assertEquals(0, repository.refreshStatus.value.consecutiveFailures)
        }
    }

    @Test
    fun `getUsageBuckets returns persisted hourly totals`() = runTest {
        val harness = RepositoryHarness(this)
        harness.use { repository, scope, config ->
            advanceUntilIdle()

            val now = FIXED_NOW.toEpochMilli()
            val startOfDay = startOfDayForConfig(config)
            val buckets = repository.getUsageBuckets(startOfDay, now, TimeUnit.HOURS.toMillis(1))

            assertTrue(buckets.isNotEmpty())
            val firstBucket = buckets.first { it.bucketStartMs == startOfDay + TimeUnit.HOURS.toMillis(14) }
            assertEquals(TimeUnit.MINUTES.toMillis(30), firstBucket.totalsByPackage["com.example.app"])
        }
    }

    @Test
    fun `global summary tracks daily totals`() = runTest {
        val harness = RepositoryHarness(this)
        harness.use { repository, _, _ ->
            advanceUntilIdle()

            val summary = repository.getGlobalUsageSummary(3)
            assertEquals(TimeUnit.MINUTES.toMillis(30), summary.todayUsageMs)
            assertEquals(1, summary.validDayCount)
        }
    }

    @Test
    fun `cycle summary returns totals for requested day`() = runTest {
        val harness = RepositoryHarness(this)
        harness.use { repository, _, config ->
            advanceUntilIdle()

            val startOfDay = startOfDayForConfig(config)
            val summary = repository.getCycleSummary(startOfDay)

            assertEquals(startOfDay, summary.windowStartMs)
            assertEquals(TimeUnit.MINUTES.toMillis(30), summary.totalUsageMs)
        }
    }

    @Test
    fun `usage buckets include multiple cycles when range spans days`() = runTest {
        val previousCycleStart = FIXED_NOW.minus(Duration.ofDays(1)).atZone(ZoneId.of("UTC")).toInstant().toEpochMilli()
        val extraEvents = listOf(
            TrackedEvent.ActivityLifecycle(
                epochMillis = previousCycleStart + TimeUnit.HOURS.toMillis(9),
                confidence = EventConfidence.HIGH,
                packageName = "com.example.app",
                activityClass = "Main",
                state = ActivityLifecycleState.RESUMED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = previousCycleStart + TimeUnit.HOURS.toMillis(9) + TimeUnit.MINUTES.toMillis(20),
                confidence = EventConfidence.HIGH,
                packageName = "com.example.app",
                activityClass = "Main",
                state = ActivityLifecycleState.PAUSED
            )
        )

        val harness = RepositoryHarness(this, extraEvents = extraEvents)
        harness.use { repository, _, config ->
            advanceUntilIdle()

            val windowStart = startOfDayForConfig(config) - ONE_DAY_MS
            val buckets = repository.getUsageBuckets(
                windowStart,
                FIXED_NOW.toEpochMilli(),
                TimeUnit.HOURS.toMillis(1)
            )

            val previousHourStart = previousCycleStart + TimeUnit.HOURS.toMillis(9)
            val previousBucket = buckets.firstOrNull { it.bucketStartMs == previousHourStart }
            requireNotNull(previousBucket) { "Expected bucket for previous cycle hour" }
            assertEquals(
                TimeUnit.MINUTES.toMillis(20),
                previousBucket.totalsByPackage["com.example.app"]
            )
        }
    }

    private fun startOfDayForConfig(config: UsageAggregationConfig): Long {
        val zoneId = config.zoneId
        return FIXED_NOW.atZone(zoneId).toLocalDate().atStartOfDay(zoneId).toInstant().toEpochMilli()
    }

    private class RepositoryHarness(
        testScope: kotlinx.coroutines.test.TestScope,
        extraEvents: List<TrackedEvent> = emptyList()
    ) : AutoCloseable {
        private val dispatcher = StandardTestDispatcher(testScope.testScheduler)
        private val scope = CoroutineScope(SupervisorJob() + dispatcher)
        private val context: Context = ApplicationProvider.getApplicationContext()
        private val config = UsageAggregationConfig(
            mergeGap = Duration.ofMinutes(1),
            sliceDuration = Duration.ofHours(6),
            maxLookback = Duration.ofDays(7),
            zoneId = ZoneId.of("UTC"),
            clock = Clock.fixed(FIXED_NOW, ZoneId.of("UTC"))
        )
        private val eventBus = UsageEventBus(scope)
        private val fakeEventSource = QueueingTrackedEventSource()
        private val database: UsageAggregationDatabase = Room.inMemoryDatabaseBuilder(
            context,
            UsageAggregationDatabase::class.java
        ).allowMainThreadQueries().build()
        private val store = UsageAggregationStore(
            trackedEventSource = fakeEventSource,
            timelineReconciler = UsageTimelineReconciler(config),
            dao = database.usageSessionDao(),
            rawEventDao = database.usageRawEventDao(),
            config = config,
            telemetry = UsageIngestionTelemetry.NO_OP
        )
        private val devicePolicyAdvisor = object : DevicePolicyAdvisor() {
            override fun recommendedRefreshIntervalMillis(): Long = 10_000L
        }
        init {
            val initialEvents = mutableListOf<TrackedEvent>().apply {
                addAll(
                    listOf(
                        TrackedEvent.ActivityLifecycle(
                            epochMillis = FIXED_NOW.minusSeconds(1800).toEpochMilli(),
                            confidence = EventConfidence.HIGH,
                            packageName = "com.example.app",
                            activityClass = "Main",
                            state = ActivityLifecycleState.RESUMED
                        ),
                        TrackedEvent.ActivityLifecycle(
                            epochMillis = FIXED_NOW.toEpochMilli(),
                            confidence = EventConfidence.HIGH,
                            packageName = "com.example.app",
                            activityClass = "Main",
                            state = ActivityLifecycleState.PAUSED
                        )
                    )
                )
                addAll(extraEvents)
            }.sortedBy { it.epochMillis }
            fakeEventSource.enqueue(initialEvents)
        }
        val repository = UsageStatsRepository(store, config, eventBus, devicePolicyAdvisor, scope)

        suspend fun <R> use(block: suspend (UsageStatsRepository, CoroutineScope, UsageAggregationConfig) -> R): R {
            return try {
                block(repository, scope, config)
            } finally {
                close()
            }
        }

        override fun close() {
            database.close()
            scope.cancel()
        }

        private inner class QueueingTrackedEventSource : TrackedEventSource {
            private val events = ArrayDeque<List<TrackedEvent>>()

            fun enqueue(batch: List<TrackedEvent>) {
                events.addLast(batch)
            }

            override suspend fun load(startMillis: Long, endMillis: Long): List<TrackedEvent> {
                return if (events.isEmpty()) emptyList() else events.removeFirst()
            }
        }
    }

    companion object {
        private val FIXED_NOW: Instant = Instant.parse("2024-09-27T15:00:00Z")
        private val ONE_DAY_MS: Long = Duration.ofDays(1).toMillis()
    }
}

