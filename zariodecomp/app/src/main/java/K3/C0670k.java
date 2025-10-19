package k3;

/* renamed from: k3.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\k.smali */
public final class C0670k {

    /* renamed from: a, reason: collision with root package name */
    public final String f8322a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8323b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8324c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8325d;

    public C0670k(String packageName, String appLabel, long j5) {
        kotlin.jvm.internal.i.e(packageName, "packageName");
        kotlin.jvm.internal.i.e(appLabel, "appLabel");
        this.f8322a = packageName;
        this.f8323b = appLabel;
        this.f8324c = j5;
        this.f8325d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0670k)) {
            return false;
        }
        C0670k c0670k = (C0670k) obj;
        return kotlin.jvm.internal.i.a(this.f8322a, c0670k.f8322a) && kotlin.jvm.internal.i.a(this.f8323b, c0670k.f8323b) && this.f8324c == c0670k.f8324c && this.f8325d == c0670k.f8325d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8325d) + B.a.e(B.a.f(this.f8322a.hashCode() * 31, 31, this.f8323b), 31, this.f8324c);
    }

    public final String toString() {
        return "TodayUsageEntry(packageName=" + this.f8322a + ", appLabel=" + this.f8323b + ", durationMs=" + this.f8324c + ", isAggregate=" + this.f8325d + ")";
    }
}
