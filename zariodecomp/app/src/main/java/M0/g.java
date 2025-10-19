package M0;

import J0.t;
import K0.l;
import S0.j;
import S0.n;
import S0.q;
import T0.m;
import T0.p;
import T0.u;
import T0.v;
import T0.w;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f4.A;
import f4.C0510i0;
import java.util.concurrent.CancellationException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M0\g.smali */
public final class g implements O0.e, u {

    /* renamed from: s, reason: collision with root package name */
    public static final String f2452s = t.f("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f2453a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2454b;

    /* renamed from: c, reason: collision with root package name */
    public final j f2455c;

    /* renamed from: d, reason: collision with root package name */
    public final i f2456d;

    /* renamed from: e, reason: collision with root package name */
    public final h1.i f2457e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2458f;

    /* renamed from: k, reason: collision with root package name */
    public int f2459k;

    /* renamed from: l, reason: collision with root package name */
    public final m f2460l;

    /* renamed from: m, reason: collision with root package name */
    public final V0.b f2461m;

    /* renamed from: n, reason: collision with root package name */
    public PowerManager.WakeLock f2462n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2463o;

    /* renamed from: p, reason: collision with root package name */
    public final l f2464p;

    /* renamed from: q, reason: collision with root package name */
    public final A f2465q;

    /* renamed from: r, reason: collision with root package name */
    public volatile C0510i0 f2466r;

    public g(Context context, int i, i iVar, l lVar) {
        this.f2453a = context;
        this.f2454b = i;
        this.f2456d = iVar;
        this.f2455c = lVar.f2156a;
        this.f2464p = lVar;
        n nVar = iVar.f2474e.f2179j;
        S0.i iVar2 = (S0.i) iVar.f2471b;
        this.f2460l = (m) iVar2.f2858a;
        this.f2461m = (V0.b) iVar2.f2861d;
        this.f2465q = (A) iVar2.f2859b;
        this.f2457e = new h1.i(nVar);
        this.f2463o = false;
        this.f2459k = 0;
        this.f2458f = new Object();
    }

    public static void a(g gVar) {
        boolean z4;
        j jVar = gVar.f2455c;
        String str = jVar.f2862a;
        int i = gVar.f2459k;
        String str2 = f2452s;
        if (i >= 2) {
            t.d().a(str2, "Already stopped work for " + str);
            return;
        }
        gVar.f2459k = 2;
        t.d().a(str2, "Stopping work for WorkSpec " + str);
        Context context = gVar.f2453a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.d(intent, jVar);
        V0.b bVar = gVar.f2461m;
        i iVar = gVar.f2456d;
        int i5 = gVar.f2454b;
        bVar.execute(new F1.b(iVar, intent, i5, 1));
        K0.f fVar = iVar.f2473d;
        String str3 = jVar.f2862a;
        synchronized (fVar.f2144k) {
            z4 = fVar.c(str3) != null;
        }
        if (!z4) {
            t.d().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        t.d().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.d(intent2, jVar);
        bVar.execute(new F1.b(iVar, intent2, i5, 1));
    }

    public static void c(g gVar) {
        if (gVar.f2459k != 0) {
            t.d().a(f2452s, "Already started work for " + gVar.f2455c);
            return;
        }
        gVar.f2459k = 1;
        t.d().a(f2452s, "onAllConstraintsMet for " + gVar.f2455c);
        if (!gVar.f2456d.f2473d.h(gVar.f2464p, null)) {
            gVar.d();
            return;
        }
        w wVar = gVar.f2456d.f2472c;
        j jVar = gVar.f2455c;
        synchronized (wVar.f3189d) {
            t.d().a(w.f3185e, "Starting timer for " + jVar);
            wVar.a(jVar);
            v vVar = new v(wVar, jVar);
            wVar.f3187b.put(jVar, vVar);
            wVar.f3188c.put(jVar, gVar);
            ((Handler) wVar.f3186a.f7594b).postDelayed(vVar, 600000L);
        }
    }

    @Override // O0.e
    public final void b(q qVar, O0.c cVar) {
        boolean z4 = cVar instanceof O0.a;
        m mVar = this.f2460l;
        if (z4) {
            mVar.execute(new f(this, 1));
        } else {
            mVar.execute(new f(this, 0));
        }
    }

    public final void d() {
        synchronized (this.f2458f) {
            try {
                if (this.f2466r != null) {
                    this.f2466r.cancel((CancellationException) null);
                }
                this.f2456d.f2472c.a(this.f2455c);
                PowerManager.WakeLock wakeLock = this.f2462n;
                if (wakeLock != null && wakeLock.isHeld()) {
                    t.d().a(f2452s, "Releasing wakelock " + this.f2462n + "for WorkSpec " + this.f2455c);
                    this.f2462n.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        String str = this.f2455c.f2862a;
        this.f2462n = p.a(this.f2453a, str + " (" + this.f2454b + ")");
        t tVarD = t.d();
        String str2 = "Acquiring wakelock " + this.f2462n + "for WorkSpec " + str;
        String str3 = f2452s;
        tVarD.a(str3, str2);
        this.f2462n.acquire();
        q qVarK = this.f2456d.f2474e.f2174c.v().k(str);
        if (qVarK == null) {
            this.f2460l.execute(new f(this, 0));
            return;
        }
        boolean zB = qVarK.b();
        this.f2463o = zB;
        if (zB) {
            this.f2466r = O0.l.a(this.f2457e, qVarK, this.f2465q, this);
            return;
        }
        t.d().a(str3, "No constraints for " + str);
        this.f2460l.execute(new f(this, 1));
    }

    public final void f(boolean z4) {
        t tVarD = t.d();
        StringBuilder sb = new StringBuilder("onExecuted ");
        j jVar = this.f2455c;
        sb.append(jVar);
        sb.append(", ");
        sb.append(z4);
        tVarD.a(f2452s, sb.toString());
        d();
        int i = this.f2454b;
        i iVar = this.f2456d;
        V0.b bVar = this.f2461m;
        Context context = this.f2453a;
        if (z4) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.d(intent, jVar);
            bVar.execute(new F1.b(iVar, intent, i, 1));
        }
        if (this.f2463o) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            bVar.execute(new F1.b(iVar, intent2, i, 1));
        }
    }
}
