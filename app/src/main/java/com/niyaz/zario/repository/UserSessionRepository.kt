package com.niyaz.zario.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import com.niyaz.zario.data.User
import com.niyaz.zario.data.UserSession
import com.niyaz.zario.data.Condition
import com.niyaz.zario.Constants
import com.niyaz.zario.data.userSessionDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.security.MessageDigest

/**
 * Repository responsible for persisting user session information via Jetpack
 * Preferences DataStore (small, async, type-safe). It is the single offline
 * source-of-truth for authentication state. Remote sync can be layered on
 * later without touching call-sites.
 */
@Singleton
class UserSessionRepository @Inject constructor(@ApplicationContext context: Context) {

    private val dataStore: DataStore<Preferences> = context.userSessionDataStore

    private val _session = MutableStateFlow(UserSession())
    val session: StateFlow<UserSession> = _session.asStateFlow()

    init {
        // Continuously listen to datastore updates and push into StateFlow
        CoroutineScope(Dispatchers.IO).launch {
            dataStore.data
                .map { it.toUserSession() }
                .collect { _session.value = it }
        }
    }

    /**
     * Persist the authenticated user atomically and update the in-memory cache.
     * Blocking to keep existing call-sites unchanged.
     */
    fun setLoggedIn(user: User) {
        runBlocking {
            dataStore.edit { prefs ->
                prefs[PrefKeys.LOGGED_IN] = true
                prefs[PrefKeys.EMAIL] = user.email
                prefs[PrefKeys.YEAR_OF_BIRTH] = user.yearOfBirth
                prefs[PrefKeys.GENDER] = user.gender
                prefs[PrefKeys.CONDITION] = user.condition.name
                prefs[PrefKeys.POINTS] = user.points
                prefs[PrefKeys.FLEXIBLE_REWARD] = user.flexibleReward
                prefs[PrefKeys.FLEXIBLE_PENALTY] = user.flexiblePenalty
                prefs[PrefKeys.HAS_SET_FLEXIBLE_STAKES] = user.hasSetFlexibleStakes
            }
        }
    }

    /** Marks the session as active without mutating stored profile fields. */
    fun markLoggedIn() {
        runBlocking {
            dataStore.edit { prefs ->
                prefs[PrefKeys.LOGGED_IN] = true
            }
        }
    }

    /**
     * Sets custom flexible stakes for FLEXIBLE condition users.
     * Only allowed for users with FLEXIBLE condition.
     */
    fun setFlexibleStakes(reward: Int, penalty: Int): Boolean {
        val currentUser = session.value.user
        if (currentUser?.condition != Condition.FLEXIBLE) {
            return false // Only FLEXIBLE users can set custom stakes
        }

        runBlocking {
            dataStore.edit { prefs ->
                prefs[PrefKeys.FLEXIBLE_REWARD] = reward.coerceIn(Constants.FLEXIBLE_REWARD_MIN, Constants.FLEXIBLE_REWARD_MAX)
                prefs[PrefKeys.FLEXIBLE_PENALTY] = penalty.coerceIn(Constants.FLEXIBLE_PENALTY_MIN, Constants.FLEXIBLE_PENALTY_MAX)
                prefs[PrefKeys.HAS_SET_FLEXIBLE_STAKES] = true
            }
        }
        return true
    }

    /**
     * Checks if the current FLEXIBLE user has configured their custom stakes.
     */
    fun hasSetFlexibleStakes(): Boolean {
        val currentUser = session.value.user
        return currentUser?.condition == Condition.FLEXIBLE && 
               currentUser.hasSetFlexibleStakes
    }

    /**
     * Atomically adjusts the user's points by [delta] while clamping the result
     * between 0 and [Constants.MAX_POINTS]. Returns the new point balance.
     */
    fun adjustPoints(delta: Int): Int {
        var newPoints = 0
        runBlocking {
            dataStore.edit { prefs ->
                val current = prefs[PrefKeys.POINTS] ?: 100
                newPoints = (current + delta).coerceIn(0, Constants.MAX_POINTS)
                prefs[PrefKeys.POINTS] = newPoints
            }
        }
        return newPoints
    }

    /** Stores credentials securely (hashed) during signup. */
    fun saveCredentials(email: String, password: String) {
        val hash = sha256(password)
        runBlocking {
            dataStore.edit { prefs ->
                prefs[PrefKeys.EMAIL] = email
                prefs[PrefKeys.PASSWORD_HASH] = hash
            }
        }
    }

    /** Verifies provided credentials against stored hash. */
    fun isValidCredentials(email: String, password: String): Boolean {
        val stored = runBlocking { dataStore.data.first() }
        val storedEmail = stored[PrefKeys.EMAIL] ?: return false
        val storedHash = stored[PrefKeys.PASSWORD_HASH] ?: return false
        return storedEmail == email && storedHash == sha256(password)
    }

    /** Logs out by marking session inactive but retaining credentials for future login. */
    fun logout() {
        runBlocking {
            dataStore.edit { prefs ->
                prefs[PrefKeys.LOGGED_IN] = false
                // Clear profile fields but keep credentials
                prefs.remove(PrefKeys.YEAR_OF_BIRTH)
                prefs.remove(PrefKeys.GENDER)
            }
        }
        _session.value = UserSession(isLoggedIn = false, user = null)
    }

    // ---------------------------------------------------------------------
    // Preferences ↔ Domain mapping helpers
    // ---------------------------------------------------------------------
    private fun Preferences.toUserSession(): UserSession {
        val isLoggedIn = this[PrefKeys.LOGGED_IN] ?: false
        val user = if (isLoggedIn) {
            User(
                email = this[PrefKeys.EMAIL] ?: "",
                yearOfBirth = this[PrefKeys.YEAR_OF_BIRTH] ?: "",
                gender = this[PrefKeys.GENDER] ?: "",
                condition = Condition.fromStored(this[PrefKeys.CONDITION]),
                points = this[PrefKeys.POINTS] ?: 100,
                hasNotificationPermission = false,
                hasUsageStatsPermission = false,
                flexibleReward = this[PrefKeys.FLEXIBLE_REWARD] ?: Constants.FLEXIBLE_REWARD,
                flexiblePenalty = this[PrefKeys.FLEXIBLE_PENALTY] ?: Constants.FLEXIBLE_PENALTY,
                hasSetFlexibleStakes = this[PrefKeys.HAS_SET_FLEXIBLE_STAKES] ?: false
            )
        } else null
        return UserSession(isLoggedIn = isLoggedIn, user = user)
    }

    // ---------------------------------------------------------------------
    // Hashing helper (SHA-256, hex output)
    // ---------------------------------------------------------------------
    private fun sha256(input: String): String {
        return MessageDigest.getInstance("SHA-256")
            .digest(input.toByteArray())
            .joinToString("") { "%02x".format(it) }
    }

    private object PrefKeys {
        val LOGGED_IN = booleanPreferencesKey("logged_in")
        val EMAIL = stringPreferencesKey("email")
        val YEAR_OF_BIRTH = stringPreferencesKey("year_of_birth")
        val GENDER = stringPreferencesKey("gender")
        val CONDITION = stringPreferencesKey("condition")
        val POINTS = intPreferencesKey("points")
        val PASSWORD_HASH = stringPreferencesKey("password_hash")
        val FLEXIBLE_REWARD = intPreferencesKey("flexible_reward")
        val FLEXIBLE_PENALTY = intPreferencesKey("flexible_penalty")
        val HAS_SET_FLEXIBLE_STAKES = booleanPreferencesKey("has_set_flexible_stakes")
    }
} 