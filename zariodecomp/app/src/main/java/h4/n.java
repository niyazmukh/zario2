package h4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h4\n.smali */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final m f7816b = new m();

    /* renamed from: a, reason: collision with root package name */
    public final Object f7817a;

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return kotlin.jvm.internal.i.a(this.f7817a, ((n) obj).f7817a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f7817a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f7817a;
        if (obj instanceof l) {
            return ((l) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
