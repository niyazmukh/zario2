package com.niyaz.zario;

import N2.AbstractC0156x;
import N2.j0;
import N2.n0;
import S2.u;
import a.AbstractC0183a;
import a3.AbstractC0197a;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import b3.C0294S;
import b3.C0297V;
import b3.C0302a;
import b3.C0304b;
import b3.C0316k;
import b3.C0324s;
import b3.C0327v;
import c3.C0337a;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.niyaz.zario.data.local.AppDatabase;
import com.niyaz.zario.usage.storage.UsageAggregationDatabase;
import com.niyaz.zario.worker.MonitoringWorkScheduler;
import com.niyaz.zario.worker.WorkProgressRepository;
import d3.C0446b;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import f4.C;
import f4.E;
import f4.N;
import i3.C0605g;
import java.util.Arrays;
import java.util.Set;
import s3.C0878a;
import s3.C0887j;
import s3.D;
import s3.G;
import s3.H;
import s3.L;
import s3.x;
import u0.v;
import u0.w;
import v0.AbstractC0977a;
import v3.InterfaceC1003a;
import w2.r;
import w2.s;
import w3.C1030a;
import y3.InterfaceC1060c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\i.smali */
public final class i implements InterfaceC1060c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6645a;

    /* renamed from: b, reason: collision with root package name */
    public final DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl f6646b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6647c;

    public /* synthetic */ i(DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, int i, int i5) {
        this.f6645a = i5;
        this.f6646b = daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl;
        this.f6647c = i;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        FirebaseFirestore firebaseFirestore;
        Object cVar;
        switch (this.f6645a) {
            case 0:
                boolean z4 = true;
                switch (this.f6647c) {
                    case 0:
                        return new f(this);
                    case 1:
                        return new u((T2.u) this.f6646b.planPreferencesDataSourceProvider.get(), (T2.e) this.f6646b.cycleStateStoreProvider.get(), this.f6646b.evaluationHistoryDao(), this.f6646b.hourlyUsageDao(), (S2.b) this.f6646b.bindEvaluationRemoteDataSourceProvider.get(), (C) this.f6646b.provideApplicationScopeProvider.get());
                    case 2:
                        return new T2.u(ApplicationContextModule_ProvideContextFactory.provideContext(this.f6646b.applicationContextModule), (C) this.f6646b.provideApplicationScopeProvider.get());
                    case 3:
                        k4.c cVarB = E.b(E.d());
                        m4.e eVar = N.f7027a;
                        return new k4.c(cVarB.f8374a.plus(m4.d.f8928c));
                    case 4:
                        return new T2.e((T2.u) this.f6646b.planPreferencesDataSourceProvider.get(), (C) this.f6646b.provideApplicationScopeProvider.get());
                    case 5:
                        Context context = ApplicationContextModule_ProvideContextFactory.provideContext(this.f6646b.applicationContextModule);
                        kotlin.jvm.internal.i.e(context, "context");
                        w wVarC = v.c(context, AppDatabase.class, "zario_db");
                        wVarC.f10452k = 3;
                        wVarC.a((AbstractC0977a[]) Arrays.copyOf(Z2.b.f4011a, 4));
                        wVarC.f10453l = true;
                        wVarC.f10454m = true;
                        return (AppDatabase) wVarC.b();
                    case 6:
                        return new C0324s((C0294S) this.f6646b.firestoreUserGatewayProvider.get(), (FirebaseAuth) this.f6646b.provideFirebaseAuthProvider.get(), this.f6646b.remoteSyncDao(), (C0297V) this.f6646b.remoteSyncSchedulerProvider.get());
                    case 7:
                        return new C0294S((FirebaseFirestore) this.f6646b.provideFirebaseFirestoreProvider.get());
                    case 8:
                        l2.f fVarC = l2.f.c();
                        fVarC.a();
                        s sVar = (s) fVarC.f8774d.a(s.class);
                        AbstractC0156x.i(sVar, "Firestore component is not present.");
                        synchronized (sVar) {
                            FirebaseFirestore firebaseFirestoreA = (FirebaseFirestore) sVar.f10962a.get("(default)");
                            if (firebaseFirestoreA == null) {
                                firebaseFirestoreA = FirebaseFirestore.a(sVar.f10964c, sVar.f10963b, sVar.f10965d, sVar.f10966e, sVar.f10967f);
                                sVar.f10962a.put("(default)", firebaseFirestoreA);
                            }
                            firebaseFirestore = firebaseFirestoreA;
                        }
                        w2.v vVar = new w2.v(104857600L);
                        r rVar = firebaseFirestore.h;
                        w2.q qVar = new w2.q();
                        qVar.f10956f = false;
                        AbstractC0156x.i(rVar, "Provided settings must not be null.");
                        qVar.f10951a = rVar.f10957a;
                        qVar.f10952b = rVar.f10958b;
                        boolean z5 = rVar.f10959c;
                        qVar.f10953c = z5;
                        long j5 = rVar.f10960d;
                        qVar.f10954d = j5;
                        if (!z5 || j5 != 104857600) {
                            qVar.f10956f = true;
                        }
                        boolean z6 = qVar.f10956f;
                        w2.v vVar2 = rVar.f10961e;
                        if (z6) {
                            AbstractC0183a.N(vVar2 == null, "Given settings object mixes both cache config APIs, which is impossible.", new Object[0]);
                        } else {
                            qVar.f10955e = vVar2;
                        }
                        if (qVar.f10956f) {
                            throw new IllegalStateException("Deprecated setPersistenceEnabled() or setCacheSizeBytes() is already used, remove those first.");
                        }
                        qVar.f10955e = vVar;
                        r rVarA = qVar.a();
                        synchronized (firebaseFirestore.f6399c) {
                            try {
                                if (((y2.o) firebaseFirestore.i.f205c) == null) {
                                    z4 = false;
                                }
                                if (z4 && !firebaseFirestore.h.equals(rVarA)) {
                                    throw new IllegalStateException("FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object.");
                                }
                                firebaseFirestore.h = rVarA;
                            } finally {
                            }
                        }
                        return firebaseFirestore;
                    case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
                        kotlin.jvm.internal.i.d(firebaseAuth, "getInstance(...)");
                        return firebaseAuth;
                    case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                        return new C0297V(ApplicationContextModule_ProvideContextFactory.provideContext(this.f6646b.applicationContextModule));
                    case 11:
                        return new U2.l((C0887j) this.f6646b.provideUsageAggregationStoreProvider.get(), (C0878a) this.f6646b.provideUsageAggregationConfigProvider.get(), (t3.b) this.f6646b.provideUsageEventBusProvider.get(), (w3.d) this.f6646b.devicePolicyAdvisorProvider.get(), (C) this.f6646b.provideApplicationScopeProvider.get());
                    case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        w3.c trackedEventSource = (w3.c) this.f6646b.provideTrackedEventSourceProvider.get();
                        InterfaceC1003a rawEventDao = this.f6646b.usageRawEventDao();
                        v3.c sessionDao = this.f6646b.usageSessionDao();
                        C0878a config = (C0878a) this.f6646b.provideUsageAggregationConfigProvider.get();
                        Set set = AbstractC0197a.f4109a;
                        kotlin.jvm.internal.i.e(trackedEventSource, "trackedEventSource");
                        kotlin.jvm.internal.i.e(rawEventDao, "rawEventDao");
                        kotlin.jvm.internal.i.e(sessionDao, "sessionDao");
                        kotlin.jvm.internal.i.e(config, "config");
                        return new C0887j(trackedEventSource, new L(config), sessionDao, rawEventDao, config);
                    case 13:
                        x usageEventSource = (x) this.f6646b.provideUsageEventSourceProvider.get();
                        InterfaceC1003a rawEventDao2 = this.f6646b.usageRawEventDao();
                        C0878a config2 = (C0878a) this.f6646b.provideUsageAggregationConfigProvider.get();
                        Set set2 = AbstractC0197a.f4109a;
                        kotlin.jvm.internal.i.e(usageEventSource, "usageEventSource");
                        kotlin.jvm.internal.i.e(rawEventDao2, "rawEventDao");
                        kotlin.jvm.internal.i.e(config2, "config");
                        cVar = new w3.c(usageEventSource, rawEventDao2, config2);
                        break;
                    case 14:
                        UsageStatsManager usageStatsManager = (UsageStatsManager) this.f6646b.provideUsageStatsManagerProvider.get();
                        C0878a config3 = (C0878a) this.f6646b.provideUsageAggregationConfigProvider.get();
                        G telemetry = (G) this.f6646b.provideUsageIngestionTelemetryProvider.get();
                        Set set3 = AbstractC0197a.f4109a;
                        kotlin.jvm.internal.i.e(usageStatsManager, "usageStatsManager");
                        kotlin.jvm.internal.i.e(config3, "config");
                        kotlin.jvm.internal.i.e(telemetry, "telemetry");
                        cVar = new s3.w(usageStatsManager, config3, telemetry);
                        break;
                    case 15:
                        Context context2 = ApplicationContextModule_ProvideContextFactory.provideContext(this.f6646b.applicationContextModule);
                        Set set4 = AbstractC0197a.f4109a;
                        kotlin.jvm.internal.i.e(context2, "context");
                        Object systemService = context2.getSystemService("usagestats");
                        UsageStatsManager usageStatsManager2 = systemService instanceof UsageStatsManager ? (UsageStatsManager) systemService : null;
                        if (usageStatsManager2 != null) {
                            return usageStatsManager2;
                        }
                        throw new IllegalArgumentException("UsageStatsManager service unavailable");
                    case 16:
                        return new C0878a(AbstractC0197a.f4109a, AbstractC0197a.f4110b);
                    case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        H logger = (H) this.f6646b.usageIngestionTelemetryLoggerProvider.get();
                        Set set5 = AbstractC0197a.f4109a;
                        kotlin.jvm.internal.i.e(logger, "logger");
                        return D.f9709a;
                    case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        return new H();
                    case 19:
                        Context context3 = ApplicationContextModule_ProvideContextFactory.provideContext(this.f6646b.applicationContextModule);
                        Set set6 = AbstractC0197a.f4109a;
                        kotlin.jvm.internal.i.e(context3, "context");
                        w wVarC2 = v.c(context3, UsageAggregationDatabase.class, "usage_aggregation.db");
                        wVarC2.f10453l = true;
                        wVarC2.f10454m = true;
                        return (UsageAggregationDatabase) wVarC2.b();
                    case 20:
                        C scope = (C) this.f6646b.provideApplicationScopeProvider.get();
                        Set set7 = AbstractC0197a.f4109a;
                        kotlin.jvm.internal.i.e(scope, "scope");
                        return new t3.b(scope);
                    case 21:
                        return new w3.d();
                    case 22:
                        return new MonitoringWorkScheduler(ApplicationContextModule_ProvideContextFactory.provideContext(this.f6646b.applicationContextModule));
                    case 23:
                        return new g(this);
                    case 24:
                        return new C0302a();
                    case 25:
                        return new h(this);
                    case 26:
                        return new S2.x((u) this.f6646b.evaluationRepositoryProvider.get(), (e3.o) this.f6646b.userSessionRepositoryProvider.get(), (S2.b) this.f6646b.bindEvaluationRemoteDataSourceProvider.get());
                    case 27:
                        return new e3.o(ApplicationContextModule_ProvideContextFactory.provideContext(this.f6646b.applicationContextModule), (C) this.f6646b.provideApplicationScopeProvider.get(), (C0294S) this.f6646b.firestoreUserGatewayProvider.get(), this.f6646b.remoteSyncDao(), (C0297V) this.f6646b.remoteSyncSchedulerProvider.get());
                    case 28:
                        return new C0337a();
                    case 29:
                        return new C0304b((FirebaseAuth) this.f6646b.provideFirebaseAuthProvider.get());
                    case 30:
                        return new w3.m((C1030a) this.f6646b.activityLifecycleTrackerProvider.get(), (w3.f) this.f6646b.screenStateTrackerProvider.get());
                    case 31:
                        return new C1030a((w3.l) this.f6646b.usageEventRecorderProvider.get());
                    case 32:
                        return new w3.l((t3.b) this.f6646b.provideUsageEventBusProvider.get(), this.f6646b.usageRawEventDao(), (C) this.f6646b.provideApplicationScopeProvider.get());
                    case 33:
                        return new w3.f(this.f6646b.screenStateReceiver());
                    case 34:
                        return new C0446b(ApplicationContextModule_ProvideContextFactory.provideContext(this.f6646b.applicationContextModule));
                    case 35:
                        u evaluationRepository = (u) this.f6646b.evaluationRepositoryProvider.get();
                        U2.l usageStatsRepository = (U2.l) this.f6646b.usageStatsRepositoryProvider.get();
                        S2.x resultProcessor = (S2.x) this.f6646b.evaluationResultProcessorProvider.get();
                        MonitoringWorkScheduler monitoringWorkScheduler = (MonitoringWorkScheduler) this.f6646b.monitoringWorkSchedulerProvider.get();
                        T2.u planPreferencesDataSource = (T2.u) this.f6646b.planPreferencesDataSourceProvider.get();
                        kotlin.jvm.internal.i.e(evaluationRepository, "evaluationRepository");
                        kotlin.jvm.internal.i.e(usageStatsRepository, "usageStatsRepository");
                        kotlin.jvm.internal.i.e(resultProcessor, "resultProcessor");
                        kotlin.jvm.internal.i.e(monitoringWorkScheduler, "monitoringWorkScheduler");
                        kotlin.jvm.internal.i.e(planPreferencesDataSource, "planPreferencesDataSource");
                        S2.a aVar = new S2.a();
                        o4.d.a();
                        return aVar;
                    case 36:
                        return new C0316k((FirebaseAuth) this.f6646b.provideFirebaseAuthProvider.get(), (C0294S) this.f6646b.firestoreUserGatewayProvider.get(), (C0327v) this.f6646b.firestoreSyncCoordinatorProvider.get());
                    case 37:
                        return new C0327v((C0294S) this.f6646b.firestoreUserGatewayProvider.get(), (T2.u) this.f6646b.planPreferencesDataSourceProvider.get(), this.f6646b.evaluationHistoryDao(), this.f6646b.hourlyUsageDao());
                    case 38:
                        return new WorkProgressRepository(ApplicationContextModule_ProvideContextFactory.provideContext(this.f6646b.applicationContextModule));
                    default:
                        throw new AssertionError(this.f6647c);
                }
                return cVar;
            default:
                DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl = this.f6646b;
                int i = this.f6647c;
                switch (i) {
                    case 0:
                        return new h3.c(ApplicationContextModule_ProvideContextFactory.provideContext(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.applicationContextModule), (e3.o) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.userSessionRepositoryProvider.get(), (C0316k) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.firebaseAuthRepositoryProvider.get());
                    case 1:
                        return new C0605g(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.evaluationHistoryDao(), (e3.o) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.userSessionRepositoryProvider.get());
                    case 2:
                        return new j3.l(ApplicationContextModule_ProvideContextFactory.provideContext(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.applicationContextModule), (e3.o) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.userSessionRepositoryProvider.get());
                    case 3:
                        return new k3.u(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.evaluationHistoryDao(), (e3.o) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.userSessionRepositoryProvider.get(), (U2.l) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.usageStatsRepositoryProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.applicationContextModule));
                    case 4:
                        return new m3.q(ApplicationContextModule_ProvideContextFactory.provideContext(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.applicationContextModule), (u) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.evaluationRepositoryProvider.get(), (MonitoringWorkScheduler) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.monitoringWorkSchedulerProvider.get(), (U2.l) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.usageStatsRepositoryProvider.get(), (WorkProgressRepository) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.workProgressRepositoryProvider.get());
                    case 5:
                        return new o3.k(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.evaluationHistoryDao(), (e3.o) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.userSessionRepositoryProvider.get());
                    case 6:
                        return new r3.m(ApplicationContextModule_ProvideContextFactory.provideContext(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.applicationContextModule), (u) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.evaluationRepositoryProvider.get(), (U2.l) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.usageStatsRepositoryProvider.get(), (C0446b) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.permissionsManagerProvider.get());
                    default:
                        throw new AssertionError(i);
                }
        }
    }
}
