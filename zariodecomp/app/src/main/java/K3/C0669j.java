package k3;

/* renamed from: k3.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\j.smali */
public final class C0669j {

    /* renamed from: a, reason: collision with root package name */
    public final int f8320a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8321b;

    public C0669j(int i, long j5) {
        this.f8320a = i;
        this.f8321b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0669j)) {
            return false;
        }
        C0669j c0669j = (C0669j) obj;
        return this.f8320a == c0669j.f8320a && this.f8321b == c0669j.f8321b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8321b) + (Integer.hashCode(this.f8320a) * 31);
    }

    public final String toString() {
        return "HourlyUsageBar(hour=" + this.f8320a + ", durationMs=" + this.f8321b + ")";
    }
}
