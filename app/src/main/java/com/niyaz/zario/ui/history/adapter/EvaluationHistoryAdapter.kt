package com.niyaz.zario.ui.history.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.niyaz.zario.Constants
import com.niyaz.zario.R
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import com.niyaz.zario.databinding.ItemHistoryEntryBinding
import com.niyaz.zario.utils.TimeUtils
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import kotlin.math.roundToInt

class EvaluationHistoryAdapter : ListAdapter<EvaluationHistoryEntry, EvaluationHistoryAdapter.HistoryViewHolder>(Diff()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val binding = ItemHistoryEntryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HistoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class HistoryViewHolder(private val binding: ItemHistoryEntryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(entry: EvaluationHistoryEntry) {
            val context = binding.root.context
            
            // Set plan label
            binding.tvAppName.text = entry.planLabel

            // Use static icon for global screen-time tracking
            binding.ivAppIcon.setImageResource(R.mipmap.ic_launcher)
            binding.ivAppIcon.contentDescription = context.getString(R.string.app_icon_content_description, entry.planLabel)
            
            // Format and set evaluation date
            val dateFormat = SimpleDateFormat(Constants.HISTORY_DATE_FORMAT, Locale.getDefault())
            val dateStr = dateFormat.format(Date(entry.evaluationStartTime))
            binding.tvEvaluationDate.text = dateStr
            
            // Calculate usage percentage
            val usagePercentage = if (entry.goalTimeMs > 0) {
                ((entry.finalUsageMs.toFloat() / entry.goalTimeMs.toFloat()) * Constants.PROGRESS_MAX_PERCENTAGE).roundToInt()
            } else 0
            
            // Set usage vs goal text
            val usageFormatted = TimeUtils.formatTimeForDisplay(context, entry.finalUsageMs)
            val goalFormatted = TimeUtils.formatTimeForDisplay(context, entry.goalTimeMs)
            binding.tvUsageVsGoal.text = context.getString(R.string.history_entry_usage_vs_goal, usageFormatted, goalFormatted)
            
            // Set progress bar
            val progressCapped = usagePercentage.coerceAtMost(Constants.PROGRESS_MAX_PERCENTAGE.toInt())
            binding.progressUsage.progress = progressCapped
            
            // Set percentage display
            binding.tvUsagePercentage.text = context.getString(R.string.history_entry_percentage_display, usagePercentage)
            
            // Set evaluation duration
            val durationMs = entry.evaluationEndTime - entry.evaluationStartTime
            val durationFormatted = TimeUtils.formatTimeForDisplay(context, durationMs)
            binding.tvEvaluationDuration.text = context.getString(R.string.history_entry_duration, durationFormatted)
            
            // Configure status badge and visual styling
            configureStatusBadge(context, entry.metGoal, usagePercentage)
            
            // Set accessibility content description
            val statusText = if (entry.metGoal) {
                context.getString(R.string.history_met_goal)
            } else {
                context.getString(R.string.history_missed_goal)
            }
            
            binding.root.contentDescription = context.getString(
                R.string.history_card_accessibility_description,
                entry.planLabel,
                dateStr,
                usageFormatted,
                goalFormatted,
                statusText
            )
        }
        
        private fun configureStatusBadge(context: Context, metGoal: Boolean, usagePercentage: Int) {
            if (metGoal) {
                // Success styling
                binding.tvStatusBadge.text = context.getString(R.string.history_entry_success_badge)
                binding.tvStatusBadge.setTextColor(ContextCompat.getColor(context, R.color.evaluation_success))
                binding.cardStatusBadge.strokeColor = ContextCompat.getColor(context, R.color.evaluation_success)
                
                // Accessibility: Set content description for status badge
                binding.cardStatusBadge.contentDescription = context.getString(R.string.cd_goal_achieved)
                
                // Progress bar color
                binding.progressUsage.setIndicatorColor(ContextCompat.getColor(context, R.color.evaluation_success))
                binding.tvUsagePercentage.setTextColor(ContextCompat.getColor(context, R.color.evaluation_success))
                
            } else {
                // Exceeded styling
                binding.tvStatusBadge.text = context.getString(R.string.history_entry_exceeded_badge)
                binding.tvStatusBadge.setTextColor(ContextCompat.getColor(context, R.color.evaluation_exceeded))
                binding.cardStatusBadge.strokeColor = ContextCompat.getColor(context, R.color.evaluation_exceeded)
                
                // Accessibility: Set content description for status badge
                binding.cardStatusBadge.contentDescription = context.getString(R.string.cd_goal_exceeded)
                
                // Progress bar color
                binding.progressUsage.setIndicatorColor(ContextCompat.getColor(context, R.color.evaluation_exceeded))
                binding.tvUsagePercentage.setTextColor(ContextCompat.getColor(context, R.color.evaluation_exceeded))
            }
            
            // Adjust card elevation based on status for subtle visual feedback
            val elevation = if (metGoal) {
                context.resources.getDimension(R.dimen.card_elevation_history_success)
            } else {
                context.resources.getDimension(R.dimen.card_elevation_history_exceeded)
            }
            binding.root.cardElevation = elevation
        }
    }

    private class Diff : DiffUtil.ItemCallback<EvaluationHistoryEntry>() {
        override fun areItemsTheSame(oldItem: EvaluationHistoryEntry, newItem: EvaluationHistoryEntry): Boolean = 
            oldItem.id == newItem.id
        
        override fun areContentsTheSame(oldItem: EvaluationHistoryEntry, newItem: EvaluationHistoryEntry): Boolean = 
            oldItem == newItem
    }
} 