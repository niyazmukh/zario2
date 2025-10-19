package T2;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\r.smali */
public final class r extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f3247b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Long l4, O3.d dVar) {
        super(2, dVar);
        this.f3247b = l4;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        r rVar = new r(this.f3247b, dVar);
        rVar.f3246a = obj;
        return rVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        r rVar = (r) create((a0.b) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        rVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        a0.b bVar = (a0.b) this.f3246a;
        bVar.d(f.f3216e);
        bVar.e(f.f3218g, new Integer(0));
        bVar.e(f.f3217f, this.f3247b);
        return K3.k.f2288a;
    }
}
