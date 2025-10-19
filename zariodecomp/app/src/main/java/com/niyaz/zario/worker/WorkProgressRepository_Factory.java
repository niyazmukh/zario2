package com.niyaz.zario.worker;

import android.content.Context;
import javax.inject.Provider;
import y3.InterfaceC1060c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\WorkProgressRepository_Factory.smali */
public final class WorkProgressRepository_Factory implements InterfaceC1060c {
    private final Provider<Context> contextProvider;

    public WorkProgressRepository_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static WorkProgressRepository_Factory create(Provider<Context> provider) {
        return new WorkProgressRepository_Factory(provider);
    }

    public static WorkProgressRepository newInstance(Context context) {
        return new WorkProgressRepository(context);
    }

    @Override // javax.inject.Provider
    public WorkProgressRepository get() {
        return newInstance(this.contextProvider.get());
    }
}
