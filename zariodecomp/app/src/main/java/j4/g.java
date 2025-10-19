package j4;

import a.AbstractC0183a;
import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\g.smali */
public final class g extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8083a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f8085c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, O3.d dVar) {
        super(2, dVar);
        this.f8085c = hVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        g gVar = new g(this.f8085c, dVar);
        gVar.f8084b = obj;
        return gVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC0613h) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8083a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            InterfaceC0613h interfaceC0613h = (InterfaceC0613h) this.f8084b;
            this.f8083a = 1;
            if (this.f8085c.f(interfaceC0613h, this) == aVar) {
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
