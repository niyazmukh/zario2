package com.niyaz.zario;

import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.internal.GeneratedComponent;

@ActivityScoped
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\MinutesApp_HiltComponents$ActivityC.smali */
public abstract class MinutesApp_HiltComponents$ActivityC implements o, ActivityComponent, DefaultViewModelFactories.ActivityEntryPoint, HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint, FragmentComponentManager.FragmentComponentBuilderEntryPoint, ViewComponentManager.ViewComponentBuilderEntryPoint, GeneratedComponent {
    @Override // com.niyaz.zario.o
    public abstract /* synthetic */ void injectMainActivity(MainActivity mainActivity);
}
