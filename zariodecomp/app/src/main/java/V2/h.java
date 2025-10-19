package V2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\V2\h.smali */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final n f3437a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3438b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3439c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3440d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3441e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3442f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3443g;
    public final float h;

    public h(n plan, long j5, long j6, long j7, float f2, float f3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        kotlin.jvm.internal.i.e(plan, "plan");
        this.f3437a = plan;
        this.f3438b = j5;
        this.f3439c = j6;
        this.f3440d = j7;
        this.f3441e = true;
        this.f3442f = jCurrentTimeMillis;
        this.f3443g = f2;
        this.h = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.i.a(this.f3437a, hVar.f3437a) && this.f3438b == hVar.f3438b && this.f3439c == hVar.f3439c && this.f3440d == hVar.f3440d && this.f3441e == hVar.f3441e && this.f3442f == hVar.f3442f && Float.compare(this.f3443g, hVar.f3443g) == 0 && Float.compare(this.h, hVar.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + ((Float.hashCode(this.f3443g) + B.a.e((Boolean.hashCode(this.f3441e) + B.a.e(B.a.e(B.a.e(this.f3437a.hashCode() * 31, 31, this.f3438b), 31, this.f3439c), 31, this.f3440d)) * 31, 31, this.f3442f)) * 31);
    }

    public final String toString() {
        return "EvaluationProgress(plan=" + this.f3437a + ", currentUsageMs=" + this.f3438b + ", elapsedTimeMs=" + this.f3439c + ", remainingTimeMs=" + this.f3440d + ", isActive=" + this.f3441e + ", timestamp=" + this.f3442f + ", usagePercentage=" + this.f3443g + ", timePercentage=" + this.h + ")";
    }
}
