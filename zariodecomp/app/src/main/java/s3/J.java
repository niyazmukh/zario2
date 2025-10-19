package s3;

import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\J.smali */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final long f9729a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9730b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9731c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9732d;

    public J(long j5, long j6, Map map) {
        this.f9729a = j5;
        this.f9730b = j6;
        this.f9731c = map;
        this.f9732d = L3.j.p0(map.values());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j5 = (J) obj;
        return this.f9729a == j5.f9729a && this.f9730b == j5.f9730b && this.f9731c.equals(j5.f9731c);
    }

    public final int hashCode() {
        return this.f9731c.hashCode() + B.a.e(Long.hashCode(this.f9729a) * 31, 31, this.f9730b);
    }

    public final String toString() {
        return "UsageSummary(windowStartMs=" + this.f9729a + ", windowEndMs=" + this.f9730b + ", totalsByPackage=" + this.f9731c + ")";
    }
}
