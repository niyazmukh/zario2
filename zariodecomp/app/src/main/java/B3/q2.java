package B3;

import A2.C0020u;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\q2.smali */
public final class q2 implements InterfaceC0097z {

    /* renamed from: d, reason: collision with root package name */
    public static final o2 f950d = new o2(18);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f951a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f952b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f953c;

    public /* synthetic */ q2(int i, Object obj, Object obj2) {
        this.f951a = i;
        this.f953c = obj;
        this.f952b = obj2;
    }

    @Override // B3.InterfaceC0097z
    public void b() {
        switch (this.f951a) {
            case 2:
                ((InterfaceC0097z) this.f952b).b();
                break;
            default:
                N0 n02 = (N0) this.f953c;
                if (n02.d()) {
                    n02.f474c.execute(new U1(this, 1));
                    break;
                }
                break;
        }
    }

    @Override // B3.InterfaceC0097z
    public void f(z3.a0 a0Var) {
        AtomicInteger atomicInteger;
        int i;
        int i5;
        switch (this.f951a) {
            case 2:
                ((InterfaceC0097z) this.f952b).f(a0Var);
                break;
            default:
                if (((V1) this.f952b).f580d > 0) {
                    z3.V v4 = N0.f465E;
                    a0Var.a(v4);
                    a0Var.f(v4, String.valueOf(((V1) this.f952b).f580d));
                }
                N0 n02 = (N0) this.f953c;
                V1 v12 = (V1) this.f952b;
                z3.V v5 = N0.f465E;
                I1 i1O = n02.o(v12);
                if (i1O != null) {
                    n02.f473b.execute(i1O);
                }
                if (((N0) this.f953c).f484o.f543f == ((V1) this.f952b)) {
                    W1 w12 = ((N0) this.f953c).f482m;
                    if (w12 != null) {
                        do {
                            atomicInteger = w12.f592d;
                            i = atomicInteger.get();
                            i5 = w12.f589a;
                            if (i == i5) {
                            }
                        } while (!atomicInteger.compareAndSet(i, Math.min(w12.f591c + i, i5)));
                    }
                    ((N0) this.f953c).f474c.execute(new I(22, this, a0Var));
                    break;
                }
                break;
        }
    }

    @Override // B3.InterfaceC0097z
    public void p(z3.k0 k0Var, EnumC0094y enumC0094y, z3.a0 a0Var) throws NumberFormatException {
        boolean z4;
        Q1 q12;
        N0 n02;
        A2.G g3;
        switch (this.f951a) {
            case 2:
                S0.i iVar = ((C0086v0) this.f953c).f995b.f1014b;
                if (k0Var.e()) {
                    ((I0) iVar.f2860c).a();
                } else {
                    ((I0) iVar.f2861d).a();
                }
                ((InterfaceC0097z) this.f952b).p(k0Var, enumC0094y, a0Var);
                return;
            default:
                synchronized (((N0) this.f953c).i) {
                    N0 n03 = (N0) this.f953c;
                    n03.f484o = n03.f484o.d((V1) this.f952b);
                    ((ArrayList) ((N0) this.f953c).f483n.f7594b).add(String.valueOf(k0Var.f11358a));
                }
                if (((N0) this.f953c).f487r.decrementAndGet() == Integer.MIN_VALUE) {
                    ((N0) this.f953c).f474c.execute(new U1(this, 0));
                    return;
                }
                V1 v12 = (V1) this.f952b;
                if (v12.f579c) {
                    N0 n04 = (N0) this.f953c;
                    I1 i1O = n04.o(v12);
                    if (i1O != null) {
                        n04.f473b.execute(i1O);
                    }
                    if (((N0) this.f953c).f484o.f543f == ((V1) this.f952b)) {
                        ((N0) this.f953c).u(k0Var, enumC0094y, a0Var);
                        return;
                    }
                    return;
                }
                EnumC0094y enumC0094y2 = EnumC0094y.f1025d;
                if (enumC0094y == enumC0094y2 && ((N0) this.f953c).f486q.incrementAndGet() > 1000) {
                    N0 n05 = (N0) this.f953c;
                    I1 i1O2 = n05.o((V1) this.f952b);
                    if (i1O2 != null) {
                        n05.f473b.execute(i1O2);
                    }
                    if (((N0) this.f953c).f484o.f543f == ((V1) this.f952b)) {
                        ((N0) this.f953c).u(z3.k0.f11354m.g("Too many transparent retries. Might be a bug in gRPC").f(new z3.m0(k0Var)), enumC0094y, a0Var);
                        return;
                    }
                    return;
                }
                if (((N0) this.f953c).f484o.f543f == null) {
                    if (enumC0094y == enumC0094y2 || (enumC0094y == EnumC0094y.f1023b && ((N0) this.f953c).f485p.compareAndSet(false, true))) {
                        V1 v1P = ((N0) this.f953c).p(((V1) this.f952b).f580d, true);
                        if (v1P == null) {
                            return;
                        }
                        N0 n06 = (N0) this.f953c;
                        if (n06.h) {
                            synchronized (n06.i) {
                                N0 n07 = (N0) this.f953c;
                                n07.f484o = n07.f484o.c((V1) this.f952b, v1P);
                            }
                        }
                        ((N0) this.f953c).f473b.execute(new T1(this, v1P, 1));
                        return;
                    }
                    if (enumC0094y == EnumC0094y.f1024c) {
                        N0 n08 = (N0) this.f953c;
                        if (n08.h) {
                            n08.s();
                        }
                    } else {
                        ((N0) this.f953c).f485p.set(true);
                        N0 n09 = (N0) this.f953c;
                        Integer numValueOf = null;
                        if (n09.h) {
                            String str = (String) a0Var.c(N0.f466F);
                            if (str != null) {
                                try {
                                    numValueOf = Integer.valueOf(str);
                                } catch (NumberFormatException unused) {
                                    numValueOf = -1;
                                }
                            }
                            N0 n010 = (N0) this.f953c;
                            boolean zContains = n010.f478g.f900c.contains(k0Var.f11358a);
                            boolean z5 = (n010.f482m == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !n010.f482m.a();
                            if (zContains && !z5 && !k0Var.e() && numValueOf != null && numValueOf.intValue() > 0) {
                                numValueOf = 0;
                            }
                            boolean z6 = zContains && !z5;
                            if (z6) {
                                N0.n((N0) this.f953c, numValueOf);
                            }
                            synchronized (((N0) this.f953c).i) {
                                try {
                                    N0 n011 = (N0) this.f953c;
                                    n011.f484o = n011.f484o.b((V1) this.f952b);
                                    if (z6) {
                                        N0 n012 = (N0) this.f953c;
                                        if (!n012.t(n012.f484o)) {
                                            if (!((N0) this.f953c).f484o.f541d.isEmpty()) {
                                            }
                                        }
                                        return;
                                    }
                                } finally {
                                }
                            }
                        } else {
                            X1 x12 = n09.f477f;
                            long nanos = 0;
                            if (x12 == null) {
                                q12 = new Q1(0L, false);
                            } else {
                                boolean zContains2 = x12.f608f.contains(k0Var.f11358a);
                                String str2 = (String) a0Var.c(N0.f466F);
                                if (str2 != null) {
                                    try {
                                        numValueOf = Integer.valueOf(str2);
                                    } catch (NumberFormatException unused2) {
                                        numValueOf = -1;
                                    }
                                }
                                boolean z7 = (n09.f482m == null || (!zContains2 && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !n09.f482m.a();
                                if (n09.f477f.f603a <= ((V1) this.f952b).f580d + 1 || z7) {
                                    z4 = false;
                                    q12 = new Q1(nanos, z4);
                                } else {
                                    if (numValueOf == null) {
                                        if (zContains2) {
                                            nanos = (long) (N0.f467H.nextDouble() * n09.f493x);
                                            double d5 = n09.f493x;
                                            X1 x13 = n09.f477f;
                                            n09.f493x = Math.min((long) (d5 * x13.f606d), x13.f605c);
                                            z4 = true;
                                        }
                                        z4 = false;
                                    } else {
                                        if (numValueOf.intValue() >= 0) {
                                            nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
                                            n09.f493x = n09.f477f.f604b;
                                            z4 = true;
                                        }
                                        z4 = false;
                                    }
                                    q12 = new Q1(nanos, z4);
                                }
                            }
                            if (q12.f521b) {
                                V1 v1P2 = ((N0) this.f953c).p(((V1) this.f952b).f580d + 1, false);
                                if (v1P2 == null) {
                                    return;
                                }
                                synchronized (((N0) this.f953c).i) {
                                    n02 = (N0) this.f953c;
                                    g3 = new A2.G(n02.i);
                                    n02.f491v = g3;
                                }
                                g3.k(n02.f475d.schedule(new T1(this, v1P2, 0), q12.f522c, TimeUnit.NANOSECONDS));
                                return;
                            }
                        }
                    }
                }
                N0 n013 = (N0) this.f953c;
                I1 i1O3 = n013.o((V1) this.f952b);
                if (i1O3 != null) {
                    n013.f473b.execute(i1O3);
                }
                if (((N0) this.f953c).f484o.f543f == ((V1) this.f952b)) {
                    ((N0) this.f953c).u(k0Var, enumC0094y, a0Var);
                    return;
                }
                return;
        }
    }

    @Override // B3.InterfaceC0097z
    public void s(g1.i iVar) throws IOException {
        switch (this.f951a) {
            case 2:
                ((InterfaceC0097z) this.f952b).s(iVar);
                break;
            default:
                S1 s12 = ((N0) this.f953c).f484o;
                S0.f.q("Headers should be received prior to messages.", s12.f543f != null);
                if (s12.f543f == ((V1) this.f952b)) {
                    ((N0) this.f953c).f474c.execute(new I(23, this, iVar));
                    break;
                } else {
                    Logger logger = AbstractC0056k0.f858a;
                    while (true) {
                        InputStream inputStreamU = iVar.u();
                        if (inputStreamU == null) {
                            break;
                        } else {
                            AbstractC0056k0.b(inputStreamU);
                        }
                    }
                }
        }
    }

    public String toString() {
        switch (this.f951a) {
            case 2:
                C0020u c0020uX = r1.d.X(this);
                c0020uX.a((InterfaceC0097z) this.f952b, "delegate");
                return c0020uX.toString();
            default:
                return super.toString();
        }
    }

    public q2() {
        this.f951a = 0;
        o2 o2Var = o2.f930b;
        this.f953c = i2.n();
        this.f952b = o2Var;
    }

    public q2(String str) {
        this.f951a = 1;
        z3.O oA = z3.O.a();
        S0.f.l(oA, "registry");
        this.f952b = oA;
        S0.f.l(str, "defaultPolicy");
        this.f953c = str;
    }
}
