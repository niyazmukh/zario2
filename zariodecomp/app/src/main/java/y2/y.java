package y2;

import A2.C0006f;
import A2.C0009i;
import A2.C0020u;
import A2.C0021v;
import A2.C0024y;
import A2.X;
import A2.e0;
import a.AbstractC0183a;
import android.content.Context;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\y.smali */
public final class y extends t {
    @Override // y2.t
    public final e0 a(C0009i c0009i) {
        S0.f fVar = this.f11137c;
        AbstractC0183a.O(fVar, "persistence not initialized yet", new Object[0]);
        C0024y c0024y = (C0024y) ((X) fVar).f148f.f127d;
        A2.r rVarD = d();
        c0024y.getClass();
        return new C0020u(c0024y, (F2.f) c0009i.f205c, rVarD);
    }

    @Override // y2.t
    public final C0006f b(C0009i c0009i) {
        S0.f fVar = this.f11137c;
        AbstractC0183a.O(fVar, "persistence not initialized yet", new Object[0]);
        return new C0006f(fVar, (F2.f) c0009i.f205c, d());
    }

    @Override // y2.t
    public final S0.f c(C0009i c0009i) {
        S0.l lVar = (S0.l) this.f11136b.f1093c;
        AbstractC0183a.O(lVar, "remoteSerializer not initialized yet", new Object[0]);
        K2.c cVar = new K2.c(lVar, 1);
        w2.r rVar = this.f11135a;
        w2.v vVar = rVar.f10961e;
        long j5 = vVar != null ? vVar.f10970a : rVar.f10960d;
        C0021v c0021v = new C0021v();
        c0021v.f254a = j5;
        C0020u c0020u = (C0020u) c0009i.f206d;
        return new X((Context) c0009i.f204b, (String) c0020u.f252d, (B2.f) c0020u.f251c, cVar, c0021v);
    }
}
