package I3;

import A2.C0020u;
import java.util.concurrent.ScheduledExecutorService;
import z3.AbstractC1080d;
import z3.AbstractC1098w;
import z3.EnumC1087k;
import z3.H;
import z3.K;
import z3.p0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\a.smali */
public abstract class a extends AbstractC1080d {
    @Override // z3.AbstractC1080d
    public AbstractC1098w g(H h) {
        return s().g(h);
    }

    @Override // z3.AbstractC1080d
    public final AbstractC1080d h() {
        return s().h();
    }

    @Override // z3.AbstractC1080d
    public final ScheduledExecutorService i() {
        return s().i();
    }

    @Override // z3.AbstractC1080d
    public final p0 j() {
        return s().j();
    }

    @Override // z3.AbstractC1080d
    public final void q() {
        s().q();
    }

    @Override // z3.AbstractC1080d
    public void r(EnumC1087k enumC1087k, K k5) {
        s().r(enumC1087k, k5);
    }

    public abstract AbstractC1080d s();

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(s(), "delegate");
        return c0020uX.toString();
    }
}
