# Zario Telemetry Investigation Tools

## Overview

This directory contains PowerShell scripts for investigating and diagnosing screen time tracking issues in the Zario app. These tools capture detailed telemetry about event drops, compare Zario's tracking against system UsageStats, and identify root causes of undercounting.

## Prerequisites

- Android device connected via USB with USB debugging enabled
- Zario app installed with PACKAGE_USAGE_STATS permission granted
- PowerShell 5.1 or higher
- ADB (Android Debug Bridge) in system PATH
- (Optional) sqlite3 for database queries

## Quick Start

### Run Complete Investigation

The easiest way to diagnose tracking issues:

```powershell
.\investigate-tracking.ps1 -Package "com.twitter.android" -TestDurationMinutes 5
```

This will:
1. ✅ Check device and app status
2. 📊 Start telemetry monitoring
3. 📱 Guide you through a test session
4. 📈 Capture system events
5. 🔍 Analyze dropped events
6. 📋 Generate recommendations

## Individual Tools

### 1. Live Telemetry Monitor

Watch Zario's event processing in real-time:

```powershell
.\monitor-telemetry.ps1
```

Filter for specific app:
```powershell
.\monitor-telemetry.ps1 -FilterPackage "com.twitter.android"
```

### 2. Dump Usage Events

Extract raw UsageStats events from the system:

```powershell
.\dump-usage-events.ps1 -Package "com.twitter.android" -Hours 2 -OutputFile "events.tsv"
```

Parameters:
- `-Package`: (Optional) Filter events for specific package
- `-Hours`: Time window to query (default: 1)
- `-OutputFile`: Output TSV file
- `-Verbose`: Show detailed event list

### 3. Session Comparison

Compare Zario-tracked sessions vs system tracking:

```powershell
.\compare-sessions.ps1 -Package "com.twitter.android"
```

This will:
- Extract Zario's session data (if accessible)
- Query system UsageStats
- Reconstruct sessions from events
- Highlight task root mismatches
- Show which events are being dropped

## Understanding the Output

### Telemetry Log Sections

#### 1. Usage Ingestion Summary
```
=== USAGE INGESTION SUMMARY ===
Window: [10:30:15.123 - 10:35:20.456]
Total Events Read: 1250
Events Emitted: 1105
Events Dropped: 145
Drop Rate: 11.6%
```

**What it means**: 11.6% of events are being filtered out before session reconciliation.

#### 2. Packages with High Drop Rates
```
=== PACKAGES WITH HIGH DROP RATES ===
com.twitter.android:
  Total: 85, Emitted: 45, Dropped: 40 (47.1%)
  Reasons: SUPPRESSED_TASK_ROOT_PACKAGE=40
```

**What it means**: Twitter is losing 47% of its events due to task root suppression.

#### 3. High-Value App Drops (CRITICAL)
```
=== HIGH-VALUE APP DROPS (Social Media) ===
com.twitter.android: 40 drops
  SUPPRESSED_TASK_ROOT_PACKAGE: 40 events
    Task Roots: com.android.systemui, com.google.android.apps.chrome
```

**What it means**: Twitter events are being dropped because they use system UI (media player) and Chrome (custom tabs).

#### 4. Detailed Drop Samples
```
SUPPRESSED_TASK_ROOT_PACKAGE (40 total):
  10:32:15.789 | pkg=com.twitter.android | type=23 | taskRoot=com.android.systemui
  10:33:42.123 | pkg=com.twitter.android | type=23 | taskRoot=com.google.android.apps.chrome
```

**What it means**: Specific timestamps and context for each drop.

## Common Issues & Solutions

### Issue 1: High Drop Rate for Social Media Apps

**Symptom**: Drop rates > 30% for Twitter/Instagram/Facebook

**Root Cause**: Apps use system components (video player, Chrome custom tabs) that have suppressed task roots

**Solution**: Implement hybrid filtering:
```kotlin
// Don't drop if packageName is in high-value list
val isHighValueApp = pkg in setOf("com.twitter.android", "com.instagram.android")
if (suppressedByPackage && !isHighValueApp) {
    // Only drop if not a high-value app
}
```

### Issue 2: Task Root Mismatches

**Symptom**: Events where `taskRootPackageName` ≠ `packageName`

**Root Cause**: Apps launching components in separate processes

**Solution**: Use context-aware filtering:
```kotlin
// Track parent app and allow suppressed task roots if launched from user app
if (suppressedByPackage) {
    if (previousEvent?.packageName in userApps) {
        // Keep event - it's part of user's interaction
    }
}
```

### Issue 3: Zero Events Captured

**Symptom**: No events showing up in telemetry

**Possible Causes**:
1. PACKAGE_USAGE_STATS permission not granted
2. Device doesn't support UsageStatsManager properly
3. Zario app not running/crashed

**Solution**: Check permissions:
```powershell
adb shell dumpsys package com.niyaz.zario | Select-String "PACKAGE_USAGE_STATS"
```

## Event Type Reference

| Type | Name | Description |
|------|------|-------------|
| 1 | MOVE_TO_FOREGROUND | App moved to foreground (deprecated API 29+) |
| 23 | ACTIVITY_RESUMED | Activity entered resumed state |
| 2 | MOVE_TO_BACKGROUND | App moved to background (deprecated API 29+) |
| 24 | ACTIVITY_PAUSED | Activity paused |
| 25 | ACTIVITY_STOPPED | Activity stopped |
| 15 | SCREEN_INTERACTIVE | Screen turned on |
| 16 | SCREEN_NON_INTERACTIVE | Screen turned off |

## Drop Reason Reference

| Reason | Description | Impact |
|--------|-------------|--------|
| NULL_PACKAGE | Event has no package name | Low (system events) |
| UNKNOWN_TYPE | Event type not tracked | Low (non-foreground events) |
| SUPPRESSED_TASK_ROOT_PACKAGE | Task root package is suppressed | **HIGH** - Causes undercounting |
| SUPPRESSED_TASK_ROOT_CLASS | Task root class is suppressed | **HIGH** - Causes undercounting |
| NOT_TRACKED_TYPE | Event type not in tracking list | Medium |

## Interpreting Results

### Good Tracking (No Issues)
- Drop rate < 5%
- No high-value app drops
- Task roots match package names
- Consistent session reconstruction

### Problem Indicators
- Drop rate > 15% ❌
- High-value apps showing drops ❌
- Task root mismatches for media/web content ❌
- System events counted as sessions ❌

## Advanced Usage

### Continuous Monitoring

Monitor over extended period:
```powershell
# Run 24-hour monitoring
$duration = 24 * 60  # minutes
.\investigate-tracking.ps1 -Package "com.twitter.android" -TestDurationMinutes $duration
```

### Batch Analysis

Analyze multiple apps:
```powershell
$apps = @("com.twitter.android", "com.instagram.android", "com.facebook.katana")
foreach ($app in $apps) {
    Write-Host "Analyzing $app..."
    .\dump-usage-events.ps1 -Package $app -Hours 4 -OutputFile "events_$app.tsv"
}
```

### Export for Further Analysis

All tools output structured data (TSV format) that can be imported into Excel, Python, or R for statistical analysis.

## Troubleshooting

### Script Execution Policy Error

```powershell
Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope CurrentUser
```

### ADB Not Found

Add Android SDK platform-tools to PATH or use full path:
```powershell
$env:PATH += ";C:\Users\YourName\AppData\Local\Android\Sdk\platform-tools"
```

### Device Not Detected

```powershell
# Check connection
adb devices

# Restart ADB server
adb kill-server
adb start-server
```

## Files Generated

- `telemetry_*.txt` - Zario's internal telemetry logs
- `system_events_*.tsv` - Raw UsageStats events from system
- `usage_events_*.tsv` - Filtered event dumps
- `zario_usage.db` - Pulled database (if accessible)

## Next Steps After Investigation

1. **Review telemetry logs** - Look for HIGH-VALUE APP DROPS section
2. **Identify task root patterns** - Which system packages are causing drops?
3. **Implement fix** - Update suppression strategy in `UsageAggregationModule.kt`
4. **Re-test** - Run investigation again to validate improvement
5. **Compare metrics** - Drop rate should decrease significantly

## Support

For issues or questions:
1. Check device logs: `adb logcat -s UsageIngestionTelemetry:*`
2. Review this README
3. Examine source code in `usage-core/src/main/java/com/niyaz/zario/usage/`
