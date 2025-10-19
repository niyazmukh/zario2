package W;

import a.AbstractC0183a;
import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\h0.smali */
public final class h0 extends Q3.j implements X3.p {
    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new h0(2, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        h0 h0Var = (h0) create((InterfaceC0613h) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        h0Var.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        return K3.k.f2288a;
    }
}
