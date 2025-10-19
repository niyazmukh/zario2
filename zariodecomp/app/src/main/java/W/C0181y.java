package W;

import a.AbstractC0183a;
import f4.C0521u;
import i4.InterfaceC0612g;

/* renamed from: W.y, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\y.1.smali */
public final class C0181y extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f3683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f3684b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0181y(O o5, O3.d dVar) {
        super(2, dVar);
        this.f3684b = o5;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0181y(this.f3684b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0181y) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        P3.a aVar = P3.a.f2678a;
        int i = this.f3683a;
        K3.k kVar = K3.k.f2288a;
        O o5 = this.f3684b;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            this.f3683a = 1;
            Object objK = ((C0521u) o5.f3535m.f2873b).k(this);
            if (objK != aVar) {
                objK = kVar;
            }
            if (objK == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    AbstractC0183a.m0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        InterfaceC0612g interfaceC0612gE = i4.C.e(o5.f().f3617c, -1);
        U2.a aVar2 = new U2.a(o5, 1);
        this.f3683a = 2;
        return interfaceC0612gE.c(aVar2, this) == aVar ? aVar : kVar;
    }
}
