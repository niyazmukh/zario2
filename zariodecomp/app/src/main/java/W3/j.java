package w3;

import X3.p;
import a.AbstractC0183a;
import f4.C;
import f4.E;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w3.1\j.smali */
public final class j extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f11003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f11004b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, O3.d dVar) {
        super(2, dVar);
        this.f11004b = lVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new j(this.f11004b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f11003a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            this.f11003a = 1;
            if (E.h(750L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0183a.m0(obj);
                return K3.k.f2288a;
            }
            AbstractC0183a.m0(obj);
        }
        this.f11003a = 2;
        if (this.f11004b.b(this) == aVar) {
            return aVar;
        }
        return K3.k.f2288a;
    }
}
