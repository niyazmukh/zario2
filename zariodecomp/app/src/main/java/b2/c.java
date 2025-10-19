package B2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B2\c.smali */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f305a;

    /* renamed from: b, reason: collision with root package name */
    public final b f306b;

    public c(long j5, b bVar) {
        this.f305a = j5;
        if (bVar == null) {
            throw new NullPointerException("Null offset");
        }
        this.f306b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f305a == cVar.f305a && this.f306b.equals(cVar.f306b);
    }

    public final int hashCode() {
        long j5 = this.f305a;
        return this.f306b.hashCode() ^ ((((int) ((j5 >>> 32) ^ j5)) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "IndexState{sequenceNumber=" + this.f305a + ", offset=" + this.f306b + "}";
    }
}
