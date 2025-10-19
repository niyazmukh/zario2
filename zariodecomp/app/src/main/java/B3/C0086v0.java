package B3;

import A2.C0020u;
import z3.C1092p;
import z3.InterfaceC1085i;

/* renamed from: B3.v0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\v0.1.smali */
public final class C0086v0 implements InterfaceC0091x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0091x f994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0089w0 f995b;

    public C0086v0(C0089w0 c0089w0, InterfaceC0091x interfaceC0091x) {
        this.f995b = c0089w0;
        this.f994a = interfaceC0091x;
    }

    @Override // B3.n2
    public final void a(InterfaceC1085i interfaceC1085i) {
        this.f994a.a(interfaceC1085i);
    }

    @Override // B3.InterfaceC0091x
    public final void b(int i) {
        this.f994a.b(i);
    }

    @Override // B3.InterfaceC0091x
    public final void c(z3.r rVar) {
        this.f994a.c(rVar);
    }

    @Override // B3.n2
    public final boolean d() {
        return this.f994a.d();
    }

    @Override // B3.InterfaceC0091x
    public final void e(g1.i iVar) {
        this.f994a.e(iVar);
    }

    @Override // B3.InterfaceC0091x
    public final void f(C1092p c1092p) {
        this.f994a.f(c1092p);
    }

    @Override // B3.n2
    public final void flush() {
        this.f994a.flush();
    }

    @Override // B3.InterfaceC0091x
    public final void g(InterfaceC0097z interfaceC0097z) {
        S0.i iVar = this.f995b.f1014b;
        ((I0) iVar.f2859b).a();
        ((o2) iVar.f2858a).c();
        this.f994a.g(new q2(2, this, interfaceC0097z));
    }

    @Override // B3.InterfaceC0091x
    public final void h(z3.k0 k0Var) {
        this.f994a.h(k0Var);
    }

    @Override // B3.n2
    public final void i(int i) {
        this.f994a.i(i);
    }

    @Override // B3.n2
    public final void j(G3.a aVar) {
        this.f994a.j(aVar);
    }

    @Override // B3.InterfaceC0091x
    public final void k(int i) {
        this.f994a.k(i);
    }

    @Override // B3.n2
    public final void l() {
        this.f994a.l();
    }

    @Override // B3.InterfaceC0091x
    public final void m() {
        this.f994a.m();
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f994a, "delegate");
        return c0020uX.toString();
    }
}
