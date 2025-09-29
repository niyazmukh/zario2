package com.niyaz.zario.core.evaluation.storage

import com.niyaz.zario.utils.UsageStatsUtils
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class HourlyUsageMapperTest {

    @Test
    fun `map filters zero-usage buckets`() {
        val buckets = listOf(
            UsageStatsUtils.UsageBucket(
                bucketStartMs = 0L,
                bucketEndMs = 3_600_000L,
                totalsByPackage = mapOf(
                    "com.example.app" to 2_000L,
                    "com.example.zero" to 0L
                )
            ),
            UsageStatsUtils.UsageBucket(
                bucketStartMs = 3_600_000L,
                bucketEndMs = 7_200_000L,
                totalsByPackage = emptyMap()
            )
        )

        val entries = HourlyUsageMapper.map(
            userId = "user-id",
            userEmail = "user@example.com",
            planLabel = "Daily",
            cycleStartTime = 0L,
            buckets = buckets
        )

        assertEquals(1, entries.size)
        val entry = entries.first()
        assertEquals("user-id", entry.userId)
        assertEquals("com.example.app", entry.packageName)
        assertEquals(2_000L, entry.usageMs)
        assertEquals(0L, entry.hourStartTime)
        assertEquals(3_600_000L, entry.hourEndTime)
    }

    @Test
    fun `map returns empty list when userId blank`() {
        val buckets = listOf(
            UsageStatsUtils.UsageBucket(0L, 1L, mapOf("pkg" to 5L))
        )

        val entries = HourlyUsageMapper.map(
            userId = "",
            userEmail = "user@example.com",
            planLabel = "Daily",
            cycleStartTime = 0L,
            buckets = buckets
        )

        assertTrue(entries.isEmpty())
    }
}
