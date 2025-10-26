package com.niyaz.zario.ui.history.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.niyaz.zario.databinding.ItemHourlyUsageBinding
import com.niyaz.zario.ui.history.HistoryViewModel
import java.util.Locale
import kotlin.math.max

class HourlyUsageAdapter(
    private val maxBarHeightPx: Int,
    private val minBarHeightPx: Int,
    private val timeFormatter: (Long) -> String,
    private val onHourSelected: (Int) -> Unit
) : RecyclerView.Adapter<HourlyUsageAdapter.HourViewHolder>() {

    private val bars = mutableListOf<HistoryViewModel.HourlyUsageBar>()
    private var maxDurationMs: Long = 0L
    private var selectedHour: Int? = null

    fun submitData(newBars: List<HistoryViewModel.HourlyUsageBar>, maxDurationMs: Long) {
        bars.clear()
        bars.addAll(newBars)
        this.maxDurationMs = maxDurationMs
        notifyDataSetChanged()
    }

    fun setSelectedHour(hour: Int?) {
        if (selectedHour == hour) return
        val previous = selectedHour
        selectedHour = hour
        previous?.let { notifyItemChangedByHour(it) }
        selectedHour?.let { notifyItemChangedByHour(it) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HourViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemHourlyUsageBinding.inflate(inflater, parent, false)
        return HourViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HourViewHolder, position: Int) {
        holder.bind(bars[position], maxDurationMs)
    }

    override fun getItemCount(): Int = bars.size

    private fun notifyItemChangedByHour(hour: Int) {
        val index = bars.indexOfFirst { it.hour == hour }
        if (index != -1) {
            notifyItemChanged(index)
        }
    }

    inner class HourViewHolder(
        private val binding: ItemHourlyUsageBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.barContainer.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val hour = bars.getOrNull(position)?.hour ?: return@setOnClickListener
                    onHourSelected(hour)
                }
            }
        }

        fun bind(bar: HistoryViewModel.HourlyUsageBar, maxDurationMs: Long) {
            val hasUsage = bar.durationMs > 0L
            if (hasUsage) {
                binding.tvDuration.text = timeFormatter(bar.durationMs)
            }
            binding.tvDuration.isVisible = hasUsage

            val ratio = if (maxDurationMs > 0L) {
                (bar.durationMs.toDouble() / maxDurationMs).coerceIn(0.0, 1.0)
            } else {
                0.0
            }
            val targetHeight = when {
                ratio <= 0.0 -> minBarHeightPx
                else -> max((ratio * maxBarHeightPx).toInt(), minBarHeightPx)
            }
            binding.viewBar.layoutParams = binding.viewBar.layoutParams.apply {
                height = targetHeight
            }
            val isSelected = selectedHour == bar.hour
            binding.viewBar.alpha = when {
                !hasUsage -> 0.25f
                isSelected -> 1f
                else -> 0.6f
            }
            binding.tvHour.alpha = if (isSelected) 1f else 0.7f
            binding.tvDuration.alpha = if (isSelected) 1f else 0.7f

            val hourLabel = String.format(Locale.getDefault(), "%02d", bar.hour)
            binding.tvHour.text = hourLabel
            val context = binding.root.context
            binding.barContainer.contentDescription = if (hasUsage) {
                context.getString(
                    com.niyaz.zario.R.string.history_chart_bar_content_description,
                    bar.hour,
                    timeFormatter(bar.durationMs)
                )
            } else {
                context.getString(
                    com.niyaz.zario.R.string.history_chart_bar_content_description_empty,
                    bar.hour
                )
            }
        }
    }
}
