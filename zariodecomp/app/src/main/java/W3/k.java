package w3;

import X3.p;
import a.AbstractC0183a;
import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w3.1\k.smali */
public final class k extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f11005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f11006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u3.h f11007c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, u3.h hVar, O3.d dVar) {
        super(2, dVar);
        this.f11006b = lVar;
        this.f11007c = hVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new k(this.f11006b, this.f11007c, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f11005a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            this.f11005a = 1;
            if (l.a(this.f11006b, this.f11007c, this) == aVar) {
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
