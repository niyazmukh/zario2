package J0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\o.smali */
public final class o extends r {

    /* renamed from: a, reason: collision with root package name */
    public final h f2060a = h.f2050c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        return this.f2060a.equals(((o) obj).f2060a);
    }

    public final int hashCode() {
        return this.f2060a.hashCode() + (o.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f2060a + '}';
    }
}
