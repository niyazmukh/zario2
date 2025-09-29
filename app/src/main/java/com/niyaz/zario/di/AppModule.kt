package com.niyaz.zario.di

import android.content.Context
import androidx.room.Room
import com.niyaz.zario.data.local.AppDatabase
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.data.local.dao.HourlyUsageDao
import com.niyaz.zario.data.local.dao.RemoteSyncDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.plus

/**
 * Main application module for Hilt dependency injection.
 * Provides application-wide dependencies and bindings.
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    
    // Repository dependencies are already annotated with @Singleton
    // and @Inject constructor, so no explicit bindings needed.
    // This module serves as the central DI configuration point
    // for any future application-wide dependencies.

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "zario_db"
        ).fallbackToDestructiveMigration().build()
    }

    @Provides
    fun provideEvaluationHistoryDao(db: AppDatabase): EvaluationHistoryDao = db.evaluationHistoryDao()

    @Provides
    fun provideHourlyUsageDao(db: AppDatabase): HourlyUsageDao = db.hourlyUsageDao()

    @Provides
    fun provideRemoteSyncDao(db: AppDatabase): RemoteSyncDao = db.remoteSyncDao()

    @Provides
    @Singleton
    @ApplicationScope
    fun provideApplicationScope(): CoroutineScope {
        return CoroutineScope(SupervisorJob()).plus(Dispatchers.IO)
    }
} 