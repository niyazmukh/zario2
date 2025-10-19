package B3;

import A2.C0020u;
import z3.AbstractC1081e;
import z3.C1079c;
import z3.EnumC1087k;

/* renamed from: B3.g0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\g0.1.smali */
public abstract class AbstractC0044g0 extends z3.P {

    /* renamed from: d, reason: collision with root package name */
    public final Y0 f812d;

    public AbstractC0044g0(Y0 y02) {
        this.f812d = y02;
    }

    @Override // z3.AbstractC1080d
    public final AbstractC1081e n(com.google.android.gms.common.api.internal.F f2, C1079c c1079c) {
        return this.f812d.f666w.n(f2, c1079c);
    }

    @Override // z3.P
    public final void s() {
        this.f812d.s();
    }

    @Override // z3.P
    public final EnumC1087k t() {
        return this.f812d.t();
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f812d, "delegate");
        return c0020uX.toString();
    }

    @Override // z3.P
    public final void u(EnumC1087k enumC1087k, E2.s sVar) {
        this.f812d.u(enumC1087k, sVar);
    }
}
