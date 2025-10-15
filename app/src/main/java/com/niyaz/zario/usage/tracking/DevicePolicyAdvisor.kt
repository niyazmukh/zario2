package com.niyaz.zario.usage.tracking

import android.os.Build
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
open class DevicePolicyAdvisor @Inject constructor() {

    open fun recommendedRefreshIntervalMillis(): Long = when (Build.MANUFACTURER.lowercase()) {
        "samsung" -> 30_000L
        "xiaomi", "redmi", "poco", "huawei", "honor" -> 20_000L
        else -> 60_000L
    }

    open fun requireForegroundService(): Boolean = when (Build.MANUFACTURER.lowercase()) {
        "xiaomi", "redmi", "poco", "huawei", "honor" -> true
        else -> false
    }
}