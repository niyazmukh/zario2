package j4;

import i4.InterfaceC0612g;
import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\n.smali */
public final class n extends h {

    /* renamed from: e, reason: collision with root package name */
    public final Q3.j f8104e;

    public n(X3.q qVar, InterfaceC0612g interfaceC0612g, O3.i iVar, int i, h4.a aVar) {
        super(interfaceC0612g, iVar, i, aVar);
        this.f8104e = (Q3.j) qVar;
    }

    @Override // j4.AbstractC0636f
    public final AbstractC0636f d(O3.i iVar, int i, h4.a aVar) {
        return new n(this.f8104e, this.f8086d, iVar, i, aVar);
    }

    @Override // j4.h
    public final Object f(InterfaceC0613h interfaceC0613h, O3.d dVar) throws Throwable {
        Object objG = f4.E.g(new m(this, interfaceC0613h, null), dVar);
        return objG == P3.a.f2678a ? objG : K3.k.f2288a;
    }
}
