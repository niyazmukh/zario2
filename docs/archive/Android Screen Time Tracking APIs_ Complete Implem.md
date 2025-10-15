<img src="https://r2cdn.perplexity.ai/pplx-full-logo-primary-dark%402x.png" style="height:64px;margin-right:32px"/>

# Android Screen Time Tracking APIs: Complete Implementation Guide for Android 12+

Based on comprehensive research of Android's on-device app activity tracking capabilities, here's the definitive guide to all available APIs for screen time tracking from Android 12 onwards.

## Primary Screen Time APIs

### 1. **UsageStatsManager** - The Core System API

**Status**: Primary API, enhanced significantly in Android 12+[^1][^2][^3]
**Permission**: `android.permission.PACKAGE_USAGE_STATS` (Special permission)
**User Approval**: Settings > Apps with usage access[^4][^5]

This remains the most comprehensive API for screen time tracking, providing system-level usage statistics and detailed app events.

**Key Android 12+ Enhancements**:

- More granular event types (ACTIVITY_RESUMED, ACTIVITY_PAUSED, ACTIVITY_STOPPED)
- Better timestamp precision and event correlation
- Integration with app hibernation features[^6]
- Enhanced privacy controls and user consent mechanisms[^7]

**Implementation**:

```kotlin
class UsageStatsTracker(private val context: Context) {
    private val usageStatsManager = context.getSystemService(Context.USAGE_STATS_SERVICE) as UsageStatsManager
    
    fun getDetailedScreenTime(startTime: Long, endTime: Long): Map<String, ScreenTimeData> {
        if (!hasUsageStatsPermission()) {
            requestUsageStatsPermission() 
            return emptyMap()
        }
        
        val events = mutableListOf<UsageEvent>()
        val usageEvents = usageStatsManager.queryEvents(startTime, endTime)
        
        while (usageEvents.hasNextEvent()) {
            val event = UsageEvents.Event()
            usageEvents.getNextEvent(event)
            
            // Android 12+ provides more accurate event types
            when (event.eventType) {
                UsageEvents.Event.ACTIVITY_RESUMED -> 
                    events.add(UsageEvent(event.packageName, event.timeStamp, EventType.FOREGROUND))
                UsageEvents.Event.ACTIVITY_PAUSED -> 
                    events.add(UsageEvent(event.packageName, event.timeStamp, EventType.BACKGROUND))
                UsageEvents.Event.ACTIVITY_STOPPED -> 
                    events.add(UsageEvent(event.packageName, event.timeStamp, EventType.STOPPED))
            }
        }
        
        return calculateScreenTime(events)
    }
}
```


### 2. **ProcessLifecycleOwner** - Application Lifecycle Tracking

**Status**: Highly reliable for app-level foreground/background detection[^8][^9][^10]
**Permission**: None required
**Scope**: Your own application

This API provides excellent reliability for tracking when your app moves between foreground and background states.

**Implementation**:

```kotlin
class AppLifecycleTracker : Application() {
    override fun onCreate() {
        super.onCreate()
        
        ProcessLifecycleOwner.get().lifecycle.addObserver(object : DefaultLifecycleObserver {
            override fun onStart(owner: LifecycleOwner) {
                // App moved to foreground - very reliable
                recordAppForeground(System.currentTimeMillis())
            }
            
            override fun onStop(owner: LifecycleOwner) {
                // App moved to background - accounts for OEM variations
                recordAppBackground(System.currentTimeMillis())
            }
        })
    }
}
```


### 3. **AccessibilityService** - Real-Time Screen Monitoring

**Status**: Most accurate for real-time app switching detection[^11][^12][^13]
**Permission**: `android.permission.BIND_ACCESSIBILITY_SERVICE`
**User Approval**: Settings > Accessibility > [Your App]

Provides the highest accuracy for detecting app switches and screen interactions, but requires careful implementation to avoid performance issues.

**Implementation**:

```kotlin
class ScreenTimeAccessibilityService : AccessibilityService() {
    
    override fun onAccessibilityEvent(event: AccessibilityEvent) {
        when (event.eventType) {
            AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED -> {
                val packageName = event.packageName?.toString()
                val className = event.className?.toString()
                
                packageName?.let { 
                    recordAppSwitch(it, className, System.currentTimeMillis())
                }
            }
        }
    }
    
    override fun onServiceConnected() {
        val config = AccessibilityServiceInfo().apply {
            eventTypes = AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED
            feedbackType = AccessibilityServiceInfo.FEEDBACK_GENERIC
            flags = AccessibilityServiceInfo.FLAG_INCLUDE_NOT_IMPORTANT_VIEWS
        }
        serviceInfo = config
    }
}
```


## Supporting APIs for Enhanced Tracking

### 4. **ActivityLifecycleCallbacks** - Internal Activity Monitoring

```kotlin
class InternalActivityTracker : Application.ActivityLifecycleCallbacks {
    override fun onActivityResumed(activity: Activity) {
        recordActivityState(activity.javaClass.simpleName, ActivityState.RESUMED)
    }
    
    override fun onActivityPaused(activity: Activity) {
        recordActivityState(activity.javaClass.simpleName, ActivityState.PAUSED)
    }
}
```


### 5. **Screen State Monitoring** - Device Level Events

```kotlin
class ScreenStateReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        when (intent.action) {
            Intent.ACTION_SCREEN_ON -> recordScreenEvent(ScreenEvent.ON)
            Intent.ACTION_SCREEN_OFF -> recordScreenEvent(ScreenEvent.OFF)
            Intent.ACTION_USER_PRESENT -> recordScreenEvent(ScreenEvent.UNLOCKED)
        }
    }
}
```


## Android Version-Specific Enhancements

### Android 12 (API 31) New Features

- **App Hibernation Integration**: Track hibernated app states[^6]
- **Enhanced Usage Events**: More precise ACTIVITY_DESTROYED events
- **Privacy Dashboard**: Better user visibility into data access[^7]
- **Foreground Service Restrictions**: Stricter background service management[^14]


### Android 13+ (API 33+) Improvements

- **Foreground Service Task Manager**: Users can stop services from notifications[^14]
- **Granular Media Permissions**: Better app identification capabilities
- **Enhanced Battery Tracking**: Integration with system power management[^15]


## Permission Management Strategy

### 1. Usage Stats Permission (Most Critical)

```kotlin
fun checkUsageStatsPermission(context: Context): Boolean {
    val appOpsManager = context.getSystemService(Context.APP_OPS_SERVICE) as AppOpsManager
    val mode = appOpsManager.unsafeCheckOpNoThrow(
        "android:get_usage_stats",
        Process.myUid(),
        context.packageName
    )
    return mode == AppOpsManager.MODE_ALLOWED
}

fun requestUsageStatsPermission(context: Context) {
    val intent = Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS).apply {
        data = Uri.parse("package:${context.packageName}")
    }
    context.startActivity(intent)
}
```


### 2. Accessibility Permission

```kotlin
fun isAccessibilityServiceEnabled(context: Context): Boolean {
    val enabledServices = Settings.Secure.getString(
        context.contentResolver,
        Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES
    )
    
    return enabledServices?.contains(context.packageName) == true
}
```


## Optimal Implementation Architecture

Based on the research, here's the recommended multi-layer architecture:

```kotlin
class ComprehensiveScreenTimeTracker {
    
    // Layer 1: Primary system data (highest accuracy)
    fun trackWithUsageStats(): List<ScreenTimeSession> {
        return usageStatsManager.queryEvents(startTime, endTime)
            .processIntoSessions()
    }
    
    // Layer 2: Application lifecycle (high reliability)  
    fun trackWithProcessLifecycle(): List<AppSession> {
        return processLifecycleEvents.consolidate()
    }
    
    // Layer 3: Real-time detection (highest precision)
    fun trackWithAccessibility(): List<AppSwitch> {
        return accessibilityEvents.realTimeData()
    }
    
    // Layer 4: Cross-validation and reconciliation
    fun reconcileAllSources(): List<AccurateScreenTimeData> {
        return EventReconciler.combine(
            usageStatsData,
            lifecycleData, 
            accessibilityData,
            screenStateData
        )
    }
}
```


## Battery Optimization Considerations

### Handle Android 12+ Restrictions

```kotlin
@TargetApi(Build.VERSION_CODES.S)
fun startTrackingService() {
    try {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            // Handle new foreground service restrictions
            context.startForegroundService(trackingServiceIntent)
        }
    } catch (e: ForegroundServiceStartNotAllowedException) {
        // Fallback to alternative tracking methods
        useLifecycleOnlyTracking()
    }
}
```


### Request Battery Optimization Exemption

```kotlin
fun requestBatteryOptimizationExemption() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        val intent = Intent(Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS)
        intent.data = Uri.parse("package:$packageName")
        startActivity(intent)
    }
}
```


## Key Implementation Guidelines

### 1. **Layered Approach**: Use multiple APIs for redundancy and accuracy

### 2. **Permission UX**: Clearly explain why each permission is needed[^12]

### 3. **Battery Efficiency**: Minimize background processing and use efficient event batching

### 4. **Privacy First**: Hash package names and provide user control over data retention

### 5. **OEM Compatibility**: Test extensively on Samsung, Xiaomi, and other major OEMs

### 6. **Graceful Degradation**: Provide fallback tracking when permissions are unavailable

This comprehensive approach leverages all available Android APIs to create the most accurate screen time tracking possible while respecting user privacy and system limitations from Android 12 onwards.
<span style="display:none">[^16][^17][^18][^19][^20][^21][^22][^23][^24][^25][^26][^27][^28][^29][^30][^31][^32][^33][^34][^35][^36][^37][^38][^39][^40][^41][^42][^43][^44][^45][^46][^47][^48][^49][^50][^51][^52][^53][^54][^55][^56][^57][^58][^59]</span>

<div align="center">⁂</div>

[^1]: https://proandroiddev.com/accessing-app-usage-history-in-android-79c3af861ccf

[^2]: https://ciit-training.com/en/2024/09/16/android-usagestatsmanager-tracking-app-usage-with-ease/

[^3]: https://developer.android.com/reference/android/app/usage/UsageStatsManager

[^4]: https://stackoverflow.com/questions/36820668/request-permission-on-package-usage-stats

[^5]: https://www.droidcon.com/2022/02/08/accessing-app-usage-history-in-android/

[^6]: https://www.esper.io/blog/android-12-compatibility-guide

[^7]: https://www.nowsecure.com/blog/2021/07/21/android-12-security-and-privacy-updates/

[^8]: https://www.repeato.app/how-to-detect-when-an-android-app-goes-to-the-background-and-comes-back-to-the-foreground/

[^9]: https://developer.android.com/reference/kotlin/androidx/lifecycle/ProcessLifecycleOwner

[^10]: https://stackoverflow.com/questions/56780722/how-to-catch-lifecycle-events-with-processlifecycleowner

[^11]: https://www.youtube.com/watch?v=OnuXlA1VIiE

[^12]: https://www.browserstack.com/guide/accessibility-permission-in-android

[^13]: https://developer.android.com/guide/topics/ui/accessibility/service

[^14]: https://es.scribd.com/document/597698005/Behaviour-changes-in-android-13

[^15]: https://source.android.com/docs/core/power/trackers

[^16]: https://www.youtube.com/watch?v=Jj14sw4Yxk0

[^17]: https://pub.dev/packages/screen_time/versions/0.10.1

[^18]: https://www.reddit.com/r/reactnative/comments/170rs01/access_screen_time/

[^19]: https://stackoverflow.com/questions/4414171/how-to-detect-when-an-android-app-goes-to-the-background-and-come-back-to-the-fo

[^20]: https://www.reddit.com/r/tasker/comments/vz1s0f/dev_tasker_610beta_accessibility_service/

[^21]: https://stackoverflow.com/questions/79272579/usagestatsmanagerqueryevents-api-giving-incorrect-data-for-screen-time-usage

[^22]: https://developer.android.com/develop/background-work/services/fgs

[^23]: https://github.com/tanujnotes/Olauncher/issues/545

[^24]: https://firebase.google.com/docs/perf-mon/app-start-foreground-background-traces

[^25]: https://stackoverflow.com/questions/38412154/how-to-listen-to-taps-and-get-views-using-accessibility-in-android

[^26]: https://www.linkedin.com/posts/pranshik_how-to-monitor-app-usage-on-android-with-activity-7252911286886248448-ev4w

[^27]: https://codelabs.developers.google.com/codelabs/developing-android-a11y-service

[^28]: https://source.android.com/docs/core/graphics/winscope/analyze/wm

[^29]: https://mobiledev2017.wordpress.com/2017/09/10/foreground-app-in-android/

[^30]: https://learn.microsoft.com/en-us/dotnet/api/android.views.display.getmetrics?view=net-android-35.0

[^31]: https://siempredelao.github.io/android-app-in-foreground.html

[^32]: https://stuff.mit.edu/afs/sipb/project/android/docs/reference/android/view/Display.html

[^33]: https://dev.to/pyricau/android-vitals-why-did-my-process-start-4d0e

[^34]: https://developers.moengage.com/hc/en-us/articles/4403843909396-Troubleshooting-and-FAQs

[^35]: https://stackoverflow.com/questions/8632970/how-to-get-screen-metrics-outside-an-activity

[^36]: https://www.tutorialspoint.com/how-to-check-if-an-android-application-is-running-in-the-background

[^37]: https://developer.android.com/reference/android/arch/lifecycle/ProcessLifecycleOwner

[^38]: https://www.repeato.app/how-to-get-screen-dimensions-as-pixels-in-android/

[^39]: https://stackoverflow.com/questions/2166961/determining-the-current-foreground-application-from-a-background-task-or-service

[^40]: https://issuetracker.google.com/issues/224564039

[^41]: https://source.android.com/docs/core/display/windowmanager-extensions

[^42]: https://developer.android.com/reference/android/app/ActivityManager.RunningAppProcessInfo

[^43]: https://docs.pulsatehq.com/v2.8.2/reference/android-sdk-release-notes

[^44]: https://slack-chats.kotlinlang.org/t/16243087/what-would-be-the-compose-way-of-grabbing-these-window-value

[^45]: https://developer.android.com/reference/android/app/admin/DeviceAdminReceiver

[^46]: https://developer.android.com/work/dpc/security

[^47]: https://developer.android.com/guide/app-compatibility/restrictions-non-sdk-interfaces

[^48]: https://inero-software.com/android-kiosk-mode-how-to-turn-an-android-device-into-a-single-use-device/

[^49]: https://developer.android.com/about/versions/12/features

[^50]: https://www.reddit.com/r/tasker/comments/18utyab/androidpermissionpackage_usage_stats_grantedtrue/

[^51]: https://github.com/googlesamples/android-testdpc

[^52]: https://docs.leanplum.com/changelog/android-12-updates

[^53]: https://developer.android.com/reference/android/Manifest.permission

[^54]: https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/app/admin/DevicePolicyManager.java

[^55]: https://stackoverflow.com/questions/69223128/android-12-foreground-service-launch-restrictions

[^56]: https://learn.microsoft.com/en-us/dotnet/api/android.app.usage.usagestatsmanager?view=net-android-35.0

[^57]: https://hackernoon.com/building-a-device-manager-app-on-android-lessons-from-managing-300k-terminals

[^58]: https://developers.google.com/android/management/reference/rest/v1/enterprises.policies

[^59]: https://github.com/googlesamples/android-AppUsageStatistics

