package O0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\O0\b.smali */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final int f2613a;

    public b(int i) {
        this.f2613a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f2613a == ((b) obj).f2613a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2613a);
    }

    public final String toString() {
        return "ConstraintsNotMet(reason=" + this.f2613a + ')';
    }
}
