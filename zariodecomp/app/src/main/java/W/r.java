package W;

import a.AbstractC0183a;
import java.io.IOException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\r.smali */
public final class r extends Q3.j implements X3.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3655a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f3656b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3657c;

    public /* synthetic */ r(int i, O3.d dVar) {
        super(i, dVar);
    }

    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f3655a) {
            case 0:
                return new r((O) this.f3657c, (O3.d) obj3).invokeSuspend(K3.k.f2288a);
            default:
                ((Boolean) obj2).getClass();
                r rVar = new r(3, (O3.d) obj3);
                rVar.f3657c = (Q) obj;
                return rVar.invokeSuspend(K3.k.f2288a);
        }
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws IOException {
        switch (this.f3655a) {
            case 0:
                P3.a aVar = P3.a.f2678a;
                int i = this.f3656b;
                if (i == 0) {
                    AbstractC0183a.m0(obj);
                    this.f3656b = 1;
                    if (O.a((O) this.f3657c, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0183a.m0(obj);
                }
                return K3.k.f2288a;
            default:
                P3.a aVar2 = P3.a.f2678a;
                int i5 = this.f3656b;
                if (i5 == 0) {
                    AbstractC0183a.m0(obj);
                    Q q5 = (Q) this.f3657c;
                    this.f3656b = 1;
                    q5.getClass();
                    obj = Q.a(q5, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0183a.m0(obj);
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(O o5, O3.d dVar) {
        super(3, dVar);
        this.f3657c = o5;
    }
}
