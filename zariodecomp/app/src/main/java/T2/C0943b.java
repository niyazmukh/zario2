package t2;

import K3.k;
import Q3.j;
import X3.l;
import X3.p;
import a.AbstractC0183a;

/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t2.1\b.smali */
public final class C0943b extends j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f10183b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0943b(l lVar, O3.d dVar) {
        super(2, dVar);
        this.f10183b = lVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0943b c0943b = new C0943b(this.f10183b, dVar);
        c0943b.f10182a = obj;
        return c0943b;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        C0943b c0943b = (C0943b) create((a0.b) obj, (O3.d) obj2);
        k kVar = k.f2288a;
        c0943b.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        this.f10183b.invoke((a0.b) this.f10182a);
        return k.f2288a;
    }
}
