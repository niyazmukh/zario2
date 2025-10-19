package f4;

import S0.f;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\F.smali */
public final class F extends X implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: n, reason: collision with root package name */
    public static final F f7017n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f7018o;

    static {
        Long l4;
        F f2 = new F();
        f7017n = f2;
        f2.r(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f7018o = timeUnit.toNanos(l4.longValue());
    }

    public final synchronized void B() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            X.f7038k.set(this, null);
            X.f7039l.set(this, null);
            notifyAll();
        }
    }

    @Override // f4.X, f4.J
    public final P a(long j5, E0 e02, O3.i iVar) {
        long j6 = j5 > 0 ? j5 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j5 : 0L;
        if (j6 >= 4611686018427387903L) {
            return x0.f7108a;
        }
        long jNanoTime = System.nanoTime();
        U u2 = new U(j6 + jNanoTime, e02);
        A(jNanoTime, u2);
        return u2;
    }

    @Override // f4.Y
    public final Thread q() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f7017n.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        C0.f7001a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (z4) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j5 = Long.MAX_VALUE;
                long j6 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jT = t();
                    if (jT == j5) {
                        long jNanoTime = System.nanoTime();
                        if (j6 == j5) {
                            j6 = f7018o + jNanoTime;
                        }
                        long j7 = j6 - jNanoTime;
                        if (j7 <= 0) {
                            _thread = null;
                            B();
                            if (z()) {
                                return;
                            }
                            q();
                            return;
                        }
                        jT = f.v(jT, j7);
                    } else {
                        j6 = Long.MAX_VALUE;
                    }
                    if (jT > 0) {
                        int i5 = debugStatus;
                        if (i5 == 2 || i5 == 3) {
                            _thread = null;
                            B();
                            if (z()) {
                                return;
                            }
                            q();
                            return;
                        }
                        LockSupport.parkNanos(this, jT);
                    }
                    j5 = Long.MAX_VALUE;
                }
            }
        } finally {
            _thread = null;
            B();
            if (!z()) {
                q();
            }
        }
    }

    @Override // f4.X, f4.Y
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // f4.Y
    public final void v(long j5, V v4) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // f4.X
    public final void w(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.w(runnable);
    }
}
