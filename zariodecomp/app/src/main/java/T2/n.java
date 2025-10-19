package T2;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\n.smali */
public final class n extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3239b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z4, O3.d dVar) {
        super(2, dVar);
        this.f3239b = z4;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        n nVar = new n(this.f3239b, dVar);
        nVar.f3238a = obj;
        return nVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) create((a0.b) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        nVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        a0.b bVar = (a0.b) this.f3238a;
        Boolean bool = (Boolean) bVar.c(f.f3219j);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        if (this.f3239b || zBooleanValue) {
            bVar.e(f.h, Boolean.FALSE);
            bVar.d(f.i);
        }
        return K3.k.f2288a;
    }
}
