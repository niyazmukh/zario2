package com.niyaz.zario.ui.auth

import android.content.Context
import androidx.core.util.PatternsCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.FirebaseNetworkException
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import com.google.firebase.auth.FirebaseAuthWeakPasswordException
import com.niyaz.zario.R
import com.niyaz.zario.Constants
import com.niyaz.zario.auth.AuthRepository
import com.niyaz.zario.auth.SignupRequest
import com.niyaz.zario.data.AuthResult
import com.niyaz.zario.data.Condition
import com.niyaz.zario.data.ValidationResult
import com.niyaz.zario.repository.UserSessionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import java.time.LocalDate
import javax.inject.Inject
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

@HiltViewModel
class AuthViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val sessionRepository: UserSessionRepository,
    private val authRepository: AuthRepository
) : ViewModel() {

    private val _authResult = MutableStateFlow<AuthResult>(AuthResult.Idle)
    val authResult: StateFlow<AuthResult> = _authResult.asStateFlow()

    private val _emailError = MutableStateFlow<String?>(null)
    val emailError: StateFlow<String?> = _emailError.asStateFlow()

    private val _passwordError = MutableStateFlow<String?>(null)
    val passwordError: StateFlow<String?> = _passwordError.asStateFlow()

    private val _confirmPasswordError = MutableStateFlow<String?>(null)
    val confirmPasswordError: StateFlow<String?> = _confirmPasswordError.asStateFlow()

    private val _yearOfBirthError = MutableStateFlow<String?>(null)
    val yearOfBirthError: StateFlow<String?> = _yearOfBirthError.asStateFlow()

    private val _genderError = MutableStateFlow<String?>(null)
    val genderError: StateFlow<String?> = _genderError.asStateFlow()

    fun login(email: String, password: String) {
        if (!validateLoginInput(email, password)) return

        viewModelScope.launch {
            _authResult.value = AuthResult.Loading
            val result = authRepository.login(email, password)
            result.onSuccess { user ->
                sessionRepository.setLoggedIn(user)
                _authResult.value = AuthResult.Success
            }.onFailure { error ->
                _authResult.value = AuthResult.Error(mapAuthError(error))
            }
        }
    }

    fun signup(yearOfBirth: String, gender: String, email: String, password: String, confirmPassword: String) {
        if (!validateSignupInput(yearOfBirth, gender, email, password, confirmPassword)) return

        viewModelScope.launch {
            _authResult.value = AuthResult.Loading

            // Randomised experimental assignment
            val assignedCondition = Condition.randomForSignup()
            val request = SignupRequest(
                email = email,
                password = password,
                yearOfBirth = yearOfBirth,
                gender = gender,
                condition = assignedCondition
            )

            val result = authRepository.signUp(request)
            result.onSuccess { user ->
                sessionRepository.setLoggedIn(user)
                _authResult.value = AuthResult.Success
            }.onFailure { error ->
                _authResult.value = AuthResult.Error(mapAuthError(error))
            }
        }
    }

    private fun validateLoginInput(email: String, password: String): Boolean {
        val emailValidation = validateEmail(email)
        val passwordValidation = validatePassword(password)

        _emailError.value = emailValidation.errorMessage
        _passwordError.value = passwordValidation.errorMessage

        return emailValidation.isValid && passwordValidation.isValid
    }

    private fun validateSignupInput(yearOfBirth: String, gender: String, email: String, password: String, confirmPassword: String): Boolean {
        val yearValidation = validateYearOfBirth(yearOfBirth)
        val genderValidation = validateGender(gender)
        val emailValidation = validateEmail(email)
        val passwordValidation = validatePassword(password)
        val confirmPasswordValidation = validateConfirmPassword(password, confirmPassword)

        _yearOfBirthError.value = yearValidation.errorMessage
        _genderError.value = genderValidation.errorMessage
        _emailError.value = emailValidation.errorMessage
        _passwordError.value = passwordValidation.errorMessage
        _confirmPasswordError.value = confirmPasswordValidation.errorMessage

        return yearValidation.isValid &&
               genderValidation.isValid &&
               emailValidation.isValid && 
               passwordValidation.isValid && 
               confirmPasswordValidation.isValid
    }

    private fun validateEmail(email: String): ValidationResult {
        return when {
            email.isEmpty() -> ValidationResult(false, context.getString(R.string.error_empty_email))
            !PatternsCompat.EMAIL_ADDRESS.matcher(email).matches() -> 
                ValidationResult(false, context.getString(R.string.error_invalid_email))
            else -> ValidationResult(true)
        }
    }

    private fun validatePassword(password: String): ValidationResult {
        return when {
            password.isEmpty() -> ValidationResult(false, context.getString(R.string.error_empty_password))
            password.length < Constants.MIN_PASSWORD_LENGTH -> ValidationResult(false, context.getString(R.string.error_short_password))
            else -> ValidationResult(true)
        }
    }

    private fun validateConfirmPassword(password: String, confirmPassword: String): ValidationResult {
        return when {
            confirmPassword.isEmpty() -> ValidationResult(false, context.getString(R.string.error_empty_password))
            password != confirmPassword -> ValidationResult(false, context.getString(R.string.error_passwords_dont_match))
            else -> ValidationResult(true)
        }
    }

    private fun validateYearOfBirth(yearOfBirth: String): ValidationResult {
        return when {
            yearOfBirth.isEmpty() -> ValidationResult(false, context.getString(R.string.error_empty_year_of_birth))
            !isValidYear(yearOfBirth) -> ValidationResult(false, context.getString(R.string.error_invalid_year_of_birth))
            else -> ValidationResult(true)
        }
    }

    private fun validateGender(gender: String): ValidationResult {
        return when {
            gender.isEmpty() -> ValidationResult(false, context.getString(R.string.error_empty_gender))
            else -> ValidationResult(true)
        }
    }

    private fun isValidYear(yearString: String): Boolean {
        return try {
            val year = yearString.toInt()
            val currentYear = LocalDate.now().year
            year in Constants.MIN_BIRTH_YEAR..currentYear
        } catch (e: NumberFormatException) {
            false
        }
    }

    fun clearErrors() {
        _emailError.value = null
        _passwordError.value = null
        _confirmPasswordError.value = null
        _yearOfBirthError.value = null
        _genderError.value = null
    }

    private fun mapAuthError(error: Throwable): String {
        if (error is CancellationException) throw error
        return when (error) {
            is FirebaseAuthUserCollisionException -> context.getString(R.string.auth_error_email_in_use)
            is FirebaseAuthWeakPasswordException -> context.getString(R.string.auth_error_weak_password)
            is FirebaseAuthInvalidCredentialsException,
            is FirebaseAuthInvalidUserException -> context.getString(R.string.auth_invalid_credentials)
            is FirebaseNetworkException -> context.getString(R.string.auth_error_network)
            else -> error.localizedMessage ?: context.getString(R.string.auth_error_generic)
        }
    }
} 
