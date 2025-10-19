package b3;

import a.AbstractC0183a;

/* renamed from: b3.t, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\t.1.smali */
public final class C0325t extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f5310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q3.j f5311b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0325t(X3.l lVar, O3.d dVar) {
        super(2, dVar);
        this.f5311b = (Q3.j) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Q3.j, X3.l] */
    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0325t(this.f5311b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0325t) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Q3.j, X3.l] */
    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f5310a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            this.f5310a = 1;
            obj = this.f5311b.invoke(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return obj;
    }
}
