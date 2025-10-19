package com.niyaz.zario;

import N2.AbstractC0156x;
import S2.u;
import a3.AbstractC0197a;
import b3.C0304b;
import com.niyaz.zario.data.local.AppDatabase;
import com.niyaz.zario.usage.storage.UsageAggregationDatabase;
import com.niyaz.zario.worker.MonitoringWorkScheduler;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import f4.C;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import u0.v;
import v3.InterfaceC1003a;
import y3.C1058a;
import y3.InterfaceC1060c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.smali */
final class DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl extends MinutesApp_HiltComponents$SingletonC {
    private InterfaceC1060c activityLifecycleTrackerProvider;
    private InterfaceC1060c appMonitoringNotificationDispatcherProvider;
    private InterfaceC1060c appRemoteSyncNotifierProvider;
    private final ApplicationContextModule applicationContextModule;
    private InterfaceC1060c bindEvaluationRemoteDataSourceProvider;
    private InterfaceC1060c cycleSimulationDebuggerProvider;
    private InterfaceC1060c cycleStateStoreProvider;
    private InterfaceC1060c devicePolicyAdvisorProvider;
    private InterfaceC1060c evaluationRepositoryProvider;
    private InterfaceC1060c evaluationResultProcessorProvider;
    private InterfaceC1060c firebaseAuthInitializerProvider;
    private InterfaceC1060c firebaseAuthRepositoryProvider;
    private InterfaceC1060c firebaseEvaluationRemoteDataSourceProvider;
    private InterfaceC1060c firestoreSyncCoordinatorProvider;
    private InterfaceC1060c firestoreUserGatewayProvider;
    private InterfaceC1060c monitoringSchedulerWorker_AssistedFactoryProvider;
    private InterfaceC1060c monitoringWorkSchedulerProvider;
    private InterfaceC1060c permissionsManagerProvider;
    private InterfaceC1060c planPreferencesDataSourceProvider;
    private InterfaceC1060c provideAppDatabaseProvider;
    private InterfaceC1060c provideApplicationScopeProvider;
    private InterfaceC1060c provideFirebaseAuthProvider;
    private InterfaceC1060c provideFirebaseFirestoreProvider;
    private InterfaceC1060c provideTrackedEventSourceProvider;
    private InterfaceC1060c provideUsageAggregationConfigProvider;
    private InterfaceC1060c provideUsageAggregationDatabaseProvider;
    private InterfaceC1060c provideUsageAggregationStoreProvider;
    private InterfaceC1060c provideUsageEventBusProvider;
    private InterfaceC1060c provideUsageEventSourceProvider;
    private InterfaceC1060c provideUsageIngestionTelemetryProvider;
    private InterfaceC1060c provideUsageStatsManagerProvider;
    private InterfaceC1060c remoteSyncSchedulerProvider;
    private InterfaceC1060c remoteSyncWorker_AssistedFactoryProvider;
    private InterfaceC1060c screenStateTrackerProvider;
    private final DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl singletonCImpl;
    private InterfaceC1060c usageEventRecorderProvider;
    private InterfaceC1060c usageIngestionTelemetryLoggerProvider;
    private InterfaceC1060c usageMonitoringWorker_AssistedFactoryProvider;
    private InterfaceC1060c usageStatsRepositoryProvider;
    private InterfaceC1060c usageTrackingInitializerProvider;
    private InterfaceC1060c userSessionRepositoryProvider;
    private InterfaceC1060c workProgressRepositoryProvider;

    public /* synthetic */ DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl(ApplicationContextModule applicationContextModule, int i) {
        this(applicationContextModule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public X2.a evaluationHistoryDao() {
        AppDatabase db = (AppDatabase) this.provideAppDatabaseProvider.get();
        kotlin.jvm.internal.i.e(db, "db");
        X2.a aVarQ = db.q();
        v.b(aVarQ);
        return aVarQ;
    }

    private i0.a hiltWorkerFactory() {
        return new i0.a(mapOfStringAndProviderOfWorkerAssistedFactoryOf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public X2.c hourlyUsageDao() {
        AppDatabase db = (AppDatabase) this.provideAppDatabaseProvider.get();
        kotlin.jvm.internal.i.e(db, "db");
        X2.c cVarR = db.r();
        v.b(cVarR);
        return cVarR;
    }

    private void initialize(ApplicationContextModule applicationContextModule) {
        int i = 0;
        this.provideApplicationScopeProvider = C1058a.a(new i(this.singletonCImpl, 3, i));
        this.planPreferencesDataSourceProvider = C1058a.a(new i(this.singletonCImpl, 2, i));
        this.cycleStateStoreProvider = C1058a.a(new i(this.singletonCImpl, 4, i));
        this.provideAppDatabaseProvider = C1058a.a(new i(this.singletonCImpl, 5, i));
        this.provideFirebaseFirestoreProvider = C1058a.a(new i(this.singletonCImpl, 8, i));
        this.firestoreUserGatewayProvider = C1058a.a(new i(this.singletonCImpl, 7, i));
        this.provideFirebaseAuthProvider = C1058a.a(new i(this.singletonCImpl, 9, i));
        this.remoteSyncSchedulerProvider = C1058a.a(new i(this.singletonCImpl, 10, i));
        i iVar = new i(this.singletonCImpl, 6, i);
        this.firebaseEvaluationRemoteDataSourceProvider = iVar;
        this.bindEvaluationRemoteDataSourceProvider = C1058a.a(iVar);
        this.evaluationRepositoryProvider = C1058a.a(new i(this.singletonCImpl, 1, i));
        this.provideUsageStatsManagerProvider = C1058a.a(new i(this.singletonCImpl, 15, i));
        this.provideUsageAggregationConfigProvider = C1058a.a(new i(this.singletonCImpl, 16, i));
        this.usageIngestionTelemetryLoggerProvider = C1058a.a(new i(this.singletonCImpl, 18, i));
        this.provideUsageIngestionTelemetryProvider = C1058a.a(new i(this.singletonCImpl, 17, i));
        this.provideUsageEventSourceProvider = C1058a.a(new i(this.singletonCImpl, 14, i));
        this.provideUsageAggregationDatabaseProvider = C1058a.a(new i(this.singletonCImpl, 19, i));
        this.provideTrackedEventSourceProvider = C1058a.a(new i(this.singletonCImpl, 13, i));
        this.provideUsageAggregationStoreProvider = C1058a.a(new i(this.singletonCImpl, 12, i));
        this.provideUsageEventBusProvider = C1058a.a(new i(this.singletonCImpl, 20, i));
        this.devicePolicyAdvisorProvider = C1058a.a(new i(this.singletonCImpl, 21, i));
        this.usageStatsRepositoryProvider = C1058a.a(new i(this.singletonCImpl, 11, i));
        this.monitoringWorkSchedulerProvider = C1058a.a(new i(this.singletonCImpl, 22, i));
        this.monitoringSchedulerWorker_AssistedFactoryProvider = y3.d.a(new i(this.singletonCImpl, 0, i));
        this.appRemoteSyncNotifierProvider = C1058a.a(new i(this.singletonCImpl, 24, i));
        this.remoteSyncWorker_AssistedFactoryProvider = y3.d.a(new i(this.singletonCImpl, 23, i));
        this.userSessionRepositoryProvider = C1058a.a(new i(this.singletonCImpl, 27, i));
        this.evaluationResultProcessorProvider = C1058a.a(new i(this.singletonCImpl, 26, i));
        this.appMonitoringNotificationDispatcherProvider = C1058a.a(new i(this.singletonCImpl, 28, i));
        this.usageMonitoringWorker_AssistedFactoryProvider = y3.d.a(new i(this.singletonCImpl, 25, i));
        this.firebaseAuthInitializerProvider = C1058a.a(new i(this.singletonCImpl, 29, i));
        this.usageEventRecorderProvider = C1058a.a(new i(this.singletonCImpl, 32, i));
        this.activityLifecycleTrackerProvider = C1058a.a(new i(this.singletonCImpl, 31, i));
        this.screenStateTrackerProvider = C1058a.a(new i(this.singletonCImpl, 33, i));
        this.usageTrackingInitializerProvider = C1058a.a(new i(this.singletonCImpl, 30, i));
        this.permissionsManagerProvider = C1058a.a(new i(this.singletonCImpl, 34, i));
        this.cycleSimulationDebuggerProvider = C1058a.a(new i(this.singletonCImpl, 35, i));
        this.firestoreSyncCoordinatorProvider = C1058a.a(new i(this.singletonCImpl, 37, i));
        this.firebaseAuthRepositoryProvider = C1058a.a(new i(this.singletonCImpl, 36, i));
        this.workProgressRepositoryProvider = C1058a.a(new i(this.singletonCImpl, 38, i));
    }

    private MinutesApp injectMinutesApp2(MinutesApp minutesApp) {
        minutesApp.f6619c = hiltWorkerFactory();
        minutesApp.f6620d = (u) this.evaluationRepositoryProvider.get();
        minutesApp.f6621e = (C) this.provideApplicationScopeProvider.get();
        minutesApp.f6622f = (MonitoringWorkScheduler) this.monitoringWorkSchedulerProvider.get();
        minutesApp.f6623k = (C0304b) this.firebaseAuthInitializerProvider.get();
        minutesApp.f6624l = (w3.m) this.usageTrackingInitializerProvider.get();
        return minutesApp;
    }

    private Map<String, Provider<i0.b>> mapOfStringAndProviderOfWorkerAssistedFactoryOf() {
        InterfaceC1060c interfaceC1060c = this.monitoringSchedulerWorker_AssistedFactoryProvider;
        InterfaceC1060c interfaceC1060c2 = this.remoteSyncWorker_AssistedFactoryProvider;
        InterfaceC1060c interfaceC1060c3 = this.usageMonitoringWorker_AssistedFactoryProvider;
        AbstractC0156x.g("com.niyaz.zario.worker.MonitoringSchedulerWorker", interfaceC1060c);
        AbstractC0156x.g("com.niyaz.zario.firebase.RemoteSyncWorker", interfaceC1060c2);
        AbstractC0156x.g("com.niyaz.zario.worker.UsageMonitoringWorker", interfaceC1060c3);
        return h2.n.b(3, new Object[]{"com.niyaz.zario.worker.MonitoringSchedulerWorker", interfaceC1060c, "com.niyaz.zario.firebase.RemoteSyncWorker", interfaceC1060c2, "com.niyaz.zario.worker.UsageMonitoringWorker", interfaceC1060c3}, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public X2.g remoteSyncDao() {
        AppDatabase db = (AppDatabase) this.provideAppDatabaseProvider.get();
        kotlin.jvm.internal.i.e(db, "db");
        X2.g gVarS = db.s();
        v.b(gVarS);
        return gVarS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w3.e screenStateReceiver() {
        return new w3.e((w3.l) this.usageEventRecorderProvider.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC1003a usageRawEventDao() {
        UsageAggregationDatabase database = (UsageAggregationDatabase) this.provideUsageAggregationDatabaseProvider.get();
        Set set = AbstractC0197a.f4109a;
        kotlin.jvm.internal.i.e(database, "database");
        InterfaceC1003a interfaceC1003aQ = database.q();
        v.b(interfaceC1003aQ);
        return interfaceC1003aQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v3.c usageSessionDao() {
        UsageAggregationDatabase database = (UsageAggregationDatabase) this.provideUsageAggregationDatabaseProvider.get();
        Set set = AbstractC0197a.f4109a;
        kotlin.jvm.internal.i.e(database, "database");
        v3.c cVarR = database.r();
        v.b(cVarR);
        return cVarR;
    }

    @Override // dagger.hilt.android.flags.FragmentGetContextFix.FragmentGetContextFixEntryPoint
    public Set<Boolean> getDisableFragmentGetContextFix() {
        int i = h2.g.f7673c;
        return h2.o.f7697n;
    }

    @Override // com.niyaz.zario.MinutesApp_HiltComponents$SingletonC, com.niyaz.zario.q
    public void injectMinutesApp(MinutesApp minutesApp) {
        injectMinutesApp2(minutesApp);
    }

    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
        return new c(this.singletonCImpl);
    }

    @Override // dagger.hilt.android.internal.managers.ServiceComponentManager.ServiceComponentBuilderEntryPoint
    public ServiceComponentBuilder serviceComponentBuilder() {
        return new c(this.singletonCImpl);
    }

    private DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl(ApplicationContextModule applicationContextModule) {
        this.singletonCImpl = this;
        this.applicationContextModule = applicationContextModule;
        initialize(applicationContextModule);
    }
}
