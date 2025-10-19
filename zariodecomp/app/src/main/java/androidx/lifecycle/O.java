package androidx.lifecycle;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\O.smali */
public final class O extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public o4.a f4597a;

    /* renamed from: b, reason: collision with root package name */
    public Q3.j f4598b;

    /* renamed from: c, reason: collision with root package name */
    public int f4599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o4.c f4600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q3.j f4601e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O(o4.c cVar, X3.p pVar, O3.d dVar) {
        super(2, dVar);
        this.f4600d = cVar;
        this.f4601e = (Q3.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Q3.j, X3.p] */
    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new O(this.f4600d, this.f4601e, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X3.p] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o4.a] */
    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o4.c cVar;
        ?? r12;
        Throwable th;
        o4.a aVar;
        P3.a aVar2 = P3.a.f2678a;
        int i = this.f4599c;
        try {
            if (i == 0) {
                AbstractC0183a.m0(obj);
                cVar = this.f4600d;
                this.f4597a = cVar;
                Q3.j jVar = this.f4601e;
                this.f4598b = jVar;
                this.f4599c = 1;
                r12 = jVar;
                if (cVar.c(this) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = this.f4597a;
                    try {
                        AbstractC0183a.m0(obj);
                        ((o4.c) aVar).e(null);
                        return K3.k.f2288a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((o4.c) aVar).e(null);
                        throw th;
                    }
                }
                X3.p pVar = (X3.p) this.f4598b;
                ?? r32 = this.f4597a;
                AbstractC0183a.m0(obj);
                cVar = r32;
                r12 = pVar;
            }
            N n5 = new N((X3.p) r12, (O3.d) null);
            this.f4597a = cVar;
            this.f4598b = null;
            this.f4599c = 2;
            if (f4.E.g(n5, this) == aVar2) {
                return aVar2;
            }
            aVar = cVar;
            ((o4.c) aVar).e(null);
            return K3.k.f2288a;
        } catch (Throwable th3) {
            o4.c cVar2 = cVar;
            th = th3;
            aVar = cVar2;
            ((o4.c) aVar).e(null);
            throw th;
        }
    }
}
