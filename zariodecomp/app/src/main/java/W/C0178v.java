package W;

import a.AbstractC0183a;

/* renamed from: W.v, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\v.1.smali */
public final class C0178v extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f3671b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0178v(F f2, O3.d dVar) {
        super(1, dVar);
        this.f3671b = f2;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new C0178v(this.f3671b, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0178v) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f3670a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            this.f3670a = 1;
            obj = this.f3671b.invoke(this);
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
