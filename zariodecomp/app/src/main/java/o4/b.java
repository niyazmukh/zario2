package o4;

import K3.k;
import X3.q;
import f4.C0515m;
import f4.C0516n;
import f4.I0;
import f4.InterfaceC0514l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.s;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o4\b.smali */
public final class b implements InterfaceC0514l, I0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0516n f9271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f9272b;

    public b(c cVar, C0516n c0516n) {
        this.f9272b = cVar;
        this.f9271a = c0516n;
    }

    @Override // f4.InterfaceC0514l
    public final void a(Object obj, q qVar) {
        k kVar = k.f2288a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f9273g;
        c cVar = this.f9272b;
        atomicReferenceFieldUpdater.set(cVar, null);
        G2.k kVar2 = new G2.k(2, cVar, this);
        C0516n c0516n = this.f9271a;
        c0516n.A(kVar, c0516n.f7025c, new C0515m(kVar2, 0));
    }

    @Override // f4.I0
    public final void b(s sVar, int i) {
        this.f9271a.b(sVar, i);
    }

    @Override // f4.InterfaceC0514l
    public final h1.i f(Object obj, q qVar) {
        c cVar = this.f9272b;
        h4.b bVar = new h4.b(1, cVar, this);
        h1.i iVarD = this.f9271a.D((k) obj, bVar);
        if (iVarD != null) {
            c.f9273g.set(cVar, null);
        }
        return iVarD;
    }

    @Override // O3.d
    public final O3.i getContext() {
        return this.f9271a.f7082e;
    }

    @Override // f4.InterfaceC0514l
    public final void h(Object obj) {
        this.f9271a.h(obj);
    }

    @Override // O3.d
    public final void resumeWith(Object obj) {
        this.f9271a.resumeWith(obj);
    }
}
