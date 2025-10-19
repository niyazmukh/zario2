package T2;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\l.smali */
public final class l extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3235a;

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        l lVar = new l(2, dVar);
        lVar.f3235a = obj;
        return lVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        l lVar = (l) create((a0.b) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        lVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        a0.b bVar = (a0.b) this.f3235a;
        a0.d dVar = f.f3212a;
        bVar.e(f.f3219j, Boolean.TRUE);
        return K3.k.f2288a;
    }
}
