package k3;

import a.AbstractC0183a;
import i4.I;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\o.smali */
public final class o extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8339a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f8341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(O3.d dVar, u uVar) {
        super(2, dVar);
        this.f8341c = uVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        o oVar = new o(dVar, this.f8341c);
        oVar.f8340b = obj;
        return oVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((V2.p) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objC;
        I i;
        Object objK;
        P3.a aVar = P3.a.f2678a;
        int i5 = this.f8339a;
        u uVar = this.f8341c;
        if (i5 == 0) {
            AbstractC0183a.m0(obj);
            V2.o oVar = ((V2.p) this.f8340b).f3462b;
            this.f8339a = 1;
            objC = u.c(uVar, oVar, this);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
            objC = obj;
        }
        C0668i c0668i = (C0668i) objC;
        C0667h c0667hD = u.d(((C0671l) uVar.f8363g.K()).f8329d, c0668i);
        do {
            i = uVar.f8363g;
            objK = i.K();
        } while (!i.J(objK, C0671l.a((C0671l) objK, false, null, null, c0667hD, c0668i, uVar.g(c0667hD), false, 0L, null, 0L, 967)));
        return K3.k.f2288a;
    }
}
