package com.niyaz.zario.di

import com.niyaz.zario.core.usage.UsageStatsDataSource
import com.niyaz.zario.core.usage.UsageStatsManagerDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class UsageStatsModule {

    @Binds
    @Singleton
    abstract fun bindUsageStatsDataSource(
        impl: UsageStatsManagerDataSource
    ): UsageStatsDataSource
}
