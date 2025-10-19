package T2;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\k.smali */
public final class k extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3234b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j5, O3.d dVar) {
        super(2, dVar);
        this.f3234b = j5;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        k kVar = new k(this.f3234b, dVar);
        kVar.f3233a = obj;
        return kVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        k kVar = (k) create((a0.b) obj, (O3.d) obj2);
        K3.k kVar2 = K3.k.f2288a;
        kVar.invokeSuspend(kVar2);
        return kVar2;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        a0.b bVar = (a0.b) this.f3233a;
        bVar.e(f.f3216e, new Long(this.f3234b));
        bVar.e(f.f3218g, new Integer(0));
        bVar.d(f.f3217f);
        return K3.k.f2288a;
    }
}
