package J0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: J0.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\c.1.smali */
public final class ThreadFactoryC0109c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f2032a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2033b;

    public ThreadFactoryC0109c(boolean z4) {
        this.f2033b = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        kotlin.jvm.internal.i.e(runnable, "runnable");
        StringBuilder sbB = t.h.b(this.f2033b ? "WM.task-" : "androidx.work-");
        sbB.append(this.f2032a.incrementAndGet());
        return new Thread(runnable, sbB.toString());
    }
}
