package com.niyaz.zario.data

import android.content.Context
import androidx.datastore.preferences.preferencesDataStore

/**
 * Centralised DataStore delegates to ensure a single instance per file name across the app.
 */
val Context.userSessionDataStore by preferencesDataStore(name = "user_session_prefs")

val Context.evaluationDataStore by preferencesDataStore(name = "evaluation_prefs")
