package com.niyaz.zario.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.niyaz.zario.Constants
import com.niyaz.zario.data.Condition
import com.niyaz.zario.data.User
import com.niyaz.zario.data.UserSession
import com.niyaz.zario.data.userSessionDataStore
import com.niyaz.zario.di.ApplicationScope
import com.niyaz.zario.security.UserIdentity
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

@Singleton
class UserSessionRepository @Inject constructor(
    @ApplicationContext context: Context,
    @ApplicationScope private val applicationScope: CoroutineScope
) {

    private val dataStore: DataStore<Preferences> = context.userSessionDataStore

    private val _session = MutableStateFlow(UserSession())
    val session: StateFlow<UserSession> = _session.asStateFlow()

    init {
        applicationScope.launch {
            dataStore.data
                .map { it.toUserSession() }
                .collect { _session.value = it }
        }
    }

    suspend fun setLoggedIn(user: User) {
        dataStore.edit { prefs ->
            prefs[PrefKeys.LOGGED_IN] = true
            prefs[PrefKeys.EMAIL] = user.email
            prefs[PrefKeys.USER_ID] = user.id.ifBlank { UserIdentity.fromEmail(user.email) }
            prefs[PrefKeys.YEAR_OF_BIRTH] = user.yearOfBirth
            prefs[PrefKeys.GENDER] = user.gender
            prefs[PrefKeys.CONDITION] = user.condition.name
            prefs[PrefKeys.POINTS] = user.points
            prefs[PrefKeys.FLEXIBLE_REWARD] = user.flexibleReward
            prefs[PrefKeys.FLEXIBLE_PENALTY] = user.flexiblePenalty
            prefs[PrefKeys.HAS_SET_FLEXIBLE_STAKES] = user.hasSetFlexibleStakes
        }
        _session.value = UserSession(isLoggedIn = true, user = user)
    }

    suspend fun setFlexibleStakes(reward: Int, penalty: Int): Boolean {
        val currentUser = session.value.user
        if (currentUser?.condition != Condition.FLEXIBLE) {
            return false
        }

        dataStore.edit { prefs ->
            prefs[PrefKeys.FLEXIBLE_REWARD] = reward.coerceIn(Constants.FLEXIBLE_REWARD_MIN, Constants.FLEXIBLE_REWARD_MAX)
            prefs[PrefKeys.FLEXIBLE_PENALTY] = penalty.coerceIn(Constants.FLEXIBLE_PENALTY_MIN, Constants.FLEXIBLE_PENALTY_MAX)
            prefs[PrefKeys.HAS_SET_FLEXIBLE_STAKES] = true
        }
        return true
    }

    fun hasSetFlexibleStakes(): Boolean {
        val currentUser = session.value.user
        return currentUser?.condition == Condition.FLEXIBLE &&
            currentUser.hasSetFlexibleStakes
    }

    suspend fun awaitSession(): UserSession {
        val prefs = dataStore.data.first()
        val sessionSnapshot = prefs.toUserSession()
        _session.value = sessionSnapshot
        return sessionSnapshot
    }

    suspend fun adjustPoints(delta: Int): Int {
        var newPoints = 0
        dataStore.edit { prefs ->
            val current = prefs[PrefKeys.POINTS] ?: 100
            newPoints = (current + delta).coerceIn(0, Constants.MAX_POINTS)
            prefs[PrefKeys.POINTS] = newPoints
        }
        return newPoints
    }

    suspend fun logout() {
        dataStore.edit { prefs ->
            prefs[PrefKeys.LOGGED_IN] = false
            prefs.remove(PrefKeys.YEAR_OF_BIRTH)
            prefs.remove(PrefKeys.GENDER)
        }
        _session.value = UserSession()
    }

    private fun Preferences.toUserSession(): UserSession {
        val isLoggedIn = this[PrefKeys.LOGGED_IN] ?: false
        val user = if (isLoggedIn) {
            val email = this[PrefKeys.EMAIL] ?: ""
            val userId = this[PrefKeys.USER_ID] ?: UserIdentity.fromEmail(email)
            User(
                email = email,
                id = userId,
                yearOfBirth = this[PrefKeys.YEAR_OF_BIRTH] ?: "",
                gender = this[PrefKeys.GENDER] ?: "",
                condition = Condition.fromStored(this[PrefKeys.CONDITION]),
                points = this[PrefKeys.POINTS] ?: 100,
                flexibleReward = this[PrefKeys.FLEXIBLE_REWARD] ?: Constants.FLEXIBLE_REWARD,
                flexiblePenalty = this[PrefKeys.FLEXIBLE_PENALTY] ?: Constants.FLEXIBLE_PENALTY,
                hasSetFlexibleStakes = this[PrefKeys.HAS_SET_FLEXIBLE_STAKES] ?: false
            )
        } else null
        return UserSession(isLoggedIn = isLoggedIn, user = user)
    }

    private object PrefKeys {
        val LOGGED_IN = booleanPreferencesKey("logged_in")
        val EMAIL = stringPreferencesKey("email")
        val USER_ID = stringPreferencesKey("user_id")
        val YEAR_OF_BIRTH = stringPreferencesKey("year_of_birth")
        val GENDER = stringPreferencesKey("gender")
        val CONDITION = stringPreferencesKey("condition")
        val POINTS = intPreferencesKey("points")
        val FLEXIBLE_REWARD = intPreferencesKey("flexible_reward")
        val FLEXIBLE_PENALTY = intPreferencesKey("flexible_penalty")
        val HAS_SET_FLEXIBLE_STAKES = booleanPreferencesKey("has_set_flexible_stakes")
    }
}
