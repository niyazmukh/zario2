package com.niyaz.zario.di

import com.niyaz.zario.firebase.AppRemoteSyncNotifier
import com.niyaz.zario.firebase.RemoteSyncNotifier
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteSyncModule {

    @Binds
    abstract fun bindRemoteSyncNotifier(impl: AppRemoteSyncNotifier): RemoteSyncNotifier
}
