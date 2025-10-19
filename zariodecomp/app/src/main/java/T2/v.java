package T2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\v.smali */
public final class v {
    public static final v h = new v(null, 0, null, false, null, true, 0);

    /* renamed from: a, reason: collision with root package name */
    public final V2.n f3255a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3256b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f3257c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3258d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f3259e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3260f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3261g;

    public v(V2.n nVar, int i, Long l4, boolean z4, Long l5, boolean z5, int i5) {
        this.f3255a = nVar;
        this.f3256b = i;
        this.f3257c = l4;
        this.f3258d = z4;
        this.f3259e = l5;
        this.f3260f = z5;
        this.f3261g = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.i.a(this.f3255a, vVar.f3255a) && this.f3256b == vVar.f3256b && kotlin.jvm.internal.i.a(this.f3257c, vVar.f3257c) && this.f3258d == vVar.f3258d && kotlin.jvm.internal.i.a(this.f3259e, vVar.f3259e) && this.f3260f == vVar.f3260f && this.f3261g == vVar.f3261g;
    }

    public final int hashCode() {
        V2.n nVar = this.f3255a;
        int iC = B.a.c(this.f3256b, (nVar == null ? 0 : nVar.hashCode()) * 31, 31);
        Long l4 = this.f3257c;
        int iHashCode = (Boolean.hashCode(this.f3258d) + ((iC + (l4 == null ? 0 : l4.hashCode())) * 31)) * 31;
        Long l5 = this.f3259e;
        return Integer.hashCode(this.f3261g) + ((Boolean.hashCode(this.f3260f) + ((iHashCode + (l5 != null ? l5.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "PlanPreferencesSnapshot(plan=" + this.f3255a + ", usageThresholdReached=" + this.f3256b + ", nextCycleStartTime=" + this.f3257c + ", evaluationCompleted=" + this.f3258d + ", evaluationCompletionTime=" + this.f3259e + ", feedbackViewed=" + this.f3260f + ", goalSuccessStreak=" + this.f3261g + ")";
    }
}
