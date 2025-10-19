package B3;

import android.content.Context;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Future;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\I1.smali */
public final class I1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f437c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f440f;

    public /* synthetic */ I1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f435a = i;
        this.f440f = obj;
        this.f436b = obj2;
        this.f437c = obj3;
        this.f438d = obj4;
        this.f439e = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z3.k0 k0Var;
        switch (this.f435a) {
            case 0:
                for (V1 v12 : (Collection) this.f436b) {
                    if (v12 != ((V1) this.f437c)) {
                        v12.f577a.h(N0.G);
                    }
                }
                Future future = (Future) this.f438d;
                if (future != null) {
                    future.cancel(false);
                }
                Future future2 = (Future) this.f439e;
                if (future2 != null) {
                    future2.cancel(false);
                }
                N0 n02 = (N0) this.f440f;
                S0.n nVar = ((Y0) n02.f471D.f411b).f626I;
                synchronized (nVar.f2872a) {
                    try {
                        ((HashSet) nVar.f2873b).remove(n02);
                        if (((HashSet) nVar.f2873b).isEmpty()) {
                            k0Var = (z3.k0) nVar.f2874c;
                            nVar.f2873b = new HashSet();
                        } else {
                            k0Var = null;
                        }
                    } finally {
                    }
                }
                if (k0Var != null) {
                    ((Y0) nVar.f2875d).f625H.b(k0Var);
                    return;
                }
                return;
            default:
                try {
                    if (!(((U0.k) this.f436b).f3290a instanceof U0.a)) {
                        String string = ((UUID) this.f437c).toString();
                        S0.q qVarK = ((T0.s) this.f440f).f3179c.k(string);
                        if (qVarK == null || B.a.b(qVarK.f2896b)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((T0.s) this.f440f).f3178b.g(string, (J0.j) this.f438d);
                        ((Context) this.f439e).startService(R0.a.a((Context) this.f439e, p1.b.r(qVarK), (J0.j) this.f438d));
                    }
                    ((U0.k) this.f436b).j(null);
                    return;
                } catch (Throwable th) {
                    ((U0.k) this.f436b).k(th);
                    return;
                }
        }
    }
}
