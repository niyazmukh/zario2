package B3;

import A2.C0020u;

/* renamed from: B3.w1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\w1.1.smali */
public final class C0090w1 extends z3.K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1015a;

    /* renamed from: b, reason: collision with root package name */
    public final z3.I f1016b;

    public C0090w1(z3.I i, int i5) {
        this.f1015a = i5;
        switch (i5) {
            case 1:
                S0.f.l(i, "result");
                this.f1016b = i;
                break;
            default:
                S0.f.l(i, "result");
                this.f1016b = i;
                break;
        }
    }

    @Override // z3.K
    public final z3.I a(C0099z1 c0099z1) {
        switch (this.f1015a) {
        }
        return this.f1016b;
    }

    public final String toString() {
        switch (this.f1015a) {
            case 0:
                C0020u c0020u = new C0020u(C0090w1.class.getSimpleName());
                c0020u.a(this.f1016b, "result");
                return c0020u.toString();
            default:
                return "FixedResultPicker(" + this.f1016b + ")";
        }
    }
}
