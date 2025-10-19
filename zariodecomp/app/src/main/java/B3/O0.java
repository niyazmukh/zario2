package B3;

import java.util.concurrent.Executor;
import z3.AbstractC1073B;
import z3.AbstractC1081e;
import z3.AbstractC1097v;
import z3.AbstractC1098w;
import z3.C1079c;
import z3.C1091o;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\O0.smali */
public final class O0 extends AbstractC1097v {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1073B f500a;

    /* renamed from: b, reason: collision with root package name */
    public final S0 f501b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f502c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.F f503d;

    /* renamed from: e, reason: collision with root package name */
    public final C1091o f504e;

    /* renamed from: f, reason: collision with root package name */
    public C1079c f505f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC1081e f506g;

    public O0(AbstractC1073B abstractC1073B, S0 s02, Executor executor, com.google.android.gms.common.api.internal.F f2, C1079c c1079c) {
        this.f500a = abstractC1073B;
        this.f501b = s02;
        this.f503d = f2;
        Executor executor2 = c1079c.f11286b;
        executor = executor2 != null ? executor2 : executor;
        this.f502c = executor;
        K0.t tVarB = C1079c.b(c1079c);
        tVarB.f2182b = executor;
        this.f505f = new C1079c(tVarB);
        this.f504e = C1091o.b();
    }

    @Override // z3.AbstractC1097v, z3.AbstractC1081e
    public final void a(String str, Throwable th) {
        AbstractC1081e abstractC1081e = this.f506g;
        if (abstractC1081e != null) {
            abstractC1081e.a(str, th);
        }
    }

    @Override // z3.AbstractC1097v, z3.AbstractC1081e
    public final void e(AbstractC1098w abstractC1098w, z3.a0 a0Var) {
        C1079c c1079c = this.f505f;
        com.google.android.gms.common.api.internal.F f2 = this.f503d;
        S0.f.l(f2, "method");
        S0.f.l(c1079c, "callOptions");
        n4.c cVarA = this.f500a.a();
        cVarA.getClass();
        z3.k0 k0Var = z3.k0.f11348e;
        if (!k0Var.e()) {
            this.f502c.execute(new M(this, abstractC1098w, AbstractC0056k0.h(k0Var)));
            this.f506g = Y0.f618n0;
            return;
        }
        C0039e1 c0039e1 = (C0039e1) cVarA.f8973a;
        c0039e1.getClass();
        C0033c1 c0033c1 = (C0033c1) c0039e1.f796b.get((String) f2.f5569d);
        if (c0033c1 == null) {
            c0033c1 = (C0033c1) c0039e1.f797c.get((String) f2.f5570e);
        }
        if (c0033c1 == null) {
            c0033c1 = c0039e1.f795a;
        }
        if (c0033c1 != null) {
            this.f505f = this.f505f.c(C0033c1.f771g, c0033c1);
        }
        AbstractC1081e abstractC1081eN = this.f501b.n(f2, this.f505f);
        this.f506g = abstractC1081eN;
        abstractC1081eN.e(abstractC1098w, a0Var);
    }

    @Override // z3.AbstractC1097v
    public final AbstractC1081e f() {
        return this.f506g;
    }
}
