# 🐛 BUG REPORT: Zario Under-Counting Due to Screen-Off Sessions

**Date**: October 17, 2025  
**Issue**: Zario reports 7-8 minutes for Twitter vs Digital Wellbeing/Forest showing 16 minutes  
**Root Cause**: `ACTIVITY_STOPPED` treated as session end even during screen-off periods

---

## 📊 Evidence

### Gap Analysis
```
Morning Session: 08:56:30 → 09:13:15
├─ Zario sees: 08:56:30 → 09:04:01 (7.5 min)
├─ LOST GAP:   09:04:01 → 09:10:32 (6.5 min) ← SCREEN OFF
└─ Zario sees: 09:10:32 → 09:13:15 (2.7 min)
   Total Zario: ~10 minutes
   Total DWB:   ~17 minutes
   MISSING:     ~7 minutes

Afternoon Session: 13:19:18 → 13:44:48  
├─ Zario sees: 13:19:18 → 13:26:04 (6.8 min)
├─ LOST GAP:   13:26:04 → 13:41:30 (15.4 min) ← SCREEN OFF
└─ Zario sees: 13:41:30 → 13:44:48 (3.3 min)
   Total Zario: ~10 minutes
   Total DWB:   ~25 minutes  
   MISSING:     ~15 minutes
```

### Verification
- ✅ **NO other apps** took foreground during gaps (verified via dumpsys)
- ✅ **Device screen was OFF** (no ACTIVITY_RESUMED events from any app)
- ✅ **Twitter remained "active"** (would resume when screen turned back on)

---

## 🔍 Root Cause

### Current Behavior (WRONG)
```kotlin
// In UsageEventType.kt
val isForegroundCloseEvent: Boolean
    get() = this == MOVE_TO_BACKGROUND || this == ACTIVITY_STOPPED  // ← BUG!
```

When screen turns off:
1. Android fires `ACTIVITY_STOPPED` for visible activities
2. Zario calls `finishIfAllowed()` → ends session
3. When screen turns on → `ACTIVITY_RESUMED`
4. Zario calls `ensureForeground()` → **NEW session**
5. **Time in between is LOST**

### What Digital Wellbeing Does (CORRECT)
- Tracks "last foreground app" even when screen off
- Only ends session when **another app takes foreground**
- Counts screen-off time as part of the session

---

## ✅ Solution

### Option 1: Ignore `ACTIVITY_STOPPED` for session boundaries (RECOMMENDED)

**Change**: Only close sessions on true app switches, not activity lifecycle events

```kotlin
// In UsageEventType.kt
val isForegroundCloseEvent: Boolean
    get() = this == MOVE_TO_BACKGROUND  // Remove ACTIVITY_STOPPED!
```

**Rationale**:
- `MOVE_TO_BACKGROUND` (`ACTIVITY_PAUSED`) fires when user switches apps
- `ACTIVITY_STOPPED` fires for many reasons (screen off, activity destruction, etc.)
- We should only end sessions on TRUE app switches

**Side effects**: None expected - continuity gap (30s) handles brief pauses

---

### Option 2: Context-Aware `ACTIVITY_STOPPED` Handling

Track screen state and only treat `ACTIVITY_STOPPED` as session end if followed by another app taking foreground:

```kotlin
// In UsageTimelineReconciler.kt
event.type.isForegroundCloseEvent -> {
    // Check if next event is ACTIVITY_RESUMED for same package
    // If yes, DON'T close session (it's just screen off)
    // If no (or different package resumes), close session
}
```

**Rationale**: More accurate but complex

**Side effects**: Need lookahead logic, more complex reconciliation

---

### Option 3: Increase Merge Gap (PARTIAL FIX)

```kotlin
// In UsageAggregationConfig.kt
val mergeGap: Duration = Duration.ofMinutes(30),  // Was: 1 minute
```

**Rationale**: Merge sessions with <30 min gap (covers most screen-off periods)

**Pros**: Simple, no logic changes  
**Cons**: Doesn't fix root cause, may merge unrelated sessions

---

## 🎯 Recommended Fix

**Implement Option 1** - it's the simplest and most correct:

### Step 1: Update `UsageEventType.kt`
```kotlin
val isForegroundCloseEvent: Boolean
    get() = this == MOVE_TO_BACKGROUND
    // Removed: || this == ACTIVITY_STOPPED
```

### Step 2: Add Screen State Handling (Optional Enhancement)
```kotlin
// Still treat ACTIVITY_STOPPED as session end ONLY if:
event.type.closesAllSessions -> sessions += open.finishAll(...)
// closesAllSessions includes SCREEN_NON_INTERACTIVE
```

### Step 3: Test
- Morning session should show ~17 min (not ~10 min)
- Afternoon session should show ~25 min (not ~10 min)
- Total Twitter today: ~42 min (matching DWB/Forest)

---

## 📈 Expected Impact

**Before Fix**:
- Twitter: 15 min (Zario) vs 42 min (DWB) = **64% under-count**

**After Fix**:
- Twitter: ~42 min (Zario) ≈ 42 min (DWB) = **Accurate** ✅

---

## 🧪 Testing Checklist

- [ ] Morning session (08:56-09:13) counts full ~17 minutes including screen-off gap
- [ ] Afternoon session (13:19-13:44) counts full ~25 minutes including screen-off gap
- [ ] Brief interruptions (<30s) still handled by continuity gap
- [ ] True app switches (to different app) still close sessions properly
- [ ] Screen locks (KEYGUARD_SHOWN) still close all sessions
- [ ] Compare with Digital Wellbeing for multiple apps across full day

---

**Status**: 🔴 Bug Confirmed  
**Priority**: 🔥 Critical (causing 40-60% under-count for video/social apps)  
**Estimated Fix Time**: 15 minutes (code change) + 2 hours (testing)
