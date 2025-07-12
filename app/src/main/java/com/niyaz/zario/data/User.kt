package com.niyaz.zario.data

import com.niyaz.zario.Constants

data class User(
    val email: String,
    val yearOfBirth: String,
    val gender: String,
    val condition: Condition = Condition.CONTROL,
    val points: Int = 100,
    val hasNotificationPermission: Boolean = false,
    val hasUsageStatsPermission: Boolean = false,
    // Custom stakes for FLEXIBLE condition users
    val flexibleReward: Int = Constants.FLEXIBLE_REWARD, // Default from constants
    val flexiblePenalty: Int = Constants.FLEXIBLE_PENALTY, // Default from constants
    val hasSetFlexibleStakes: Boolean = false // Track if user has configured custom stakes
)

data class UserSession(
    val isLoggedIn: Boolean = false,
    val user: User? = null
) 