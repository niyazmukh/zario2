package I3;

import z3.AbstractC1080d;
import z3.AbstractC1098w;
import z3.EnumC1087k;
import z3.H;
import z3.K;
import z3.L;
import z3.M;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\h.smali */
public final class h extends a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1946d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1947e;

    public /* synthetic */ h(Object obj, int i) {
        this.f1946d = i;
        this.f1947e = obj;
    }

    @Override // I3.a, z3.AbstractC1080d
    public AbstractC1098w g(H h) {
        switch (this.f1946d) {
            case 0:
                L l4 = (L) h.c();
                AbstractC1098w abstractC1098wG = super.g(h);
                if (l4 != null) {
                    return abstractC1098wG.c().f11280a.get(M.f11255d) == null ? new g(abstractC1098wG, l4) : abstractC1098wG;
                }
                return abstractC1098wG;
            default:
                return super.g(h);
        }
    }

    @Override // I3.a, z3.AbstractC1080d
    public void r(EnumC1087k enumC1087k, K k5) {
        switch (this.f1946d) {
            case 1:
                i iVar = (i) this.f1947e;
                if (iVar.g.f1984f.containsKey(iVar.a)) {
                    iVar.d = enumC1087k;
                    iVar.e = k5;
                    if (!iVar.f) {
                        w wVar = iVar.g;
                        if (!wVar.h) {
                            if (enumC1087k == EnumC1087k.f11344d) {
                                iVar.b.e();
                            }
                            wVar.j();
                            break;
                        }
                    }
                }
                break;
            default:
                super.r(enumC1087k, k5);
                break;
        }
    }

    @Override // I3.a
    public final AbstractC1080d s() {
        switch (this.f1946d) {
            case 0:
                return (AbstractC1080d) this.f1947e;
            default:
                return ((i) this.f1947e).g.f1985g;
        }
    }
}
