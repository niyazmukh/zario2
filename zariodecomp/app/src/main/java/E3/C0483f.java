package e3;

import X3.p;
import a.AbstractC0183a;

/* renamed from: e3.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e3.1\f.smali */
public final class C0483f extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f6909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0483f(kotlin.jvm.internal.p pVar, int i, O3.d dVar) {
        super(2, dVar);
        this.f6909b = pVar;
        this.f6910c = i;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0483f c0483f = new C0483f(this.f6909b, this.f6910c, dVar);
        c0483f.f6908a = obj;
        return c0483f;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        C0483f c0483f = (C0483f) create((a0.b) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        c0483f.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        a0.b bVar = (a0.b) this.f6908a;
        a0.d dVar = AbstractC0480c.f6891a;
        a0.d dVar2 = AbstractC0480c.f6897g;
        Integer num = (Integer) bVar.c(dVar2);
        int iW = S0.f.w((num != null ? num.intValue() : 100) + this.f6910c, 0, 10000);
        kotlin.jvm.internal.p pVar = this.f6909b;
        pVar.f8429a = iW;
        bVar.e(dVar2, new Integer(pVar.f8429a));
        return K3.k.f2288a;
    }
}
