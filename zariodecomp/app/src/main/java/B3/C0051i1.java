package B3;

import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import z3.AbstractC1083g;
import z3.C1084h;
import z3.InterfaceC1085i;

/* renamed from: B3.i1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\i1.1.smali */
public final class C0051i1 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0031c f826a;

    /* renamed from: b, reason: collision with root package name */
    public int f827b;

    /* renamed from: c, reason: collision with root package name */
    public final m2 f828c;

    /* renamed from: d, reason: collision with root package name */
    public final q2 f829d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1085i f830e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f831f;

    /* renamed from: k, reason: collision with root package name */
    public int f832k;

    /* renamed from: l, reason: collision with root package name */
    public int f833l;

    /* renamed from: m, reason: collision with root package name */
    public int f834m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f835n;

    /* renamed from: o, reason: collision with root package name */
    public D f836o;

    /* renamed from: p, reason: collision with root package name */
    public D f837p;

    /* renamed from: q, reason: collision with root package name */
    public long f838q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f839r;

    /* renamed from: s, reason: collision with root package name */
    public int f840s;

    /* renamed from: t, reason: collision with root package name */
    public int f841t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f842u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f843v;

    public C0051i1(AbstractC0031c abstractC0031c, int i, m2 m2Var, q2 q2Var) {
        C1084h c1084h = C1084h.f11313b;
        this.f833l = 1;
        this.f834m = 5;
        this.f837p = new D();
        this.f839r = false;
        this.f840s = -1;
        this.f842u = false;
        this.f843v = false;
        this.f826a = abstractC0031c;
        this.f830e = c1084h;
        this.f827b = i;
        this.f828c = m2Var;
        S0.f.l(q2Var, "transportTracer");
        this.f829d = q2Var;
    }

    public final void a() {
        if (this.f839r) {
            return;
        }
        boolean z4 = true;
        this.f839r = true;
        while (!this.f843v && this.f838q > 0 && m()) {
            try {
                int iC = t.h.c(this.f833l);
                if (iC == 0) {
                    l();
                } else {
                    if (iC != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid state: ");
                        int i = this.f833l;
                        sb.append(i != 1 ? i != 2 ? "null" : "BODY" : "HEADER");
                        throw new AssertionError(sb.toString());
                    }
                    k();
                    this.f838q--;
                }
            } catch (Throwable th) {
                this.f839r = false;
                throw th;
            }
        }
        if (this.f843v) {
            close();
            this.f839r = false;
            return;
        }
        if (this.f842u) {
            if (this.f837p.f393c != 0) {
                z4 = false;
            }
            if (z4) {
                close();
            }
        }
        this.f839r = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (e()) {
            return;
        }
        D d5 = this.f836o;
        boolean z4 = d5 != null && d5.f393c > 0;
        try {
            D d6 = this.f837p;
            if (d6 != null) {
                d6.close();
            }
            D d7 = this.f836o;
            if (d7 != null) {
                d7.close();
            }
            this.f837p = null;
            this.f836o = null;
            this.f826a.c(z4);
        } catch (Throwable th) {
            this.f837p = null;
            this.f836o = null;
            throw th;
        }
    }

    public final boolean e() {
        return this.f837p == null;
    }

    public final void k() {
        Object c0048h1;
        boolean z4 = false;
        int i = this.f840s;
        long j5 = this.f841t;
        m2 m2Var = this.f828c;
        for (AbstractC1083g abstractC1083g : m2Var.f910a) {
            abstractC1083g.d(i, j5);
        }
        this.f841t = 0;
        if (this.f835n) {
            InterfaceC1085i interfaceC1085i = this.f830e;
            if (interfaceC1085i == C1084h.f11313b) {
                throw new z3.m0(z3.k0.f11354m.g("Can't decode compressed gRPC message as compression not configured"));
            }
            try {
                D d5 = this.f836o;
                C1 c12 = D1.f396a;
                B1 b12 = new B1();
                S0.f.l(d5, "buffer");
                b12.f380a = d5;
                c0048h1 = new C0048h1(interfaceC1085i.c(b12), this.f827b, m2Var);
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        } else {
            long j6 = this.f836o.f393c;
            AbstractC1083g[] abstractC1083gArr = m2Var.f910a;
            for (AbstractC1083g abstractC1083g2 : abstractC1083gArr) {
                abstractC1083g2.f(j6);
            }
            D d6 = this.f836o;
            C1 c13 = D1.f396a;
            B1 b13 = new B1();
            S0.f.l(d6, "buffer");
            b13.f380a = d6;
            c0048h1 = b13;
        }
        this.f836o.getClass();
        this.f836o = null;
        AbstractC0031c abstractC0031c = this.f826a;
        g1.i iVar = new g1.i(4, z4);
        iVar.f7594b = c0048h1;
        abstractC0031c.f759j.s(iVar);
        this.f833l = 1;
        this.f834m = 5;
    }

    public final void l() {
        int iP = this.f836o.p();
        if ((iP & 254) != 0) {
            throw new z3.m0(z3.k0.f11354m.g("gRPC frame header malformed: reserved bits not zero"));
        }
        this.f835n = (iP & 1) != 0;
        D d5 = this.f836o;
        d5.a(4);
        int iP2 = d5.p() | (d5.p() << 24) | (d5.p() << 16) | (d5.p() << 8);
        this.f834m = iP2;
        if (iP2 < 0 || iP2 > this.f827b) {
            z3.k0 k0Var = z3.k0.f11352k;
            Locale locale = Locale.US;
            throw new z3.m0(k0Var.g("gRPC message exceeds maximum size " + this.f827b + ": " + iP2));
        }
        int i = this.f840s + 1;
        this.f840s = i;
        for (AbstractC1083g abstractC1083g : this.f828c.f910a) {
            abstractC1083g.c(i);
        }
        q2 q2Var = this.f829d;
        ((I0) q2Var.f953c).a();
        ((o2) q2Var.f952b).c();
        this.f833l = 2;
    }

    public final boolean m() throws Throwable {
        m2 m2Var = this.f828c;
        int i = 0;
        try {
            if (this.f836o == null) {
                this.f836o = new D();
            }
            int i5 = 0;
            while (true) {
                try {
                    int i6 = this.f834m - this.f836o.f393c;
                    if (i6 <= 0) {
                        if (i5 <= 0) {
                            return true;
                        }
                        this.f826a.a(i5);
                        if (this.f833l != 2) {
                            return true;
                        }
                        m2Var.a(i5);
                        this.f841t += i5;
                        return true;
                    }
                    int i7 = this.f837p.f393c;
                    if (i7 == 0) {
                        if (i5 > 0) {
                            this.f826a.a(i5);
                            if (this.f833l == 2) {
                                m2Var.a(i5);
                                this.f841t += i5;
                            }
                        }
                        return false;
                    }
                    int iMin = Math.min(i6, i7);
                    i5 += iMin;
                    this.f836o.t(this.f837p.l(iMin));
                } catch (Throwable th) {
                    int i8 = i5;
                    th = th;
                    i = i8;
                    if (i > 0) {
                        this.f826a.a(i);
                        if (this.f833l == 2) {
                            m2Var.a(i);
                            this.f841t += i;
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
