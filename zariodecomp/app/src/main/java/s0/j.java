package S0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\j.smali */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2863b;

    public j(String workSpecId, int i) {
        kotlin.jvm.internal.i.e(workSpecId, "workSpecId");
        this.f2862a = workSpecId;
        this.f2863b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.i.a(this.f2862a, jVar.f2862a) && this.f2863b == jVar.f2863b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2863b) + (this.f2862a.hashCode() * 31);
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f2862a + ", generation=" + this.f2863b + ')';
    }
}
