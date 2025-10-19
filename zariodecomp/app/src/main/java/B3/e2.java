package B3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\e2.smali */
public final class e2 extends i2 {
    @Override // B3.i2
    public final boolean r(f2 f2Var) {
        synchronized (f2Var) {
            try {
                if (f2Var.f808c != 0) {
                    return false;
                }
                f2Var.f808c = -1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B3.i2
    public final void s(f2 f2Var) {
        synchronized (f2Var) {
            f2Var.f808c = 0;
        }
    }
}
