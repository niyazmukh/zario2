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
import kotlinx.coroutines.launch

@Singleton
class UsageEventRecorder @Inject constructor(
    private val bus: UsageEventBus,
    private val rawEventDao: UsageRawEventDao,
    @ApplicationScope private val scope: CoroutineScope
) {

    fun publish(event: TrackedEvent) {
        bus.publish(event)
        scope.launch { persist(event) }
    }

    private suspend fun persist(event: TrackedEvent) {
        runCatching {
            rawEventDao.insertAll(listOf(event.toEntity()))
        }.onFailure { error ->
            Log.w(TAG, "Failed to persist tracked event", error)
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
    }
}