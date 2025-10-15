package com.niyaz.zario.firebase

import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.withTimeout

/**
 * Default timeout for Firebase operations (30 seconds).
 * Prevents indefinite hangs on network issues.
 */
private const val FIREBASE_OPERATION_TIMEOUT_MS = 30_000L

/**
 * Executes a Firebase operation with a timeout. Throws [TimeoutCancellationException]
 * if the operation exceeds [FIREBASE_OPERATION_TIMEOUT_MS].
 */
suspend fun <T> withFirebaseTimeout(block: suspend () -> T): T {
    return withTimeout(FIREBASE_OPERATION_TIMEOUT_MS) {
        block()
    }
}
