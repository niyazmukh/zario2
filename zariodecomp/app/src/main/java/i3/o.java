package I3;

import A2.C0020u;
import java.util.concurrent.atomic.AtomicLong;
import z3.AbstractC1083g;
import z3.C1078b;
import z3.a0;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\o.smali */
public final class o extends AbstractC1083g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1083g f1968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f1969c;

    public o(q qVar, AbstractC1083g abstractC1083g) {
        this.f1969c = qVar;
        this.f1968b = abstractC1083g;
    }

    @Override // z3.AbstractC1083g
    public final void a() {
        this.f1968b.a();
    }

    @Override // z3.AbstractC1083g
    public final void b() {
        this.f1968b.b();
    }

    @Override // z3.AbstractC1083g
    public final void c(int i) {
        this.f1968b.c(i);
    }

    @Override // z3.AbstractC1083g
    public final void d(int i, long j5) {
        this.f1968b.d(i, j5);
    }

    @Override // z3.AbstractC1083g
    public final void e(a0 a0Var) {
        this.f1968b.e(a0Var);
    }

    @Override // z3.AbstractC1083g
    public final void f(long j5) {
        this.f1968b.f(j5);
    }

    @Override // z3.AbstractC1083g
    public final void g(long j5) {
        this.f1968b.g(j5);
    }

    @Override // z3.AbstractC1083g
    public final void h() {
        this.f1968b.h();
    }

    @Override // z3.AbstractC1083g
    public final void i(int i) {
        this.f1968b.i(i);
    }

    @Override // z3.AbstractC1083g
    public final void j(int i, long j5, long j6) {
        this.f1968b.j(i, j5, j6);
    }

    @Override // z3.AbstractC1083g
    public final void k(long j5) {
        this.f1968b.k(j5);
    }

    @Override // z3.AbstractC1083g
    public final void l(long j5) {
        this.f1968b.l(j5);
    }

    @Override // z3.AbstractC1083g
    public final void m(k0 k0Var) {
        k kVar = this.f1969c.f1971a;
        boolean zE = k0Var.e();
        n nVar = kVar.f1950a;
        if (nVar.f1965e != null || nVar.f1966f != null) {
            if (zE) {
                ((AtomicLong) kVar.f1951b.f2867b).getAndIncrement();
            } else {
                ((AtomicLong) kVar.f1951b.f2868c).getAndIncrement();
            }
        }
        this.f1968b.m(k0Var);
    }

    @Override // z3.AbstractC1083g
    public final void n(C1078b c1078b, a0 a0Var) {
        this.f1968b.n(c1078b, a0Var);
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f1968b, "delegate");
        return c0020uX.toString();
    }
}
