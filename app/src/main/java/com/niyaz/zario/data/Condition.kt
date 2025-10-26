package com.niyaz.zario.data

/**
 * Experimental assignment bucket for newly registered users.
 */
enum class Condition {
    CONTROL,
    BENCHMARK,
    FLEXIBLE,
    DEPOSIT;

    companion object {
        fun fromStored(value: String?): Condition = try {
            value?.let { valueOf(it) } ?: CONTROL
        } catch (_: IllegalArgumentException) {
            CONTROL
        }

        private val SIGNUP_CONDITIONS = arrayOf(CONTROL, DEPOSIT, BENCHMARK)

        fun randomForSignup(): Condition = SIGNUP_CONDITIONS.random()
    }
}
