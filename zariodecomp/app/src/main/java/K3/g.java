package K3;

import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K3\g.smali */
public final class g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2280a;

    public static final Throwable a(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).f2279a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return kotlin.jvm.internal.i.a(this.f2280a, ((g) obj).f2280a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f2280a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f2280a;
        if (obj instanceof f) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}
