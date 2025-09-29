package com.niyaz.zario.firebase

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FirebaseAuthInitializer @Inject constructor(
    private val auth: FirebaseAuth
) {
    fun initialize() {
        val user = auth.currentUser
        if (user != null) {
            Log.i("FirebaseAuthInit", "Restored Firebase user ${user.uid}")
        } else {
            Log.i("FirebaseAuthInit", "No authenticated Firebase user found; awaiting email sign-in")
        }
    }
}
