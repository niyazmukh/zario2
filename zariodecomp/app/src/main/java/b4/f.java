package b4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b4\f.smali */
public final class f extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final f f5345d = new f(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (((d) this).a == ((d) fVar).a) {
                    if (((d) this).b == ((d) fVar).b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return ((d) this).b + (((d) this).a * 31);
    }

    public final boolean isEmpty() {
        return ((d) this).a > ((d) this).b;
    }

    public final String toString() {
        return ((d) this).a + ".." + ((d) this).b;
    }
}
