package K3;

import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K3\e.smali */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2277a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2278b;

    public e(Object obj, Object obj2) {
        this.f2277a = obj;
        this.f2278b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.i.a(this.f2277a, eVar.f2277a) && kotlin.jvm.internal.i.a(this.f2278b, eVar.f2278b);
    }

    public final int hashCode() {
        Object obj = this.f2277a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2278b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2277a + ", " + this.f2278b + ')';
    }
}
