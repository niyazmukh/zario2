package com.niyaz.zario;

import J0.s;
import S2.u;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.niyaz.zario.worker.MonitoringSchedulerWorker;
import com.niyaz.zario.worker.MonitoringSchedulerWorker_AssistedFactory;
import com.niyaz.zario.worker.MonitoringWorkScheduler;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\f.smali */
public final class f implements MonitoringSchedulerWorker_AssistedFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f6638a;

    public f(i iVar) {
        this.f6638a = iVar;
    }

    @Override // com.niyaz.zario.worker.MonitoringSchedulerWorker_AssistedFactory, i0.b
    public final s create(Context context, WorkerParameters workerParameters) {
        i iVar = this.f6638a;
        u uVar = (u) iVar.f6646b.evaluationRepositoryProvider.get();
        DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl = iVar.f6646b;
        return new MonitoringSchedulerWorker(context, workerParameters, uVar, (U2.l) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.usageStatsRepositoryProvider.get(), (MonitoringWorkScheduler) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.monitoringWorkSchedulerProvider.get());
    }
}
