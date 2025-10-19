package m4;

import f4.E;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k4.q;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m4\c.smali */
public final class c implements Executor, Closeable {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8917l = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8918m = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8919n = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final h1.i f8920o = new h1.i("NOT_IN_STACK", 18);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f8921a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8922b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8923c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f8924d;

    /* renamed from: e, reason: collision with root package name */
    public final f f8925e;

    /* renamed from: f, reason: collision with root package name */
    public final f f8926f;

    /* renamed from: k, reason: collision with root package name */
    public final q f8927k;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i, int i5, long j5, String str) {
        this.f8921a = i;
        this.f8922b = i5;
        this.f8923c = j5;
        this.f8924d = str;
        if (i < 1) {
            throw new IllegalArgumentException(B.a.i("Core pool size ", i, " should be at least 1").toString());
        }
        if (i5 < i) {
            throw new IllegalArgumentException(B.a.h("Max pool size ", i5, i, " should be greater than or equals to core pool size ").toString());
        }
        if (i5 > 2097150) {
            throw new IllegalArgumentException(B.a.i("Max pool size ", i5, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j5 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j5 + " must be positive").toString());
        }
        this.f8925e = new f();
        this.f8926f = new f();
        this.f8927k = new q((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void k(c cVar, Runnable runnable, boolean z4, int i) {
        if ((i & 4) != 0) {
            z4 = false;
        }
        cVar.e(runnable, false, z4);
    }

    public final int a() {
        synchronized (this.f8927k) {
            try {
                if (f8919n.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f8918m;
                long j5 = atomicLongFieldUpdater.get(this);
                int i = (int) (j5 & 2097151);
                int i5 = i - ((int) ((j5 & 4398044413952L) >> 21));
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i5 >= this.f8921a) {
                    return 0;
                }
                if (i >= this.f8922b) {
                    return 0;
                }
                int i6 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i6 <= 0 || this.f8927k.b(i6) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i6);
                this.f8927k.c(i6, aVar);
                if (i6 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i7 = i5 + 1;
                aVar.start();
                return i7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = m4.c.f8919n
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof m4.a
            r3 = 0
            if (r1 == 0) goto L18
            m4.a r0 = (m4.a) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            m4.c r1 = r0.f8910l
            boolean r1 = kotlin.jvm.internal.i.a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            k4.q r1 = r8.f8927k
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = m4.c.f8918m     // Catch: java.lang.Throwable -> Lc4
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc4
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L79
            r1 = r2
        L37:
            k4.q r5 = r8.f8927k
            java.lang.Object r5 = r5.b(r1)
            kotlin.jvm.internal.i.b(r5)
            m4.a r5 = (m4.a) r5
            if (r5 == r0) goto L74
        L44:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L55
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L55:
            m4.m r5 = r5.f8903a
            m4.f r6 = r8.f8926f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = m4.m.f8943b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            m4.i r7 = (m4.i) r7
            if (r7 == 0) goto L69
            r6.a(r7)
        L69:
            m4.i r7 = r5.b()
            if (r7 != 0) goto L70
            goto L74
        L70:
            r6.a(r7)
            goto L69
        L74:
            if (r1 == r4) goto L79
            int r1 = r1 + 1
            goto L37
        L79:
            m4.f r1 = r8.f8926f
            r1.b()
            m4.f r1 = r8.f8925e
            r1.b()
        L83:
            if (r0 == 0) goto L8b
            m4.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb3
        L8b:
            m4.f r1 = r8.f8925e
            java.lang.Object r1 = r1.d()
            m4.i r1 = (m4.i) r1
            if (r1 != 0) goto Lb3
            m4.f r1 = r8.f8926f
            java.lang.Object r1 = r1.d()
            m4.i r1 = (m4.i) r1
            if (r1 != 0) goto Lb3
            if (r0 == 0) goto La6
            m4.b r1 = m4.b.f8915e
            r0.h(r1)
        La6:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = m4.c.f8917l
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = m4.c.f8918m
            r0.set(r8, r1)
        Lb2:
            return
        Lb3:
            r1.run()     // Catch: java.lang.Throwable -> Lb7
            goto L83
        Lb7:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L83
        Lc4:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.c.close():void");
    }

    public final void e(Runnable runnable, boolean z4, boolean z5) {
        i jVar;
        b bVar;
        k.f8941f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f8933a = jNanoTime;
            jVar.f8934b = z4;
        } else {
            jVar = new j(runnable, jNanoTime, z4);
        }
        boolean z6 = jVar.f8934b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8918m;
        long jAddAndGet = z6 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !kotlin.jvm.internal.i.a(aVar.f8910l, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f8905c) != b.f8915e && (jVar.f8934b || bVar != b.f8912b)) {
            aVar.f8909k = true;
            m mVar = aVar.f8903a;
            if (z5) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f8943b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f8934b ? this.f8926f.a(jVar) : this.f8925e.a(jVar))) {
                throw new RejectedExecutionException(B.a.m(new StringBuilder(), this.f8924d, " was terminated"));
            }
        }
        boolean z7 = z5 && aVar != null;
        if (z6) {
            if (z7 || n() || m(jAddAndGet)) {
                return;
            }
            n();
            return;
        }
        if (z7 || n() || m(atomicLongFieldUpdater.get(this))) {
            return;
        }
        n();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        k(this, runnable, false, 6);
    }

    public final void l(a aVar, int i, int i5) {
        while (true) {
            long j5 = f8917l.get(this);
            int i6 = (int) (2097151 & j5);
            long j6 = (2097152 + j5) & (-2097152);
            if (i6 == i) {
                if (i5 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f8920o) {
                            i6 = -1;
                            break;
                        }
                        if (objC == null) {
                            i6 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i6 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i6 = i5;
                }
            }
            if (i6 >= 0) {
                if (f8917l.compareAndSet(this, j5, i6 | j6)) {
                    return;
                }
            }
        }
    }

    public final boolean m(long j5) {
        int i = ((int) (2097151 & j5)) - ((int) ((j5 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i5 = this.f8921a;
        if (i < i5) {
            int iA = a();
            if (iA == 1 && i5 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        h1.i iVar;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8917l;
            long j5 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f8927k.b((int) (2097151 & j5));
            if (aVar == null) {
                aVar = null;
            } else {
                long j6 = (2097152 + j5) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    iVar = f8920o;
                    if (objC == iVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j5, j6 | iB)) {
                    aVar.g(iVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f8902m.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.f8927k;
        int iA = qVar.a();
        int i = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < iA; i9++) {
            a aVar = (a) qVar.b(i9);
            if (aVar != null) {
                m mVar = aVar.f8903a;
                mVar.getClass();
                int i10 = m.f8943b.get(mVar) != null ? (m.f8944c.get(mVar) - m.f8945d.get(mVar)) + 1 : m.f8944c.get(mVar) - m.f8945d.get(mVar);
                int iOrdinal = aVar.f8905c.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i10);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i5++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i6++;
                } else if (iOrdinal == 3) {
                    i7++;
                    if (i10 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i10);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new B0.c();
                    }
                    i8++;
                }
            }
        }
        long j5 = f8918m.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f8924d);
        sb4.append('@');
        sb4.append(E.m(this));
        sb4.append("[Pool Size {core = ");
        int i11 = this.f8921a;
        sb4.append(i11);
        sb4.append(", max = ");
        sb4.append(this.f8922b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i5);
        sb4.append(", parked = ");
        sb4.append(i6);
        sb4.append(", dormant = ");
        sb4.append(i7);
        sb4.append(", terminated = ");
        sb4.append(i8);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f8925e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f8926f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j5));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j5) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i11 - ((int) ((j5 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
