package com.niyaz.zario.domain

import com.niyaz.zario.Constants
import com.niyaz.zario.data.Condition

object PointsCalculator {

    fun calculateDelta(
        condition: Condition,
        metGoal: Boolean,
        flexibleReward: Int? = null,
        flexiblePenalty: Int? = null
    ): Int {
        return when (condition) {
            Condition.CONTROL -> if (metGoal) Constants.CONTROL_REWARD else -Constants.CONTROL_PENALTY
            Condition.DEPOSIT -> if (metGoal) Constants.DEPOSIT_REWARD else -Constants.DEPOSIT_PENALTY
            Condition.FLEXIBLE -> {
                val reward = flexibleReward ?: Constants.FLEXIBLE_REWARD
                val penalty = flexiblePenalty ?: Constants.FLEXIBLE_PENALTY
                if (metGoal) reward else -penalty
            }
        }
    }
}
