package h4;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import f4.C0516n;
import f4.I0;
import f4.InterfaceC0514l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h4\g.smali */
public class g implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7783c = AtomicLongFieldUpdater.newUpdater(g.class, "sendersAndCloseStatus$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7784d = AtomicLongFieldUpdater.newUpdater(g.class, "receivers$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7785e = AtomicLongFieldUpdater.newUpdater(g.class, "bufferEnd$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7786f = AtomicLongFieldUpdater.newUpdater(g.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7787k = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "sendSegment$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7788l = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "receiveSegment$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7789m = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7790n = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_closeCause$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7791o = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f7792a;

    /* renamed from: b, reason: collision with root package name */
    public final X3.l f7793b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public g(int i, X3.l lVar) {
        this.f7792a = i;
        this.f7793b = lVar;
        if (i < 0) {
            throw new IllegalArgumentException(B.a.i("Invalid channel capacity: ", i, ", should be >=0").toString());
        }
        o oVar = i.f7795a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f7785e.get(this);
        o oVar2 = new o(0L, null, this, 3);
        this.sendSegment$volatile = oVar2;
        this.receiveSegment$volatile = oVar2;
        if (y()) {
            oVar2 = i.f7795a;
            kotlin.jvm.internal.i.c(oVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = oVar2;
        this._closeCause$volatile = i.f7811s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object B(h4.g r13, Q3.c r14) {
        /*
            boolean r0 = r14 instanceof h4.e
            if (r0 == 0) goto L14
            r0 = r14
            h4.e r0 = (h4.e) r0
            int r1 = r0.f7779c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f7779c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            h4.e r0 = new h4.e
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f7777a
            P3.a r0 = P3.a.f2678a
            int r1 = r6.f7779c
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            a.AbstractC0183a.m0(r14)
            h4.n r14 = (h4.n) r14
            java.lang.Object r13 = r14.f7817a
            goto L99
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            a.AbstractC0183a.m0(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = h4.g.f7788l
            java.lang.Object r14 = r14.get(r13)
            h4.o r14 = (h4.o) r14
        L41:
            boolean r1 = r13.v()
            if (r1 == 0) goto L51
            java.lang.Throwable r13 = r13.p()
            h4.l r14 = new h4.l
            r14.<init>(r13)
            goto L9f
        L51:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = h4.g.f7784d
            long r4 = r1.getAndIncrement(r13)
            int r1 = h4.i.f7796b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.f8408c
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6d
            h4.o r1 = r13.o(r9, r14)
            if (r1 != 0) goto L6c
            goto L41
        L6c:
            r14 = r1
        L6d:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = r7.G(r8, r9, r10, r12)
            h1.i r7 = h4.i.f7805m
            if (r1 == r7) goto La0
            h1.i r7 = h4.i.f7807o
            if (r1 != r7) goto L8a
            long r7 = r13.s()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L41
            r14.b()
            goto L41
        L8a:
            h1.i r7 = h4.i.f7806n
            if (r1 != r7) goto L9b
            r6.f7779c = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.C(r2, r3, r4, r6)
            if (r13 != r0) goto L99
            return r0
        L99:
            r14 = r13
            goto L9f
        L9b:
            r14.b()
            r14 = r1
        L9f:
            return r14
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.g.B(h4.g, Q3.c):java.lang.Object");
    }

    public static boolean F(Object obj) {
        if (obj instanceof InterfaceC0514l) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return i.a((InterfaceC0514l) obj, K3.k.f2288a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final o a(g gVar, long j5, o oVar) {
        Object objD;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        long j7;
        gVar.getClass();
        o oVar2 = i.f7795a;
        h hVar = h.f7794a;
        loop0: while (true) {
            objD = k4.a.d(oVar, j5, hVar);
            if (!k4.a.g(objD)) {
                k4.s sVarE = k4.a.e(objD);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7787k;
                    k4.s sVar = (k4.s) atomicReferenceFieldUpdater.get(gVar);
                    if (sVar.f8408c >= sVarE.f8408c) {
                        break loop0;
                    }
                    if (!sVarE.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, sVar, sVarE)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != sVar) {
                            if (sVarE.f()) {
                                sVarE.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zG = k4.a.g(objD);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7784d;
        if (zG) {
            gVar.w();
            if (oVar.f8408c * i.f7796b >= atomicLongFieldUpdater2.get(gVar)) {
                return null;
            }
            oVar.b();
            return null;
        }
        o oVar3 = (o) k4.a.e(objD);
        long j8 = oVar3.f8408c;
        if (j8 <= j5) {
            return oVar3;
        }
        long j9 = i.f7796b * j8;
        do {
            atomicLongFieldUpdater = f7783c;
            j6 = atomicLongFieldUpdater.get(gVar);
            j7 = 1152921504606846975L & j6;
            if (j7 >= j9) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(gVar, j6, j7 + (((int) (j6 >> 60)) << 60)));
        if (j8 * i.f7796b >= atomicLongFieldUpdater2.get(gVar)) {
            return null;
        }
        oVar3.b();
        return null;
    }

    public static final void e(g gVar, Object obj, C0516n c0516n) {
        X3.l lVar = gVar.f7793b;
        if (lVar != null) {
            k4.a.a(lVar, obj, c0516n.f7082e);
        }
        c0516n.resumeWith(AbstractC0183a.v(gVar.r()));
    }

    public static final int f(g gVar, o oVar, int i, Object obj, long j5, Object obj2, boolean z4) {
        gVar.getClass();
        oVar.n(i, obj);
        if (z4) {
            return gVar.H(oVar, i, obj, j5, obj2, z4);
        }
        Object objL = oVar.l(i);
        if (objL == null) {
            if (gVar.j(j5)) {
                if (oVar.k(i, null, i.f7798d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (oVar.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof I0) {
            oVar.n(i, null);
            if (gVar.E(objL, obj)) {
                oVar.o(i, i.i);
                return 0;
            }
            h1.i iVar = i.f7803k;
            if (oVar.f7819f.getAndSet((i * 2) + 1, iVar) != iVar) {
                oVar.m(i, true);
            }
            return 5;
        }
        return gVar.H(oVar, i, obj, j5, obj2, z4);
    }

    public static void t(g gVar) {
        gVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7786f;
        if ((atomicLongFieldUpdater.addAndGet(gVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(gVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object A(O3.d dVar, Object obj) {
        B0.c cVarB;
        C0516n c0516n = new C0516n(1, p1.b.x(dVar));
        c0516n.s();
        X3.l lVar = this.f7793b;
        if (lVar == null || (cVarB = k4.a.b(lVar, obj, null)) == null) {
            c0516n.resumeWith(AbstractC0183a.v(r()));
        } else {
            AbstractC0156x.c(cVarB, r());
            c0516n.resumeWith(AbstractC0183a.v(cVarB));
        }
        Object objR = c0516n.r();
        return objR == P3.a.f2678a ? objR : K3.k.f2288a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C(h4.o r11, int r12, long r13, Q3.c r15) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.g.C(h4.o, int, long, Q3.c):java.lang.Object");
    }

    public final void D(I0 i02, boolean z4) {
        if (i02 instanceof InterfaceC0514l) {
            ((O3.d) i02).resumeWith(AbstractC0183a.v(z4 ? q() : r()));
            return;
        }
        if (i02 instanceof w) {
            ((w) i02).f7826a.resumeWith(new n(new l(p())));
            return;
        }
        if (!(i02 instanceof c)) {
            throw new IllegalStateException(("Unexpected waiter: " + i02).toString());
        }
        c cVar = (c) i02;
        C0516n c0516n = cVar.f7774b;
        kotlin.jvm.internal.i.b(c0516n);
        cVar.f7774b = null;
        cVar.f7773a = i.f7804l;
        Throwable thP = cVar.f7775c.p();
        if (thP == null) {
            c0516n.resumeWith(Boolean.FALSE);
        } else {
            c0516n.resumeWith(AbstractC0183a.v(thP));
        }
    }

    public final boolean E(Object obj, Object obj2) {
        boolean z4 = obj instanceof w;
        X3.l lVar = this.f7793b;
        if (z4) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return i.a(((w) obj).f7826a, new n(obj2), lVar != null ? i() : null);
        }
        if (!(obj instanceof c)) {
            if (obj instanceof InterfaceC0514l) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return i.a((InterfaceC0514l) obj, obj2, lVar != null ? h() : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        c cVar = (c) obj;
        C0516n c0516n = cVar.f7774b;
        kotlin.jvm.internal.i.b(c0516n);
        cVar.f7774b = null;
        cVar.f7773a = obj2;
        Boolean bool = Boolean.TRUE;
        X3.l lVar2 = cVar.f7775c.f7793b;
        return i.a(c0516n, bool, lVar2 != null ? new b(0, lVar2, obj2) : null);
    }

    public final Object G(o oVar, int i, long j5, Object obj) {
        Object objL = oVar.l(i);
        AtomicReferenceArray atomicReferenceArray = oVar.f7819f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7783c;
        if (objL == null) {
            if (j5 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return i.f7806n;
                }
                if (oVar.k(i, objL, obj)) {
                    n();
                    return i.f7805m;
                }
            }
        } else if (objL == i.f7798d && oVar.k(i, objL, i.i)) {
            n();
            Object obj2 = atomicReferenceArray.get(i * 2);
            oVar.n(i, null);
            return obj2;
        }
        while (true) {
            Object objL2 = oVar.l(i);
            if (objL2 == null || objL2 == i.f7799e) {
                if (j5 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (oVar.k(i, objL2, i.h)) {
                        n();
                        return i.f7807o;
                    }
                } else {
                    if (obj == null) {
                        return i.f7806n;
                    }
                    if (oVar.k(i, objL2, obj)) {
                        n();
                        return i.f7805m;
                    }
                }
            } else {
                if (objL2 != i.f7798d) {
                    h1.i iVar = i.f7802j;
                    if (objL2 != iVar && objL2 != i.h) {
                        if (objL2 == i.f7804l) {
                            n();
                            return i.f7807o;
                        }
                        if (objL2 != i.f7801g && oVar.k(i, objL2, i.f7800f)) {
                            boolean z4 = objL2 instanceof z;
                            if (z4) {
                                objL2 = ((z) objL2).f7827a;
                            }
                            if (F(objL2)) {
                                oVar.o(i, i.i);
                                n();
                                Object obj3 = atomicReferenceArray.get(i * 2);
                                oVar.n(i, null);
                                return obj3;
                            }
                            oVar.o(i, iVar);
                            oVar.i();
                            if (z4) {
                                n();
                            }
                            return i.f7807o;
                        }
                    }
                    return i.f7807o;
                }
                if (oVar.k(i, objL2, i.i)) {
                    n();
                    Object obj4 = atomicReferenceArray.get(i * 2);
                    oVar.n(i, null);
                    return obj4;
                }
            }
        }
    }

    public final int H(o oVar, int i, Object obj, long j5, Object obj2, boolean z4) {
        while (true) {
            Object objL = oVar.l(i);
            if (objL == null) {
                if (!j(j5) || z4) {
                    if (z4) {
                        if (oVar.k(i, null, i.f7802j)) {
                            oVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (oVar.k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (oVar.k(i, null, i.f7798d)) {
                    return 1;
                }
            } else {
                if (objL != i.f7799e) {
                    h1.i iVar = i.f7803k;
                    if (objL == iVar) {
                        oVar.n(i, null);
                        return 5;
                    }
                    if (objL == i.h) {
                        oVar.n(i, null);
                        return 5;
                    }
                    if (objL == i.f7804l) {
                        oVar.n(i, null);
                        w();
                        return 4;
                    }
                    oVar.n(i, null);
                    if (objL instanceof z) {
                        objL = ((z) objL).f7827a;
                    }
                    if (E(objL, obj)) {
                        oVar.o(i, i.i);
                        return 0;
                    }
                    if (oVar.f7819f.getAndSet((i * 2) + 1, iVar) == iVar) {
                        return 5;
                    }
                    oVar.m(i, true);
                    return 5;
                }
                if (oVar.k(i, objL, i.f7798d)) {
                    return 1;
                }
            }
        }
    }

    public final void I(long j5) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        long j7;
        if (y()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f7785e;
        } while (atomicLongFieldUpdater.get(this) <= j5);
        int i = i.f7797c;
        int i5 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7786f;
            if (i5 >= i) {
                do {
                    j6 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j6, 4611686018427387904L + (j6 & 4611686018427387903L)));
                while (true) {
                    long j8 = atomicLongFieldUpdater.get(this);
                    long j9 = atomicLongFieldUpdater2.get(this);
                    long j10 = j9 & 4611686018427387903L;
                    boolean z4 = (j9 & 4611686018427387904L) != 0;
                    if (j8 == j10 && j8 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z4) {
                        atomicLongFieldUpdater2.compareAndSet(this, j9, j10 + 4611686018427387904L);
                    }
                }
                do {
                    j7 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j7, j7 & 4611686018427387903L));
                return;
            }
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j11 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i5++;
            }
        }
    }

    @Override // h4.x
    public final Object b() {
        o oVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7784d;
        long j5 = atomicLongFieldUpdater.get(this);
        long j6 = f7783c.get(this);
        if (u(j6, true)) {
            return new l(p());
        }
        long j7 = j6 & 1152921504606846975L;
        Object obj = n.f7816b;
        if (j5 >= j7) {
            return obj;
        }
        Object obj2 = i.f7803k;
        o oVar2 = (o) f7788l.get(this);
        while (!v()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j8 = i.f7796b;
            long j9 = andIncrement / j8;
            int i = (int) (andIncrement % j8);
            if (oVar2.f8408c != j9) {
                o oVarO = o(j9, oVar2);
                if (oVarO == null) {
                    continue;
                } else {
                    oVar = oVarO;
                }
            } else {
                oVar = oVar2;
            }
            Object objG = G(oVar, i, andIncrement, obj2);
            if (objG == i.f7805m) {
                I0 i02 = obj2 instanceof I0 ? (I0) obj2 : null;
                if (i02 != null) {
                    i02.b(oVar, i);
                }
                I(andIncrement);
                oVar.i();
            } else if (objG == i.f7807o) {
                if (andIncrement < s()) {
                    oVar.b();
                }
                oVar2 = oVar;
            } else {
                if (objG == i.f7806n) {
                    throw new IllegalStateException("unexpected");
                }
                oVar.b();
                obj = objG;
            }
            return obj;
        }
        return new l(p());
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return r1;
     */
    @Override // h4.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.g.c(java.lang.Object):java.lang.Object");
    }

    @Override // h4.x
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        k(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01bc, code lost:
    
        r1.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bf, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        e(r26, r28, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0142, code lost:
    
        if (r23 >= r5.get(r26)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0144, code lost:
    
        r21.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0147, code lost:
    
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0149, code lost:
    
        e(r26, r28, r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    @Override // h4.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(O3.d r27, java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.g.d(O3.d, java.lang.Object):java.lang.Object");
    }

    @Override // h4.x
    public final Object g(j4.s sVar) {
        return B(this, sVar);
    }

    public final d h() {
        return new d(3, this, g.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0);
    }

    public final d i() {
        return new d(3, this, g.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1);
    }

    @Override // h4.x
    public final c iterator() {
        return new c(this);
    }

    public final boolean j(long j5) {
        return j5 < f7785e.get(this) || j5 < f7784d.get(this) + ((long) this.f7792a);
    }

    public final boolean k(Throwable th, boolean z4) {
        boolean z5;
        long j5;
        long j6;
        long j7;
        Object obj;
        long j8;
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7783c;
        if (z4) {
            do {
                j9 = atomicLongFieldUpdater.get(this);
                if (((int) (j9 >> 60)) != 0) {
                    break;
                }
                o oVar = i.f7795a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j9, (1 << 60) + (j9 & 1152921504606846975L)));
        }
        h1.i iVar = i.f7811s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7790n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, iVar, th)) {
                z5 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != iVar) {
                z5 = false;
                break;
            }
        }
        if (z4) {
            do {
                j8 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j8, (3 << 60) + (j8 & 1152921504606846975L)));
        } else {
            do {
                j5 = atomicLongFieldUpdater.get(this);
                int i = (int) (j5 >> 60);
                if (i == 0) {
                    j6 = j5 & 1152921504606846975L;
                    j7 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j6 = j5 & 1152921504606846975L;
                    j7 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j5, (j7 << 60) + j6));
        }
        w();
        if (z5) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7791o;
                obj = atomicReferenceFieldUpdater2.get(this);
                h1.i iVar2 = obj == null ? i.f7809q : i.f7810r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, iVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                kotlin.jvm.internal.u.c(1, obj);
                ((X3.l) obj).invoke(p());
            }
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r1 = (h4.o) ((k4.b) k4.b.f8373b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h4.o l(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.g.l(long):h4.o");
    }

    public final void m(long j5) {
        B0.c cVarB;
        o oVar = (o) f7788l.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7784d;
            long j6 = atomicLongFieldUpdater.get(this);
            if (j5 < Math.max(this.f7792a + j6, f7785e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j6, j6 + 1)) {
                long j7 = i.f7796b;
                long j8 = j6 / j7;
                int i = (int) (j6 % j7);
                if (oVar.f8408c != j8) {
                    o oVarO = o(j8, oVar);
                    if (oVarO == null) {
                        continue;
                    } else {
                        oVar = oVarO;
                    }
                }
                Object objG = G(oVar, i, j6, null);
                if (objG != i.f7807o) {
                    oVar.b();
                    X3.l lVar = this.f7793b;
                    if (lVar != null && (cVarB = k4.a.b(lVar, objG, null)) != null) {
                        throw cVarB;
                    }
                } else if (j6 < s()) {
                    oVar.b();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0195, code lost:
    
        t(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0198, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.g.n():void");
    }

    public final o o(long j5, o oVar) {
        Object objD;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        o oVar2 = i.f7795a;
        h hVar = h.f7794a;
        loop0: while (true) {
            objD = k4.a.d(oVar, j5, hVar);
            if (!k4.a.g(objD)) {
                k4.s sVarE = k4.a.e(objD);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7788l;
                    k4.s sVar = (k4.s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f8408c >= sVarE.f8408c) {
                        break loop0;
                    }
                    if (!sVarE.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarE)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (sVarE.f()) {
                                sVarE.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (k4.a.g(objD)) {
            w();
            if (oVar.f8408c * i.f7796b >= s()) {
                return null;
            }
            oVar.b();
            return null;
        }
        o oVar3 = (o) k4.a.e(objD);
        boolean zY = y();
        long j7 = oVar3.f8408c;
        if (!zY && j5 <= f7785e.get(this) / i.f7796b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7789m;
                k4.s sVar2 = (k4.s) atomicReferenceFieldUpdater2.get(this);
                if (sVar2.f8408c >= j7 || !oVar3.j()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, oVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != sVar2) {
                        if (oVar3.f()) {
                            oVar3.e();
                        }
                    }
                }
                if (sVar2.f()) {
                    sVar2.e();
                }
            }
        }
        if (j7 <= j5) {
            return oVar3;
        }
        long j8 = i.f7796b * j7;
        do {
            atomicLongFieldUpdater = f7784d;
            j6 = atomicLongFieldUpdater.get(this);
            if (j6 >= j8) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, j8));
        if (j7 * i.f7796b >= s()) {
            return null;
        }
        oVar3.b();
        return null;
    }

    public final Throwable p() {
        return (Throwable) f7790n.get(this);
    }

    public final Throwable q() {
        Throwable thP = p();
        return thP == null ? new p("Channel was closed") : thP;
    }

    public final Throwable r() {
        Throwable thP = p();
        return thP == null ? new q("Channel was closed") : thP;
    }

    public final long s() {
        return f7783c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0194, code lost:
    
        r3 = (h4.o) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019b, code lost:
    
        if (r3 != null) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.g.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c6, code lost:
    
        r0 = (h4.o) ((k4.b) k4.b.f8373b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.g.u(long, boolean):boolean");
    }

    public final boolean v() {
        return u(f7783c.get(this), true);
    }

    public final boolean w() {
        return u(f7783c.get(this), false);
    }

    public boolean x() {
        return false;
    }

    public final boolean y() {
        long j5 = f7785e.get(this);
        return j5 == 0 || j5 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(long r5, h4.o r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f8408c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            k4.b r0 = r7.c()
            h4.o r0 = (h4.o) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            k4.b r5 = r7.c()
            h4.o r5 = (h4.o) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = h4.g.f7789m
            java.lang.Object r6 = r5.get(r4)
            k4.s r6 = (k4.s) r6
            long r0 = r6.f8408c
            long r2 = r7.f8408c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r4 = r6.f()
            if (r4 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.g.z(long, h4.o):void");
    }
}
