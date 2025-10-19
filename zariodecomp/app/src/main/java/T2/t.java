package T2;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\t.smali */
public final class t extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3252b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j5, O3.d dVar) {
        super(2, dVar);
        this.f3252b = j5;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        t tVar = new t(this.f3252b, dVar);
        tVar.f3251a = obj;
        return tVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        t tVar = (t) create((a0.b) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        tVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        a0.b bVar = (a0.b) this.f3251a;
        a0.d dVar = f.f3212a;
        bVar.e(f.f3212a, new Long(this.f3252b));
        return K3.k.f2288a;
    }
}
