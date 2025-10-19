package e2;

/* renamed from: e2.m, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e2.1\m.smali */
public final class C0465m {

    /* renamed from: a, reason: collision with root package name */
    public final int f6883a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6884b;

    public C0465m(int i, long j5) {
        this.f6883a = i;
        this.f6884b = j5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0465m) {
            C0465m c0465m = (C0465m) obj;
            if (this.f6883a == c0465m.f6883a && this.f6884b == c0465m.f6884b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f6884b;
        return ((this.f6883a ^ 1000003) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f6883a + ", eventTimestamp=" + this.f6884b + "}";
    }
}
