package m4;

import f4.Z;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m4\h.smali */
public abstract class h extends Z {

    /* renamed from: c, reason: collision with root package name */
    public final c f8932c;

    public h(int i, int i5, long j5, String str) {
        this.f8932c = new c(i, i5, j5, str);
    }

    public final void k(O3.i iVar, Runnable runnable) {
        c.k(this.f8932c, runnable, false, 6);
    }

    public final void l(O3.i iVar, Runnable runnable) {
        c.k(this.f8932c, runnable, true, 2);
    }

    @Override // f4.Z
    public final Executor o() {
        return this.f8932c;
    }
}
