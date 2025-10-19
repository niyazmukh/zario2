package K3;

import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K3\i.smali */
public final class i implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2284a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2285b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2286c;

    public i(Object obj, Object obj2, Object obj3) {
        this.f2284a = obj;
        this.f2285b = obj2;
        this.f2286c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.i.a(this.f2284a, iVar.f2284a) && kotlin.jvm.internal.i.a(this.f2285b, iVar.f2285b) && kotlin.jvm.internal.i.a(this.f2286c, iVar.f2286c);
    }

    public final int hashCode() {
        Object obj = this.f2284a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2285b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f2286c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2284a + ", " + this.f2285b + ", " + this.f2286c + ')';
    }
}
