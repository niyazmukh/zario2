package T2;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\o.smali */
public final class o extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3240a;

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        o oVar = new o(2, dVar);
        oVar.f3240a = obj;
        return oVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        o oVar = (o) create((a0.b) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        oVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        a0.b bVar = (a0.b) this.f3240a;
        a0.d dVar = f.f3212a;
        bVar.e(f.f3220k, new Integer(0));
        return K3.k.f2288a;
    }
}
