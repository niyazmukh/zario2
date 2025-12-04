package com.niyaz.zario.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.graphics.Rect
import android.view.ViewTreeObserver
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
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
import kotlin.math.max

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
        
        setupWindowInsetsHandling()
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
            val referralNumber = binding.etReferralNumber.text?.toString()?.trim().orEmpty()
            viewModel.signup(yearOfBirth, gender, email, password, confirmPassword, referralNumber)
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
        binding.etGender.setOnClickListener {
            binding.etGender.showDropDown()
        }
        binding.etGender.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                binding.etGender.post { binding.etGender.showDropDown() }
            }
        }
    }

    // Global focus change listener so we can bring newly-focused views into view when the
    // IME appears. Must be removed in onDestroyView to avoid leaks.
    private var globalFocusChangeListener: ViewTreeObserver.OnGlobalFocusChangeListener? = null

    private fun setupWindowInsetsHandling() {
        val scrollView = binding.signupScroll

        // Apply window insets (IME + system bars) as bottom padding so NestedScrollView
        // can scroll its content above the keyboard on all OEMs.
        ViewCompat.setOnApplyWindowInsetsListener(scrollView) { view, insets ->
            val imeInsets = insets.getInsets(WindowInsetsCompat.Type.ime())
            val systemInsets = insets.getInsets(WindowInsetsCompat.Type.systemBars())

            // Use the larger of IME and system bars so we don't accidentally reduce
            // navigation bar padding when keyboard is hidden.
            val bottomInset = max(imeInsets.bottom, systemInsets.bottom)

            view.updatePadding(bottom = bottomInset)

            // If IME is visible, ensure the focused child (if any) is visible by computing
            // an explicit scroll offset relative to the NestedScrollView. This is more
            // reliable across OEMs and different view hierarchies than requestChildRectangleOnScreen alone.
            if (imeInsets.bottom > 0) {
                val focused = view.findFocus()
                focused?.let { f ->
                    ensureViewVisible(scrollView, f, imeInsets.bottom)
                }
            }

            insets
        }

        // When focus changes within the view hierarchy, automatically bring the new focus
        // into view (this handles the case where focus moves to a bottom field while the
        // IME is shown).
        globalFocusChangeListener = ViewTreeObserver.OnGlobalFocusChangeListener { _, newFocus ->
            newFocus?.let { nf ->
                // Post to ensure layout/padding updates from insets have been applied.
                scrollView.post {
                    try {
                        // Query the current IME inset from root window insets at runtime
                        val imeBottom = ViewCompat.getRootWindowInsets(scrollView)
                            ?.getInsets(WindowInsetsCompat.Type.ime())?.bottom ?: 0
                        ensureViewVisible(scrollView, nf, imeBottom)
                    } catch (ignored: Exception) {
                        // Defensive: some OEMs may throw in odd focus states; ignore safely.
                    }
                }
            }
        }

        scrollView.viewTreeObserver.addOnGlobalFocusChangeListener(globalFocusChangeListener)

        // Ensure insets are requested once on setup so our listener runs at least once.
        ViewCompat.requestApplyInsets(scrollView)
    }

    private fun ensureViewVisible(scrollView: androidx.core.widget.NestedScrollView, child: View, imeBottom: Int) {
        // Convert child's bounds to scrollView coordinates
        val childRect = Rect()
        child.getDrawingRect(childRect)
        scrollView.offsetDescendantRectToMyCoords(child, childRect)

        val visibleHeight = scrollView.height - imeBottom

        // Small extra spacing so field isn't tight to keyboard
        val extraSpacing = (resources.displayMetrics.density * 8).toInt()

        // If the bottom of the child is below the visible area, scroll down
        if (childRect.bottom + extraSpacing > visibleHeight) {
            val dy = (childRect.bottom + extraSpacing) - visibleHeight
            scrollView.smoothScrollBy(0, dy)
        } else if (childRect.top < 0) {
            // If top is above, scroll up to reveal it
            scrollView.smoothScrollBy(0, childRect.top)
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

                launch {
                    viewModel.referralNumberError.collect { error ->
                        binding.tilReferralNumber.error = error
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
        // Cleanup global focus listener to avoid leaks
        globalFocusChangeListener?.let { listener ->
            try {
                if (binding.signupScroll.viewTreeObserver.isAlive) {
                    binding.signupScroll.viewTreeObserver.removeOnGlobalFocusChangeListener(listener)
                }
            } catch (ignored: Exception) {
                // If removal fails for any reason, ignore - fragment is tearing down.
            }
        }
        globalFocusChangeListener = null
        _binding = null
    }
} 
