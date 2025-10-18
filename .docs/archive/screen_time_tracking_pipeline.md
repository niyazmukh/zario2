# Screen-Time Tracking Pipeline Handoff

## 1. Data Sources and Flow
- **Entry Points**
  - `UsageStatsRepository.getSnapshot(forceRefresh = true)` – canonical API used by workers/UI; internally hydrates `UsageAggregationStore` and returns a `UsageSummary` for the current day window.
  - `UsageStatsRepository.getUsageBuckets(startMillis, endMillis, bucketSizeMillis)` – exposes fixed-size `UsageBucket` slices for charts and diagnostics.
  - `UsageStatsRepository.getGlobalUsageSummary(days)` – aggregates trailing per-day totals for goal tracking and streaks.
- **Temporal Bounds**
  - Day boundaries come from `UsageAggregationConfig.zoneId`, keeping alignment with Digital Wellbeing (local timezone, `[start, end)`).
  - `now` is provided by the injected `Clock` so tests can deterministically advance time.
- **Data Sources**
  - **Tracked events** published via `UsageEventBus` by a composite of lifecycle (`AppLifecycleTracker`), activity (`ActivityLifecycleTracker`), screen state (`ScreenStateTracker`), and accessibility (`UsageAccessibilityService`) observers.
  - **UsageStats snapshots** delivered through `UsageEventLoader` for OEMs that omit intermediate lifecycle events.
  - Raw events persisted in Room via `UsageRawEventDao` for reconciliation and export.
- **Execution Flow Overview**
  1. `UsageTrackingInitializer` wires trackers in `ZarioApp` and starts streaming events into `UsageEventRecorder`.
  2. `UsageStatsRepository` triggers ingestion through `UsageAggregationStore.ingestWindow(start, end)` which pulls pending raw events and blends them with fresh `UsageStats` windows.
  3. `UsageTimelineReconciler` produces confidence-weighted foreground segments that are upserted as sessions; foreground package snapshots come from the reconciler’s latest boundary.
  4. `UsageAggregationStore.summarize(start, end)` reconstructs totals from persisted sessions; hourly Firebase exports pull from the same store and purge raw events via `UsageStatsRepository.purgeRawEventsBefore` after upload.

## 2. Major Helpers and Responsibilities
- `UsageTrackingInitializer`
  - Registers lifecycle callbacks and screen receivers, installs the accessibility fallback if permitted, and exposes a process-wide `UsageEventRecorder`.
- `UsageEventRecorder`
  - Streams `TrackedEvent` instances to the in-memory bus, buffers them durably in Room, and exposes cold flows for aggregation and telemetry.
- `UsageTimelineReconciler`
  - Consumes ordered tracked events + UsageStats deltas, weights them by source confidence, and emits canonical `UsageSession` boundaries (no open-ended sessions beyond query window).
- `UsageAggregationStore`
  - Owns Room persistence for `UsageSessionEntity` + `UsageRawEventEntity`, applies reconciliation, summarises usage, exposes foreground lookups, and enforces retention via `purgeSessionsOlderThan` and `UsageRawEventDao.deleteBefore`.
- `UsageStatsRepository`
  - Caches the latest `UsageSummary` and foreground package, harmonises refresh cadence based on `DevicePolicyAdvisor`, and coordinates post-sync cleanup (raw event purges, Firebase hooks).
- `DevicePolicyAdvisor`
  - Detects OEM-specific quirks (e.g., Xiaomi battery optimisation, Samsung OneUI throttling) and recommends refresh cadence / fallback activation.

## 3. Diagnostics and Instrumentation
- Logging is centralised inside `UsageAggregationStore` (tag: `UsageAggregationStore`), `UsageStatsRepository`, and `UsageTimelineReconciler`.
  - Info-level summary: ingestion windows, reconciled session counts, purge metrics, OEM policy decisions.
  - Debug-level breakdown: tracker emissions, confidence scores, reconciled session boundaries, foreground transitions.
- Enable verbose diagnostics by toggling `BuildConfig.DEBUG` logging or attaching a `trackedEventListener` via `UsageTrackingInitializer` in debug builds.
- To inspect disparities:
  - Compare `TrackedEvent` buffer vs. reconciled sessions using `UsageRawEventDao.observeEvents(limit)`.
  - Cross-check `UsageSummary` output to Digital Wellbeing by capturing totals in the debugger or by exporting hourly aggregates to Firebase and inspecting Cloud logs.

## 4. Assumptions, Guard Rails, and Edge Cases
- Local timezone governs day boundaries; reconciler clamps sessions to `[startOfDay, endOfDay)` before persistence.
- Tracker confidence ordering: accessibility > activity lifecycle > screen state > UsageStats; reconciler only relies on lower-confidence sources when higher-confidence gaps exist.
- Missing end events automatically close at the query window end to avoid runaway durations.
- Raw event buffer retains at most 48h of data; Firebase sync and repository refreshes purge older entries to cap storage.
- OEM variance mitigation: `DevicePolicyAdvisor` flags known restrictive vendors and instructs the scheduler to tighten refresh intervals and surface onboarding education.

## 5. Current State and Pending Validation
- Production code now relies on the multi-source `UsageEventBus` + `UsageTimelineReconciler`; legacy `UsageSessionReducer` and its tests were retired on 2025-10-14.
- `:usage-core:test` covers reconciliation of overlapping sources, purge policies, and repository refresh cadence (2025-10-12).
- **Next validation:** exercise the accessibility fallback through onboarding flows, confirm `UsageAccessibilityService` remains dormant until explicitly enabled, and run parity checks against Digital Wellbeing on Samsung + Xiaomi devices.
- Monitor raw event retention metrics and Firebase export lag; consider adding health counters surfaced via `UsageStatsRepository` when discrepancies exceed ±5 %.
