package l2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l2\a.smali */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f8762a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8763b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8764c;

    public a(long j5, long j6, long j7) {
        this.f8762a = j5;
        this.f8763b = j6;
        this.f8764c = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8762a == aVar.f8762a && this.f8763b == aVar.f8763b && this.f8764c == aVar.f8764c;
    }

    public final int hashCode() {
        long j5 = this.f8762a;
        long j6 = this.f8763b;
        int i = (((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.f8764c;
        return ((int) ((j7 >>> 32) ^ j7)) ^ i;
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f8762a + ", elapsedRealtime=" + this.f8763b + ", uptimeMillis=" + this.f8764c + "}";
    }
}
