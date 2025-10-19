package q4;

import a.AbstractC0183a;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q4\n.smali */
public final class n extends AbstractC0183a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f9539c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9540a;

    /* renamed from: b, reason: collision with root package name */
    public n f9541b;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f9539c = reentrantLock;
        kotlin.jvm.internal.i.d(reentrantLock.newCondition(), "lock.newCondition()");
        TimeUnit.MILLISECONDS.toNanos(TimeUnit.SECONDS.toMillis(60L));
    }

    public n(Socket socket) {
    }

    public final boolean q0() {
        ReentrantLock reentrantLock = f9539c;
        reentrantLock.lock();
        try {
            if (!this.f9540a) {
                return false;
            }
            this.f9540a = false;
            n nVar = null;
            while (nVar != null) {
                n nVar2 = nVar.f9541b;
                if (nVar2 == this) {
                    nVar.f9541b = this.f9541b;
                    this.f9541b = null;
                    return false;
                }
                nVar = nVar2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final IOException r0(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
