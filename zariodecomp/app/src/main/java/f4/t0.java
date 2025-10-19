package f4;

import N2.AbstractC0156x;
import S0.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\t0.smali */
public class t0 implements InterfaceC0506g0, s, z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7098a = AtomicReferenceFieldUpdater.newUpdater(t0.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7099b = AtomicReferenceFieldUpdater.newUpdater(t0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public t0(boolean z4) {
        this._state$volatile = z4 ? E.f7015j : E.i;
    }

    public static r G(k4.j jVar) {
        while (jVar.h()) {
            k4.j jVarE = jVar.e();
            if (jVarE == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k4.j.f8391b;
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (k4.j) obj;
                    if (!jVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarE;
            }
        }
        while (true) {
            jVar = jVar.g();
            if (!jVar.h()) {
                if (jVar instanceof r) {
                    return (r) jVar;
                }
                if (jVar instanceof w0) {
                    return null;
                }
            }
        }
    }

    public static String N(Object obj) {
        if (!(obj instanceof n0)) {
            return obj instanceof InterfaceC0501d0 ? ((InterfaceC0501d0) obj).isActive() ? "Active" : "New" : obj instanceof C0524x ? "Cancelled" : "Completed";
        }
        n0 n0Var = (n0) obj;
        return n0Var.d() ? "Cancelling" : n0.f7083b.get(n0Var) != 0 ? "Completing" : "Active";
    }

    public static CancellationException O(t0 t0Var, Throwable th) {
        t0Var.getClass();
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new C0508h0(t0Var.o(), th, t0Var) : cancellationException;
    }

    public final void A(InterfaceC0506g0 interfaceC0506g0) {
        x0 x0Var = x0.f7108a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7099b;
        if (interfaceC0506g0 == null) {
            atomicReferenceFieldUpdater.set(this, x0Var);
            return;
        }
        interfaceC0506g0.start();
        InterfaceC0519q interfaceC0519qAttachChild = interfaceC0506g0.attachChild(this);
        atomicReferenceFieldUpdater.set(this, interfaceC0519qAttachChild);
        if (isCompleted()) {
            interfaceC0519qAttachChild.a();
            atomicReferenceFieldUpdater.set(this, x0Var);
        }
    }

    public final P B(boolean z4, k0 k0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        x0 x0Var;
        boolean z5;
        boolean zD;
        k0Var.f7070d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f7098a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z6 = obj instanceof S;
            x0Var = x0.f7108a;
            z5 = true;
            if (!z6) {
                if (!(obj instanceof InterfaceC0501d0)) {
                    z5 = false;
                    break;
                }
                InterfaceC0501d0 interfaceC0501d0 = (InterfaceC0501d0) obj;
                w0 w0VarC = interfaceC0501d0.c();
                if (w0VarC == null) {
                    kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    L((k0) obj);
                } else {
                    if (k0Var.j()) {
                        n0 n0Var = interfaceC0501d0 instanceof n0 ? (n0) interfaceC0501d0 : null;
                        Throwable thB = n0Var != null ? n0Var.b() : null;
                        if (thB != null) {
                            if (z4) {
                                k0Var.k(thB);
                            }
                            return x0Var;
                        }
                        zD = w0VarC.d(k0Var, 5);
                    } else {
                        zD = w0VarC.d(k0Var, 1);
                    }
                    if (zD) {
                        break;
                    }
                }
            } else {
                S s4 = (S) obj;
                if (s4.f7031a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                K(s4);
            }
        }
        if (z5) {
            return k0Var;
        }
        if (z4) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0524x c0524x = obj2 instanceof C0524x ? (C0524x) obj2 : null;
            k0Var.k(c0524x != null ? c0524x.f7107a : null);
        }
        return x0Var;
    }

    public boolean C() {
        return this instanceof C0507h;
    }

    public final boolean D(Object obj) {
        Object objP;
        do {
            objP = P(f7098a.get(this), obj);
            if (objP == E.f7011d) {
                return false;
            }
            if (objP == E.f7012e) {
                return true;
            }
        } while (objP == E.f7013f);
        i(objP);
        return true;
    }

    public final Object E(Object obj) {
        Object objP;
        do {
            objP = P(f7098a.get(this), obj);
            if (objP == E.f7011d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0524x c0524x = obj instanceof C0524x ? (C0524x) obj : null;
                throw new IllegalStateException(str, c0524x != null ? c0524x.f7107a : null);
            }
        } while (objP == E.f7013f);
        return objP;
    }

    public String F() {
        return getClass().getSimpleName();
    }

    public final void H(w0 w0Var, Throwable th) {
        w0Var.d(new k4.h(4), 4);
        Object obj = k4.j.f8390a.get(w0Var);
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        B0.c cVar = null;
        for (k4.j jVarG = (k4.j) obj; !jVarG.equals(w0Var); jVarG = jVarG.g()) {
            if ((jVarG instanceof k0) && ((k0) jVarG).j()) {
                try {
                    ((k0) jVarG).k(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        AbstractC0156x.c(cVar, th2);
                    } else {
                        cVar = new B0.c("Exception in completion handler " + jVarG + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            z(cVar);
        }
        n(th);
    }

    public void I(Object obj) {
    }

    public void J() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [f4.c0] */
    public final void K(S s4) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        w0 w0Var = new w0();
        if (!s4.f7031a) {
            w0Var = new C0499c0(w0Var);
        }
        do {
            atomicReferenceFieldUpdater = f7098a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, s4, w0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == s4);
    }

    public final void L(k0 k0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        w0 w0Var = new w0();
        k0Var.getClass();
        k4.j.f8391b.set(w0Var, k0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k4.j.f8390a;
        atomicReferenceFieldUpdater2.set(w0Var, k0Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(k0Var) == k0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(k0Var, k0Var, w0Var)) {
                    if (atomicReferenceFieldUpdater2.get(k0Var) != k0Var) {
                        break;
                    }
                }
                w0Var.f(k0Var);
                break loop0;
            }
            break;
        }
        k4.j jVarG = k0Var.g();
        do {
            atomicReferenceFieldUpdater = f7098a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, k0Var, jVarG)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == k0Var);
    }

    public final int M(Object obj) {
        boolean z4 = obj instanceof S;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7098a;
        if (z4) {
            if (((S) obj).f7031a) {
                return 0;
            }
            S s4 = E.f7015j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, s4)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            J();
            return 1;
        }
        if (!(obj instanceof C0499c0)) {
            return 0;
        }
        w0 w0Var = ((C0499c0) obj).f7053a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        J();
        return 1;
    }

    public final Object P(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC0501d0)) {
            return E.f7011d;
        }
        if (((obj instanceof S) || (obj instanceof k0)) && !(obj instanceof r) && !(obj2 instanceof C0524x)) {
            InterfaceC0501d0 interfaceC0501d0 = (InterfaceC0501d0) obj;
            Object c0503e0 = obj2 instanceof InterfaceC0501d0 ? new C0503e0((InterfaceC0501d0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f7098a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0501d0, c0503e0)) {
                    I(obj2);
                    q(interfaceC0501d0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC0501d0);
            return E.f7013f;
        }
        InterfaceC0501d0 interfaceC0501d02 = (InterfaceC0501d0) obj;
        w0 w0VarX = x(interfaceC0501d02);
        if (w0VarX == null) {
            return E.f7013f;
        }
        n0 n0Var = interfaceC0501d02 instanceof n0 ? (n0) interfaceC0501d02 : null;
        if (n0Var == null) {
            n0Var = new n0(w0VarX, null);
        }
        synchronized (n0Var) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n0.f7083b;
                if (atomicIntegerFieldUpdater.get(n0Var) != 0) {
                    return E.f7011d;
                }
                atomicIntegerFieldUpdater.set(n0Var, 1);
                if (n0Var != interfaceC0501d02) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7098a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0501d02, n0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC0501d02) {
                            return E.f7013f;
                        }
                    }
                }
                boolean zD = n0Var.d();
                C0524x c0524x = obj2 instanceof C0524x ? (C0524x) obj2 : null;
                if (c0524x != null) {
                    n0Var.a(c0524x.f7107a);
                }
                Throwable thB = zD ? null : n0Var.b();
                if (thB != null) {
                    H(w0VarX, thB);
                }
                r rVarG = G(w0VarX);
                if (rVarG != null && Q(n0Var, rVarG, obj2)) {
                    return E.f7012e;
                }
                w0VarX.d(new k4.h(2), 2);
                r rVarG2 = G(w0VarX);
                return (rVarG2 == null || !Q(n0Var, rVarG2, obj2)) ? s(n0Var, obj2) : E.f7012e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean Q(n0 n0Var, r rVar, Object obj) {
        while (E.p(rVar.e, false, new m0(this, n0Var, rVar, obj)) == x0.f7108a) {
            rVar = G(rVar);
            if (rVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // f4.InterfaceC0506g0
    public final InterfaceC0519q attachChild(s sVar) {
        r rVar = new r(sVar);
        rVar.f7070d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7098a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof S) {
                S s4 = (S) obj;
                if (s4.f7031a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                K(s4);
            } else {
                boolean z4 = obj instanceof InterfaceC0501d0;
                x0 x0Var = x0.f7108a;
                if (!z4) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0524x c0524x = obj2 instanceof C0524x ? (C0524x) obj2 : null;
                    rVar.k(c0524x != null ? c0524x.f7107a : null);
                    return x0Var;
                }
                w0 w0VarC = ((InterfaceC0501d0) obj).c();
                if (w0VarC == null) {
                    kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    L((k0) obj);
                } else if (!w0VarC.d(rVar, 7)) {
                    boolean zD = w0VarC.d(rVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof n0) {
                        thB = ((n0) obj3).b();
                    } else {
                        C0524x c0524x2 = obj3 instanceof C0524x ? (C0524x) obj3 : null;
                        if (c0524x2 != null) {
                            thB = c0524x2.f7107a;
                        }
                    }
                    rVar.k(thB);
                    if (zD) {
                        break loop0;
                    }
                    return x0Var;
                }
            }
        }
        return rVar;
    }

    @Override // f4.InterfaceC0506g0
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // O3.i
    public final Object fold(Object obj, X3.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // O3.i
    public final O3.g get(O3.h hVar) {
        return f.C(this, hVar);
    }

    @Override // f4.InterfaceC0506g0
    public final CancellationException getCancellationException() {
        Object obj = f7098a.get(this);
        if (!(obj instanceof n0)) {
            if (!(obj instanceof InterfaceC0501d0)) {
                return obj instanceof C0524x ? O(this, ((C0524x) obj).f7107a) : new C0508h0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable thB = ((n0) obj).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = o();
        }
        return new C0508h0(strConcat, thB, this);
    }

    @Override // f4.InterfaceC0506g0
    public final d4.e getChildren() {
        return new L3.q(new p0(null, this), 2);
    }

    public Object getCompleted() {
        return t();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object obj = f7098a.get(this);
        if (obj instanceof InterfaceC0501d0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        C0524x c0524x = obj instanceof C0524x ? (C0524x) obj : null;
        if (c0524x != null) {
            return c0524x.f7107a;
        }
        return null;
    }

    @Override // O3.g
    public final O3.h getKey() {
        return B.f7000b;
    }

    @Override // f4.InterfaceC0506g0
    public final n4.a getOnJoin() {
        kotlin.jvm.internal.u.c(3, s0.f7097a);
        return new G2.e();
    }

    public void i(Object obj) {
    }

    @Override // f4.InterfaceC0506g0
    public final P invokeOnCompletion(X3.l lVar) {
        return B(true, new Q(lVar, 1));
    }

    @Override // f4.InterfaceC0506g0
    public boolean isActive() {
        Object obj = f7098a.get(this);
        return (obj instanceof InterfaceC0501d0) && ((InterfaceC0501d0) obj).isActive();
    }

    @Override // f4.InterfaceC0506g0
    public final boolean isCompleted() {
        return !(f7098a.get(this) instanceof InterfaceC0501d0);
    }

    public void j(Object obj) {
        i(obj);
    }

    @Override // f4.InterfaceC0506g0
    public final Object join(O3.d dVar) {
        boolean z4;
        while (true) {
            Object obj = f7098a.get(this);
            if (!(obj instanceof InterfaceC0501d0)) {
                z4 = false;
                break;
            }
            if (M(obj) >= 0) {
                z4 = true;
                break;
            }
        }
        K3.k kVar = K3.k.f2288a;
        if (!z4) {
            E.i(dVar.getContext());
            return kVar;
        }
        C0516n c0516n = new C0516n(1, p1.b.x(dVar));
        c0516n.s();
        c0516n.v(new C0511j(E.p(this, true, new C0518p(c0516n, 1)), 2));
        Object objR = c0516n.r();
        P3.a aVar = P3.a.f2678a;
        if (objR != aVar) {
            objR = kVar;
        }
        return objR == aVar ? objR : kVar;
    }

    public final Object k(O3.d dVar) throws Throwable {
        Object obj;
        do {
            obj = f7098a.get(this);
            if (!(obj instanceof InterfaceC0501d0)) {
                if (obj instanceof C0524x) {
                    throw ((C0524x) obj).f7107a;
                }
                return E.z(obj);
            }
        } while (M(obj) < 0);
        l0 l0Var = new l0(p1.b.x(dVar), this);
        l0Var.s();
        l0Var.v(new C0511j(E.p(this, true, new Q(l0Var, 3)), 2));
        Object objR = l0Var.r();
        P3.a aVar = P3.a.f2678a;
        return objR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        r0 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.t0.l(java.lang.Object):boolean");
    }

    public void m(CancellationException cancellationException) {
        l(cancellationException);
    }

    @Override // O3.i
    public final O3.i minusKey(O3.h hVar) {
        return f.R(this, hVar);
    }

    public final boolean n(Throwable th) {
        if (C()) {
            return true;
        }
        boolean z4 = th instanceof CancellationException;
        InterfaceC0519q interfaceC0519q = (InterfaceC0519q) f7099b.get(this);
        return (interfaceC0519q == null || interfaceC0519q == x0.f7108a) ? z4 : interfaceC0519q.b(th) || z4;
    }

    public String o() {
        return "Job was cancelled";
    }

    public boolean p(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return l(th) && v();
    }

    @Override // f4.InterfaceC0506g0
    public final InterfaceC0506g0 plus(InterfaceC0506g0 interfaceC0506g0) {
        return interfaceC0506g0;
    }

    public final void q(InterfaceC0501d0 interfaceC0501d0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7099b;
        InterfaceC0519q interfaceC0519q = (InterfaceC0519q) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0519q != null) {
            interfaceC0519q.a();
            atomicReferenceFieldUpdater.set(this, x0.f7108a);
        }
        B0.c cVar = null;
        C0524x c0524x = obj instanceof C0524x ? (C0524x) obj : null;
        Throwable th = c0524x != null ? c0524x.f7107a : null;
        if (interfaceC0501d0 instanceof k0) {
            try {
                ((k0) interfaceC0501d0).k(th);
                return;
            } catch (Throwable th2) {
                z(new B0.c("Exception in completion handler " + interfaceC0501d0 + " for " + this, th2));
                return;
            }
        }
        w0 w0VarC = interfaceC0501d0.c();
        if (w0VarC != null) {
            w0VarC.d(new k4.h(1), 1);
            Object obj2 = k4.j.f8390a.get(w0VarC);
            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (k4.j jVarG = (k4.j) obj2; !jVarG.equals(w0VarC); jVarG = jVarG.g()) {
                if (jVarG instanceof k0) {
                    try {
                        ((k0) jVarG).k(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            AbstractC0156x.c(cVar, th3);
                        } else {
                            cVar = new B0.c("Exception in completion handler " + jVarG + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                z(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    public final Throwable r(Object obj) {
        CancellationException cancellationExceptionB;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        t0 t0Var = (t0) ((z0) obj);
        Object obj2 = f7098a.get(t0Var);
        if (obj2 instanceof n0) {
            cancellationExceptionB = ((n0) obj2).b();
        } else if (obj2 instanceof C0524x) {
            cancellationExceptionB = ((C0524x) obj2).f7107a;
        } else {
            if (obj2 instanceof InterfaceC0501d0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionB = null;
        }
        CancellationException c0508h0 = cancellationExceptionB instanceof CancellationException ? cancellationExceptionB : null;
        if (c0508h0 == null) {
            c0508h0 = new C0508h0("Parent job is ".concat(N(obj2)), cancellationExceptionB, t0Var);
        }
        return c0508h0;
    }

    public final Object s(n0 n0Var, Object obj) {
        Throwable thU;
        C0524x c0524x = obj instanceof C0524x ? (C0524x) obj : null;
        Throwable th = c0524x != null ? c0524x.f7107a : null;
        synchronized (n0Var) {
            n0Var.d();
            ArrayList<Throwable> arrayListE = n0Var.e(th);
            thU = u(n0Var, arrayListE);
            if (thU != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th2 : arrayListE) {
                    if (th2 != thU && th2 != thU && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC0156x.c(thU, th2);
                    }
                }
            }
        }
        if (thU != null && thU != th) {
            obj = new C0524x(thU, false);
        }
        if (thU != null && (n(thU) || y(thU))) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0524x.f7106b.compareAndSet((C0524x) obj, 0, 1);
        }
        I(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7098a;
        Object c0503e0 = obj instanceof InterfaceC0501d0 ? new C0503e0((InterfaceC0501d0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, n0Var, c0503e0) && atomicReferenceFieldUpdater.get(this) == n0Var) {
        }
        q(n0Var, obj);
        return obj;
    }

    @Override // f4.InterfaceC0506g0
    public final boolean start() {
        int iM;
        do {
            iM = M(f7098a.get(this));
            if (iM == 0) {
                return false;
            }
        } while (iM != 1);
        return true;
    }

    public final Object t() throws Throwable {
        Object obj = f7098a.get(this);
        if (obj instanceof InterfaceC0501d0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C0524x) {
            throw ((C0524x) obj).f7107a;
        }
        return E.z(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(F() + '{' + N(f7098a.get(this)) + '}');
        sb.append('@');
        sb.append(E.m(this));
        return sb.toString();
    }

    public final Throwable u(n0 n0Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (n0Var.d()) {
                return new C0508h0(o(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof D0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof D0)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean v() {
        return true;
    }

    public boolean w() {
        return this instanceof C0521u;
    }

    public final w0 x(InterfaceC0501d0 interfaceC0501d0) {
        w0 w0VarC = interfaceC0501d0.c();
        if (w0VarC != null) {
            return w0VarC;
        }
        if (interfaceC0501d0 instanceof S) {
            return new w0();
        }
        if (interfaceC0501d0 instanceof k0) {
            L((k0) interfaceC0501d0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0501d0).toString());
    }

    public boolean y(Throwable th) {
        return false;
    }

    public void z(B0.c cVar) {
        throw cVar;
    }

    @Override // f4.InterfaceC0506g0
    public /* synthetic */ boolean cancel(Throwable th) {
        m(th != null ? O(this, th) : new C0508h0(o(), null, this));
        return true;
    }

    @Override // O3.i
    public final O3.i plus(O3.i iVar) {
        return f.U(this, iVar);
    }

    @Override // f4.InterfaceC0506g0
    public final P invokeOnCompletion(boolean z4, boolean z5, X3.l lVar) {
        k0 q5;
        if (z4) {
            q5 = new C0504f0(lVar);
        } else {
            q5 = new Q(lVar, 1);
        }
        return B(z5, q5);
    }

    @Override // f4.InterfaceC0506g0
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0508h0(o(), null, this);
        }
        m(cancellationException);
    }
}
