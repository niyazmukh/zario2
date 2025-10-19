package K0;

import J0.C;
import J0.C0108b;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K0\r.smali */
public final class r extends C {

    /* renamed from: k, reason: collision with root package name */
    public static r f2169k;

    /* renamed from: l, reason: collision with root package name */
    public static r f2170l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f2171m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2172a;

    /* renamed from: b, reason: collision with root package name */
    public final C0108b f2173b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f2174c;

    /* renamed from: d, reason: collision with root package name */
    public final V0.a f2175d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2176e;

    /* renamed from: f, reason: collision with root package name */
    public final f f2177f;

    /* renamed from: g, reason: collision with root package name */
    public final h1.i f2178g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;

    /* renamed from: j, reason: collision with root package name */
    public final S0.n f2179j;

    static {
        J0.t.f("WorkManagerImpl");
        f2169k = null;
        f2170l = null;
        f2171m = new Object();
    }

    public r(Context context, final C0108b c0108b, V0.a aVar, final WorkDatabase workDatabase, final List list, f fVar, S0.n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (q.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        J0.t tVar = new J0.t(c0108b.f2030g);
        synchronized (J0.t.f2062b) {
            J0.t.f2063c = tVar;
        }
        this.f2172a = applicationContext;
        this.f2175d = aVar;
        this.f2174c = workDatabase;
        this.f2177f = fVar;
        this.f2179j = nVar;
        this.f2173b = c0108b;
        this.f2176e = list;
        this.f2178g = new h1.i(workDatabase, 9);
        final T0.m mVar = (T0.m) ((S0.i) aVar).f2858a;
        String str = k.f2155a;
        fVar.a(new c() { // from class: K0.i
            @Override // K0.c
            public final void c(final S0.j jVar, boolean z4) {
                final List list2 = list;
                final C0108b c0108b2 = c0108b;
                final WorkDatabase workDatabase2 = workDatabase;
                mVar.execute(new Runnable() { // from class: K0.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        List list3 = list2;
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            ((h) it.next()).a(jVar.f2862a);
                        }
                        k.b(c0108b2, workDatabase2, list3);
                    }
                });
            }
        });
        aVar.c(new T0.e(applicationContext, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        throw r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static K0.r b(android.content.Context r4) {
        /*
            java.lang.Object r0 = K0.r.f2171m
            monitor-enter(r0)
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3d
            K0.r r1 = K0.r.f2169k     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            goto Lf
        La:
            r4 = move-exception
            goto L50
        Lc:
            K0.r r1 = K0.r.f2170l     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
        Lf:
            if (r1 != 0) goto L4e
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r4 instanceof J0.InterfaceC0107a     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L46
            r1 = r4
            J0.a r1 = (J0.InterfaceC0107a) r1     // Catch: java.lang.Throwable -> L3d
            com.niyaz.zario.MinutesApp r1 = (com.niyaz.zario.MinutesApp) r1     // Catch: java.lang.Throwable -> L3d
            r1.getClass()     // Catch: java.lang.Throwable -> L3d
            E2.j r2 = new E2.j     // Catch: java.lang.Throwable -> L3d
            r3 = 4
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3d
            i0.a r1 = r1.f6619c     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L3f
            r2.f1460c = r1     // Catch: java.lang.Throwable -> L3d
            r1 = 6
            r2.f1459b = r1     // Catch: java.lang.Throwable -> L3d
            J0.b r1 = new J0.b     // Catch: java.lang.Throwable -> L3d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3d
            c(r4, r1)     // Catch: java.lang.Throwable -> L3d
            K0.r r1 = b(r4)     // Catch: java.lang.Throwable -> L3d
            goto L4e
        L3d:
            r4 = move-exception
            goto L52
        L3f:
            java.lang.String r4 = "workerFactory"
            kotlin.jvm.internal.i.i(r4)     // Catch: java.lang.Throwable -> L3d
            r4 = 0
            throw r4     // Catch: java.lang.Throwable -> L3d
        L46:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            throw r4     // Catch: java.lang.Throwable -> L3d
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            return r1
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r4     // Catch: java.lang.Throwable -> L3d
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.r.b(android.content.Context):K0.r");
    }

    public static void c(Context context, C0108b c0108b) {
        synchronized (f2171m) {
            try {
                r rVar = f2169k;
                if (rVar != null && f2170l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (rVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f2170l == null) {
                        f2170l = p1.b.n(applicationContext, c0108b);
                    }
                    f2169k = f2170l;
                }
            } finally {
            }
        }
    }

    @Override // J0.C
    public final S0.c a(String str) {
        T0.c cVar = new T0.c(this, str, true);
        this.f2175d.c(cVar);
        return (S0.c) cVar.f429b;
    }

    public final void d() {
        synchronized (f2171m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        ArrayList arrayListC;
        String str = N0.b.f2549f;
        Context context = this.f2172a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListC = N0.b.c(context, jobScheduler)) != null && !arrayListC.isEmpty()) {
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                N0.b.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.f2174c;
        S0.t tVarV = workDatabase.v();
        WorkDatabase_Impl workDatabase_Impl = tVarV.f2920a;
        workDatabase_Impl.b();
        S0.h hVar = tVarV.f2930m;
        z0.i iVarA = hVar.a();
        workDatabase_Impl.c();
        try {
            iVarA.e();
            workDatabase_Impl.o();
            workDatabase_Impl.j();
            hVar.q(iVarA);
            k.b(this.f2173b, workDatabase, this.f2176e);
        } catch (Throwable th) {
            workDatabase_Impl.j();
            hVar.q(iVarA);
            throw th;
        }
    }
}
