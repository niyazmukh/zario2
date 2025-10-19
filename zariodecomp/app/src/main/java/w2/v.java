package w2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\v.smali */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final long f10970a;

    public v(long j5) {
        this.f10970a = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && v.class == obj.getClass() && this.f10970a == ((v) obj).f10970a;
    }

    public final int hashCode() {
        long j5 = this.f10970a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return "PersistentCacheSettings{sizeBytes=" + this.f10970a + '}';
    }
}
