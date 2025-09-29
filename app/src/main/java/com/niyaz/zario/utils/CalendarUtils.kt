package com.niyaz.zario.utils

import java.time.Instant
import java.time.LocalDate
import java.time.LocalTime
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.temporal.ChronoUnit

object CalendarUtils {
    fun getStartOfCurrentDay(): Long {
        return LocalDate.now()
            .atStartOfDay()
            .atZone(ZoneId.systemDefault())
            .toInstant()
            .toEpochMilli()
    }

    fun getEndOfCurrentDay(): Long {
        return LocalDate.now()
            .atTime(LocalTime.MAX)
            .atZone(ZoneId.systemDefault())
            .toInstant()
            .toEpochMilli()
    }

    fun getStartOfDay(timestamp: Long): Long {
        return ZonedDateTime.ofInstant(
            java.time.Instant.ofEpochMilli(timestamp),
            ZoneId.systemDefault()
        ).toLocalDate()
            .atStartOfDay()
            .atZone(ZoneId.systemDefault())
            .toInstant()
            .toEpochMilli()
    }

    fun getEndOfDay(timestamp: Long): Long {
        return ZonedDateTime.ofInstant(
            java.time.Instant.ofEpochMilli(timestamp),
            ZoneId.systemDefault()
        ).toLocalDate()
            .atTime(LocalTime.MAX)
            .atZone(ZoneId.systemDefault())
            .toInstant()
            .toEpochMilli()
    }

    fun isSameDay(first: Long, second: Long): Boolean {
        val firstDate = ZonedDateTime.ofInstant(
            java.time.Instant.ofEpochMilli(first),
            ZoneId.systemDefault()
        ).toLocalDate()
        val secondDate = ZonedDateTime.ofInstant(
            java.time.Instant.ofEpochMilli(second),
            ZoneId.systemDefault()
        ).toLocalDate()
        return firstDate == secondDate
    }

    fun getStartOfNextDay(): Long {
        return LocalDate.now()
            .plusDays(1)
            .atStartOfDay()
            .atZone(ZoneId.systemDefault())
            .toInstant()
            .toEpochMilli()
    }

    fun getStartOfNextDay(timestamp: Long): Long {
        return ZonedDateTime.ofInstant(
            java.time.Instant.ofEpochMilli(timestamp),
            ZoneId.systemDefault()
        ).toLocalDate()
            .plusDays(1)
            .atStartOfDay()
            .atZone(ZoneId.systemDefault())
            .toInstant()
            .toEpochMilli()
    }

    fun getNextDayAtTime(timestamp: Long, hourOfDay: Int, minute: Int): Long {
        return ZonedDateTime.ofInstant(
            java.time.Instant.ofEpochMilli(timestamp),
            ZoneId.systemDefault()
        ).toLocalDate()
            .plusDays(1)
            .atTime(hourOfDay, minute)
            .atZone(ZoneId.systemDefault())
            .toInstant()
            .toEpochMilli()
    }

    fun getTimeUntilStartOfNextDay(): Long {
        val now = System.currentTimeMillis()
        val nextDayStart = getStartOfNextDay()
        return kotlin.math.max(0L, nextDayStart - now)
    }

    fun isWithinCurrentDay(timestamp: Long): Boolean {
        val startOfDay = getStartOfCurrentDay()
        val endOfDay = getEndOfCurrentDay()
        return timestamp in startOfDay..endOfDay
    }

    fun getCurrentDayDurationMs(): Long {
        return getEndOfCurrentDay() - getStartOfCurrentDay()
    }

    fun getTimeRemainingInCurrentDay(): Long {
        val now = System.currentTimeMillis()
        val endOfDay = getEndOfCurrentDay()
        return kotlin.math.max(0L, endOfDay - now)
    }

    fun getTimeElapsedInCurrentDay(): Long {
        val now = System.currentTimeMillis()
        val startOfDay = getStartOfCurrentDay()
        return kotlin.math.max(0L, now - startOfDay)
    }

    fun floorToHour(timestamp: Long): Long {
        val zoned = ZonedDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault())
        return zoned
            .truncatedTo(ChronoUnit.HOURS)
            .toInstant()
            .toEpochMilli()
    }

    fun nextHourStart(timestamp: Long): Long {
        val floored = floorToHour(timestamp)
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(floored), ZoneId.systemDefault())
            .plusHours(1)
            .toInstant()
            .toEpochMilli()
    }
}
