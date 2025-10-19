package f4;

import java.util.concurrent.Executor;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\M.smali */
public final class M implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final A f7026a;

    public M(A a5) {
        this.f7026a = a5;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        O3.j jVar = O3.j.f2661a;
        A a5 = this.f7026a;
        if (a5.m(jVar)) {
            a5.k(jVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f7026a.toString();
    }
}
