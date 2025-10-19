package B3;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
import z3.EnumC1087k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\M0.smali */
public final class M0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y0 f460a;

    public M0(Y0 y02) {
        this.f460a = y02;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = Y0.f611g0;
        Level level = Level.SEVERE;
        StringBuilder sb = new StringBuilder("[");
        Y0 y02 = this.f460a;
        sb.append(y02.f646d);
        sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.log(level, sb.toString(), th);
        if (y02.f621C) {
            return;
        }
        y02.f621C = true;
        y02.z(true);
        y02.D(false);
        L0 l02 = new L0(th);
        y02.f620B = l02;
        y02.f625H.i(l02);
        y02.f637T.t(null);
        y02.f635R.l(4, "PANIC! Entering TRANSIENT_FAILURE");
        y02.f664u.b(EnumC1087k.f11343c);
    }
}
