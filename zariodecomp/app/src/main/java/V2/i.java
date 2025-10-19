package V2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\V2\i.smali */
public final class i extends m {

    /* renamed from: a, reason: collision with root package name */
    public final h f3444a;

    public i(h hVar) {
        this.f3444a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && kotlin.jvm.internal.i.a(this.f3444a, ((i) obj).f3444a);
    }

    public final int hashCode() {
        return this.f3444a.hashCode();
    }

    public final String toString() {
        return "Active(progress=" + this.f3444a + ")";
    }
}
