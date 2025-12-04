package com.niyaz.zario.ui.intro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.checkbox.MaterialCheckBox
import com.niyaz.zario.R
import com.niyaz.zario.data.Condition
import com.niyaz.zario.Constants
import com.niyaz.zario.databinding.FragmentIntroBinding
import androidx.core.view.isVisible
import com.niyaz.zario.repository.UserSessionRepository
import com.niyaz.zario.utils.navigateSafely
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class IntroFragment : Fragment() {

    private var _binding: FragmentIntroBinding? = null
    private val binding get() = _binding!!

    @Inject lateinit var sessionRepository: UserSessionRepository

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIntroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeUi()
        observeSession()
    }

    private fun initializeUi() {
        binding.btnContinue.isEnabled = false
        binding.checkboxAcknowledged.setOnCheckedChangeListener { _, isChecked ->
            binding.btnContinue.isEnabled = isChecked
        }
        binding.btnContinue.setOnClickListener {
            viewLifecycleOwner.lifecycleScope.launch {
                sessionRepository.markIntroCompleted()
                findNavController().navigateSafely(R.id.action_intro_to_target)
            }
        }
    }

    private fun observeSession() {
        viewLifecycleOwner.lifecycleScope.launch {
            sessionRepository.session.collectLatest { session ->
                val user = session.user
                val condition = user?.condition

                // Generic description goes under "Your daily goal" and depends only on BENCHMARK vs others
                val genericDescription = if (condition == Condition.BENCHMARK) {
                    getString(R.string.intro_point_progress_benchmark)
                } else {
                    getString(R.string.intro_point_progress_points)
                }

                // Condition-specific description stays in the Points section (only for non-benchmark conditions)
                val pointsDescription = when (condition) {
                    Condition.CONTROL -> buildIntroConditionDescription(R.string.intro_condition_control, Constants.CONTROL_REWARD, Constants.CONTROL_PENALTY)
                    Condition.DEPOSIT -> buildIntroConditionDescription(R.string.intro_condition_deposit, Constants.DEPOSIT_REWARD, Constants.DEPOSIT_PENALTY)
                    Condition.FLEXIBLE -> {
                        val reward = user?.flexibleReward ?: Constants.FLEXIBLE_REWARD
                        val penalty = user?.flexiblePenalty ?: Constants.FLEXIBLE_PENALTY
                        buildIntroConditionDescription(R.string.intro_condition_flexible, reward, penalty)
                    }
                    else -> getString(R.string.intro_point_progress_points)
                }

                // Set the texts in the two places
                binding.tvGoalProgressSubtext.text = genericDescription
                binding.tvPointProgress.text = pointsDescription

                // Hide the full Points section for BENCHMARK users
                val showPointsSection = condition != Condition.BENCHMARK
                binding.tvPointProgressHeader.isVisible = showPointsSection
                binding.tvPointProgress.isVisible = showPointsSection
            }
        }
    }

    private fun buildIntroConditionDescription(templateRes: Int, reward: Int, penalty: Int): String {
        val rewardText = resources.getQuantityString(R.plurals.points_quantity, reward, reward)
        val penaltyText = resources.getQuantityString(R.plurals.points_quantity, penalty, penalty)
        return getString(templateRes, rewardText, penaltyText)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
