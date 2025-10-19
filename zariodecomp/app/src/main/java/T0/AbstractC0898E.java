package t0;

import java.util.concurrent.Executors;

/* renamed from: t0.E, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\E.smali */
public abstract class AbstractC0898E extends AbstractC0902I {

    /* renamed from: c, reason: collision with root package name */
    public final C0919d f9896c;

    public AbstractC0898E(AbstractC0917b abstractC0917b) {
        C0897D c0897d = new C0897D(this);
        h1.i iVar = new h1.i(this, 22);
        synchronized (AbstractC0917b.f9950a) {
            try {
                if (AbstractC0917b.f9951b == null) {
                    AbstractC0917b.f9951b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0919d c0919d = new C0919d(iVar, new S0.c(11, AbstractC0917b.f9951b, abstractC0917b));
        this.f9896c = c0919d;
        c0919d.f9968d.add(c0897d);
    }

    @Override // t0.AbstractC0902I
    public final int a() {
        return this.f9896c.f9970f.size();
    }
}
