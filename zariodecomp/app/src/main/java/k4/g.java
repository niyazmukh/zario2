package k4;

import f4.A;
import f4.C0516n;
import f4.E0;
import f4.G;
import f4.J;
import f4.P;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\g.smali */
public final class g extends A implements J {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8382m = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f8383c;

    /* renamed from: d, reason: collision with root package name */
    public final A f8384d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8385e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8386f;

    /* renamed from: k, reason: collision with root package name */
    public final k f8387k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f8388l;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public g(A a5, int i, String str) {
        J j5 = a5 instanceof J ? (J) a5 : null;
        this.f8383c = j5 == null ? G.f7020a : j5;
        this.f8384d = a5;
        this.f8385e = i;
        this.f8386f = str;
        this.f8387k = new k();
        this.f8388l = new Object();
    }

    @Override // f4.J
    public final P a(long j5, E0 e02, O3.i iVar) {
        return this.f8383c.a(j5, e02, iVar);
    }

    @Override // f4.J
    public final void e(long j5, C0516n c0516n) {
        this.f8383c.e(j5, c0516n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(O3.i iVar, Runnable runnable) {
        Runnable runnableO;
        this.f8387k.a(runnable);
        if (f8382m.get(this) >= this.f8385e || !p() || (runnableO = o()) == null) {
            return;
        }
        this.f8384d.k(this, new A3.a(15, this, runnableO));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(O3.i iVar, Runnable runnable) {
        Runnable runnableO;
        this.f8387k.a(runnable);
        if (f8382m.get(this) >= this.f8385e || !p() || (runnableO = o()) == null) {
            return;
        }
        this.f8384d.l(this, new A3.a(15, this, runnableO));
    }

    public final Runnable o() {
        while (true) {
            Runnable runnable = (Runnable) this.f8387k.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f8388l) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8382m;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f8387k.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean p() {
        synchronized (this.f8388l) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8382m;
            if (atomicIntegerFieldUpdater.get(this) >= this.f8385e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    public final String toString() {
        String str = this.f8386f;
        if (str != null) {
            return str;
        }
        return this.f8384d + ".limitedParallelism(" + this.f8385e + ')';
    }
}
