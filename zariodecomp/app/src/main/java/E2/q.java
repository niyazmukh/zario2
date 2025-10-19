package E2;

import G2.d;
import java.util.BitSet;
import x2.C1035a;
import x2.C1037c;
import z3.C1084h;
import z3.V;
import z3.X;
import z3.a0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\q.smali */
public final class q {

    /* renamed from: g, reason: collision with root package name */
    public static final V f1480g;
    public static final V h;
    public static final V i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile String f1481j;

    /* renamed from: a, reason: collision with root package name */
    public final F2.f f1482a;

    /* renamed from: b, reason: collision with root package name */
    public final C1037c f1483b;

    /* renamed from: c, reason: collision with root package name */
    public final C1035a f1484c;

    /* renamed from: d, reason: collision with root package name */
    public final t f1485d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1486e;

    /* renamed from: f, reason: collision with root package name */
    public final k f1487f;

    static {
        C1084h c1084h = a0.f11275d;
        BitSet bitSet = X.f11268d;
        f1480g = new V("x-goog-api-client", c1084h);
        h = new V("google-cloud-resource-prefix", c1084h);
        i = new V("x-goog-request-params", c1084h);
        f1481j = "gl-java/";
    }

    public q(F2.f fVar, C1037c c1037c, C1035a c1035a, B2.f fVar2, k kVar, t tVar) {
        this.f1482a = fVar;
        this.f1487f = kVar;
        this.f1483b = c1037c;
        this.f1484c = c1035a;
        this.f1485d = tVar;
        this.f1486e = "projects/" + fVar2.f310a + "/databases/" + fVar2.f311b;
    }

    public final a0 a() {
        boolean zE;
        int i5;
        a0 a0Var = new a0();
        a0Var.f(f1480g, f1481j + " fire/26.0.2 grpc/");
        a0Var.f(h, this.f1486e);
        a0Var.f(i, this.f1486e);
        k kVar = this.f1487f;
        if (kVar != null && kVar.f1464a.get() != null && kVar.f1465b.get() != null) {
            d dVar = (d) ((G2.g) kVar.f1464a.get());
            synchronized (dVar) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                G2.l lVar = (G2.l) dVar.f1848a.get();
                synchronized (lVar) {
                    zE = lVar.e(G2.l.f1863b, jCurrentTimeMillis);
                }
                if (zE) {
                    synchronized (lVar) {
                        lVar.f1866a.a(new G2.k(0, lVar, lVar.b(System.currentTimeMillis())));
                    }
                    i5 = 3;
                } else {
                    i5 = 1;
                }
            }
            int iC = t.h.c(i5);
            if (iC != 0) {
                a0Var.f(k.f1461d, Integer.toString(iC));
            }
            a0Var.f(k.f1462e, ((K2.b) kVar.f1465b.get()).a());
            l2.j jVar = kVar.f1466c;
            if (jVar != null) {
                String str = jVar.f8784b;
                if (str.length() != 0) {
                    a0Var.f(k.f1463f, str);
                }
            }
        }
        return a0Var;
    }
}
