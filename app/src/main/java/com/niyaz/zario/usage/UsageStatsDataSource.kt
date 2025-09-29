package com.niyaz.zario.core.usage

import android.content.Context
import com.niyaz.zario.utils.UsageStatsUtils
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Abstraction around the platform UsageStats APIs so the repository can be tested
 * with lightweight fakes while production continues to hit the real system service.
 */
interface UsageStatsDataSource {
    suspend fun getCurrentDaySnapshot(): UsageStatsUtils.UsageSnapshot
    suspend fun getCurrentForegroundApp(): String?
    suspend fun getUsageBuckets(startMillis: Long, endMillis: Long, bucketSizeMillis: Long): List<UsageStatsUtils.UsageBucket>
}

@Singleton
class UsageStatsManagerDataSource @Inject constructor(
    @ApplicationContext private val context: Context
) : UsageStatsDataSource {

    override suspend fun getCurrentDaySnapshot(): UsageStatsUtils.UsageSnapshot =
        withContext(Dispatchers.IO) { UsageStatsUtils.getCurrentDaySnapshot(context) }

    override suspend fun getCurrentForegroundApp(): String? =
        withContext(Dispatchers.IO) { UsageStatsUtils.getCurrentForegroundApp(context) }

    override suspend fun getUsageBuckets(
        startMillis: Long,
        endMillis: Long,
        bucketSizeMillis: Long
    ): List<UsageStatsUtils.UsageBucket> =
        withContext(Dispatchers.IO) {
            UsageStatsUtils.getUsageBuckets(context, startMillis, endMillis, bucketSizeMillis)
        }
}
