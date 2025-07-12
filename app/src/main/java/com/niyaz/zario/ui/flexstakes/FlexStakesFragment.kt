package com.niyaz.zario.ui.flexstakes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.slider.Slider
import com.niyaz.zario.R
import com.niyaz.zario.Constants
import com.niyaz.zario.databinding.FragmentFlexstakesBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FlexStakesFragment : Fragment() {

    private var _binding: FragmentFlexstakesBinding? = null
    private val binding get() = _binding!!

    private val viewModel: FlexStakesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFlexstakesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupHeader()
        setupSliders()
        setupClickListeners()
        observeViewModel()
        
        // Enable continue button by default since sliders always have valid values
        updateContinueButtonState()
    }

    private fun setupHeader() {
        binding.tvScreenTitle.text = getString(R.string.flexstakes_title)
        binding.tvScreenSubtitle.text = getString(R.string.flexstakes_subtitle)
    }

    private fun setupSliders() {
        // Setup reward slider
        binding.sliderReward.apply {
            valueFrom = Constants.FLEXIBLE_REWARD_MIN.toFloat()
            valueTo = Constants.FLEXIBLE_REWARD_MAX.toFloat()
            stepSize = 1f
            value = (Constants.FLEXIBLE_REWARD_MAX / 2).toFloat() // Default to middle value (5)
            
            addOnChangeListener { _, value, _ ->
                updateRewardValueDisplay(value.toInt())
                updateContinueButtonState()
            }
        }
        
        // Setup penalty slider (RTL layout: 40 on left, 0 on right)
        binding.sliderPenalty.apply {
            valueFrom = Constants.FLEXIBLE_PENALTY_MIN.toFloat()
            valueTo = Constants.FLEXIBLE_PENALTY_MAX.toFloat()
            stepSize = 1f
            value = (Constants.FLEXIBLE_PENALTY_MAX / 2).toFloat() // Default to middle value (20)
            
            addOnChangeListener { _, value, _ ->
                // With RTL layout, the slider value directly corresponds to the visual position
                // Leftmost position (visually 40) = value 40, Rightmost position (visually 0) = value 0
                updatePenaltyValueDisplay(value.toInt())
                updateContinueButtonState()
            }
        }
        
        // Initialize value displays
        updateRewardValueDisplay(binding.sliderReward.value.toInt())
        updatePenaltyValueDisplay(binding.sliderPenalty.value.toInt())
    }

    private fun updateRewardValueDisplay(value: Int) {
        binding.tvRewardValue.text = getString(R.string.flexstakes_reward_value, value)
        binding.tvRewardValue.setTextColor(requireContext().getColor(R.color.evaluation_success))
    }

    private fun updatePenaltyValueDisplay(value: Int) {
        binding.tvPenaltyValue.text = getString(R.string.flexstakes_penalty_value, value)
        binding.tvPenaltyValue.setTextColor(requireContext().getColor(R.color.evaluation_exceeded))
    }

    private fun setupClickListeners() {
        binding.btnContinue.setOnClickListener {
            val reward = binding.sliderReward.value.toInt()
            val penalty = binding.sliderPenalty.value.toInt()
            viewModel.setFlexibleStakes(reward, penalty)
        }
    }

    private fun observeViewModel() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {
                    viewModel.result.collect { result ->
                        when (result) {
                            is FlexStakesResult.Idle -> {
                                setLoadingState(false)
                            }
                            is FlexStakesResult.Loading -> {
                                setLoadingState(true)
                            }
                            is FlexStakesResult.Success -> {
                                setLoadingState(false)
                                navigateToPermissions()
                            }
                            is FlexStakesResult.Error -> {
                                setLoadingState(false)
                                Snackbar.make(binding.root, result.message, Snackbar.LENGTH_LONG).show()
                            }
                        }
                    }
                }
            }
        }
    }

    private fun setLoadingState(isLoading: Boolean) {
        binding.btnContinue.isEnabled = !isLoading
        binding.sliderReward.isEnabled = !isLoading
        binding.sliderPenalty.isEnabled = !isLoading
        
        binding.btnContinue.text = if (isLoading) {
            getString(R.string.auth_signing_in)
        } else {
            getString(R.string.flexstakes_continue_button)
        }
    }

    private fun updateContinueButtonState() {
        // Sliders always have valid values, so button is always enabled (unless loading)
        binding.btnContinue.isEnabled = true
        binding.btnContinue.text = getString(R.string.flexstakes_continue_button)
    }

    private fun navigateToPermissions() {
        if (isAdded) {
            findNavController().navigate(R.id.action_flexstakes_to_permissions)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
} 