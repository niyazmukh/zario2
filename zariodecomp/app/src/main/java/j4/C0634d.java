package j4;

import a.AbstractC0183a;
import i4.InterfaceC0613h;

/* renamed from: j4.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\d.1.smali */
public final class C0634d extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8073a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0613h f8075c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0636f f8076d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0634d(InterfaceC0613h interfaceC0613h, AbstractC0636f abstractC0636f, O3.d dVar) {
        super(2, dVar);
        this.f8075c = interfaceC0613h;
        this.f8076d = abstractC0636f;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0634d c0634d = new C0634d(this.f8075c, this.f8076d, dVar);
        c0634d.f8074b = obj;
        return c0634d;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0634d) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8073a;
        K3.k kVar = K3.k.f2288a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            f4.C c5 = (f4.C) this.f8074b;
            AbstractC0636f abstractC0636f = this.f8076d;
            int i5 = abstractC0636f.f8081b;
            if (i5 == -3) {
                i5 = -2;
            }
            f4.D d5 = f4.D.f7004c;
            X3.p c0635e = new C0635e(abstractC0636f, null);
            h4.u uVar = new h4.u(f4.E.u(c5, abstractC0636f.f8080a), AbstractC0183a.c(i5, 4, abstractC0636f.f8082c));
            uVar.T(d5, uVar, c0635e);
            this.f8073a = 1;
            Object objH = i4.C.h(this.f8075c, uVar, true, this);
            if (objH != aVar) {
                objH = kVar;
            }
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return kVar;
    }
}
