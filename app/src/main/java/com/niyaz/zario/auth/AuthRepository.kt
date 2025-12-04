package com.niyaz.zario.auth

import com.niyaz.zario.data.Condition
import com.niyaz.zario.data.User

data class SignupRequest(
    val email: String,
    val password: String,
    val yearOfBirth: String,
    val gender: String,
    val condition: Condition,
    val referralNumber: String? = null
)

interface AuthRepository {
    suspend fun signUp(request: SignupRequest): Result<User>
    suspend fun login(email: String, password: String): Result<User>
    suspend fun logout()
}
