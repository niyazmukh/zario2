package com.niyaz.zario.ui.feedback

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.niyaz.zario.R
import com.niyaz.zario.databinding.FragmentFeedbackBinding
import com.niyaz.zario.repository.EvaluationRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FeedbackFragment : Fragment() {

    private var _binding: FragmentFeedbackBinding? = null
    private val binding get() = _binding!!

    private val viewModel: FeedbackViewModel by viewModels()
    @Inject lateinit var evaluationRepository: EvaluationRepository

    private val backCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            // Navigate back to intervention screen
            navigateToIntervention()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requireActivity().onBackPressedDispatcher.addCallback(this, backCallback)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFeedbackBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        // Mark feedback as viewed when screen is displayed
        evaluationRepository.markFeedbackViewed()
        
        setupHeader()
        setupClickListeners()
        observeViewModel()
    }

    private fun setupHeader() {
        // Set header title and subtitle
        binding.tvScreenTitle.text = getString(R.string.feedback_title)
        binding.tvScreenSubtitle.text = getString(R.string.feedback_subtitle)
        
        // No back button in this header layout - navigation is handled by the continue button
    }

    private fun setupClickListeners() {
        binding.btnContinue.setOnClickListener {
            navigateToIntervention()
        }
    }

    private fun observeViewModel() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.feedbackData.collect { feedbackData ->
                    updateUI(feedbackData)
                }
            }
        }
    }

    private fun updateUI(feedbackData: FeedbackData) {
        if (feedbackData.isLoading) {
            // Show loading state if needed
            return
        }

        binding.apply {
            // Goal Status
            tvGoalStatus.text = if (feedbackData.goalMet) {
                getString(R.string.feedback_goal_met)
            } else {
                getString(R.string.feedback_goal_missed)
            }
            
            // Set goal status color
            val statusColor = if (feedbackData.goalMet) {
                requireContext().getColor(R.color.evaluation_success)
            } else {
                requireContext().getColor(R.color.evaluation_exceeded)
            }
            tvGoalStatus.setTextColor(statusColor)

            // Points Change
            tvPointsChange.text = if (feedbackData.pointsChange >= 0) {
                getString(R.string.feedback_points_earned, feedbackData.pointsChange)
            } else {
                getString(R.string.feedback_points_lost, kotlin.math.abs(feedbackData.pointsChange))
            }
            
            // Set points change color
            val pointsColor = if (feedbackData.pointsChange >= 0) {
                requireContext().getColor(R.color.evaluation_success)
            } else {
                requireContext().getColor(R.color.evaluation_exceeded)
            }
            tvPointsChange.setTextColor(pointsColor)

            // Goal Streak
            tvGoalStreak.text = if (feedbackData.goalStreak > 0) {
                getString(R.string.feedback_goal_streak, feedbackData.goalStreak)
            } else {
                getString(R.string.feedback_goal_streak_none)
            }
        }
    }

    private fun navigateToIntervention() {
        if (isAdded) {
            findNavController().navigate(R.id.action_feedback_to_intervention)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
} 