package t2;

import K3.k;
import Q3.j;
import X3.p;
import a.AbstractC0183a;

/* renamed from: t2.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t2.1\f.smali */
public final class C0947f extends j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.d f10193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f10194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0947f(a0.d dVar, Long l4, O3.d dVar2) {
        super(2, dVar2);
        this.f10193b = dVar;
        this.f10194c = l4;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0947f c0947f = new C0947f(this.f10193b, this.f10194c, dVar);
        c0947f.f10192a = obj;
        return c0947f;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        C0947f c0947f = (C0947f) create((a0.b) obj, (O3.d) obj2);
        k kVar = k.f2288a;
        c0947f.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        ((a0.b) this.f10192a).e(this.f10193b, this.f10194c);
        return k.f2288a;
    }
}
