package com.niyaz.zario.di

import android.content.Context
import androidx.room.Room
import com.niyaz.zario.data.local.AppDatabase
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.Provides
import javax.inject.Singleton
import dagger.hilt.android.qualifiers.ApplicationContext

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
} 