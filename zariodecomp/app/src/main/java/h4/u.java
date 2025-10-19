package h4;

import f4.C0508h0;
import f4.C0524x;
import f4.E;
import f4.n0;
import f4.t0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h4\u.smali */
public final class u extends f4.a implements v, k {

    /* renamed from: d, reason: collision with root package name */
    public final g f7825d;

    public u(O3.i iVar, g gVar) {
        super(iVar, true);
        this.f7825d = gVar;
    }

    @Override // f4.a
    public final void R(Throwable th, boolean z4) {
        if (this.f7825d.k(th, false) || z4) {
            return;
        }
        E.o(this.f7045c, th);
    }

    @Override // f4.a
    public final void S(Object obj) {
        this.f7825d.k(null, false);
    }

    public final void U(t tVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g gVar = this.f7825d;
        gVar.getClass();
        do {
            atomicReferenceFieldUpdater = g.f7791o;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, null, tVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            h1.i iVar = i.f7809q;
            if (obj != iVar) {
                if (obj == i.f7810r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            h1.i iVar2 = i.f7810r;
            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, iVar, iVar2)) {
                if (atomicReferenceFieldUpdater.get(gVar) != iVar) {
                    break;
                }
            }
            tVar.invoke(gVar.p());
            return;
        }
    }

    @Override // h4.x
    public final Object b() {
        return this.f7825d.b();
    }

    @Override // h4.y
    public final Object c(Object obj) {
        return this.f7825d.c(obj);
    }

    @Override // f4.t0, f4.InterfaceC0506g0
    public final /* synthetic */ void cancel() {
        throw null;
    }

    @Override // f4.t0, f4.InterfaceC0506g0
    public final void cancel(CancellationException cancellationException) {
        Object obj = t0.f7098a.get(this);
        if (obj instanceof C0524x) {
            return;
        }
        if ((obj instanceof n0) && ((n0) obj).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0508h0(o(), null, this);
        }
        m(cancellationException);
    }

    @Override // f4.t0, f4.InterfaceC0506g0
    public final /* synthetic */ boolean cancel(Throwable th) {
        throw null;
    }

    @Override // h4.y
    public final Object d(O3.d dVar, Object obj) {
        return this.f7825d.d(dVar, obj);
    }

    @Override // h4.x
    public final Object g(j4.s sVar) {
        g gVar = this.f7825d;
        gVar.getClass();
        Object objB = g.B(gVar, sVar);
        P3.a aVar = P3.a.f2678a;
        return objB;
    }

    @Override // h4.x
    public final c iterator() {
        g gVar = this.f7825d;
        gVar.getClass();
        return new c(gVar);
    }

    @Override // f4.t0
    public final void m(CancellationException cancellationException) {
        CancellationException cancellationExceptionO = t0.O(this, cancellationException);
        this.f7825d.k(cancellationExceptionO, true);
        l(cancellationExceptionO);
    }
}
