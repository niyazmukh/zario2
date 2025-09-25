package com.niyaz.zario.utils

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.ZoneId
import java.time.ZonedDateTime

/**
 * Calendar utilities for evaluation cycle management using native Java 8 time APIs.
 * Provides functions to work with calendar day boundaries (00:00 to 23:59).
 * 
 * Uses system default timezone to ensure consistency with device locale.
 */
object CalendarUtils {
    
    /**
     * Gets the start of the current day (00:00:00.000) in milliseconds since epoch.
     * 
     * @return Timestamp for beginning of today (00:00:00.000)
     */
    fun getStartOfCurrentDay(): Long {
        return LocalDate.now()
            .atStartOfDay()
            .atZone(ZoneId.systemDefault())
            .toInstant()
            .toEpochMilli()
    }
    
    /**
     * Gets the end of the current day (23:59:59.999) in milliseconds since epoch.
     * 
     * @return Timestamp for end of today (23:59:59.999)
     */
    fun getEndOfCurrentDay(): Long {
        return LocalDate.now()
            .atTime(LocalTime.MAX) // 23:59:59.999999999
            .atZone(ZoneId.systemDefault())
            .toInstant()
            .toEpochMilli()
    }
    
    /**
     * Gets the start of a specific day (00:00:00.000) in milliseconds since epoch.
     * 
     * @param timestamp Any timestamp within the target day
     * @return Timestamp for beginning of that day (00:00:00.000)
     */
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
    
    /**
     * Gets the end of a specific day (23:59:59.999) in milliseconds since epoch.
     * 
     * @param timestamp Any timestamp within the target day
     * @return Timestamp for end of that day (23:59:59.999)
     */
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
    
    /**
     * Checks if a timestamp falls within the current calendar day.
     * 
     * @param timestamp Timestamp to check
     * @return true if timestamp is between 00:00:00 and 23:59:59 today
     */
    fun isWithinCurrentDay(timestamp: Long): Boolean {
        val startOfDay = getStartOfCurrentDay()
        val endOfDay = getEndOfCurrentDay()
        return timestamp in startOfDay..endOfDay
    }
    
    /**
     * Gets the duration of the current day in milliseconds.
     * Typically 24 hours, but accounts for DST transitions.
     * 
     * @return Duration from 00:00:00 to 23:59:59.999 today in milliseconds
     */
    fun getCurrentDayDurationMs(): Long {
        return getEndOfCurrentDay() - getStartOfCurrentDay()
    }
    
    /**
     * Gets the remaining time in the current day from now.
     * 
     * @return Milliseconds remaining until end of current day (23:59:59.999)
     */
    fun getTimeRemainingInCurrentDay(): Long {
        val now = System.currentTimeMillis()
        val endOfDay = getEndOfCurrentDay()
        return kotlin.math.max(0L, endOfDay - now)
    }
    
    /**
     * Gets the elapsed time since the start of the current day.
     * 
     * @return Milliseconds elapsed since 00:00:00.000 today
     */
    fun getTimeElapsedInCurrentDay(): Long {
        val now = System.currentTimeMillis()
        val startOfDay = getStartOfCurrentDay()
        return kotlin.math.max(0L, now - startOfDay)
    }
}