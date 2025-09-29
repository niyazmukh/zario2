package com.niyaz.zario.repository

import com.niyaz.zario.core.usage.UsageStatsDataSource
import com.niyaz.zario.core.usage.UsageStatsRepository
import com.niyaz.zario.utils.UsageStatsUtils
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runCurrent
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertSame
import org.junit.Assert.assertTrue
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class UsageStatsRepositoryTest {

    @Test
    fun `refresh succeeds and updates snapshot and foreground`() = runTest {
    val fakeDataSource = FakeUsageStatsDataSource()
        val expectedSnapshot = UsageStatsUtils.UsageSnapshot(mapOf("pkg" to 1_500L), generatedAt = 123L)
        fakeDataSource.enqueueSnapshot(Result.success(expectedSnapshot)) // init refresh
        fakeDataSource.enqueueForeground(Result.success("pkg"))

        val dispatcher = StandardTestDispatcher(testScheduler)
        val scope = CoroutineScope(SupervisorJob() + dispatcher)

        val repository = UsageStatsRepository(fakeDataSource, scope)
        try {
            runCurrent()
            val cached = repository.snapshot.value
            assertEquals(expectedSnapshot, cached)
            assertEquals("pkg", repository.foregroundPackage.value)
            assertEquals(0, repository.refreshStatus.value.consecutiveFailures)
            assertNotNull(repository.refreshStatus.value.lastSuccessEpochMillis)
        } finally {
            scope.cancel()
        }
    }

    @Test
    fun `refresh failure falls back to last snapshot and increments failure counter`() = runTest {
        val fakeDataSource = FakeUsageStatsDataSource()
        val initialSnapshot = UsageStatsUtils.UsageSnapshot(mapOf("pkg" to 600L), generatedAt = 999L)
        fakeDataSource.enqueueSnapshot(Result.success(initialSnapshot)) // init
        fakeDataSource.enqueueForeground(Result.success("pkg"))
        val dispatcher = StandardTestDispatcher(testScheduler)
        val scope = CoroutineScope(SupervisorJob() + dispatcher)

        val repository = UsageStatsRepository(fakeDataSource, scope)
        try {
            runCurrent()
            val cached = repository.snapshot.value
            assertEquals(initialSnapshot, cached)

            fakeDataSource.enqueueSnapshot(Result.failure(IllegalStateException("boom")))
            // Foreground fetch won't be invoked on snapshot failure, but enqueue a placeholder for clarity
            fakeDataSource.enqueueForeground(Result.success(null))

            val fallback = repository.getSnapshot(forceRefresh = true)
            assertEquals(initialSnapshot, fallback)
            assertEquals(1, repository.refreshStatus.value.consecutiveFailures)
            assertEquals("boom", repository.refreshStatus.value.lastErrorMessage)
        } finally {
            scope.cancel()
        }
    }

    @Test
    fun `initial failure returns empty snapshot when no cache available`() = runTest {
        val fakeDataSource = FakeUsageStatsDataSource()
        fakeDataSource.enqueueSnapshot(Result.failure(IllegalStateException("unavailable")))
        fakeDataSource.enqueueForeground(Result.success(null))

        val dispatcher = StandardTestDispatcher(testScheduler)
        val scope = CoroutineScope(SupervisorJob() + dispatcher)

        val repository = UsageStatsRepository(fakeDataSource, scope)
        try {
            runCurrent()
            val snapshot = repository.snapshot.value
            assertNotNull(snapshot)
            assertTrue(snapshot.totalsByPackage.isEmpty())
            assertEquals(1, repository.refreshStatus.value.consecutiveFailures)
            assertEquals("unavailable", repository.refreshStatus.value.lastErrorMessage)
        } finally {
            scope.cancel()
        }
    }

    @Test
    fun `getUsageBuckets delegates to data source`() = runTest {
        val fakeDataSource = FakeUsageStatsDataSource()
        val dispatcher = StandardTestDispatcher(testScheduler)
        val scope = CoroutineScope(SupervisorJob() + dispatcher)

        val expectedBuckets = listOf(
            UsageStatsUtils.UsageBucket(
                bucketStartMs = 0L,
                bucketEndMs = 60_000L,
                totalsByPackage = mapOf("pkg" to 2_000L)
            )
        )
        fakeDataSource.enqueueBuckets(Result.success(expectedBuckets))

        val repository = UsageStatsRepository(fakeDataSource, scope)
        try {
            runCurrent()
            val buckets = repository.getUsageBuckets(0L, 60_000L, 60_000L)
            assertSame(expectedBuckets, buckets)
        } finally {
            scope.cancel()
        }
    }

    private class FakeUsageStatsDataSource(
        private val defaultSnapshot: UsageStatsUtils.UsageSnapshot = UsageStatsUtils.UsageSnapshot(emptyMap(), 0L),
        private val defaultForeground: String? = null,
        private val defaultBuckets: List<UsageStatsUtils.UsageBucket> = emptyList()
    ) : UsageStatsDataSource {

        private val snapshotResults = ArrayDeque<Result<UsageStatsUtils.UsageSnapshot>>()
        private val foregroundResults = ArrayDeque<Result<String?>>()
    private val bucketResults = ArrayDeque<Result<List<UsageStatsUtils.UsageBucket>>>()

        fun enqueueSnapshot(result: Result<UsageStatsUtils.UsageSnapshot>) {
            snapshotResults.addLast(result)
        }

        fun enqueueForeground(result: Result<String?>) {
            foregroundResults.addLast(result)
        }

        fun enqueueBuckets(result: Result<List<UsageStatsUtils.UsageBucket>>) {
            bucketResults.addLast(result)
        }

        override suspend fun getCurrentDaySnapshot(): UsageStatsUtils.UsageSnapshot {
            val result = if (snapshotResults.isEmpty()) Result.success(defaultSnapshot) else snapshotResults.removeFirst()
            return result.getOrElse { throw it }
        }

        override suspend fun getCurrentForegroundApp(): String? {
            val result = if (foregroundResults.isEmpty()) Result.success(defaultForeground) else foregroundResults.removeFirst()
            return result.getOrElse { throw it }
        }

        override suspend fun getUsageBuckets(
            startMillis: Long,
            endMillis: Long,
            bucketSizeMillis: Long
        ): List<UsageStatsUtils.UsageBucket> {
            val result = if (bucketResults.isEmpty()) Result.success(defaultBuckets) else bucketResults.removeFirst()
            return result.getOrElse { throw it }
        }
    }
}
