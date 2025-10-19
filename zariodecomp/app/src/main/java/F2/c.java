package F2;

import a.AbstractC0183a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadFactory;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F2\c.smali */
public final class c implements Runnable, ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f1687a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f1689c;

    public c(d dVar) {
        this.f1689c = dVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AbstractC0183a.N(this.f1688b == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
        this.f1688b = runnable;
        this.f1687a.countDown();
        return this.f1689c.f1691b;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.f1687a.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.f1688b.run();
    }
}
