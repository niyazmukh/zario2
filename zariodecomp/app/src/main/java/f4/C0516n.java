package f4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.f;
import k4.s;

/* renamed from: f4.n, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\n.1.smali */
public class C0516n extends L implements InterfaceC0514l, Q3.d, I0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7078f = AtomicIntegerFieldUpdater.newUpdater(C0516n.class, "_decisionAndIndex$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7079k = AtomicReferenceFieldUpdater.newUpdater(C0516n.class, Object.class, "_state$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7080l = AtomicReferenceFieldUpdater.newUpdater(C0516n.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final O3.d f7081d;

    /* renamed from: e, reason: collision with root package name */
    public final O3.i f7082e;

    public C0516n(int i, O3.d dVar) {
        super(i);
        this.f7081d = dVar;
        this.f7082e = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0496b.f7047a;
    }

    public static Object C(y0 y0Var, Object obj, int i, X3.q qVar) {
        if ((obj instanceof C0524x) || !E.q(i)) {
            return obj;
        }
        if (qVar != null || (y0Var instanceof InterfaceC0513k)) {
            return new C0523w(obj, y0Var instanceof InterfaceC0513k ? (InterfaceC0513k) y0Var : null, qVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(y0 y0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + y0Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i, X3.q qVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7079k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y0) {
                Object objC = C((y0) obj2, obj, i, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    o();
                }
                p(i);
                return;
            }
            if (obj2 instanceof C0517o) {
                C0517o c0517o = (C0517o) obj2;
                c0517o.getClass();
                if (C0517o.f7087c.compareAndSet(c0517o, 0, 1)) {
                    if (qVar != null) {
                        l(qVar, c0517o.f7107a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(A a5) {
        K3.k kVar = K3.k.f2288a;
        O3.d dVar = this.f7081d;
        f fVar = dVar instanceof f ? (f) dVar : null;
        A(kVar, (fVar != null ? fVar.f8378d : null) == a5 ? 4 : this.f7025c, null);
    }

    public final h1.i D(Object obj, X3.q qVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7079k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z4 = obj2 instanceof y0;
            h1.i iVar = E.f7008a;
            if (!z4) {
                boolean z5 = obj2 instanceof C0523w;
                return null;
            }
            Object objC = C((y0) obj2, obj, this.f7025c, qVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!w()) {
                o();
            }
            return iVar;
        }
    }

    @Override // f4.InterfaceC0514l
    public final void a(Object obj, X3.q qVar) {
        A(obj, this.f7025c, qVar);
    }

    @Override // f4.I0
    public final void b(s sVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f7078f;
            i5 = atomicIntegerFieldUpdater.get(this);
            if ((i5 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, ((i5 >> 29) << 29) + i));
        v(sVar);
    }

    @Override // f4.L
    public final void c(CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7079k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof y0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0524x) {
                return;
            }
            if (!(obj instanceof C0523w)) {
                C0523w c0523w = new C0523w(obj, (InterfaceC0513k) null, (X3.q) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0523w)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0523w c0523w2 = (C0523w) obj;
            if (c0523w2.f7105e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0523w c0523wA = C0523w.a(c0523w2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0523wA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            InterfaceC0513k interfaceC0513k = c0523w2.f7102b;
            if (interfaceC0513k != null) {
                k(interfaceC0513k, cancellationException);
            }
            X3.q qVar = c0523w2.f7103c;
            if (qVar != null) {
                l(qVar, cancellationException, c0523w2.f7101a);
                return;
            }
            return;
        }
    }

    @Override // f4.L
    public final O3.d d() {
        return this.f7081d;
    }

    @Override // f4.L
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // f4.InterfaceC0514l
    public final h1.i f(Object obj, X3.q qVar) {
        return D(obj, qVar);
    }

    @Override // f4.L
    public final Object g(Object obj) {
        return obj instanceof C0523w ? ((C0523w) obj).f7101a : obj;
    }

    @Override // Q3.d
    public final Q3.d getCallerFrame() {
        O3.d dVar = this.f7081d;
        if (dVar instanceof Q3.d) {
            return (Q3.d) dVar;
        }
        return null;
    }

    @Override // O3.d
    public final O3.i getContext() {
        return this.f7082e;
    }

    @Override // f4.InterfaceC0514l
    public final void h(Object obj) {
        p(this.f7025c);
    }

    @Override // f4.L
    public final Object j() {
        return f7079k.get(this);
    }

    public final void k(InterfaceC0513k interfaceC0513k, Throwable th) {
        try {
            interfaceC0513k.a(th);
        } catch (Throwable th2) {
            E.o(this.f7082e, new B0.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(X3.q qVar, Throwable th, Object obj) {
        O3.i iVar = this.f7082e;
        try {
            qVar.c(th, obj, iVar);
        } catch (Throwable th2) {
            E.o(iVar, new B0.c("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(s sVar, Throwable th) {
        O3.i iVar = this.f7082e;
        int i = f7078f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            sVar.h(i, iVar);
        } catch (Throwable th2) {
            E.o(iVar, new B0.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7079k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y0)) {
                return false;
            }
            C0517o c0517o = new C0517o(this, th, (obj instanceof InterfaceC0513k) || (obj instanceof s));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0517o)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            y0 y0Var = (y0) obj;
            if (y0Var instanceof InterfaceC0513k) {
                k((InterfaceC0513k) obj, th);
            } else if (y0Var instanceof s) {
                m((s) obj, th);
            }
            if (!w()) {
                o();
            }
            p(this.f7025c);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7080l;
        P p5 = (P) atomicReferenceFieldUpdater.get(this);
        if (p5 == null) {
            return;
        }
        p5.a();
        atomicReferenceFieldUpdater.set(this, x0.f7108a);
    }

    public final void p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f7078f;
            i5 = atomicIntegerFieldUpdater.get(this);
            int i6 = i5 >> 29;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                O3.d dVar = this.f7081d;
                boolean z4 = i == 4;
                if (z4 || !(dVar instanceof f) || E.q(i) != E.q(this.f7025c)) {
                    E.w(this, dVar, z4);
                    return;
                }
                f fVar = (f) dVar;
                A a5 = fVar.f8378d;
                O3.i context = fVar.f8379e.getContext();
                if (a5.m(context)) {
                    a5.k(context, this);
                    return;
                }
                Y yA = C0.a();
                if (yA.s()) {
                    yA.p(this);
                    return;
                }
                yA.r(true);
                try {
                    E.w(this, dVar, true);
                    do {
                    } while (yA.u());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 1073741824 + (536870911 & i5)));
    }

    public Throwable q(t0 t0Var) {
        return t0Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zW = w();
        do {
            atomicIntegerFieldUpdater = f7078f;
            i = atomicIntegerFieldUpdater.get(this);
            int i5 = i >> 29;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zW) {
                    z();
                }
                Object obj = f7079k.get(this);
                if (obj instanceof C0524x) {
                    throw ((C0524x) obj).f7107a;
                }
                if (E.q(this.f7025c)) {
                    InterfaceC0506g0 interfaceC0506g0 = (InterfaceC0506g0) this.f7082e.get(B.f7000b);
                    if (interfaceC0506g0 != null && !interfaceC0506g0.isActive()) {
                        CancellationException cancellationException = interfaceC0506g0.getCancellationException();
                        c(cancellationException);
                        throw cancellationException;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((P) f7080l.get(this)) == null) {
            t();
        }
        if (zW) {
            z();
        }
        return P3.a.f2678a;
    }

    @Override // O3.d
    public final void resumeWith(Object obj) {
        Throwable thA = K3.g.a(obj);
        if (thA != null) {
            obj = new C0524x(thA, false);
        }
        A(obj, this.f7025c, null);
    }

    public final void s() {
        P pT = t();
        if (pT == null || (f7079k.get(this) instanceof y0)) {
            return;
        }
        pT.a();
        f7080l.set(this, x0.f7108a);
    }

    public final P t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0506g0 interfaceC0506g0 = (InterfaceC0506g0) this.f7082e.get(B.f7000b);
        if (interfaceC0506g0 == null) {
            return null;
        }
        P p5 = E.p(interfaceC0506g0, true, new C0518p(this, 0));
        do {
            atomicReferenceFieldUpdater = f7080l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, p5)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return p5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(E.y(this.f7081d));
        sb.append("){");
        Object obj = f7079k.get(this);
        sb.append(obj instanceof y0 ? "Active" : obj instanceof C0517o ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(E.m(this));
        return sb.toString();
    }

    public final void u(X3.l lVar) {
        v(new C0511j(lVar, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ba, code lost:
    
        x(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bd, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(f4.y0 r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f4.C0516n.f7079k
            java.lang.Object r7 = r0.get(r9)
            boolean r1 = r7 instanceof f4.C0496b
            if (r1 == 0) goto L18
        La:
            boolean r1 = r0.compareAndSet(r9, r7, r10)
            if (r1 == 0) goto L11
            return
        L11:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto La
            goto L0
        L18:
            boolean r1 = r7 instanceof f4.InterfaceC0513k
            r2 = 0
            if (r1 != 0) goto Lba
            boolean r1 = r7 instanceof k4.s
            if (r1 != 0) goto Lba
            boolean r1 = r7 instanceof f4.C0524x
            if (r1 == 0) goto L5c
            r0 = r7
            f4.x r0 = (f4.C0524x) r0
            r0.getClass()
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = f4.C0524x.f7106b
            r4 = 0
            boolean r1 = r3.compareAndSet(r0, r4, r1)
            if (r1 == 0) goto L58
            boolean r1 = r7 instanceof f4.C0517o
            if (r1 == 0) goto L57
            boolean r1 = r7 instanceof f4.C0524x
            if (r1 == 0) goto L3e
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto L43
            java.lang.Throwable r2 = r0.f7107a
        L43:
            boolean r0 = r10 instanceof f4.InterfaceC0513k
            if (r0 == 0) goto L4d
            f4.k r10 = (f4.InterfaceC0513k) r10
            r9.k(r10, r2)
            goto L57
        L4d:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            kotlin.jvm.internal.i.c(r10, r0)
            k4.s r10 = (k4.s) r10
            r9.m(r10, r2)
        L57:
            return
        L58:
            x(r10, r7)
            throw r2
        L5c:
            boolean r1 = r7 instanceof f4.C0523w
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L95
            r1 = r7
            f4.w r1 = (f4.C0523w) r1
            f4.k r4 = r1.f7102b
            if (r4 != 0) goto L91
            boolean r4 = r10 instanceof k4.s
            if (r4 == 0) goto L6e
            return
        L6e:
            kotlin.jvm.internal.i.c(r10, r3)
            r3 = r10
            f4.k r3 = (f4.InterfaceC0513k) r3
            java.lang.Throwable r4 = r1.f7105e
            if (r4 == 0) goto L7c
            r9.k(r3, r4)
            return
        L7c:
            r4 = 29
            f4.w r1 = f4.C0523w.a(r1, r3, r2, r4)
        L82:
            boolean r2 = r0.compareAndSet(r9, r7, r1)
            if (r2 == 0) goto L89
            return
        L89:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r7) goto L82
            goto L0
        L91:
            x(r10, r7)
            throw r2
        L95:
            boolean r1 = r10 instanceof k4.s
            if (r1 == 0) goto L9a
            return
        L9a:
            kotlin.jvm.internal.i.c(r10, r3)
            r3 = r10
            f4.k r3 = (f4.InterfaceC0513k) r3
            f4.w r8 = new f4.w
            r4 = 0
            r5 = 0
            r6 = 28
            r1 = r8
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        Lab:
            boolean r1 = r0.compareAndSet(r9, r7, r8)
            if (r1 == 0) goto Lb2
            return
        Lb2:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto Lab
            goto L0
        Lba:
            x(r10, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.C0516n.v(f4.y0):void");
    }

    public final boolean w() {
        if (this.f7025c == 2) {
            O3.d dVar = this.f7081d;
            kotlin.jvm.internal.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (f.f8377l.get((f) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        O3.d dVar = this.f7081d;
        Throwable th = null;
        f fVar = dVar instanceof f ? (f) dVar : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f.f8377l;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                h1.i iVar = k4.a.f8367c;
                if (obj == iVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, iVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != iVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            o();
            n(th);
        }
    }
}
