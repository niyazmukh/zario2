package com.niyaz.zario;

import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import y3.InterfaceC1060c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\d.smali */
public final class d implements InterfaceC1060c {
    @Override // javax.inject.Provider
    public final Object get() {
        return ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();
    }
}
