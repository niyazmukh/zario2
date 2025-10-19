package com.niyaz.zario.worker;

import A2.C0020u;
import J0.C;
import J0.v;
import K0.m;
import K0.r;
import S0.f;
import S0.q;
import android.content.Context;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

@Singleton
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\MonitoringWorkScheduler.smali */
public final class MonitoringWorkScheduler {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "MonitoringWorkScheduler";
    private final Context context;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\MonitoringWorkScheduler$Companion.smali */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    @Inject
    public MonitoringWorkScheduler(@ApplicationContext Context context) {
        i.e(context, "context");
        this.context = context;
    }

    public static /* synthetic */ void enqueueScheduler$default(MonitoringWorkScheduler monitoringWorkScheduler, long j5, int i, Object obj) {
        if ((i & 1) != 0) {
            j5 = 0;
        }
        monitoringWorkScheduler.enqueueScheduler(j5);
    }

    private final C getWorkManager() {
        r rVarB = r.b(this.context);
        i.d(rVarB, "getInstance(...)");
        return rVarB;
    }

    private final void logDebug(String str) {
    }

    public final void cancelMonitoring() {
        getWorkManager().a(UsageMonitoringWorker.WORK_NAME);
        logDebug("Usage monitoring work cancelled");
    }

    public final void cancelScheduler() {
        getWorkManager().a(MonitoringSchedulerWorker.WORK_NAME);
        logDebug("Monitoring scheduler cancelled");
    }

    public final void enqueueMonitoringWork() {
        C0020u c0020u = new C0020u(UsageMonitoringWorker.class);
        B.a.r(1, "policy");
        q qVar = (q) c0020u.f252d;
        qVar.f2909q = true;
        qVar.f2910r = 1;
        v vVarE = c0020u.e();
        C workManager = getWorkManager();
        workManager.getClass();
        new m((r) workManager, UsageMonitoringWorker.WORK_NAME, 2, Collections.singletonList(vVarE)).x0();
        logDebug("Usage monitoring work enqueued (KEEP policy - preserves in-flight work)");
    }

    public final void enqueueScheduler(long j5) {
        C0020u c0020u = new C0020u(MonitoringSchedulerWorker.class);
        if (j5 > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            i.e(timeUnit, "timeUnit");
            ((q) c0020u.f252d).f2901g = timeUnit.toMillis(j5);
            if (Long.MAX_VALUE - System.currentTimeMillis() <= ((q) c0020u.f252d).f2901g) {
                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
            }
        } else {
            B.a.r(1, "policy");
            q qVar = (q) c0020u.f252d;
            qVar.f2909q = true;
            qVar.f2910r = 1;
        }
        v vVarE = c0020u.e();
        C workManager = getWorkManager();
        workManager.getClass();
        new m((r) workManager, MonitoringSchedulerWorker.WORK_NAME, 1, Collections.singletonList(vVarE)).x0();
        logDebug("Scheduler enqueued with " + j5 + "s delay (REPLACE policy)");
    }

    public final void enqueueSchedulerWithDelayMillis(long j5) {
        enqueueScheduler(TimeUnit.MILLISECONDS.toSeconds(f.u(j5, 0L)));
    }
}
