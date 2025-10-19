package W;

import a.AbstractC0183a;
import i4.InterfaceC0613h;

/* renamed from: W.o, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\o.1.smali */
public final class C0173o extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f3650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f3651b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0173o(O o5, O3.d dVar) {
        super(2, dVar);
        this.f3651b = o5;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0173o(this.f3651b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0173o) create((InterfaceC0613h) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f3650a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            this.f3650a = 1;
            if (O.c(this.f3651b, this) == aVar) {
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
