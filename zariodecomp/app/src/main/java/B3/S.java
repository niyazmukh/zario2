package B3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import z3.AbstractC1083g;
import z3.C1075D;
import z3.C1079c;
import z3.C1091o;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\S.smali */
public final class S implements InterfaceC0045g1 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f529c;

    /* renamed from: d, reason: collision with root package name */
    public final z3.p0 f530d;

    /* renamed from: e, reason: collision with root package name */
    public P f531e;

    /* renamed from: f, reason: collision with root package name */
    public P f532f;

    /* renamed from: g, reason: collision with root package name */
    public P f533g;
    public K2.c h;

    /* renamed from: j, reason: collision with root package name */
    public z3.k0 f534j;

    /* renamed from: k, reason: collision with root package name */
    public z3.K f535k;

    /* renamed from: l, reason: collision with root package name */
    public long f536l;

    /* renamed from: a, reason: collision with root package name */
    public final C1075D f527a = C1075D.a(S.class, null);

    /* renamed from: b, reason: collision with root package name */
    public final Object f528b = new Object();
    public Collection i = new LinkedHashSet();

    public S(Executor executor, z3.p0 p0Var) {
        this.f529c = executor;
        this.f530d = p0Var;
    }

    @Override // B3.InterfaceC0045g1
    public final Runnable a(InterfaceC0042f1 interfaceC0042f1) {
        K2.c cVar = (K2.c) interfaceC0042f1;
        this.h = cVar;
        this.f531e = new P(cVar, 0);
        this.f532f = new P(cVar, 1);
        this.f533g = new P(cVar, 2);
        return null;
    }

    @Override // B3.InterfaceC0045g1
    public final void b(z3.k0 k0Var) {
        P p5;
        synchronized (this.f528b) {
            try {
                if (this.f534j != null) {
                    return;
                }
                this.f534j = k0Var;
                this.f530d.b(new I(5, this, k0Var));
                if (!h() && (p5 = this.f533g) != null) {
                    this.f530d.b(p5);
                    this.f533g = null;
                }
                this.f530d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z3.InterfaceC1074C
    public final C1075D c() {
        return this.f527a;
    }

    @Override // B3.InterfaceC0045g1
    public final void d(z3.k0 k0Var) {
        Collection<Q> collection;
        P p5;
        b(k0Var);
        synchronized (this.f528b) {
            try {
                collection = this.i;
                p5 = this.f533g;
                this.f533g = null;
                if (!collection.isEmpty()) {
                    this.i = Collections.emptyList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (p5 != null) {
            for (Q q5 : collection) {
                U uR = q5.r(new C0035d0(k0Var, EnumC0094y.f1023b, q5.f516l));
                if (uR != null) {
                    uR.run();
                }
            }
            this.f530d.execute(p5);
        }
    }

    @Override // B3.A
    public final InterfaceC0091x f(com.google.android.gms.common.api.internal.F f2, z3.a0 a0Var, C1079c c1079c, AbstractC1083g[] abstractC1083gArr) {
        n1 c0035d0;
        try {
            C0099z1 c0099z1 = new C0099z1(f2, a0Var, c1079c);
            z3.K k5 = null;
            long j5 = -1;
            while (true) {
                synchronized (this.f528b) {
                    z3.k0 k0Var = this.f534j;
                    if (k0Var == null) {
                        z3.K k6 = this.f535k;
                        if (k6 != null) {
                            if (k5 != null && j5 == this.f536l) {
                                c0035d0 = g(c0099z1, abstractC1083gArr);
                                break;
                            }
                            j5 = this.f536l;
                            A aF = AbstractC0056k0.f(k6.a(c0099z1), Boolean.TRUE.equals(c1079c.f11290f));
                            if (aF != null) {
                                c0035d0 = aF.f(c0099z1.f1033c, c0099z1.f1032b, c0099z1.f1031a, abstractC1083gArr);
                                break;
                            }
                            k5 = k6;
                        } else {
                            c0035d0 = g(c0099z1, abstractC1083gArr);
                            break;
                        }
                    } else {
                        c0035d0 = new C0035d0(k0Var, EnumC0094y.f1022a, abstractC1083gArr);
                        break;
                    }
                }
            }
            return c0035d0;
        } finally {
            this.f530d.a();
        }
    }

    public final Q g(C0099z1 c0099z1, AbstractC1083g[] abstractC1083gArr) {
        int size;
        Q q5 = new Q(this, c0099z1, abstractC1083gArr);
        this.i.add(q5);
        synchronized (this.f528b) {
            size = this.i.size();
        }
        if (size == 1) {
            this.f530d.b(this.f531e);
        }
        for (AbstractC1083g abstractC1083g : abstractC1083gArr) {
            abstractC1083g.a();
        }
        return q5;
    }

    public final boolean h() {
        boolean z4;
        synchronized (this.f528b) {
            z4 = !this.i.isEmpty();
        }
        return z4;
    }

    public final void i(z3.K k5) {
        P p5;
        synchronized (this.f528b) {
            this.f535k = k5;
            this.f536l++;
            if (k5 != null && h()) {
                ArrayList arrayList = new ArrayList(this.i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Q q5 = (Q) it.next();
                    z3.I iA = k5.a(q5.f514j);
                    C1079c c1079c = q5.f514j.f1031a;
                    A aF = AbstractC0056k0.f(iA, Boolean.TRUE.equals(c1079c.f11290f));
                    if (aF != null) {
                        Executor executor = this.f529c;
                        Executor executor2 = c1079c.f11286b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        C1091o c1091o = q5.f515k;
                        C1091o c1091oA = c1091o.a();
                        try {
                            C0099z1 c0099z1 = q5.f514j;
                            InterfaceC0091x interfaceC0091xF = aF.f(c0099z1.f1033c, c0099z1.f1032b, c0099z1.f1031a, q5.f516l);
                            c1091o.c(c1091oA);
                            U uR = q5.r(interfaceC0091xF);
                            if (uR != null) {
                                executor.execute(uR);
                            }
                            arrayList2.add(q5);
                        } catch (Throwable th) {
                            c1091o.c(c1091oA);
                            throw th;
                        }
                    }
                }
                synchronized (this.f528b) {
                    try {
                        if (h()) {
                            this.i.removeAll(arrayList2);
                            if (this.i.isEmpty()) {
                                this.i = new LinkedHashSet();
                            }
                            if (!h()) {
                                this.f530d.b(this.f532f);
                                if (this.f534j != null && (p5 = this.f533g) != null) {
                                    this.f530d.b(p5);
                                    this.f533g = null;
                                }
                            }
                            this.f530d.a();
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
