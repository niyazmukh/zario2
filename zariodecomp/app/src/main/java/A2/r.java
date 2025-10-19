package A2;

import a.AbstractC0183a;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import x2.C1038d;
import y2.C1048A;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\r.smali */
public final class r {

    /* renamed from: m, reason: collision with root package name */
    public static final long f232m = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: a, reason: collision with root package name */
    public final S0.f f233a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0007g f234b;

    /* renamed from: c, reason: collision with root package name */
    public D f235c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0001a f236d;

    /* renamed from: e, reason: collision with root package name */
    public final J f237e;

    /* renamed from: f, reason: collision with root package name */
    public C0009i f238f;

    /* renamed from: g, reason: collision with root package name */
    public final G f239g;
    public final S0.c h;
    public final f0 i;

    /* renamed from: j, reason: collision with root package name */
    public final SparseArray f240j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f241k;

    /* renamed from: l, reason: collision with root package name */
    public final C3.w f242l;

    public r(S0.f fVar, G g3, C1038d c1038d) {
        AbstractC0183a.N(fVar.N(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.f233a = fVar;
        this.f239g = g3;
        f0 f0VarK = fVar.K();
        this.i = f0VarK;
        C3.w wVar = new C3.w(0, f0VarK.h());
        wVar.f1258a += 2;
        this.f242l = wVar;
        this.f237e = fVar.I();
        S0.c cVar = new S0.c(2);
        this.h = cVar;
        this.f240j = new SparseArray();
        this.f241k = new HashMap();
        fVar.H().r(cVar);
        c(c1038d);
    }

    public static boolean d(g0 g0Var, g0 g0Var2, E2.z zVar) {
        if (g0Var.f199g.isEmpty()) {
            return true;
        }
        long j5 = g0Var2.f197e.f334a.f8792a - g0Var.f197e.f334a.f8792a;
        long j6 = f232m;
        if (j5 >= j6) {
            return true;
        }
        if (g0Var2.f198f.f334a.f8792a - g0Var.f198f.f334a.f8792a >= j6) {
            return true;
        }
        if (zVar == null) {
            return false;
        }
        return zVar.f1519e.f9681a.size() + (zVar.f1518d.f9681a.size() + zVar.f1517c.f9681a.size()) > 0;
    }

    public final g0 a(C1048A c1048a) {
        int i;
        g0 g0VarA = this.i.a(c1048a);
        if (g0VarA != null) {
            i = g0VarA.f194b;
        } else {
            C0023x c0023x = new C0023x();
            this.f233a.W("Allocate target", new RunnableC0016p(this, c0023x, c1048a, 0));
            i = c0023x.f256a;
            g0VarA = (g0) c0023x.f257b;
        }
        SparseArray sparseArray = this.f240j;
        if (sparseArray.get(i) == null) {
            sparseArray.put(i, g0VarA);
            this.f241k.put(c1048a, Integer.valueOf(i));
        }
        return g0VarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final S0.v b(y2.v r13, boolean r14) {
        /*
            r12 = this;
            r0 = 1
            y2.A r1 = r13.g()
            java.util.HashMap r2 = r12.f241k
            java.lang.Object r2 = r2.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            A2.f0 r3 = r12.i
            if (r2 == 0) goto L1e
            android.util.SparseArray r1 = r12.f240j
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.get(r2)
            A2.g0 r1 = (A2.g0) r1
            goto L22
        L1e:
            A2.g0 r1 = r3.a(r1)
        L22:
            B2.o r2 = B2.o.f333b
            s2.e r4 = B2.h.f314c
            if (r1 == 0) goto L31
            int r4 = r1.f194b
            s2.e r4 = r3.c(r4)
            B2.o r1 = r1.f198f
            goto L32
        L31:
            r1 = r2
        L32:
            if (r14 == 0) goto L35
            goto L36
        L35:
            r1 = r2
        L36:
            A2.G r12 = r12.f239g
            boolean r14 = r12.f86a
            r3 = 0
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "initialize() not called"
            a.AbstractC0183a.N(r14, r6, r5)
            s2.c r14 = r12.g(r13)
            if (r14 == 0) goto L4a
            goto Ld9
        L4a:
            boolean r14 = r13.f()
            java.lang.String r5 = "QueryEngine"
            r6 = 0
            if (r14 == 0) goto L55
        L53:
            r14 = r6
            goto Lba
        L55:
            boolean r14 = r1.equals(r2)
            if (r14 == 0) goto L5c
            goto L53
        L5c:
            java.lang.Object r14 = r12.f87b
            A2.i r14 = (A2.C0009i) r14
            s2.c r14 = r14.G(r4)
            s2.e r14 = A2.G.b(r13, r14)
            s2.c r2 = r4.f9681a
            int r2 = r2.size()
            boolean r2 = A2.G.e(r13, r2, r14, r1)
            if (r2 == 0) goto L75
            goto L53
        L75:
            java.lang.String r2 = r1.toString()
            java.lang.String r6 = r13.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r6}
            java.lang.String r6 = "Re-using previous result from %s to execute query: %s"
            p1.b.p(r0, r5, r6, r2)
            B2.b r2 = B2.b.f300d
            l2.o r1 = r1.f334a
            int r2 = r1.f8793b
            int r2 = r2 + r0
            B2.o r6 = new B2.o
            double r7 = (double) r2
            r9 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            long r8 = r1.f8792a
            if (r7 != 0) goto La4
            l2.o r1 = new l2.o
            r10 = 1
            long r8 = r8 + r10
            r1.<init>(r3, r8)
            goto La9
        La4:
            l2.o r1 = new l2.o
            r1.<init>(r2, r8)
        La9:
            r6.<init>(r1)
            B2.h r1 = B2.h.b()
            B2.b r2 = new B2.b
            r3 = -1
            r2.<init>(r6, r1, r3)
            s2.c r14 = r12.a(r14, r13, r2)
        Lba:
            if (r14 == 0) goto Lbd
            goto Ld9
        Lbd:
            G2.e r14 = new G2.e
            r14.<init>()
            java.lang.String r1 = r13.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Using full collection scan to execute query: %s"
            p1.b.p(r0, r5, r2, r1)
            java.lang.Object r12 = r12.f87b
            A2.i r12 = (A2.C0009i) r12
            B2.b r1 = B2.b.f300d
            s2.c r14 = r12.H(r13, r1, r14)
        Ld9:
            S0.v r12 = new S0.v
            r12.<init>(r0, r14, r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.r.b(y2.v, boolean):S0.v");
    }

    public final void c(C1038d c1038d) {
        S0.f fVar = this.f233a;
        InterfaceC0007g interfaceC0007gE = fVar.E(c1038d);
        this.f234b = interfaceC0007gE;
        this.f235c = fVar.F(c1038d, interfaceC0007gE);
        InterfaceC0001a interfaceC0001aD = fVar.D(c1038d);
        this.f236d = interfaceC0001aD;
        D d5 = this.f235c;
        InterfaceC0007g interfaceC0007g = this.f234b;
        J j5 = this.f237e;
        this.f238f = new C0009i(j5, d5, interfaceC0001aD, interfaceC0007g);
        j5.e(interfaceC0007g);
        C0009i c0009i = this.f238f;
        InterfaceC0007g interfaceC0007g2 = this.f234b;
        G g3 = this.f239g;
        g3.f87b = c0009i;
        g3.f88c = interfaceC0007g2;
        g3.f86a = true;
    }
}
