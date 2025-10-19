package y2;

import A2.C0006f;
import A2.C0009i;
import A2.C0013m;
import A2.C0020u;
import A2.G;
import A2.RunnableC0010j;
import A2.RunnableC0016p;
import A2.e0;
import B3.C0063m1;
import E2.C0106i;
import E2.ComponentCallbacks2C0102e;
import a.AbstractC0183a;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import t0.C0908O;
import x2.C1035a;
import x2.C1037c;
import x2.C1038d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\o.smali */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final C0020u f11123a;

    /* renamed from: b, reason: collision with root package name */
    public final C1037c f11124b;

    /* renamed from: c, reason: collision with root package name */
    public final C1035a f11125c;

    /* renamed from: d, reason: collision with root package name */
    public final F2.f f11126d;

    /* renamed from: e, reason: collision with root package name */
    public X2.o f11127e;

    /* renamed from: f, reason: collision with root package name */
    public C3.x f11128f;

    /* renamed from: g, reason: collision with root package name */
    public e0 f11129g;

    public o(final Context context, C0020u c0020u, C1037c c1037c, C1035a c1035a, F2.f fVar, final E2.k kVar, final t tVar) {
        this.f11123a = c0020u;
        this.f11124b = c1037c;
        this.f11125c = c1035a;
        this.f11126d = fVar;
        S0.l.x((B2.f) c0020u.f251c).c();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        fVar.b(new Runnable() { // from class: y2.m
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                Context context2 = context;
                t tVar2 = tVar;
                E2.k kVar2 = kVar;
                o oVar = this.f11115a;
                oVar.getClass();
                try {
                    oVar.a(context2, (C1038d) Tasks.await(taskCompletionSource2.getTask()), tVar2, kVar2);
                } catch (InterruptedException | ExecutionException e5) {
                    throw new RuntimeException(e5);
                }
            }
        });
        C0013m c0013m = new C0013m(this, atomicBoolean, taskCompletionSource, fVar);
        synchronized (c1037c) {
            c1037c.f11021c = c0013m;
            c0013m.a(c1037c.i());
        }
        synchronized (c1035a) {
        }
    }

    public final void a(Context context, C1038d c1038d, t tVar, E2.k kVar) {
        p1.b.p(1, "FirestoreClient", "Initializing. user=%s", c1038d.f11025a);
        C0020u c0020u = this.f11123a;
        C1037c c1037c = this.f11124b;
        C1035a c1035a = this.f11125c;
        F2.f fVar = this.f11126d;
        C0009i c0009i = new C0009i(context, fVar, c0020u, c1038d, c1037c, c1035a, kVar);
        C2.j jVar = tVar.f11136b;
        B2.f fVar2 = (B2.f) c0020u.f251c;
        jVar.f1093c = new S0.l(fVar2);
        jVar.f1092b = new E2.t(fVar, context, c0020u, new E2.l(c1037c, c1035a));
        E2.t tVar2 = (E2.t) jVar.f1092b;
        AbstractC0183a.O(tVar2, "grpcCallProvider not initialized yet", new Object[0]);
        jVar.f1094d = new E2.q(fVar, c1037c, c1035a, fVar2, kVar, tVar2);
        S0.l lVar = (S0.l) jVar.f1093c;
        AbstractC0183a.O(lVar, "remoteSerializer not initialized yet", new Object[0]);
        E2.q qVar = (E2.q) jVar.f1094d;
        AbstractC0183a.O(qVar, "firestoreChannel not initialized yet", new Object[0]);
        jVar.f1095e = new C0106i(fVar, lVar, qVar);
        S0.e eVar = new S0.e();
        eVar.f2852b = new ArrayList();
        AbstractC0183a.N(context != null, "Context must be non-null", new Object[0]);
        eVar.f2851a = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Application application = (Application) context.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new E2.d(eVar, atomicBoolean));
        application.registerComponentCallbacks(new ComponentCallbacks2C0102e(atomicBoolean));
        if (connectivityManager != null) {
            connectivityManager.registerDefaultNetworkCallback(new A3.b(eVar, 1));
        } else {
            context.registerReceiver(new A3.c(eVar, 1), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        jVar.f1096f = eVar;
        S0.f fVarC = tVar.c(c0009i);
        tVar.f11137c = fVarC;
        fVarC.b0();
        S0.f fVar3 = tVar.f11137c;
        AbstractC0183a.O(fVar3, "persistence not initialized yet", new Object[0]);
        tVar.f11138d = new A2.r(fVar3, new G(), c1038d);
        C0908O c0908o = new C0908O(tVar);
        A2.r rVarD = tVar.d();
        C0106i c0106i = (C0106i) jVar.f1095e;
        AbstractC0183a.O(c0106i, "datastore not initialized yet", new Object[0]);
        S0.e eVar2 = (S0.e) jVar.f1096f;
        AbstractC0183a.O(eVar2, "connectivityMonitor not initialized yet", new Object[0]);
        tVar.f11140f = new C0063m1(fVar2, c0908o, rVarD, c0106i, fVar, eVar2);
        A2.r rVarD2 = tVar.d();
        C0063m1 c0063m1 = tVar.f11140f;
        AbstractC0183a.O(c0063m1, "remoteStore not initialized yet", new Object[0]);
        tVar.f11139e = new X2.o(rVarD2, c0063m1, c1038d);
        tVar.f11141g = new C3.x(tVar.e());
        A2.r rVar = tVar.f11138d;
        rVar.f233a.G().run();
        RunnableC0010j runnableC0010j = new RunnableC0010j(rVar, 0);
        S0.f fVar4 = rVar.f233a;
        fVar4.W("Start IndexManager", runnableC0010j);
        fVar4.W("Start MutationQueue", new RunnableC0010j(rVar, 1));
        tVar.f11140f.a();
        tVar.i = tVar.a(c0009i);
        tVar.h = tVar.b(c0009i);
        AbstractC0183a.O(tVar.f11137c, "persistence not initialized yet", new Object[0]);
        this.f11129g = tVar.i;
        tVar.d();
        AbstractC0183a.O(tVar.f11140f, "remoteStore not initialized yet", new Object[0]);
        this.f11127e = tVar.e();
        C3.x xVar = tVar.f11141g;
        AbstractC0183a.O(xVar, "eventManager not initialized yet", new Object[0]);
        this.f11128f = xVar;
        C0006f c0006f = tVar.h;
        e0 e0Var = this.f11129g;
        if (e0Var != null) {
            e0Var.start();
        }
        if (c0006f != null) {
            c0006f.f188a.start();
        }
    }

    public final w b(v vVar, g gVar, C1053b c1053b) {
        c();
        w wVar = new w(vVar, gVar, c1053b);
        this.f11126d.b(new n(this, wVar, 1));
        return wVar;
    }

    public final void c() {
        synchronized (this.f11126d.f1704a) {
        }
    }

    public final Task d(List list) {
        c();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11126d.b(new RunnableC0016p(this, list, taskCompletionSource, 6));
        return taskCompletionSource.getTask();
    }
}
