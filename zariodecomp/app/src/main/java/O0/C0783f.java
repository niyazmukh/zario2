package o0;

/* renamed from: o0.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\f.1.smali */
public final class C0783f {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0777L f9059a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9060b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9061c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9062d;

    public C0783f(AbstractC0777L abstractC0777L, boolean z4, Object obj, boolean z5) {
        if (!abstractC0777L.f9033a && z4) {
            throw new IllegalArgumentException(abstractC0777L.b().concat(" does not allow nullable values").toString());
        }
        if (!z4 && z5 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + abstractC0777L.b() + " has null value but is not nullable.").toString());
        }
        this.f9059a = abstractC0777L;
        this.f9060b = z4;
        this.f9062d = obj;
        this.f9061c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0783f.class.equals(obj.getClass())) {
            return false;
        }
        C0783f c0783f = (C0783f) obj;
        if (this.f9060b != c0783f.f9060b || this.f9061c != c0783f.f9061c || !kotlin.jvm.internal.i.a(this.f9059a, c0783f.f9059a)) {
            return false;
        }
        Object obj2 = c0783f.f9062d;
        Object obj3 = this.f9062d;
        return obj3 != null ? kotlin.jvm.internal.i.a(obj3, obj2) : obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f9059a.hashCode() * 31) + (this.f9060b ? 1 : 0)) * 31) + (this.f9061c ? 1 : 0)) * 31;
        Object obj = this.f9062d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0783f.class.getSimpleName());
        sb.append(" Type: " + this.f9059a);
        sb.append(" Nullable: " + this.f9060b);
        if (this.f9061c) {
            sb.append(" DefaultValue: " + this.f9062d);
        }
        String string = sb.toString();
        kotlin.jvm.internal.i.d(string, "sb.toString()");
        return string;
    }
}
