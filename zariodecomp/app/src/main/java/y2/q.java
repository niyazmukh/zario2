package y2;

import N2.n0;
import a.AbstractC0183a;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\q.smali */
public final class q extends j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11130d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11131e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(B2.k kVar, i iVar, n0 n0Var) {
        super(kVar, iVar, n0Var);
        this.f11130d = 2;
        AbstractC0183a.N(B2.p.i(n0Var), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
        this.f11131e = B2.h.c(n0Var.O());
    }

    public static ArrayList h(i iVar, n0 n0Var) {
        AbstractC0183a.N(iVar == i.IN || iVar == i.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        AbstractC0183a.N(B2.p.f(n0Var), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (n0 n0Var2 : n0Var.G().a()) {
            AbstractC0183a.N(B2.p.i(n0Var2), B.a.m(new StringBuilder("Comparing on key with "), iVar.f11109a, ", but an array value was not a ReferenceValue"), new Object[0]);
            arrayList.add(B2.h.c(n0Var2.O()));
        }
        return arrayList;
    }

    @Override // y2.j, y2.k
    public final boolean d(B2.l lVar) {
        switch (this.f11130d) {
            case 0:
                return ((ArrayList) this.f11131e).contains(lVar.f322a);
            case 1:
                return !((ArrayList) this.f11131e).contains(lVar.f322a);
            default:
                return g(lVar.f322a.compareTo((B2.h) this.f11131e));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(B2.k kVar, n0 n0Var, int i) {
        this.f11130d = i;
        switch (i) {
            case 1:
                i iVar = i.NOT_IN;
                super(kVar, iVar, n0Var);
                ArrayList arrayList = new ArrayList();
                this.f11131e = arrayList;
                arrayList.addAll(h(iVar, n0Var));
                break;
            default:
                i iVar2 = i.IN;
                super(kVar, iVar2, n0Var);
                ArrayList arrayList2 = new ArrayList();
                this.f11131e = arrayList2;
                arrayList2.addAll(h(iVar2, n0Var));
                break;
        }
    }
}
