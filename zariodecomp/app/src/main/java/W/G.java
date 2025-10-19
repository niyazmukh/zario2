package W;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\G.smali */
public final class G extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f3498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f3499b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(O o5, O3.d dVar) {
        super(2, dVar);
        this.f3499b = o5;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new G(this.f3499b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        P3.a aVar = P3.a.f2678a;
        int i = this.f3498a;
        O o5 = this.f3499b;
        try {
            if (i == 0) {
                AbstractC0183a.m0(obj);
                if (o5.f3534l.s() instanceof Z) {
                    return o5.f3534l.s();
                }
                this.f3498a = 1;
                if (o5.h(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0183a.m0(obj);
                    return (j0) obj;
                }
                AbstractC0183a.m0(obj);
            }
            this.f3498a = 2;
            obj = O.d(o5, false, this);
            if (obj == aVar) {
                return aVar;
            }
            return (j0) obj;
        } catch (Throwable th) {
            return new b0(-1, th);
        }
    }
}
