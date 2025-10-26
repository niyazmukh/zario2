package com.niyaz.zario.domain

import com.niyaz.zario.Constants
import com.niyaz.zario.data.Condition
import org.junit.Assert.assertEquals
import org.junit.Test

class PointsCalculatorTest {

    @Test
    fun `calculateDelta returns rewards for control when goal met`() {
        val delta = PointsCalculator.calculateDelta(
            condition = Condition.CONTROL,
            metGoal = true
        )

        assertEquals(Constants.CONTROL_REWARD, delta)
    }

    @Test
    fun `calculateDelta returns penalty for control when goal missed`() {
        val delta = PointsCalculator.calculateDelta(
            condition = Condition.CONTROL,
            metGoal = false
        )

        assertEquals(-Constants.CONTROL_PENALTY, delta)
    }

    @Test
    fun `calculateDelta returns rewards for deposit when goal met`() {
        val delta = PointsCalculator.calculateDelta(
            condition = Condition.DEPOSIT,
            metGoal = true
        )

        assertEquals(Constants.DEPOSIT_REWARD, delta)
    }

    @Test
    fun `calculateDelta returns penalty for deposit when goal missed`() {
        val delta = PointsCalculator.calculateDelta(
            condition = Condition.DEPOSIT,
            metGoal = false
        )

        assertEquals(-Constants.DEPOSIT_PENALTY, delta)
    }

    @Test
    fun `calculateDelta uses flexible reward when provided`() {
        val delta = PointsCalculator.calculateDelta(
            condition = Condition.FLEXIBLE,
            metGoal = true,
            flexibleReward = 150
        )

        assertEquals(150, delta)
    }

    @Test
    fun `calculateDelta uses default flexible reward when not provided`() {
        val delta = PointsCalculator.calculateDelta(
            condition = Condition.FLEXIBLE,
            metGoal = true
        )

        assertEquals(Constants.FLEXIBLE_REWARD, delta)
    }

    @Test
    fun `calculateDelta uses flexible penalty when provided`() {
        val delta = PointsCalculator.calculateDelta(
            condition = Condition.FLEXIBLE,
            metGoal = false,
            flexiblePenalty = 90
        )

        assertEquals(-90, delta)
    }

    @Test
    fun `calculateDelta uses default flexible penalty when not provided`() {
        val delta = PointsCalculator.calculateDelta(
            condition = Condition.FLEXIBLE,
            metGoal = false
        )

        assertEquals(-Constants.FLEXIBLE_PENALTY, delta)
    }

    @Test
    fun `calculateDelta returns zero for benchmark when goal met`() {
        val delta = PointsCalculator.calculateDelta(
            condition = Condition.BENCHMARK,
            metGoal = true
        )
        assertEquals(0, delta)
    }

    @Test
    fun `calculateDelta returns zero for benchmark when goal missed`() {
        val delta = PointsCalculator.calculateDelta(
            condition = Condition.BENCHMARK,
            metGoal = false
        )
        assertEquals(0, delta)
    }
}
