package f4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k4.r;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\K.smali */
public final class K extends r {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7024e = AtomicIntegerFieldUpdater.newUpdater(K.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // k4.r, f4.t0
    public final void i(Object obj) {
        j(obj);
    }

    @Override // k4.r, f4.t0
    public final void j(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f7024e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                k4.a.j(p1.b.x(this.f8406d), E.v(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
