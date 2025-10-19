package e3;

import X3.p;
import a.AbstractC0183a;
import f4.C;
import i4.InterfaceC0612g;

/* renamed from: e3.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e3.1\b.smali */
public final class C0479b extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f6890b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0479b(o oVar, O3.d dVar) {
        super(2, dVar);
        this.f6890b = oVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0479b(this.f6890b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0479b) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f6889a;
        K3.k kVar = K3.k.f2288a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            o oVar = this.f6890b;
            InterfaceC0612g interfaceC0612gP = oVar.f6943d.p();
            U2.a aVar2 = new U2.a(oVar, 2);
            this.f6889a = 1;
            Object objC = interfaceC0612gP.c(new O0.j(3, aVar2, oVar), this);
            if (objC != aVar) {
                objC = kVar;
            }
            if (objC == aVar) {
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
