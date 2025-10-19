package I3;

import A2.C0020u;
import java.util.List;
import z3.AbstractC1080d;
import z3.AbstractC1098w;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\b.smali */
public abstract class b extends AbstractC1098w {
    @Override // z3.AbstractC1098w
    public final List b() {
        return q().b();
    }

    @Override // z3.AbstractC1098w
    public final AbstractC1080d d() {
        return q().d();
    }

    @Override // z3.AbstractC1098w
    public final Object e() {
        return q().e();
    }

    @Override // z3.AbstractC1098w
    public final void l() {
        q().l();
    }

    @Override // z3.AbstractC1098w
    public void m() {
        q().m();
    }

    @Override // z3.AbstractC1098w
    public void p(List list) {
        q().p(list);
    }

    public abstract AbstractC1098w q();

    public String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(q(), "delegate");
        return c0020uX.toString();
    }
}
