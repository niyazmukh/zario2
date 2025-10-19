package d3;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\d3.1\a.smali */
public final class C0445a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6798a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6799b;

    public C0445a(boolean z4, boolean z5) {
        this.f6798a = z4;
        this.f6799b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0445a)) {
            return false;
        }
        C0445a c0445a = (C0445a) obj;
        return this.f6798a == c0445a.f6798a && this.f6799b == c0445a.f6799b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6799b) + (Boolean.hashCode(this.f6798a) * 31);
    }

    public final String toString() {
        return "PermissionsState(hasUsageStatsPermission=" + this.f6798a + ", hasNotificationPermission=" + this.f6799b + ")";
    }
}
