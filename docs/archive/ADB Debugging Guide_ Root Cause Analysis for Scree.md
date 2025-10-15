<img src="https://r2cdn.perplexity.ai/pplx-full-logo-primary-dark%402x.png" style="height:64px;margin-right:32px"/>

# ADB Debugging Guide: Root Cause Analysis for Screen Time Discrepancies

After implementing the multi-layer architecture, discrepancies between Digital Wellbeing and your custom app's Twitter tracking indicate specific system-level issues. Here's a comprehensive ADB debugging approach to identify the exact root cause.

## Systematic Debugging Protocol

### Phase 1: Baseline Verification

**Step 1: Identify Twitter's System Footprint**

```bash
# Find Twitter's exact package and all associated processes
adb shell pm list packages | grep -i twitter
# Expected: package:com.twitter.android

# Get complete Twitter package details
adb shell dumpsys package com.twitter.android | head -30
```

**Step 2: Establish Current System State**

```bash
# Capture current foreground activity
adb shell dumpsys activity activities | grep -E 'ResumedActivity|mCurrentFocus'

# List ALL Twitter-related activities currently running
adb shell dumpsys activity activities | grep com.twitter.android

# Check Twitter's process state and memory usage
adb shell dumpsys activity processes | grep com.twitter.android
```

This establishes your baseline - you'll compare everything against this initial state.[^1][^2]

### Phase 2: Real-Time Event Correlation

**Critical Monitoring Setup:**

```bash
# Clear all logs to start fresh
adb logcat -c

# Start comprehensive monitoring (run in background)
adb logcat -v threadtime ActivityManager:V UsageStatsService:V WindowManager:V *:S > twitter_debug.log &
LOGCAT_PID=$!

# Monitor usage events specifically for Twitter
adb shell dumpsys usagestats | grep com.twitter.android > baseline_usage.log
```

**Now execute this controlled test:**

1. Open Twitter
2. Use it for exactly 5 minutes (set a timer)
3. Close Twitter completely
4. Compare results
```bash
# Stop monitoring
kill $LOGCAT_PID

# Capture post-usage state
adb shell dumpsys usagestats | grep com.twitter.android > post_usage.log

# Generate comparison
echo "=== USAGE COMPARISON ===" > comparison_report.txt
echo "BEFORE:" >> comparison_report.txt
cat baseline_usage.log >> comparison_report.txt
echo "AFTER:" >> comparison_report.txt  
cat post_usage.log >> comparison_report.txt
```


### Phase 3: Deep System Event Analysis

**Identify the exact events Digital Wellbeing sees vs. what your app captures:**

```bash
# Query Digital Wellbeing's data source (UsageStatsManager)
adb shell dumpsys usagestats query-events --begin $(date -d '1 hour ago' +%s)000 --end $(date +%s)000 | grep com.twitter.android

# Cross-reference with activity lifecycle events
grep com.twitter.android twitter_debug.log | grep -E 'RESUMED|PAUSED|STOPPED|MOVE_TO_FOREGROUND|MOVE_TO_BACKGROUND'
```

This reveals the core discrepancy - Digital Wellbeing uses `UsageStatsManager` data while your app likely uses `ActivityLifecycleCallbacks`.[^3][^4]

### Phase 4: Root Cause Identification

**Check for the most common causes:**

**1. Background Process Attribution**

```bash
# Check if Twitter runs background services that Digital Wellbeing counts
adb shell dumpsys activity services | grep com.twitter.android
adb shell dumpsys activity providers | grep com.twitter.android

# Monitor background network activity (Twitter syncing data)
adb shell dumpsys netstats | grep com.twitter.android
```

**2. System UI Interference**

```bash
# Check for system overlays during Twitter usage
adb shell dumpsys activity activities | grep -E 'SystemUI|Navigation|StatusBar' -A 5 -B 5

# Look for notification/popup interruptions
grep -E 'notification|popup|dialog' twitter_debug.log | grep -v grep
```

**3. Activity State Transition Gaps**

```bash
# Analyze Twitter activity transitions in detail
adb shell dumpsys activity activities | grep com.twitter.android | grep Hist

# Check for rapid state changes that might be missed
grep com.twitter.android twitter_debug.log | grep -E 'START|PAUSE|RESUME|STOP' | head -20
```


### Phase 5: Timing Analysis

**The most critical step - identify timing discrepancies:**

```bash
# Create timestamp analysis
grep com.twitter.android twitter_debug.log | awk '{print $1, $2, $6, $7, $8}' > twitter_events_timeline.txt

# Compare with UsageStats timestamps
adb shell dumpsys usagestats query-events --begin $(date -d '2 hours ago' +%s)000 --end $(date +%s)000 | grep com.twitter.android | awk '{print $2, $3}' > usage_stats_timeline.txt

# Analyze the gap
echo "=== TIMING ANALYSIS ===" > timing_analysis.txt
echo "Activity Events:" >> timing_analysis.txt
cat twitter_events_timeline.txt >> timing_analysis.txt
echo "UsageStats Events:" >> timing_analysis.txt
cat usage_stats_timeline.txt >> timing_analysis.txt
```


### Phase 6: Digital Wellbeing Specific Analysis

**Understand exactly how Digital Wellbeing calculates time:**

```bash
# Find Digital Wellbeing's package name (varies by OEM)
adb shell pm list packages | grep -i wellbeing
# Common: com.google.android.apps.wellbeing, com.samsung.android.wellbeing

# Check Digital Wellbeing's access patterns
adb shell dumpsys package com.google.android.apps.wellbeing | grep -A 10 -B 5 "usagestats"

# Monitor Digital Wellbeing's own activity
adb logcat -v threadtime | grep wellbeing
```


### Phase 7: Generate Diagnostic Report

**Create a comprehensive analysis:**

```bash
#!/bin/bash
# twitter_diagnostic.sh

REPORT_FILE="twitter_discrepancy_$(date +%Y%m%d_%H%M%S).txt"

echo "=== TWITTER SCREEN TIME DISCREPANCY DIAGNOSTIC REPORT ===" > $REPORT_FILE
echo "Generated: $(date)" >> $REPORT_FILE
echo "Device: $(adb shell getprop ro.product.model)" >> $REPORT_FILE
echo "Android Version: $(adb shell getprop ro.build.version.release)" >> $REPORT_FILE
echo "" >> $REPORT_FILE

echo "1. PACKAGE VERIFICATION:" >> $REPORT_FILE
adb shell pm list packages | grep twitter >> $REPORT_FILE
echo "" >> $REPORT_FILE

echo "2. CURRENT USAGE STATS (Digital Wellbeing Source):" >> $REPORT_FILE
adb shell dumpsys usagestats | grep com.twitter.android | tail -10 >> $REPORT_FILE
echo "" >> $REPORT_FILE

echo "3. RECENT ACTIVITY EVENTS (Your App Source):" >> $REPORT_FILE
adb logcat -d | grep com.twitter.android | grep -E 'RESUMED|PAUSED' | tail -10 >> $REPORT_FILE
echo "" >> $REPORT_FILE

echo "4. BACKGROUND SERVICES:" >> $REPORT_FILE
adb shell dumpsys activity services | grep com.twitter.android >> $REPORT_FILE
echo "" >> $REPORT_FILE

echo "5. SYSTEM INTERRUPTIONS:" >> $REPORT_FILE
adb logcat -d | grep -E 'notification|call|sms' | tail -5 >> $REPORT_FILE
echo "" >> $REPORT_FILE

echo "Report saved to: $REPORT_FILE"
```


## Expected Root Causes \& Solutions

### 1. **Event Source Mismatch** (Most Common)

- **Symptom**: Your app uses `ActivityLifecycleCallbacks`, Digital Wellbeing uses `UsageStatsManager`
- **Fix**: Validate your tracking against `UsageStatsManager` data
- **ADB Evidence**: Different event counts between sources


### 2. **Background Time Attribution**

- **Symptom**: Twitter background sync counted by Digital Wellbeing, not your app
- **Fix**: Include background service monitoring in your tracking
- **ADB Evidence**: Services running when app appears closed


### 3. **System UI Interruptions**

- **Symptom**: Notifications/calls pause your tracking but not system tracking
- **Fix**: Implement robust pause/resume handling
- **ADB Evidence**: System UI activities during Twitter sessions


### 4. **Rapid State Changes**

- **Symptom**: Quick app switching causes missed events
- **Fix**: Implement event debouncing and state validation
- **ADB Evidence**: Multiple rapid PAUSE/RESUME cycles


### 5. **OEM Power Management**

- **Symptom**: Battery optimization affects your app's event delivery
- **Fix**: Request battery optimization exemption
- **ADB Evidence**: Process kills during tracking


## Implementation Fix Based on Findings

Once you identify the root cause, implement the appropriate solution:

```kotlin
// Example fix for background time attribution
class EnhancedScreenTimeTracker {
    fun validateAgainstSystemData() {
        val usageStatsManager = getSystemService(Context.USAGE_STATS_SERVICE) as UsageStatsManager
        val systemEvents = usageStatsManager.queryEvents(startTime, endTime)
        
        // Compare your tracking with system data
        reconcileDiscrepancies(myEvents, systemEvents)
    }
    
    private fun reconcileDiscrepancies(myEvents: List<Event>, systemEvents: List<UsageEvents.Event>) {
        // Implement the fix based on your ADB findings
    }
}
```

This systematic ADB debugging approach will pinpoint the exact discrepancy source, allowing you to implement a targeted fix rather than guessing at the problem.[^4][^2][^5]
<span style="display:none">[^10][^11][^12][^13][^14][^15][^16][^17][^18][^19][^20][^21][^22][^23][^24][^25][^26][^27][^28][^29][^30][^31][^32][^33][^34][^35][^36][^37][^38][^39][^40][^41][^42][^43][^44][^45][^46][^47][^48][^6][^7][^8][^9]</span>

<div align="center">⁂</div>

[^1]: https://www.repeato.app/identifying-the-current-activity-in-android-via-adb/

[^2]: https://makimo.com/blog/a-comprehensive-guide-to-android-debug-bridge-adb/

[^3]: https://ccdcoe.org/uploads/2021/03/Android-Dumpsys-Analysis-to-Indicate-Driver-Distraction.pdf

[^4]: https://developer.android.com/tools/dumpsys

[^5]: https://stackoverflow.com/questions/11201659/whats-the-android-adb-shell-dumpsys-tool-and-what-are-its-benefits

[^6]: https://www.herongyang.com/Android/Debug-adb-logcat-Command-Track-Lifecycle-of-Application.html

[^7]: https://www.droidcon.com/2024/10/28/7-adb-commands-every-android-developer-should-know/

[^8]: https://www.alooba.com/skills/concepts/android-sdk-622/activity-lifecycle/

[^9]: https://www.miradore.com/knowledge/android/installing-and-collecting-adb-logs-on-an-android-device/

[^10]: https://stackoverflow.com/questions/12904809/tracking-an-applications-network-statistics-netstats-using-adb

[^11]: https://montemagno.com/monitoring-android-activity-lifecycle-events-return-of-current-activity-plugin/

[^12]: https://stackoverflow.com/questions/21673696/how-do-i-track-screen-on-time-on-android

[^13]: https://www.sjdcforensics.com/android-crash-logs/

[^14]: https://stackoverflow.com/questions/77592815/how-to-manually-test-application-lifecycle-events-in-the-android-emulator

[^15]: https://developer.android.com/tools/adb

[^16]: https://www.reddit.com/r/oneui/comments/1imq9pq/checking_battery_health_and_capacity_accurately/

[^17]: https://developer.android.com/guide/components/activities/activity-lifecycle

[^18]: https://gist.github.com/Pulimet/5013acf2cd5b28e55036c82c91bd56d8

[^19]: https://www.lambdatest.com/blog/adb-commands/

[^20]: https://developer.android.com/guide/fragments/debugging

[^21]: https://www.reddit.com/r/fossdroid/comments/gv2mb9/any_screen_time_tracker/

[^22]: https://github.com/lana-20/adb-commands

[^23]: https://stackoverflow.com/questions/75857173/disable-digital-wellbeing-using-android-management-api-in-kiosk-mode

[^24]: https://www.hackingarticles.in/android-pentest-lab-setup-adb-command-cheatsheet/

[^25]: https://gist.github.com/Pulimet/5013acf2cd5b28e55036c82c91bd56d8?permalink_comment_id=4443767

[^26]: https://www.wired.com/story/digital-wellbeing-android-ios-facebook-instagram/

[^27]: https://jignect.tech/adb-tips-for-appium-how-to-locate-android-package-and-activity-names-easily/

[^28]: https://www.youtube.com/watch?v=aXcYcbalkqA

[^29]: https://stackoverflow.com/questions/4387875/view-activity-stack-in-android

[^30]: https://www.reddit.com/r/Android/comments/fzkp9d/your_honest_opinion_of_how_useful_digital/

[^31]: https://www.tricentis.com/learn/useful-adb-commands-for-android-testing

[^32]: https://source.android.com/docs/automotive/watchdog/wd_performance_health

[^33]: https://community.oneplus.com/thread/1513698

[^34]: https://source.android.com/docs/core/audio/debugging

[^35]: https://source.android.com/docs/core/tests/debug/read-bug-reports

[^36]: https://support.google.com/android/thread/164892419/digital-wellbeing-isn-t-working-properly?hl=en

[^37]: https://highon.coffee/blog/adb-command-cheat-sheet/

[^38]: https://us.community.samsung.com/t5/Samsung-Apps-and-Services/Digital-Wellbeing-App-Exclusion-Problem/td-p/3236497

[^39]: https://epd-blog.entri.team/mastering-event-validation-in-android-apps-a-qa-engineers-guide-8b4250e3b730

[^40]: https://source.android.com/docs/core/graphics/winscope/capture/adb

[^41]: https://www.browserstack.com/docs/app-automate/appium/advanced-features/adb-commands

[^42]: https://stackoverflow.com/questions/4599972/showing-all-broadcast-events-on-android

[^43]: https://developer.android.com/topic/performance/tracing/custom-events

[^44]: https://stackoverflow.com/questions/17915143/android-how-to-track-the-events-of-an-application

[^45]: https://gist.github.com/Pulimet/5013acf2cd5b28e55036c82c91bd56d8?permalink_comment_id=4824207

[^46]: https://www.topanalyticstools.com/blog/cross-platform-event-tracking-for-android-apps/

[^47]: https://www.youtube.com/watch?v=3wMlCucwGvE

[^48]: https://www.appdome.com/how-to/mobile-fraud-prevention-detection/know-your-customer-checks/block-android-debug-bridge-adb-exploits-protect-android-apps/

