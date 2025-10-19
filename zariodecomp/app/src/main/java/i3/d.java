package I3;

import B3.C0074q1;
import java.util.HashMap;
import java.util.List;
import z3.AbstractC1080d;
import z3.AbstractC1098w;
import z3.C1094s;
import z3.EnumC1087k;
import z3.H;
import z3.K;
import z3.M;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\d.smali */
public final class d extends a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1930d = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f1931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M f1932f;

    public d(e eVar) {
        this.f1932f = eVar;
    }

    @Override // I3.a, z3.AbstractC1080d
    public AbstractC1098w g(H h) {
        switch (this.f1930d) {
            case 1:
                h hVar = (h) this.f1931e;
                s sVar = this.f1932f;
                r rVar = new r(sVar, h, hVar);
                List list = h.f11242b;
                if (s.g(list)) {
                    l lVar = sVar.f;
                    if (((HashMap) lVar.f1957b).containsKey(((C1094s) list.get(0)).f11399a.get(0))) {
                        k kVar = (k) ((HashMap) sVar.f.f1957b).get(((C1094s) list.get(0)).f11399a.get(0));
                        kVar.a(rVar);
                        if (kVar.f1953d != null) {
                            rVar.r();
                        }
                    }
                }
                return rVar;
            default:
                return super.g(h);
        }
    }

    @Override // I3.a, z3.AbstractC1080d
    public final void r(EnumC1087k enumC1087k, K k5) {
        switch (this.f1930d) {
            case 0:
                M m5 = (M) this.f1931e;
                e eVar = (e) this.f1932f;
                M m6 = eVar.f1937k;
                EnumC1087k enumC1087k2 = EnumC1087k.f11342b;
                if (m5 != m6) {
                    if (m5 == eVar.i) {
                        boolean z4 = enumC1087k == enumC1087k2;
                        eVar.f1940n = z4;
                        if (!z4 && m6 != eVar.f1934f) {
                            eVar.h();
                            break;
                        } else {
                            eVar.f1935g.r(enumC1087k, k5);
                            break;
                        }
                    }
                } else {
                    S0.f.q("there's pending lb while current lb has been out of READY", eVar.f1940n);
                    eVar.f1938l = enumC1087k;
                    eVar.f1939m = k5;
                    if (enumC1087k == enumC1087k2) {
                        eVar.h();
                        break;
                    }
                }
                break;
            default:
                ((h) this.f1931e).r(enumC1087k, new C0074q1(k5));
                break;
        }
    }

    @Override // I3.a
    public final AbstractC1080d s() {
        switch (this.f1930d) {
            case 0:
                return ((e) this.f1932f).f1935g;
            default:
                return (h) this.f1931e;
        }
    }

    public d(s sVar, AbstractC1080d abstractC1080d) {
        this.f1932f = sVar;
        this.f1931e = new h(abstractC1080d, 0);
    }
}
