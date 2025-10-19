package com.niyaz.zario.worker;

import android.content.Context;
import javax.inject.Provider;
import y3.InterfaceC1060c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\MonitoringWorkScheduler_Factory.smali */
public final class MonitoringWorkScheduler_Factory implements InterfaceC1060c {
    private final Provider<Context> contextProvider;

    public MonitoringWorkScheduler_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static MonitoringWorkScheduler_Factory create(Provider<Context> provider) {
        return new MonitoringWorkScheduler_Factory(provider);
    }

    public static MonitoringWorkScheduler newInstance(Context context) {
        return new MonitoringWorkScheduler(context);
    }

    @Override // javax.inject.Provider
    public MonitoringWorkScheduler get() {
        return newInstance(this.contextProvider.get());
    }
}
