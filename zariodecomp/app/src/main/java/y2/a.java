package Y2;

import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Y2\a.smali */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f3874a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3875b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3876c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3877d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3878e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3879f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3880g;
    public final String h;
    public final long i;

    public a(String str, String str2, String planLabel, long j5, long j6, long j7, String packageName, long j8) {
        i.e(planLabel, "planLabel");
        i.e(packageName, "packageName");
        this.f3874a = 0L;
        this.f3875b = str;
        this.f3876c = str2;
        this.f3877d = planLabel;
        this.f3878e = j5;
        this.f3879f = j6;
        this.f3880g = j7;
        this.h = packageName;
        this.i = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3874a == aVar.f3874a && i.a(this.f3875b, aVar.f3875b) && i.a(this.f3876c, aVar.f3876c) && i.a(this.f3877d, aVar.f3877d) && this.f3878e == aVar.f3878e && this.f3879f == aVar.f3879f && this.f3880g == aVar.f3880g && i.a(this.h, aVar.h) && this.i == aVar.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + B.a.f(B.a.e(B.a.e(B.a.e(B.a.f(B.a.f(B.a.f(Long.hashCode(this.f3874a) * 31, 31, this.f3875b), 31, this.f3876c), 31, this.f3877d), 31, this.f3878e), 31, this.f3879f), 31, this.f3880g), 31, this.h);
    }

    public final String toString() {
        return "AppUsageHourlyEntry(id=" + this.f3874a + ", userId=" + this.f3875b + ", userEmail=" + this.f3876c + ", planLabel=" + this.f3877d + ", cycleStartTime=" + this.f3878e + ", hourStartTime=" + this.f3879f + ", hourEndTime=" + this.f3880g + ", packageName=" + this.h + ", usageMs=" + this.i + ")";
    }
}
