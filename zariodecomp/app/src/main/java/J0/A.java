package J0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\A.smali */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final long f2011a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2012b;

    public A(long j5, long j6) {
        this.f2011a = j5;
        this.f2012b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !A.class.equals(obj.getClass())) {
            return false;
        }
        A a5 = (A) obj;
        return a5.f2011a == this.f2011a && a5.f2012b == this.f2012b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2012b) + (Long.hashCode(this.f2011a) * 31);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.f2011a + ", flexIntervalMillis=" + this.f2012b + '}';
    }
}
