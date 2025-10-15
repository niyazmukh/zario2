package com.niyaz.zario.core.usage

import android.util.Log
import com.niyaz.zario.BuildConfig
import com.niyaz.zario.di.ApplicationScope
import com.niyaz.zario.usage.UsageAggregationConfig
import com.niyaz.zario.usage.UsageAggregationStore
import com.niyaz.zario.usage.UsageBucket
import com.niyaz.zario.usage.UsageGlobalSummary
import com.niyaz.zario.usage.UsageSummary
import com.niyaz.zario.usage.ingest.UsageEventBus
import com.niyaz.zario.usage.ingest.model.ActivityLifecycleState
import com.niyaz.zario.usage.ingest.model.TrackedEvent
import com.niyaz.zario.usage.tracking.DevicePolicyAdvisor
import java.time.Duration
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

/**
 * Canonical interface to usage aggregation store ensuring cached summaries and active foreground app lookup.
 */
@Singleton
class UsageStatsRepository @Inject constructor(
    private val store: UsageAggregationStore,
    private val config: UsageAggregationConfig,
    private val eventBus: UsageEventBus,
    private val devicePolicyAdvisor: DevicePolicyAdvisor,
    @ApplicationScope private val applicationScope: CoroutineScope
) {

    private val refreshMutex = Mutex()
    private val _snapshot = MutableStateFlow(UsageSummary(0L, 0L, emptyMap()))
    val snapshot: StateFlow<UsageSummary> = _snapshot.asStateFlow()

    private val _foregroundPackage = MutableStateFlow<String?>(null)
    val foregroundPackage: StateFlow<String?> = _foregroundPackage.asStateFlow()

    private val _refreshStatus = MutableStateFlow(RefreshStatus())
    val refreshStatus: StateFlow<RefreshStatus> = _refreshStatus.asStateFlow()

    private var lastRefreshTimestamp: Long = 0L
    private var lastSnapshotDate: LocalDate? = null
    private val refreshIntervalMs: Long = devicePolicyAdvisor.recommendedRefreshIntervalMillis()

    init {
        applicationScope.launch {
            eventBus.stream().collect { event ->
                when (event) {
                    is TrackedEvent.ActivityLifecycle -> if (event.state == ActivityLifecycleState.RESUMED) {
                        _foregroundPackage.value = event.packageName
                    }
                    is TrackedEvent.Accessibility -> _foregroundPackage.value = event.packageName
                    else -> Unit
                }
            }
        }
        applicationScope.launch { refreshInternal(force = true) }
    }

    suspend fun getSnapshot(forceRefresh: Boolean = false): UsageSummary {
        val now = currentTime()
        val cached = _snapshot.value
        val isSameDay = lastSnapshotDate == LocalDate.ofInstant(Instant.ofEpochMilli(now), config.zoneId)
        val cacheAge = if (lastRefreshTimestamp != 0L) now - lastRefreshTimestamp else Long.MAX_VALUE
        val isFresh = isSameDay && lastRefreshTimestamp != 0L && cacheAge < refreshIntervalMs
        
        if (BuildConfig.DEBUG) {
            Log.d(TAG, "getSnapshot(forceRefresh=$forceRefresh) - cacheAge=${cacheAge}ms, isFresh=$isFresh, cached.totalMs=${cached.totalUsageMs}")
        }
        
        return refreshMutex.withLock {
            val latestNow = currentTime()
            val effectiveToday = LocalDate.ofInstant(Instant.ofEpochMilli(latestNow), config.zoneId)
            val latestCacheAge = if (lastRefreshTimestamp != 0L) latestNow - lastRefreshTimestamp else Long.MAX_VALUE
            val latestSameDay = lastSnapshotDate == effectiveToday
            val stillFresh = !forceRefresh && latestSameDay && lastRefreshTimestamp != 0L && latestCacheAge < refreshIntervalMs
            if (stillFresh) {
                if (BuildConfig.DEBUG) {
                    Log.d(TAG, "Returning CACHED snapshot (age=${latestCacheAge}ms)")
                }
                return@withLock _snapshot.value
            }

            val reason = if (forceRefresh) "forced" else "stale (age=${latestCacheAge}ms > ${refreshIntervalMs}ms)"
            if (BuildConfig.DEBUG) {
                Log.d(TAG, "Refreshing snapshot - reason: $reason")
            }
            refreshCurrentDayLocked(latestNow, effectiveToday)
        }
    }

    suspend fun getForegroundApp(forceRefresh: Boolean = false): String? {
        getSnapshot(forceRefresh)
        return _foregroundPackage.value
    }

    suspend fun getUsageBuckets(
        startMillis: Long,
        endMillis: Long,
        bucketSizeMillis: Long
    ): List<UsageBucket> {
        if (startMillis >= endMillis) return emptyList()
        val now = currentTime()
        val boundedStart = maxOf(startMillis, now - config.maxLookback.toMillis())
        val boundedEnd = minOf(endMillis, now)
        if (boundedStart >= boundedEnd) return emptyList()

        return refreshMutex.withLock {
            Log.d(TAG, "getUsageBuckets: ingesting window [${boundedStart} to ${boundedEnd}]")
            
            // Ingest events for the requested window
            store.ingestWindow(boundedStart, boundedEnd)
            
            // Calculate which day this query is for
            val zoneId = config.zoneId
            val rangeStart = LocalDate.ofInstant(Instant.ofEpochMilli(boundedStart), zoneId)
            val dayStart = rangeStart.atStartOfDay(zoneId).toInstant().toEpochMilli()
            
            // Invalidate cache if historical query overlaps with current day
            val today = LocalDate.ofInstant(Instant.ofEpochMilli(now), zoneId)
            val todayStart = today.atStartOfDay(zoneId).toInstant().toEpochMilli()
            if (boundedEnd > todayStart) {
                Log.d(TAG, "getUsageBuckets: invalidating cache due to overlap with current day")
                lastRefreshTimestamp = 0L
                lastSnapshotDate = null
            }
            
            // Use day-specific query to prevent cross-day contamination
            store.bucketsForDay(dayStart, boundedStart, boundedEnd, bucketSizeMillis)
        }
    }

    suspend fun getGlobalUsageSummary(days: Int): UsageGlobalSummary {
        val requestedDays = maxOf(1, days)
        val now = currentTime()
        val zoneId = config.zoneId
        val today = LocalDate.ofInstant(Instant.ofEpochMilli(now), zoneId)
        val earliestRequestedDay = today.minusDays((requestedDays - 1).toLong())
        val earliestStart = earliestRequestedDay.atStartOfDay(zoneId).toInstant().toEpochMilli()
        val boundedStart = maxOf(earliestStart, now - config.maxLookback.toMillis())

        store.ingestWindow(boundedStart, now)

        val perDay = mutableListOf<Long>()
        repeat(requestedDays) { offset ->
            val date = today.minusDays(offset.toLong())
            val dayStart = date.atStartOfDay(zoneId).toInstant().toEpochMilli()
            val dayEnd = date.plusDays(1).atStartOfDay(zoneId).toInstant().toEpochMilli()
            val effectiveEnd = if (offset == 0) minOf(dayEnd, now) else dayEnd
            val summary = store.summarize(dayStart, effectiveEnd)
            perDay += summary.totalUsageMs
        }
        return UsageGlobalSummary(perDay)
    }

    fun requestRefresh(force: Boolean = false) {
        applicationScope.launch {
            refreshMutex.withLock {
                val now = currentTime()
                val today = LocalDate.ofInstant(Instant.ofEpochMilli(now), config.zoneId)
                if (force) {
                    refreshCurrentDayLocked(now, today)
                } else {
                    val cacheAge = if (lastRefreshTimestamp != 0L) now - lastRefreshTimestamp else Long.MAX_VALUE
                    val isSameDay = lastSnapshotDate == today
                    if (!isSameDay || cacheAge >= refreshIntervalMs) {
                        refreshCurrentDayLocked(now, today)
                    }
                }
            }
        }
    }

    suspend fun purgeRawEventsBefore(cutoffMillis: Long) {
        refreshMutex.withLock { store.purgeRawEventsBefore(cutoffMillis) }
    }

    suspend fun getDailySummary(date: LocalDate, forceRefresh: Boolean = false): UsageSummary {
        val today = currentDate()
        return if (date == today) {
            getSnapshot(forceRefresh)
        } else {
            val dayStart = date.atStartOfDay(config.zoneId).toInstant().toEpochMilli()
            val endExclusive = dayStart + ONE_DAY_MS
            summarizeWindow(dayStart, endExclusive)
        }
    }

    private suspend fun refreshInternal(force: Boolean = false): UsageSummary = getSnapshot(force)

    private fun currentTime(): Long = config.clock.instant().toEpochMilli()

    private fun startOfDay(timestamp: Long, zoneId: ZoneId): Long {
        val instant = Instant.ofEpochMilli(timestamp)
        return LocalDate.ofInstant(instant, zoneId)
            .atStartOfDay(zoneId)
            .toInstant()
            .toEpochMilli()
    }

    private fun currentDate(): LocalDate = LocalDate.ofInstant(config.clock.instant(), config.zoneId)

    private suspend fun refreshCurrentDayLocked(now: Long, today: LocalDate): UsageSummary {
        val dayStart = startOfDay(now, config.zoneId)
        val boundedStart = maxOf(dayStart, now - config.maxLookback.toMillis())

        val refreshedResult = runCatching {
            Log.d(TAG, "refreshCurrentDayLocked: ingesting window [${dayStart} to ${now}]")
            store.ingestWindow(boundedStart, now)
            val purgeBefore = maxOf(0L, dayStart - config.maxLookback.toMillis())
            Log.d(TAG, "refreshCurrentDayLocked: purging sessions before $purgeBefore")
            store.purgeSessionsOlderThan(purgeBefore)
            val summary = store.summarize(dayStart, now)
            Log.d(TAG, "refreshCurrentDayLocked: summarize returned totalMs=${summary.totalUsageMs} (${summary.totalUsageMs/60000}min)")
            summary
        }

        refreshedResult.onSuccess { summary ->
            val foregroundResult = runCatching { store.foregroundPackageAt(now) }
            foregroundResult.onSuccess { pkg ->
                _foregroundPackage.value = pkg
            }.onFailure { error ->
                Log.w(TAG, "Failed to resolve foreground application", error)
            }

            lastRefreshTimestamp = now
            lastSnapshotDate = today
            _snapshot.value = summary
            _refreshStatus.value = RefreshStatus(lastSuccessEpochMillis = now)
        }.onFailure { error ->
            Log.e(TAG, "Failed to refresh usage snapshot", error)
            _refreshStatus.update { current ->
                current.copy(
                    lastErrorEpochMillis = now,
                    lastErrorMessage = error.message,
                    consecutiveFailures = current.consecutiveFailures + 1
                )
            }
        }

        return refreshedResult.getOrElse {
            if (lastRefreshTimestamp == 0L) {
                lastRefreshTimestamp = now
            }
            _snapshot.value
        }
    }

    private suspend fun summarizeWindow(windowStart: Long, windowEndExclusive: Long): UsageSummary {
        require(windowStart < windowEndExclusive) { "windowStart must be < windowEndExclusive" }
        return refreshMutex.withLock {
            val now = currentTime()
            val boundedStart = maxOf(windowStart, now - config.maxLookback.toMillis())
            val boundedEnd = minOf(windowEndExclusive, now)
            if (boundedStart >= boundedEnd) {
                return@withLock UsageSummary(windowStart, boundedEnd, emptyMap())
            }
            store.ingestWindow(boundedStart, boundedEnd)
            store.summarize(windowStart, boundedEnd)
        }
    }

    companion object {
        private const val TAG = "UsageStatsRepository"
        private val ONE_DAY_MS: Long = Duration.ofDays(1).toMillis()
    }

    data class RefreshStatus(
        val lastSuccessEpochMillis: Long? = null,
        val lastErrorEpochMillis: Long? = null,
        val lastErrorMessage: String? = null,
        val consecutiveFailures: Int = 0
    )
}
