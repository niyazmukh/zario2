package z3;

import A2.C0020u;
import N2.AbstractC0156x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\e0.smali */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f11304a;

    /* renamed from: b, reason: collision with root package name */
    public final C1078b f11305b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f11306c;

    public e0(List list, C1078b c1078b, d0 d0Var) {
        this.f11304a = Collections.unmodifiableList(new ArrayList(list));
        S0.f.l(c1078b, "attributes");
        this.f11305b = c1078b;
        this.f11306c = d0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return AbstractC0156x.F(this.f11304a, e0Var.f11304a) && AbstractC0156x.F(this.f11305b, e0Var.f11305b) && AbstractC0156x.F(this.f11306c, e0Var.f11306c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11304a, this.f11305b, this.f11306c});
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f11304a, "addresses");
        c0020uX.a(this.f11305b, "attributes");
        c0020uX.a(this.f11306c, "serviceConfig");
        return c0020uX.toString();
    }
}
