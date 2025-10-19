package K3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K3\b.smali */
public final class b implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f2274b = new b();

    /* renamed from: a, reason: collision with root package name */
    public final int f2275a = 131093;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f2275a - other.f2275a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f2275a == bVar.f2275a;
    }

    public final int hashCode() {
        return this.f2275a;
    }

    public final String toString() {
        return "2.0.21";
    }
}
