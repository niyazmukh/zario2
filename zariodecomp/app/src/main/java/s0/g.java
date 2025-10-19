package S0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\g.smali */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f2854a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2855b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2856c;

    public g(String workSpecId, int i, int i5) {
        kotlin.jvm.internal.i.e(workSpecId, "workSpecId");
        this.f2854a = workSpecId;
        this.f2855b = i;
        this.f2856c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.i.a(this.f2854a, gVar.f2854a) && this.f2855b == gVar.f2855b && this.f2856c == gVar.f2856c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2856c) + B.a.c(this.f2855b, this.f2854a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.f2854a + ", generation=" + this.f2855b + ", systemId=" + this.f2856c + ')';
    }
}
