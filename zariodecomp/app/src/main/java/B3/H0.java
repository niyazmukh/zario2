package B3;

import g2.AbstractC0584g;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\H0.smali */
public final class H0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f430b = Logger.getLogger(H0.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f431a;

    public H0(Runnable runnable) {
        this.f431a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f431a;
        try {
            runnable.run();
        } catch (Throwable th) {
            f430b.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            Object obj = AbstractC0584g.f7604a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new AssertionError(th);
            }
            throw ((Error) th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.f431a + ")";
    }
}
