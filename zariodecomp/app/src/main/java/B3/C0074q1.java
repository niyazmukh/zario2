package B3;

import A2.C0020u;
import z3.AbstractC1098w;
import z3.C1078b;

/* renamed from: B3.q1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\q1.1.smali */
public final class C0074q1 extends z3.K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f948a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f949b;

    public C0074q1(z3.I i) {
        S0.f.l(i, "result");
        this.f949b = i;
    }

    @Override // z3.K
    public final z3.I a(C0099z1 c0099z1) {
        switch (this.f948a) {
            case 0:
                return (z3.I) this.f949b;
            default:
                z3.I iA = ((z3.K) this.f949b).a(c0099z1);
                AbstractC1098w abstractC1098w = iA.f11246a;
                if (abstractC1098w == null) {
                    return iA;
                }
                C1078b c1078bC = abstractC1098w.c();
                return z3.I.b(abstractC1098w, new I3.q((I3.k) c1078bC.f11280a.get(I3.s.n), iA.f11247b));
        }
    }

    public String toString() {
        switch (this.f948a) {
            case 0:
                C0020u c0020u = new C0020u(C0074q1.class.getSimpleName());
                c0020u.a((z3.I) this.f949b, "result");
                return c0020u.toString();
            default:
                return super.toString();
        }
    }

    public C0074q1(z3.K k5) {
        this.f949b = k5;
    }
}
