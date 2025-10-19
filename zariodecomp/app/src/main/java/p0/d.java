package P0;

import J0.t;
import K3.k;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import h4.v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\P0\d.smali */
public final class d extends j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2670a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2671b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f2672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, O3.d dVar) {
        super(2, dVar);
        this.f2672c = eVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        d dVar2 = new d(this.f2672c, dVar);
        dVar2.f2671b = obj;
        return dVar2;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((v) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f2670a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            v vVar = (v) this.f2671b;
            e eVar = this.f2672c;
            c cVar = new c(eVar, vVar);
            Q0.f fVar = eVar.f2673a;
            fVar.getClass();
            synchronized (fVar.f2716c) {
                try {
                    if (fVar.f2717d.add(cVar)) {
                        if (fVar.f2717d.size() == 1) {
                            fVar.f2718e = fVar.a();
                            t.d().a(Q0.g.f2719a, fVar.getClass().getSimpleName() + ": initial state = " + fVar.f2718e);
                            fVar.c();
                        }
                        cVar.a(fVar.f2718e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            b bVar = new b(0, this.f2672c, cVar);
            this.f2670a = 1;
            if (p1.b.e(vVar, bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return k.f2288a;
    }
}
