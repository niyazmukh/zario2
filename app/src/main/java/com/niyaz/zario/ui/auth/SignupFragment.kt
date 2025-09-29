package com.niyaz.zario.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.niyaz.zario.R
import com.niyaz.zario.data.AuthResult
import com.niyaz.zario.databinding.FragmentSignupBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class SignupFragment : Fragment() {

    private var _binding: FragmentSignupBinding? = null
    private val binding get() = _binding!!

    private val viewModel: AuthViewModel by viewModels()
    @Inject lateinit var sessionRepository: com.niyaz.zario.repository.UserSessionRepository

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignupBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupClickListeners()
        setupGenderDropdown()
        observeViewModel()
    }

    private fun setupClickListeners() {
        binding.btnSignup.setOnClickListener {
            val yearOfBirth = binding.etYearOfBirth.text.toString().trim()
            val gender = binding.etGender.text.toString().trim()
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString()
            val confirmPassword = binding.etConfirmPassword.text.toString()
            viewModel.signup(yearOfBirth, gender, email, password, confirmPassword)
        }

        binding.tvSigninLink.setOnClickListener {
            findNavController().navigate(R.id.action_signup_to_login)
        }
    }

    private fun setupGenderDropdown() {
        val genderOptions = arrayOf(
            getString(R.string.gender_male),
            getString(R.string.gender_female),
            getString(R.string.gender_other),
            getString(R.string.gender_prefer_not_to_say)
        )
        
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_dropdown_item_1line, genderOptions)
        binding.etGender.setAdapter(adapter)
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
                                // Check if user is FLEXIBLE condition - route to FlexStakes
                                val currentUser = sessionRepository.session.value.user
                                if (currentUser?.condition == com.niyaz.zario.data.Condition.FLEXIBLE) {
                                    findNavController().navigate(R.id.action_signup_to_flexstakes)
                                } else {
                                findNavController().navigate(R.id.action_signup_to_permissions)
                                }
                            }
                            is AuthResult.Error -> {
                                setLoadingState(false)
                                Snackbar.make(binding.root, result.message, Snackbar.LENGTH_LONG).show()
                            }
                        }
                    }
                }
                
                launch {
                    viewModel.yearOfBirthError.collect { error ->
                        binding.tilYearOfBirth.error = error
                    }
                }
                
                launch {
                    viewModel.genderError.collect { error ->
                        binding.tilGender.error = error
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
                
                launch {
                    viewModel.confirmPasswordError.collect { error ->
                        binding.tilConfirmPassword.error = error
                    }
                }
            }
        }
    }

    private fun setLoadingState(isLoading: Boolean) {
        binding.btnSignup.isEnabled = !isLoading
        binding.btnSignup.text = if (isLoading) {
            getString(R.string.auth_creating_account)
        } else {
            getString(R.string.signup_button)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
} 