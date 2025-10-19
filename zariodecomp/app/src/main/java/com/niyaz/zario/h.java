package com.niyaz.zario;

import J0.s;
import S2.u;
import S2.x;
import android.content.Context;
import androidx.work.WorkerParameters;
import c3.InterfaceC0338b;
import com.niyaz.zario.worker.MonitoringWorkScheduler;
import com.niyaz.zario.worker.UsageMonitoringWorker;
import com.niyaz.zario.worker.UsageMonitoringWorker_AssistedFactory;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\h.smali */
public final class h implements UsageMonitoringWorker_AssistedFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f6644a;

    public h(i iVar) {
        this.f6644a = iVar;
    }

    @Override // com.niyaz.zario.worker.UsageMonitoringWorker_AssistedFactory, i0.b
    public final s create(Context context, WorkerParameters workerParameters) {
        i iVar = this.f6644a;
        u uVar = (u) iVar.f6646b.evaluationRepositoryProvider.get();
        DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl = iVar.f6646b;
        return new UsageMonitoringWorker(context, workerParameters, uVar, (x) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.evaluationResultProcessorProvider.get(), (U2.l) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.usageStatsRepositoryProvider.get(), (MonitoringWorkScheduler) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.monitoringWorkSchedulerProvider.get(), (InterfaceC0338b) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.appMonitoringNotificationDispatcherProvider.get(), (S2.b) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.bindEvaluationRemoteDataSourceProvider.get());
    }
}
