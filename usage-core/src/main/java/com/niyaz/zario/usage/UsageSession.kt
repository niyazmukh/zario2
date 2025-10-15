package com.niyaz.zario.usage

import java.time.Instant
import java.time.ZoneId
import java.time.ZonedDateTime

/**
 * Canonical foreground session derived from usage events.
 */
data class UsageSession(
    val packageName: String,
    val startMs: Long,
    val endMs: Long,
    val taskRootPackageName: String? = null
) {
    val durationMs: Long
        get() = (endMs - startMs).coerceAtLeast(0L)

    fun dayStartMs(zoneId: ZoneId): Long {
        val startInstant = Instant.ofEpochMilli(startMs)
        val startDateTime: ZonedDateTime = startInstant.atZone(zoneId)
        return startDateTime.toLocalDate().atStartOfDay(zoneId).toInstant().toEpochMilli()
    }
}
