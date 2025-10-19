package U2;

import X3.p;
import a.AbstractC0183a;
import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U2\c.smali */
public final class c extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f3318b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, O3.d dVar) {
        super(2, dVar);
        this.f3318b = lVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new c(this.f3318b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f3317a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            this.f3317a = 1;
            int i5 = l.f3376m;
            if (this.f3318b.d(true, this) == aVar) {
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
