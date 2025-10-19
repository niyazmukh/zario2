package S2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\y.smali */
public final class y {
    public static final y h = new y(null, 0, null, false, null, true, 0);

    /* renamed from: a, reason: collision with root package name */
    public final V2.n f3114a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3115b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f3116c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3117d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f3118e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3119f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3120g;

    public y(V2.n nVar, int i, Long l4, boolean z4, Long l5, boolean z5, int i5) {
        this.f3114a = nVar;
        this.f3115b = i;
        this.f3116c = l4;
        this.f3117d = z4;
        this.f3118e = l5;
        this.f3119f = z5;
        this.f3120g = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.i.a(this.f3114a, yVar.f3114a) && this.f3115b == yVar.f3115b && kotlin.jvm.internal.i.a(this.f3116c, yVar.f3116c) && this.f3117d == yVar.f3117d && kotlin.jvm.internal.i.a(this.f3118e, yVar.f3118e) && this.f3119f == yVar.f3119f && this.f3120g == yVar.f3120g;
    }

    public final int hashCode() {
        V2.n nVar = this.f3114a;
        int iC = B.a.c(this.f3115b, (nVar == null ? 0 : nVar.hashCode()) * 31, 31);
        Long l4 = this.f3116c;
        int iHashCode = (Boolean.hashCode(this.f3117d) + ((iC + (l4 == null ? 0 : l4.hashCode())) * 31)) * 31;
        Long l5 = this.f3118e;
        return Integer.hashCode(this.f3120g) + ((Boolean.hashCode(this.f3119f) + ((iHashCode + (l5 != null ? l5.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "EvaluationStateSnapshot(plan=" + this.f3114a + ", usageThresholdReached=" + this.f3115b + ", nextCycleStartTime=" + this.f3116c + ", evaluationCompleted=" + this.f3117d + ", evaluationCompletionTime=" + this.f3118e + ", feedbackViewed=" + this.f3119f + ", goalSuccessStreak=" + this.f3120g + ")";
    }
}
