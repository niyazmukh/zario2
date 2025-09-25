package com.niyaz.zario.ui.history

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.niyaz.zario.Constants
import com.niyaz.zario.R
import com.niyaz.zario.databinding.FragmentHistoryBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.niyaz.zario.ui.history.adapter.EvaluationHistoryAdapter
import com.niyaz.zario.ui.history.adapter.TodayUsageAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import com.niyaz.zario.repository.UserSessionRepository
import com.niyaz.zario.utils.TimeUtils
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

@AndroidEntryPoint
class HistoryFragment : Fragment() {

    private var _binding: FragmentHistoryBinding? = null
    private val binding get() = _binding!!

    private val viewModel: HistoryViewModel by viewModels()
    private lateinit var adapter: EvaluationHistoryAdapter
    private lateinit var todayUsageAdapter: TodayUsageAdapter
    private var filterOptions: List<String> = emptyList()

    @Inject lateinit var sessionRepository: UserSessionRepository

    private val backCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            findNavController().popBackStack()
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
        _binding = FragmentHistoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        Log.d(Constants.LOG_TAG_HISTORY_FRAGMENT, "HistoryFragment onViewCreated")

        binding.root.isFocusableInTouchMode = true
        binding.root.requestFocus()

        setupRecyclerView()
        setupFilter()
        observeHistory()
        observeTodayUsage()
        
        // Show loading state initially
        showLoading()
    }

    private fun setupRecyclerView() {
        adapter = EvaluationHistoryAdapter()
        todayUsageAdapter = TodayUsageAdapter()
        binding.recyclerHistory.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = this@HistoryFragment.adapter
            
            // Add item decoration for better spacing
            val spacing = resources.getDimensionPixelSize(R.dimen.spacing_xs)
            addItemDecoration(object : androidx.recyclerview.widget.RecyclerView.ItemDecoration() {
                override fun getItemOffsets(
                    outRect: android.graphics.Rect,
                    view: View,
                    parent: androidx.recyclerview.widget.RecyclerView,
                    state: androidx.recyclerview.widget.RecyclerView.State
                ) {
                    outRect.bottom = spacing
                }
            })
        }

        binding.recyclerTodayUsage.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = todayUsageAdapter
            val spacing = resources.getDimensionPixelSize(R.dimen.spacing_xs)
            addItemDecoration(object : androidx.recyclerview.widget.RecyclerView.ItemDecoration() {
                override fun getItemOffsets(
                    outRect: android.graphics.Rect,
                    view: View,
                    parent: androidx.recyclerview.widget.RecyclerView,
                    state: androidx.recyclerview.widget.RecyclerView.State
                ) {
                    outRect.bottom = spacing
                }
            })
        }
    }

    private fun setupFilter() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.history.collect { list ->
                    updateFilterOptions(list)
                }
            }
        }

        binding.autoFilter.apply {
            isFocusable = false
            isFocusableInTouchMode = false
            isCursorVisible = false
            keyListener = null
            setOnClickListener { showFilterSelector() }
            setOnTouchListener { _, event ->
                if (event.action == MotionEvent.ACTION_UP) {
                    showFilterSelector()
                    return@setOnTouchListener true
                }
                false
            }
            setOnFocusChangeListener { _, hasFocus ->
                if (hasFocus) {
                    clearFocus()
                }
            }
        }

        binding.tilFilter.setEndIconOnClickListener {
            showFilterSelector()
        }
    }

    private fun updateFilterOptions(historyList: List<com.niyaz.zario.data.local.entities.EvaluationHistoryEntry>) {
        val planLabels = historyList.map { it.planLabel }.distinct().sorted()
        filterOptions = listOf(getString(R.string.history_filter_all)) + planLabels

        val currentFilter = viewModel.filterLabel.value
        val resolvedSelection = currentFilter ?: getString(R.string.history_filter_all)

        if (!filterOptions.contains(resolvedSelection)) {
            viewModel.setFilter(null)
            binding.autoFilter.setText(getString(R.string.history_filter_all))
        } else {
            if (binding.autoFilter.text.toString() != resolvedSelection) {
                binding.autoFilter.setText(resolvedSelection)
            }
        }
    }

    private fun observeHistory() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.history.collect { historyList ->
                    Log.d(Constants.LOG_TAG_HISTORY_FRAGMENT, "History updated: ${historyList.size} entries")

                    hideLoading()
                    
                    if (historyList.isEmpty()) {
                        showEmptyState()
                    } else {
                        showHistoryContent(historyList)
                    }
                    
                    adapter.submitList(historyList)
                }
            }
        }
    }

    private fun observeTodayUsage() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.todayUsageEntries.collect { entries ->
                    val totalTextView = binding.tvTodayUsage
                    val recycler = binding.recyclerTodayUsage

                    if (entries.isEmpty()) {
                        totalTextView.visibility = View.GONE
                        recycler.visibility = View.GONE
                        todayUsageAdapter.submitList(emptyList())
                        return@collect
                    }

                    val totalDuration = entries.sumOf { it.durationMs }
                    val formattedTotal = TimeUtils.formatTimeForDisplay(requireContext(), totalDuration)
                    totalTextView.text = getString(R.string.history_stats_today_usage, formattedTotal)
                    totalTextView.visibility = View.VISIBLE

                    recycler.visibility = View.VISIBLE
                    todayUsageAdapter.submitList(entries)

                    // Ensure the statistics card is visible even if history list is empty
                    if (binding.cardStatistics.visibility != View.VISIBLE) {
                        binding.cardStatistics.visibility = View.VISIBLE
                    }
                }
            }
        }
    }

    private fun showLoading() {
        binding.apply {
            progressLoading.visibility = View.VISIBLE
            tvLoading.visibility = View.VISIBLE
            recyclerHistory.visibility = View.GONE
            layoutEmpty.visibility = View.GONE
            cardStatistics.visibility = View.GONE
        }
    }

    private fun hideLoading() {
        binding.apply {
            progressLoading.visibility = View.GONE
            tvLoading.visibility = View.GONE
        }
    }

    private fun showEmptyState() {
    val isFiltered = viewModel.filterLabel.value != null
        
        binding.apply {
            recyclerHistory.visibility = View.GONE
            layoutEmpty.visibility = View.VISIBLE
            cardStatistics.visibility = View.GONE
            
            if (isFiltered) {
                tvEmptyTitle.text = getString(R.string.history_empty_filtered)
                tvEmptyDescription.text = getString(R.string.history_empty_filtered_description)
            } else {
                tvEmptyTitle.text = getString(R.string.history_empty)
                tvEmptyDescription.text = getString(R.string.history_empty_description)
            }
        }
    }

    private fun showHistoryContent(historyList: List<com.niyaz.zario.data.local.entities.EvaluationHistoryEntry>) {
        binding.apply {
            recyclerHistory.visibility = View.VISIBLE
            layoutEmpty.visibility = View.GONE
        }
        
        // Show statistics if we have data
        showStatistics(historyList)
    }

    private fun showStatistics(historyList: List<com.niyaz.zario.data.local.entities.EvaluationHistoryEntry>) {
        if (historyList.isEmpty()) {
            binding.cardStatistics.visibility = View.GONE
            return
        }
        
        val totalCycles = historyList.size
        val successfulCycles = historyList.count { it.metGoal }
        val successRate = if (totalCycles > 0) {
            ((successfulCycles.toFloat() / totalCycles.toFloat()) * 100).roundToInt()
        } else 0
        
        val points = sessionRepository.session.value.user?.points ?: 100
        binding.apply {
            cardStatistics.visibility = View.VISIBLE
            tvTotalCycles.text = getString(R.string.history_stats_total_cycles, totalCycles)
            tvSuccessRate.text = getString(R.string.history_stats_success_rate, successRate)
            tvTotalPointsRight.text = getString(R.string.total_points_format, points)
        }
        
        Log.d(Constants.LOG_TAG_HISTORY_FRAGMENT, 
            "Statistics: $totalCycles total, $successfulCycles successful, $successRate% success rate")
    }

    private fun showFilterSelector() {
        if (!isAdded || !viewLifecycleOwner.lifecycle.currentState.isAtLeast(Lifecycle.State.RESUMED)) {
            return
        }

        val options = filterOptions
        if (options.isEmpty()) {
            return
        }

        val currentSelection = binding.autoFilter.text.toString()
        val checkedIndex = options.indexOf(currentSelection).takeIf { it >= 0 } ?: 0

        MaterialAlertDialogBuilder(requireContext())
            .setTitle(R.string.history_filter_dialog_title)
            .setSingleChoiceItems(options.toTypedArray(), checkedIndex) { dialog, which ->
                applyFilterSelection(options[which])
                dialog.dismiss()
            }
            .setNegativeButton(android.R.string.cancel, null)
            .show()
    }

    private fun applyFilterSelection(selection: String) {
        if (selection == getString(R.string.history_filter_all)) {
            viewModel.setFilter(null)
        } else {
            viewModel.setFilter(selection)
        }

        binding.autoFilter.setText(selection)
        clearFilterFocus()
    }

    private fun clearFilterFocus() {
        _binding?.autoFilter?.clearFocus()
    }

    override fun onResume() {
        super.onResume()
        viewModel.refreshTodayTotals()
    }

    override fun onPause() {
        clearFilterFocus()
        super.onPause()
    }

    override fun onStop() {
        clearFilterFocus()
        super.onStop()
    }

    override fun onDestroyView() {
        clearFilterFocus()
        super.onDestroyView()
        Log.d(Constants.LOG_TAG_HISTORY_FRAGMENT, "HistoryFragment onDestroyView")
        _binding = null
    }
} 