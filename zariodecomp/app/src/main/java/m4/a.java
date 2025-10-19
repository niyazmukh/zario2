package m4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.r;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m4\a.smali */
public final class a extends Thread {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8902m = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final m f8903a;

    /* renamed from: b, reason: collision with root package name */
    public final r f8904b;

    /* renamed from: c, reason: collision with root package name */
    public b f8905c;

    /* renamed from: d, reason: collision with root package name */
    public long f8906d;

    /* renamed from: e, reason: collision with root package name */
    public long f8907e;

    /* renamed from: f, reason: collision with root package name */
    public int f8908f;
    private volatile int indexInArray;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8909k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f8910l;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i) {
        this.f8910l = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f8903a = new m();
        this.f8904b = new r();
        this.f8905c = b.f8914d;
        this.nextParkedWorker = c.f8920o;
        int iNanoTime = (int) System.nanoTime();
        this.f8908f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r13 = m4.m.f8945d.get(r3);
        r0 = m4.m.f8944c.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r13 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (m4.m.f8946e.get(r3) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r0 = r0 - 1;
        r1 = r3.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r1 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m4.i a(boolean r13) {
        /*
            r12 = this;
            m4.b r0 = r12.f8905c
            m4.b r1 = m4.b.f8911a
            r2 = 0
            m4.m r3 = r12.f8903a
            r4 = 1
            m4.c r5 = r12.f8910l
            if (r0 != r1) goto Le
            goto L88
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = m4.c.f8918m
        L10:
            m4.c r7 = r12.f8910l
            long r8 = r0.get(r7)
            r10 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r10 = r10 & r8
            r1 = 42
            long r10 = r10 >> r1
            int r1 = (int) r10
            if (r1 != 0) goto L75
            r3.getClass()
        L25:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = m4.m.f8943b
            java.lang.Object r0 = r13.get(r3)
            m4.i r0 = (m4.i) r0
            if (r0 != 0) goto L30
            goto L43
        L30:
            boolean r1 = r0.f8934b
            if (r1 != r4) goto L43
        L34:
            boolean r1 = r13.compareAndSet(r3, r0, r2)
            if (r1 == 0) goto L3c
            r2 = r0
            goto L63
        L3c:
            java.lang.Object r1 = r13.get(r3)
            if (r1 == r0) goto L34
            goto L25
        L43:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = m4.m.f8945d
            int r13 = r13.get(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = m4.m.f8944c
            int r0 = r0.get(r3)
        L4f:
            if (r13 == r0) goto L63
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = m4.m.f8946e
            int r1 = r1.get(r3)
            if (r1 != 0) goto L5a
            goto L63
        L5a:
            int r0 = r0 + (-1)
            m4.i r1 = r3.c(r0, r4)
            if (r1 == 0) goto L4f
            r2 = r1
        L63:
            if (r2 != 0) goto L74
            m4.f r13 = r5.f8926f
            java.lang.Object r13 = r13.d()
            r2 = r13
            m4.i r2 = (m4.i) r2
            if (r2 != 0) goto L74
            m4.i r2 = r12.i(r4)
        L74:
            return r2
        L75:
            r10 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r10 = r8 - r10
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = m4.c.f8918m
            boolean r1 = r6.compareAndSet(r7, r8, r10)
            if (r1 == 0) goto L10
            m4.b r0 = m4.b.f8911a
            r12.f8905c = r0
        L88:
            if (r13 == 0) goto Lbc
            int r13 = r5.f8921a
            int r13 = r13 * 2
            int r13 = r12.d(r13)
            if (r13 != 0) goto L95
            goto L96
        L95:
            r4 = 0
        L96:
            if (r4 == 0) goto L9f
            m4.i r13 = r12.e()
            if (r13 == 0) goto L9f
            goto Lc8
        L9f:
            r3.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = m4.m.f8943b
            java.lang.Object r13 = r13.getAndSet(r3, r2)
            m4.i r13 = (m4.i) r13
            if (r13 != 0) goto Lb0
            m4.i r13 = r3.b()
        Lb0:
            if (r13 == 0) goto Lb3
            goto Lc8
        Lb3:
            if (r4 != 0) goto Lc3
            m4.i r13 = r12.e()
            if (r13 == 0) goto Lc3
            goto Lc8
        Lbc:
            m4.i r13 = r12.e()
            if (r13 == 0) goto Lc3
            goto Lc8
        Lc3:
            r13 = 3
            m4.i r13 = r12.i(r13)
        Lc8:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.a.a(boolean):m4.i");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i5 = this.f8908f;
        int i6 = i5 ^ (i5 << 13);
        int i7 = i6 ^ (i6 >> 17);
        int i8 = i7 ^ (i7 << 5);
        this.f8908f = i8;
        int i9 = i - 1;
        return (i9 & i) == 0 ? i9 & i8 : (Integer.MAX_VALUE & i8) % i;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.f8910l;
        if (iD == 0) {
            i iVar = (i) cVar.f8925e.d();
            return iVar != null ? iVar : (i) cVar.f8926f.d();
        }
        i iVar2 = (i) cVar.f8926f.d();
        return iVar2 != null ? iVar2 : (i) cVar.f8925e.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8910l.f8924d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f8905c;
        boolean z4 = bVar2 == b.f8911a;
        if (z4) {
            c.f8918m.addAndGet(this.f8910l, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f8905c = bVar;
        }
        return z4;
    }

    public final i i(int i) {
        i iVarC;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f8918m;
        c cVar = this.f8910l;
        int i5 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        if (i5 < 2) {
            return null;
        }
        int iD = d(i5);
        long jMin = Long.MAX_VALUE;
        for (int i6 = 0; i6 < i5; i6++) {
            iD++;
            if (iD > i5) {
                iD = 1;
            }
            a aVar = (a) cVar.f8927k.b(iD);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f8903a;
                if (i == 3) {
                    iVarC = mVar.b();
                } else {
                    mVar.getClass();
                    int i7 = m.f8945d.get(mVar);
                    int i8 = m.f8944c.get(mVar);
                    boolean z4 = i == 1;
                    while (i7 != i8 && (!z4 || m.f8946e.get(mVar) != 0)) {
                        int i9 = i7 + 1;
                        iVarC = mVar.c(i7, z4);
                        if (iVarC != null) {
                            break;
                        }
                        i7 = i9;
                    }
                    iVarC = null;
                }
                r rVar = this.f8904b;
                if (iVarC != null) {
                    rVar.f8431a = iVarC;
                    j6 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f8943b;
                        i iVar = (i) atomicReferenceFieldUpdater.get(mVar);
                        j5 = -2;
                        if (iVar == null) {
                            break;
                        }
                        if (((iVar.f8934b ? 1 : 2) & i) != 0) {
                            k.f8941f.getClass();
                            long jNanoTime = System.nanoTime() - iVar.f8933a;
                            long j7 = k.f8937b;
                            if (jNanoTime >= j7) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar, null)) {
                                    if (atomicReferenceFieldUpdater.get(mVar) != iVar) {
                                        break;
                                    }
                                }
                                rVar.f8431a = iVar;
                                j5 = -1;
                                break;
                            }
                            j5 = j7 - jNanoTime;
                            break;
                        }
                        break;
                    }
                    j6 = j5;
                }
                if (j6 == -1) {
                    i iVar2 = (i) rVar.f8431a;
                    rVar.f8431a = null;
                    return iVar2;
                }
                if (j6 > 0) {
                    jMin = Math.min(jMin, j6);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f8907e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        boolean z4;
        boolean z5 = false;
        loop0: while (true) {
            boolean z6 = z5;
            while (true) {
                c cVar = this.f8910l;
                cVar.getClass();
                if (c.f8919n.get(cVar) == 0) {
                    b bVar = this.f8905c;
                    b bVar2 = b.f8915e;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i iVarA = a(this.f8909k);
                    long j5 = -2097152;
                    if (iVarA != null) {
                        this.f8907e = 0L;
                        this.f8906d = 0L;
                        if (this.f8905c == b.f8913c) {
                            this.f8905c = b.f8912b;
                        }
                        boolean z7 = iVarA.f8934b;
                        c cVar2 = this.f8910l;
                        if (z7) {
                            if (h(b.f8912b) && !cVar2.n() && !cVar2.m(c.f8918m.get(cVar2))) {
                                cVar2.n();
                            }
                            cVar2.getClass();
                            try {
                                iVarA.run();
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            }
                            c.f8918m.addAndGet(cVar2, -2097152L);
                            if (this.f8905c != bVar2) {
                                this.f8905c = b.f8914d;
                            }
                        } else {
                            cVar2.getClass();
                            try {
                                iVarA.run();
                            } catch (Throwable th2) {
                                Thread threadCurrentThread2 = Thread.currentThread();
                                threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                            }
                        }
                    } else {
                        this.f8909k = z5;
                        if (this.f8907e == 0) {
                            Object obj = this.nextParkedWorker;
                            h1.i iVar = c.f8920o;
                            if (obj != iVar ? true : z5) {
                                f8902m.set(this, -1);
                                while (this.nextParkedWorker != c.f8920o) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f8902m;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    c cVar3 = this.f8910l;
                                    cVar3.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = c.f8919n;
                                    if (atomicIntegerFieldUpdater3.get(cVar3) != 0) {
                                        break;
                                    }
                                    b bVar3 = this.f8905c;
                                    b bVar4 = b.f8915e;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f8913c);
                                    Thread.interrupted();
                                    if (this.f8906d == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.f8906d = System.nanoTime() + this.f8910l.f8923c;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.f8910l.f8923c);
                                    if (System.nanoTime() - this.f8906d >= 0) {
                                        this.f8906d = 0L;
                                        c cVar4 = this.f8910l;
                                        synchronized (cVar4.f8927k) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater3.get(cVar4) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.f8918m;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar4) & 2097151)) > cVar4.f8921a && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        z4 = false;
                                                        f(0);
                                                        cVar4.l(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar4) & 2097151);
                                                        if (andDecrement != i) {
                                                            Object objB = cVar4.f8927k.b(andDecrement);
                                                            kotlin.jvm.internal.i.b(objB);
                                                            a aVar = (a) objB;
                                                            cVar4.f8927k.c(i, aVar);
                                                            aVar.f(i);
                                                            cVar4.l(aVar, andDecrement, i);
                                                        }
                                                        cVar4.f8927k.c(andDecrement, null);
                                                        this.f8905c = bVar4;
                                                    }
                                                }
                                                z4 = false;
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    } else {
                                        z4 = false;
                                    }
                                    z5 = z4;
                                }
                            } else {
                                c cVar5 = this.f8910l;
                                cVar5.getClass();
                                if (this.nextParkedWorker == iVar) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f8917l;
                                        long j6 = atomicLongFieldUpdater2.get(cVar5);
                                        int i5 = this.indexInArray;
                                        this.nextParkedWorker = cVar5.f8927k.b((int) (j6 & 2097151));
                                        if (atomicLongFieldUpdater2.compareAndSet(cVar5, j6, ((2097152 + j6) & j5) | i5)) {
                                            break;
                                        } else {
                                            j5 = -2097152;
                                        }
                                    }
                                }
                            }
                            z5 = z5;
                        } else {
                            if (z6) {
                                h(b.f8913c);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f8907e);
                                this.f8907e = 0L;
                                break;
                            }
                            z6 = true;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f8915e);
    }
}
