package com.niyaz.zario.utils

import android.content.Context
import com.niyaz.zario.Constants
import com.niyaz.zario.R
import java.util.concurrent.TimeUnit

/**
 * Utility class for consistent time formatting across the application.
 * Centralizes time formatting logic to eliminate code duplication.
 */
object TimeUtils {
    
    /**
     * Formats time in milliseconds to a human-readable string for UI display.
     * Used in RecyclerView adapters and detailed time displays.
     * 
     * @param timeInMillis Time in milliseconds
     * @return Formatted string (e.g., "2h 30m", "45m", "30s")
     */
    fun formatTimeForDisplay(context: Context, timeInMillis: Long): String {
        val hours = TimeUnit.MILLISECONDS.toHours(timeInMillis)
        val minutes = TimeUnit.MILLISECONDS.toMinutes(timeInMillis) % Constants.MINUTES_PER_HOUR
        val seconds = TimeUnit.MILLISECONDS.toSeconds(timeInMillis) % Constants.SECONDS_PER_MINUTE

        return when {
            hours > 0 -> context.getString(R.string.time_format_hours_minutes, hours, minutes)
            minutes > 0 -> context.getString(R.string.time_format_minutes_only, minutes)
            else -> context.getString(R.string.time_format_seconds_only, seconds)
        }
    }
    
    /**
     * Formats time in milliseconds to a concise string for goal summaries.
     * Used in goal calculation and summary displays.
     * 
     * @param timeInMillis Time in milliseconds
     * @return Formatted string (e.g., "2h 30m", "45m", "Less than 1m")
     */
    fun formatTimeForGoal(context: Context, timeInMillis: Long): String {
        val hours = timeInMillis / Constants.MS_TO_HOURS_DIVISOR
        val minutes = (timeInMillis % Constants.MS_TO_HOURS_DIVISOR) / Constants.MS_TO_MINUTES_DIVISOR
        
        return when {
            hours > 0 && minutes > 0 -> context.getString(R.string.time_format_hours_minutes, hours, minutes)
            hours > 0 -> context.getString(R.string.time_format_hours_only, hours)
            minutes > 0 -> context.getString(R.string.time_format_minutes_only, minutes)
            else -> context.getString(R.string.time_format_less_than_minute)
        }
    }
} 