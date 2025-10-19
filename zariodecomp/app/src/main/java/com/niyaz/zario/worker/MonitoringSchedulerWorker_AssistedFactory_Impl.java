package com.niyaz.zario.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import javax.inject.Provider;
import y3.C1059b;
import y3.InterfaceC1060c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\MonitoringSchedulerWorker_AssistedFactory_Impl.smali */
public final class MonitoringSchedulerWorker_AssistedFactory_Impl implements MonitoringSchedulerWorker_AssistedFactory {
    private final MonitoringSchedulerWorker_Factory delegateFactory;

    public MonitoringSchedulerWorker_AssistedFactory_Impl(MonitoringSchedulerWorker_Factory monitoringSchedulerWorker_Factory) {
        this.delegateFactory = monitoringSchedulerWorker_Factory;
    }

    public static InterfaceC1060c createFactoryProvider(MonitoringSchedulerWorker_Factory monitoringSchedulerWorker_Factory) {
        return new C1059b(new MonitoringSchedulerWorker_AssistedFactory_Impl(monitoringSchedulerWorker_Factory));
    }

    @Override // com.niyaz.zario.worker.MonitoringSchedulerWorker_AssistedFactory, i0.b
    public MonitoringSchedulerWorker create(Context context, WorkerParameters workerParameters) {
        return this.delegateFactory.get(context, workerParameters);
    }

    public static Provider<MonitoringSchedulerWorker_AssistedFactory> create(MonitoringSchedulerWorker_Factory monitoringSchedulerWorker_Factory) {
        return new C1059b(new MonitoringSchedulerWorker_AssistedFactory_Impl(monitoringSchedulerWorker_Factory));
    }
}
