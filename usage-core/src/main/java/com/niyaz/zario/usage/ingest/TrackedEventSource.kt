package com.niyaz.zario.usage.ingest

import com.niyaz.zario.usage.ingest.model.TrackedEvent

fun interface TrackedEventSource {
    suspend fun load(startMillis: Long, endMillis: Long): List<TrackedEvent>
}