package com.niyaz.zario;

import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import y3.C1058a;
import y3.InterfaceC1060c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl.smali */
final class DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl extends MinutesApp_HiltComponents$ActivityRetainedC {
    private final DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl activityRetainedCImpl;
    private InterfaceC1060c provideActivityRetainedLifecycleProvider;
    private final DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl singletonCImpl;

    public /* synthetic */ DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl(DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, SavedStateHandleHolder savedStateHandleHolder, int i) {
        this(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, savedStateHandleHolder);
    }

    private void initialize(SavedStateHandleHolder savedStateHandleHolder) {
        this.provideActivityRetainedLifecycleProvider = C1058a.a(new d());
    }

    @Override // dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint
    public ActivityComponentBuilder activityComponentBuilder() {
        return new b(this.singletonCImpl, this.activityRetainedCImpl);
    }

    @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
        return (ActivityRetainedLifecycle) this.provideActivityRetainedLifecycleProvider.get();
    }

    private DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl(DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, SavedStateHandleHolder savedStateHandleHolder) {
        this.activityRetainedCImpl = this;
        this.singletonCImpl = daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl;
        initialize(savedStateHandleHolder);
    }
}
