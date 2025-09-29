package com.niyaz.zario.ui.history

import com.niyaz.zario.utils.UsageStatsUtils
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.concurrent.TimeUnit
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class HistoryUsageAggregationEdgeCasesTest {

    private val zoneId: ZoneId = ZoneId.of("UTC")

    @Test
    fun `aggregateUsage returns zeroed bars when no buckets`() {
        val result = HistoryViewModel.aggregateUsage(emptyList(), zoneId)

        assertEquals(HistoryViewModel.HOURS_PER_DAY, result.hourlyBars.size)
        assertTrue(result.hourlyBars.all { it.durationMs == 0L })
        assertTrue(result.packageTotals.isEmpty())
    }

    @Test
    fun `aggregateUsage keeps zero valued packages without affecting bar totals`() {
        val start = LocalDateTime.of(2024, 9, 27, 10, 0).atZone(zoneId).toInstant().toEpochMilli()
        val bucket = UsageStatsUtils.UsageBucket(
            bucketStartMs = start,
            bucketEndMs = start + TimeUnit.HOURS.toMillis(1),
            totalsByPackage = mapOf(
                "pkg.alpha" to 0L,
                "pkg.beta" to TimeUnit.MINUTES.toMillis(45)
            )
        )

        val result = HistoryViewModel.aggregateUsage(listOf(bucket), zoneId)

        assertEquals(TimeUnit.MINUTES.toMillis(45), result.hourlyBars[10].durationMs)
        assertEquals(TimeUnit.MINUTES.toMillis(45), result.packageTotals["pkg.beta"])
        assertTrue("Zero-duration packages should remain zero", (result.packageTotals["pkg.alpha"] ?: 0L) == 0L)
    }

    @Test
    fun `aggregateUsage applies package filter`() {
        val start = LocalDateTime.of(2024, 9, 28, 9, 0).atZone(zoneId).toInstant().toEpochMilli()
        val bucket = UsageStatsUtils.UsageBucket(
            bucketStartMs = start,
            bucketEndMs = start + TimeUnit.HOURS.toMillis(1),
            totalsByPackage = mapOf(
                "pkg.alpha" to TimeUnit.MINUTES.toMillis(20),
                "pkg.beta" to TimeUnit.MINUTES.toMillis(40)
            )
        )

        val result = HistoryViewModel.aggregateUsage(listOf(bucket), zoneId, setOf("pkg.beta"))

        assertEquals(TimeUnit.MINUTES.toMillis(40), result.hourlyBars[9].durationMs)
        assertEquals(TimeUnit.MINUTES.toMillis(40), result.packageTotals["pkg.beta"])
        assertTrue(result.packageTotals["pkg.alpha"] == null)
    }
}
