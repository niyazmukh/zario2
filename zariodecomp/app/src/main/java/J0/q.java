package J0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\q.smali */
public final class q extends r {

    /* renamed from: a, reason: collision with root package name */
    public final h f2061a;

    public q(h hVar) {
        this.f2061a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return this.f2061a.equals(((q) obj).f2061a);
    }

    public final int hashCode() {
        return this.f2061a.hashCode() + (q.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f2061a + '}';
    }
}
