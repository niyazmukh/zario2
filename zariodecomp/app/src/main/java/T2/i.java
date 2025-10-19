package T2;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\i.smali */
public final class i extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f3230b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlin.jvm.internal.p pVar, O3.d dVar) {
        super(2, dVar);
        this.f3230b = pVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        i iVar = new i(this.f3230b, dVar);
        iVar.f3229a = obj;
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
        a0.b bVar = (a0.b) this.f3229a;
        a0.d dVar = f.f3212a;
        a0.d dVar2 = f.f3220k;
        Integer num = (Integer) bVar.c(dVar2);
        int iIntValue = (num != null ? num.intValue() : 0) + 1;
        this.f3230b.f8429a = iIntValue;
        bVar.e(dVar2, new Integer(iIntValue));
        return K3.k.f2288a;
    }
}
