package e3;

import X3.p;
import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e3.1\i.smali */
public final class i extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6919a;

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        i iVar = new i(2, dVar);
        iVar.f6919a = obj;
        return iVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        i iVar = (i) create((a0.b) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        iVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        a0.b bVar = (a0.b) this.f6919a;
        bVar.b();
        bVar.f4017a.clear();
        a0.d dVar = AbstractC0480c.f6891a;
        bVar.e(AbstractC0480c.f6891a, Boolean.FALSE);
        return K3.k.f2288a;
    }
}
