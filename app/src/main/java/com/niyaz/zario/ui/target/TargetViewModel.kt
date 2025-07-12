package com.niyaz.zario.ui.target

import android.app.AppOpsManager
import android.app.Application
import android.app.usage.UsageStats
import android.app.usage.UsageStatsManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.UserManager
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.niyaz.zario.R
import com.niyaz.zario.Constants
import com.niyaz.zario.data.AppUsageInfo
import com.niyaz.zario.data.TargetSelectionState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class TargetViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    application: Application
) : ViewModel() {

    private val _state = MutableStateFlow<TargetSelectionState>(TargetSelectionState.Loading)
    val state: StateFlow<TargetSelectionState> = _state.asStateFlow()

    fun fetchUsageData(context: Context) {
        viewModelScope.launch {
            try {
                _state.value = TargetSelectionState.Loading
                Log.d(TAG, "Starting usage data fetch")
                
                if (!hasUsageStatsPermission(context)) {
                    Log.w(TAG, "No usage stats permission")
                    _state.value = TargetSelectionState.Error(
                        this@TargetViewModel.context.getString(R.string.usage_stats_permission_required)
                    )
                    return@launch
                }

                val result = withContext(Dispatchers.IO) {
                    fetchTopUsedApps(context)
                }

                if (result.isNotEmpty()) {
                    Log.d(TAG, "Found ${result.size} top apps")
                    _state.value = TargetSelectionState.Success(result)
                } else {
                    Log.w(TAG, "No apps found with sufficient usage")
                    _state.value = TargetSelectionState.Error(
                        this@TargetViewModel.context.getString(R.string.usage_stats_no_data_available)
                    )
                }

            } catch (e: Exception) {
                Log.e(TAG, "Error fetching usage data", e)
                _state.value = TargetSelectionState.Error(
                    this@TargetViewModel.context.getString(R.string.usage_stats_fetch_failed, e.message ?: this@TargetViewModel.context.getString(R.string.debug_unknown_error))
                )
            }
        }
    }

    private suspend fun fetchTopUsedApps(context: Context): List<AppUsageInfo> {
        return withContext(Dispatchers.IO) {
            try {
                val usageStatsManager = context.getSystemService(Context.USAGE_STATS_SERVICE) as UsageStatsManager
                val packageManager = context.packageManager
                
                // Get usage stats for the last 7 days
                val endTime = System.currentTimeMillis()
                val startTime = endTime - (Constants.USAGE_ANALYSIS_DAYS * Constants.HOURS_PER_DAY * Constants.MINUTES_PER_HOUR * Constants.SECONDS_PER_MINUTE * Constants.MILLISECONDS_PER_SECOND)
                
                val startDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), ZoneId.systemDefault())
                val endDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), ZoneId.systemDefault())
                val formatter = DateTimeFormatter.ofPattern(Constants.DATE_TIME_FORMAT)
                
                Log.d(TAG, "Fetching usage stats from ${startDateTime.format(formatter)} to ${endDateTime.format(formatter)}")
                
                // Use INTERVAL_DAILY for more accurate data
                val usageStatsList = usageStatsManager.queryUsageStats(
                    UsageStatsManager.INTERVAL_DAILY,
                    startTime,
                    endTime
                )
                
                if (usageStatsList.isNullOrEmpty()) {
                    Log.w(TAG, "No usage stats returned")
                    return@withContext emptyList()
                }
                
                Log.d(TAG, "Raw usage stats: ${usageStatsList.size} entries")
                
                // Group by package and sum up usage
                val packageUsageMap = mutableMapOf<String, Long>()
                
                for (stats in usageStatsList) {
                    val packageName = stats.packageName
                    val totalTime = stats.totalTimeInForeground
                    
                    if (totalTime > 0) {
                        packageUsageMap[packageName] = (packageUsageMap[packageName] ?: 0) + totalTime
                    }
                }
                
                Log.d(TAG, "Total packages with usage: ${packageUsageMap.size}")
                
                // Filter and convert to AppUsageInfo
                val appUsageList = mutableListOf<AppUsageInfo>()
                
                for ((packageName, totalTime) in packageUsageMap) {
                    try {
                        // Skip our own app
                        if (packageName == context.packageName) {
                            Log.v(TAG, "Skipping own app: $packageName")
                            continue
                        }
                        
                        // Filter apps with minimal usage (less than 1 minute)
                        if (totalTime < Constants.MIN_USAGE_THRESHOLD_MS) {
                            Log.v(TAG, "Skipping low usage app: $packageName (${totalTime}ms)")
                            continue
                        }
                        
                        // Check if app is installed and user-accessible
                        val appInfo = try {
                            packageManager.getApplicationInfo(packageName, 0)
                        } catch (e: PackageManager.NameNotFoundException) {
                            Log.v(TAG, "App not found: $packageName")
                            continue
                        }
                        
                        // Filter system apps that users don't typically interact with
                        if (isSystemOnlyApp(appInfo, packageManager)) {
                            Log.v(TAG, "Skipping system-only app: $packageName")
                            continue
                        }
                        
                        // Skip launcher apps (home screen apps)
                        if (isLauncherApp(packageManager, packageName)) {
                            Log.v(TAG, "Skipping launcher app: $packageName")
                            continue
                        }
                        
                        // Get app name and icon
                        val appName = try {
                            packageManager.getApplicationLabel(appInfo).toString()
                        } catch (e: Exception) {
                            packageName
                        }
                        
                        val appIcon = try {
                            packageManager.getApplicationIcon(appInfo)
                        } catch (e: Exception) {
                            Log.w(TAG, "Failed to get icon for $packageName")
                            continue
                        }
                        
                        val dailyAverage = totalTime / Constants.USAGE_ANALYSIS_DAYS
                        
                        appUsageList.add(
                            AppUsageInfo(
                                packageName = packageName,
                                appName = appName,
                                icon = appIcon,
                                totalTimeMs = totalTime,
                                dailyAverageMs = dailyAverage
                            )
                        )
                        
                        Log.v(TAG, "Added app: $appName (${totalTime}ms total, ${dailyAverage}ms avg)")
                        
                    } catch (e: Exception) {
                        Log.w(TAG, "Error processing app $packageName", e)
                    }
                }
                
                // Sort by total time and take top 3
                val topApps = appUsageList
                    .sortedByDescending { it.totalTimeMs }
                    .take(Constants.TOP_APPS_COUNT)
                
                Log.d(TAG, "Top ${topApps.size} apps:")
                topApps.forEachIndexed { index, app ->
                    Log.d(TAG, "${index + 1}. ${app.appName}: ${app.totalTimeMs}ms (${app.totalTimeMs / Constants.MILLISECONDS_PER_SECOND / Constants.SECONDS_PER_MINUTE} min)")
                }
                
                return@withContext topApps
                
            } catch (e: Exception) {
                Log.e(TAG, "Error in fetchTopUsedApps", e)
                throw e
            }
        }
    }
    
    private fun isSystemOnlyApp(appInfo: android.content.pm.ApplicationInfo, packageManager: PackageManager): Boolean {
        try {
            // Allow apps that have been updated (likely user apps even if system)
            if ((appInfo.flags and android.content.pm.ApplicationInfo.FLAG_UPDATED_SYSTEM_APP) != 0) {
                return false
            }
            
            // Check if app has a launcher activity (user-accessible)
            val launchIntent = packageManager.getLaunchIntentForPackage(appInfo.packageName)
            if (launchIntent != null) {
                return false // Has launcher activity, likely user app
            }
            
            // System apps without launcher activity are likely system-only
            if ((appInfo.flags and android.content.pm.ApplicationInfo.FLAG_SYSTEM) != 0) {
                return true
            }
            
            return false
            
        } catch (e: Exception) {
            Log.w(TAG, "Error checking app type for ${appInfo.packageName}", e)
            return true // Be conservative, exclude if unsure
        }
    }
    
    private fun isLauncherApp(packageManager: PackageManager, packageName: String): Boolean {
        try {
            // Check if app handles HOME intent (launcher apps)
            val homeIntent = Intent(Intent.ACTION_MAIN).apply {
                addCategory(Intent.CATEGORY_HOME)
                addCategory(Intent.CATEGORY_DEFAULT)
            }
            
            val resolveInfoList = packageManager.queryIntentActivities(homeIntent, 0)
            return resolveInfoList.any { it.activityInfo.packageName == packageName }
            
        } catch (e: Exception) {
            Log.w(TAG, "Error checking launcher app for $packageName", e)
            return false
        }
    }

    private fun hasUsageStatsPermission(context: Context): Boolean {
        val appOpsManager = context.getSystemService(Context.APP_OPS_SERVICE) as AppOpsManager
        val mode = appOpsManager.checkOpNoThrow(
            AppOpsManager.OPSTR_GET_USAGE_STATS,
            android.os.Process.myUid(),
            context.packageName
        )
        
        val hasPermission = mode == AppOpsManager.MODE_ALLOWED
        Log.d(TAG, "Usage stats permission: $hasPermission")
        return hasPermission
    }

    companion object {
        private const val TAG = Constants.LOG_TAG_TARGET_VIEWMODEL
    }
} 