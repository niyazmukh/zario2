package B3;

import A2.RunnableC0005e;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import z3.AbstractC1098w;

/* renamed from: B3.r1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\r1.1.smali */
public final class C0076r1 extends z3.K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f959a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f960b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final Object f961c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z3.M f962d;

    public C0076r1(C0081t1 c0081t1, C0081t1 c0081t12) {
        this.f962d = c0081t1;
        S0.f.l(c0081t12, "pickFirstLeafLoadBalancer");
        this.f961c = c0081t12;
    }

    @Override // z3.K
    public final z3.I a(C0099z1 c0099z1) {
        switch (this.f959a) {
            case 0:
                if (this.f960b.compareAndSet(false, true)) {
                    z3.p0 p0VarJ = ((C0081t1) this.f962d).f977f.j();
                    C0081t1 c0081t1 = (C0081t1) this.f961c;
                    Objects.requireNonNull(c0081t1);
                    p0VarJ.execute(new RunnableC0005e(c0081t1, 4));
                }
                break;
            default:
                if (this.f960b.compareAndSet(false, true)) {
                    ((C0093x1) this.f962d).f1020f.j().execute(new N(this, 7));
                }
                break;
        }
        return z3.I.f11245e;
    }

    public C0076r1(C0093x1 c0093x1, AbstractC1098w abstractC1098w) {
        this.f962d = c0093x1;
        S0.f.l(abstractC1098w, "subchannel");
        this.f961c = abstractC1098w;
    }
}
