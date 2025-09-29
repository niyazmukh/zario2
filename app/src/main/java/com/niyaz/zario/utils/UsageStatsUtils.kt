package com.niyaz.zario.utils

import android.app.usage.UsageEvents
import android.app.usage.UsageStatsManager
import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.util.Log
import com.niyaz.zario.Constants
import java.time.LocalDate
import java.time.ZoneId
import kotlin.math.max
import kotlin.math.min

object UsageStatsUtils {

	private const val TAG = "UsageStatsUtils"

	private const val MOVE_TO_FOREGROUND = 1
	private const val MOVE_TO_BACKGROUND = 2
	private const val DEVICE_SHUTDOWN = 26
	private const val DEVICE_STARTUP = 27

	private const val MERGE_GAP_MS = 60_000L

	private val zone: ZoneId
		get() = ZoneId.systemDefault()

	private val PACKAGE_EXCLUDE_LIST: Set<String> = setOf(
		"com.sec.android.app.launcher",
		"com.android.settings",
		"com.android.systemui",
		"com.google.android.packageinstaller",
		"com.google.android.permissioncontroller",
		"com.android.permissioncontroller",
		"com.sec.android.app.clockpackage",
		"com.sec.android.daemonapp",
		"com.niyaz.zario"
	)

	private val CATEGORY_HOME_VALUE: Int? = runCatching {
		ApplicationInfo::class.java.getDeclaredField("CATEGORY_HOME").getInt(null)
	}.getOrNull()

	private data class Event(
		val timestampMs: Long,
		val type: Int,
		val packageName: String
	)

	private data class UsagePeriod(
		val packageName: String,
		val startMs: Long,
		val endMs: Long
	) {
		val durationMs: Long
			get() = max(0L, endMs - startMs)
	}

	data class UsageSnapshot(
		val totalsByPackage: Map<String, Long>,
		val generatedAt: Long
	) {
		val totalUsageMs: Long = totalsByPackage.values.sum()
	}

	data class UsageBucket(
		val bucketStartMs: Long,
		val bucketEndMs: Long,
		val totalsByPackage: Map<String, Long>
	)

	private data class TotalsCache(
		val windowStartMs: Long,
		val windowEndMs: Long,
		val totals: Map<String, Long>,
		val generatedAt: Long
	)

	private const val CACHE_VALID_MS = 20_000L
	@Volatile private var currentDayCache: TotalsCache? = null
	private val cacheLock = Any()

	data class GlobalUsageSummary(
		val perDayUsageMs: List<Long>
	) {
		private val validValues: List<Long> = perDayUsageMs.filter { it > 0L }
		val validDayCount: Int = validValues.size
		val todayUsageMs: Long = perDayUsageMs.firstOrNull() ?: 0L
		val trailingAverageMs: Long = if (validValues.isEmpty()) 0L else validValues.sum() / validValues.size
	}

	fun getCumulativeForegroundTime(context: Context, packageName: String): Long {
		return computePackageUsageBetween(context, packageName, startOfTodayMillis(), System.currentTimeMillis())
	}

	fun getCurrentDayUsage(context: Context, packageName: String): Long {
		return getCurrentDayUsagePrecise(context, packageName)
	}

	fun currentActiveSession(
		context: Context,
		packageName: String,
		lookBackMs: Long = 5 * 60_000L,
		evaluationStartTime: Long? = null
	): Long {
		val manager = obtainUsageStatsManager(context) ?: return 0L
		val now = System.currentTimeMillis()
		val windowStart = max(0L, now - lookBackMs)

		val events = queryUsageEvents(manager, windowStart, now)
			.filter { it.packageName == packageName }
			.sortedBy { it.timestampMs }

		var activeStart: Long? = null
		for (event in events) {
			when (event.type) {
				MOVE_TO_FOREGROUND -> {
					val clamped = evaluationStartTime?.let { max(event.timestampMs, it) } ?: event.timestampMs
					activeStart = clamped
				}

				MOVE_TO_BACKGROUND -> {
					if (activeStart != null && event.timestampMs >= activeStart!!) {
						activeStart = null
					}
				}
			}
		}

		return activeStart?.let { max(0L, now - it) } ?: 0L
	}

	fun getCurrentDayUsagePrecise(context: Context, packageName: String): Long {
		return computePackageUsageBetween(context, packageName, startOfTodayMillis(), System.currentTimeMillis())
	}

	fun getCurrentDayScreenTimePrecise(context: Context): Long {
		return getCurrentDaySnapshot(context).totalUsageMs
	}

	fun getCurrentDaySnapshot(context: Context): UsageSnapshot {
		val now = System.currentTimeMillis()
		val totals = getCurrentDayTotalsCached(context, now)
		return UsageSnapshot(totalsByPackage = totals, generatedAt = now)
	}

	fun getUsageBuckets(
		context: Context,
		startMillis: Long,
		endMillis: Long,
		bucketSizeMillis: Long
	): List<UsageBucket> {
		require(bucketSizeMillis > 0L) { "bucketSizeMillis must be positive" }
		if (startMillis >= endMillis) return emptyList()

		val firstBucketStart = (startMillis / bucketSizeMillis) * bucketSizeMillis
		val buckets = mutableListOf<UsageBucket>()
		var cursor = firstBucketStart
		val upperBound = endMillis

		while (cursor < upperBound) {
			val actualStart = max(cursor, startMillis)
			val actualEnd = min(cursor + bucketSizeMillis, upperBound)
			if (actualStart >= actualEnd) {
				cursor += bucketSizeMillis
				continue
			}
			val totals = computeTotalsForWindow(context, actualStart, actualEnd)
			buckets += UsageBucket(
				bucketStartMs = cursor,
				bucketEndMs = actualEnd,
				totalsByPackage = totals
			)
			cursor += bucketSizeMillis
		}

		return buckets
	}

	fun computeTodayTotals(context: Context): Map<String, Long> {
		return getCurrentDaySnapshot(context).totalsByPackage
	}

	fun getGlobalUsageSummary(
		context: Context,
		days: Int = Constants.USAGE_ANALYSIS_DAYS
	): GlobalUsageSummary {
		val requestedDays = max(1, days)
		val now = System.currentTimeMillis()
		val perDay = mutableListOf<Long>()

		repeat(requestedDays) { index ->
			val (startMs, rawEndMs) = dayBounds(index.toLong())
			val endMs = if (index == 0) min(rawEndMs, now) else rawEndMs
			val totals = if (index == 0 && endMs == now) {
				getCurrentDaySnapshot(context).totalsByPackage
			} else {
				computeTotalsForWindowInternal(context, startMs, endMs)
			}
			perDay += totals.values.sum()
		}

		return GlobalUsageSummary(perDayUsageMs = perDay)
	}

	fun isTargetAppCurrentlyActive(
		context: Context,
		packageName: String,
		goalTimeMs: Long
	): Boolean {
		val currentForeground = getCurrentForegroundApp(context)
		if (currentForeground == packageName) {
			return true
		}

		val now = System.currentTimeMillis()
		val endOfDay = dayBounds(0L).second
		val minWindow = 5L * Constants.SECONDS_PER_MINUTE * Constants.MILLISECONDS_PER_SECOND
		val dynamicWindow = min(max(goalTimeMs, minWindow), max(0L, endOfDay - now))

		return currentActiveSession(context, packageName, dynamicWindow) > 0L
	}

	fun getCurrentForegroundApp(context: Context): String? {
		val manager = obtainUsageStatsManager(context) ?: return null
		val now = System.currentTimeMillis()
		val windowStart = max(0L, now - 60_000L)

		val periods = computeUsagePeriods(
			queryUsageEvents(manager, windowStart, now),
			windowStart,
			now
		)

		return periods
			.filter { it.endMs == now }
			.maxByOrNull { it.startMs }
			?.packageName
	}

	private fun computePackageUsageBetween(
		context: Context,
		packageName: String,
		windowStartMs: Long,
		windowEndMs: Long
	): Long {
		return computeTotalsForWindow(context, windowStartMs, windowEndMs)[packageName] ?: 0L
	}

	private fun computeTotalsForWindow(
		context: Context,
		windowStartMs: Long,
		windowEndMs: Long
	): Map<String, Long> {
		if (windowStartMs >= windowEndMs) {
			return emptyMap()
		}

		val startOfToday = startOfTodayMillis()
		val now = System.currentTimeMillis()
		return if (windowStartMs == startOfToday && windowEndMs >= now) {
			getCurrentDayTotalsCached(context, now)
		} else {
			computeTotalsForWindowInternal(context, windowStartMs, windowEndMs)
		}
	}

	private fun computeTotalsForWindowInternal(
		context: Context,
		windowStartMs: Long,
		windowEndMs: Long
	): Map<String, Long> {
		val manager = obtainUsageStatsManager(context) ?: return emptyMap()

		return try {
			val events = queryUsageEvents(manager, windowStartMs, windowEndMs)
			val periods = computeUsagePeriods(events, windowStartMs, windowEndMs)
			val merged = mergeAdjacent(periods, MERGE_GAP_MS)
			val totals = sumDurationsPerPackage(merged)
			filterUsageByPackage(context, totals)
		} catch (e: Exception) {
			Log.e(TAG, "Failed to compute totals for window", e)
			emptyMap()
		}
	}

	private fun getCurrentDayTotalsCached(
		context: Context,
		now: Long
	): Map<String, Long> {
		val windowStart = startOfTodayMillis()
		val cached = currentDayCache
		if (cached != null &&
			cached.windowStartMs == windowStart &&
			now - cached.windowEndMs <= CACHE_VALID_MS &&
			now - cached.generatedAt <= CACHE_VALID_MS
		) {
			return cached.totals
		}

		return synchronized(cacheLock) {
			val refreshed = currentDayCache
			if (refreshed != null &&
				refreshed.windowStartMs == windowStart &&
				now - refreshed.windowEndMs <= CACHE_VALID_MS &&
				now - refreshed.generatedAt <= CACHE_VALID_MS
			) {
				refreshed.totals
			} else {
				val totals = computeTotalsForWindowInternal(context, windowStart, now)
				currentDayCache = TotalsCache(
					windowStartMs = windowStart,
					windowEndMs = now,
					totals = totals,
					generatedAt = now
				)
				totals
			}
		}
	}

	private fun filterUsageByPackage(
		context: Context,
		rawTotals: Map<String, Long>
	): Map<String, Long> {
		if (rawTotals.isEmpty()) return rawTotals

		val packageManager = context.packageManager
		return buildMap {
			rawTotals.forEach { (packageName, duration) ->
				if (shouldIncludePackage(packageManager, packageName)) {
					put(packageName, duration)
				}
			}
		}
	}

	private fun shouldIncludePackage(
		packageManager: PackageManager,
		packageName: String
	): Boolean {
		if (packageName in PACKAGE_EXCLUDE_LIST) return false

		val appInfo = runCatching { packageManager.getApplicationInfo(packageName, 0) }.getOrNull()
		if (appInfo != null && CATEGORY_HOME_VALUE != null) {
			val category = runCatching { appInfo.category }.getOrNull()
			if (category == CATEGORY_HOME_VALUE) return false
		}

		return true
	}

	private fun queryUsageEvents(
		manager: UsageStatsManager,
		beginMillis: Long,
		endMillis: Long
	): List<Event> {
		val usageEvents = manager.queryEvents(beginMillis, endMillis)
		val result = mutableListOf<Event>()
		val reusable = UsageEvents.Event()

		while (usageEvents.hasNextEvent()) {
			usageEvents.getNextEvent(reusable)
			val pkg = reusable.packageName ?: continue
			result += Event(
				timestampMs = reusable.timeStamp,
				type = reusable.eventType,
				packageName = pkg
			)
		}

		return result
	}

	private fun computeUsagePeriods(
		events: List<Event>,
		windowStartMs: Long,
		windowEndMs: Long
	): List<UsagePeriod> {
		if (events.isEmpty()) {
			return emptyList()
		}

		val sorted = events.sortedBy { it.timestampMs }
		val openByPackage = mutableMapOf<String, Event>()
		val periods = mutableListOf<UsagePeriod>()

		sorted.forEach { event ->
			when (event.type) {
				MOVE_TO_FOREGROUND -> {
					val previous = openByPackage.put(event.packageName, event)
					if (previous != null) {
						periods += UsagePeriod(
							packageName = event.packageName,
							startMs = max(windowStartMs, previous.timestampMs),
							endMs = min(windowEndMs, event.timestampMs)
						)
						openByPackage[event.packageName] = event
					}
				}

				MOVE_TO_BACKGROUND -> {
					val startEvent = openByPackage.remove(event.packageName)
					if (startEvent != null) {
						periods += UsagePeriod(
							packageName = event.packageName,
							startMs = max(windowStartMs, startEvent.timestampMs),
							endMs = min(windowEndMs, event.timestampMs)
						)
					}
				}

				DEVICE_SHUTDOWN -> {
					val shutdownTs = min(windowEndMs, event.timestampMs)
					val iterator = openByPackage.entries.iterator()
					while (iterator.hasNext()) {
						val (_, startEvent) = iterator.next()
						periods += UsagePeriod(
							packageName = startEvent.packageName,
							startMs = max(windowStartMs, startEvent.timestampMs),
							endMs = shutdownTs
						)
						iterator.remove()
					}
				}

				DEVICE_STARTUP -> {
					// Ignored
				}

				else -> {
					// Ignored
				}
			}
		}

		openByPackage.values.forEach { startEvent ->
			periods += UsagePeriod(
				packageName = startEvent.packageName,
				startMs = max(windowStartMs, startEvent.timestampMs),
				endMs = windowEndMs
			)
		}

		return periods
	}

	private fun mergeAdjacent(periods: List<UsagePeriod>, gapMs: Long): List<UsagePeriod> {
		if (periods.isEmpty()) return periods

		val sorted = periods.sortedWith(compareBy<UsagePeriod> { it.packageName }.thenBy { it.startMs })
		val merged = mutableListOf<UsagePeriod>()
		var current = sorted.first()

		for (i in 1 until sorted.size) {
			val candidate = sorted[i]
			if (candidate.packageName == current.packageName && candidate.startMs - current.endMs <= gapMs) {
				current = UsagePeriod(
					packageName = current.packageName,
					startMs = min(current.startMs, candidate.startMs),
					endMs = max(current.endMs, candidate.endMs)
				)
			} else {
				merged += current
				current = candidate
			}
		}
		merged += current

		return merged
	}

	private fun sumDurationsPerPackage(periods: List<UsagePeriod>): Map<String, Long> {
		val totals = mutableMapOf<String, Long>()
		for (period in periods) {
			val existing = totals.getOrElse(period.packageName) { 0L }
			totals[period.packageName] = existing + period.durationMs
		}
		return totals
	}

	private fun obtainUsageStatsManager(context: Context): UsageStatsManager? {
		return try {
			context.getSystemService(Context.USAGE_STATS_SERVICE) as? UsageStatsManager
		} catch (e: Exception) {
			Log.e(TAG, "Unable to obtain UsageStatsManager", e)
			null
		}
	}

	private fun startOfTodayMillis(): Long {
		val today = LocalDate.now(zone)
		return today.atStartOfDay(zone).toInstant().toEpochMilli()
	}

	private fun dayBounds(offsetDays: Long): Pair<Long, Long> {
		val date = LocalDate.now(zone).minusDays(offsetDays)
		val start = date.atStartOfDay(zone).toInstant().toEpochMilli()
		val end = date.plusDays(1).atStartOfDay(zone).toInstant().toEpochMilli()
		return start to end
	}
}
