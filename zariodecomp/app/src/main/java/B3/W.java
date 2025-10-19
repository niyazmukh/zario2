package B3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z3.C1092p;
import z3.InterfaceC1085i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\W.smali */
public class W implements InterfaceC0091x {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f581a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0097z f582b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0091x f583c;

    /* renamed from: d, reason: collision with root package name */
    public z3.k0 f584d;

    /* renamed from: f, reason: collision with root package name */
    public V f586f;

    /* renamed from: g, reason: collision with root package name */
    public long f587g;
    public long h;

    /* renamed from: e, reason: collision with root package name */
    public List f585e = new ArrayList();
    public ArrayList i = new ArrayList();

    @Override // B3.n2
    public final void a(InterfaceC1085i interfaceC1085i) {
        S0.f.q("May only be called before start", this.f582b == null);
        this.i.add(new I(6, this, interfaceC1085i));
    }

    @Override // B3.InterfaceC0091x
    public final void b(int i) {
        S0.f.q("May only be called before start", this.f582b == null);
        this.i.add(new T(this, i, 2));
    }

    @Override // B3.InterfaceC0091x
    public final void c(z3.r rVar) {
        S0.f.q("May only be called before start", this.f582b == null);
        S0.f.l(rVar, "decompressorRegistry");
        this.i.add(new I(7, this, rVar));
    }

    @Override // B3.n2
    public final boolean d() {
        if (this.f581a) {
            return this.f583c.d();
        }
        return false;
    }

    @Override // B3.InterfaceC0091x
    public void e(g1.i iVar) {
        synchronized (this) {
            try {
                if (this.f582b == null) {
                    return;
                }
                if (this.f583c != null) {
                    iVar.k(Long.valueOf(this.h - this.f587g), "buffered_nanos");
                    this.f583c.e(iVar);
                } else {
                    iVar.k(Long.valueOf(System.nanoTime() - this.f587g), "buffered_nanos");
                    ((ArrayList) iVar.f7594b).add("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B3.InterfaceC0091x
    public final void f(C1092p c1092p) {
        S0.f.q("May only be called before start", this.f582b == null);
        this.i.add(new I(8, this, c1092p));
    }

    @Override // B3.n2
    public final void flush() {
        S0.f.q("May only be called after start", this.f582b != null);
        if (this.f581a) {
            this.f583c.flush();
        } else {
            n(new U(this, 2));
        }
    }

    @Override // B3.InterfaceC0091x
    public final void g(InterfaceC0097z interfaceC0097z) {
        z3.k0 k0Var;
        boolean z4;
        S0.f.l(interfaceC0097z, "listener");
        S0.f.q("already started", this.f582b == null);
        synchronized (this) {
            try {
                k0Var = this.f584d;
                z4 = this.f581a;
                if (!z4) {
                    V v4 = new V(interfaceC0097z);
                    this.f586f = v4;
                    interfaceC0097z = v4;
                }
                this.f582b = interfaceC0097z;
                this.f587g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (k0Var != null) {
            interfaceC0097z.p(k0Var, EnumC0094y.f1022a, new z3.a0());
        } else if (z4) {
            p(interfaceC0097z);
        }
    }

    @Override // B3.InterfaceC0091x
    public void h(z3.k0 k0Var) {
        boolean z4 = false;
        boolean z5 = true;
        S0.f.q("May only be called after start", this.f582b != null);
        S0.f.l(k0Var, "reason");
        synchronized (this) {
            try {
                InterfaceC0091x interfaceC0091x = this.f583c;
                if (interfaceC0091x == null) {
                    n1 n1Var = n1.a;
                    if (interfaceC0091x != null) {
                        z5 = false;
                    }
                    S0.f.p(interfaceC0091x, "realStream already set to %s", z5);
                    this.f583c = n1Var;
                    this.h = System.nanoTime();
                    this.f584d = k0Var;
                } else {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            n(new I(10, this, k0Var));
            return;
        }
        o();
        q(k0Var);
        this.f582b.p(k0Var, EnumC0094y.f1022a, new z3.a0());
    }

    @Override // B3.n2
    public final void i(int i) {
        S0.f.q("May only be called after start", this.f582b != null);
        if (this.f581a) {
            this.f583c.i(i);
        } else {
            n(new T(this, i, 0));
        }
    }

    @Override // B3.n2
    public final void j(G3.a aVar) {
        S0.f.q("May only be called after start", this.f582b != null);
        if (this.f581a) {
            this.f583c.j(aVar);
        } else {
            n(new I(9, this, aVar));
        }
    }

    @Override // B3.InterfaceC0091x
    public final void k(int i) {
        S0.f.q("May only be called before start", this.f582b == null);
        this.i.add(new T(this, i, 1));
    }

    @Override // B3.n2
    public final void l() {
        S0.f.q("May only be called before start", this.f582b == null);
        this.i.add(new U(this, 0));
    }

    @Override // B3.InterfaceC0091x
    public final void m() {
        S0.f.q("May only be called after start", this.f582b != null);
        n(new U(this, 3));
    }

    public final void n(Runnable runnable) {
        S0.f.q("May only be called after start", this.f582b != null);
        synchronized (this) {
            try {
                if (this.f581a) {
                    runnable.run();
                } else {
                    this.f585e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r5)
            java.util.List r1 = r5.f585e     // Catch: java.lang.Throwable -> L50
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L52
            r0 = 0
            r5.f585e = r0     // Catch: java.lang.Throwable -> L50
            r1 = 1
            r5.f581a = r1     // Catch: java.lang.Throwable -> L50
            B3.V r2 = r5.f586f     // Catch: java.lang.Throwable -> L50
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L4f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r3 = r2.f572c     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L2f
            r2.f572c = r0     // Catch: java.lang.Throwable -> L2d
            r2.f571b = r1     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L4d
        L2f:
            java.util.List r3 = r2.f572c     // Catch: java.lang.Throwable -> L2d
            r2.f572c = r5     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r5 = r3.iterator()
        L38:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r5.next()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r4.run()
            goto L38
        L48:
            r3.clear()
            r5 = r3
            goto L1e
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r5
        L4f:
            return
        L50:
            r0 = move-exception
            goto L70
        L52:
            java.util.List r1 = r5.f585e     // Catch: java.lang.Throwable -> L50
            r5.f585e = r0     // Catch: java.lang.Throwable -> L50
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r0 = r1.iterator()
        L5b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L5b
        L6b:
            r1.clear()
            r0 = r1
            goto L5
        L70:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L50
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.W.o():void");
    }

    public final void p(InterfaceC0097z interfaceC0097z) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.i = null;
        this.f583c.g(interfaceC0097z);
    }

    public void q(z3.k0 k0Var) {
    }

    public final U r(InterfaceC0091x interfaceC0091x) {
        synchronized (this) {
            try {
                if (this.f583c != null) {
                    return null;
                }
                S0.f.l(interfaceC0091x, "stream");
                InterfaceC0091x interfaceC0091x2 = this.f583c;
                S0.f.p(interfaceC0091x2, "realStream already set to %s", interfaceC0091x2 == null);
                this.f583c = interfaceC0091x;
                this.h = System.nanoTime();
                InterfaceC0097z interfaceC0097z = this.f582b;
                if (interfaceC0097z == null) {
                    this.f585e = null;
                    this.f581a = true;
                }
                if (interfaceC0097z == null) {
                    return null;
                }
                p(interfaceC0097z);
                return new U(this, 1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
