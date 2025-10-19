package B3;

import A2.C0020u;
import N2.AbstractC0156x;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\X1.smali */
public final class X1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f603a;

    /* renamed from: b, reason: collision with root package name */
    public final long f604b;

    /* renamed from: c, reason: collision with root package name */
    public final long f605c;

    /* renamed from: d, reason: collision with root package name */
    public final double f606d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f607e;

    /* renamed from: f, reason: collision with root package name */
    public final h2.g f608f;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X1(int r1, long r2, long r4, double r6, java.lang.Long r8, java.util.Set r9) {
        /*
            r0 = this;
            r0.<init>()
            r0.f603a = r1
            r0.f604b = r2
            r0.f605c = r4
            r0.f606d = r6
            r0.f607e = r8
            int r1 = h2.g.f7673c
            boolean r1 = r9 instanceof h2.g
            if (r1 == 0) goto L21
            boolean r1 = r9 instanceof java.util.SortedSet
            if (r1 != 0) goto L21
            r1 = r9
            h2.g r1 = (h2.g) r1
            boolean r2 = r1.k()
            if (r2 != 0) goto L21
            goto L2a
        L21:
            java.lang.Object[] r1 = r9.toArray()
            int r2 = r1.length
            h2.g r1 = h2.g.m(r2, r1)
        L2a:
            r0.f608f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.X1.<init>(int, long, long, double, java.lang.Long, java.util.Set):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof X1)) {
            return false;
        }
        X1 x12 = (X1) obj;
        return this.f603a == x12.f603a && this.f604b == x12.f604b && this.f605c == x12.f605c && Double.compare(this.f606d, x12.f606d) == 0 && AbstractC0156x.F(this.f607e, x12.f607e) && AbstractC0156x.F(this.f608f, x12.f608f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f603a), Long.valueOf(this.f604b), Long.valueOf(this.f605c), Double.valueOf(this.f606d), this.f607e, this.f608f});
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.d("maxAttempts", String.valueOf(this.f603a));
        c0020uX.b("initialBackoffNanos", this.f604b);
        c0020uX.b("maxBackoffNanos", this.f605c);
        c0020uX.d("backoffMultiplier", String.valueOf(this.f606d));
        c0020uX.a(this.f607e, "perAttemptRecvTimeoutNanos");
        c0020uX.a(this.f608f, "retryableStatusCodes");
        return c0020uX.toString();
    }
}
