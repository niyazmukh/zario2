package k3;

import a.AbstractC0183a;
import f4.C;
import i4.InterfaceC0612g;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\n.smali */
public final class n extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f8338b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(O3.d dVar, u uVar) {
        super(2, dVar);
        this.f8338b = uVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new n(dVar, this.f8338b);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8337a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            u uVar = this.f8338b;
            InterfaceC0612g interfaceC0612gG = i4.C.g(new O0.i(uVar.h, 4));
            U2.a aVar2 = new U2.a(uVar, 6);
            this.f8337a = 1;
            if (interfaceC0612gG.c(aVar2, this) == aVar) {
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
