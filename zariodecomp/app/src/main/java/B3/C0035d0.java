package B3;

import z3.AbstractC1083g;

/* renamed from: B3.d0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\d0.1.smali */
public final class C0035d0 extends n1 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f786b;

    /* renamed from: c, reason: collision with root package name */
    public final z3.k0 f787c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC0094y f788d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1083g[] f789e;

    public C0035d0(z3.k0 k0Var, EnumC0094y enumC0094y, AbstractC1083g[] abstractC1083gArr) {
        S0.f.g("error must not be OK", !k0Var.e());
        this.f787c = k0Var;
        this.f788d = enumC0094y;
        this.f789e = abstractC1083gArr;
    }

    public final void e(g1.i iVar) {
        iVar.k(this.f787c, "error");
        iVar.k(this.f788d, "progress");
    }

    public final void g(InterfaceC0097z interfaceC0097z) {
        S0.f.q("already started", !this.f786b);
        this.f786b = true;
        AbstractC1083g[] abstractC1083gArr = this.f789e;
        int length = abstractC1083gArr.length;
        int i = 0;
        while (true) {
            z3.k0 k0Var = this.f787c;
            if (i >= length) {
                interfaceC0097z.p(k0Var, this.f788d, new z3.a0());
                return;
            } else {
                abstractC1083gArr[i].m(k0Var);
                i++;
            }
        }
    }

    public C0035d0(z3.k0 k0Var, AbstractC1083g[] abstractC1083gArr) {
        this(k0Var, EnumC0094y.f1022a, abstractC1083gArr);
    }
}
