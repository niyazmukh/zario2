package L3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\v.smali */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f2354a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2355b;

    public v(int i, Object obj) {
        this.f2354a = i;
        this.f2355b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f2354a == vVar.f2354a && kotlin.jvm.internal.i.a(this.f2355b, vVar.f2355b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f2354a) * 31;
        Object obj = this.f2355b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f2354a + ", value=" + this.f2355b + ')';
    }
}
