package z3;

import A2.C0020u;
import N2.AbstractC0156x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\J.smali */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final List f11250a;

    /* renamed from: b, reason: collision with root package name */
    public final C1078b f11251b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11252c;

    public J(List list, C1078b c1078b, Object obj) {
        S0.f.l(list, "addresses");
        this.f11250a = Collections.unmodifiableList(new ArrayList(list));
        S0.f.l(c1078b, "attributes");
        this.f11251b = c1078b;
        this.f11252c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof J)) {
            return false;
        }
        J j5 = (J) obj;
        return AbstractC0156x.F(this.f11250a, j5.f11250a) && AbstractC0156x.F(this.f11251b, j5.f11251b) && AbstractC0156x.F(this.f11252c, j5.f11252c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11250a, this.f11251b, this.f11252c});
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f11250a, "addresses");
        c0020uX.a(this.f11251b, "attributes");
        c0020uX.a(this.f11252c, "loadBalancingPolicyConfig");
        return c0020uX.toString();
    }
}
