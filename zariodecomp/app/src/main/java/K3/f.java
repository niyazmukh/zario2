package K3;

import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K3\f.smali */
public final class f implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f2279a;

    public f(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f2279a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (kotlin.jvm.internal.i.a(this.f2279a, ((f) obj).f2279a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2279a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f2279a + ')';
    }
}
