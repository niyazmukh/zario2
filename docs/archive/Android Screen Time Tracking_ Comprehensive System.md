<img src="https://r2cdn.perplexity.ai/pplx-full-logo-primary-dark%402x.png" style="height:64px;margin-right:32px"/>

# Android Screen Time Tracking: Comprehensive System Events \& Architecture

## 1. Exhaustive List of Android System Events for Screen Time Tracking

Based on extensive research across Android versions 12+ and all major OEMs, here is the complete catalog of events your screen time tracking app should monitor:

### Activity Lifecycle Events (API 1+)

- **onCreate()** - Activity creation and initial setup[^1][^2]
- **onStart()** - Activity becomes visible to user[^1][^2]
- **onResume()** - Activity becomes interactive (true foreground state)[^1][^2]
- **onPause()** - Activity loses focus but may remain partially visible[^1][^2]
- **onStop()** - Activity no longer visible to user[^1][^2]
- **onDestroy()** - Activity is being destroyed and resources cleaned up[^1][^2]
- **onRestart()** - Activity restarting from stopped state[^1][^2]


### UsageStatsManager Events (API 21+)

**Deprecated Events (API 21-28, removed in API 29+):**

- **MOVE_TO_FOREGROUND** - App moved to foreground (unreliable)[^3][^4]
- **MOVE_TO_BACKGROUND** - App moved to background (unreliable)[^3][^4]

**Current Events (API 29+):**

- **ACTIVITY_RESUMED** - Activity entered resumed state[^3][^5]
- **ACTIVITY_PAUSED** - Activity entered paused state[^3][^5]
- **ACTIVITY_STOPPED** - Activity entered stopped state[^3][^5]
- **ACTIVITY_DESTROYED** - Activity destroyed (API 31+)[^3]


### Screen State Events

- **ACTION_SCREEN_ON** - Screen turned on (broadcast intent)[^6][^7]
- **ACTION_SCREEN_OFF** - Screen turned off (broadcast intent)[^6][^7]
- **SCREEN_INTERACTIVE** - Screen interactive and touch-enabled (API 21+)[^5]
- **SCREEN_NON_INTERACTIVE** - Screen off or locked (API 21+)[^5]


### Application-Level Events (API 26+)

- **ProcessLifecycleOwner.ON_START** - Entire app enters foreground[^8][^9]
- **ProcessLifecycleOwner.ON_STOP** - Entire app enters background[^8][^9]
- **ProcessLifecycleOwner.ON_RESUME** - App becomes active[^8][^9]


### System Events

- **DEVICE_STARTUP** - Device boot completed (API 29+)[^10][^11]
- **DEVICE_SHUTDOWN** - Device shutdown initiated (API 29+)[^10][^11]
- **CONFIGURATION_CHANGE** - Screen orientation, language, or other config changes[^2][^12]
- **USER_INTERACTION** - User interaction detected (API 29+)[^10]


### Service Events (API 29+)

- **FOREGROUND_SERVICE_START** - Foreground service started[^10][^11]
- **FOREGROUND_SERVICE_STOP** - Foreground service stopped[^10][^11]


## 2. OEM-Specific Behavioral Differences

The research reveals significant variations across OEMs that impact screen time tracking accuracy:

### Samsung Devices

- **Battery Optimization**: Aggressive power management affects background tracking[^13][^14]
- **Digital Wellbeing Integration**: May conflict with custom tracking implementations[^15]
- **Reliability**: Generally high for activity lifecycle events, medium for background tracking
- **Common Issues**: Samsung's own screen time tracking may interfere[^16]


### Xiaomi Devices (MIUI)

- **Background App Killing**: Very aggressive, frequently terminates tracking services[^13][^17]
- **Data Collection**: MIUI extensively tracks user interactions, potentially affecting custom implementations[^13]
- **Reliability**: Medium to low, requires special handling for autostart permissions
- **Common Issues**: Apps killed in background, requires protected app status[^18]


### Huawei Devices (EMUI/HarmonyOS)

- **Power Management**: Very aggressive battery optimization[^13][^19]
- **Background Restrictions**: Requires apps to be added to protected lists[^19]
- **Reliability**: Medium, needs specific configuration for accurate tracking
- **Common Issues**: Background services frequently killed without proper setup[^19]


### Google Pixel \& OnePlus

- **Standard Behavior**: Closest to stock Android behavior[^13]
- **Reliability**: High across all tracking methods
- **Issues**: Minimal, mostly standard Android limitations


## 3. Optimal Screen Time Tracking Architecture

Based on the analysis, here's the recommended multi-layer architecture that addresses the shortcomings causing your app to undertrack Twitter and Instagram:

### Layer 1: Primary Application-Level Tracking

```kotlin
// Use ProcessLifecycleOwner for app-level foreground/background detection
ProcessLifecycleOwner.get().lifecycle.addObserver(object : DefaultLifecycleObserver {
    override fun onStart(owner: LifecycleOwner) {
        // App moved to foreground - most reliable event
        recordAppForeground(System.currentTimeMillis())
    }
    
    override fun onStop(owner: LifecycleOwner) {
        // App moved to background - most reliable event  
        recordAppBackground(System.currentTimeMillis())
    }
})
```


### Layer 2: Activity-Level Granular Tracking

```kotlin
// Track individual activity states for detailed app usage
registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
    override fun onActivityResumed(activity: Activity) {
        recordActivityActive(activity.javaClass.simpleName, System.currentTimeMillis())
    }
    
    override fun onActivityPaused(activity: Activity) {
        recordActivityInactive(activity.javaClass.simpleName, System.currentTimeMillis())
    }
    
    override fun onActivityStopped(activity: Activity) {
        recordActivityStopped(activity.javaClass.simpleName, System.currentTimeMillis())
    }
})
```


### Layer 3: UsageStatsManager Validation

```kotlin
// Validate your tracking against system data
fun validateWithUsageStats(): List<UsageEvent> {
    val usageStatsManager = getSystemService(USAGE_STATS_SERVICE) as UsageStatsManager
    val endTime = System.currentTimeMillis()
    val startTime = endTime - TimeUnit.HOURS.toMillis(1) // Last hour
    
    val events = usageStatsManager.queryEvents(startTime, endTime)
    val eventList = mutableListOf<UsageEvent>()
    
    while (events.hasNextEvent()) {
        val event = UsageEvents.Event()
        events.getNextEvent(event)
        
        // Focus on current events, avoid deprecated ones
        when (event.eventType) {
            UsageEvents.Event.ACTIVITY_RESUMED,
            UsageEvents.Event.ACTIVITY_PAUSED,
            UsageEvents.Event.ACTIVITY_STOPPED -> {
                eventList.add(UsageEvent(event.timeStamp, event.eventType, event.packageName))
            }
        }
    }
    return eventList
}
```


### Layer 4: Screen State Monitoring

```kotlin
// Monitor screen on/off to adjust tracking accuracy
class ScreenStateReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        when (intent.action) {
            Intent.ACTION_SCREEN_ON -> {
                recordScreenOn(System.currentTimeMillis())
                // Resume active tracking
            }
            Intent.ACTION_SCREEN_OFF -> {
                recordScreenOff(System.currentTimeMillis())
                // Pause tracking as user isn't actively viewing
            }
        }
    }
}
```


### Layer 5: Event Reconciliation Algorithm

```kotlin
class EventReconciliator {
    fun reconcileEvents(
        appEvents: List<AppEvent>,
        activityEvents: List<ActivityEvent>, 
        usageEvents: List<UsageEvent>,
        screenEvents: List<ScreenEvent>
    ): List<ScreenTimeSession> {
        
        // Priority: App-level > Activity-level > Usage Stats > Screen State
        val reconciled = mutableListOf<ScreenTimeSession>()
        
        // Start with app-level events as primary timeline
        val primaryTimeline = appEvents.sortedBy { it.timestamp }
        
        // Fill in gaps with activity-level granularity
        val enhancedTimeline = fillGapsWithActivityEvents(primaryTimeline, activityEvents)
        
        // Validate and correct against system UsageStats
        val validatedTimeline = validateAgainstUsageStats(enhancedTimeline, usageEvents)
        
        // Adjust for screen state (don't count time when screen is off)
        val finalTimeline = adjustForScreenState(validatedTimeline, screenEvents)
        
        return finalTimeline.toScreenTimeSessions()
    }
    
    private fun fillGapsWithActivityEvents(
        appEvents: List<AppEvent>, 
        activityEvents: List<ActivityEvent>
    ): List<Event> {
        // Implementation that uses activity resume/pause to fill gaps 
        // where app events might be missed due to OEM modifications
    }
}
```


### OEM-Specific Optimizations

**For Samsung devices:**

```kotlin
// Request battery optimization exemption
if (Build.MANUFACTURER.equals("samsung", ignoreCase = true)) {
    requestIgnoreBatteryOptimizations()
    // Increase validation frequency against UsageStats
    validationInterval = 30_000 // 30 seconds vs 60 seconds default
}
```

**For Xiaomi/MIUI devices:**

```kotlin
// Handle aggressive MIUI power management
if (Build.MANUFACTURER.equals("xiaomi", ignoreCase = true)) {
    // Request autostart permission
    requestAutostartPermission()
    // Use foreground service for critical tracking
    startForegroundService(Intent(this, ScreenTimeTrackingService::class.java))
    // Enable redundant tracking layers
    enableAllTrackingLayers()
}
```


## Key Implementation Recommendations

1. **Use Multiple Event Sources**: Don't rely on a single tracking method. The combination approach compensates for OEM-specific limitations[^20][^21].
2. **Implement Event Confidence Scoring**: Assign confidence levels to different event sources and use weighted averaging[^20][^22].
3. **Handle Rapid State Changes**: Social media apps like Twitter and Instagram frequently switch between activities. Use debouncing to avoid missing quick transitions[^23][^4].
4. **Validate Against System Data**: Regular validation against UsageStatsManager helps catch discrepancies[^24][^22].
5. **OEM-Specific Handling**: Detect device manufacturer and apply appropriate optimizations[^13][^14].

This multi-layer architecture addresses the core issue causing your Twitter and Instagram undertracking by providing redundancy and cross-validation across multiple event sources, ensuring accurate screen time measurement even when individual tracking methods fail due to OEM modifications.
<span style="display:none">[^100][^101][^102][^103][^104][^105][^106][^107][^108][^109][^110][^111][^112][^113][^114][^115][^116][^117][^25][^26][^27][^28][^29][^30][^31][^32][^33][^34][^35][^36][^37][^38][^39][^40][^41][^42][^43][^44][^45][^46][^47][^48][^49][^50][^51][^52][^53][^54][^55][^56][^57][^58][^59][^60][^61][^62][^63][^64][^65][^66][^67][^68][^69][^70][^71][^72][^73][^74][^75][^76][^77][^78][^79][^80][^81][^82][^83][^84][^85][^86][^87][^88][^89][^90][^91][^92][^93][^94][^95][^96][^97][^98][^99]</span>

<div align="center">⁂</div>

[^1]: https://developer.android.com/guide/components/activities/activity-lifecycle

[^2]: https://developer.android.com/guide/components/activities/state-changes

[^3]: https://developer.android.com/sdk/api_diff/29/changes/android.app.usage.UsageEvents.Event

[^4]: https://stackoverflow.com/questions/38971472/using-usagestatsmanager-to-get-the-foreground-app

[^5]: https://stackoverflow.com/questions/21673696/how-do-i-track-screen-on-time-on-android

[^6]: https://stackoverflow.com/questions/18658744/correct-way-to-register-for-screen-off-and-screen-on-events

[^7]: https://thinkandroid.wordpress.com/2010/01/24/handling-screen-off-and-screen-on-intents/

[^8]: https://waynestalk.com/en/android-process-background-foreground-en/

[^9]: https://github.com/jshvarts/AppLifecycleDemo

[^10]: https://developer.android.com/reference/android/app/usage/UsageStatsManager

[^11]: https://android.googlesource.com/platform/frameworks/base/+/HEAD/core/java/android/app/usage/UsageEvents.java

[^12]: https://stuff.mit.edu/afs/sipb/project/android/docs/guide/topics/resources/runtime-changes.html

[^13]: https://pmc.ncbi.nlm.nih.gov/articles/PMC9847909/

[^14]: https://www.scss.tcd.ie/doug.leith/Android_privacy_report.pdf

[^15]: https://mdsmobile.ae/blogs/news/how-to-check-screen-time-on-samsung-a-comprehensive-guide

[^16]: https://eu.community.samsung.com/t5/mobile-apps-services/screen-time-week-on-week-tracking-hopelessly-wrong/td-p/3500352

[^17]: https://www.reddit.com/r/Xiaomi/comments/rbrghm/do_xiaomi_phones_track_you_more_than_other_phone/

[^18]: https://www.reddit.com/r/Android/comments/e54ps1/so_i_bought_this_new_xiaomi_phone_miui_and_found/

[^19]: https://screentimelabs.com/help/faq/huawei/

[^20]: https://proandroiddev.com/accessing-app-usage-history-in-android-79c3af861ccf

[^21]: https://stackoverflow.com/questions/62192785/how-do-i-track-app-usage-time-in-android

[^22]: https://ciit-training.com/en/2024/09/16/android-usagestatsmanager-tracking-app-usage-with-ease/

[^23]: https://stackoverflow.com/questions/4414171/how-to-detect-when-an-android-app-goes-to-the-background-and-come-back-to-the-fo

[^24]: https://stackoverflow.com/questions/61615457/how-can-i-get-my-app-screen-time-on-a-hourly-basis

[^25]: https://www.geeksforgeeks.org/android/activity-state-changes-in-android-with-example/

[^26]: https://stackoverflow.com/questions/10606408/automatically-log-android-lifecycle-events-using-activitylifecyclecallbacks

[^27]: https://docs.oracle.com/en/cloud/saas/marketing/infinity-develop/docs/sdk/core/android/application_lifecycle_events_guide.htm

[^28]: https://docs.nvidia.com/gameworks/content/technologies/mobile/lifecycle_basics_practice.htm

[^29]: https://www.alooba.com/skills/concepts/android-sdk-622/activity-lifecycle/

[^30]: https://stackoverflow.com/questions/58832423/appstate-keep-on-getting-change-in-react-native-in-android

[^31]: https://developer.android.com/reference/android/app/Application.ActivityLifecycleCallbacks

[^32]: https://docs.snowplow.io/docs/events/ootb-data/mobile-lifecycle-events/

[^33]: https://github.com/facebook/react-native/issues/30206

[^34]: https://www.geeksforgeeks.org/android/activity-lifecycle-in-android-with-demo-app/

[^35]: https://docs.customer.io/integrations/data-in/semantic-events/mobile-app/

[^36]: https://proandroiddev.com/viewmodel-events-as-state-are-an-antipattern-35ff4fbc6fb6

[^37]: https://www.youtube.com/watch?v=xcpBPKnai0o

[^38]: https://stackoverflow.com/questions/4840691/activity-lifecycle-during-phone-display-timeouts

[^39]: https://docs.expo.dev/modules/android-lifecycle-listeners/

[^40]: https://firebase.google.com/codelabs/measure-android-view-performance

[^41]: https://www.ekreative.com/blog/monitoring-and-controlling-app-activities-on-an-android-phone/

[^42]: https://developer.download.nvidia.com/assets/mobile/docs/android_lifecycle_app_note.pdf

[^43]: https://github.com/rakutentech/android-analytics

[^44]: https://android-developers.googleblog.com/2025/02/trustedtime-api-introducing-reliable-approach-to-time-keeping-for-apps.html

[^45]: https://plausible.io/docs/events-api

[^46]: https://zapier.com/blog/best-time-tracking-apps/

[^47]: https://firebase.blog/posts/2020/08/google-analytics-manual-screen-view/

[^48]: https://www.timecamp.com

[^49]: https://developer.android.com/reference/android/app/usage/UsageEvents.Event

[^50]: https://myhours.com/best-time-tracking-apps

[^51]: https://www.reddit.com/r/reactnative/comments/170rs01/access_screen_time/

[^52]: https://firebase.google.com/docs/analytics/events

[^53]: https://toggl.com/blog/best-time-tracking-app-android

[^54]: https://capgo.app/ja/docs/plugins/android-usagestatsmanager/

[^55]: https://www.usemotion.com/blog/time-tracking-apps.html

[^56]: https://github.com/tanujnotes/Olauncher/issues/545

[^57]: https://stackoverflow.com/questions/79119893/how-to-implement-real-time-app-usage-tracking-for-android

[^58]: https://situm.com/docs/foreground-background-execution/

[^59]: https://www.cs.dartmouth.edu/campbell/cs65/lecture05/lecture05.html

[^60]: https://www.reddit.com/r/androiddev/comments/11qwml9/running_background_service_even_if_app_is_closed/

[^61]: https://stackoverflow.com/questions/30856384/confused-about-this-android-activity-life-cycle-scenario-oncreate-gets-called

[^62]: https://www.scss.tcd.ie/doug.leith/pubs/additional_material_neversleepingears.pdf

[^63]: https://steveliles.github.io/is_my_android_app_currently_foreground_or_background.html

[^64]: https://developer.android.com/develop/background-work/services

[^65]: https://learn.microsoft.com/en-us/dotnet/maui/fundamentals/app-lifecycle?view=net-maui-9.0

[^66]: https://arxiv.org/html/2408.01810v1

[^67]: https://developer.android.com/develop/background-work/services/fgs/restrictions-bg-start

[^68]: https://issuetracker.google.com/issues/202410207

[^69]: https://proandroiddev.com/react-to-app-foreground-and-background-events-with-processlifecycleowner-96278e5816fa

[^70]: https://avow.tech/glossary/what-exactly-are-android-oem-stores/

[^71]: https://www.airdroid.com/parent-control/phone-usage-tracker/

[^72]: https://www.reddit.com/r/androiddev/comments/mwa3cy/any_way_to_know_if_an_app_is_running_in_the/

[^73]: https://affiliates.bloodstock.uk.com/where-to-find-screen-time-on-android/

[^74]: https://www.honor.com/my/blog/screen-time-android/

[^75]: https://thebinaryhick.blog/2020/02/22/walking-the-android-timeline-using-androids-digital-wellbeing-to-timeline-android-activity/

[^76]: https://support.google.com/android/answer/9346420?hl=en

[^77]: https://www.androidpolice.com/android-check-screen-time/

[^78]: https://developer.android.com/guide/topics/resources/runtime-changes

[^79]: http://opensource.hcltechsw.com/volt-mx-native-function-docs/Android/android.app.usage-Android-10.0/

[^80]: https://smart.dhgate.com/a-simple-guide-to-tracking-and-understanding-screen-time-on-android-devices/

[^81]: https://android-app-development-documentation.readthedocs.io/en/latest/activitylifecycle.html

[^82]: https://stackoverflow.com/questions/35413259/android-how-to-detect-when-app-is-paused-and-resumed

[^83]: https://www.youtube.com/watch?v=48CfcIv9pAA

[^84]: https://developer.android.com/codelabs/basic-android-kotlin-compose-activity-lifecycle

[^85]: https://tool.oschina.net/uploads/apidocs/android/guide/components/activities.html

[^86]: https://developer.android.com/develop/ui/views/notifications/time-sensitive

[^87]: https://stackoverflow.com/questions/5538312/simplest-android-activity-lifecycle

[^88]: https://www.honor.com/sa-en/blog/screen-time-android/

[^89]: https://vtsen.hashnode.dev/activity-and-view-model-lifecycles-demo-app

[^90]: https://android.googlesource.com/platform/frameworks/base.git/+/master/services/usage/java/com/android/server/usage/UserUsageStatsService.java

[^91]: https://www.wired.com/story/use-androids-built-in-settings-to-cut-your-phone-usage-time-in-half/

[^92]: https://stackoverflow.com/questions/55621783/what-happens-when-already-destroyed-activity-by-os-is-revoked-by-user-from-recen

[^93]: https://learn.microsoft.com/en-us/dotnet/api/android.app.usage.usageevents.event?view=net-android-35.0

[^94]: https://stackoverflow.com/questions/39776621/android-activity-being-randomly-created-and-destroyed

[^95]: https://developer.android.com/reference/android/app/usage/UsageEventsQuery.Builder

[^96]: http://docs.52im.net/extend/docs/api/android-50/reference/android/app/usage/UsageEvents.html

[^97]: https://developer.android.com/reference/android/app/Activity

[^98]: https://docs.kony.com/NativeAPIs/Android/android.app.usage-Android-10.0/index.html

[^99]: https://docs.brightcove.com/android-sdk/javadoc/com/brightcove/player/event/EventType.html

[^100]: https://support.appsflyer.com/hc/en-us/articles/115005544169-In-app-events-Overview

[^101]: https://www.youtube.com/watch?v=OnuXlA1VIiE

[^102]: https://www.browserstack.com/guide/accessibility-permission-in-android

[^103]: https://stackoverflow.com/questions/59563346/tracking-screen-time-in-android

[^104]: https://developer.android.com/guide/topics/ui/accessibility/service

[^105]: https://metadesignsolutions.com/building-custom-parental-control-solutions-with-screen-time-apis-a-technical-deep-dive/

[^106]: https://stackoverflow.com/questions/5081145/android-how-do-you-check-if-a-particular-accessibilityservice-is-enabled

[^107]: https://developer.android.com/topic/libraries/architecture/lifecycle

[^108]: https://www.geeksforgeeks.org/techtips/how-to-check-screen-time-in-android/

[^109]: https://github.com/jihyeonRyu/ScreenCaptureService

[^110]: https://alexzh.com/android-processlifecycleowner-by-example/

[^111]: https://www.timealignapp.com/blog/8-great-tips-to-manage-your-screen-time

[^112]: https://www.reddit.com/r/androidapps/comments/15ro6uw/want_apps_which_use_accessibility_services_to/

[^113]: https://stackoverflow.com/questions/58808932/android-detect-if-app-enters-a-background

[^114]: https://dev.to/dzhavat/do-you-limit-your-mobile-screen-time-58ko

[^115]: https://developer.android.com/guide/topics/ui/accessibility/principles

[^116]: https://developer.android.com/reference/android/arch/lifecycle/ProcessLifecycleOwner

[^117]: https://www.datadoghq.com/blog/mobile-monitoring-best-practices/

