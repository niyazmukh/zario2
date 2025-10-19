package U2;

import X3.p;
import a.AbstractC0183a;
import f4.C;
import i4.B;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U2\b.smali */
public final class b extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f3316b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, O3.d dVar) {
        super(2, dVar);
        this.f3316b = lVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new b(this.f3316b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        ((b) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
        return P3.a.f2678a;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f3315a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
            throw new B0.c();
        }
        AbstractC0183a.m0(obj);
        l lVar = this.f3316b;
        B b5 = lVar.f3379c.f10207b;
        a aVar2 = new a(lVar, 0);
        this.f3315a = 1;
        b5.getClass();
        B.L(b5, aVar2, this);
        return aVar;
    }
}
