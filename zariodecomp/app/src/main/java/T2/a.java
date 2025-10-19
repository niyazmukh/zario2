package T2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\a.smali */
public final class a {
    public static final a h = new a(null, 0, null, false, null, true, 0);

    /* renamed from: a, reason: collision with root package name */
    public final V2.n f3193a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3194b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f3195c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3196d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f3197e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3198f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3199g;

    public a(V2.n nVar, int i, Long l4, boolean z4, Long l5, boolean z5, int i5) {
        this.f3193a = nVar;
        this.f3194b = i;
        this.f3195c = l4;
        this.f3196d = z4;
        this.f3197e = l5;
        this.f3198f = z5;
        this.f3199g = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.i.a(this.f3193a, aVar.f3193a) && this.f3194b == aVar.f3194b && kotlin.jvm.internal.i.a(this.f3195c, aVar.f3195c) && this.f3196d == aVar.f3196d && kotlin.jvm.internal.i.a(this.f3197e, aVar.f3197e) && this.f3198f == aVar.f3198f && this.f3199g == aVar.f3199g;
    }

    public final int hashCode() {
        V2.n nVar = this.f3193a;
        int iC = B.a.c(this.f3194b, (nVar == null ? 0 : nVar.hashCode()) * 31, 31);
        Long l4 = this.f3195c;
        int iHashCode = (Boolean.hashCode(this.f3196d) + ((iC + (l4 == null ? 0 : l4.hashCode())) * 31)) * 31;
        Long l5 = this.f3197e;
        return Integer.hashCode(this.f3199g) + ((Boolean.hashCode(this.f3198f) + ((iHashCode + (l5 != null ? l5.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "CycleState(plan=" + this.f3193a + ", usageThresholdReached=" + this.f3194b + ", nextCycleStartTime=" + this.f3195c + ", evaluationCompleted=" + this.f3196d + ", evaluationCompletionTime=" + this.f3197e + ", feedbackViewed=" + this.f3198f + ", goalSuccessStreak=" + this.f3199g + ")";
    }
}
