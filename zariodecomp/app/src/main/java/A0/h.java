package a0;

import K3.k;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import java.util.LinkedHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a0.1\h.smali */
public final class h extends j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f4025a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4026b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f4027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(p pVar, O3.d dVar) {
        super(2, dVar);
        this.f4027c = (j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Q3.j, X3.p] */
    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        h hVar = new h(this.f4027c, dVar);
        hVar.f4026b = obj;
        return hVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((b) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [Q3.j, X3.p] */
    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f4025a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f4026b;
            AbstractC0183a.m0(obj);
            return bVar;
        }
        AbstractC0183a.m0(obj);
        b bVar2 = new b(new LinkedHashMap(((b) this.f4026b).a()), false);
        this.f4026b = bVar2;
        this.f4025a = 1;
        return this.f4027c.invoke(bVar2, this) == aVar ? aVar : bVar2;
    }
}
