package T2;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\p.smali */
public final class p extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V2.n f3242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f3243c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(V2.n nVar, Integer num, O3.d dVar) {
        super(2, dVar);
        this.f3242b = nVar;
        this.f3243c = num;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        p pVar = new p(this.f3242b, this.f3243c, dVar);
        pVar.f3241a = obj;
        return pVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        p pVar = (p) create((a0.b) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        pVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        a0.b bVar = (a0.b) this.f3241a;
        V2.n nVar = this.f3242b;
        if (nVar != null) {
            bVar.e(f.f3212a, new Long(nVar.f3447a));
            bVar.e(f.f3213b, new Long(nVar.f3448b));
            bVar.e(f.f3214c, nVar.f3449c);
            bVar.e(f.f3215d, new Long(nVar.f3450d));
            Long l4 = nVar.f3451e;
            if (l4 != null) {
                bVar.e(f.f3216e, new Long(l4.longValue()));
            } else {
                bVar.d(f.f3216e);
            }
        } else {
            bVar.d(f.f3212a);
            bVar.d(f.f3213b);
            bVar.d(f.f3214c);
            bVar.d(f.f3215d);
            bVar.d(f.f3216e);
        }
        bVar.e(f.f3218g, new Integer(0));
        bVar.d(f.f3217f);
        bVar.e(f.h, Boolean.FALSE);
        bVar.d(f.i);
        bVar.e(f.f3219j, Boolean.TRUE);
        Integer num = this.f3243c;
        if (num != null) {
            bVar.e(f.f3220k, new Integer(num.intValue()));
        }
        return K3.k.f2288a;
    }
}
