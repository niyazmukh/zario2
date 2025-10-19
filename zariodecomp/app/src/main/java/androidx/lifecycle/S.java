package androidx.lifecycle;

import a.AbstractC0183a;
import f4.N;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\S.smali */
public final class S extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f4615a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0242x f4617c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q3.j f4618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public S(C0242x c0242x, X3.p pVar, O3.d dVar) {
        super(2, dVar);
        this.f4617c = c0242x;
        this.f4618d = (Q3.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Q3.j, X3.p] */
    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        S s4 = new S(this.f4617c, this.f4618d, dVar);
        s4.f4616b = obj;
        return s4;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((S) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Q3.j, X3.p] */
    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f4615a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            f4.C c5 = (f4.C) this.f4616b;
            m4.e eVar = N.f7027a;
            f4.A a5 = ((g4.d) k4.n.f8401a).f7610f;
            Q q5 = new Q(this.f4617c, c5, this.f4618d, null);
            this.f4615a = 1;
            if (f4.E.B(a5, q5, this) == aVar) {
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
