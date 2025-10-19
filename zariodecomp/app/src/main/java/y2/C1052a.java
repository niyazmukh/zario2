package y2;

import N2.n0;
import java.util.Iterator;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\a.1.smali */
public final class C1052a extends j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1052a(B2.k kVar, i iVar, n0 n0Var, int i) {
        super(kVar, iVar, n0Var);
        this.f11077d = i;
    }

    @Override // y2.j, y2.k
    public final boolean d(B2.l lVar) {
        n0 n0VarF;
        switch (this.f11077d) {
            case 0:
                n0 n0VarF2 = lVar.f326e.f(this.f11112c);
                if (B2.p.f(n0VarF2)) {
                    Iterator it = n0VarF2.G().a().iterator();
                    while (it.hasNext()) {
                        if (B2.p.d(this.f11111b.G(), (n0) it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            case 1:
                n0 n0VarF3 = lVar.f326e.f(this.f11112c);
                if (!B2.p.f(n0VarF3) || !B2.p.d(n0VarF3.G(), this.f11111b)) {
                }
                break;
            default:
                n0 n0Var = this.f11111b;
                if (!B2.p.d(n0Var.G(), B2.p.f336b) && (n0VarF = lVar.f326e.f(this.f11112c)) != null && !n0VarF.S() && !B2.p.d(n0Var.G(), n0VarF)) {
                }
                break;
        }
        return false;
    }
}
