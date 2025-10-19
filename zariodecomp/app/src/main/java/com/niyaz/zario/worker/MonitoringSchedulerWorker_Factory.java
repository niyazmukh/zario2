package com.niyaz.zario.worker;

import S2.u;
import U2.l;
import android.content.Context;
import androidx.work.WorkerParameters;
import javax.inject.Provider;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\MonitoringSchedulerWorker_Factory.smali */
public final class MonitoringSchedulerWorker_Factory {
    private final Provider<MonitoringWorkScheduler> monitoringWorkSchedulerProvider;
    private final Provider<u> repositoryProvider;
    private final Provider<l> usageStatsRepositoryProvider;

    public MonitoringSchedulerWorker_Factory(Provider<u> provider, Provider<l> provider2, Provider<MonitoringWorkScheduler> provider3) {
        this.repositoryProvider = provider;
        this.usageStatsRepositoryProvider = provider2;
        this.monitoringWorkSchedulerProvider = provider3;
    }

    public static MonitoringSchedulerWorker_Factory create(Provider<u> provider, Provider<l> provider2, Provider<MonitoringWorkScheduler> provider3) {
        return new MonitoringSchedulerWorker_Factory(provider, provider2, provider3);
    }

    public static MonitoringSchedulerWorker newInstance(Context context, WorkerParameters workerParameters, u uVar, l lVar, MonitoringWorkScheduler monitoringWorkScheduler) {
        return new MonitoringSchedulerWorker(context, workerParameters, uVar, lVar, monitoringWorkScheduler);
    }

    public MonitoringSchedulerWorker get(Context context, WorkerParameters workerParameters) {
        return newInstance(context, workerParameters, this.repositoryProvider.get(), this.usageStatsRepositoryProvider.get(), this.monitoringWorkSchedulerProvider.get());
    }
}
