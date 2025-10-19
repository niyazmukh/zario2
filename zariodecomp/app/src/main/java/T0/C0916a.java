package t0;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\a.1.smali */
public final class C0916a {

    /* renamed from: a, reason: collision with root package name */
    public int f9945a;

    /* renamed from: b, reason: collision with root package name */
    public int f9946b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9947c;

    /* renamed from: d, reason: collision with root package name */
    public int f9948d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0916a.class != obj.getClass()) {
            return false;
        }
        C0916a c0916a = (C0916a) obj;
        int i = this.f9945a;
        if (i != c0916a.f9945a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f9948d - this.f9946b) == 1 && this.f9948d == c0916a.f9946b && this.f9946b == c0916a.f9948d) {
            return true;
        }
        if (this.f9948d != c0916a.f9948d || this.f9946b != c0916a.f9946b) {
            return false;
        }
        Object obj2 = this.f9947c;
        if (obj2 != null) {
            if (!obj2.equals(c0916a.f9947c)) {
                return false;
            }
        } else if (c0916a.f9947c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f9945a * 31) + this.f9946b) * 31) + this.f9948d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f9945a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f9946b);
        sb.append("c:");
        sb.append(this.f9948d);
        sb.append(",p:");
        sb.append(this.f9947c);
        sb.append("]");
        return sb.toString();
    }
}
