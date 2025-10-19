package V2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\V2\n.smali */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f3447a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3448b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3449c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3450d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f3451e;

    public n(long j5, long j6, String label, long j7, Long l4) {
        kotlin.jvm.internal.i.e(label, "label");
        this.f3447a = j5;
        this.f3448b = j6;
        this.f3449c = label;
        this.f3450d = j7;
        this.f3451e = l4;
    }

    public static n a(n nVar, Long l4) {
        long j5 = nVar.f3447a;
        long j6 = nVar.f3448b;
        String label = nVar.f3449c;
        long j7 = nVar.f3450d;
        nVar.getClass();
        kotlin.jvm.internal.i.e(label, "label");
        return new n(j5, j6, label, j7, l4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f3447a == nVar.f3447a && this.f3448b == nVar.f3448b && kotlin.jvm.internal.i.a(this.f3449c, nVar.f3449c) && this.f3450d == nVar.f3450d && kotlin.jvm.internal.i.a(this.f3451e, nVar.f3451e);
    }

    public final int hashCode() {
        int iE = B.a.e(B.a.f(B.a.e(Long.hashCode(this.f3447a) * 31, 31, this.f3448b), 31, this.f3449c), 31, this.f3450d);
        Long l4 = this.f3451e;
        return iE + (l4 == null ? 0 : l4.hashCode());
    }

    public final String toString() {
        return "ScreenTimePlan(goalTimeMs=" + this.f3447a + ", dailyAverageMs=" + this.f3448b + ", label=" + this.f3449c + ", planCreatedAt=" + this.f3450d + ", evaluationStartTime=" + this.f3451e + ")";
    }

    public /* synthetic */ n(long j5, long j6, String str, long j7, int i) {
        this(j5, j6, (i & 4) != 0 ? "Daily screen time" : str, (i & 8) != 0 ? System.currentTimeMillis() : j7, (Long) null);
    }
}
