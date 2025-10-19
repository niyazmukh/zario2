package k4;

import f4.y0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\s.smali */
public abstract class s extends b implements y0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8407d = AtomicIntegerFieldUpdater.newUpdater(s.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f8408c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public s(long j5, s sVar, int i) {
        super(sVar);
        this.f8408c = j5;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // k4.b
    public final boolean d() {
        return f8407d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f8407d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, O3.i iVar);

    public final void i() {
        if (f8407d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f8407d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
