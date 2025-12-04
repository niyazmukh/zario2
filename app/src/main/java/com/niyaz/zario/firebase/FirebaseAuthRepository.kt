package com.niyaz.zario.firebase

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.niyaz.zario.auth.AuthRepository
import com.niyaz.zario.auth.SignupRequest
import com.niyaz.zario.data.Condition
import com.niyaz.zario.data.User
import com.niyaz.zario.Constants
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

@Singleton
class FirebaseAuthRepository @Inject constructor(
    private val auth: FirebaseAuth,
    private val userGateway: FirestoreUserGateway,
    private val syncCoordinator: FirestoreSyncCoordinator
) : AuthRepository {

    override suspend fun signUp(request: SignupRequest): Result<User> = withContext(Dispatchers.IO) {
        runCatching {
            val authResult = withFirebaseTimeout {
                auth.createUserWithEmailAndPassword(request.email, request.password).await()
            }
            val user = authResult.user ?: throw IllegalStateException("FirebaseAuth did not return a user")
            val userId = user.uid

            withFirebaseTimeout {
                userGateway.upsertUserProfile(userId, request.toProfilePayload())
            }

            runCatching {
                syncCoordinator.syncFromRemote(userId, request.email)
            }.onFailure { Log.w(TAG, "Post-signup remote sync failed", it) }

            request.toUser(userId)
        }
    }

    override suspend fun login(email: String, password: String): Result<User> = withContext(Dispatchers.IO) {
        runCatching {
            val authResult = withFirebaseTimeout {
                auth.signInWithEmailAndPassword(email, password).await()
            }
            val firebaseUser = authResult.user ?: throw IllegalStateException("FirebaseAuth did not return a user")
            val userId = firebaseUser.uid

            val snapshot = withFirebaseTimeout {
                userGateway.fetchUserProfile(userId)
            }

            runCatching {
                syncCoordinator.syncFromRemote(userId, firebaseUser.email ?: email)
            }.onFailure { Log.w(TAG, "Post-login remote sync failed", it) }

            snapshot.toUser(userId, firebaseUser.email ?: email)
        }
    }

    override suspend fun logout() = withContext(Dispatchers.IO) {
        auth.signOut()
    }

    private fun SignupRequest.toUser(userId: String) = User(
        email = email,
        id = userId,
        yearOfBirth = yearOfBirth,
        gender = gender,
        condition = condition
    )

    private fun SignupRequest.toProfilePayload(): Map<String, Any?> {
        val payload = mutableMapOf<String, Any?>(
            FirestoreFields.EMAIL to email,
            FirestoreFields.YEAR_OF_BIRTH to yearOfBirth,
            FirestoreFields.GENDER to gender,
            FirestoreFields.CONDITION to condition.name,
            FirestoreFields.POINTS_BALANCE to FirestoreDefaults.INITIAL_POINTS_BALANCE,
            FirestoreFields.FLEXIBLE_REWARD to Constants.FLEXIBLE_REWARD,
            FirestoreFields.FLEXIBLE_PENALTY to Constants.FLEXIBLE_PENALTY,
            FirestoreFields.HAS_SET_FLEXIBLE_STAKES to false,
            FirestoreFields.GOAL_SUCCESS_STREAK to 0
        )
        referralNumber?.let { referral ->
            payload[FirestoreFields.REFERRAL_NUMBER] = referral
        }
        return payload
    }

    private fun com.google.firebase.firestore.DocumentSnapshot.toUser(
        userId: String,
        fallbackEmail: String
    ): User {
        val email = getString(FirestoreFields.EMAIL) ?: fallbackEmail
        val year = getString(FirestoreFields.YEAR_OF_BIRTH) ?: ""
        val gender = getString(FirestoreFields.GENDER) ?: ""
        val conditionValue = getString(FirestoreFields.CONDITION)
        val points = getLong(FirestoreFields.POINTS_BALANCE)?.toInt() ?: FirestoreDefaults.INITIAL_POINTS_BALANCE
        val flexibleReward = getLong(FirestoreFields.FLEXIBLE_REWARD)?.toInt() ?: Constants.FLEXIBLE_REWARD
        val flexiblePenalty = getLong(FirestoreFields.FLEXIBLE_PENALTY)?.toInt() ?: Constants.FLEXIBLE_PENALTY
        val hasFlexibleStakes = getBoolean(FirestoreFields.HAS_SET_FLEXIBLE_STAKES) ?: false

        return User(
            email = email,
            id = userId,
            yearOfBirth = year,
            gender = gender,
            condition = Condition.fromStored(conditionValue),
            points = points,
            flexibleReward = flexibleReward,
            flexiblePenalty = flexiblePenalty,
            hasSetFlexibleStakes = hasFlexibleStakes
        )
    }

    companion object {
        private const val TAG = "FirebaseAuthRepo"
    }
}
