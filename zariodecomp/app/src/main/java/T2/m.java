package T2;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\m.smali */
public final class m extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3237b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i, O3.d dVar) {
        super(2, dVar);
        this.f3237b = i;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        m mVar = new m(this.f3237b, dVar);
        mVar.f3236a = obj;
        return mVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) create((a0.b) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        mVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        a0.b bVar = (a0.b) this.f3236a;
        a0.d dVar = f.f3212a;
        a0.d dVar2 = f.f3218g;
        Integer num = (Integer) bVar.c(dVar2);
        int iIntValue = num != null ? num.intValue() : 0;
        int i = this.f3237b;
        if (i > iIntValue) {
            bVar.e(dVar2, new Integer(i));
            bVar.e(f.f3221l, new Long(System.currentTimeMillis()));
        }
        return K3.k.f2288a;
    }
}
