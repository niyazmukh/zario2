package com.niyaz.zario

/**
 * Central place for build-type conditionals. Prefer this over referencing
 * [BuildConfig.DEBUG] directly to keep debug guarding consistent.
 */
object BuildFlags {
    val isDebug: Boolean = BuildConfig.DEBUG
}
