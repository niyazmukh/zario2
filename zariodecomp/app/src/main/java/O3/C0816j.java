package o3;

import X3.p;
import a.AbstractC0183a;
import f4.C;
import i4.x;

/* renamed from: o3.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o3.1\j.smali */
public final class C0816j extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9262a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f9264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0816j(k kVar, O3.d dVar) {
        super(2, dVar);
        this.f9264c = kVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0816j c0816j = new C0816j(this.f9264c, dVar);
        c0816j.f9263b = obj;
        return c0816j;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0816j) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f9262a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            C c5 = (C) this.f9263b;
            k kVar = this.f9264c;
            x xVar = kVar.f9265a.f6945f;
            C0815i c0815i = new C0815i(c5, kVar, null);
            this.f9262a = 1;
            if (i4.C.f(xVar, c0815i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return K3.k.f2288a;
    }
}
