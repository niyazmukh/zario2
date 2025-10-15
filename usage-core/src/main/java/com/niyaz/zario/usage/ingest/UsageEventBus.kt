package com.niyaz.zario.usage.ingest

import com.niyaz.zario.usage.ingest.model.TrackedEvent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch

/**
 * Central asynchronous bus distributing raw tracking events from lifecycle, screen, and
 * UsageStats sources. A hot [SharedFlow] is used to avoid back-pressure on UI threads while
 * keeping ordering guarantees.
 */
class UsageEventBus(
    private val scope: CoroutineScope,
    replay: Int = DEFAULT_REPLAY,
    extraBufferCapacity: Int = DEFAULT_BUFFER_CAPACITY
) {

    private val flow = MutableSharedFlow<TrackedEvent>(
        replay = replay,
        extraBufferCapacity = extraBufferCapacity,
        onBufferOverflow = BufferOverflow.DROP_OLDEST
    )

    fun publish(event: TrackedEvent) {
        if (!flow.tryEmit(event)) {
            scope.launch { flow.emit(event) }
        }
    }

    fun stream(): SharedFlow<TrackedEvent> = flow

    companion object {
        private const val DEFAULT_REPLAY = 0
        private const val DEFAULT_BUFFER_CAPACITY = 64
    }
}