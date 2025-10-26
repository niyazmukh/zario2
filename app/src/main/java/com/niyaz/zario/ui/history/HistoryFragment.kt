package com.niyaz.zario.ui.history

import android.graphics.Rect
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.core.view.isVisible
import androidx.core.util.Pair as AndroidPair
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.CompositeDateValidator
import com.google.android.material.datepicker.DateValidatorPointBackward
import com.google.android.material.datepicker.DateValidatorPointForward
import com.google.android.material.datepicker.MaterialDatePicker
import com.niyaz.zario.R
import com.niyaz.zario.databinding.FragmentHistoryBinding
import com.niyaz.zario.ui.history.adapter.HourlyUsageAdapter
import com.niyaz.zario.ui.history.adapter.TodayUsageAdapter
import com.niyaz.zario.utils.TimeUtils
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.ZoneId

@AndroidEntryPoint
class HistoryFragment : Fragment() {

    private var _binding: FragmentHistoryBinding? = null
    private val binding get() = _binding!!

    private val viewModel: HistoryViewModel by viewModels()
    private lateinit var todayUsageAdapter: TodayUsageAdapter
    private lateinit var hourlyUsageAdapter: HourlyUsageAdapter
    private var latestUiState: HistoryViewModel.UsageUiState? = null
    private val zoneId: ZoneId = ZoneId.systemDefault()

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

        binding.root.isFocusableInTouchMode = true
        binding.root.requestFocus()

        setupRecyclerView()
        setupHourlyChart()
        setupListeners()
        observeUiState()
    }

    private fun setupRecyclerView() {
        todayUsageAdapter = TodayUsageAdapter { entry ->
            viewModel.togglePackageFilter(entry.packageName)
        }
        binding.recyclerHistory.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = todayUsageAdapter
            val spacing = resources.getDimensionPixelSize(R.dimen.spacing_sm)
            if (itemDecorationCount == 0) {
                addItemDecoration(VerticalSpacingItemDecoration(spacing))
            }
        }
    }

    private fun setupHourlyChart() {
        val maxBarHeight = resources.getDimensionPixelSize(R.dimen.history_hourly_bar_max_height)
        val minBarHeight = resources.getDimensionPixelSize(R.dimen.spacing_xs)
        hourlyUsageAdapter = HourlyUsageAdapter(
            maxBarHeightPx = maxBarHeight,
            minBarHeightPx = minBarHeight,
            timeFormatter = { durationMs -> TimeUtils.formatTimeForDisplay(requireContext(), durationMs) },
            onHourSelected = { hour -> viewModel.toggleHourFilter(hour) }
        )

        binding.recyclerHourlyChart.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            adapter = hourlyUsageAdapter
            setHasFixedSize(true)
            val spacing = resources.getDimensionPixelSize(R.dimen.spacing_sm)
            if (itemDecorationCount == 0) {
                addItemDecoration(HorizontalSpacingItemDecoration(spacing))
            }
            LinearSnapHelper().attachToRecyclerView(this)
        }
    }

    private fun setupListeners() {
        binding.btnDatePicker.setOnClickListener {
            latestUiState?.let { showDatePicker(it) }
        }
    }

    private fun observeUiState() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { state ->
                    latestUiState = state
                    todayUsageAdapter.submitList(state.entries) {
                        todayUsageAdapter.updateSelection(state.selectedPackages)
                    }
                    renderState(state)
                }
            }
        }
    }

    private fun renderState(state: HistoryViewModel.UsageUiState) {
        binding.apply {
            tvDateRange.text = state.dateLabel
            val isLoading = state.isLoading
            progressLoading.isVisible = isLoading
            tvLoading.isVisible = isLoading

            if (!isLoading) {
                val formattedTotal = TimeUtils.formatTimeForDisplay(requireContext(), state.totalUsageMs)
                tvTotalUsage.text = getString(R.string.history_total_usage_label, formattedTotal)
            }
            tvTotalUsage.isVisible = !isLoading

            if (!isLoading) {
                hourlyUsageAdapter.submitData(state.hourlyUsage, state.maxHourlyDurationMs)
                hourlyUsageAdapter.setSelectedHour(state.selectedHour)
            } else {
                hourlyUsageAdapter.setSelectedHour(null)
            }

            recyclerHourlyChart.isVisible = !isLoading && !state.chartEmpty
            tvChartEmpty.isVisible = !isLoading && state.chartEmpty

            val hasEntries = state.entries.isNotEmpty()
            recyclerHistory.isVisible = !isLoading && hasEntries
            layoutEmpty.isVisible = !isLoading && !hasEntries
        }
    }

    private fun showDatePicker(state: HistoryViewModel.UsageUiState) {
        if (childFragmentManager.findFragmentByTag(DATE_PICKER_TAG) != null) {
            return
        }

        val limits = state.dateLimits
        val builder = MaterialDatePicker.Builder.dateRangePicker()
            .setTitleText(R.string.history_date_picker_title)

        val startMillis = limits.min.startOfDayMillis(zoneId)
        val endMillisExclusive = limits.max.plusDays(1).startOfDayMillis(zoneId)
        val validators = listOf(
            DateValidatorPointForward.from(startMillis),
            DateValidatorPointBackward.before(endMillisExclusive)
        )
        val constraints = CalendarConstraints.Builder()
            .setStart(startMillis)
            .setEnd(endMillisExclusive - 1)
            .setValidator(CompositeDateValidator.allOf(validators))
            .build()

        val currentRange = state.dateRange
        val currentSelection = AndroidPair(
            currentRange.start.startOfDayMillis(zoneId),
            currentRange.end.startOfDayMillis(zoneId)
        )

        val picker = builder
            .setCalendarConstraints(constraints)
            .setSelection(currentSelection)
            .build()

        picker.addOnPositiveButtonClickListener { selection ->
            selection?.let {
                if (it.first != null && it.second != null) {
                    viewModel.onDateRangeSelected(it.first!!, it.second!!)
                }
            }
        }

        picker.show(childFragmentManager, DATE_PICKER_TAG)
    }

    override fun onResume() {
        super.onResume()
        viewModel.refreshCurrentRange()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        if (isRemoving || activity?.isFinishing == true) {
            viewModel.resetFilters()
        }
        _binding = null
    }

    private fun LocalDate.startOfDayMillis(zone: ZoneId): Long =
        this.atStartOfDay(zone).toInstant().toEpochMilli()

    private class VerticalSpacingItemDecoration(
        private val spacing: Int
    ) : RecyclerView.ItemDecoration() {
        override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
        ) {
            if (parent.getChildAdapterPosition(view) > 0) {
                outRect.top = spacing
            }
        }
    }

    private class HorizontalSpacingItemDecoration(
        private val spacing: Int
    ) : RecyclerView.ItemDecoration() {
        override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
        ) {
            val position = parent.getChildAdapterPosition(view)
            if (position == 0) {
                outRect.left = spacing
            }
            outRect.right = spacing
        }
    }

    private companion object {
        const val DATE_PICKER_TAG = "history_date_picker"
    }
} 
