package com.niyaz.zario.data

import android.graphics.drawable.Drawable

data class AppUsageInfo(
    val packageName: String,
    val appName: String,
    val icon: Drawable?,
    val totalTimeMs: Long, // milliseconds
    val dailyAverageMs: Long, // milliseconds
    val isTarget: Boolean = false
)

sealed class TargetSelectionState {
    object Loading : TargetSelectionState()
    data class Success(val topApps: List<AppUsageInfo>) : TargetSelectionState()
    data class Error(val message: String) : TargetSelectionState()
} 