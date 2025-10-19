package m;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m.1\c.smali */
public final class ThreadFactoryC0736c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8811a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f8812b;

    public ThreadFactoryC0736c(int i) {
        this.f8811a = i;
        switch (i) {
            case 1:
                this.f8812b = new AtomicInteger(1);
                break;
            default:
                this.f8812b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f8811a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + this.f8812b.getAndIncrement());
                return thread;
            default:
                return new Thread(runnable, "ModernAsyncTask #" + this.f8812b.getAndIncrement());
        }
    }
}
