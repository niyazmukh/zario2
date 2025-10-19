package j4;

import a.AbstractC0183a;
import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\F.smali */
public final class F extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8066a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0613h f8068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(InterfaceC0613h interfaceC0613h, O3.d dVar) {
        super(2, dVar);
        this.f8068c = interfaceC0613h;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        F f2 = new F(this.f8068c, dVar);
        f2.f8067b = obj;
        return f2;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create(obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8066a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            Object obj2 = this.f8067b;
            this.f8066a = 1;
            if (this.f8068c.b(obj2, this) == aVar) {
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
