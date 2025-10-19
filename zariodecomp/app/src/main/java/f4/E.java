package f4;

import L3.s;
import N2.AbstractC0156x;
import S0.f;
import a.AbstractC0183a;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k4.r;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\E.smali */
public abstract class E {

    /* renamed from: b, reason: collision with root package name */
    public static final h1.i f7009b;

    /* renamed from: c, reason: collision with root package name */
    public static final h1.i f7010c;

    /* renamed from: d, reason: collision with root package name */
    public static final h1.i f7011d;

    /* renamed from: e, reason: collision with root package name */
    public static final h1.i f7012e;

    /* renamed from: f, reason: collision with root package name */
    public static final h1.i f7013f;

    /* renamed from: g, reason: collision with root package name */
    public static final h1.i f7014g;
    public static final h1.i h;

    /* renamed from: a, reason: collision with root package name */
    public static final h1.i f7008a = new h1.i("RESUME_TOKEN", 18);
    public static final S i = new S(false);

    /* renamed from: j, reason: collision with root package name */
    public static final S f7015j = new S(true);

    static {
        int i5 = 18;
        f7009b = new h1.i("REMOVED_TASK", i5);
        f7010c = new h1.i("CLOSED_EMPTY", i5);
        int i6 = 18;
        f7011d = new h1.i("COMPLETING_ALREADY", i6);
        f7012e = new h1.i("COMPLETING_WAITING_CHILDREN", i6);
        f7013f = new h1.i("COMPLETING_RETRY", i6);
        f7014g = new h1.i("TOO_LATE_TO_CANCEL", i6);
        h = new h1.i("SEALED", i6);
    }

    public static final G0 A(O3.d dVar, O3.i iVar, Object obj) {
        G0 g02 = null;
        if (!(dVar instanceof Q3.d)) {
            return null;
        }
        if (iVar.get(H0.f7022a) != null) {
            Q3.d callerFrame = (Q3.d) dVar;
            while (true) {
                if ((callerFrame instanceof K) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof G0) {
                    g02 = (G0) callerFrame;
                    break;
                }
            }
            if (g02 != null) {
                g02.V(iVar, obj);
            }
        }
        return g02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object B(O3.i iVar, X3.p pVar, O3.d dVar) throws Throwable {
        Object objZ;
        O3.i context = dVar.getContext();
        O3.i iVarPlus = !((Boolean) iVar.fold(Boolean.FALSE, new C0525y(0))).booleanValue() ? context.plus(iVar) : j(context, iVar, false);
        i(iVarPlus);
        if (iVarPlus == context) {
            r rVar = new r(dVar, iVarPlus);
            objZ = f.c0(rVar, rVar, pVar);
        } else {
            O3.e eVar = O3.e.f2660a;
            if (kotlin.jvm.internal.i.a(iVarPlus.get(eVar), context.get(eVar))) {
                G0 g02 = new G0(dVar, iVarPlus);
                O3.i iVar2 = g02.f7045c;
                Object objN = k4.a.n(iVar2, null);
                try {
                    Object objC0 = f.c0(g02, g02, pVar);
                    k4.a.i(iVar2, objN);
                    objZ = objC0;
                } catch (Throwable th) {
                    k4.a.i(iVar2, objN);
                    throw th;
                }
            } else {
                K k5 = new K(dVar, iVarPlus);
                try {
                    k4.a.j(p1.b.x(((Q3.a) pVar).create(k5, k5)), K3.k.f2288a);
                    while (true) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = K.f7024e;
                        int i5 = atomicIntegerFieldUpdater.get(k5);
                        if (i5 != 0) {
                            if (i5 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objZ = z(t0.f7098a.get(k5));
                            if (objZ instanceof C0524x) {
                                throw ((C0524x) objZ).f7107a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(k5, 0, 1)) {
                            objZ = P3.a.f2678a;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    k5.resumeWith(AbstractC0183a.v(th2));
                    throw th2;
                }
            }
        }
        P3.a aVar = P3.a.f2678a;
        return objZ;
    }

    public static final Object C(long j5, X3.p pVar, Q3.c cVar) throws Throwable {
        Object c0524x;
        Object objE;
        if (j5 <= 0) {
            throw new D0("Timed out immediately", null);
        }
        E0 e02 = new E0(j5, cVar);
        p(e02, true, new Q(l(e02.f8406d.getContext()).a(e02.f7016e, e02, e02.f7045c), 0));
        try {
            kotlin.jvm.internal.u.c(2, pVar);
            c0524x = pVar.invoke(e02, e02);
        } catch (Throwable th) {
            c0524x = new C0524x(th, false);
        }
        Object obj = P3.a.f2678a;
        if (c0524x == obj || (objE = e02.E(c0524x)) == f7012e) {
            return obj;
        }
        if (objE instanceof C0524x) {
            Throwable th2 = ((C0524x) objE).f7107a;
            if (!(th2 instanceof D0) || ((D0) th2).f7007a != e02) {
                throw th2;
            }
            if (c0524x instanceof C0524x) {
                throw ((C0524x) c0524x).f7107a;
            }
        } else {
            c0524x = z(objE);
        }
        return c0524x;
    }

    public static C0521u a() {
        C0521u c0521u = new C0521u(true);
        c0521u.A(null);
        return c0521u;
    }

    public static final k4.c b(O3.i iVar) {
        if (iVar.get(B.f7000b) == null) {
            iVar = iVar.plus(c());
        }
        return new k4.c(iVar);
    }

    public static C0510i0 c() {
        return new C0510i0(null);
    }

    public static B0 d() {
        return new B0(null);
    }

    public static I e(C c5, X3.p pVar) {
        O3.j jVar = O3.j.f2661a;
        D d5 = D.f7002a;
        O3.i iVarU = u(c5, jVar);
        D d6 = D.f7002a;
        I i5 = new I(iVarU, true);
        i5.T(d5, i5, pVar);
        return i5;
    }

    public static final Object f(H[] hArr, Q3.j jVar) {
        if (hArr.length == 0) {
            return s.f2351a;
        }
        C0502e c0502e = new C0502e(hArr);
        C0516n c0516n = new C0516n(1, p1.b.x(jVar));
        c0516n.s();
        int length = hArr.length;
        C0498c[] c0498cArr = new C0498c[length];
        for (int i5 = 0; i5 < length; i5++) {
            H h5 = hArr[i5];
            h5.start();
            C0498c c0498c = new C0498c(c0502e, c0516n);
            c0498c.f7051f = p(h5, true, c0498c);
            c0498cArr[i5] = c0498c;
        }
        C0500d c0500d = new C0500d(c0498cArr);
        for (int i6 = 0; i6 < length; i6++) {
            C0498c c0498c2 = c0498cArr[i6];
            c0498c2.getClass();
            C0498c.f7049l.set(c0498c2, c0500d);
        }
        if (C0516n.f7079k.get(c0516n) instanceof y0) {
            c0516n.v(c0500d);
        } else {
            c0500d.b();
        }
        Object objR = c0516n.r();
        P3.a aVar = P3.a.f2678a;
        return objR;
    }

    public static final Object g(X3.p pVar, O3.d dVar) throws Throwable {
        r rVar = new r(dVar, dVar.getContext());
        Object objC0 = f.c0(rVar, rVar, pVar);
        P3.a aVar = P3.a.f2678a;
        return objC0;
    }

    public static final Object h(long j5, Q3.c cVar) {
        K3.k kVar = K3.k.f2288a;
        if (j5 <= 0) {
            return kVar;
        }
        C0516n c0516n = new C0516n(1, p1.b.x(cVar));
        c0516n.s();
        if (j5 < Long.MAX_VALUE) {
            l(c0516n.f7082e).e(j5, c0516n);
        }
        Object objR = c0516n.r();
        return objR == P3.a.f2678a ? objR : kVar;
    }

    public static final void i(O3.i iVar) {
        InterfaceC0506g0 interfaceC0506g0 = (InterfaceC0506g0) iVar.get(B.f7000b);
        if (interfaceC0506g0 != null && !interfaceC0506g0.isActive()) {
            throw interfaceC0506g0.getCancellationException();
        }
    }

    public static final O3.i j(O3.i iVar, O3.i iVar2, boolean z4) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) iVar.fold(bool, new C0525y(0))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) iVar2.fold(bool, new C0525y(0))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return iVar.plus(iVar2);
        }
        O3.j jVar = O3.j.f2661a;
        O3.i iVar3 = (O3.i) iVar.fold(jVar, new C0525y(1));
        Object objFold = iVar2;
        if (zBooleanValue2) {
            objFold = iVar2.fold(jVar, new C0525y(2));
        }
        return iVar3.plus((O3.i) objFold);
    }

    public static final A k(Executor executor) {
        A a5;
        M m5 = executor instanceof M ? (M) executor : null;
        return (m5 == null || (a5 = m5.f7026a) == null) ? new C0495a0(executor) : a5;
    }

    public static final J l(O3.i iVar) {
        O3.g gVar = iVar.get(O3.e.f2660a);
        J j5 = gVar instanceof J ? (J) gVar : null;
        return j5 == null ? G.f7020a : j5;
    }

    public static final String m(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0516n n(O3.d dVar) {
        C0516n c0516n;
        C0516n c0516n2;
        if (!(dVar instanceof k4.f)) {
            return new C0516n(1, dVar);
        }
        k4.f fVar = (k4.f) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k4.f.f8377l;
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            h1.i iVar = k4.a.f8367c;
            c0516n = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, iVar);
                c0516n2 = null;
                break;
            }
            if (obj instanceof C0516n) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, iVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                c0516n2 = (C0516n) obj;
                break loop0;
            }
            if (obj != iVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0516n2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0516n.f7079k;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0516n2);
            if (!(obj2 instanceof C0523w) || ((C0523w) obj2).f7104d == null) {
                C0516n.f7078f.set(c0516n2, 536870911);
                atomicReferenceFieldUpdater2.set(c0516n2, C0496b.f7047a);
                c0516n = c0516n2;
            } else {
                c0516n2.o();
            }
            if (c0516n != null) {
                return c0516n;
            }
        }
        return new C0516n(2, dVar);
    }

    public static final void o(O3.i iVar, Throwable th) {
        try {
            g4.b bVar = (g4.b) iVar.get(B.f6999a);
            if (bVar != null) {
                bVar.k(iVar, th);
            } else {
                k4.a.f(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0156x.c(runtimeException, th);
                th = runtimeException;
            }
            k4.a.f(iVar, th);
        }
    }

    public static final P p(InterfaceC0506g0 interfaceC0506g0, boolean z4, k0 k0Var) {
        return interfaceC0506g0 instanceof t0 ? ((t0) interfaceC0506g0).B(z4, k0Var) : interfaceC0506g0.invokeOnCompletion(k0Var.j(), z4, new C0512j0(1, k0Var, k0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final boolean q(int i5) {
        return i5 == 1 || i5 == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object r(java.util.List r4, Q3.c r5) {
        /*
            boolean r0 = r5 instanceof f4.C0505g
            if (r0 == 0) goto L13
            r0 = r5
            f4.g r0 = (f4.C0505g) r0
            int r1 = r0.f7062c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7062c = r1
            goto L18
        L13:
            f4.g r0 = new f4.g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f7061b
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f7062c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.f7060a
            a.AbstractC0183a.m0(r5)
            goto L38
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            a.AbstractC0183a.m0(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            f4.g0 r5 = (f4.InterfaceC0506g0) r5
            r0.f7060a = r4
            r0.f7062c = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L38
            return r1
        L4f:
            K3.k r4 = K3.k.f2288a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.E.r(java.util.List, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:19:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object s(f4.InterfaceC0506g0[] r6, Q3.c r7) {
        /*
            boolean r0 = r7 instanceof f4.f
            if (r0 == 0) goto L13
            r0 = r7
            f4.f r0 = (f4.f) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            f4.f r0 = new f4.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            P3.a r1 = P3.a.f2678a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.c
            int r2 = r0.b
            java.lang.Object[] r4 = r0.a
            f4.g0[] r4 = (f4.InterfaceC0506g0[]) r4
            a.AbstractC0183a.m0(r7)
            r7 = r4
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            a.AbstractC0183a.m0(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L40:
            if (r2 >= r6) goto L55
            r4 = r7[r2]
            r0.a = r7
            r0.b = r2
            r0.c = r6
            r0.e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L40
        L55:
            K3.k r6 = K3.k.f2288a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.E.s(f4.g0[], Q3.c):java.lang.Object");
    }

    public static A0 t(C c5, O3.f fVar, D d5, X3.p pVar, int i5) {
        O3.i iVar = fVar;
        if ((i5 & 1) != 0) {
            iVar = O3.j.f2661a;
        }
        if ((i5 & 2) != 0) {
            d5 = D.f7002a;
        }
        O3.i iVarU = u(c5, iVar);
        d5.getClass();
        A0 u0Var = d5 == D.f7003b ? new u0(iVarU, pVar) : new A0(iVarU, true);
        u0Var.T(d5, u0Var, pVar);
        return u0Var;
    }

    public static final O3.i u(C c5, O3.i iVar) {
        O3.i iVarJ = j(c5.e(), iVar, true);
        A a5 = N.f7027a;
        return (iVarJ == a5 || iVarJ.get(O3.e.f2660a) != null) ? iVarJ : iVarJ.plus(a5);
    }

    public static final Object v(Object obj) {
        return obj instanceof C0524x ? AbstractC0183a.v(((C0524x) obj).f7107a) : obj;
    }

    public static final void w(C0516n c0516n, O3.d dVar, boolean z4) {
        Object obj = C0516n.f7079k.get(c0516n);
        Throwable thE = c0516n.e(obj);
        Object objV = thE != null ? AbstractC0183a.v(thE) : c0516n.g(obj);
        if (!z4) {
            dVar.resumeWith(objV);
            return;
        }
        kotlin.jvm.internal.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        k4.f fVar = (k4.f) dVar;
        Q3.c cVar = fVar.f8379e;
        O3.i context = cVar.getContext();
        Object objN = k4.a.n(context, fVar.f8381k);
        G0 g0A = objN != k4.a.f8368d ? A(cVar, context, objN) : null;
        try {
            cVar.resumeWith(objV);
        } finally {
            if (g0A == null || g0A.U()) {
                k4.a.i(context, objN);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x(O3.i iVar, X3.p pVar) throws Throwable {
        O3.i iVarJ;
        Y y4;
        Thread threadCurrentThread = Thread.currentThread();
        O3.h hVar = O3.e.f2660a;
        Object obj = (O3.f) iVar.get(hVar);
        O3.j jVar = O3.j.f2661a;
        if (obj == null) {
            A a5 = C0.a();
            iVarJ = j(jVar, iVar.plus(a5), true);
            A a6 = N.f7027a;
            y4 = a5;
            if (iVarJ != a6) {
                y4 = a5;
                if (iVarJ.get(hVar) == null) {
                    iVarJ = iVarJ.plus(a6);
                    y4 = a5;
                }
            }
        } else {
            if (obj instanceof Y) {
            }
            Y y5 = (Y) C0.f7001a.get();
            iVarJ = j(jVar, iVar, true);
            A a7 = N.f7027a;
            y4 = y5;
            if (iVarJ != a7) {
                y4 = y5;
                if (iVarJ.get(hVar) == null) {
                    iVarJ = iVarJ.plus(a7);
                    y4 = y5;
                }
            }
        }
        C0507h c0507h = new C0507h(iVarJ, threadCurrentThread, y4);
        c0507h.T(D.f7002a, c0507h, pVar);
        Y y6 = c0507h.f7064e;
        if (y6 != null) {
            int i5 = Y.f7041f;
            y6.r(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jT = y6 != null ? y6.t() : Long.MAX_VALUE;
                if (c0507h.isCompleted()) {
                    if (y6 != null) {
                        int i6 = Y.f7041f;
                        y6.o(false);
                    }
                    Object objZ = z(t0.f7098a.get(c0507h));
                    C0524x c0524x = objZ instanceof C0524x ? (C0524x) objZ : null;
                    if (c0524x == null) {
                        return objZ;
                    }
                    throw c0524x.f7107a;
                }
                LockSupport.parkNanos(c0507h, jT);
            } catch (Throwable th) {
                if (y6 != null) {
                    int i7 = Y.f7041f;
                    y6.o(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0507h.l(interruptedException);
        throw interruptedException;
    }

    public static final String y(O3.d dVar) {
        Object objV;
        if (dVar instanceof k4.f) {
            return ((k4.f) dVar).toString();
        }
        try {
            objV = dVar + '@' + m(dVar);
        } catch (Throwable th) {
            objV = AbstractC0183a.v(th);
        }
        if (K3.g.a(objV) != null) {
            objV = dVar.getClass().getName() + '@' + m(dVar);
        }
        return (String) objV;
    }

    public static final Object z(Object obj) {
        InterfaceC0501d0 interfaceC0501d0;
        C0503e0 c0503e0 = obj instanceof C0503e0 ? (C0503e0) obj : null;
        return (c0503e0 == null || (interfaceC0501d0 = c0503e0.f7057a) == null) ? obj : interfaceC0501d0;
    }
}
