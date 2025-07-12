package com.niyaz.zario.data

/**
 * Experimental assignment bucket for newly registered users.
 * CONTROL   – baseline behaviour with no interventions.
 * FLEXIBLE  – app permits opting-out of commitment at any time.
 * DEPOSIT   – users deposit a virtual stake that is forfeited on goal failure.
 */
enum class Condition {
    CONTROL,
    FLEXIBLE,
    DEPOSIT;

    companion object {
        /** Parses stored string value, defaulting to CONTROL when unknown */
        fun fromStored(value: String?): Condition = try {
            value?.let { valueOf(it) } ?: CONTROL
        } catch (_: IllegalArgumentException) {
            CONTROL
        }
    }
} 