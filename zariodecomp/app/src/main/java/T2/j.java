package T2;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\j.smali */
public final class j extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3232b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j5, O3.d dVar) {
        super(2, dVar);
        this.f3232b = j5;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        j jVar = new j(this.f3232b, dVar);
        jVar.f3231a = obj;
        return jVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((a0.b) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        jVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        a0.b bVar = (a0.b) this.f3231a;
        a0.d dVar = f.f3212a;
        bVar.e(f.h, Boolean.TRUE);
        bVar.e(f.i, new Long(this.f3232b));
        bVar.e(f.f3219j, Boolean.FALSE);
        return K3.k.f2288a;
    }
}
