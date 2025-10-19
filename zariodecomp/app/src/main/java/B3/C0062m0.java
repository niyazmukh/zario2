package B3;

import A2.C0020u;
import N2.AbstractC0156x;
import java.util.Arrays;

/* renamed from: B3.m0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\m0.1.smali */
public final class C0062m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f898a;

    /* renamed from: b, reason: collision with root package name */
    public final long f899b;

    /* renamed from: c, reason: collision with root package name */
    public final h2.g f900c;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0062m0(int r1, long r2, java.util.Set r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f898a = r1
            r0.f899b = r2
            int r1 = h2.g.f7673c
            boolean r1 = r4 instanceof h2.g
            if (r1 == 0) goto L1b
            boolean r1 = r4 instanceof java.util.SortedSet
            if (r1 != 0) goto L1b
            r1 = r4
            h2.g r1 = (h2.g) r1
            boolean r2 = r1.k()
            if (r2 != 0) goto L1b
            goto L24
        L1b:
            java.lang.Object[] r1 = r4.toArray()
            int r2 = r1.length
            h2.g r1 = h2.g.m(r2, r1)
        L24:
            r0.f900c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.C0062m0.<init>(int, long, java.util.Set):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0062m0.class != obj.getClass()) {
            return false;
        }
        C0062m0 c0062m0 = (C0062m0) obj;
        return this.f898a == c0062m0.f898a && this.f899b == c0062m0.f899b && AbstractC0156x.F(this.f900c, c0062m0.f900c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f898a), Long.valueOf(this.f899b), this.f900c});
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.d("maxAttempts", String.valueOf(this.f898a));
        c0020uX.b("hedgingDelayNanos", this.f899b);
        c0020uX.a(this.f900c, "nonFatalStatusCodes");
        return c0020uX.toString();
    }
}
