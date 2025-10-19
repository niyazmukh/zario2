package W;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\L.smali */
public final class L extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f3513a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f3515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(O o5, O3.d dVar) {
        super(2, dVar);
        this.f3515c = o5;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        L l4 = new L(this.f3515c, dVar);
        l4.f3514b = obj;
        return l4;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((a0) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f3513a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            a0 a0Var = (a0) this.f3514b;
            this.f3513a = 1;
            if (O.b(this.f3515c, a0Var, this) == aVar) {
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
