package com.niyaz.zario.ui.history.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.niyaz.zario.R
import com.niyaz.zario.databinding.ItemTodayUsageEntryBinding
import com.niyaz.zario.ui.history.HistoryViewModel
import com.niyaz.zario.utils.TimeUtils

class TodayUsageAdapter(
    private val onEntryClick: (HistoryViewModel.TodayUsageEntry) -> Unit
) :
    ListAdapter<HistoryViewModel.TodayUsageEntry, TodayUsageAdapter.TodayUsageViewHolder>(DIFF_CALLBACK) {

    private var selectedPackages: Set<String> = emptySet()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodayUsageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemTodayUsageEntryBinding.inflate(inflater, parent, false)
        return TodayUsageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodayUsageViewHolder, position: Int) {
        val entry = getItem(position)
        holder.bind(entry, selectedPackages.contains(entry.packageName), onEntryClick)
    }

    fun updateSelection(selection: Set<String>) {
        selectedPackages = selection
        notifyDataSetChanged()
    }

    class TodayUsageViewHolder(
        private val binding: ItemTodayUsageEntryBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(
            entry: HistoryViewModel.TodayUsageEntry,
            isSelected: Boolean,
            onEntryClick: (HistoryViewModel.TodayUsageEntry) -> Unit
        ) {
            val context = binding.root.context
            val packageManager = context.packageManager
            val iconDrawable = runCatching {
                packageManager.getApplicationIcon(entry.packageName)
            }.getOrElse {
                packageManager.defaultActivityIcon
            }

            binding.ivAppIcon.setImageDrawable(iconDrawable)
            binding.ivAppIcon.contentDescription =
                context.getString(R.string.cd_app_icon, entry.appLabel)
            binding.tvAppLabel.text = entry.appLabel
            binding.tvUsageDuration.text = TimeUtils.formatTimeForDisplay(context, entry.durationMs)
            binding.root.alpha = if (isSelected) 1f else 0.6f
            binding.root.isSelected = isSelected
            binding.root.setOnClickListener { onEntryClick(entry) }
            binding.root.contentDescription = context.getString(
                if (isSelected) R.string.history_app_filter_selected else R.string.history_app_filter_unselected,
                entry.appLabel,
                binding.tvUsageDuration.text
            )
        }
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<HistoryViewModel.TodayUsageEntry>() {
            override fun areItemsTheSame(
                oldItem: HistoryViewModel.TodayUsageEntry,
                newItem: HistoryViewModel.TodayUsageEntry
            ): Boolean = oldItem.packageName == newItem.packageName

            override fun areContentsTheSame(
                oldItem: HistoryViewModel.TodayUsageEntry,
                newItem: HistoryViewModel.TodayUsageEntry
            ): Boolean = oldItem == newItem
        }
    }
}
