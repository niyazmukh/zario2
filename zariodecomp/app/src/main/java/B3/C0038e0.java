package B3;

import h2.C0593b;
import z3.AbstractC1083g;
import z3.C1075D;
import z3.C1079c;

/* renamed from: B3.e0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\e0.1.smali */
public final class C0038e0 implements A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f792a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f793b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f794c;

    public C0038e0(z3.k0 k0Var, EnumC0094y enumC0094y) {
        S0.f.g("error must not be OK", !k0Var.e());
        this.f793b = k0Var;
        this.f794c = enumC0094y;
    }

    @Override // z3.InterfaceC1074C
    public final C1075D c() {
        switch (this.f792a) {
            case 0:
                throw new UnsupportedOperationException("Not a real transport");
            default:
                return ((InterfaceC0045g1) this.f794c).c();
        }
    }

    @Override // B3.A
    public final InterfaceC0091x f(com.google.android.gms.common.api.internal.F f2, z3.a0 a0Var, C1079c c1079c, AbstractC1083g[] abstractC1083gArr) {
        Object obj = this.f794c;
        Object obj2 = this.f793b;
        switch (this.f792a) {
            case 0:
                return new C0035d0((z3.k0) obj2, (EnumC0094y) obj, abstractC1083gArr);
            default:
                C1079c c1079c2 = C1079c.i;
                S0.f.l(c1079c, "callOptions cannot be null");
                AbstractC1083g abstractC1083gA = ((I3.q) obj2).a(new C0593b(c1079c, 0, false), a0Var);
                S0.f.q("lb tracer already assigned", abstractC1083gArr[abstractC1083gArr.length - 1] == AbstractC0056k0.f870o);
                abstractC1083gArr[abstractC1083gArr.length - 1] = abstractC1083gA;
                return ((InterfaceC0045g1) obj).f(f2, a0Var, c1079c, abstractC1083gArr);
        }
    }

    public C0038e0(I3.q qVar, InterfaceC0045g1 interfaceC0045g1) {
        this.f793b = qVar;
        this.f794c = interfaceC0045g1;
    }
}
