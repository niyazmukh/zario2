package B3;

import z3.AbstractC1083g;
import z3.C1084h;
import z3.C1093q;
import z3.InterfaceC1085i;

/* renamed from: B3.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\c.1.smali */
public abstract class AbstractC0031c {

    /* renamed from: a, reason: collision with root package name */
    public C0051i1 f752a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f753b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final q2 f754c;

    /* renamed from: d, reason: collision with root package name */
    public final C0051i1 f755d;

    /* renamed from: e, reason: collision with root package name */
    public int f756e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f757f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f758g;
    public final m2 h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0097z f759j;

    /* renamed from: k, reason: collision with root package name */
    public z3.r f760k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f761l;

    /* renamed from: m, reason: collision with root package name */
    public RunnableC0029b f762m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f763n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f764o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f765p;

    public AbstractC0031c(int i, m2 m2Var, q2 q2Var) {
        S0.f.l(q2Var, "transportTracer");
        this.f754c = q2Var;
        C0051i1 c0051i1 = new C0051i1(this, i, m2Var, q2Var);
        this.f755d = c0051i1;
        this.f752a = c0051i1;
        this.f760k = z3.r.f11392d;
        this.f761l = false;
        this.h = m2Var;
    }

    public abstract void a(int i);

    public final void b(z3.k0 k0Var, EnumC0094y enumC0094y, z3.a0 a0Var) {
        if (this.i) {
            return;
        }
        this.i = true;
        m2 m2Var = this.h;
        if (m2Var.f911b.compareAndSet(false, true)) {
            for (AbstractC1083g abstractC1083g : m2Var.f910a) {
                abstractC1083g.m(k0Var);
            }
        }
        if (this.f754c != null) {
            k0Var.e();
        }
        this.f759j.p(k0Var, enumC0094y, a0Var);
    }

    public abstract void c(boolean z4);

    public final void d(z3.a0 a0Var) {
        S0.f.q("Received headers on closed stream", !this.f764o);
        for (AbstractC1083g abstractC1083g : this.h.f910a) {
            abstractC1083g.b();
        }
        C1084h c1084h = C1084h.f11313b;
        String str = (String) a0Var.c(AbstractC0056k0.f861d);
        if (str != null) {
            C1093q c1093q = (C1093q) this.f760k.f11393a.get(str);
            InterfaceC1085i interfaceC1085i = c1093q != null ? c1093q.f11387a : null;
            if (interfaceC1085i == null) {
                ((C3.i) this).m(new z3.m0(z3.k0.f11354m.g("Can't find decompressor for ".concat(str))));
                return;
            } else if (interfaceC1085i != c1084h) {
                C0051i1 c0051i1 = this.f752a;
                c0051i1.getClass();
                S0.f.q("Already set full stream decompressor", true);
                c0051i1.f830e = interfaceC1085i;
            }
        }
        this.f759j.f(a0Var);
    }

    public final boolean e() {
        boolean z4;
        synchronized (this.f753b) {
            try {
                z4 = this.f757f && this.f756e < 32768 && !this.f758g;
            } finally {
            }
        }
        return z4;
    }

    public final void f(z3.k0 k0Var, EnumC0094y enumC0094y, boolean z4, z3.a0 a0Var) {
        S0.f.l(k0Var, "status");
        if (!this.f764o || z4) {
            this.f764o = true;
            this.f765p = k0Var.e();
            synchronized (this.f753b) {
                this.f758g = true;
            }
            if (this.f761l) {
                this.f762m = null;
                b(k0Var, enumC0094y, a0Var);
                return;
            }
            this.f762m = new RunnableC0029b(this, k0Var, enumC0094y, a0Var, 0);
            if (z4) {
                this.f752a.close();
                return;
            }
            C0051i1 c0051i1 = this.f752a;
            if (c0051i1.e()) {
                return;
            }
            if (c0051i1.f837p.f393c == 0) {
                c0051i1.close();
            } else {
                c0051i1.f842u = true;
            }
        }
    }

    public final void g(z3.k0 k0Var, boolean z4, z3.a0 a0Var) {
        f(k0Var, EnumC0094y.f1022a, z4, a0Var);
    }
}
