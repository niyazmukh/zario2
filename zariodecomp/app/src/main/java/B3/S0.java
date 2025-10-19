package B3;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import z3.AbstractC1080d;
import z3.AbstractC1081e;
import z3.C1079c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\S0.smali */
public final class S0 extends AbstractC1080d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V0 f537d;

    public S0(V0 v02) {
        this.f537d = v02;
    }

    @Override // z3.AbstractC1080d
    public final AbstractC1081e n(com.google.android.gms.common.api.internal.F f2, C1079c c1079c) {
        Y0 y02 = this.f537d.f576g;
        Logger logger = Y0.f611g0;
        y02.getClass();
        Executor executor = c1079c.f11286b;
        Executor executor2 = executor == null ? y02.f654k : executor;
        Y0 y03 = this.f537d.f576g;
        C0088w c0088w = new C0088w(f2, executor2, c1079c, y03.f647d0, y03.f630M ? null : this.f537d.f576g.i.f924a.f1137d, this.f537d.f576g.f633P);
        this.f537d.f576g.getClass();
        c0088w.f1012p = this.f537d.f576g.f660q;
        return c0088w;
    }
}
