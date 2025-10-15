package com.niyaz.zario.usage

import android.app.usage.UsageEvents

/**
 * Foreground-relevant subset of [UsageEvents.Event] types, including OEM aliases.
 */
enum class UsageEventType(
    val primaryValue: Int,
    vararg val aliasValues: Int
) {
    MOVE_TO_FOREGROUND(
        UsageEvents.Event.MOVE_TO_FOREGROUND,
        UsageEvents.Event.ACTIVITY_RESUMED
    ),
    MOVE_TO_BACKGROUND(
        UsageEvents.Event.MOVE_TO_BACKGROUND,
        UsageEvents.Event.ACTIVITY_PAUSED
    ),
    USER_INTERACTION(UsageEvents.Event.USER_INTERACTION),
    SHORTCUT_INVOCATION(UsageEvents.Event.SHORTCUT_INVOCATION),
    STANDBY_BUCKET_CHANGED(UsageEvents.Event.STANDBY_BUCKET_CHANGED),
    SCREEN_INTERACTIVE(UsageEvents.Event.SCREEN_INTERACTIVE),
    SCREEN_NON_INTERACTIVE(UsageEvents.Event.SCREEN_NON_INTERACTIVE),
    KEYGUARD_SHOWN(UsageEvents.Event.KEYGUARD_SHOWN),
    KEYGUARD_HIDDEN(UsageEvents.Event.KEYGUARD_HIDDEN),
    CONFIGURATION_CHANGE(UsageEvents.Event.CONFIGURATION_CHANGE),
    FOREGROUND_SERVICE_START(UsageEvents.Event.FOREGROUND_SERVICE_START),
    FOREGROUND_SERVICE_STOP(UsageEvents.Event.FOREGROUND_SERVICE_STOP),
    ACTIVITY_STOPPED(UsageEvents.Event.ACTIVITY_STOPPED),
    DEVICE_SHUTDOWN(UsageEvents.Event.DEVICE_SHUTDOWN),
    DEVICE_STARTUP(UsageEvents.Event.DEVICE_STARTUP),
    UNKNOWN(-1);

    val allRawValues: IntArray = intArrayOf(primaryValue, *aliasValues)

    val rawValue: Int
        get() = primaryValue

    companion object {
        private val rawToType: Map<Int, UsageEventType> = buildMap {
            UsageEventType.entries.filterNot { it == UNKNOWN }.forEach { type ->
                type.allRawValues.forEach { value -> put(value, type) }
            }
        }

        private val trackedValues: Set<Int> = rawToType.keys

        fun fromRaw(value: Int): UsageEventType = rawToType[value] ?: UNKNOWN

        fun isTracked(value: Int): Boolean = value in trackedValues

        fun trackedRawValues(): IntArray = trackedValues.sorted().toIntArray()
    }

    val isForegroundOpenEvent: Boolean
        get() = this == MOVE_TO_FOREGROUND

    val isForegroundCloseEvent: Boolean
        get() = this == MOVE_TO_BACKGROUND || this == ACTIVITY_STOPPED

    val closesAllSessions: Boolean
        get() = this == DEVICE_SHUTDOWN || this == KEYGUARD_SHOWN || this == SCREEN_NON_INTERACTIVE
}
