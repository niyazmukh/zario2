package com.niyaz.zario.ui.history

import com.niyaz.zario.utils.UsageStatsUtils
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.concurrent.TimeUnit
import org.junit.Assert.assertEquals
import org.junit.Test

class HistoryViewModelTest {

    private val zoneId: ZoneId = ZoneId.of("UTC")

    @Test
    fun test_aggregateUsage__when_singleBucket__expect_hourTotalAssigned() {
        val start = LocalDateTime.of(2024, 9, 27, 8, 0).atZone(zoneId).toInstant().toEpochMilli()
        val bucket = UsageStatsUtils.UsageBucket(
            bucketStartMs = start,
            bucketEndMs = start + TimeUnit.HOURS.toMillis(1),
            totalsByPackage = mapOf(
                "com.example.app" to TimeUnit.MINUTES.toMillis(30)
            )
        )

        val result = HistoryViewModel.aggregateUsage(listOf(bucket), zoneId)

        assertEquals(24, result.hourlyBars.size)
        assertEquals(TimeUnit.MINUTES.toMillis(30), result.hourlyBars[8].durationMs)
        assertEquals(TimeUnit.MINUTES.toMillis(30), result.packageTotals["com.example.app"])
    }

    @Test
    fun test_aggregateUsage__when_multipleDaysSameHour__expect_valuesSummed() {
        val dayOne = LocalDateTime.of(2024, 9, 25, 21, 0).atZone(zoneId).toInstant().toEpochMilli()
        val dayTwo = LocalDateTime.of(2024, 9, 26, 21, 0).atZone(zoneId).toInstant().toEpochMilli()
        val bucketOne = UsageStatsUtils.UsageBucket(
            bucketStartMs = dayOne,
            bucketEndMs = dayOne + TimeUnit.HOURS.toMillis(1),
            totalsByPackage = mapOf("pkg.a" to TimeUnit.MINUTES.toMillis(20))
        )
        val bucketTwo = UsageStatsUtils.UsageBucket(
            bucketStartMs = dayTwo,
            bucketEndMs = dayTwo + TimeUnit.HOURS.toMillis(1),
            totalsByPackage = mapOf("pkg.a" to TimeUnit.MINUTES.toMillis(40))
        )

        val result = HistoryViewModel.aggregateUsage(listOf(bucketOne, bucketTwo), zoneId)

        assertEquals(TimeUnit.MINUTES.toMillis(60), result.hourlyBars[21].durationMs)
        assertEquals(TimeUnit.MINUTES.toMillis(60), result.packageTotals["pkg.a"])
    }

    @Test
    fun test_aggregateUsage__when_multiplePackages__expect_totalsPerPackage() {
        val start = LocalDateTime.of(2024, 9, 27, 14, 0).atZone(zoneId).toInstant().toEpochMilli()
        val bucket = UsageStatsUtils.UsageBucket(
            bucketStartMs = start,
            bucketEndMs = start + TimeUnit.HOURS.toMillis(1),
            totalsByPackage = mapOf(
                "pkg.alpha" to TimeUnit.MINUTES.toMillis(10),
                "pkg.beta" to TimeUnit.MINUTES.toMillis(5)
            )
        )

        val result = HistoryViewModel.aggregateUsage(listOf(bucket), zoneId)

        assertEquals(TimeUnit.MINUTES.toMillis(15), result.hourlyBars[14].durationMs)
        assertEquals(TimeUnit.MINUTES.toMillis(10), result.packageTotals["pkg.alpha"])
        assertEquals(TimeUnit.MINUTES.toMillis(5), result.packageTotals["pkg.beta"])
    }
}
