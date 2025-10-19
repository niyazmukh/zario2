package S0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\o.smali */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f2876a;

    /* renamed from: b, reason: collision with root package name */
    public int f2877b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.i.a(this.f2876a, oVar.f2876a) && this.f2877b == oVar.f2877b;
    }

    public final int hashCode() {
        return t.h.c(this.f2877b) + (this.f2876a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f2876a + ", state=" + B.a.y(this.f2877b) + ')';
    }
}
