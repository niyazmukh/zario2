package S2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\v.smali */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f3089a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3090b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3091c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3092d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3093e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3094f;

    public v(String planLabel, long j5, long j6, boolean z4, long j7, int i) {
        kotlin.jvm.internal.i.e(planLabel, "planLabel");
        this.f3089a = planLabel;
        this.f3090b = j5;
        this.f3091c = j6;
        this.f3092d = z4;
        this.f3093e = j7;
        this.f3094f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.i.a(this.f3089a, vVar.f3089a) && this.f3090b == vVar.f3090b && this.f3091c == vVar.f3091c && this.f3092d == vVar.f3092d && this.f3093e == vVar.f3093e && this.f3094f == vVar.f3094f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3094f) + B.a.e((Boolean.hashCode(this.f3092d) + B.a.e(B.a.e(this.f3089a.hashCode() * 31, 31, this.f3090b), 31, this.f3091c)) * 31, 31, this.f3093e);
    }

    public final String toString() {
        return "Result(planLabel=" + this.f3089a + ", goalTimeMs=" + this.f3090b + ", finalUsageMs=" + this.f3091c + ", metGoal=" + this.f3092d + ", nextCycleStartTime=" + this.f3093e + ", newPointBalance=" + this.f3094f + ")";
    }
}
