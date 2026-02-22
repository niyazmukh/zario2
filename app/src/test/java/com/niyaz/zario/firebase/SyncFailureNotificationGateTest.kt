package com.niyaz.zario.firebase

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SyncFailureNotificationGateTest {

    @Test
    fun `notifies once when threshold reached`() {
        val gate = SyncFailureNotificationGate(threshold = 3)

        assertFalse(gate.shouldNotify(attempts = 0))
        assertFalse(gate.shouldNotify(attempts = 2))

        assertTrue(gate.shouldNotify(attempts = 3))

        // Subsequent calls in the same run should not re-notify (even as attempts keep rising).
        assertFalse(gate.shouldNotify(attempts = 3))
        assertFalse(gate.shouldNotify(attempts = 10))
    }
}

