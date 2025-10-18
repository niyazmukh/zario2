"""
Analysis: How Zario Handles Rapid Event Chains
================================================

This document analyzes the event patterns from lines 546-658 of the manual inspection file
to explain how Zario's session merging logic works.
"""

print("""
# How Zario Handles Event Gaps in Rapid App Switching

## Key Configuration Parameters

From UsageAggregationConfig.kt:
- **mergeGap**: 1 minute (60 seconds)
- **taskContinuityGap**: 30 seconds

## Suppressed Packages (from UsageAggregationModule.kt)

✅ The following are EXCLUDED from screen time tracking:
- com.android.systemui
- com.google.android.packageinstaller  
- com.google.android.permissioncontroller
- com.android.permissioncontroller
- com.sec.android.app.launcher (Samsung Launcher + RecentsActivity)
- com.android.launcher3
- com.niyaz.zario (Zario itself)

---

## Pattern Analysis from Lines 546-658 (08:56-09:04)

### Scenario 1: Within-App Navigation (Twitter Internal)

```
08:56:30 Twitter StartActivity RESUMED
08:56:31 Twitter MainActivity RESUMED       [1 sec gap]
08:56:37 Twitter ProfileActivity RESUMED    [6 sec gap]
08:56:48 Twitter GalleryActivity RESUMED    [11 sec gap]
08:56:58 Twitter PAUSED → WhatsApp RESUMED
```

**Zario Behavior:**
- All Twitter activities have same `taskRootPackage`: com.twitter.android
- Gaps between RESUMED events: 1s, 6s, 11s (all < 60s mergeGap)
- **Result**: ONE CONTINUOUS SESSION: 08:56:30 - 08:56:58 = 28 seconds

✅ **Correct**: User was using Twitter the whole time (navigating between screens)

---

### Scenario 2: Task Switcher (RecentsActivity) Intermission

```
08:57:02 WhatsApp PAUSED
08:57:02 RecentsActivity RESUMED (com.sec.android.app.launcher)
08:57:03 RecentsActivity PAUSED
08:57:03 Chrome RESUMED                      [1 sec in RecentsActivity]
08:57:05 Chrome PAUSED  
08:57:05 RecentsActivity RESUMED
08:57:06 Chrome STOPPED
08:57:07 RecentsActivity PAUSED
08:57:07 Twitter RESUMED
```

**Zario Behavior:**
- RecentsActivity package: `com.sec.android.app.launcher`
- ✅ **SUPPRESSED** (in suppressedTaskRootPackages)
- Chrome appears for 2 seconds (08:57:03 - 08:57:05)

**What Gets Counted:**
- WhatsApp: Session ends at 08:57:02
- RecentsActivity: **NOT COUNTED** (suppressed)
- Chrome: **2-second session** (user previewed it in task switcher)
- Twitter: New session starts at 08:57:07

**Gap between WhatsApp end and Twitter start**: 5 seconds
- This is < 60s mergeGap, BUT different apps
- **Result**: Two separate sessions (no merge across different apps)

---

### Scenario 3: Rapid App Switching with Translate

```
08:57:42 WhatsApp PAUSED
08:57:42 Launcher RESUMED
08:57:43 Launcher PAUSED
08:57:43 Google Translate RESUMED
08:57:44 Launcher STOPPED
08:57:54 Translate PAUSED
08:57:54 RecentsActivity RESUMED
08:57:54 Translate STOPPED
08:57:55 RecentsActivity PAUSED
08:57:55 Translate RESUMED (user went back)
```

**Zario Behavior:**
- Launcher/RecentsActivity: **SUPPRESSED** (not counted)
- Translate session 1: 08:57:43 - 08:57:54 = **11 seconds**
- Translate session 2: 08:57:55 - 08:58:09 = **14 seconds**
- Gap between Translate sessions: **1 second** (< 60s mergeGap)

**Result**: Both Translate sessions **MERGED** into ONE:
- Total: 08:57:43 - 08:58:09 = **26 seconds**

✅ **Correct**: User briefly opened task switcher (1 sec) but stayed in Translate

---

## The Rules in Practice

### ✅ Merging DOES Occur When:

1. **Same app, gap < 1 minute**
   ```
   Twitter → Twitter (10 sec gap) → MERGED
   ```

2. **Same app with suppressed app in between**
   ```
   Translate → RecentsActivity (1 sec) → Translate → MERGED
   ```

### ❌ Merging DOES NOT Occur When:

1. **Different apps, even if gap < 1 minute**
   ```
   WhatsApp → (5 sec gap) → Twitter → TWO SESSIONS
   ```

2. **Same app, gap > 1 minute**
   ```
   Twitter session ends
   ... 90 seconds pass ...
   Twitter RESUMED → NEW SESSION
   ```

---

## Potential Issues Identified

### Issue #1: Task Switcher Previews Count as Usage

In the Chrome preview scenario:
```
RecentsActivity RESUMED
Chrome RESUMED (user swipes, sees Chrome preview)
Chrome PAUSED (2 seconds later)
RecentsActivity RESUMED
```

Chrome gets **2 seconds** credited, even though user just *previewed* it in task switcher!

**Impact**: Minimal (1-3 seconds per preview)
**Fix Consideration**: Could suppress events where:
- Duration < 3 seconds AND
- Followed immediately by RecentsActivity

### Issue #2: Internal App Navigation Gaps

Within Twitter, gaps of 1-48 seconds between ACTIVITY_RESUMED events (different activities).

**Current Behavior**: All counted as continuous session ✅
**Reasoning**: User is actively using Twitter, just navigating between screens

---

## Conclusion

Zario's gap handling is **generally correct**:

✅ **Merges** rapid within-app navigation (< 1 min gaps)
✅ **Ignores** launcher/system UI intermissions  
✅ **Separates** distinct app usage sessions
⚠️  **Minor issue**: Task switcher previews count as usage (2-3 sec each)

The 1-minute mergeGap and 30-second taskContinuityGap match Digital Wellbeing's heuristics,
providing accurate screen time tracking for real-world usage patterns.
""")
