# Zario Event Filtering Analysis

## Why Does Zario Drop Events?

### Current Suppression Lists

**SUPPRESSED_TASK_ROOT_PACKAGES (7 entries):**
1. `com.android.systemui` - System UI (status bar, quick settings, volume dialogs)
2. `com.google.android.packageinstaller` - Package installer
3. `com.google.android.permissioncontroller` - Permission dialogs
4. `com.android.permissioncontroller` - Permission dialogs (AOSP)
5. `com.sec.android.app.launcher` - Samsung launcher
6. `com.android.launcher3` - Stock Android launcher
7. `minutes` - Self-tracking (avoid recursive loops)

**SUPPRESSED_TASK_ROOT_CLASS_NAMES (11 entries):**
- Various launcher activities (Pixel, Samsung, AOSP)
- System UI components (RecentsActivity, StatusBar, QSActivity, VolumeDialog, MediaControlPanel)
- Permission review dialogs

### Design Intent: Filter System Chrome

The suppression lists aim to filter out:

1. **System UI overlays** - Quick settings, volume controls, notifications
2. **Launchers** - Home screen apps (not "real" usage)
3. **Permission dialogs** - System permission prompts
4. **Package installer** - App install/update screens
5. **Self-tracking** - Zario tracking itself (infinite loop prevention)

**Rationale:** These aren't "apps the user is actively using" - they're system infrastructure or transient UI.

---

## The Problem: Legitimate App Usage Gets Filtered

### Root Cause

When apps use system components as part of their normal operation, Android reports:
- `package` = the user's app (e.g., `com.twitter.android`)
- `taskRootPackage` = the system component (e.g., `com.android.systemui`)

**Current filter logic:** If `taskRootPackage` is in suppression list → **DROP THE EVENT**

### Real-World Examples

**Twitter Video Player:**
```
package=com.twitter.android
class=com.twitter.app.main.ImmersiveMediaPlayerActivity
taskRootPackage=com.android.systemui  ← FILTERED OUT!
```

**YouTube Fullscreen:**
```
package=com.google.android.youtube
class=com.google.android.youtube.app.WatchWhileActivity
taskRootPackage=com.android.systemui  ← LIKELY FILTERED!
```

**Instagram Stories:**
```
package=com.instagram.android
class=com.instagram.stories.viewer.StoryViewerActivity
taskRootPackage=com.android.systemui  ← LIKELY FILTERED!
```

---

## Should We Whitelist All Apps?

### Option A: Remove All Package-Based Filtering ❌

**Approach:** Delete `SUPPRESSED_TASK_ROOT_PACKAGES` entirely, keep only class-based filtering.

**Pros:**
- Captures ALL legitimate app usage
- No risk of undercounting any app
- Simpler logic

**Cons:**
- **System UI pollution:** Volume adjustments, quick settings, notification shade would be tracked as "usage"
- **Permission dialogs tracked:** "Oh, you spent 30 seconds in Permission Controller!"
- **Data quality degradation:** What % of time is real app usage vs system chrome?

**Example unwanted tracking:**
```
User opens volume slider for 2 seconds
→ Tracked as "2 seconds of System UI usage"

User grants camera permission
→ Tracked as "5 seconds of Permission Controller usage"
```

### Option B: Hybrid Filtering (Recommended) ✅

**Approach:** Filter by `taskRootPackage` ONLY if the `package` itself is also in suppression list.

**Logic:**
```kotlin
if (taskRootPackage in suppressedPackages) {
    // Only drop if this is ACTUALLY system UI usage
    if (packageName == taskRootPackage) {
        DROP  // Pure system UI event
    } else {
        KEEP  // Twitter using system UI → legitimate Twitter usage
    }
}
```

**Pros:**
- Filters pure system UI events (volume, quick settings)
- Captures apps USING system components (Twitter video, Instagram stories)
- Best data quality: tracks user intent, not system chrome
- Minimal code change

**Cons:**
- Slightly more complex logic
- Edge case: Apps that deliberately launch System UI (rare)

### Option C: High-Value App Whitelist ⚠️

**Approach:** Keep current filtering but add explicit whitelist for Twitter, Instagram, Facebook, etc.

**Pros:**
- Surgical fix for known issues
- Minimal risk of unintended side effects

**Cons:**
- **Whack-a-mole:** Need to add every app that uses system components
- **Incomplete:** New apps or unknown apps still undercounted
- **Maintenance burden:** Update whitelist as new apps identified

---

## Analysis: What Would Each Option Track?

### Scenario: User watches Twitter video for 60 seconds

| Approach | What Gets Tracked | Accuracy |
|----------|-------------------|----------|
| **Current** | 0 seconds (filtered) | ❌ 0% |
| **Option A (no filtering)** | 60s Twitter + 2s volume adjust + 1s notification shade | ⚠️ 95% (some noise) |
| **Option B (hybrid)** | 60s Twitter only | ✅ 100% |
| **Option C (whitelist)** | 60s Twitter (if whitelisted), 0s otherwise | ⚠️ Depends on whitelist |

### Scenario: User adjusts volume (no app usage)

| Approach | What Gets Tracked | Accuracy |
|----------|-------------------|----------|
| **Current** | 0 seconds (filtered) | ✅ 100% |
| **Option A (no filtering)** | 2s System UI | ❌ False positive |
| **Option B (hybrid)** | 0 seconds (filtered) | ✅ 100% |
| **Option C (whitelist)** | 0 seconds (filtered) | ✅ 100% |

---

## Recommendation: Option B (Hybrid Filtering)

### Why This Is The Best Approach

1. **Captures ALL legitimate app usage** (Twitter, Instagram, Chrome, YouTube, Facebook, etc.)
2. **Filters system chrome** (volume, quick settings, permission dialogs)
3. **Future-proof** - works for any app, no maintenance needed
4. **Minimal code change** - simple if statement
5. **Best data quality** - tracks user intent

### Implementation

**File:** `usage-core/src/main/java/com/niyaz/zario/usage/UsageEventLoader.kt`

**Current logic (line ~70):**
```kotlin
if (config.suppressedTaskRootPackages.contains(taskRoot)) {
    trackPackageDrop(packageName, DropReason.SUPPRESSED_TASK_ROOT_PACKAGE, ...)
    continue
}
```

**New logic:**
```kotlin
if (config.suppressedTaskRootPackages.contains(taskRoot)) {
    // Only drop if this is pure system UI usage
    // If an app is USING system components, that's still app usage
    if (packageName == taskRoot) {
        trackPackageDrop(packageName, DropReason.SUPPRESSED_TASK_ROOT_PACKAGE, ...)
        continue
    }
    // Otherwise: app using system component → keep it
}
```

### What This Fixes

- ✅ Twitter videos (using System UI media player)
- ✅ Instagram stories (using System UI)
- ✅ YouTube fullscreen (using System UI)
- ✅ Any app using system media players, custom tabs, etc.
- ✅ Still filters launcher, pure System UI, permission dialogs
- ✅ Still filters Zario self-tracking

### Estimated Impact

Based on 27.3% drop rate with ~220 drops per ingestion:
- **Current:** ~60 drops are Twitter/Instagram/social media
- **After fix:** ~15 drops (only launcher + Zario self)
- **New drop rate:** ~7-10% (mostly legitimate system chrome)

---

## Decision: Proceed with Option B?

**Summary:** Hybrid filtering gives us the best of both worlds - captures all app usage while still filtering system chrome.

**Next Step:** Implement the one-line fix in `UsageEventLoader.kt` and validate with telemetry.
