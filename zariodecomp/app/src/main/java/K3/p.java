package k3;

import a.AbstractC0183a;
import f4.C;
import i4.x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\p.smali */
public final class p extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f8343b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(O3.d dVar, u uVar) {
        super(2, dVar);
        this.f8343b = uVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new p(dVar, this.f8343b);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8342a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            u uVar = this.f8343b;
            x xVar = uVar.f8358b.f6945f;
            o oVar = new o(null, uVar);
            this.f8342a = 1;
            if (i4.C.f(xVar, oVar, this) == aVar) {
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
