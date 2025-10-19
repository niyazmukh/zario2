package e3;

import X3.p;
import a.AbstractC0183a;
import java.security.NoSuchAlgorithmException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e3.1\n.smali */
public final class n extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V2.o f6939b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(V2.o oVar, O3.d dVar) {
        super(2, dVar);
        this.f6939b = oVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        n nVar = new n(this.f6939b, dVar);
        nVar.f6938a = obj;
        return nVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) throws NoSuchAlgorithmException {
        n nVar = (n) create((a0.b) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        nVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        a0.b bVar = (a0.b) this.f6938a;
        bVar.e(AbstractC0480c.f6891a, Boolean.TRUE);
        a0.d dVar = AbstractC0480c.f6892b;
        V2.o oVar = this.f6939b;
        bVar.e(dVar, oVar.f3452a);
        a0.d dVar2 = AbstractC0480c.f6893c;
        String strA = oVar.f3453b;
        if (e4.m.q0(strA)) {
            strA = AbstractC0183a.A(oVar.f3452a);
        }
        bVar.e(dVar2, strA);
        bVar.e(AbstractC0480c.f6894d, oVar.f3454c);
        bVar.e(AbstractC0480c.f6895e, oVar.f3455d);
        bVar.e(AbstractC0480c.f6896f, oVar.f3456e.name());
        bVar.e(AbstractC0480c.f6897g, new Integer(oVar.f3457f));
        bVar.e(AbstractC0480c.h, new Integer(oVar.i));
        bVar.e(AbstractC0480c.i, new Integer(oVar.f3459j));
        bVar.e(AbstractC0480c.f6898j, Boolean.valueOf(oVar.f3460k));
        return K3.k.f2288a;
    }
}
