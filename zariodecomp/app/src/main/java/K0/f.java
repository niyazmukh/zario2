package K0;

import A2.C0009i;
import A2.RunnableC0012l;
import A2.RunnableC0016p;
import J0.C0108b;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K0\f.smali */
public final class f {

    /* renamed from: l, reason: collision with root package name */
    public static final String f2135l = J0.t.f("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f2137b;

    /* renamed from: c, reason: collision with root package name */
    public final C0108b f2138c;

    /* renamed from: d, reason: collision with root package name */
    public final V0.a f2139d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f2140e;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f2142g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f2141f = new HashMap();
    public final HashSet i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2143j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f2136a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f2144k = new Object();
    public final HashMap h = new HashMap();

    public f(Context context, C0108b c0108b, V0.a aVar, WorkDatabase workDatabase) {
        this.f2137b = context;
        this.f2138c = c0108b;
        this.f2139d = aVar;
        this.f2140e = workDatabase;
    }

    public static boolean d(String str, u uVar, int i) {
        if (uVar == null) {
            J0.t.d().a(f2135l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        uVar.f2206v = i;
        uVar.h();
        uVar.f2205u.cancel(true);
        if (uVar.f2193e == null || !(uVar.f2205u.f3290a instanceof U0.a)) {
            J0.t.d().a(u.f2188w, "WorkSpec " + uVar.f2192d + " is already done. Not interrupting.");
        } else {
            uVar.f2193e.stop(i);
        }
        J0.t.d().a(f2135l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.f2144k) {
            this.f2143j.add(cVar);
        }
    }

    public final u b(String str) {
        u uVar = (u) this.f2141f.remove(str);
        boolean z4 = uVar != null;
        if (!z4) {
            uVar = (u) this.f2142g.remove(str);
        }
        this.h.remove(str);
        if (z4) {
            synchronized (this.f2144k) {
                try {
                    if (this.f2141f.isEmpty()) {
                        Context context = this.f2137b;
                        String str2 = R0.a.f2822n;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f2137b.startService(intent);
                        } catch (Throwable th) {
                            J0.t.d().c(f2135l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.f2136a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f2136a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return uVar;
    }

    public final u c(String str) {
        u uVar = (u) this.f2141f.get(str);
        return uVar == null ? (u) this.f2142g.get(str) : uVar;
    }

    public final void e(c cVar) {
        synchronized (this.f2144k) {
            this.f2143j.remove(cVar);
        }
    }

    public final void f(S0.j jVar) {
        ((V0.b) ((S0.i) this.f2139d).f2861d).execute(new RunnableC0012l(10, this, jVar));
    }

    public final void g(String str, J0.j jVar) {
        synchronized (this.f2144k) {
            try {
                J0.t.d().e(f2135l, "Moving WorkSpec (" + str + ") to the foreground");
                u uVar = (u) this.f2142g.remove(str);
                if (uVar != null) {
                    if (this.f2136a == null) {
                        PowerManager.WakeLock wakeLockA = T0.p.a(this.f2137b, "ProcessorForegroundLck");
                        this.f2136a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f2141f.put(str, uVar);
                    B.l.startForegroundService(this.f2137b, R0.a.d(this.f2137b, p1.b.r(uVar.f2192d), jVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(l lVar, C0009i c0009i) {
        boolean z4;
        S0.j jVar = lVar.f2156a;
        String str = jVar.f2862a;
        ArrayList arrayList = new ArrayList();
        S0.q qVar = (S0.q) this.f2140e.n(new e(this, arrayList, str, 0));
        if (qVar == null) {
            J0.t.d().g(f2135l, "Didn't find WorkSpec for id " + jVar);
            f(jVar);
            return false;
        }
        synchronized (this.f2144k) {
            try {
                synchronized (this.f2144k) {
                    z4 = c(str) != null;
                }
                if (z4) {
                    Set set = (Set) this.h.get(str);
                    if (((l) set.iterator().next()).f2156a.f2863b == jVar.f2863b) {
                        set.add(lVar);
                        J0.t.d().a(f2135l, "Work " + jVar + " is already enqueued for processing");
                    } else {
                        f(jVar);
                    }
                    return false;
                }
                if (qVar.f2912t != jVar.f2863b) {
                    f(jVar);
                    return false;
                }
                Context context = this.f2137b;
                C0108b c0108b = this.f2138c;
                V0.a aVar = this.f2139d;
                WorkDatabase workDatabase = this.f2140e;
                t tVar = new t();
                tVar.h = new C0009i();
                tVar.f2181a = context.getApplicationContext();
                tVar.f2183c = aVar;
                tVar.f2182b = this;
                tVar.f2184d = c0108b;
                tVar.f2185e = workDatabase;
                tVar.f2186f = qVar;
                tVar.f2187g = arrayList;
                if (c0009i != null) {
                    tVar.h = c0009i;
                }
                u uVar = new u(tVar);
                U0.k kVar = uVar.f2204t;
                kVar.a(new RunnableC0016p(this, kVar, uVar, 2), (V0.b) ((S0.i) this.f2139d).f2861d);
                this.f2142g.put(str, uVar);
                HashSet hashSet = new HashSet();
                hashSet.add(lVar);
                this.h.put(str, hashSet);
                ((T0.m) ((S0.i) this.f2139d).f2858a).execute(uVar);
                J0.t.d().a(f2135l, f.class.getSimpleName() + ": processing " + jVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
