package W;

import a.AbstractC0183a;

/* renamed from: W.q, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\q.1.smali */
public final class C0175q extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f3654b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0175q(j0 j0Var, O3.d dVar) {
        super(2, dVar);
        this.f3654b = j0Var;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0175q c0175q = new C0175q(this.f3654b, dVar);
        c0175q.f3653a = obj;
        return c0175q;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0175q) create((j0) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        j0 j0Var = (j0) this.f3653a;
        return Boolean.valueOf((j0Var instanceof C0162d) && j0Var.f3622a <= this.f3654b.f3622a);
    }
}
