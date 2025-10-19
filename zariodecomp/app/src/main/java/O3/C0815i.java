package o3;

import V2.o;
import X3.p;
import a.AbstractC0183a;
import e4.m;
import f4.C;
import i4.I;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: o3.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o3.1\i.smali */
public final class C0815i extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9258a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C f9260c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f9261d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0815i(C c5, k kVar, O3.d dVar) {
        super(2, dVar);
        this.f9260c = c5;
        this.f9261d = kVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0815i c0815i = new C0815i(this.f9260c, this.f9261d, dVar);
        c0815i.f9259b = obj;
        return c0815i;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0815i) create((V2.p) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        Object objK;
        C0813g c0813g;
        String email;
        List cycles;
        P3.a aVar = P3.a.f2678a;
        int i = this.f9258a;
        K3.k kVar = K3.k.f2288a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            o oVar = ((V2.p) this.f9259b).f3462b;
            k kVar2 = this.f9261d;
            if (oVar == null) {
                I i5 = kVar2.f9267c;
                C0813g c0813g2 = new C0813g(1022);
                i5.getClass();
                i5.M(null, c0813g2);
                return kVar;
            }
            I i6 = kVar2.f9267c;
            do {
                objK = i6.K();
                c0813g = (C0813g) objK;
                email = c0813g.f9248b;
                kotlin.jvm.internal.i.e(email, "email");
                cycles = c0813g.f9253g;
                kotlin.jvm.internal.i.e(cycles, "cycles");
            } while (!i6.J(objK, new C0813g(true, email, c0813g.f9249c, c0813g.f9250d, c0813g.f9251e, c0813g.f9252f, cycles, c0813g.h, c0813g.i, c0813g.f9254j)));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String str = oVar.f3453b;
            if (str != null && !m.q0(str)) {
                linkedHashSet.add(str);
            }
            String str2 = oVar.f3452a;
            String strA = str2 != null ? AbstractC0183a.A(str2) : null;
            if (strA == null) {
                strA = "";
            }
            if (!m.q0(strA)) {
                linkedHashSet.add(strA);
            }
            List listU0 = L3.j.u0(linkedHashSet);
            if (listU0.isEmpty()) {
                listU0 = p1.b.B("__none__");
            }
            O0.i iVarQ = ((S0.e) kVar2.f9266b).q(str2, listU0);
            C0814h c0814h = new C0814h(kVar2, oVar, null);
            this.f9258a = 1;
            if (i4.C.f(iVarQ, c0814h, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return kVar;
    }
}
