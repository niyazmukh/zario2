# Change Log

## 2025-09-24
- **UsageStatsUtils**: Replaced INTERVAL_DAILY aggregates with event-driven daily usage reconstruction, added per-bucket diagnostics, and verified compilation via `:app:compileDebugKotlin`.
- **UsageStatsUtils**: Balanced event-derived usage with same-day aggregate buckets to handle missing historical events and logged bucket boundary diagnostics; recompiled with `:app:compileDebugKotlin`.

## 2025-09-25
- **Documentation**: Captured the UsageStats screen-time pipeline (data sources, helpers, diagnostics, assumptions, validation status) in `docs/screen_time_tracking_pipeline.md` for AI teammate handoff.
- **UsageStatsUtils/TargetFragment**: Added multi-day global usage summary with trailing averages, made event-based totals authoritative with `UsageStatsManager.queryAndAggregateUsageStats` as a fallback, surfaced today’s usage in the goal card, and persisted baseline averages when saving plans to fix underreported screen-time metrics during setup.

## 2025-09-26
- **EvaluationRepository**: Replaced target-app persistence with the global `ScreenTimePlan`, renamed public flows/APIs, refreshed DataStore keys, and reset cycle bookkeeping to support holistic screen-time evaluations.

- **UsageStatsUtils/History**: Stream sorted per-package totals into `HistoryViewModel`, introduce a dedicated adapter-backed list for today's usage in the history dashboard, and cull legacy summary code/logging for the retired top-app snippet.

- **Intervention UI**: Removed the goal-exceeded callouts, neutralized completion accessibility text, and preserved color-only feedback so the monitoring screen no longer surfaces percentage-over-goal messaging.

- **Build Tooling**: Relaxed release keystore checks for debug/analysis tasks, added env/local.properties credential resolution, gated release signing on task intent, refreshed `buildoutput.md` with a successful `assembleDebug` run, and documented secret setup expectations.

## 2025-09-27
- **UsageStatsUtils**: Rebuilt the utility with cleaned event pairing, eliminated verbose diagnostics, and kept TodayUsageCalculator parity ahead of upcoming dropdown/icon work.
- **History UI**: Renamed the usage dropdown label to "App usage", surfaced native app icons in today’s usage list, and replaced the exposed dropdown with a modal selector (read-only field, lifecycle-safe dialog) to eliminate popup ghosts when returning to the screen.
- **Security/Tooling**: Hardened repository hygiene by expanding root and module `.gitignore` coverage, removed plaintext keystore password fallbacks in `app/build.gradle.kts` in favour of mandatory env vars, ran `./gradlew --no-daemon assembleDebug --stacktrace` with temp secrets to verify, and rewrote `README.md` with architecture, setup, and research context suitable for GitHub.

## 2025-09-28
- **UsageMonitoringWorker/Notifications**: Reworked cycle termination to hand off to the scheduler at the next-day boundary, added multi-threshold (80%/90%) alerts with persisted deduping, and deferred monitoring runs until the next cycle start timestamp is reached.
- **MonitoringSchedulerWorker**: Enforced SSA flow by respecting `NEXT_CYCLE_START_TIME`, actually enqueuing monitoring work, and centralising delay computation so the adaptive loop never races past the calendar day.
- **InterventionViewModel**: Routed worker bootstrapping through an optional initial delay to avoid expedited jobs with scheduling windows and kept the UI in `Preparing` while a future cycle window is pending.
- **NotificationUtils**: Scheduled cycle-complete notifications for 7:30 AM via a dedicated WorkManager job and introduced `EvaluationCycleNotificationWorker` alongside a calendar helper for next-day time targeting.
- **Splash/Session**: Added a suspend `awaitSession()` bridge so the splash flow waits for hydrated user metadata, ensuring brand-new FLEXIBLE users hit the stakes setup immediately instead of on the second launch.
