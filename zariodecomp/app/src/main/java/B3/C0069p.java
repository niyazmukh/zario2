package B3;

import java.text.MessageFormat;
import java.util.logging.Level;
import z3.AbstractC1080d;
import z3.C1075D;
import z3.C1100z;

/* renamed from: B3.p, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\p.1.smali */
public final class C0069p extends AbstractC1080d {

    /* renamed from: d, reason: collision with root package name */
    public final r f932d;

    /* renamed from: e, reason: collision with root package name */
    public final o2 f933e;

    public C0069p(r rVar, o2 o2Var) {
        this.f932d = rVar;
        S0.f.l(o2Var, "time");
        this.f933e = o2Var;
    }

    public static Level t(int i) {
        int iC = t.h.c(i);
        return iC != 1 ? (iC == 2 || iC == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    @Override // z3.AbstractC1080d
    public final void l(int i, String str) {
        r rVar = this.f932d;
        C1075D c1075d = rVar.f956b;
        Level levelT = t(i);
        if (r.f954c.isLoggable(levelT)) {
            r.a(c1075d, levelT, str);
        }
        if (!s(i) || i == 1) {
            return;
        }
        int iC = t.h.c(i);
        z3.y yVar = iC != 2 ? iC != 3 ? z3.y.a : z3.y.c : z3.y.b;
        long jC = this.f933e.c();
        S0.f.l(str, "description");
        new C1100z(str, yVar, jC, null);
        synchronized (rVar.f955a) {
        }
    }

    @Override // z3.AbstractC1080d
    public final void m(int i, String str, Object... objArr) {
        l(i, (s(i) || r.f954c.isLoggable(t(i))) ? MessageFormat.format(str, objArr) : null);
    }

    public final boolean s(int i) {
        if (i != 1) {
            synchronized (this.f932d.f955a) {
            }
        }
        return false;
    }
}
