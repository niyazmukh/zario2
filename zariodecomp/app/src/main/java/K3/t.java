package k3;

import a.AbstractC0183a;
import f4.C;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\t.smali */
public final class t extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V2.o f8352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f8353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(V2.o oVar, u uVar, O3.d dVar) {
        super(2, dVar);
        this.f8352b = oVar;
        this.f8353c = uVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new t(this.f8352b, this.f8353c, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8351a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            V2.o oVar = this.f8352b;
            String str = oVar.f3453b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (str != null && !e4.m.q0(str)) {
                linkedHashSet.add(str);
            }
            String str2 = oVar.f3452a;
            String strA = str2 != null ? AbstractC0183a.A(str2) : null;
            if (strA == null) {
                strA = "";
            }
            if (!e4.m.q0(strA)) {
                linkedHashSet.add(strA);
            }
            List listU0 = L3.j.u0(linkedHashSet);
            if (listU0.isEmpty()) {
                listU0 = p1.b.B("__none__");
            }
            O0.i iVarQ = ((S0.e) this.f8353c.f8357a).q(str2, listU0);
            this.f8351a = 1;
            obj = i4.C.j(iVarQ, this);
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
