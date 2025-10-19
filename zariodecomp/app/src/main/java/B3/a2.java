package B3;

import A2.C0020u;
import A2.RunnableC0005e;
import z3.AbstractC1080d;
import z3.AbstractC1098w;
import z3.C1077a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\a2.smali */
public final class a2 extends AbstractC1098w {

    /* renamed from: d, reason: collision with root package name */
    public static final C1077a f736d = new C1077a("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1098w f737a;

    /* renamed from: b, reason: collision with root package name */
    public final C0061m f738b;

    /* renamed from: c, reason: collision with root package name */
    public final z3.p0 f739c;

    public a2(C0027a0 c0027a0, C0061m c0061m, z3.p0 p0Var) {
        this.f737a = c0027a0;
        this.f738b = c0061m;
        this.f739c = p0Var;
    }

    @Override // z3.AbstractC1098w
    public String f() {
        return this.f737a.f();
    }

    @Override // z3.AbstractC1098w
    public final void k() {
        this.f737a.k();
    }

    @Override // z3.AbstractC1098w
    public final void m() {
        this.f737a.m();
        C0061m c0061m = this.f738b;
        z3.p0 p0Var = c0061m.f895b;
        p0Var.d();
        p0Var.execute(new RunnableC0005e(c0061m, 3));
    }

    @Override // z3.AbstractC1098w
    public final void n(AbstractC1080d abstractC1080d) {
        this.f737a.n(new Z1(this, abstractC1080d));
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f737a, "delegate");
        return c0020uX.toString();
    }
}
