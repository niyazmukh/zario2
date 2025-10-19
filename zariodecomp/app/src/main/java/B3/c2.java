package B3;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\c2.smali */
public final class c2 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f778c = Logger.getLogger(c2.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public boolean f779a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f780b;

    public final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.f780b.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f778c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        S0.f.l(runnable, "'task' must not be null.");
        if (this.f779a) {
            if (this.f780b == null) {
                this.f780b = new ArrayDeque(4);
            }
            this.f780b.add(runnable);
            return;
        }
        this.f779a = true;
        try {
            runnable.run();
        } catch (Throwable th) {
            try {
                f778c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
                if (this.f780b != null) {
                }
            } finally {
                if (this.f780b != null) {
                    a();
                }
                this.f779a = false;
            }
        }
    }
}
