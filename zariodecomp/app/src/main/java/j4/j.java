package j4;

import a.AbstractC0183a;
import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\j.smali */
public final class j extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f8088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0613h f8089c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, InterfaceC0613h interfaceC0613h, Object obj, O3.d dVar) {
        super(2, dVar);
        this.f8088b = nVar;
        this.f8089c = interfaceC0613h;
        this.f8090d = obj;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new j(this.f8088b, this.f8089c, this.f8090d, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8087a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            Q3.j jVar = this.f8088b.f8104e;
            this.f8087a = 1;
            if (jVar.c(this.f8089c, this.f8090d, this) == aVar) {
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
