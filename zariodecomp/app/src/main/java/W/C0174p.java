package W;

import a.AbstractC0183a;

/* renamed from: W.p, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\p.1.smali */
public final class C0174p extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3652a;

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0174p c0174p = new C0174p(2, dVar);
        c0174p.f3652a = obj;
        return c0174p;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0174p) create((j0) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        return Boolean.valueOf(!(((j0) this.f3652a) instanceof Z));
    }
}
