package com.niyaz.zario.firebase

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import com.google.firebase.firestore.PersistentCacheSettings
import com.niyaz.zario.auth.AuthRepository
import com.niyaz.zario.core.evaluation.EvaluationRemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object FirebaseModule {

    @Provides
    @Singleton
    fun provideFirebaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()

    @Provides
    @Singleton
    fun provideFirebaseFirestore(): FirebaseFirestore {
        return FirebaseFirestore.getInstance().apply {
            // Enable offline persistence to cache writes locally when network unavailable
            // Persisted data survives app restarts (protects against data loss on uninstall)
            val persistentCache = PersistentCacheSettings.newBuilder().build()
            firestoreSettings = FirebaseFirestoreSettings.Builder(firestoreSettings)
                .setLocalCacheSettings(persistentCache)
                .build()
        }
    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class EvaluationRemoteDataModule {

    @Binds
    @Singleton
    abstract fun bindEvaluationRemoteDataSource(
        impl: FirebaseEvaluationRemoteDataSource
    ): EvaluationRemoteDataSource
}

@Module
@InstallIn(SingletonComponent::class)
abstract class FirebaseAuthModule {

    @Binds
    @Singleton
    abstract fun bindAuthRepository(
        impl: FirebaseAuthRepository
    ): AuthRepository
}
