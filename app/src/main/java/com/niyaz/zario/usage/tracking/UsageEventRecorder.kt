package com.niyaz.zario.usage.tracking

import android.util.Log
import com.niyaz.zario.di.ApplicationScope
import com.niyaz.zario.usage.ingest.UsageEventBus
import com.niyaz.zario.usage.ingest.model.TrackedEvent
import com.niyaz.zario.usage.storage.UsageRawEventDao
import com.niyaz.zario.usage.storage.UsageRawEventEntity
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

@Singleton
class UsageEventRecorder @Inject constructor(
    private val bus: UsageEventBus,
    private val rawEventDao: UsageRawEventDao,
    @ApplicationScope private val scope: CoroutineScope
) {

    fun publish(event: TrackedEvent) {
        bus.publish(event)
        scope.launch { enqueue(event) }
    }

    private val bufferLock = Mutex()
    private val pendingEntities = mutableListOf<UsageRawEventEntity>()
    private var pendingFlushJob: Job? = null

    private suspend fun enqueue(event: TrackedEvent) {
        val entity = event.toEntity()
        var flushImmediately = false

        bufferLock.withLock {
            pendingEntities += entity
            if (pendingEntities.size >= MAX_BUFFER_SIZE) {
                flushImmediately = true
                pendingFlushJob?.cancel()
                pendingFlushJob = null
            } else if (pendingFlushJob == null) {
                pendingFlushJob = scope.launch {
                    delay(FLUSH_WINDOW_MS)
                    flushBuffer()
                }
            }
        }

        if (flushImmediately) {
            flushBuffer()
        }
    }

    private suspend fun flushBuffer() {
        val batch: List<UsageRawEventEntity> = bufferLock.withLock {
            if (pendingEntities.isEmpty()) {
                pendingFlushJob = null
                emptyList()
            } else {
                val copy = pendingEntities.toList()
                pendingEntities.clear()
                pendingFlushJob = null
                copy
            }
        }

        if (batch.isEmpty()) return

        val writeResult = runCatching { rawEventDao.insertAll(batch) }
        if (writeResult.isFailure) {
            Log.w(TAG, "Failed to persist tracked events batch", writeResult.exceptionOrNull())
            bufferLock.withLock {
                // Prepend failed batch so it is retried on next flush without data loss.
                pendingEntities.addAll(0, batch)
                if (pendingFlushJob == null || !pendingFlushJob!!.isActive) {
                    pendingFlushJob = scope.launch {
                        delay(FLUSH_WINDOW_MS)
                        flushBuffer()
                    }
                }
            }
        }
    }

    private fun TrackedEvent.toEntity(): UsageRawEventEntity {
        val state = when (this) {
            is TrackedEvent.AppLifecycle -> state.name
            is TrackedEvent.ActivityLifecycle -> state.name
            is TrackedEvent.ScreenState -> state.name
            is TrackedEvent.UsageStats -> type.name
        }
        val packageName = when (this) {
            is TrackedEvent.AppLifecycle -> foregroundPackage
            is TrackedEvent.ActivityLifecycle -> packageName
            is TrackedEvent.ScreenState -> null
            is TrackedEvent.UsageStats -> packageName
        }
        val activityClass = when (this) {
            is TrackedEvent.ActivityLifecycle -> activityClass
            is TrackedEvent.UsageStats -> backingEvent.taskRootPackageName
            else -> null
        }
        return UsageRawEventEntity(
            timestampMs = epochMillis,
            source = source.name,
            packageName = packageName,
            activityClass = activityClass,
            state = state,
            confidenceOrdinal = confidence.ordinal,
            extras = extrasFor(this)
        )
    }

    private fun extrasFor(event: TrackedEvent): String? =
        when (event) {
            is TrackedEvent.UsageStats -> "instanceId=${event.backingEvent.instanceId ?: -1}"
            else -> null
        }

    companion object {
        private const val TAG = "UsageEventRecorder"
        private const val MAX_BUFFER_SIZE = 25
        private const val FLUSH_WINDOW_MS = 750L
    }
}