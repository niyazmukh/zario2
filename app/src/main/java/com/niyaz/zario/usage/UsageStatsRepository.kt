package com.niyaz.zario.core.usage

import android.util.Log
import com.niyaz.zario.di.ApplicationScope
import com.niyaz.zario.utils.UsageStatsUtils
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

/**
 * Centralised repository for screen-time usage snapshots. Ensures expensive
 * UsageStatsManager queries run at most once per [REFRESH_INTERVAL_MS] and
 * exposes cached values to workers and UI layers.
 */
@Singleton
class UsageStatsRepository @Inject constructor(
    private val usageStatsDataSource: UsageStatsDataSource,
    @ApplicationScope private val applicationScope: CoroutineScope
) {

    private val refreshMutex = Mutex()
    private val _snapshot = MutableStateFlow(UsageStatsUtils.UsageSnapshot(emptyMap(), 0L))
    val snapshot: StateFlow<UsageStatsUtils.UsageSnapshot> = _snapshot.asStateFlow()

    private val _foregroundPackage = MutableStateFlow<String?>(null)
    val foregroundPackage: StateFlow<String?> = _foregroundPackage.asStateFlow()

    private val _refreshStatus = MutableStateFlow(RefreshStatus())
    val refreshStatus: StateFlow<RefreshStatus> = _refreshStatus.asStateFlow()

    private var lastRefreshTimestamp = 0L

    init {
        applicationScope.launch { refreshInternal(force = true) }
    }

    suspend fun getSnapshot(forceRefresh: Boolean = false): UsageStatsUtils.UsageSnapshot {
        val now = System.currentTimeMillis()
        val cached = _snapshot.value
        val isFresh = lastRefreshTimestamp != 0L && now - lastRefreshTimestamp < REFRESH_INTERVAL_MS
        return if (!forceRefresh && isFresh) {
            cached
        } else {
            refreshInternal(forceRefresh)
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
    ): List<UsageStatsUtils.UsageBucket> {
        return usageStatsDataSource.getUsageBuckets(startMillis, endMillis, bucketSizeMillis)
    }

    fun requestRefresh(force: Boolean = false) {
        applicationScope.launch { refreshInternal(force) }
    }

    private suspend fun refreshInternal(force: Boolean = false): UsageStatsUtils.UsageSnapshot {
        return refreshMutex.withLock {
            val now = System.currentTimeMillis()
            val cached = _snapshot.value
            val shouldUseCache = !force && lastRefreshTimestamp != 0L &&
                now - lastRefreshTimestamp < REFRESH_INTERVAL_MS
            if (shouldUseCache) {
                return@withLock cached
            }

            val refreshedResult = runCatching { usageStatsDataSource.getCurrentDaySnapshot() }

            refreshedResult.onSuccess { snapshotFresh ->
                val foregroundResult = runCatching { usageStatsDataSource.getCurrentForegroundApp() }

                foregroundResult.onSuccess { pkg ->
                    _foregroundPackage.value = pkg
                }.onFailure { foregroundError ->
                    Log.w(TAG, "Failed to resolve foreground application", foregroundError)
                }

                lastRefreshTimestamp = now
                _snapshot.value = snapshotFresh
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

            refreshedResult.getOrElse {
                if (lastRefreshTimestamp == 0L) {
                    lastRefreshTimestamp = now
                }
                _snapshot.value
            }
        }
    }

    companion object {
        private val REFRESH_INTERVAL_MS = TimeUnit.SECONDS.toMillis(60)
        private const val TAG = "UsageStatsRepository"
    }

    data class RefreshStatus(
        val lastSuccessEpochMillis: Long? = null,
        val lastErrorEpochMillis: Long? = null,
        val lastErrorMessage: String? = null,
        val consecutiveFailures: Int = 0
    )
}
