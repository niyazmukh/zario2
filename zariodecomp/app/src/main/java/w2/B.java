package w2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\B.smali */
public final class B {

    /* renamed from: b, reason: collision with root package name */
    public static final B f10913b = new B(true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10914a;

    public B(boolean z4) {
        this.f10914a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && B.class == obj.getClass() && this.f10914a == ((B) obj).f10914a;
    }

    public final int hashCode() {
        return (this.f10914a ? 1 : 0) * 31;
    }
}
