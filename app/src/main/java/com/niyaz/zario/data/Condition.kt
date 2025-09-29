package com.niyaz.zario.data

/**
 * Experimental assignment bucket for newly registered users.
 */
enum class Condition {
    CONTROL,
    FLEXIBLE,
    DEPOSIT;

    companion object {
        fun fromStored(value: String?): Condition = try {
            value?.let { valueOf(it) } ?: CONTROL
        } catch (_: IllegalArgumentException) {
            CONTROL
        }
    }
}
