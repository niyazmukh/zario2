package com.niyaz.zario.usage.tracking

import com.niyaz.zario.usage.UsageAggregationConfig
import com.niyaz.zario.usage.UsageEvent
import com.niyaz.zario.usage.ingest.TrackedEventSource
import com.niyaz.zario.usage.ingest.model.EventConfidence
import com.niyaz.zario.usage.ingest.model.ScreenStateEvent
import com.niyaz.zario.usage.ingest.model.TrackedEvent
import com.niyaz.zario.usage.ingest.model.TrackedSource
import com.niyaz.zario.usage.storage.UsageRawEventDao
import com.niyaz.zario.usage.storage.UsageRawEventEntity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CompositeTrackedEventSource @Inject constructor(
    private val usageEventSource: com.niyaz.zario.usage.UsageEventSource,
    private val rawEventDao: UsageRawEventDao,
    private val config: UsageAggregationConfig
) : TrackedEventSource {

    override suspend fun load(startMillis: Long, endMillis: Long): List<TrackedEvent> {
        val usage = usageEventSource.load(startMillis, endMillis).map(::fromUsage)
        val raw = rawEventDao.eventsBetween(startMillis, endMillis)
            .mapNotNull(::fromRaw)
            .filter(::shouldIncludeEvent)
        return (usage + raw).sortedBy { it.epochMillis }
    }

    private fun shouldIncludeEvent(event: TrackedEvent): Boolean {
        val suppressedPackages = config.suppressedTaskRootPackages
        val suppressedClasses = config.suppressedTaskRootClassNames

        val packageName = when (event) {
            is TrackedEvent.ActivityLifecycle -> event.packageName
            else -> null
        }
        if (packageName != null && packageName in suppressedPackages) {
            return false
        }

        val className = when (event) {
            is TrackedEvent.ActivityLifecycle -> event.activityClass
            else -> null
        }
        if (className != null && className in suppressedClasses) {
            return false
        }

        return true
    }

    private fun fromUsage(event: UsageEvent): TrackedEvent.UsageStats =
        TrackedEvent.UsageStats(
            epochMillis = event.timestampMs,
            confidence = EventConfidence.MEDIUM,
            packageName = event.packageName,
            type = event.type,
            backingEvent = event
        )

    private fun fromRaw(entity: UsageRawEventEntity): TrackedEvent? {
        val source = runCatching { TrackedSource.valueOf(entity.source) }.getOrElse { return null }
        val confidence = EventConfidence.values().getOrNull(entity.confidenceOrdinal) ?: EventConfidence.LOW
        return when (source) {
            TrackedSource.APP_LIFECYCLE -> null  // Legacy events ignored; AppLifecycle tracking removed
            TrackedSource.ACTIVITY_LIFECYCLE -> TrackedEvent.ActivityLifecycle(
                epochMillis = entity.timestampMs,
                confidence = confidence,
                packageName = entity.packageName ?: return null,
                activityClass = entity.activityClass ?: "",
                state = runCatching { com.niyaz.zario.usage.ingest.model.ActivityLifecycleState.valueOf(entity.state) }
                    .getOrDefault(com.niyaz.zario.usage.ingest.model.ActivityLifecycleState.PAUSED)
            )
            TrackedSource.SCREEN -> TrackedEvent.ScreenState(
                epochMillis = entity.timestampMs,
                confidence = confidence,
                state = runCatching { ScreenStateEvent.valueOf(entity.state) }
                    .getOrDefault(ScreenStateEvent.SCREEN_OFF)
            )
            TrackedSource.USAGE_STATS -> null
        }
    }
}