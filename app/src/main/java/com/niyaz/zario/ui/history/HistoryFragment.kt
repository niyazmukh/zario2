package com.niyaz.zario.ui.history

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
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
import com.niyaz.zario.ui.history.adapter.EvaluationHistoryAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import com.niyaz.zario.repository.UserSessionRepository
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

@AndroidEntryPoint
class HistoryFragment : Fragment() {

    private var _binding: FragmentHistoryBinding? = null
    private val binding get() = _binding!!

    private val viewModel: HistoryViewModel by viewModels()
    private lateinit var adapter: EvaluationHistoryAdapter

    @Inject lateinit var sessionRepository: UserSessionRepository
    
    // Keep a local reference to the current history list for filtering operations
    private var currentHistoryList: List<com.niyaz.zario.data.local.entities.EvaluationHistoryEntry> = emptyList()

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
        
        setupRecyclerView()
        setupFilter()
        observeHistory()
        
        // Show loading state initially
        showLoading()
    }

    private fun setupRecyclerView() {
        adapter = EvaluationHistoryAdapter()
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
    }

    private fun setupFilter() {
        // Collect unique app names for dropdown
        lifecycleScope.launch {
            viewModel.history.collect { list ->
                updateFilterOptions(list)
            }
        }

        binding.autoFilter.setOnItemClickListener { _, _, pos, _ ->
            val selectedItem = binding.autoFilter.adapter?.getItem(pos) as? String
            if (selectedItem == getString(R.string.history_filter_all)) {
                viewModel.setFilter(null)
            } else {
                selectedItem?.let { appName ->
                    // Find the package name for the selected app name
                    val packageName = findPackageNameForAppName(appName)
                    viewModel.setFilter(packageName)
                }
            }
            
            // Refresh the adapter to update visual indicators
            (binding.autoFilter.adapter as? ArrayAdapter<*>)?.notifyDataSetChanged()
        }
        
        // Fix: Show all options when dropdown is opened, regardless of current text
        binding.autoFilter.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                binding.autoFilter.showDropDown()
            }
        }
        
        // Fix: Override threshold to 0 so all items are always shown
        binding.autoFilter.threshold = 0
        
        // Fix: Show dropdown when clicked, ensuring all options are visible
        binding.autoFilter.setOnClickListener {
            binding.autoFilter.showDropDown()
        }
    }

    private fun updateFilterOptions(historyList: List<com.niyaz.zario.data.local.entities.EvaluationHistoryEntry>) {
        val appNames = historyList.map { it.appName }.distinct().sorted()
        val options = listOf(getString(R.string.history_filter_all)) + appNames
        
        // Create custom adapter that shows selected state
        val filterAdapter = object : ArrayAdapter<String>(
            requireContext(), 
            android.R.layout.simple_dropdown_item_1line, 
            options
        ) {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                val view = super.getView(position, convertView, parent)
                val textView = view as android.widget.TextView
                val item = getItem(position)
                val currentSelection = binding.autoFilter.text.toString()
                
                // Highlight selected item
                if (item == currentSelection) {
                    textView.setTextColor(requireContext().getColor(R.color.evaluation_success))
                    textView.setTypeface(textView.typeface, android.graphics.Typeface.BOLD)
                    // Add checkmark or bullet point to indicate selection
                    textView.text = "✓ $item"
                } else {
                    // Use consistent color with other UI text (same as subtitle/loading text)
                    val typedArray = requireContext().obtainStyledAttributes(intArrayOf(
                        com.google.android.material.R.attr.colorOnSurfaceVariant
                    ))
                    val textColor = typedArray.getColor(0, 0)
                    typedArray.recycle()
                    
                    textView.setTextColor(textColor)
                    textView.setTypeface(textView.typeface, android.graphics.Typeface.NORMAL)
                    textView.text = item
                }
                
                return view
            }
        }
        
        binding.autoFilter.setAdapter(filterAdapter)
        
        // Set default selection to "All apps"
        if (binding.autoFilter.text.isEmpty()) {
            binding.autoFilter.setText(getString(R.string.history_filter_all), false)
        }
    }

    private fun findPackageNameForAppName(appName: String): String? {
        return currentHistoryList.find { it.appName == appName }?.packageName
    }

    private fun observeHistory() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.history.collect { historyList ->
                    Log.d(Constants.LOG_TAG_HISTORY_FRAGMENT, "History updated: ${historyList.size} entries")
                    
                    // Update local reference
                    currentHistoryList = historyList
                    
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
        val isFiltered = viewModel.filterPackage.value != null
        
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

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(Constants.LOG_TAG_HISTORY_FRAGMENT, "HistoryFragment onDestroyView")
        _binding = null
    }
} 