package U2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U2\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Long f3319a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f3320b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3321c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3322d;

    public /* synthetic */ d(Long l4, int i) {
        this((i & 1) != 0 ? null : l4, null, null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.i.a(this.f3319a, dVar.f3319a) && kotlin.jvm.internal.i.a(this.f3320b, dVar.f3320b) && kotlin.jvm.internal.i.a(this.f3321c, dVar.f3321c) && this.f3322d == dVar.f3322d;
    }

    public final int hashCode() {
        Long l4 = this.f3319a;
        int iHashCode = (l4 == null ? 0 : l4.hashCode()) * 31;
        Long l5 = this.f3320b;
        int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.f3321c;
        return Integer.hashCode(this.f3322d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RefreshStatus(lastSuccessEpochMillis=" + this.f3319a + ", lastErrorEpochMillis=" + this.f3320b + ", lastErrorMessage=" + this.f3321c + ", consecutiveFailures=" + this.f3322d + ")";
    }

    public d(Long l4, Long l5, String str, int i) {
        this.f3319a = l4;
        this.f3320b = l5;
        this.f3321c = str;
        this.f3322d = i;
    }
}
