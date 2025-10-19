package f4;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\Q.smali */
public final class Q extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7029e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f7030f;

    public /* synthetic */ Q(Object obj, int i) {
        this.f7029e = i;
        this.f7030f = obj;
    }

    @Override // f4.k0
    public final boolean j() {
        switch (this.f7029e) {
        }
        return false;
    }

    @Override // f4.k0
    public final void k(Throwable th) {
        switch (this.f7029e) {
            case 0:
                ((P) this.f7030f).a();
                return;
            case 1:
                ((X3.l) this.f7030f).invoke(th);
                return;
            case 2:
                t0 t0Var = (t0) this.f7030f;
                t0Var.getClass();
                Object obj = t0.f7098a.get(t0Var);
                if (!(obj instanceof C0524x)) {
                    E.z(obj);
                }
                throw null;
            default:
                Object obj2 = t0.f7098a.get(i());
                boolean z4 = obj2 instanceof C0524x;
                l0 l0Var = (l0) this.f7030f;
                if (z4) {
                    l0Var.resumeWith(AbstractC0183a.v(((C0524x) obj2).f7107a));
                    return;
                } else {
                    l0Var.resumeWith(E.z(obj2));
                    return;
                }
        }
    }

    public Q(t0 t0Var) {
        this.f7029e = 2;
        this.f7030f = t0Var;
    }
}
