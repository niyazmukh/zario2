package e3;

import X3.p;
import a.AbstractC0183a;

/* renamed from: e3.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e3.1\e.smali */
public final class C0482e extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f6906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0482e(kotlin.jvm.internal.p pVar, int i, O3.d dVar) {
        super(2, dVar);
        this.f6906b = pVar;
        this.f6907c = i;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0482e c0482e = new C0482e(this.f6906b, this.f6907c, dVar);
        c0482e.f6905a = obj;
        return c0482e;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        C0482e c0482e = (C0482e) create((a0.b) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        c0482e.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        a0.b bVar = (a0.b) this.f6905a;
        a0.d dVar = AbstractC0480c.f6891a;
        a0.d dVar2 = AbstractC0480c.f6897g;
        Integer num = (Integer) bVar.c(dVar2);
        int iW = S0.f.w((num != null ? num.intValue() : 100) + this.f6907c, 0, 10000);
        kotlin.jvm.internal.p pVar = this.f6906b;
        pVar.f8429a = iW;
        bVar.e(dVar2, new Integer(pVar.f8429a));
        return K3.k.f2288a;
    }
}
