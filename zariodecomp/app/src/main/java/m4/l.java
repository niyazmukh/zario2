package m4;

import f4.A;
import k4.o;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m4\l.smali */
public final class l extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final l f8942c = new l();

    public final void k(O3.i iVar, Runnable runnable) {
        e.f8930d.f8932c.e(runnable, true, false);
    }

    public final void l(O3.i iVar, Runnable runnable) {
        e.f8930d.f8932c.e(runnable, true, true);
    }

    public final A n(int i, String str) {
        k4.a.c(i);
        return i >= k.f8939d ? str != null ? new o(this, str) : this : super.n(i, str);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
