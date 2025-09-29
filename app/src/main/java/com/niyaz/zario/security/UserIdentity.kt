package com.niyaz.zario.security

import java.security.MessageDigest
import java.util.LinkedHashSet

/** Utility for deriving a stable, non-PII identifier for a user. */
object UserIdentity {
    private const val HASH_ALGORITHM = "SHA-256"

    /**
     * Derives a deterministic user identifier from an email address. The result is a lowercase
     * hex string produced by SHA-256. Caller must ensure the input email is normalized (lowercase).
     */
    fun fromEmail(email: String): String {
        if (email.isBlank()) return ""
        val normalized = email.trim().lowercase()
        val digest = MessageDigest.getInstance(HASH_ALGORITHM)
        val hash = digest.digest(normalized.toByteArray())
        return buildString(hash.size * 2) {
            hash.forEach { byte -> append("%02x".format(byte)) }
        }
    }

    /**
     * Builds a prioritized list of identifiers that may have been used to persist local history
     * for the supplied user. The list always preserves insertion order and excludes blanks.
     */
    fun candidateIds(userId: String?, email: String?): List<String> {
        val identifiers = LinkedHashSet<String>()
        if (!userId.isNullOrBlank()) {
            identifiers.add(userId)
        }

        val hashed = email?.let { fromEmail(it) }.orEmpty()
        if (hashed.isNotBlank()) {
            identifiers.add(hashed)
        }

        return identifiers.toList()
    }
}
