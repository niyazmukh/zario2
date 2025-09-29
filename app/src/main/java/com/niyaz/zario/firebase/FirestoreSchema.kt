package com.niyaz.zario.firebase

internal object FirestoreCollections {
    const val USERS = "users"
    const val EVALUATION_HISTORY = "evaluation_history"
    const val HOURLY_USAGE = "hourly_usage"
    const val LIVE_USAGE = "live_usage"
    const val HOURLY_PACKAGES = "packages"
}

internal object FirestoreFields {
    const val EMAIL = "email"
    const val YEAR_OF_BIRTH = "yearOfBirth"
    const val GENDER = "gender"
    const val CONDITION = "condition"
    const val POINTS_BALANCE = "pointsBalance"
    const val FLEXIBLE_REWARD = "flexibleReward"
    const val FLEXIBLE_PENALTY = "flexiblePenalty"
    const val HAS_SET_FLEXIBLE_STAKES = "hasSetFlexibleStakes"
    const val GOAL_SUCCESS_STREAK = "goalSuccessStreak"
    const val PLAN = "plan"
}

internal object FirestoreDefaults {
    const val INITIAL_POINTS_BALANCE = 100
}
