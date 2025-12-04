package com.niyaz.zario.data

import com.niyaz.zario.Constants

data class User(
    val email: String,
    val id: String = "",
    val yearOfBirth: String,
    val gender: String,
    val condition: Condition = Condition.CONTROL,
    val points: Int = 840,
    val hasNotificationPermission: Boolean = false,
    val hasUsageStatsPermission: Boolean = false,
    val flexibleReward: Int = Constants.FLEXIBLE_REWARD,
    val flexiblePenalty: Int = Constants.FLEXIBLE_PENALTY,
    val hasSetFlexibleStakes: Boolean = false
)

data class UserSession(
    val isLoggedIn: Boolean = false,
    val user: User? = null,
    val hasCompletedIntro: Boolean = false
)
