package com.niyaz.zario.ui.profile

import androidx.core.view.isVisible
import com.niyaz.zario.databinding.FragmentProfileBinding

/**
 * Release builds hide debug-only actions.
 */
object DebugProfileActions {
    fun setupDebugControls(
        @Suppress("UNUSED_PARAMETER") fragment: ProfileFragment,
        binding: FragmentProfileBinding
    ) {
        binding.btnSimulateCycleCompletion.isVisible = false
    }
}
