package com.niyaz.zario.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StringRes
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.niyaz.zario.Constants
import com.niyaz.zario.R
import com.niyaz.zario.data.Condition
import com.niyaz.zario.databinding.FragmentProfileBinding
import com.niyaz.zario.ui.profile.adapter.ProfileCyclesAdapter
import dagger.hilt.android.AndroidEntryPoint
import java.text.NumberFormat
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ProfileViewModel by viewModels()
    private lateinit var cyclesAdapter: ProfileCyclesAdapter
    private val numberFormatter: NumberFormat = NumberFormat.getIntegerInstance()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecycler()
        DebugProfileActions.setupDebugControls(this, binding)
        observeUiState()
    }

    private fun setupRecycler() {
        cyclesAdapter = ProfileCyclesAdapter()
        binding.recyclerCycles.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = cyclesAdapter
            val spacing = resources.getDimensionPixelSize(R.dimen.spacing_sm)
            if (itemDecorationCount == 0) {
                addItemDecoration(VerticalSpacingItemDecoration(spacing))
            }
        }
    }

    private fun observeUiState() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { state ->
                    renderState(state)
                }
            }
        }
    }

    private fun renderState(state: ProfileViewModel.ProfileUiState) {
        val hasUser = state.email.isNotBlank()
        val hasCycles = state.cycles.isNotEmpty()

        binding.progressLoading.isVisible = state.isLoading
        binding.cardSummary.isVisible = hasUser && !state.isLoading
        binding.tvCycleListTitle.isVisible = hasUser && !state.isLoading

        if (!state.isLoading && hasUser) {
            binding.tvEmail.text = state.email
            binding.tvDaysSinceSignup.text = numberFormatter.format(state.daysSinceSignup)
            binding.tvCyclesMet.text = getString(
                R.string.profile_cycles_summary,
                numberFormatter.format(state.cyclesMet),
                numberFormatter.format(state.cyclesElapsed)
            )
            val totalPointsText = state.totalPoints?.let(numberFormatter::format)
                ?: getString(R.string.points_not_applicable)
            binding.tvTotalPoints.text = totalPointsText
            binding.tvCycleListTitle.text = getString(
                R.string.profile_cycle_list_title_with_total,
                numberFormatter.format(state.cyclesElapsed)
            )

            val conditionText = buildConditionDescription(state)
            binding.tvConditionPoints.isVisible = conditionText != null
            if (conditionText != null) {
                binding.tvConditionPoints.text = conditionText
            }
        } else {
            binding.tvCycleListTitle.text = getString(R.string.profile_cycle_list_title)
        }

        binding.recyclerCycles.isVisible = hasUser && !state.isLoading && hasCycles
        binding.tvEmptyCycles.isVisible = hasUser && !state.isLoading && !hasCycles

        cyclesAdapter.submitList(state.cycles)
    }

    private fun buildConditionDescription(state: ProfileViewModel.ProfileUiState): String? {
        return when (state.condition) {
            Condition.CONTROL -> buildConditionText(
                R.string.condition_points_control,
                Constants.CONTROL_REWARD,
                Constants.CONTROL_PENALTY
            )
            Condition.DEPOSIT -> buildConditionText(
                R.string.condition_points_deposit,
                Constants.DEPOSIT_REWARD,
                Constants.DEPOSIT_PENALTY
            )
            Condition.BENCHMARK -> null
            Condition.FLEXIBLE -> {
                val reward = state.flexibleReward ?: Constants.FLEXIBLE_REWARD
                val penalty = state.flexiblePenalty ?: Constants.FLEXIBLE_PENALTY
                buildConditionText(R.string.condition_points_flexible, reward, penalty)
            }
            null -> null
        }
    }

    private fun buildConditionText(@StringRes templateRes: Int, reward: Int, penalty: Int): String {
        val rewardText = resources.getQuantityString(R.plurals.points_quantity, reward, reward)
        val penaltyText = resources.getQuantityString(R.plurals.points_quantity, penalty, penalty)
        return getString(templateRes, rewardText, penaltyText)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private class VerticalSpacingItemDecoration(
        private val spacing: Int
    ) : RecyclerView.ItemDecoration() {
        override fun getItemOffsets(
            outRect: android.graphics.Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
        ) {
            if (parent.getChildAdapterPosition(view) > 0) {
                outRect.top = spacing
            }
        }
    }
}
