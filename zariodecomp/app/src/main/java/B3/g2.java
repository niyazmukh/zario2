package B3;

import A2.C0020u;
import java.util.Arrays;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\g2.smali */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f813a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f814b;

    public g2(Map map, String str) {
        S0.f.l(str, "policyName");
        this.f813a = str;
        S0.f.l(map, "rawConfigValue");
        this.f814b = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return this.f813a.equals(g2Var.f813a) && this.f814b.equals(g2Var.f814b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f813a, this.f814b});
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f813a, "policyName");
        c0020uX.a(this.f814b, "rawConfigValue");
        return c0020uX.toString();
    }
}
