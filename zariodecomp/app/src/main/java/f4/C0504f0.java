package f4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: f4.f0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\f0.1.smali */
public final class C0504f0 extends k0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7058f = AtomicIntegerFieldUpdater.newUpdater(C0504f0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: e, reason: collision with root package name */
    public final X3.l f7059e;

    public C0504f0(X3.l lVar) {
        this.f7059e = lVar;
    }

    @Override // f4.k0
    public final boolean j() {
        return true;
    }

    @Override // f4.k0
    public final void k(Throwable th) {
        if (f7058f.compareAndSet(this, 0, 1)) {
            this.f7059e.invoke(th);
        }
    }
}
