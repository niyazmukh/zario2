package B3;

import N2.AbstractC0156x;
import java.util.Arrays;
import z3.C1079c;

/* renamed from: B3.z1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\z1.1.smali */
public final class C0099z1 {

    /* renamed from: a, reason: collision with root package name */
    public final C1079c f1031a;

    /* renamed from: b, reason: collision with root package name */
    public final z3.a0 f1032b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.F f1033c;

    public C0099z1(com.google.android.gms.common.api.internal.F f2, z3.a0 a0Var, C1079c c1079c) {
        S0.f.l(f2, "method");
        this.f1033c = f2;
        S0.f.l(a0Var, "headers");
        this.f1032b = a0Var;
        S0.f.l(c1079c, "callOptions");
        this.f1031a = c1079c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0099z1.class != obj.getClass()) {
            return false;
        }
        C0099z1 c0099z1 = (C0099z1) obj;
        return AbstractC0156x.F(this.f1031a, c0099z1.f1031a) && AbstractC0156x.F(this.f1032b, c0099z1.f1032b) && AbstractC0156x.F(this.f1033c, c0099z1.f1033c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1031a, this.f1032b, this.f1033c});
    }

    public final String toString() {
        return "[method=" + this.f1033c + " headers=" + this.f1032b + " callOptions=" + this.f1031a + "]";
    }
}
