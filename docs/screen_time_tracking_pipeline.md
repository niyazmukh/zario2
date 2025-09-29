# Screen-Time Tracking Pipeline Handoff

## 1. Data Sources and Flow
- **Entry Points**
  - `UsageStatsUtils.getCurrentDayUsagePrecise(context, packageName)` – primary API for workers/UI; returns the resolved usage for the current calendar day with diagnostic logging enabled.
  - `UsageStatsUtils.getCurrentDayUsage(context, packageName)` – lightweight wrapper around the same reconciliation logic without verbose logs.
  - `UsageStatsUtils.getCumulativeForegroundTime(context, packageName)` – exposes UsageStats daily aggregates directly when callers only need the platform bucket value.
- **Temporal Bounds**
  - Day boundaries come from `CalendarUtils.getStartOfCurrentDay()` and `CalendarUtils.getEndOfCurrentDay()`, aligning with Digital Wellbeing (local timezone, `[start, end)`).
  - `now` is sampled via `System.currentTimeMillis()` inside `resolveCurrentDayUsage` to clamp live sessions.
- **Data Sources**
  - **Usage events** via `UsageStatsManager.queryEvents(...)` scoped to the current day plus a 12-hour pre-roll (`DAILY_EVENT_LOOKBACK_MS`).
  - **Daily aggregates** via `UsageStatsManager.queryUsageStats(INTERVAL_DAILY, startOfDay, endOfDay)`.
- **Execution Flow Overview**
  1. `resolveCurrentDayUsage` obtains both data sources.
  2. `computeDailyUsageFromEvents` reconstructs session spans from `UsageEvents`.
  3. `getAggregateUsage` pulls matching INTERVAL_DAILY buckets.
  4. Final usage is selected by preferring events when present, falling back to aggregates otherwise (`max(event, aggregate)` with guards for empty coverage).

## 2. Major Helpers and Responsibilities
- `computeDailyUsageFromEvents`
  - Pre-scans events in `[startOfDay - 12h, startOfDay)` to decide whether the app was already foregrounded at midnight (`activeAtStart`).
  - Walks through current-day events, pairing `START_EVENTS` (`ACTIVITY_RESUMED`, `MOVE_TO_FOREGROUND`, etc.) with `END_EVENTS` to accumulate total foreground milliseconds and segment count.
  - Handles trailing sessions by using `now` when the last event is a start without a matching end.
  - Emits the `DailyEventUsage` data class (`totalUsageMs`, `segmentCount`, `activeAtStart`, `firstEventTimestamp`, `lastEventTimestamp`).
- `getAggregateUsage`
  - Queries INTERVAL_DAILY stats and filters by `packageName`.
  - Builds `AggregateUsage` with:
    - `totalUsageMs`: sum of all buckets returned for the package.
    - `sameDayUsageMs`: sum restricted to buckets that begin after start-of-day (guards against midnight-crossing carry-over).
    - `buckets`: structured diagnostics (`AggregateBucket` records bounds and whether they cross the start boundary).
- `resolveCurrentDayUsage`
  - Combines the two measurements with simple heuristics:
    - If aggregates report zero, trust events.
    - If events report zero and we were not already active at day start, trust aggregates.
    - Otherwise pick `max(event, aggregate)` to avoid double counting while covering truncated sources.
  - Emits logs when `logDetails` is true (`getCurrentDayUsagePrecise`).
- Other utilities
  - `currentActiveSession` can compute the live foreground duration within a rolling window; leveraged by other call sites but not part of the daily reconciliation path.
  - `isTargetAppCurrentlyActive` wraps `currentActiveSession` plus a foreground-app quick check for UI goal tracking.

## 3. Diagnostics and Instrumentation
- Logging is centralized inside `resolveCurrentDayUsage` and `computeDailyUsageFromEvents` (tag: `UsageStatsUtils`).
  - Info-level summary: event totals, segment count, aggregate totals, last event timestamp, and the resolved final value.
  - Debug-level breakdown: human-readable aggregate bucket boundaries and current day window (`start`, `end`, `now`).
- Additional debug statements in `computeDailyUsageFromEvents` surface segment-level stats (`activeAtStart`, first/last event timestamps).
- To inspect raw sessions vs aggregates:
  - Toggle `getCurrentDayUsagePrecise` to force verbose logging from UI/workers.
  - Review `logcat` filtered by `UsageStatsUtils` to compare against Android Settings Digital Wellbeing totals.

## 4. Assumptions, Guard Rails, and Edge Cases
- Local timezone governs day boundaries; sessions starting before midnight are truncated at `startOfDay` and are expected to be counted on the previous day via aggregates.
- Missing `MOVE_TO_BACKGROUND` (or equivalent end events) are treated as ongoing sessions ending at `now`.
- Event walkers ignore unrelated packages and deduplicate implicit duplicates by only reacting to recognised start/end event types.
- Aggregates are only blended when events lack coverage; the `max` heuristic prevents over-counting while still rescuing missing segments from aggregates.
- Limited historical window (`DAILY_EVENT_LOOKBACK_MS = 12h`) keeps pre-scan cheap while still catching long-lived sessions that began late the previous day.
- Platform/OEM variance: some devices truncate event history or omit transitions—aggregates remain the fallback in those cases.

## 5. Current State and Pending Validation
- Recent fixes shifted the pipeline to event-driven reconstruction with aggregate safeguards, eliminating prior over-count and under-count defects.
- `:app:compileDebugKotlin` succeeds (tracked on 2025-09-24) with only deprecation warnings.
- **Next validation:** run on-device parity checks against settings for high-usage packages (e.g., `com.chess` ~59 minutes). Capture logs when mismatches occur to confirm whether aggregates dominate or events are missing.
- Monitor OEM devices known to limit UsageEvents; adjust heuristics or extend logging if aggregates become sole source.
