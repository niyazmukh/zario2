package com.niyaz.zario.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
import com.niyaz.zario.permissions.PermissionsManager
import com.niyaz.zario.core.evaluation.EvaluationRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private val viewModel: AuthViewModel by viewModels()

    @Inject lateinit var evaluationRepository: EvaluationRepository
    @Inject lateinit var permissionsManager: PermissionsManager

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

        val permissions = permissionsManager.refresh()
        val hasUsage = permissions.hasUsageStatsPermission
        val hasNotif = permissions.hasNotificationPermission

        viewLifecycleOwner.lifecycleScope.launch {
            when {
                !(hasUsage && hasNotif) -> {
                    findNavController().navigate(R.id.action_login_to_permissions)
                }
                !evaluationRepository.hasPlanConfigured() -> {
                    findNavController().navigate(R.id.action_login_to_target)
                }
                else -> {
                    // Target exists – expired or not, proceed to Intervention screen.
                    findNavController().navigate(R.id.action_login_to_intervention)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
} 