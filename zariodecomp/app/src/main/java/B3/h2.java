package B3;

import A2.C0020u;
import N2.AbstractC0156x;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\h2.smali */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final z3.N f823a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f824b;

    public h2(z3.N n5, Object obj) {
        this.f823a = n5;
        this.f824b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h2.class != obj.getClass()) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return AbstractC0156x.F(this.f823a, h2Var.f823a) && AbstractC0156x.F(this.f824b, h2Var.f824b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f823a, this.f824b});
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f823a, "provider");
        c0020uX.a(this.f824b, "config");
        return c0020uX.toString();
    }
}
