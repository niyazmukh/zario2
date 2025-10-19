package com.niyaz.zario.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import javax.inject.Provider;
import y3.C1059b;
import y3.InterfaceC1060c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\UsageMonitoringWorker_AssistedFactory_Impl.smali */
public final class UsageMonitoringWorker_AssistedFactory_Impl implements UsageMonitoringWorker_AssistedFactory {
    private final UsageMonitoringWorker_Factory delegateFactory;

    public UsageMonitoringWorker_AssistedFactory_Impl(UsageMonitoringWorker_Factory usageMonitoringWorker_Factory) {
        this.delegateFactory = usageMonitoringWorker_Factory;
    }

    public static InterfaceC1060c createFactoryProvider(UsageMonitoringWorker_Factory usageMonitoringWorker_Factory) {
        return new C1059b(new UsageMonitoringWorker_AssistedFactory_Impl(usageMonitoringWorker_Factory));
    }

    @Override // com.niyaz.zario.worker.UsageMonitoringWorker_AssistedFactory, i0.b
    public UsageMonitoringWorker create(Context context, WorkerParameters workerParameters) {
        return this.delegateFactory.get(context, workerParameters);
    }

    public static Provider<UsageMonitoringWorker_AssistedFactory> create(UsageMonitoringWorker_Factory usageMonitoringWorker_Factory) {
        return new C1059b(new UsageMonitoringWorker_AssistedFactory_Impl(usageMonitoringWorker_Factory));
    }
}
