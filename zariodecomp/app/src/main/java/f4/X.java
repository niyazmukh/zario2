package f4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\X.smali */
public abstract class X extends Y implements J {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7038k = AtomicReferenceFieldUpdater.newUpdater(X.class, Object.class, "_queue$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7039l = AtomicReferenceFieldUpdater.newUpdater(X.class, Object.class, "_delayed$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7040m = AtomicIntegerFieldUpdater.newUpdater(X.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public final void A(long j5, V v4) {
        int iC;
        Thread threadQ;
        boolean z4 = f7040m.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7039l;
        if (z4) {
            iC = 1;
        } else {
            W w4 = (W) atomicReferenceFieldUpdater.get(this);
            if (w4 == null) {
                W w5 = new W();
                w5.f7037c = j5;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, w5) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.i.b(obj);
                w4 = (W) obj;
            }
            iC = v4.c(j5, w4, this);
        }
        if (iC != 0) {
            if (iC == 1) {
                v(j5, v4);
                return;
            } else {
                if (iC != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        W w6 = (W) atomicReferenceFieldUpdater.get(this);
        if (w6 != null) {
            synchronized (w6) {
                V[] vArr = w6.f8416a;
                v = vArr != null ? vArr[0] : null;
            }
        }
        if (v != v4 || Thread.currentThread() == (threadQ = q())) {
            return;
        }
        LockSupport.unpark(threadQ);
    }

    public P a(long j5, E0 e02, O3.i iVar) {
        return G.f7020a.a(j5, e02, iVar);
    }

    @Override // f4.J
    public final void e(long j5, C0516n c0516n) {
        long j6 = j5 > 0 ? j5 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j5 : 0L;
        if (j6 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            T t4 = new T(this, j6 + jNanoTime, c0516n);
            A(jNanoTime, t4);
            c0516n.v(new C0511j(t4, 2));
        }
    }

    public final void k(O3.i iVar, Runnable runnable) {
        w(runnable);
    }

    @Override // f4.Y
    public void shutdown() {
        V vB;
        C0.f7001a.set(null);
        f7040m.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7038k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            h1.i iVar = E.f7010c;
            if (obj != null) {
                if (!(obj instanceof k4.m)) {
                    if (obj != iVar) {
                        k4.m mVar = new k4.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((k4.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, iVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (t() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            W w4 = (W) f7039l.get(this);
            if (w4 == null) {
                return;
            }
            synchronized (w4) {
                vB = k4.x.f8415b.get(w4) > 0 ? w4.b(0) : null;
            }
            if (vB == null) {
                return;
            } else {
                v(jNanoTime, vB);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    @Override // f4.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long t() {
        /*
            r10 = this;
            boolean r0 = r10.u()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            r10.x()
        Lc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f4.X.f7038k
            java.lang.Object r3 = r0.get(r10)
            h1.i r4 = f4.E.f7010c
            r5 = 0
            if (r3 != 0) goto L19
        L17:
            r7 = r5
            goto L49
        L19:
            boolean r6 = r3 instanceof k4.m
            if (r6 == 0) goto L3d
            r6 = r3
            k4.m r6 = (k4.m) r6
            java.lang.Object r7 = r6.d()
            h1.i r8 = k4.m.f8396g
            if (r7 == r8) goto L2b
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L49
        L2b:
            k4.m r6 = r6.c()
        L2f:
            boolean r4 = r0.compareAndSet(r10, r3, r6)
            if (r4 == 0) goto L36
            goto Lc
        L36:
            java.lang.Object r4 = r0.get(r10)
            if (r4 == r3) goto L2f
            goto Lc
        L3d:
            if (r3 != r4) goto L40
            goto L17
        L40:
            boolean r6 = r0.compareAndSet(r10, r3, r5)
            if (r6 == 0) goto Lb5
            r7 = r3
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L49:
            if (r7 == 0) goto L4f
            r7.run()
            return r1
        L4f:
            L3.h r3 = r10.f7044e
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 != 0) goto L5a
        L58:
            r8 = r6
            goto L62
        L5a:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L61
            goto L58
        L61:
            r8 = r1
        L62:
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 != 0) goto L67
            goto Lb4
        L67:
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L8f
            boolean r3 = r0 instanceof k4.m
            if (r3 == 0) goto L8b
            k4.m r0 = (k4.m) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = k4.m.f8395f
            long r3 = r3.get(r0)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r3
            int r0 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r8
            r8 = 30
            long r3 = r3 >> r8
            int r3 = (int) r3
            if (r0 != r3) goto Lb4
            goto L8f
        L8b:
            if (r0 != r4) goto Lb4
        L8d:
            r1 = r6
            goto Lb4
        L8f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f4.X.f7039l
            java.lang.Object r10 = r0.get(r10)
            f4.W r10 = (f4.W) r10
            if (r10 == 0) goto L8d
            monitor-enter(r10)
            f4.V[] r0 = r10.f8416a     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto La1
            r3 = 0
            r5 = r0[r3]     // Catch: java.lang.Throwable -> Lb1
        La1:
            monitor-exit(r10)
            if (r5 != 0) goto La5
            goto L8d
        La5:
            long r3 = r5.f7035a
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            long r1 = S0.f.u(r3, r1)
            goto Lb4
        Lb1:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        Lb4:
            return r1
        Lb5:
            java.lang.Object r6 = r0.get(r10)
            if (r6 == r3) goto L40
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.X.t():long");
    }

    public void w(Runnable runnable) {
        x();
        if (!y(runnable)) {
            F.f7017n.w(runnable);
            return;
        }
        Thread threadQ = q();
        if (Thread.currentThread() != threadQ) {
            LockSupport.unpark(threadQ);
        }
    }

    public final void x() {
        V vB;
        W w4 = (W) f7039l.get(this);
        if (w4 == null || k4.x.f8415b.get(w4) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (w4) {
                try {
                    V[] vArr = w4.f8416a;
                    V v4 = vArr != null ? vArr[0] : null;
                    if (v4 != null) {
                        vB = ((jNanoTime - v4.f7035a) > 0L ? 1 : ((jNanoTime - v4.f7035a) == 0L ? 0 : -1)) >= 0 ? y(v4) : false ? w4.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (vB != null);
    }

    public final boolean y(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7038k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f7040m.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof k4.m)) {
                if (obj == E.f7010c) {
                    return false;
                }
                k4.m mVar = new k4.m(8, true);
                mVar.a((Runnable) obj);
                mVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            k4.m mVar2 = (k4.m) obj;
            int iA = mVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                k4.m mVarC = mVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final boolean z() {
        L3.h hVar = this.f7044e;
        if (!(hVar != null ? hVar.isEmpty() : true)) {
            return false;
        }
        W w4 = (W) f7039l.get(this);
        if (w4 != null && k4.x.f8415b.get(w4) != 0) {
            return false;
        }
        Object obj = f7038k.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof k4.m) {
            long j5 = k4.m.f8395f.get((k4.m) obj);
            if (((int) (1073741823 & j5)) == ((int) ((j5 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == E.f7010c) {
            return true;
        }
        return false;
    }
}
