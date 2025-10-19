package com.niyaz.zario;

import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\m.smali */
public final class m implements ComponentSupplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MinutesApp f6658a;

    public m(MinutesApp minutesApp) {
        this.f6658a = minutesApp;
    }

    @Override // dagger.hilt.android.internal.managers.ComponentSupplier
    public final Object get() {
        return new DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl(new ApplicationContextModule(this.f6658a), 0);
    }
}
