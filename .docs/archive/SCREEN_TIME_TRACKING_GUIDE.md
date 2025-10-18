# Zario Screen Time Tracking Implementation Guide

**Version:** 2.0  
**Date:** October 17, 2025  
**Author:** System Architecture Review  
**Status:** CRITICAL - Fixes Required

---

## Executive Summary

This document defines the authoritative rules for accurate screen time tracking in Zario, based on analysis of discrepancies between Zario's tracking and Android's Digital Wellbeing. Two critical bugs were identified:

1. **ACTIVITY_STOPPED Bug**: Treating `ACTIVITY_STOPPED` as session end causes 15-50% under-counting during screen-off periods
2. **Self-Tracking Bug**: Zario tracks its own UI interactions, creating phantom screen time (56 min vs actual 4 min)

This guide establishes the ground truth for what to track, what to ignore, and how to handle edge cases.

---

## Part 1: The Ground Truth - What Android Actually Reports

### 1.1 Android's Official Event Hierarchy

Based on the Android Activity Handbook and official documentation, Android emits these UsageStats events:

| Event | Type Code | Meaning | When It Fires |
|-------|-----------|---------|---------------|
| **MOVE_TO_FOREGROUND** | 1 | App took foreground | Another app's activity becomes visible |
| **MOVE_TO_BACKGROUND** | 2 | App left foreground | Another app takes over |
| **ACTIVITY_RESUMED** | 1 | Activity visible + interactive | Activity visible AND receiving input |
| **ACTIVITY_PAUSED** | 2 | Activity lost focus | User navigates away or dialog appears |
| **ACTIVITY_STOPPED** | 23 | Activity invisible | Activity no longer visible (screen off, home, etc.) |
| **SCREEN_INTERACTIVE** | 15 | Screen on | Device screen turned on |
| **SCREEN_NON_INTERACTIVE** | 16 | Screen off | Device screen turned off |
| **KEYGUARD_SHOWN** | 17 | Lock screen shown | Lock screen displayed |
| **KEYGUARD_HIDDEN** | 18 | Lock screen dismissed | User unlocked device |

### 1.2 The Critical Distinction

**ACTIVITY_STOPPED ≠ App Left Foreground**

```
User using Twitter → Locks screen → Screen off
├─ ACTIVITY_PAUSED fires (Twitter loses focus)
├─ ACTIVITY_STOPPED fires (Twitter invisible)
├─ SCREEN_NON_INTERACTIVE fires (screen off)
└─ KEYGUARD_SHOWN fires (lock screen)

BUT: Twitter is STILL the "foreground app" from Android's perspective!
     NO MOVE_TO_BACKGROUND event fires!
```

**When user unlocks:**
```
User unlocks screen → Returns to Twitter
├─ KEYGUARD_HIDDEN fires
├─ SCREEN_INTERACTIVE fires
├─ ACTIVITY_RESUMED fires (Twitter visible again)
└─ Session CONTINUES (same session, not new)
```

---

## Part 2: Zario's Tracking Rules (The Fix)

### 2.1 Rule #1: Only Track TRUE Foreground Switches

**Use ONLY these events to end sessions:**

1. **MOVE_TO_BACKGROUND** - Definitive proof another app took foreground
2. **Another app's MOVE_TO_FOREGROUND** - Explicit app switch
3. **SCREEN_NON_INTERACTIVE** - Only if you want to stop counting during screen-off (optional, but recommended for consistency)
4. **KEYGUARD_SHOWN** - Lock screen shown (optional, for stricter tracking)
5. **DEVICE_SHUTDOWN** - Device shutting down

**DO NOT use these to end sessions:**
- ❌ `ACTIVITY_STOPPED` - Fires during screen-off, not just app switches
- ❌ `ACTIVITY_PAUSED` - Too granular, fires for dialogs/popups

### 2.2 Rule #2: The Screen-Off Dilemma

**Two Valid Approaches:**

#### Option A: Count Screen-Off Time (Matches Digital Wellbeing)
```kotlin
// Session continues through screen-off
val isForegroundCloseEvent: Boolean
    get() = this == MOVE_TO_BACKGROUND  // ONLY true app switches
```

**Pros:**
- Matches Digital Wellbeing exactly
- Captures "paused media" scenarios (YouTube video paused but app still "active")
- User intent: "I was using Twitter when I locked my phone"

**Cons:**
- May count idle time if user locks phone mid-session
- 10-hour Twitter session if user forgets to switch apps

#### Option B: Stop at Screen-Off (Stricter Tracking)
```kotlin
// Session ends when screen turns off
val closesAllSessions: Boolean
    get() = this == DEVICE_SHUTDOWN || 
            this == KEYGUARD_SHOWN || 
            this == SCREEN_NON_INTERACTIVE
```

**Pros:**
- Only counts "eyes on screen" time
- Prevents runaway sessions

**Cons:**
- Undercount compared to Digital Wellbeing
- Loses context when user locks phone briefly

**Zario's Current Implementation:** Option A (matches Digital Wellbeing)  
**Fix Required:** Remove `ACTIVITY_STOPPED` from session-end logic

### 2.3 Rule #3: Suppress Self-Tracking

**CRITICAL:** Zario must NOT track its own usage.

**Why?**
- Creates phantom screen time (56 min vs 4 min actual)
- Inflates total device usage
- Misleading user stats

**Where to Apply Suppression:**

1. **UsageEventLoader** (Android events) ✅ Already done
2. **CompositeTrackedEventSource** (Raw events) ⚠️ **FIXED TODAY**

**Suppressed Package List:**
```kotlin
private val suppressedPackages = setOf(
    "com.android.systemui",           // System UI overlays
    "com.google.android.packageinstaller",
    "com.google.android.permissioncontroller",
    "com.android.permissioncontroller",
    "com.sec.android.app.launcher",   // Launcher (home screen)
    "com.android.launcher3",
    "com.niyaz.zario"                 // ← Zario itself!
)
```

### 2.4 Rule #4: The "Last Foreground App" Concept

Android maintains the concept of "last foreground app" which persists until another app explicitly takes foreground.

**Example Timeline:**
```
09:00:00 - User opens Twitter (MOVE_TO_FOREGROUND)
09:04:01 - User locks screen (ACTIVITY_STOPPED, SCREEN_NON_INTERACTIVE)
         - Twitter is STILL the foreground app!
09:10:32 - User unlocks screen (ACTIVITY_RESUMED)
         - Twitter resumes (same session continues)
09:13:15 - User presses home (MOVE_TO_BACKGROUND)
         - Twitter session ENDS
```

**Digital Wellbeing tracks:** 09:00 → 09:13 = 13 minutes  
**Zario (with bug) tracked:** 09:00 → 09:04 + 09:10 → 09:13 = ~7 minutes ❌  
**Zario (fixed) tracks:** 09:00 → 09:13 = 13 minutes ✅

---

## Part 3: Implementation Architecture

### 3.1 Event Processing Pipeline

```
┌─────────────────────────────────────────────────────────────┐
│  Event Sources                                              │
├─────────────────────────────────────────────────────────────┤
│  1. UsageStatsManager (Android)                             │
│     ├─ MOVE_TO_FOREGROUND/BACKGROUND                        │
│     ├─ ACTIVITY_RESUMED/PAUSED/STOPPED                      │
│     └─ SCREEN_INTERACTIVE/NON_INTERACTIVE                   │
│                                                             │
│  2. ActivityLifecycleCallbacks (Zario's own)                │
│     ├─ onActivityResumed/Paused/Stopped                     │
│     └─ Stored in raw_events table                           │
├─────────────────────────────────────────────────────────────┤
│  ▼ Ingestion Layer                                          │
├─────────────────────────────────────────────────────────────┤
│  UsageEventLoader (processes Android events)                │
│     ├─ Filters suppressedPackages ✅                        │
│     ├─ Filters suppressedTaskRootClasses ✅                 │
│     └─ Outputs: List<UsageEvent>                            │
│                                                             │
│  CompositeTrackedEventSource (merges sources)               │
│     ├─ Loads UsageEvents (already filtered) ✅              │
│     ├─ Loads raw_events from DB                             │
│     ├─ MUST filter suppressedPackages ⚠️ FIXED              │
│     └─ Outputs: List<TrackedEvent>                          │
├─────────────────────────────────────────────────────────────┤
│  ▼ Reconciliation Layer                                     │
├─────────────────────────────────────────────────────────────┤
│  UsageTimelineReconciler                                    │
│     ├─ Processes TrackedEvents in chronological order       │
│     ├─ Maintains open sessions per package                  │
│     ├─ Ends sessions on isForegroundCloseEvent ⚠️ FIXED     │
│     ├─ Merges close sessions (mergeGap = 1 min)             │
│     └─ Outputs: List<UsageSession>                          │
├─────────────────────────────────────────────────────────────┤
│  ▼ Storage Layer                                            │
├─────────────────────────────────────────────────────────────┤
│  UsageAggregationStore                                      │
│     ├─ Writes sessions to usage_sessions table              │
│     └─ Aggregates by package/day                            │
└─────────────────────────────────────────────────────────────┘
```

### 3.2 Critical Decision Points

#### A. UsageEventType.kt (Line 60)
```kotlin
// BEFORE (BUGGY):
val isForegroundCloseEvent: Boolean
    get() = this == MOVE_TO_BACKGROUND || this == ACTIVITY_STOPPED

// AFTER (FIXED):
val isForegroundCloseEvent: Boolean
    get() = this == MOVE_TO_BACKGROUND
```

**Rationale:** Only true app switches should close sessions.

#### B. CompositeTrackedEventSource.kt
```kotlin
// ADDED (FIX):
private val suppressedPackages = setOf(
    "com.niyaz.zario",  // Don't track self
    // ... other launchers/system packages
)

private fun shouldIncludeEvent(event: TrackedEvent): Boolean {
    val packageName = when (event) {
        is TrackedEvent.ActivityLifecycle -> event.packageName
        is TrackedEvent.Accessibility -> event.packageName
        is TrackedEvent.AppLifecycle -> event.foregroundPackage
        else -> null
    }
    return packageName == null || packageName !in suppressedPackages
}
```

**Rationale:** Raw events from ActivityLifecycleTracker bypass UsageEventLoader suppression.

---

## Part 4: Edge Cases & Special Scenarios

### 4.1 Split-Screen / Multi-Window

**Android Behavior:**
- Top/focused window: ACTIVITY_RESUMED
- Bottom window: ACTIVITY_PAUSED (visible but not interactive)

**Zario Handling:**
- Track only RESUMED activity (matches Digital Wellbeing)
- Do NOT count PAUSED activities in split-screen

### 4.2 Picture-in-Picture (PiP)

**Android Behavior:**
- App enters PiP: ACTIVITY_PAUSED (still visible)
- Another app takes foreground: MOVE_TO_BACKGROUND

**Zario Handling:**
- PiP sessions count as foreground until MOVE_TO_BACKGROUND
- Matches YouTube's "background playback" behavior

### 4.3 System Dialogs (Permissions, Alerts)

**Android Behavior:**
- Dialog appears over app: ACTIVITY_PAUSED
- Dialog dismissed: ACTIVITY_RESUMED
- NO MOVE_TO_BACKGROUND fired

**Zario Handling:**
- Session continues (dialog is part of app experience)
- Use mergeGap (1 min) to collapse brief interruptions

### 4.4 Notification Actions

**Android Behavior:**
- User taps notification: ACTIVITY_RESUMED (target app)
- Previous app: MOVE_TO_BACKGROUND

**Zario Handling:**
- Normal app switch, previous session ends

### 4.5 Device Reboot

**Android Behavior:**
- DEVICE_SHUTDOWN event fired (if clean shutdown)
- No events if hard reboot/crash

**Zario Handling:**
- DEVICE_SHUTDOWN closes all sessions
- On startup, reconcile any orphaned sessions

---

## Part 5: Validation & Testing

### 5.1 Ground Truth Comparison

**Primary Reference:** Digital Wellbeing (Settings → Digital Wellbeing)

**Test Scenario 1: Screen-Off Gap**
```
Timeline:
1. Open Twitter
2. Use for 3 minutes
3. Lock screen (wait 5 minutes)
4. Unlock screen
5. Use Twitter for 2 minutes
6. Press home

Expected: Twitter = 10 minutes (3 + 5 + 2)
Zario (with bug): ~5 minutes ❌
Zario (fixed): 10 minutes ✅
```

**Test Scenario 2: Self-Tracking**
```
Timeline:
1. Open Zario
2. View stats for 30 seconds
3. Close Zario

Expected: Zario = 0 minutes (suppressed)
Zario (with bug): 0.5 minutes ❌
Zario (fixed): 0 minutes ✅
```

### 5.2 Automated Validation Script

```python
#!/usr/bin/env python3
"""Validate Zario tracking against Digital Wellbeing"""

import subprocess
import sqlite3
from datetime import datetime

def get_digital_wellbeing_time(package):
    """Extract time from Digital Wellbeing via dumpsys"""
    result = subprocess.run(
        ['adb', 'shell', 'dumpsys', 'usagestats', package],
        capture_output=True, text=True
    )
    # Parse totalTimeUsed from output
    for line in result.stdout.split('\n'):
        if 'totalTimeUsed=' in line:
            # Format: totalTimeUsed="HH:MM" or "MM:SS"
            time_str = line.split('=')[1].strip('"')
            return parse_time(time_str)
    return 0

def get_zario_time(package, day_start_ms):
    """Query Zario database for package usage"""
    conn = sqlite3.connect('tmp/zario_db_temp.db')
    cur = conn.cursor()
    cur.execute("""
        SELECT SUM(durationMs)/60000.0 
        FROM usage_sessions 
        WHERE packageName = ? AND dayStartMs = ?
    """, (package, day_start_ms))
    result = cur.fetchone()[0]
    conn.close()
    return result or 0

def validate_accuracy(packages, day_start_ms):
    """Compare Zario vs Digital Wellbeing"""
    print("=" * 80)
    print("VALIDATION REPORT")
    print("=" * 80)
    print(f"{'Package':40s} {'DWB':>8s} {'Zario':>8s} {'Diff':>8s} {'%Error':>8s}")
    print("-" * 80)
    
    for pkg in packages:
        dwb_time = get_digital_wellbeing_time(pkg)
        zario_time = get_zario_time(pkg, day_start_ms)
        diff = zario_time - dwb_time
        error_pct = (diff / dwb_time * 100) if dwb_time > 0 else 0
        
        status = "✅" if abs(error_pct) < 5 else "❌"
        print(f"{pkg[:40]:40s} {dwb_time:7.1f}m {zario_time:7.1f}m {diff:+7.1f}m {error_pct:+7.1f}% {status}")

# Usage
packages = ['com.twitter.android', 'com.android.chrome', 'com.niyaz.zario']
validate_accuracy(packages, day_start_ms=1760648400000)
```

### 5.3 Acceptance Criteria

**For Twitter (and all apps):**
- ✅ Accuracy within ±5% of Digital Wellbeing
- ✅ No phantom gaps during screen-off
- ✅ Sessions continue through screen lock/unlock

**For Zario (self):**
- ✅ Shows 0 minutes in history (suppressed)
- ✅ Database contains 0 sessions for com.niyaz.zario

**System-Wide:**
- ✅ Total device usage within ±5% of Digital Wellbeing
- ✅ All apps match Digital Wellbeing (not just Twitter)

---

## Part 6: Migration & Rollout

### 6.1 Code Changes Summary

| File | Change | Risk | Priority |
|------|--------|------|----------|
| `UsageEventType.kt` | Remove `ACTIVITY_STOPPED` from `isForegroundCloseEvent` | LOW | CRITICAL |
| `CompositeTrackedEventSource.kt` | Add suppression filter for raw events | LOW | CRITICAL |

### 6.2 Database Migration

**Required:** No schema changes needed

**Optional:** Recalculate historical sessions
```sql
-- Mark sessions for recalculation
UPDATE usage_sessions 
SET needs_recalc = 1 
WHERE dayStartMs >= ?;  -- Start from when bug was introduced
```

### 6.3 Rollout Plan

**Phase 1: Build & Test (Day 1)**
1. Apply both fixes
2. Build debug APK
3. Install on test device
4. Run validation script
5. Verify Twitter + Chrome + Zario match Digital Wellbeing

**Phase 2: Soft Launch (Day 2-7)**
1. Release to alpha testers
2. Monitor telemetry for anomalies
3. Compare against Digital Wellbeing on multiple devices

**Phase 3: Production (Day 8+)**
1. Release to production
2. Monitor user feedback
3. Watch for edge cases

---

## Part 7: Monitoring & Telemetry

### 7.1 Key Metrics to Track

**Accuracy Metrics:**
- `avg_error_vs_dwb`: Average % error vs Digital Wellbeing
- `apps_within_5pct`: % of apps matching DWB within 5%
- `self_tracking_sessions`: Count of Zario sessions (should be 0)

**Session Metrics:**
- `avg_session_duration`: Average session length
- `sessions_per_day`: Number of sessions per day
- `gap_sessions`: Sessions with >15 min gaps (may indicate issues)

### 7.2 Alerting Rules

**Critical Alerts:**
- `self_tracking_sessions > 0`: Suppression failed
- `avg_error_vs_dwb > 20%`: Major tracking inaccuracy

**Warning Alerts:**
- `avg_error_vs_dwb > 10%`: Moderate tracking inaccuracy
- `sessions_per_day > 500`: Possible event spam

---

## Appendix A: Quick Reference

### DO Track:
- ✅ MOVE_TO_FOREGROUND → Session start
- ✅ MOVE_TO_BACKGROUND → Session end
- ✅ ACTIVITY_RESUMED → Session resume (if same app)
- ✅ SCREEN_NON_INTERACTIVE → Optional session end
- ✅ KEYGUARD_SHOWN → Optional session end

### DON'T Track:
- ❌ ACTIVITY_STOPPED → Fires on screen-off, NOT app switch
- ❌ ACTIVITY_PAUSED → Too granular, fires for dialogs
- ❌ com.niyaz.zario package → Self-tracking creates phantom time
- ❌ Launcher packages → Home screen is not "usage"

### Key Insight:
**ACTIVITY_STOPPED ≠ App Left Foreground**

The app remains "foreground" until another app explicitly takes over via MOVE_TO_BACKGROUND.

---

## Appendix B: References

1. **Android Activity Handbook** (android-activity-handbook.md)
   - Section 1.1: UsageStatsManager API
   - Table: Event Types (Line 97-112)
   
2. **Android Developer Documentation**
   - [UsageEvents.Event](https://developer.android.com/reference/android/app/usage/UsageEvents.Event)
   - [Activity Lifecycle](https://developer.android.com/guide/components/activities/activity-lifecycle)

3. **Zario Codebase**
   - `usage-core/src/main/java/com/niyaz/zario/usage/UsageEventType.kt`
   - `usage-core/src/main/java/com/niyaz/zario/usage/UsageTimelineReconciler.kt`
   - `app/src/main/java/com/niyaz/zario/usage/tracking/CompositeTrackedEventSource.kt`

---

**Document Status:** ACTIVE  
**Next Review:** After production deployment  
**Maintained By:** Zario Engineering Team
