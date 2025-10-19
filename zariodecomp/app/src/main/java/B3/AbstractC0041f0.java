package B3;

import A2.C0020u;
import z3.C1075D;
import z3.C1078b;

/* renamed from: B3.f0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\f0.1.smali */
public abstract class AbstractC0041f0 implements E {
    @Override // B3.InterfaceC0045g1
    public final Runnable a(InterfaceC0042f1 interfaceC0042f1) {
        return g().a(interfaceC0042f1);
    }

    @Override // B3.InterfaceC0045g1
    public void b(z3.k0 k0Var) {
        g().b(k0Var);
    }

    @Override // z3.InterfaceC1074C
    public final C1075D c() {
        return g().c();
    }

    @Override // B3.InterfaceC0045g1
    public void d(z3.k0 k0Var) {
        g().d(k0Var);
    }

    @Override // B3.E
    public final C1078b e() {
        return g().e();
    }

    public abstract E g();

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(g(), "delegate");
        return c0020uX.toString();
    }
}
