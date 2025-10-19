package B3;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import z3.AbstractC1080d;
import z3.C1079c;
import z3.C1092p;

/* renamed from: B3.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\d.1.smali */
public abstract class AbstractC0034d extends i2 implements InterfaceC0091x {
    public static final Logger i = Logger.getLogger(AbstractC0034d.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public final q2 f781c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0047h0 f782d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f783e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f784f;

    /* renamed from: g, reason: collision with root package name */
    public z3.a0 f785g;
    public volatile boolean h;

    public AbstractC0034d(G2.e eVar, m2 m2Var, q2 q2Var, z3.a0 a0Var, C1079c c1079c, boolean z4) {
        S0.f.l(a0Var, "headers");
        S0.f.l(q2Var, "transportTracer");
        this.f781c = q2Var;
        this.f783e = !Boolean.TRUE.equals(c1079c.a(AbstractC0056k0.f869n));
        this.f784f = z4;
        if (z4) {
            this.f782d = new C0026a(this, a0Var, m2Var);
        } else {
            this.f782d = new C0060l1(this, eVar, m2Var);
            this.f785g = a0Var;
        }
    }

    @Override // B3.InterfaceC0091x
    public final void b(int i5) {
        this.f782d.b(i5);
    }

    @Override // B3.InterfaceC0091x
    public final void c(z3.r rVar) {
        C3.i iVar = ((C3.j) this).f1182n;
        S0.f.q("Already called start", iVar.f759j == null);
        S0.f.l(rVar, "decompressorRegistry");
        iVar.f760k = rVar;
    }

    @Override // B3.n2
    public final boolean d() {
        return ((C3.j) this).f1182n.e() && !this.h;
    }

    @Override // B3.InterfaceC0091x
    public final void e(g1.i iVar) {
        iVar.k(((C3.j) this).f1184p.f11280a.get(AbstractC1080d.f11299a), "remote_addr");
    }

    @Override // B3.InterfaceC0091x
    public final void f(C1092p c1092p) {
        z3.a0 a0Var = this.f785g;
        z3.V v4 = AbstractC0056k0.f860c;
        a0Var.a(v4);
        this.f785g.f(v4, Long.valueOf(Math.max(0L, c1092p.c(TimeUnit.NANOSECONDS))));
    }

    @Override // B3.InterfaceC0091x
    public final void g(InterfaceC0097z interfaceC0097z) {
        C3.j jVar = (C3.j) this;
        C3.i iVar = jVar.f1182n;
        S0.f.q("Already called setListener", iVar.f759j == null);
        S0.f.l(interfaceC0097z, "listener");
        iVar.f759j = interfaceC0097z;
        if (this.f784f) {
            return;
        }
        jVar.f1183o.w(this.f785g, (byte[]) null);
        this.f785g = null;
    }

    @Override // B3.InterfaceC0091x
    public final void h(z3.k0 k0Var) {
        S0.f.g("Should not cancel with OK status", !k0Var.e());
        this.h = true;
        K2.c cVar = ((C3.j) this).f1183o;
        cVar.getClass();
        J3.b.c();
        try {
            synchronized (((C3.j) cVar.b).f1182n.f1173w) {
                ((C3.j) cVar.b).f1182n.l(k0Var, true, null);
            }
            J3.b.f2098a.getClass();
        } catch (Throwable th) {
            try {
                J3.b.f2098a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // B3.InterfaceC0091x
    public final void k(int i5) {
        ((C3.j) this).f1182n.f752a.f827b = i5;
    }

    @Override // B3.InterfaceC0091x
    public final void m() {
        C3.j jVar = (C3.j) this;
        if (jVar.f1182n.f763n) {
            return;
        }
        jVar.f1182n.f763n = true;
        this.f782d.close();
    }

    public final void v(C3.t tVar, boolean z4, boolean z5, int i5) {
        q4.d dVar;
        S0.f.g("null frame before EOS", tVar != null || z4);
        K2.c cVar = ((C3.j) this).f1183o;
        cVar.getClass();
        J3.b.c();
        try {
            if (tVar == null) {
                dVar = C3.j.f1177r;
            } else {
                dVar = tVar.f1248a;
                int i6 = (int) dVar.f9515b;
                if (i6 > 0) {
                    C3.j jVar = (C3.j) cVar.b;
                    jVar.getClass();
                    C3.i iVar = jVar.f1182n;
                    synchronized (iVar.f753b) {
                        iVar.f756e += i6;
                    }
                }
            }
            synchronized (((C3.j) cVar.b).f1182n.f1173w) {
                C3.i.k(((C3.j) cVar.b).f1182n, dVar, z4, z5);
                q2 q2Var = ((C3.j) cVar.b).f781c;
                if (i5 == 0) {
                    q2Var.getClass();
                } else {
                    q2Var.getClass();
                    ((o2) q2Var.f952b).c();
                }
            }
            J3.b.f2098a.getClass();
        } catch (Throwable th) {
            try {
                J3.b.f2098a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
