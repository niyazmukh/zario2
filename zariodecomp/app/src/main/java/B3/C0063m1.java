package B3;

import A2.C0004d;
import A2.RunnableC0005e;
import E2.AbstractC0101c;
import E2.C0106i;
import N2.C0157y;
import a.AbstractC0183a;
import com.google.protobuf.AbstractC0409l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import t0.C0908O;
import z3.AbstractC1083g;
import z3.C1079c;
import z3.C1091o;

/* renamed from: B3.m1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\m1.1.smali */
public final class C0063m1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f901a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f902b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f903c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f904d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f905e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f906f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f907g;
    public final Object h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public Object f908j;

    /* renamed from: k, reason: collision with root package name */
    public Object f909k;

    public C0063m1(A a5, com.google.android.gms.common.api.internal.F f2, z3.a0 a0Var, C1079c c1079c, K2.c cVar, AbstractC1083g[] abstractC1083gArr) {
        this.i = new Object();
        this.f902b = a5;
        this.f903c = f2;
        this.f904d = a0Var;
        this.f905e = c1079c;
        this.f906f = C1091o.b();
        this.f907g = cVar;
        this.h = abstractC1083gArr;
    }

    public void a() {
        this.f901a = true;
        AbstractC0409l abstractC0409lA = ((A2.r) this.f904d).f235c.a();
        E2.I i = (E2.I) this.i;
        i.getClass();
        abstractC0409lA.getClass();
        i.f1423t = abstractC0409lA;
        if (i()) {
            k();
        } else {
            ((E2.u) this.f907g).c(1);
        }
        c();
    }

    public void b(z3.k0 k0Var) {
        S0.f.g("Cannot fail with OK status", !k0Var.e());
        S0.f.q("apply() or fail() already called", !this.f901a);
        d(new C0035d0(AbstractC0056k0.h(k0Var), EnumC0094y.f1022a, (AbstractC1083g[]) this.h));
    }

    public void c() {
        E2.I i;
        ArrayDeque arrayDeque = (ArrayDeque) this.f909k;
        int i5 = arrayDeque.isEmpty() ? -1 : ((C2.i) arrayDeque.getLast()).f1087a;
        while (true) {
            boolean z4 = this.f901a;
            i = (E2.I) this.i;
            if (!z4 || arrayDeque.size() >= 10) {
                break;
            }
            C2.i iVarC = ((A2.r) this.f904d).f235c.c(i5);
            if (iVarC != null) {
                AbstractC0183a.N(this.f901a && arrayDeque.size() < 10, "addToWritePipeline called when pipeline is full", new Object[0]);
                arrayDeque.add(iVarC);
                if (i.c() && i.f1422s) {
                    i.j(iVarC.f1090d);
                }
                i5 = iVarC.f1087a;
            } else if (arrayDeque.size() == 0 && i.c() && i.f1436b == null) {
                i.f1436b = i.f1440f.a(i.f1441g, AbstractC0101c.f1432o, i.f1439e);
            }
        }
        if (j()) {
            AbstractC0183a.N(j(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
            i.g();
        }
    }

    public void d(InterfaceC0091x interfaceC0091x) {
        boolean z4;
        S0.f.q("already finalized", !this.f901a);
        this.f901a = true;
        synchronized (this.i) {
            try {
                if (((InterfaceC0091x) this.f908j) == null) {
                    this.f908j = interfaceC0091x;
                    z4 = true;
                } else {
                    z4 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            C0064n c0064n = (C0064n) ((K2.c) this.f907g).b;
            if (c0064n.f913b.decrementAndGet() == 0) {
                C0064n.h(c0064n);
                return;
            }
            return;
        }
        S0.f.q("delayedStream is null", ((W) this.f909k) != null);
        U uR = ((W) this.f909k).r(interfaceC0091x);
        if (uR != null) {
            uR.run();
        }
        C0064n c0064n2 = (C0064n) ((K2.c) this.f907g).b;
        if (c0064n2.f913b.decrementAndGet() == 0) {
            C0064n.h(c0064n2);
        }
    }

    public void e(A2.g0 g0Var) {
        Integer numValueOf = Integer.valueOf(g0Var.f194b);
        HashMap map = (HashMap) this.f906f;
        if (map.containsKey(numValueOf)) {
            return;
        }
        map.put(numValueOf, g0Var);
        if (i()) {
            k();
        } else if (((E2.H) this.h).c()) {
            h(g0Var);
        }
    }

    public void f() {
        this.f901a = false;
        E2.H h = (E2.H) this.h;
        boolean zD = h.d();
        E2.x xVar = E2.x.f1508a;
        if (zD) {
            h.a(xVar, z3.k0.f11348e);
        }
        E2.I i = (E2.I) this.i;
        if (i.d()) {
            i.a(xVar, z3.k0.f11348e);
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f909k;
        if (!arrayDeque.isEmpty()) {
            p1.b.p(1, "RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(arrayDeque.size()));
            arrayDeque.clear();
        }
        this.f908j = null;
        ((E2.u) this.f907g).c(1);
        i.b();
        h.b();
        a();
    }

    public void g(int i) {
        ((E2.G) this.f908j).k(i).f1391a++;
        E2.H h = (E2.H) this.h;
        AbstractC0183a.N(h.c(), "Unwatching targets requires an open stream", new Object[0]);
        C0157y c0157yA = N2.A.A();
        String str = (String) h.f1419r.f2868c;
        c0157yA.d();
        N2.A.w((N2.A) c0157yA.f6410b, str);
        c0157yA.d();
        N2.A.y((N2.A) c0157yA.f6410b, i);
        h.i((N2.A) c0157yA.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(A2.g0 r14) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.C0063m1.h(A2.g0):void");
    }

    public boolean i() {
        return (!this.f901a || ((E2.H) this.h).d() || ((HashMap) this.f906f).isEmpty()) ? false : true;
    }

    public boolean j() {
        return (!this.f901a || ((E2.I) this.i).d() || ((ArrayDeque) this.f909k).isEmpty()) ? false : true;
    }

    public void k() {
        AbstractC0183a.N(i(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.f908j = new E2.G((B2.f) this.f902b, this);
        ((E2.H) this.h).g();
        E2.u uVar = (E2.u) this.f907g;
        if (uVar.f1501b == 0) {
            uVar.b(1);
            AbstractC0183a.N(uVar.f1502c == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            uVar.f1502c = uVar.f1504e.a(F2.e.f1698f, 10000L, new RunnableC0005e(uVar, 7));
        }
    }

    public void l(int i) {
        HashMap map = (HashMap) this.f906f;
        AbstractC0183a.N(((A2.g0) map.remove(Integer.valueOf(i))) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(i));
        E2.H h = (E2.H) this.h;
        if (h.c()) {
            g(i);
        }
        if (map.isEmpty()) {
            if (!h.c()) {
                if (this.f901a) {
                    ((E2.u) this.f907g).c(1);
                }
            } else if (h.c() && h.f1436b == null) {
                h.f1436b = h.f1440f.a(h.f1441g, AbstractC0101c.f1432o, h.f1439e);
            }
        }
    }

    public C0063m1(B2.f fVar, C0908O c0908o, A2.r rVar, C0106i c0106i, F2.f fVar2, S0.e eVar) {
        this.f901a = false;
        this.f902b = fVar;
        this.f903c = c0908o;
        this.f904d = rVar;
        this.f905e = c0106i;
        this.f906f = new HashMap();
        this.f909k = new ArrayDeque();
        this.f907g = new E2.u(fVar2, new C0004d(c0908o, 3));
        E2.v vVar = new E2.v(this);
        c0106i.getClass();
        this.h = new E2.H(c0106i.f1457c, c0106i.f1456b, c0106i.f1455a, vVar);
        E2.w wVar = new E2.w(this);
        this.i = new E2.I(c0106i.f1457c, c0106i.f1456b, c0106i.f1455a, wVar);
        A2.N n5 = new A2.N(2, this, fVar2);
        synchronized (((ArrayList) eVar.f2852b)) {
            ((ArrayList) eVar.f2852b).add(n5);
        }
    }
}
