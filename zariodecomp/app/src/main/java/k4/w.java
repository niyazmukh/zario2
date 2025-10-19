package k4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\w.smali */
public final class w implements O3.h {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f8414a;

    public w(ThreadLocal threadLocal) {
        this.f8414a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && kotlin.jvm.internal.i.a(this.f8414a, ((w) obj).f8414a);
    }

    public final int hashCode() {
        return this.f8414a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f8414a + ')';
    }
}
