package e3;

import X3.p;
import a.AbstractC0183a;

/* renamed from: e3.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e3.1\l.smali */
public final class C0488l extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6931b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6932c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0488l(int i, int i5, O3.d dVar) {
        super(2, dVar);
        this.f6931b = i;
        this.f6932c = i5;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0488l c0488l = new C0488l(this.f6931b, this.f6932c, dVar);
        c0488l.f6930a = obj;
        return c0488l;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        C0488l c0488l = (C0488l) create((a0.b) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        c0488l.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        a0.b bVar = (a0.b) this.f6930a;
        a0.d dVar = AbstractC0480c.f6891a;
        bVar.e(AbstractC0480c.h, new Integer(this.f6931b));
        bVar.e(AbstractC0480c.i, new Integer(this.f6932c));
        bVar.e(AbstractC0480c.f6898j, Boolean.TRUE);
        return K3.k.f2288a;
    }
}
