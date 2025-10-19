package k4;

import f4.E;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\r.smali */
public class r extends f4.a implements Q3.d {

    /* renamed from: d, reason: collision with root package name */
    public final O3.d f8406d;

    public r(O3.d dVar, O3.i iVar) {
        super(iVar, true);
        this.f8406d = dVar;
    }

    @Override // f4.t0
    public final boolean C() {
        return true;
    }

    @Override // Q3.d
    public final Q3.d getCallerFrame() {
        O3.d dVar = this.f8406d;
        if (dVar instanceof Q3.d) {
            return (Q3.d) dVar;
        }
        return null;
    }

    @Override // f4.t0
    public void i(Object obj) {
        a.j(p1.b.x(this.f8406d), E.v(obj));
    }

    @Override // f4.t0
    public void j(Object obj) {
        this.f8406d.resumeWith(E.v(obj));
    }
}
