package com.niyaz.zario.ui.target.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.niyaz.zario.R
import com.niyaz.zario.Constants
import com.niyaz.zario.data.AppUsageInfo
import com.niyaz.zario.databinding.ItemAppUsageBinding
import com.niyaz.zario.utils.TimeUtils

class AppUsageAdapter(
    private val onAppSelected: (AppUsageInfo) -> Unit
) : ListAdapter<AppUsageInfo, AppUsageAdapter.AppUsageViewHolder>(AppUsageDiffCallback()) {

    private var selectedAppPackage: String? = null

    fun setSelectedApp(packageName: String?) {
        val oldSelectedPackage = selectedAppPackage
        selectedAppPackage = packageName
        
        // Refresh the list to update selection states
        currentList.forEachIndexed { index, app ->
            if (app.packageName == oldSelectedPackage || app.packageName == packageName) {
                notifyItemChanged(index)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppUsageViewHolder {
        val binding = ItemAppUsageBinding.inflate(
            LayoutInflater.from(parent.context), 
            parent, 
            false
        )
        return AppUsageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AppUsageViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class AppUsageViewHolder(
        private val binding: ItemAppUsageBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(appUsageInfo: AppUsageInfo) {
            binding.apply {
                // Set app icon and name
                ivAppIcon.setImageDrawable(appUsageInfo.icon)
                ivAppIcon.contentDescription = binding.root.context.getString(R.string.app_icon_content_description, appUsageInfo.appName)
                tvAppName.text = appUsageInfo.appName
                
                // Format and set total usage time only
                val context = binding.root.context
                tvTotalTime.text = context.getString(R.string.app_usage_total_format, TimeUtils.formatTimeForDisplay(context, appUsageInfo.totalTimeMs))
                
                // Update card appearance based on selection
                val isSelected = selectedAppPackage == appUsageInfo.packageName
                
                // Get color from theme attributes
                val typedArray = context.obtainStyledAttributes(intArrayOf(
                    com.google.android.material.R.attr.colorPrimary,
                    com.google.android.material.R.attr.colorOutline
                ))
                val primaryColor = typedArray.getColor(Constants.ARRAY_INDEX_PRIMARY_COLOR, 0)
                val outlineColor = typedArray.getColor(Constants.ARRAY_INDEX_OUTLINE_COLOR, 0)
                typedArray.recycle()
                
                (root as com.google.android.material.card.MaterialCardView).apply {
                    strokeColor = if (isSelected) primaryColor else outlineColor
                    strokeWidth = if (isSelected) Constants.CARD_STROKE_WIDTH_SELECTED else Constants.CARD_STROKE_WIDTH_UNSELECTED
                }
                
                // Set click listener for entire card
                root.setOnClickListener {
                    onAppSelected(appUsageInfo)
                }
                
                // Set content description for accessibility
                root.contentDescription = context.getString(
                    R.string.app_usage_card_content_description,
                    appUsageInfo.appName,
                    TimeUtils.formatTimeForDisplay(context, appUsageInfo.totalTimeMs),
                    TimeUtils.formatTimeForDisplay(context, appUsageInfo.dailyAverageMs)
                )
            }
        }


    }

    private class AppUsageDiffCallback : DiffUtil.ItemCallback<AppUsageInfo>() {
        override fun areItemsTheSame(oldItem: AppUsageInfo, newItem: AppUsageInfo): Boolean {
            return oldItem.packageName == newItem.packageName
        }

        override fun areContentsTheSame(oldItem: AppUsageInfo, newItem: AppUsageInfo): Boolean {
            return oldItem == newItem
        }
    }
} 