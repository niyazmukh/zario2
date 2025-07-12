package com.niyaz.zario.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.niyaz.zario.R
import com.niyaz.zario.data.AuthResult
import com.niyaz.zario.databinding.FragmentLoginBinding
import com.niyaz.zario.repository.EvaluationRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private val viewModel: AuthViewModel by viewModels()

    @Inject lateinit var evaluationRepository: EvaluationRepository

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupClickListeners()
        observeViewModel()
    }

    private fun setupClickListeners() {
        binding.btnLogin.setOnClickListener {
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString()
            viewModel.login(email, password)
        }

        binding.tvSignupLink.setOnClickListener {
            findNavController().navigate(R.id.action_login_to_signup)
        }

        binding.tvForgotPassword.setOnClickListener {
            // TODO: Implement forgot password functionality
        }
    }

    private fun observeViewModel() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {
                    viewModel.authResult.collect { result ->
                        when (result) {
                            is AuthResult.Idle -> {
                                // Initial state - do nothing
                            }
                            is AuthResult.Loading -> {
                                setLoadingState(true)
                            }
                            is AuthResult.Success -> {
                                setLoadingState(false)
                                navigatePostLogin()
                            }
                            is AuthResult.Error -> {
                                setLoadingState(false)
                                Snackbar.make(binding.root, result.message, Snackbar.LENGTH_LONG).show()
                            }
                        }
                    }
                }
                
                launch {
                    viewModel.emailError.collect { error ->
                        binding.tilEmail.error = error
                    }
                }
                
                launch {
                    viewModel.passwordError.collect { error ->
                        binding.tilPassword.error = error
                    }
                }
            }
        }
    }

    private fun setLoadingState(isLoading: Boolean) {
        binding.btnLogin.isEnabled = !isLoading
        binding.btnLogin.text = if (isLoading) {
            getString(R.string.auth_signing_in)
        } else {
            getString(R.string.login_button)
        }
    }

    private fun navigatePostLogin() {
        if (!isAdded) return

        val hasUsage = hasUsageStatsPermission()
        val hasNotif = hasNotificationPermission()

        when {
            !(hasUsage && hasNotif) -> {
                findNavController().navigate(R.id.action_login_to_permissions)
            }
            !evaluationRepository.hasTargetSelected() -> {
                findNavController().navigate(R.id.action_login_to_target)
            }
            else -> {
                // Target exists – expired or not, proceed to Intervention screen.
                findNavController().navigate(R.id.action_login_to_intervention)
            }
        }
    }

    // Permission helpers (copied from SplashFragment)
    private fun hasUsageStatsPermission(): Boolean {
        val appOps = requireContext().getSystemService(android.app.AppOpsManager::class.java)
        val mode = appOps.checkOpNoThrow(
            android.app.AppOpsManager.OPSTR_GET_USAGE_STATS,
            android.os.Process.myUid(),
            requireContext().packageName
        )
        return mode == android.app.AppOpsManager.MODE_ALLOWED
    }

    private fun hasNotificationPermission(): Boolean {
        return if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            androidx.core.content.ContextCompat.checkSelfPermission(
                requireContext(),
                android.Manifest.permission.POST_NOTIFICATIONS
            ) == android.content.pm.PackageManager.PERMISSION_GRANTED
        } else true
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
} 