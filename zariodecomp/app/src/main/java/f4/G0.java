package f4;

import k4.r;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\G0.smali */
public final class G0 extends r {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f7021e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public G0(O3.d dVar, O3.i iVar) {
        H0 h02 = H0.f7022a;
        super(dVar, iVar.get(h02) == null ? iVar.plus(h02) : iVar);
        this.f7021e = new ThreadLocal();
        if (dVar.getContext().get(O3.e.f2660a) instanceof A) {
            return;
        }
        Object objN = k4.a.n(iVar, null);
        k4.a.i(iVar, objN);
        V(iVar, objN);
    }

    public final boolean U() {
        boolean z4 = this.threadLocalIsSet && this.f7021e.get() == null;
        this.f7021e.remove();
        return !z4;
    }

    public final void V(O3.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f7021e.set(new K3.e(iVar, obj));
    }

    @Override // k4.r, f4.t0
    public final void j(Object obj) {
        if (this.threadLocalIsSet) {
            K3.e eVar = (K3.e) this.f7021e.get();
            if (eVar != null) {
                k4.a.i((O3.i) eVar.f2277a, eVar.f2278b);
            }
            this.f7021e.remove();
        }
        Object objV = E.v(obj);
        O3.d dVar = this.f8406d;
        O3.i context = dVar.getContext();
        Object objN = k4.a.n(context, null);
        G0 g0A = objN != k4.a.f8368d ? E.A(dVar, context, objN) : null;
        try {
            this.f8406d.resumeWith(objV);
        } finally {
            if (g0A == null || g0A.U()) {
                k4.a.i(context, objN);
            }
        }
    }
}
