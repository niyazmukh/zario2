package s3;

import java.util.Map;

/* renamed from: s3.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\k.1.smali */
public final class C0888k {

    /* renamed from: a, reason: collision with root package name */
    public final long f9784a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9785b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9786c;

    public C0888k(long j5, long j6, Map map) {
        this.f9784a = j5;
        this.f9785b = j6;
        this.f9786c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0888k)) {
            return false;
        }
        C0888k c0888k = (C0888k) obj;
        return this.f9784a == c0888k.f9784a && this.f9785b == c0888k.f9785b && this.f9786c.equals(c0888k.f9786c);
    }

    public final int hashCode() {
        return this.f9786c.hashCode() + B.a.e(Long.hashCode(this.f9784a) * 31, 31, this.f9785b);
    }

    public final String toString() {
        return "UsageBucket(bucketStartMs=" + this.f9784a + ", bucketEndMs=" + this.f9785b + ", totalsByPackage=" + this.f9786c + ")";
    }
}
