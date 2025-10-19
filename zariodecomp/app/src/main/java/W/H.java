package W;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\H.smali */
public final class H extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f3500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q3.j f3501b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0162d f3502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(X3.p pVar, C0162d c0162d, O3.d dVar) {
        super(2, dVar);
        this.f3501b = (Q3.j) pVar;
        this.f3502c = c0162d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Q3.j, X3.p] */
    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new H(this.f3501b, this.f3502c, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Q3.j, X3.p] */
    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f3500a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            Object obj2 = this.f3502c.f3581b;
            this.f3500a = 1;
            obj = this.f3501b.invoke(obj2, this);
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
