package com.niyaz.zario.usage

import android.app.usage.UsageEvents
import android.app.usage.UsageEventsQuery
import android.app.usage.UsageStatsManager
import android.os.Build
import android.util.Log
import java.lang.reflect.Method
import java.time.Duration
import kotlin.runCatching

/**
 * Loads UsageEvents from [UsageStatsManager] in deterministic slices and converts them into
 * immutable [UsageEvent] representations.
 */
open class UsageEventLoader(
    private val usageStatsManager: UsageStatsManager,
    private val config: UsageAggregationConfig,
    private val sdkIntProvider: () -> Int = { Build.VERSION.SDK_INT },
    private val filteredQueryInvoker: (UsageStatsManager, UsageEventsQuery) -> UsageEvents? = DEFAULT_FILTERED_QUERY,
    private val filteredQueryFactory: (Long, Long) -> UsageEventsQuery? = DEFAULT_FILTERED_QUERY_FACTORY,
    private val telemetry: UsageIngestionTelemetry = UsageIngestionTelemetry.NO_OP
) : UsageEventSource {

    override fun load(startMillis: Long, endMillis: Long): List<UsageEvent> {
        require(startMillis < endMillis) { "startMillis must be before endMillis" }

        val maxLookbackStart = endMillis - config.maxLookback.toMillis()
        val effectiveStart = maxOf(startMillis, maxLookbackStart)
        val sliceSize = config.sliceDuration.toMillis().coerceAtLeast(MIN_SLICE_MS)

        val reusableEvent = UsageEvents.Event()
        val results = mutableListOf<UsageEvent>()
        var cursor = effectiveStart
        var sliceCount = 0
        var totalEventsRead = 0
        var nullPackageDrops = 0
        var unknownTypeDrops = 0
        var emittedEvents = 0
        val suppressedPackageCounts = mutableMapOf<String, Int>()
        val suppressedClassCounts = mutableMapOf<String, Int>()
        
        // Enhanced telemetry tracking
        val droppedEvents = mutableListOf<UsageIngestionTelemetry.DroppedEvent>()
        val packageEventCounts = mutableMapOf<String, MutableMap<String, Int>>() // pkg -> (reason -> count)
        val packageEmittedCounts = mutableMapOf<String, Int>()

        while (cursor < endMillis) {
            sliceCount += 1
            val sliceEnd = minOf(endMillis, cursor + sliceSize)
            val events = queryEvents(cursor, sliceEnd)
            try {
                while (events.hasNextEvent()) {
                    events.getNextEvent(reusableEvent)
                    totalEventsRead += 1
                    val rawType = reusableEvent.eventType
                
                // Track even before type check
                val pkg = reusableEvent.packageName
                val taskRootPackage = extractTaskRootPackage(reusableEvent)
                val taskRootClass = extractTaskRootClass(reusableEvent)
                val instanceId = extractInstanceId(reusableEvent)
                
                if (!UsageEventType.isTracked(rawType)) {
                    unknownTypeDrops += 1
                    if (pkg != null) {
                        droppedEvents += UsageIngestionTelemetry.DroppedEvent(
                            timestampMs = reusableEvent.timeStamp,
                            packageName = pkg,
                            eventType = rawType,
                            taskRootPackageName = taskRootPackage,
                            taskRootClassName = taskRootClass,
                            dropReason = UsageIngestionTelemetry.DropReason.UNKNOWN_TYPE,
                            instanceId = instanceId
                        )
                        trackPackageDrop(packageEventCounts, pkg, "UNKNOWN_TYPE")
                    }
                    continue
                }

                if (pkg == null) {
                    Log.w(TAG, "Dropping event with null package (ts=${reusableEvent.timeStamp}, type=$rawType)")
                    nullPackageDrops += 1
                    droppedEvents += UsageIngestionTelemetry.DroppedEvent(
                        timestampMs = reusableEvent.timeStamp,
                        packageName = null,
                        eventType = rawType,
                        taskRootPackageName = taskRootPackage,
                        taskRootClassName = taskRootClass,
                        dropReason = UsageIngestionTelemetry.DropReason.NULL_PACKAGE,
                        instanceId = instanceId
                    )
                    continue
                }

                // Hybrid filtering + Attribution logic:
                // 1. For suppressed taskRoots (launcher, system UI): drop only if pkg == taskRoot
                // 2. For non-suppressed taskRoots: use taskRoot for attribution (matches Digital Wellbeing)
                // This fixes mis-attribution bugs where Play Store in game task was tracked as Play Store usage
                val taskRootInSuppressedPackages = taskRootPackage != null &&
                    taskRootPackage in config.suppressedTaskRootPackages
                val suppressedByPackage = taskRootInSuppressedPackages && pkg == taskRootPackage
                
                val suppressedByClass = !suppressedByPackage && taskRootClass != null &&
                    taskRootClass in config.suppressedTaskRootClassNames
                    
                if (suppressedByPackage || suppressedByClass) {
                    if (suppressedByPackage) {
                        suppressedPackageCounts.merge(taskRootPackage!!, 1, Int::plus)
                        droppedEvents += UsageIngestionTelemetry.DroppedEvent(
                            timestampMs = reusableEvent.timeStamp,
                            packageName = pkg,
                            eventType = rawType,
                            taskRootPackageName = taskRootPackage,
                            taskRootClassName = taskRootClass,
                            dropReason = UsageIngestionTelemetry.DropReason.SUPPRESSED_TASK_ROOT_PACKAGE,
                            instanceId = instanceId
                        )
                        trackPackageDrop(packageEventCounts, pkg, "SUPPRESSED_TASK_ROOT_PACKAGE")
                    }
                    if (suppressedByClass) {
                        suppressedClassCounts.merge(taskRootClass!!, 1, Int::plus)
                        droppedEvents += UsageIngestionTelemetry.DroppedEvent(
                            timestampMs = reusableEvent.timeStamp,
                            packageName = pkg,
                            eventType = rawType,
                            taskRootPackageName = taskRootPackage,
                            taskRootClassName = taskRootClass,
                            dropReason = UsageIngestionTelemetry.DropReason.SUPPRESSED_TASK_ROOT_CLASS,
                            instanceId = instanceId
                        )
                        trackPackageDrop(packageEventCounts, pkg, "SUPPRESSED_TASK_ROOT_CLASS")
                    }
                    continue
                }

                val type = UsageEventType.fromRaw(rawType)
                if (type == UsageEventType.UNKNOWN) continue

                // Attribution logic: Use taskRoot for non-suppressed taskRoots (matches Digital Wellbeing)
                // This ensures Play Store time in game task is attributed to the game, not Play Store
                val attributionPackage = if (taskRootPackage != null && 
                                            taskRootPackage !in config.suppressedTaskRootPackages) {
                    taskRootPackage  // Attribute to taskRoot (e.g., game gets Play Store time in its task)
                } else {
                    pkg  // Use actual package for suppressed/null taskRoots
                }

                    results += UsageEvent(
                        timestampMs = reusableEvent.timeStamp,
                        type = type,
                        packageName = attributionPackage,  // CHANGED: Use attribution logic
                        instanceId = instanceId,
                        taskRootPackageName = taskRootPackage,
                        taskRootClassName = taskRootClass
                    )
                    emittedEvents += 1
                    packageEmittedCounts.merge(attributionPackage, 1, Int::plus)  // CHANGED: Track attributed package
                }
            } finally {
                runCatching {
                    val closeMethod = events::class.java.methods.firstOrNull { method ->
                        method.name == "close" && method.parameterCount == 0
                    } ?: return@runCatching
                    closeMethod.invoke(events)
                }.onFailure { error ->
                    Log.w(TAG, "Failed to close UsageEvents", error)
                }
            }
            cursor = sliceEnd
        }

        val sorted = results.sortedBy { it.timestampMs }
        
        // Build per-package statistics
        val perPackageStats = buildPerPackageStats(packageEventCounts, packageEmittedCounts)
        
        telemetry.onIngestionResult(
            UsageIngestionTelemetry.Result(
                windowStartMs = effectiveStart,
                windowEndMs = endMillis,
                sliceCount = sliceCount,
                totalEventsRead = totalEventsRead,
                eventsEmitted = emittedEvents,
                suppressedTaskRootPackages = suppressedPackageCounts
                    .entries
                    .sortedByDescending { it.value }
                    .associate { it.key to it.value },
                suppressedTaskRootClassNames = suppressedClassCounts
                    .entries
                    .sortedByDescending { it.value }
                    .associate { it.key to it.value },
                nullPackageDrops = nullPackageDrops,
                unknownTypeDrops = unknownTypeDrops,
                droppedEvents = droppedEvents,
                perPackageStats = perPackageStats
            )
        )
        return sorted
    }

    private fun trackPackageDrop(
        packageEventCounts: MutableMap<String, MutableMap<String, Int>>,
        packageName: String,
        reason: String
    ) {
        packageEventCounts.getOrPut(packageName) { mutableMapOf() }.merge(reason, 1, Int::plus)
    }

    private fun buildPerPackageStats(
        packageEventCounts: Map<String, Map<String, Int>>,
        packageEmittedCounts: Map<String, Int>
    ): Map<String, UsageIngestionTelemetry.PackageDropStats> {
        val allPackages = (packageEventCounts.keys + packageEmittedCounts.keys).distinct()
        return allPackages.associateWith { pkg ->
            val droppedByReason = packageEventCounts[pkg] ?: emptyMap()
            val dropped = droppedByReason.values.sum()
            val emitted = packageEmittedCounts[pkg] ?: 0
            val total = dropped + emitted
            
            val dropReasons = droppedByReason.mapKeys { (reasonStr, _) ->
                when (reasonStr) {
                    "NULL_PACKAGE" -> UsageIngestionTelemetry.DropReason.NULL_PACKAGE
                    "UNKNOWN_TYPE" -> UsageIngestionTelemetry.DropReason.UNKNOWN_TYPE
                    "SUPPRESSED_TASK_ROOT_PACKAGE" -> UsageIngestionTelemetry.DropReason.SUPPRESSED_TASK_ROOT_PACKAGE
                    "SUPPRESSED_TASK_ROOT_CLASS" -> UsageIngestionTelemetry.DropReason.SUPPRESSED_TASK_ROOT_CLASS
                    else -> UsageIngestionTelemetry.DropReason.NOT_TRACKED_TYPE
                }
            }
            
            UsageIngestionTelemetry.PackageDropStats(
                packageName = pkg,
                totalEvents = total,
                droppedEvents = dropped,
                emittedEvents = emitted,
                dropReasons = dropReasons
            )
        }.filterValues { it.totalEvents > 0 }
    }

    protected open fun queryEvents(startMillis: Long, endMillis: Long): UsageEvents {
        if (config.enableFilteredEventQuery && sdkIntProvider() >= MIN_FILTERED_QUERY_API_LEVEL) {
            val query = try {
                filteredQueryFactory(startMillis, endMillis)
            } catch (error: Throwable) {
                Log.w(TAG, "Falling back to legacy queryEvents due to ${error.javaClass.simpleName}")
                null
            }
            if (query != null) {
                val result = try {
                    filteredQueryInvoker(usageStatsManager, query)
                } catch (error: Throwable) {
                    Log.w(TAG, "Falling back to legacy queryEvents due to ${error.javaClass.simpleName}")
                    null
                }
                if (result != null) {
                    return result
                }
                Log.w(TAG, "UsageStats returned null events for filtered query; falling back")
            }
        }
        return usageStatsManager.queryEvents(startMillis, endMillis)
    }

    private fun extractTaskRootPackage(event: android.app.usage.UsageEvents.Event): String? {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) return null
        return try {
            val method = EVENT_CLASS_METHODS.taskRootMethod ?: return null
            method.invoke(event) as? String
        } catch (_: Throwable) {
            null
        }
    }

    private fun extractTaskRootClass(event: android.app.usage.UsageEvents.Event): String? {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) return null
        return try {
            val method = EVENT_CLASS_METHODS.taskRootClassMethod ?: return null
            method.invoke(event) as? String
        } catch (_: Throwable) {
            null
        }
    }

    private fun extractInstanceId(event: android.app.usage.UsageEvents.Event): Int? {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) return null
        return try {
            val method = EVENT_CLASS_METHODS.instanceIdMethod ?: return null
            (method.invoke(event) as? Int) ?: (method.invoke(event) as? Number)?.toInt()
        } catch (_: Throwable) {
            null
        }
    }

    companion object {
        private val MIN_SLICE_MS: Long = Duration.ofHours(1).toMillis()
        private val TRACKED_EVENT_TYPES = UsageEventType.trackedRawValues()
    // Android 14 (API 34) added UsageStatsManager#queryEvents(UsageEventsQuery)
    private const val MIN_FILTERED_QUERY_API_LEVEL = 34
        private const val TAG = "UsageEventLoader"
        private val EVENT_CLASS_METHODS = EventMethods()
        private val FILTERED_QUERY_METHOD: Method? = runCatching {
            UsageStatsManager::class.java.getMethod("queryEvents", UsageEventsQuery::class.java)
        }.getOrNull()
        private val DEFAULT_FILTERED_QUERY: (UsageStatsManager, UsageEventsQuery) -> UsageEvents? =
            ::defaultFilteredQuery
        private val DEFAULT_FILTERED_QUERY_FACTORY: (Long, Long) -> UsageEventsQuery? =
            ::defaultFilteredQueryFactory

        private fun defaultFilteredQuery(
            manager: UsageStatsManager,
            query: UsageEventsQuery
        ): UsageEvents? {
            val method = FILTERED_QUERY_METHOD ?: return null
            return runCatching { method.invoke(manager, query) as? UsageEvents }.getOrNull()
        }

        private fun defaultFilteredQueryFactory(start: Long, end: Long): UsageEventsQuery? {
            return runCatching {
                UsageEventsQuery.Builder(start, end)
                    .setEventTypes(*TRACKED_EVENT_TYPES)
                    .build()
            }.getOrNull()
        }
    }

    private class EventMethods {
        val taskRootMethod = runCatching {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                android.app.usage.UsageEvents.Event::class.java.getMethod("getTaskRootPackageName")
            } else {
                null
            }
        }.getOrNull()

        val taskRootClassMethod = runCatching {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                android.app.usage.UsageEvents.Event::class.java.getMethod("getTaskRootClassName")
            } else {
                null
            }
        }.getOrNull()

        val instanceIdMethod = runCatching {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                android.app.usage.UsageEvents.Event::class.java.getMethod("getInstanceId")
            } else {
                null
            }
        }.getOrNull()
    }
}
