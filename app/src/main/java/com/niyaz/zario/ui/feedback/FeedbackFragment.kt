package com.niyaz.zario.ui.feedback

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.OvershootInterpolator
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.niyaz.zario.R
import com.niyaz.zario.databinding.FragmentFeedbackBinding
import com.niyaz.zario.core.evaluation.EvaluationRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

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
        viewLifecycleOwner.lifecycleScope.launch {
            evaluationRepository.markFeedbackViewed()
        }
        
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
            
            // Animate goal status with celebration effect
            animateGoalStatus(tvGoalStatus, feedbackData.goalMet)

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
            
            // Animate points change
            animatePointsChange(tvPointsChange, feedbackData.pointsChange >= 0)

            // Goal Streak
            tvGoalStreak.text = if (feedbackData.goalStreak > 0) {
                getString(R.string.feedback_goal_streak, feedbackData.goalStreak)
            } else {
                getString(R.string.feedback_goal_streak_none)
            }
            
            // Animate streak if positive
            if (feedbackData.goalStreak > 0) {
                animateStreak(tvGoalStreak)
            }
        }
    }
    
    /**
     * Animates the goal status text with a celebration bounce effect.
     * Uses OvershootInterpolator for a delightful overshoot animation.
     */
    private fun animateGoalStatus(view: View, isSuccess: Boolean) {
        // Reset scale to 0 for animation
        view.scaleX = 0f
        view.scaleY = 0f
        view.alpha = 0f
        
        // Create scale animations
        val scaleX = ObjectAnimator.ofFloat(view, "scaleX", 0f, 1f)
        val scaleY = ObjectAnimator.ofFloat(view, "scaleY", 0f, 1f)
        val alpha = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        
        // Use stronger overshoot for success (celebratory), subtle for miss
        val overshootTension = if (isSuccess) 2.0f else 1.0f
        val interpolator = OvershootInterpolator(overshootTension)
        
        AnimatorSet().apply {
            playTogether(scaleX, scaleY, alpha)
            duration = 600
            this.interpolator = interpolator
            startDelay = 100
            start()
        }
    }
    
    /**
     * Animates the points change text with a subtle bounce.
     */
    private fun animatePointsChange(view: View, isPositive: Boolean) {
        view.scaleX = 0f
        view.scaleY = 0f
        view.alpha = 0f
        
        val scaleX = ObjectAnimator.ofFloat(view, "scaleX", 0f, 1f)
        val scaleY = ObjectAnimator.ofFloat(view, "scaleY", 0f, 1f)
        val alpha = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        
        val overshootTension = if (isPositive) 1.5f else 0.5f
        
        AnimatorSet().apply {
            playTogether(scaleX, scaleY, alpha)
            duration = 500
            interpolator = OvershootInterpolator(overshootTension)
            startDelay = 300
            start()
        }
    }
    
    /**
     * Animates the streak text with a gentle bounce.
     */
    private fun animateStreak(view: View) {
        view.scaleX = 0f
        view.scaleY = 0f
        view.alpha = 0f
        
        val scaleX = ObjectAnimator.ofFloat(view, "scaleX", 0f, 1f)
        val scaleY = ObjectAnimator.ofFloat(view, "scaleY", 0f, 1f)
        val alpha = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        
        AnimatorSet().apply {
            playTogether(scaleX, scaleY, alpha)
            duration = 450
            interpolator = OvershootInterpolator(1.2f)
            startDelay = 500
            start()
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