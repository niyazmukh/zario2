package com.niyaz.zario.di

import com.niyaz.zario.monitoring.MonitoringNotificationDispatcher
import com.niyaz.zario.monitoring.AppMonitoringNotificationDispatcher
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class MonitoringDispatcherModule {

    @Binds
    @Singleton
    abstract fun bindMonitoringNotificationDispatcher(
        impl: AppMonitoringNotificationDispatcher
    ): MonitoringNotificationDispatcher
}
