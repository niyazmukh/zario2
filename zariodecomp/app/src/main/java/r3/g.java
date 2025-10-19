package r3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r3.1\g.smali */
public final class g extends k {

    /* renamed from: a, reason: collision with root package name */
    public final long f9649a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9650b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9651c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9652d;

    public g(long j5, long j6, long j7, boolean z4) {
        this.f9649a = j5;
        this.f9650b = j6;
        this.f9651c = j7;
        this.f9652d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f9649a == gVar.f9649a && this.f9650b == gVar.f9650b && this.f9651c == gVar.f9651c && this.f9652d == gVar.f9652d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9652d) + B.a.e(B.a.e(Long.hashCode(this.f9649a) * 31, 31, this.f9650b), 31, this.f9651c);
    }

    public final String toString() {
        return "Content(averageUsageMs=" + this.f9649a + ", todayUsageMs=" + this.f9650b + ", recommendedGoalMs=" + this.f9651c + ", isEstimated=" + this.f9652d + ")";
    }
}
