package B3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\d2.smali */
public final class d2 extends i2 {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f791c;

    public d2(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f791c = atomicIntegerFieldUpdater;
    }

    @Override // B3.i2
    public final boolean r(f2 f2Var) {
        return this.f791c.compareAndSet(f2Var, 0, -1);
    }

    @Override // B3.i2
    public final void s(f2 f2Var) {
        this.f791c.set(f2Var, 0);
    }
}
