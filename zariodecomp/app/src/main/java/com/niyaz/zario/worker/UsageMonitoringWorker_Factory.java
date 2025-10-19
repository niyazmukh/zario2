package com.niyaz.zario.worker;

import S2.u;
import S2.x;
import U2.l;
import android.content.Context;
import androidx.work.WorkerParameters;
import c3.InterfaceC0338b;
import javax.inject.Provider;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\UsageMonitoringWorker_Factory.smali */
public final class UsageMonitoringWorker_Factory {
    private final Provider<MonitoringWorkScheduler> monitoringWorkSchedulerProvider;
    private final Provider<InterfaceC0338b> notificationDispatcherProvider;
    private final Provider<S2.b> remoteDataSourceProvider;
    private final Provider<u> repositoryProvider;
    private final Provider<x> resultProcessorProvider;
    private final Provider<l> usageStatsRepositoryProvider;

    public UsageMonitoringWorker_Factory(Provider<u> provider, Provider<x> provider2, Provider<l> provider3, Provider<MonitoringWorkScheduler> provider4, Provider<InterfaceC0338b> provider5, Provider<S2.b> provider6) {
        this.repositoryProvider = provider;
        this.resultProcessorProvider = provider2;
        this.usageStatsRepositoryProvider = provider3;
        this.monitoringWorkSchedulerProvider = provider4;
        this.notificationDispatcherProvider = provider5;
        this.remoteDataSourceProvider = provider6;
    }

    public static UsageMonitoringWorker_Factory create(Provider<u> provider, Provider<x> provider2, Provider<l> provider3, Provider<MonitoringWorkScheduler> provider4, Provider<InterfaceC0338b> provider5, Provider<S2.b> provider6) {
        return new UsageMonitoringWorker_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static UsageMonitoringWorker newInstance(Context context, WorkerParameters workerParameters, u uVar, x xVar, l lVar, MonitoringWorkScheduler monitoringWorkScheduler, InterfaceC0338b interfaceC0338b, S2.b bVar) {
        return new UsageMonitoringWorker(context, workerParameters, uVar, xVar, lVar, monitoringWorkScheduler, interfaceC0338b, bVar);
    }

    public UsageMonitoringWorker get(Context context, WorkerParameters workerParameters) {
        return newInstance(context, workerParameters, this.repositoryProvider.get(), this.resultProcessorProvider.get(), this.usageStatsRepositoryProvider.get(), this.monitoringWorkSchedulerProvider.get(), this.notificationDispatcherProvider.get(), this.remoteDataSourceProvider.get());
    }
}
