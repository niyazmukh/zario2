package B3;

import java.lang.Thread;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\H1.smali */
public final class H1 implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new z3.m0(z3.k0.d(th).g("Uncaught exception in the SynchronizationContext. Re-thrown."));
    }
}
