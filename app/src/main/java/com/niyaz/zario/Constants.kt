package com.niyaz.zario

object Constants {
	// Logging tags
	const val LOG_TAG_EVALUATION_REPOSITORY = "EvaluationRepository"
	const val LOG_TAG_TARGET_FRAGMENT = "TargetFragment"
	const val LOG_TAG_PERMISSIONS = "PermissionsFragment"
	const val LOG_TAG_INTERVENTION_VIEWMODEL = "InterventionViewModel"

	// Notification channels & identifiers
	const val NOTIFICATION_CHANNEL_ID_EVALUATION_ALERTS = "minutes_evaluation_alerts"
	const val NOTIFICATION_CHANNEL_ID_SYNC_ALERTS = "minutes_sync_alerts"
	const val NOTIFICATION_ID_USAGE_THRESHOLD = 2001
	const val NOTIFICATION_ID_SYNC_FAILURE = 2002
	const val NOTIFICATION_ID_EVALUATION_COMPLETE = 2003

	// Time conversions and limits
	const val MILLISECONDS_PER_SECOND = 1_000L
	const val SECONDS_PER_MINUTE = 60L
	const val MINUTES_PER_HOUR = 60L
	const val HOURS_PER_DAY = 24
	const val MS_TO_MINUTES_DIVISOR = 60_000L
	const val MS_TO_HOURS_DIVISOR = 3_600_000L

	const val MIN_USAGE_THRESHOLD_MS = 30L * 60_000L // 30 minutes minimum baseline
	const val GOAL_REDUCTION_RATIO = 0.8 // Target 20% reduction by default

	// Worker scheduling thresholds (seconds)
	val USAGE_NOTIFICATION_THRESHOLDS = listOf(50, 75, 90)
	const val MAX_WORKER_RETRIES = 3
	const val WORKER_IDLE_INTERVAL_SECONDS = 900L   // 15 minutes
	const val WORKER_ACTIVE_INTERVAL_SECONDS = 300L   // 5 minutes
	const val WORKER_CRITICAL_INTERVAL_SECONDS = 100L // 1.6 minutes
	const val WORKER_NIGHT_INTERVAL_SECONDS = 1_800L  // 30 minutes

		// Usage progress thresholds
		const val PROGRESS_MAX_PERCENTAGE = 100f

	// Analysis windows
	const val USAGE_ANALYSIS_DAYS = 7

	// Points & incentives
	// const val CONTROL_REWARD = 20
	// const val CONTROL_PENALTY = 10
	// const val DEPOSIT_REWARD = 30
	// const val DEPOSIT_PENALTY = 30
	// const val FLEXIBLE_REWARD = 5
	// const val FLEXIBLE_PENALTY = 20
	// const val FLEXIBLE_REWARD_MIN = 0
	// const val FLEXIBLE_REWARD_MAX = 10
	// const val FLEXIBLE_PENALTY_MIN = 0
	// const val FLEXIBLE_PENALTY_MAX = 40
	// const val MAX_POINTS = 10_000

	// Points & incentives
	const val CONTROL_REWARD = 10
	const val CONTROL_PENALTY = 0
	const val DEPOSIT_REWARD = 10
	const val DEPOSIT_PENALTY = 40
	const val BENCHMARK_REWARD = 0
	const val BENCHMARK_PENALTY = 0
	const val FLEXIBLE_REWARD = 5
	const val FLEXIBLE_PENALTY = 20
	const val FLEXIBLE_REWARD_MIN = 0
	const val FLEXIBLE_REWARD_MAX = 10
	const val FLEXIBLE_PENALTY_MIN = 0
	const val FLEXIBLE_PENALTY_MAX = 40
	const val MAX_POINTS = 10_000

	// History & presentation
	const val HISTORY_DATE_FORMAT = "MMM d, yyyy"

	// Authentication & profile constraints
	const val MIN_PASSWORD_LENGTH = 8
	const val MIN_BIRTH_YEAR = 1900

	// Support channels
	const val CONTACT_EMAIL_SUPPORT = "nmukhame@campus.haifa.ac.il"
}

