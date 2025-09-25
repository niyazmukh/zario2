package com.niyaz.zario

/**
 * Application-wide constants for configuration values.
 * 
 * IMPORTANT: This file is for BUSINESS LOGIC constants only.
 * 
 * DO NOT PUT HERE:
 * - Layout spacing/dimensions (use dimens.xml unified spacing system)
 * - UI colors (use colors.xml)
 * - String resources (use strings.xml)
 * - Drawable references (use drawable resources)
 * 
 * PUT HERE:
 * - Authentication rules (password length, delays)
 * - Business logic thresholds (usage limits, percentages)
 * - Configuration values (timeouts, retry counts)
 * - Points system values (rewards, penalties)
 * - Validation rules (min/max values)
 * - Logging tags
 * - Date/time formats
 * 
 * Layout spacing should use the unified system in dimens.xml:
 * - spacing_xs (4dp), spacing_sm (8dp), spacing_md (16dp)
 * - spacing_lg (24dp), spacing_xl (32dp), spacing_xxl (48dp)
 * - Component dimensions: button_height_primary, icon_size_standard, etc.
 */
object Constants {
    
    // Authentication
    const val MIN_PASSWORD_LENGTH = 8
    const val MIN_BIRTH_YEAR = 1900
    const val AUTH_DELAY_MS = 1500L
    
    // Usage Statistics
    const val USAGE_ANALYSIS_DAYS = 7
    const val MIN_USAGE_THRESHOLD_MS = 60_000L // 1 minute
    const val TOP_APPS_COUNT = 3
    const val HOURS_PER_DAY = 24
    const val MINUTES_PER_HOUR = 60
    const val SECONDS_PER_MINUTE = 60
    const val MILLISECONDS_PER_SECOND = 1000L
    
    // Date Time
    const val DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss"
    
    // UI
    const val LOADING_DELAY_MS = 300L
    const val CARD_STROKE_WIDTH_SELECTED = 2
    const val CARD_STROKE_WIDTH_UNSELECTED = 1
    const val GOAL_REDUCTION_RATIO = 0.8 // 80% reduction from current usage
    const val ARRAY_INDEX_PRIMARY_COLOR = 0
    const val ARRAY_INDEX_OUTLINE_COLOR = 1
    
    // Text Styling Guidelines (for documentation)
    // Use Material Design text appearances for semantic consistency:
    // - Screen titles: textAppearanceHeadlineMedium
    // - Screen subtitles: textAppearanceBodyLarge 
    // - Body text: textAppearanceBodyMedium
    // - Card titles: textAppearanceTitleMedium
    // - Small labels: textAppearanceBodySmall
    // - Button text: textAppearanceLabelLarge (default for MaterialButton)
    // - Status indicators: textAppearanceLabelLarge
    // Avoid custom textSize values - use semantic text appearances instead
    
    // Time calculation constants (for time formatting)
    const val MS_TO_HOURS_DIVISOR = 1000 * 60 * 60
    const val MS_TO_MINUTES_DIVISOR = 1000 * 60
    
    // Evaluation Cycle
    const val EVALUATION_DURATION_MS = 24 * 60 * 60 * 1000L // 24 hours (DEPRECATED: now using calendar days via CalendarUtils)
    const val MAX_WORKER_RETRIES = 3 // Maximum retries for failed workers
    
    // Adaptive Timing Intervals (for smart monitoring)
    const val WORKER_ACTIVE_INTERVAL_SECONDS = 60L // When target app is active (1 minute)
    const val WORKER_IDLE_INTERVAL_SECONDS = 300L // When target app is idle (5 minutes)
    const val WORKER_CRITICAL_INTERVAL_SECONDS = 30L // Near goal threshold (80%+) (30 seconds)
    const val WORKER_NIGHT_INTERVAL_SECONDS = 600L // Night hours (10 minutes)
    
    // Progress Display
    const val PROGRESS_MAX_PERCENTAGE = 100f // Maximum percentage for UI display
    const val USAGE_PERCENTAGE_PRECISION = 1 // Decimal places for percentage display
    
    // UI Color Thresholds
    const val USAGE_ON_TRACK_THRESHOLD = 50f // Below this percentage shows "on track" color
    const val NOTIFICATION_THRESHOLD_PERCENTAGE = 0.8f // 80% threshold for notifications
    
    // Logging
    const val LOG_TAG_TARGET_VIEWMODEL = "TargetViewModel"
    const val LOG_TAG_AUTH_VIEWMODEL = "AuthViewModel"
    const val LOG_TAG_PERMISSIONS = "PermissionsFragment"
    const val LOG_TAG_TARGET_FRAGMENT = "TargetFragment"
    const val LOG_TAG_INTERVENTION_VIEWMODEL = "InterventionViewModel"
    const val LOG_TAG_USAGE_MONITORING = "UsageMonitoringWorker"
    const val LOG_TAG_EVALUATION_REPOSITORY = "EvaluationRepository"
    const val LOG_TAG_HISTORY_FRAGMENT = "HistoryFragment"
    const val LOG_TAG_HISTORY_VIEWMODEL = "HistoryViewModel"
    
    // History Screen
    const val HISTORY_DATE_FORMAT = "MMM dd, yyyy"
    
    // History Card Visual
    const val HISTORY_CARD_ELEVATION_SUCCESS = 2
    const val HISTORY_CARD_ELEVATION_EXCEEDED = 4
    const val HISTORY_BADGE_CORNER_RADIUS = 12

    // ------------------------------------------------------------------
    // Points System
    // ------------------------------------------------------------------
    const val MAX_POINTS = 1200

    // Control condition
    const val CONTROL_REWARD = 10
    const val CONTROL_PENALTY = 0

    // Deposit condition
    const val DEPOSIT_REWARD = 10
    const val DEPOSIT_PENALTY = 40

    // Flexible condition
    const val FLEXIBLE_REWARD = 0
    const val FLEXIBLE_PENALTY = 0
    
    // FlexStakes Input Validation
    const val FLEXIBLE_REWARD_MIN = 0
    const val FLEXIBLE_REWARD_MAX = 10
    const val FLEXIBLE_PENALTY_MIN = 0
    const val FLEXIBLE_PENALTY_MAX = 40
} 