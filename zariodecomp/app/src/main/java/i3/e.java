package I3;

import A2.C0020u;
import B3.C0052j;
import z3.EnumC1087k;
import z3.J;
import z3.K;
import z3.M;
import z3.N;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\e.smali */
public final class e extends M {

    /* renamed from: o, reason: collision with root package name */
    public static final C0052j f1933o = new C0052j(1);

    /* renamed from: f, reason: collision with root package name */
    public final c f1934f;

    /* renamed from: g, reason: collision with root package name */
    public final a f1935g;
    public N h;
    public M i;

    /* renamed from: j, reason: collision with root package name */
    public N f1936j;

    /* renamed from: k, reason: collision with root package name */
    public M f1937k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC1087k f1938l;

    /* renamed from: m, reason: collision with root package name */
    public K f1939m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1940n;

    public e(a aVar) {
        c cVar = new c(this);
        this.f1934f = cVar;
        this.i = cVar;
        this.f1937k = cVar;
        this.f1935g = aVar;
    }

    @Override // z3.M
    public final boolean b() {
        return g().b();
    }

    @Override // z3.M
    public final void c(k0 k0Var) {
        g().c(k0Var);
    }

    @Override // z3.M
    public final void d(J j5) {
        g().d(j5);
    }

    @Override // z3.M
    public final void e() {
        g().e();
    }

    @Override // z3.M
    public final void f() {
        this.f1937k.f();
        this.i.f();
    }

    public final M g() {
        M m5 = this.f1937k;
        return m5 == this.f1934f ? this.i : m5;
    }

    public final void h() {
        this.f1935g.r(this.f1938l, this.f1939m);
        this.i.f();
        this.i = this.f1937k;
        this.h = this.f1936j;
        this.f1937k = this.f1934f;
        this.f1936j = null;
    }

    public final void i(N n5) {
        S0.f.l(n5, "newBalancerFactory");
        if (n5.equals(this.f1936j)) {
            return;
        }
        this.f1937k.f();
        this.f1937k = this.f1934f;
        this.f1936j = null;
        this.f1938l = EnumC1087k.f11341a;
        this.f1939m = f1933o;
        if (n5.equals(this.h)) {
            return;
        }
        d dVar = new d(this);
        M mD = n5.d(dVar);
        dVar.f1931e = mD;
        this.f1937k = mD;
        this.f1936j = n5;
        if (this.f1940n) {
            return;
        }
        h();
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(g(), "delegate");
        return c0020uX.toString();
    }
}
