package B3;

import N2.AbstractC0156x;
import java.util.Arrays;
import z3.C1078b;
import z3.C1099x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\B.smali */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public String f377a;

    /* renamed from: b, reason: collision with root package name */
    public C1078b f378b;

    /* renamed from: c, reason: collision with root package name */
    public C1099x f379c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b5 = (B) obj;
        return this.f377a.equals(b5.f377a) && this.f378b.equals(b5.f378b) && AbstractC0156x.F(null, null) && AbstractC0156x.F(this.f379c, b5.f379c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f377a, this.f378b, null, this.f379c});
    }
}
