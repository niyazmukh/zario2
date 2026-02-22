package com.niyaz.zario.firebase

/**
 * Ensures we don't spam failure notifications when multiple pending rows fail in the same sync run.
 *
 * The gate is intentionally in-memory: WorkManager already retries with backoff, and the user-facing
 * notification is posted with a fixed ID (so it can be updated/replaced).
 */
internal class SyncFailureNotificationGate(private val threshold: Int) {
    private var notified = false

    fun shouldNotify(attempts: Int): Boolean {
        if (notified || attempts < threshold) return false
        notified = true
        return true
    }
}

