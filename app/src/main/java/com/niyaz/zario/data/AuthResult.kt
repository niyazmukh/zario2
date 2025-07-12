package com.niyaz.zario.data

sealed class AuthResult {
    object Idle : AuthResult()
    object Success : AuthResult()
    data class Error(val message: String) : AuthResult()
    object Loading : AuthResult()
}

data class ValidationResult(
    val isValid: Boolean,
    val errorMessage: String? = null
) 