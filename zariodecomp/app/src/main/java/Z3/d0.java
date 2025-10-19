package z3;

import A2.C0020u;
import N2.AbstractC0156x;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\d0.smali */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f11302a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11303b;

    public d0(Object obj) {
        this.f11303b = obj;
        this.f11302a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return AbstractC0156x.F(this.f11302a, d0Var.f11302a) && AbstractC0156x.F(this.f11303b, d0Var.f11303b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11302a, this.f11303b});
    }

    public final String toString() {
        Object obj = this.f11303b;
        if (obj != null) {
            C0020u c0020uX = r1.d.X(this);
            c0020uX.a(obj, "config");
            return c0020uX.toString();
        }
        C0020u c0020uX2 = r1.d.X(this);
        c0020uX2.a(this.f11302a, "error");
        return c0020uX2.toString();
    }

    public d0(k0 k0Var) {
        this.f11303b = null;
        S0.f.l(k0Var, "status");
        this.f11302a = k0Var;
        S0.f.e(k0Var, "cannot use OK status: %s", !k0Var.e());
    }
}
