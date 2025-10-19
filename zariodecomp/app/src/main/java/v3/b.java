package v3;

import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v3.1\b.smali */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f10672a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10673b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10674c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10675d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10676e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10677f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10678g;
    public final String h;

    public b(long j5, long j6, String source, String str, String str2, String state, int i, String str3) {
        i.e(source, "source");
        i.e(state, "state");
        this.f10672a = j5;
        this.f10673b = j6;
        this.f10674c = source;
        this.f10675d = str;
        this.f10676e = str2;
        this.f10677f = state;
        this.f10678g = i;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10672a == bVar.f10672a && this.f10673b == bVar.f10673b && i.a(this.f10674c, bVar.f10674c) && i.a(this.f10675d, bVar.f10675d) && i.a(this.f10676e, bVar.f10676e) && i.a(this.f10677f, bVar.f10677f) && this.f10678g == bVar.f10678g && i.a(this.h, bVar.h);
    }

    public final int hashCode() {
        int iF = B.a.f(B.a.e(Long.hashCode(this.f10672a) * 31, 31, this.f10673b), 31, this.f10674c);
        String str = this.f10675d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10676e;
        int iC = B.a.c(this.f10678g, B.a.f((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f10677f), 31);
        String str3 = this.h;
        return iC + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "UsageRawEventEntity(id=" + this.f10672a + ", timestampMs=" + this.f10673b + ", source=" + this.f10674c + ", packageName=" + this.f10675d + ", activityClass=" + this.f10676e + ", state=" + this.f10677f + ", confidenceOrdinal=" + this.f10678g + ", extras=" + this.h + ")";
    }
}
