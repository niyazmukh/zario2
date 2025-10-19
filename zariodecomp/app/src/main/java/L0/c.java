package L0;

import A2.C0009i;
import A2.Q;
import B3.J;
import J0.C0108b;
import J0.C0111e;
import J0.t;
import J0.u;
import K0.f;
import K0.h;
import O0.e;
import S0.j;
import S0.l;
import S0.n;
import S0.q;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import f4.A;
import f4.InterfaceC0506g0;
import h1.i;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L0\c.smali */
public final class c implements h, e, K0.c {

    /* renamed from: s, reason: collision with root package name */
    public static final String f2303s = t.f("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f2304a;

    /* renamed from: c, reason: collision with root package name */
    public final a f2306c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2307d;

    /* renamed from: k, reason: collision with root package name */
    public final f f2310k;

    /* renamed from: l, reason: collision with root package name */
    public final l f2311l;

    /* renamed from: m, reason: collision with root package name */
    public final C0108b f2312m;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f2314o;

    /* renamed from: p, reason: collision with root package name */
    public final i f2315p;

    /* renamed from: q, reason: collision with root package name */
    public final V0.a f2316q;

    /* renamed from: r, reason: collision with root package name */
    public final Q f2317r;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2305b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Object f2308e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final S0.e f2309f = new S0.e(5);

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f2313n = new HashMap();

    public c(Context context, C0108b c0108b, n nVar, f fVar, l lVar, V0.a aVar) {
        this.f2304a = context;
        u uVar = c0108b.f2026c;
        g1.i iVar = c0108b.f2029f;
        this.f2306c = new a(this, iVar, uVar);
        this.f2317r = new Q(iVar, lVar);
        this.f2316q = aVar;
        this.f2315p = new i(nVar);
        this.f2312m = c0108b;
        this.f2310k = fVar;
        this.f2311l = lVar;
    }

    @Override // K0.h
    public final void a(String str) {
        Runnable runnable;
        if (this.f2314o == null) {
            int i = T0.l.f3156a;
            Context context = this.f2304a;
            kotlin.jvm.internal.i.e(context, "context");
            C0108b configuration = this.f2312m;
            kotlin.jvm.internal.i.e(configuration, "configuration");
            this.f2314o = Boolean.valueOf(kotlin.jvm.internal.i.a(T0.a.f3133a.a(), context.getApplicationInfo().processName));
        }
        boolean zBooleanValue = this.f2314o.booleanValue();
        String str2 = f2303s;
        if (!zBooleanValue) {
            t.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f2307d) {
            this.f2310k.a(this);
            this.f2307d = true;
        }
        t.d().a(str2, "Cancelling work ID " + str);
        a aVar = this.f2306c;
        if (aVar != null && (runnable = (Runnable) aVar.f2300d.remove(str)) != null) {
            ((Handler) aVar.f2298b.f7594b).removeCallbacks(runnable);
        }
        for (K0.l lVar : this.f2309f.A(str)) {
            this.f2317r.a(lVar);
            l lVar2 = this.f2311l;
            lVar2.getClass();
            lVar2.F(lVar, -512);
        }
    }

    @Override // O0.e
    public final void b(q qVar, O0.c cVar) {
        j jVarR = p1.b.r(qVar);
        boolean z4 = cVar instanceof O0.a;
        l lVar = this.f2311l;
        Q q5 = this.f2317r;
        String str = f2303s;
        S0.e eVar = this.f2309f;
        if (z4) {
            if (eVar.b(jVarR)) {
                return;
            }
            t.d().a(str, "Constraints met: Scheduling work ID " + jVarR);
            K0.l lVarC = eVar.C(jVarR);
            q5.b(lVarC);
            ((V0.a) lVar.f2868c).c(new J((f) lVar.f2867b, lVarC, (C0009i) null));
            return;
        }
        t.d().a(str, "Constraints not met: Cancelling work ID " + jVarR);
        K0.l lVarZ = eVar.z(jVarR);
        if (lVarZ != null) {
            q5.a(lVarZ);
            int i = ((O0.b) cVar).f2613a;
            lVar.getClass();
            lVar.F(lVarZ, i);
        }
    }

    @Override // K0.c
    public final void c(j jVar, boolean z4) {
        InterfaceC0506g0 interfaceC0506g0;
        K0.l lVarZ = this.f2309f.z(jVar);
        if (lVarZ != null) {
            this.f2317r.a(lVarZ);
        }
        synchronized (this.f2308e) {
            interfaceC0506g0 = (InterfaceC0506g0) this.f2305b.remove(jVar);
        }
        if (interfaceC0506g0 != null) {
            t.d().a(f2303s, "Stopping tracking for " + jVar);
            interfaceC0506g0.cancel((CancellationException) null);
        }
        if (z4) {
            return;
        }
        synchronized (this.f2308e) {
            this.f2313n.remove(jVar);
        }
    }

    @Override // K0.h
    public final void d(q... qVarArr) {
        long jMax;
        if (this.f2314o == null) {
            int i = T0.l.f3156a;
            Context context = this.f2304a;
            kotlin.jvm.internal.i.e(context, "context");
            C0108b configuration = this.f2312m;
            kotlin.jvm.internal.i.e(configuration, "configuration");
            this.f2314o = Boolean.valueOf(kotlin.jvm.internal.i.a(T0.a.f3133a.a(), context.getApplicationInfo().processName));
        }
        if (!this.f2314o.booleanValue()) {
            t.d().e(f2303s, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f2307d) {
            this.f2310k.a(this);
            this.f2307d = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (q qVar : qVarArr) {
            if (!this.f2309f.b(p1.b.r(qVar))) {
                synchronized (this.f2308e) {
                    try {
                        j jVarR = p1.b.r(qVar);
                        b bVar = (b) this.f2313n.get(jVarR);
                        if (bVar == null) {
                            int i5 = qVar.f2903k;
                            this.f2312m.f2026c.getClass();
                            bVar = new b(i5, System.currentTimeMillis());
                            this.f2313n.put(jVarR, bVar);
                        }
                        jMax = (Math.max((qVar.f2903k - bVar.f2301a) - 5, 0) * 30000) + bVar.f2302b;
                    } finally {
                    }
                }
                long jMax2 = Math.max(qVar.a(), jMax);
                this.f2312m.f2026c.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (qVar.f2896b == 1) {
                    if (jCurrentTimeMillis < jMax2) {
                        a aVar = this.f2306c;
                        if (aVar != null) {
                            HashMap map = aVar.f2300d;
                            Runnable runnable = (Runnable) map.remove(qVar.f2895a);
                            g1.i iVar = aVar.f2298b;
                            if (runnable != null) {
                                ((Handler) iVar.f7594b).removeCallbacks(runnable);
                            }
                            A3.a aVar2 = new A3.a(8, aVar, qVar);
                            map.put(qVar.f2895a, aVar2);
                            aVar.f2299c.getClass();
                            ((Handler) iVar.f7594b).postDelayed(aVar2, jMax2 - System.currentTimeMillis());
                        }
                    } else if (qVar.b()) {
                        C0111e c0111e = qVar.f2902j;
                        if (c0111e.f2038c) {
                            t.d().a(f2303s, "Ignoring " + qVar + ". Requires device idle.");
                        } else if (c0111e.h.isEmpty()) {
                            hashSet.add(qVar);
                            hashSet2.add(qVar.f2895a);
                        } else {
                            t.d().a(f2303s, "Ignoring " + qVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f2309f.b(p1.b.r(qVar))) {
                        t.d().a(f2303s, "Starting work for " + qVar.f2895a);
                        S0.e eVar = this.f2309f;
                        eVar.getClass();
                        K0.l lVarC = eVar.C(p1.b.r(qVar));
                        this.f2317r.b(lVarC);
                        l lVar = this.f2311l;
                        ((V0.a) lVar.f2868c).c(new J((f) lVar.f2867b, lVarC, (C0009i) null));
                    }
                }
            }
        }
        synchronized (this.f2308e) {
            try {
                if (!hashSet.isEmpty()) {
                    t.d().a(f2303s, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        q qVar2 = (q) it.next();
                        j jVarR2 = p1.b.r(qVar2);
                        if (!this.f2305b.containsKey(jVarR2)) {
                            this.f2305b.put(jVarR2, O0.l.a(this.f2315p, qVar2, (A) ((S0.i) this.f2316q).f2859b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // K0.h
    public final boolean e() {
        return false;
    }
}
