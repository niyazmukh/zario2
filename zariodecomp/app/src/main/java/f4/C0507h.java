package f4;

import java.util.concurrent.locks.LockSupport;

/* renamed from: f4.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\h.1.smali */
public final class C0507h extends a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f7063d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f7064e;

    public C0507h(O3.i iVar, Thread thread, Y y4) {
        super(iVar, true);
        this.f7063d = thread;
        this.f7064e = y4;
    }

    @Override // f4.t0
    public final void i(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f7063d;
        if (kotlin.jvm.internal.i.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
