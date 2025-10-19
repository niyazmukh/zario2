package O0;

import S0.q;
import X3.p;
import a.AbstractC0183a;
import f4.C;
import i4.C0608c;
import i4.InterfaceC0612g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\O0\k.smali */
public final class k extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1.i f2630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f2631c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f2632d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h1.i iVar, q qVar, e eVar, O3.d dVar) {
        super(2, dVar);
        this.f2630b = iVar;
        this.f2631c = qVar;
        this.f2632d = eVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new k(this.f2630b, this.f2631c, this.f2632d, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f2629a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            h1.i iVar = this.f2630b;
            iVar.getClass();
            q qVar = this.f2631c;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) iVar.f7641b) {
                if (((P0.e) obj2).b(qVar)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(L3.l.a0(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                P0.e eVar = (P0.e) it.next();
                eVar.getClass();
                arrayList2.add(new C0608c(new P0.d(eVar, null), O3.j.f2661a, -2, h4.a.f7766a));
            }
            InterfaceC0612g interfaceC0612gG = i4.C.g(new i((InterfaceC0612g[]) L3.j.u0(arrayList2).toArray(new InterfaceC0612g[0]), 0));
            j jVar = new j(0, this.f2632d, qVar);
            this.f2629a = 1;
            if (interfaceC0612gG.c(jVar, this) == aVar) {
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
