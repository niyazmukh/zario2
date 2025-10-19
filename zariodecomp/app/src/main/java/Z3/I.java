package z3;

import A2.C0020u;
import N2.AbstractC0156x;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\I.smali */
public final class I {

    /* renamed from: e, reason: collision with root package name */
    public static final I f11245e = new I(null, null, k0.f11348e, false);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1098w f11246a;

    /* renamed from: b, reason: collision with root package name */
    public final I3.q f11247b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f11248c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11249d;

    public I(AbstractC1098w abstractC1098w, I3.q qVar, k0 k0Var, boolean z4) {
        this.f11246a = abstractC1098w;
        this.f11247b = qVar;
        S0.f.l(k0Var, "status");
        this.f11248c = k0Var;
        this.f11249d = z4;
    }

    public static I a(k0 k0Var) {
        S0.f.g("error status shouldn't be OK", !k0Var.e());
        return new I(null, null, k0Var, false);
    }

    public static I b(AbstractC1098w abstractC1098w, I3.q qVar) {
        S0.f.l(abstractC1098w, "subchannel");
        return new I(abstractC1098w, qVar, k0.f11348e, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof I)) {
            return false;
        }
        I i = (I) obj;
        return AbstractC0156x.F(this.f11246a, i.f11246a) && AbstractC0156x.F(this.f11248c, i.f11248c) && AbstractC0156x.F(this.f11247b, i.f11247b) && this.f11249d == i.f11249d;
    }

    public final int hashCode() {
        Boolean boolValueOf = Boolean.valueOf(this.f11249d);
        return Arrays.hashCode(new Object[]{this.f11246a, this.f11248c, this.f11247b, boolValueOf});
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f11246a, "subchannel");
        c0020uX.a(this.f11247b, "streamTracerFactory");
        c0020uX.a(this.f11248c, "status");
        c0020uX.c("drop", this.f11249d);
        return c0020uX.toString();
    }
}
