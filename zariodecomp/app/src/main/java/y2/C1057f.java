package y2;

/* renamed from: y2.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\f.smali */
public final class C1057f {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1056e f11091a;

    /* renamed from: b, reason: collision with root package name */
    public final B2.l f11092b;

    public C1057f(EnumC1056e enumC1056e, B2.l lVar) {
        this.f11091a = enumC1056e;
        this.f11092b = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1057f)) {
            return false;
        }
        C1057f c1057f = (C1057f) obj;
        return this.f11091a.equals(c1057f.f11091a) && this.f11092b.equals(c1057f.f11092b);
    }

    public final int hashCode() {
        int iHashCode = (this.f11091a.hashCode() + 1891) * 31;
        B2.l lVar = this.f11092b;
        return lVar.f326e.hashCode() + ((lVar.f322a.f315a.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "DocumentViewChange(" + this.f11092b + "," + this.f11091a + ")";
    }
}
