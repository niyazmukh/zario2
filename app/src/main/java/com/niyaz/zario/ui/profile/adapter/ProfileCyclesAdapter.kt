package com.niyaz.zario.ui.profile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.niyaz.zario.R
import com.niyaz.zario.databinding.ItemProfileCycleBinding
import com.niyaz.zario.ui.profile.ProfileViewModel
import java.text.NumberFormat

class ProfileCyclesAdapter :
    ListAdapter<ProfileViewModel.ProfileCycleItem, ProfileCyclesAdapter.CycleViewHolder>(DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CycleViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemProfileCycleBinding.inflate(inflater, parent, false)
        return CycleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CycleViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class CycleViewHolder(
        private val binding: ItemProfileCycleBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ProfileViewModel.ProfileCycleItem) {
            val context = binding.root.context
            binding.tvCycleDate.text = item.dateLabel
            binding.tvCyclePoints.text = context.getString(
                R.string.profile_cycle_points_format,
                numberFormatter.format(item.pointsAfter)
            )
            val statusText = when (item.statusLabel) {
                ProfileViewModel.ProfileCycleStatus.MET -> context.getString(R.string.profile_cycle_status_met)
                ProfileViewModel.ProfileCycleStatus.MISSED -> context.getString(R.string.profile_cycle_status_missed)
            }
            val statusColor = when (item.statusLabel) {
                ProfileViewModel.ProfileCycleStatus.MET ->
                    ContextCompat.getColor(context, R.color.evaluation_on_track)
                ProfileViewModel.ProfileCycleStatus.MISSED ->
                    ContextCompat.getColor(context, R.color.evaluation_exceeded)
            }
            binding.tvCycleStatus.text = statusText
            binding.tvCycleStatus.setTextColor(statusColor)
            binding.root.contentDescription = context.getString(
                R.string.profile_cycle_item_content_description,
                item.dateLabel,
                statusText,
                binding.tvCyclePoints.text
            )
        }
    }

    private object DiffCallback : DiffUtil.ItemCallback<ProfileViewModel.ProfileCycleItem>() {
        override fun areItemsTheSame(
            oldItem: ProfileViewModel.ProfileCycleItem,
            newItem: ProfileViewModel.ProfileCycleItem
        ): Boolean = oldItem.id == newItem.id

        override fun areContentsTheSame(
            oldItem: ProfileViewModel.ProfileCycleItem,
            newItem: ProfileViewModel.ProfileCycleItem
        ): Boolean = oldItem == newItem
    }

    companion object {
        private val numberFormatter: NumberFormat = NumberFormat.getIntegerInstance()
    }
}
