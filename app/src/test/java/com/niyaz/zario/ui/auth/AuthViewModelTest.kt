package com.niyaz.zario.ui.auth

import android.content.Context
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.niyaz.zario.R
import com.niyaz.zario.auth.AuthRepository
import com.niyaz.zario.data.AuthResult
import com.niyaz.zario.data.Condition
import com.niyaz.zario.data.User
import com.niyaz.zario.repository.UserSessionRepository
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.every
import io.mockk.mockk
import io.mockk.slot
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class AuthViewModelTest {

    private val dispatcher = StandardTestDispatcher()

    private val context: Context = mockk(relaxed = true) {
        everyString(R.string.error_empty_email)
        everyString(R.string.error_invalid_email)
        everyString(R.string.error_empty_password)
        everyString(R.string.error_short_password)
        everyString(R.string.error_passwords_dont_match)
        everyString(R.string.error_empty_year_of_birth)
        everyString(R.string.error_invalid_year_of_birth)
        everyString(R.string.error_empty_gender)
        everyString(R.string.auth_invalid_credentials)
        everyString(R.string.auth_error_generic)
        everyString(R.string.auth_error_email_in_use)
        everyString(R.string.auth_error_weak_password)
        everyString(R.string.auth_error_network)
    }

    private val sessionRepository: UserSessionRepository = mockk(relaxed = true)
    private val authRepository: AuthRepository = mockk()

    private lateinit var viewModel: AuthViewModel

    @Before
    fun setUp() {
        Dispatchers.setMain(dispatcher)
        viewModel = AuthViewModel(context, sessionRepository, authRepository)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun signup_success_persists_user_and_emits_success() = runTest(dispatcher) {
        val expectedUser = User(
            email = "signup@example.com",
            id = "uid-123",
            yearOfBirth = "1994",
            gender = "Female",
            condition = Condition.CONTROL
        )
        val persistedUser = slot<User>()

    coEvery { authRepository.signUp(any()) } returns Result.success(expectedUser)

        viewModel.signup(
            yearOfBirth = "1994",
            gender = "Female",
            email = "signup@example.com",
            password = "SecurePass1",
            confirmPassword = "SecurePass1"
        )

        advanceUntilIdle()

        assertEquals(AuthResult.Success, viewModel.authResult.value)
        coVerify(exactly = 1) {
            authRepository.signUp(match {
                assertEquals("signup@example.com", it.email)
                assertEquals("1994", it.yearOfBirth)
                assertEquals("Female", it.gender)
                true
            })
        }
        coVerify(exactly = 1) { sessionRepository.setLoggedIn(capture(persistedUser)) }
        assertEquals("signup@example.com", persistedUser.captured.email)
        assertEquals("1994", persistedUser.captured.yearOfBirth)
        assertEquals("Female", persistedUser.captured.gender)
    }

    @Test
    fun login_failure_emits_error_message() = runTest(dispatcher) {
    val failure = mockk<FirebaseAuthInvalidCredentialsException>()
    coEvery { authRepository.login("user@example.com", "wrongpass") } returns Result.failure(failure)

    viewModel.login(email = "user@example.com", password = "wrongpass")

        advanceUntilIdle()

    val result = viewModel.authResult.value
    assertTrue("Expected AuthResult.Error but was $result", result is AuthResult.Error)
    assertEquals(context.getString(R.string.auth_invalid_credentials), (result as AuthResult.Error).message)
    coVerify(exactly = 1) { authRepository.login("user@example.com", "wrongpass") }
        coVerify(exactly = 0) { sessionRepository.setLoggedIn(any()) }
    }

    private fun Context.everyString(resId: Int) {
        every { getString(resId) } returns "string-$resId"
    }
}
