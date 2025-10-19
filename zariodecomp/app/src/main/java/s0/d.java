package S0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2849a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f2850b;

    public d(String str, Long l4) {
        this.f2849a = str;
        this.f2850b = l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.i.a(this.f2849a, dVar.f2849a) && kotlin.jvm.internal.i.a(this.f2850b, dVar.f2850b);
    }

    public final int hashCode() {
        int iHashCode = this.f2849a.hashCode() * 31;
        Long l4 = this.f2850b;
        return iHashCode + (l4 == null ? 0 : l4.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f2849a + ", value=" + this.f2850b + ')';
    }
}
