package B3;

import java.util.concurrent.ScheduledExecutorService;
import z3.AbstractC1080d;
import z3.AbstractC1098w;
import z3.EnumC1087k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\Q0.smali */
public final class Q0 extends AbstractC1080d {

    /* renamed from: d, reason: collision with root package name */
    public S0.n f518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y0 f519e;

    public Q0(Y0 y02) {
        this.f519e = y02;
    }

    @Override // z3.AbstractC1080d
    public final AbstractC1098w g(z3.H h) {
        Y0 y02 = this.f519e;
        y02.f659p.d();
        S0.f.q("Channel is being terminated", !y02.f629L);
        return new X0(y02, h);
    }

    @Override // z3.AbstractC1080d
    public final AbstractC1080d h() {
        return this.f519e.f635R;
    }

    @Override // z3.AbstractC1080d
    public final ScheduledExecutorService i() {
        return this.f519e.f653j;
    }

    @Override // z3.AbstractC1080d
    public final z3.p0 j() {
        return this.f519e.f659p;
    }

    @Override // z3.AbstractC1080d
    public final void q() {
        Y0 y02 = this.f519e;
        y02.f659p.d();
        y02.f659p.execute(new N(this, 4));
    }

    @Override // z3.AbstractC1080d
    public final void r(EnumC1087k enumC1087k, z3.K k5) {
        Y0 y02 = this.f519e;
        y02.f659p.d();
        S0.f.l(enumC1087k, "newState");
        S0.f.l(k5, "newPicker");
        y02.f659p.execute(new J(this, k5, enumC1087k, 3));
    }
}
