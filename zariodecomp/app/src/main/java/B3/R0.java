package B3;

import z3.AbstractC1080d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\R0.smali */
public final class R0 extends AbstractC1080d {

    /* renamed from: d, reason: collision with root package name */
    public final Q0 f523d;

    /* renamed from: e, reason: collision with root package name */
    public final a2 f524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y0 f525f;

    public R0(Y0 y02, Q0 q02, a2 a2Var) {
        this.f525f = y02;
        this.f523d = q02;
        S0.f.l(a2Var, "resolver");
        this.f524e = a2Var;
    }

    @Override // z3.AbstractC1080d
    public final void o(z3.k0 k0Var) {
        S0.f.g("the error status must not be OK", !k0Var.e());
        this.f525f.f659p.execute(new I(16, this, k0Var));
    }

    @Override // z3.AbstractC1080d
    public final void p(z3.e0 e0Var) {
        this.f525f.f659p.execute(new I(17, this, e0Var));
    }
}
