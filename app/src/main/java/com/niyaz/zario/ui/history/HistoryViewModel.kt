package com.niyaz.zario.ui.history

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.niyaz.zario.Constants
import com.niyaz.zario.R
import com.niyaz.zario.core.usage.UsageStatsRepository
import com.niyaz.zario.data.User
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.repository.UserSessionRepository
import com.niyaz.zario.security.UserIdentity
import com.niyaz.zario.usage.UsageBucket
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.Locale
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.math.min

@HiltViewModel
class HistoryViewModel @Inject constructor(
    private val dao: EvaluationHistoryDao,
    private val userSessionRepository: UserSessionRepository,
    private val usageStatsRepository: UsageStatsRepository,
    @ApplicationContext private val appContext: Context
) : ViewModel() {

    private val zoneId: ZoneId = ZoneId.systemDefault()
    private val dateFormatter: DateTimeFormatter =
        DateTimeFormatter.ofPattern(Constants.HISTORY_DATE_FORMAT, Locale.getDefault())
    private val zeroDurationThresholdMs: Long = 0L

    private val _filterLabel = MutableStateFlow<String?>(null)
    val filterLabel: StateFlow<String?> = _filterLabel.asStateFlow()

    private val _uiState = MutableStateFlow(createInitialUiState())
    val uiState: StateFlow<UsageUiState> = _uiState.asStateFlow()

    private var latestBuckets: List<UsageBucket> = emptyList()
    private var latestAllAggregation: UsageAggregation = UsageAggregation(emptyHourlyBars(), emptyMap())

    @OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
    val history: Flow<List<com.niyaz.zario.data.local.entities.EvaluationHistoryEntry>> =
        combine(
            _filterLabel,
            userSessionRepository.session
        ) { label, session ->
            Triple(label, session.user?.id, session.user?.email)
        }.flatMapLatest { (label, userId, userEmail) ->
            val email = userEmail.orEmpty()
            val candidateIds = UserIdentity.candidateIds(userId, userEmail)
            val idsForQuery = if (candidateIds.isEmpty()) {
                if (email.isBlank()) emptyList() else listOf(EMPTY_ID_SENTINEL)
            } else {
                candidateIds
            }

            if (idsForQuery.isEmpty() && email.isBlank()) {
                flowOf(emptyList())
            } else {
                if (label.isNullOrEmpty()) {
                    dao.getAllForUser(idsForQuery.ifEmpty { listOf(EMPTY_ID_SENTINEL) }, email)
                } else {
                    dao.getByPlanLabelForUser(idsForQuery.ifEmpty { listOf(EMPTY_ID_SENTINEL) }, email, label)
                }
            }
        }

    init {
        observeDateRangeChanges()
        observeUserSession()
    }

    fun setFilter(label: String?) {
        _filterLabel.value = label
    }

    fun onDateRangeSelected(startUtcMillis: Long, endUtcMillis: Long) {
        val proposed = DateRange(
            start = epochMillisToLocalDate(startUtcMillis),
            end = epochMillisToLocalDate(endUtcMillis)
        ).normalize()

        val limits = _uiState.value.dateLimits
        val clamped = clampDateRange(proposed, limits)
        if (clamped != _uiState.value.dateRange) {
            _uiState.update { current ->
                current.copy(
                    dateRange = clamped,
                    dateLabel = formatDateRange(clamped)
                )
            }
        }
    }

    fun refreshCurrentRange() {
        viewModelScope.launch {
            refreshUsageForRange(_uiState.value.dateRange)
        }
    }

    fun togglePackageFilter(packageName: String) {
        val entries = _uiState.value.entries
        if (entries.none { it.packageName == packageName }) return

        val currentSelection = _uiState.value.selectedPackages
        val updatedSelection = if (currentSelection.contains(packageName)) {
            currentSelection - packageName
        } else {
            currentSelection + packageName
        }

        applyFilters(updatedSelection, _uiState.value.selectedHour)
    }

    fun toggleHourFilter(hour: Int) {
        val currentHour = _uiState.value.selectedHour
        val newHour = if (currentHour == hour) null else hour
        applyFilters(_uiState.value.selectedPackages, newHour)
    }

    fun resetFilters() {
        latestBuckets = emptyList()
        latestAllAggregation = UsageAggregation(emptyHourlyBars(), emptyMap())
        _uiState.value = createInitialUiState()
    }

    private fun observeDateRangeChanges() {
        viewModelScope.launch {
            uiState
                .map { it.dateRange }
                .distinctUntilChanged()
                .collect { range ->
                    refreshUsageForRange(range)
                }
        }
    }

    private fun observeUserSession() {
        viewModelScope.launch {
            userSessionRepository.session.collectLatest { session ->
                val limits = resolveDateLimits(session.user)
                val clampedRange = clampDateRange(_uiState.value.dateRange, limits)
                _uiState.update { current ->
                    current.copy(
                        dateLimits = limits,
                        dateRange = clampedRange,
                        dateLabel = formatDateRange(clampedRange)
                    )
                }
            }
        }
    }

    private suspend fun refreshUsageForRange(range: DateRange) {
        _uiState.update { it.copy(isLoading = true) }

        val startMillis = range.start.atStartOfDay(zoneId).toInstant().toEpochMilli()
        val endMillis = range.end.plusDays(1).atStartOfDay(zoneId).toInstant().toEpochMilli()

        val result = runCatching {
            usageStatsRepository.getUsageBuckets(
                startMillis,
                endMillis,
                USAGE_BUCKET_INTERVAL_MS
            )
        }

        result.onSuccess { buckets ->
            val baseAggregation = aggregateUsage(buckets, zoneId)
            val isTodayRange = isCurrentDay(range)
            val canonicalTotals = if (isTodayRange) {
                runCatching {
                    usageStatsRepository
                        .getDailySummary(LocalDate.now(zoneId), forceRefresh = true)
                        .totalsByPackage
                }.onFailure { error ->
                    Log.w(TAG, "Failed to obtain canonical daily totals; falling back to bucket aggregation", error)
                }.getOrElse { baseAggregation.packageTotals }
            } else {
                baseAggregation.packageTotals
            }

            val aggregation = if (isTodayRange) {
                baseAggregation.copy(packageTotals = canonicalTotals)
            } else {
                baseAggregation
            }

            latestBuckets = buckets
            latestAllAggregation = aggregation

            _uiState.update { current ->
                current.copy(
                    isLoading = false,
                    dateRange = range,
                    dateLabel = formatDateRange(range),
                    totalUsageMs = canonicalTotals.values.sum(),
                    selectedHour = null
                )
            }

            applyFilters(_uiState.value.selectedPackages, null)
        }.onFailure { error ->
            Log.e(TAG, "Failed to load usage for range", error)
            latestBuckets = emptyList()
            latestAllAggregation = UsageAggregation(emptyHourlyBars(), emptyMap())
            _uiState.update { current ->
                current.copy(
                    isLoading = false,
                    hourlyUsage = emptyHourlyBars(),
                    entries = emptyList(),
                    chartEmpty = true,
                    maxHourlyDurationMs = 0L,
                    selectedPackages = emptySet(),
                    selectedHour = null,
                    totalUsageMs = 0L
                )
            }
        }
    }

    private suspend fun resolveDateLimits(user: User?): DateRangeLimits {
        val today = LocalDate.now(zoneId)
        if (user == null) {
            return DateRangeLimits(
                min = today.minusDays(DEFAULT_LOOKBACK_DAYS.toLong()),
                max = today
            )
        }

        val earliestEpoch = withContext(Dispatchers.IO) {
            val candidateIds = UserIdentity.candidateIds(user.id, user.email)
            val idsForQuery = if (candidateIds.isEmpty()) listOf(EMPTY_ID_SENTINEL) else candidateIds
            dao.getAllForUser(idsForQuery, user.email).firstOrNull()
        }?.let { entries ->
            entries.minOfOrNull { entry ->
                min(entry.evaluationStartTime, entry.evaluationEndTime)
            }
        }

        val signupDate = earliestEpoch?.let { epoch ->
            Instant.ofEpochMilli(epoch).atZone(zoneId).toLocalDate()
        } ?: today

        val minCandidate = signupDate.minusDays(DEFAULT_LOOKBACK_DAYS.toLong())
        val clampedMin = if (minCandidate.isAfter(today)) today else minCandidate

        return DateRangeLimits(
            min = clampedMin,
            max = today
        )
    }

    private fun createInitialUiState(): UsageUiState {
        val today = LocalDate.now(zoneId)
        val defaultRange = DateRange(today, today)
        val defaultLimits = DateRangeLimits(
            min = today.minusDays(DEFAULT_LOOKBACK_DAYS.toLong()),
            max = today
        )

        return UsageUiState(
            isLoading = false,
            entries = emptyList(),
            hourlyUsage = emptyHourlyBars(),
            dateRange = defaultRange,
            dateLimits = defaultLimits,
            dateLabel = formatDateRange(defaultRange),
            chartEmpty = true,
            maxHourlyDurationMs = 0L,
            selectedPackages = emptySet(),
            selectedHour = null,
            totalUsageMs = 0L
        )
    }

    private fun formatDateRange(range: DateRange): String {
        return if (range.start == range.end) {
            appContext.getString(
                R.string.history_date_range_single,
                range.start.format(dateFormatter)
            )
        } else {
            appContext.getString(
                R.string.history_date_range_multi,
                range.start.format(dateFormatter),
                range.end.format(dateFormatter)
            )
        }
    }

    private fun packageTotalsForHour(hour: Int): Map<String, Long> {
        if (latestBuckets.isEmpty()) return emptyMap()
        val totals = mutableMapOf<String, Long>()
        latestBuckets.forEach { bucket ->
            val bucketHour = Instant.ofEpochMilli(bucket.bucketStartMs)
                .atZone(zoneId)
                .hour
            if (bucketHour == hour) {
                bucket.totalsByPackage.forEach { (packageName, duration) ->
                    if (duration > 0L) {
                        totals[packageName] = totals.getOrDefault(packageName, 0L) + duration
                    }
                }
            }
        }
        return totals
    }

    private fun resolveAppLabel(packageName: String): String {
        val packageManager = appContext.packageManager
        return runCatching {
            val applicationInfo = packageManager.getApplicationInfo(packageName, 0)
            packageManager.getApplicationLabel(applicationInfo).toString()
        }.getOrElse {
            packageName
        }
    }

    private fun clampDateRange(range: DateRange, limits: DateRangeLimits): DateRange {
        val start = if (range.start.isBefore(limits.min)) limits.min else range.start
        val end = if (range.end.isAfter(limits.max)) limits.max else range.end
        return DateRange(start, end).normalize()
    }

    private fun isCurrentDay(range: DateRange): Boolean {
        val today = LocalDate.now(zoneId)
        return range.start == today && range.end == today
    }

    private fun epochMillisToLocalDate(epochMillis: Long): LocalDate =
        Instant.ofEpochMilli(epochMillis).atZone(zoneId).toLocalDate()

    private fun emptyHourlyBars(): List<HourlyUsageBar> =
        List(HOURS_PER_DAY) { hour -> HourlyUsageBar(hour = hour, durationMs = 0L) }

    private fun applyFilters(selectedPackages: Set<String>, selectedHour: Int?) {
        val baseTotals = if (selectedHour != null) {
            packageTotalsForHour(selectedHour)
        } else {
            latestAllAggregation.packageTotals
        }

        val validPackageNames = baseTotals.keys

        val sanitizedSelection = selectedPackages.intersect(validPackageNames)

        val filteredTotals = if (sanitizedSelection.isNotEmpty()) {
            baseTotals.filterKeys { sanitizedSelection.contains(it) }
        } else {
            baseTotals
        }
        val entries = filteredTotals
            .filterValues { it > zeroDurationThresholdMs }
            .map { (packageName, duration) ->
                TodayUsageEntry(
                    packageName = packageName,
                    appLabel = resolveAppLabel(packageName),
                    durationMs = duration
                )
            }
            .sortedByDescending { it.durationMs }

        val aggregationForChart = if (sanitizedSelection.isNotEmpty()) {
            aggregateUsage(latestBuckets, zoneId, sanitizedSelection)
        } else {
            latestAllAggregation
        }

        val hasUsage = aggregationForChart.hourlyBars.any { it.durationMs > 0L }
        val isChartEmpty = !hasUsage
        val maxDurationForChart = if (hasUsage) MAX_BAR_DURATION_MS else 0L

        _uiState.update { current ->
            current.copy(
                entries = entries,
                hourlyUsage = aggregationForChart.hourlyBars,
                chartEmpty = isChartEmpty,
                maxHourlyDurationMs = maxDurationForChart,
                selectedPackages = sanitizedSelection,
                selectedHour = selectedHour
            )
        }
    }

    data class TodayUsageEntry(
        val packageName: String,
        val appLabel: String,
        val durationMs: Long,
        val isAggregate: Boolean = false
    )

    data class DateRange(
        val start: LocalDate,
        val end: LocalDate
    ) {
        fun normalize(): DateRange =
            if (start.isAfter(end)) DateRange(end, start) else this
    }

    data class DateRangeLimits(
        val min: LocalDate,
        val max: LocalDate
    )

    data class HourlyUsageBar(
        val hour: Int,
        val durationMs: Long
    )

    data class UsageUiState(
        val isLoading: Boolean,
        val entries: List<TodayUsageEntry>,
        val hourlyUsage: List<HourlyUsageBar>,
        val dateRange: DateRange,
        val dateLimits: DateRangeLimits,
        val dateLabel: String,
        val chartEmpty: Boolean,
        val maxHourlyDurationMs: Long,
        val selectedPackages: Set<String>,
        val selectedHour: Int?,
        val totalUsageMs: Long
    )

    companion object {
        const val HOURS_PER_DAY: Int = Constants.HOURS_PER_DAY
        private const val DEFAULT_LOOKBACK_DAYS = 6
        private val USAGE_BUCKET_INTERVAL_MS: Long = TimeUnit.HOURS.toMillis(1)
        private const val TAG = "HistoryViewModel"
        private val MAX_BAR_DURATION_MS: Long = TimeUnit.HOURS.toMillis(1)
        private const val EMPTY_ID_SENTINEL = "__none__"

        internal data class UsageAggregation(
            val hourlyBars: List<HourlyUsageBar>,
            val packageTotals: Map<String, Long>
        )
        internal fun aggregateUsage(
            buckets: List<UsageBucket>,
            zoneId: ZoneId,
            packageFilter: Set<String>? = null
        ): UsageAggregation {
            val hourTotals = LongArray(HOURS_PER_DAY)
            val packageTotals = mutableMapOf<String, Long>()
            val effectiveFilter = packageFilter?.takeIf { it.isNotEmpty() }
            buckets.forEach { bucket ->
                val hourOfDay = Instant.ofEpochMilli(bucket.bucketStartMs)
                    .atZone(zoneId)
                    .hour
                var bucketTotal = 0L
                bucket.totalsByPackage.forEach { (packageName, duration) ->
                    if (effectiveFilter == null || effectiveFilter.contains(packageName)) {
                        bucketTotal += duration
                        packageTotals[packageName] = packageTotals.getOrDefault(packageName, 0L) + duration
                    }
                }
                if (hourOfDay in 0 until HOURS_PER_DAY) {
                    hourTotals[hourOfDay] += bucketTotal
                }
            }
            val hourlyBars = List(HOURS_PER_DAY) { hour ->
                HourlyUsageBar(hour = hour, durationMs = hourTotals[hour])
            }
            return UsageAggregation(
                hourlyBars = hourlyBars,
                packageTotals = packageTotals
            )
        }
    }
    }