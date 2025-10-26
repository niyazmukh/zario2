package com.niyaz.zario.ui.profile

import android.util.Log
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.google.android.material.snackbar.Snackbar
import com.niyaz.zario.BuildFlags
import com.niyaz.zario.R
import com.niyaz.zario.core.evaluation.EvaluationRepository
import com.niyaz.zario.core.evaluation.EvaluationResultProcessor
import com.niyaz.zario.core.evaluation.storage.PlanPreferencesDataSource
import com.niyaz.zario.core.usage.UsageStatsRepository
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.databinding.FragmentProfileBinding
import com.niyaz.zario.utils.CalendarUtils
import com.niyaz.zario.worker.MonitoringWorkScheduler
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.launch

object DebugProfileActions {

    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface Dependencies {
        fun evaluationRepository(): EvaluationRepository
        fun usageStatsRepository(): UsageStatsRepository
        fun evaluationResultProcessor(): EvaluationResultProcessor
        fun monitoringWorkScheduler(): MonitoringWorkScheduler
        fun planPreferencesDataSource(): PlanPreferencesDataSource
    }

    fun setupDebugControls(fragment: ProfileFragment, binding: FragmentProfileBinding) {
        val debugButton = binding.btnSimulateCycleCompletion
        if (!BuildFlags.isDebug) {
            debugButton.isVisible = false
            return
        }

        val deps = EntryPointAccessors.fromApplication(
            fragment.requireContext().applicationContext,
            Dependencies::class.java
        )

        val debugger = CycleSimulationTool(
            deps.evaluationRepository(),
            deps.usageStatsRepository(),
            deps.evaluationResultProcessor(),
            deps.monitoringWorkScheduler(),
            deps.planPreferencesDataSource()
        )

        debugButton.isVisible = true
        debugButton.setOnClickListener {
            debugButton.isEnabled = false
            fragment.viewLifecycleOwner.lifecycleScope.launch {
                try {
                    when (val outcome = debugger.simulateCycleCompletion()) {
                        is CycleSimulationTool.Outcome.Success -> {
                            Snackbar.make(
                                binding.root,
                                fragment.getString(R.string.profile_debug_simulate_cycle_success),
                                Snackbar.LENGTH_LONG
                            ).show()
                        }
                        CycleSimulationTool.Outcome.NoPlan -> {
                            Snackbar.make(
                                binding.root,
                                fragment.getString(R.string.profile_debug_simulate_cycle_no_plan),
                                Snackbar.LENGTH_LONG
                            ).show()
                        }
                        is CycleSimulationTool.Outcome.Failure -> {
                            val reason = outcome.cause.localizedMessage
                                ?.takeIf { it.isNotBlank() }
                                ?: outcome.cause.javaClass.simpleName
                            Snackbar.make(
                                binding.root,
                                fragment.getString(R.string.profile_debug_simulate_cycle_failure, reason),
                                Snackbar.LENGTH_LONG
                            ).show()
                        }
                    }
                } finally {
                    debugButton.isEnabled = true
                }
            }
        }
    }

    private class CycleSimulationTool(
        private val evaluationRepository: EvaluationRepository,
        private val usageStatsRepository: UsageStatsRepository,
        private val resultProcessor: EvaluationResultProcessor,
        private val monitoringWorkScheduler: MonitoringWorkScheduler,
        private val planPreferencesDataSource: PlanPreferencesDataSource
    ) {

        sealed class Outcome {
            data class Success(val evaluationEndTime: Long) : Outcome()
            object NoPlan : Outcome()
            data class Failure(val cause: Throwable) : Outcome()
        }

        suspend fun simulateCycleCompletion(): Outcome {
            val existingPlan = evaluationRepository.getCurrentPlan()
                ?: return Outcome.NoPlan

            return runCatching {
                val activePlan = ensureEvaluationStart(existingPlan)
                val start = requireNotNull(activePlan.evaluationStartTime) {
                    "Evaluation start time missing after initialization"
                }

                val completionTime = CalendarUtils.getEndOfDay(start)
                val usageSnapshot = usageStatsRepository.getSnapshot(forceRefresh = true)
                val hourlyBuckets = runCatching {
                    usageStatsRepository.getUsageBuckets(
                        start,
                        completionTime,
                        TimeUnit.HOURS.toMillis(1)
                    )
                }.getOrElse { error ->
                    Log.w(TAG, "Failed to fetch hourly usage for simulation", error)
                    emptyList()
                }

                resultProcessor.finalizeCycle(
                    plan = activePlan,
                    finalUsageMs = usageSnapshot.totalUsageMs,
                    evaluationStartTime = start,
                    evaluationEndTime = completionTime,
                    hourlyUsage = hourlyBuckets
                )

                monitoringWorkScheduler.enqueueScheduler()

                Outcome.Success(completionTime)
            }.getOrElse { throwable ->
                Log.e(TAG, "Cycle simulation failed", throwable)
                Outcome.Failure(throwable)
            }
        }

        private suspend fun ensureEvaluationStart(plan: ScreenTimePlan): ScreenTimePlan {
            val existingStart = plan.evaluationStartTime
            if (existingStart != null) return plan

            val snapshot = planPreferencesDataSource.latest()
            val forcedStart = snapshot.nextCycleStartTime
                ?: CalendarUtils.getStartOfDay(System.currentTimeMillis())

            planPreferencesDataSource.markEvaluationStarted(forcedStart)
            return plan.copy(evaluationStartTime = forcedStart)
        }
    }

    private const val TAG = "CycleSimulationDebugger"
}
