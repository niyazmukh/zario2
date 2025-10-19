package B3;

import A2.C0009i;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import z3.AbstractC1083g;
import z3.C1079c;
import z3.C1084h;
import z3.C1091o;
import z3.C1092p;
import z3.InterfaceC1085i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\N0.smali */
public final class N0 implements InterfaceC0091x {

    /* renamed from: E, reason: collision with root package name */
    public static final z3.V f465E;

    /* renamed from: F, reason: collision with root package name */
    public static final z3.V f466F;
    public static final z3.k0 G;

    /* renamed from: H, reason: collision with root package name */
    public static final Random f467H;

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.internal.F f468A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C1079c f469B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C1091o f470C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ G f471D;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.F f472a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f473b;

    /* renamed from: c, reason: collision with root package name */
    public final z3.p0 f474c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f475d;

    /* renamed from: e, reason: collision with root package name */
    public final z3.a0 f476e;

    /* renamed from: f, reason: collision with root package name */
    public final X1 f477f;

    /* renamed from: g, reason: collision with root package name */
    public final C0062m0 f478g;
    public final boolean h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final C0049i f479j;

    /* renamed from: k, reason: collision with root package name */
    public final long f480k;

    /* renamed from: l, reason: collision with root package name */
    public final long f481l;

    /* renamed from: m, reason: collision with root package name */
    public final W1 f482m;

    /* renamed from: n, reason: collision with root package name */
    public final g1.i f483n;

    /* renamed from: o, reason: collision with root package name */
    public volatile S1 f484o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f485p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicInteger f486q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicInteger f487r;

    /* renamed from: s, reason: collision with root package name */
    public C0009i f488s;

    /* renamed from: t, reason: collision with root package name */
    public long f489t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0097z f490u;

    /* renamed from: v, reason: collision with root package name */
    public A2.G f491v;

    /* renamed from: w, reason: collision with root package name */
    public A2.G f492w;

    /* renamed from: x, reason: collision with root package name */
    public long f493x;

    /* renamed from: y, reason: collision with root package name */
    public z3.k0 f494y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f495z;

    static {
        C1084h c1084h = z3.a0.f11275d;
        BitSet bitSet = z3.X.f11268d;
        f465E = new z3.V("grpc-previous-rpc-attempts", c1084h);
        f466F = new z3.V("grpc-retry-pushback-ms", c1084h);
        G = z3.k0.f11349f.g("Stream thrown away because RetriableStream committed");
        f467H = new Random();
    }

    public N0(G g3, com.google.android.gms.common.api.internal.F f2, z3.a0 a0Var, C1079c c1079c, X1 x12, C0062m0 c0062m0, C1091o c1091o) {
        this.f471D = g3;
        this.f468A = f2;
        this.f469B = c1079c;
        this.f470C = c1091o;
        Y0 y02 = (Y0) g3.f411b;
        C0049i c0049i = y02.X;
        long j5 = y02.f641Y;
        long j6 = y02.f642Z;
        Executor executor = c1079c.f11286b;
        executor = executor == null ? y02.f654k : executor;
        ScheduledExecutorService scheduledExecutorService = y02.i.f924a.f1137d;
        W1 w12 = (W1) g3.f410a;
        this.f474c = new z3.p0(new H1());
        this.i = new Object();
        this.f483n = new g1.i(3);
        this.f484o = new S1(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);
        this.f485p = new AtomicBoolean();
        this.f486q = new AtomicInteger();
        this.f487r = new AtomicInteger();
        this.f472a = f2;
        this.f479j = c0049i;
        this.f480k = j5;
        this.f481l = j6;
        this.f473b = executor;
        this.f475d = scheduledExecutorService;
        this.f476e = a0Var;
        this.f477f = x12;
        if (x12 != null) {
            this.f493x = x12.f604b;
        }
        this.f478g = c0062m0;
        S0.f.g("Should not provide both retryPolicy and hedgingPolicy", x12 == null || c0062m0 == null);
        this.h = c0062m0 != null;
        this.f482m = w12;
    }

    public static void n(N0 n02, Integer num) {
        n02.getClass();
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            n02.s();
            return;
        }
        synchronized (n02.i) {
            try {
                A2.G g3 = n02.f492w;
                if (g3 != null) {
                    g3.f86a = true;
                    ScheduledFuture scheduledFuture = (ScheduledFuture) g3.f88c;
                    A2.G g5 = new A2.G(n02.i);
                    n02.f492w = g5;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    g5.k(n02.f475d.schedule(new I(21, n02, g5), num.intValue(), TimeUnit.MILLISECONDS));
                }
            } finally {
            }
        }
    }

    @Override // B3.n2
    public final void a(InterfaceC1085i interfaceC1085i) {
        q(new J1(interfaceC1085i, 0));
    }

    @Override // B3.InterfaceC0091x
    public final void b(int i) {
        q(new L1(i, 1));
    }

    @Override // B3.InterfaceC0091x
    public final void c(z3.r rVar) {
        q(new J1(rVar, 2));
    }

    @Override // B3.n2
    public final boolean d() {
        Iterator it = this.f484o.f540c.iterator();
        while (it.hasNext()) {
            if (((V1) it.next()).f577a.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // B3.InterfaceC0091x
    public final void e(g1.i iVar) {
        S1 s12;
        synchronized (this.i) {
            iVar.k(this.f483n, "closed");
            s12 = this.f484o;
        }
        if (s12.f543f != null) {
            g1.i iVar2 = new g1.i(3);
            s12.f543f.f577a.e(iVar2);
            iVar.k(iVar2, "committed");
            return;
        }
        g1.i iVar3 = new g1.i(3);
        for (V1 v12 : s12.f540c) {
            g1.i iVar4 = new g1.i(3);
            v12.f577a.e(iVar4);
            ((ArrayList) iVar3.f7594b).add(String.valueOf(iVar4));
        }
        iVar.k(iVar3, "open");
    }

    @Override // B3.InterfaceC0091x
    public final void f(C1092p c1092p) {
        q(new J1(c1092p, 1));
    }

    @Override // B3.n2
    public final void flush() {
        S1 s12 = this.f484o;
        if (s12.f538a) {
            s12.f543f.f577a.flush();
        } else {
            q(new K1(0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0068 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:27:0x0047, B:29:0x0057, B:31:0x005b, B:35:0x0068, B:38:0x0074), top: B:50:0x0047 }] */
    @Override // B3.InterfaceC0091x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(B3.InterfaceC0097z r7) {
        /*
            r6 = this;
            r6.f490u = r7
            B3.G r7 = r6.f471D
            java.lang.Object r7 = r7.f411b
            B3.Y0 r7 = (B3.Y0) r7
            S0.n r7 = r7.f626I
            java.lang.Object r0 = r7.f2872a
            monitor-enter(r0)
            java.lang.Object r1 = r7.f2874c     // Catch: java.lang.Throwable -> L16
            z3.k0 r1 = (z3.k0) r1     // Catch: java.lang.Throwable -> L16
            r2 = 0
            if (r1 == 0) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L22
        L16:
            r6 = move-exception
            goto L97
        L19:
            java.lang.Object r7 = r7.f2873b     // Catch: java.lang.Throwable -> L16
            java.util.HashSet r7 = (java.util.HashSet) r7     // Catch: java.lang.Throwable -> L16
            r7.add(r6)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            r1 = r2
        L22:
            if (r1 == 0) goto L28
            r6.h(r1)
            return
        L28:
            java.lang.Object r7 = r6.i
            monitor-enter(r7)
            B3.S1 r0 = r6.f484o     // Catch: java.lang.Throwable -> L94
            java.util.List r0 = r0.f539b     // Catch: java.lang.Throwable -> L94
            B3.R1 r1 = new B3.R1     // Catch: java.lang.Throwable -> L94
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L94
            r0.add(r1)     // Catch: java.lang.Throwable -> L94
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L94
            r7 = 0
            B3.V1 r0 = r6.p(r7, r7)
            if (r0 != 0) goto L40
            return
        L40:
            boolean r1 = r6.h
            if (r1 == 0) goto L90
            java.lang.Object r1 = r6.i
            monitor-enter(r1)
            B3.S1 r3 = r6.f484o     // Catch: java.lang.Throwable -> L72
            B3.S1 r3 = r3.a(r0)     // Catch: java.lang.Throwable -> L72
            r6.f484o = r3     // Catch: java.lang.Throwable -> L72
            B3.S1 r3 = r6.f484o     // Catch: java.lang.Throwable -> L72
            boolean r3 = r6.t(r3)     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L74
            B3.W1 r3 = r6.f482m     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L68
            java.util.concurrent.atomic.AtomicInteger r4 = r3.f592d     // Catch: java.lang.Throwable -> L72
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L72
            int r3 = r3.f590b     // Catch: java.lang.Throwable -> L72
            if (r4 <= r3) goto L66
            r7 = 1
        L66:
            if (r7 == 0) goto L74
        L68:
            A2.G r2 = new A2.G     // Catch: java.lang.Throwable -> L72
            java.lang.Object r7 = r6.i     // Catch: java.lang.Throwable -> L72
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L72
            r6.f492w = r2     // Catch: java.lang.Throwable -> L72
            goto L74
        L72:
            r6 = move-exception
            goto L8e
        L74:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L90
            java.util.concurrent.ScheduledExecutorService r7 = r6.f475d
            B3.I r1 = new B3.I
            r3 = 21
            r1.<init>(r3, r6, r2)
            B3.m0 r3 = r6.f478g
            long r3 = r3.f899b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.ScheduledFuture r7 = r7.schedule(r1, r3, r5)
            r2.k(r7)
            goto L90
        L8e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            throw r6
        L90:
            r6.r(r0)
            return
        L94:
            r6 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L94
            throw r6
        L97:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.N0.g(B3.z):void");
    }

    @Override // B3.InterfaceC0091x
    public final void h(z3.k0 k0Var) {
        V1 v12;
        V1 v13 = new V1(0);
        v13.f577a = new n1();
        I1 i1O = o(v13);
        if (i1O != null) {
            synchronized (this.i) {
                this.f484o = this.f484o.e(v13);
            }
            i1O.run();
            u(k0Var, EnumC0094y.f1022a, new z3.a0());
            return;
        }
        synchronized (this.i) {
            try {
                if (this.f484o.f540c.contains(this.f484o.f543f)) {
                    v12 = this.f484o.f543f;
                } else {
                    this.f494y = k0Var;
                    v12 = null;
                }
                S1 s12 = this.f484o;
                this.f484o = new S1(s12.f539b, s12.f540c, s12.f541d, s12.f543f, true, s12.f538a, s12.h, s12.f542e);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (v12 != null) {
            v12.f577a.h(k0Var);
        }
    }

    @Override // B3.n2
    public final void i(int i) {
        S1 s12 = this.f484o;
        if (s12.f538a) {
            s12.f543f.f577a.i(i);
        } else {
            q(new L1(i, 2));
        }
    }

    @Override // B3.n2
    public final void j(G3.a aVar) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // B3.InterfaceC0091x
    public final void k(int i) {
        q(new L1(i, 0));
    }

    @Override // B3.n2
    public final void l() {
        q(new K1(2));
    }

    @Override // B3.InterfaceC0091x
    public final void m() {
        q(new K1(1));
    }

    public final I1 o(V1 v12) {
        Collection collectionEmptyList;
        boolean z4;
        List list;
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        synchronized (this.i) {
            try {
                if (this.f484o.f543f != null) {
                    return null;
                }
                Collection collection = this.f484o.f540c;
                S1 s12 = this.f484o;
                S0.f.q("Already committed", s12.f543f == null);
                if (s12.f540c.contains(v12)) {
                    list = null;
                    collectionEmptyList = Collections.singleton(v12);
                    z4 = true;
                } else {
                    collectionEmptyList = Collections.emptyList();
                    z4 = false;
                    list = s12.f539b;
                }
                this.f484o = new S1(list, collectionEmptyList, s12.f541d, v12, s12.f544g, z4, s12.h, s12.f542e);
                this.f479j.f825a.addAndGet(-this.f489t);
                A2.G g3 = this.f491v;
                if (g3 != null) {
                    g3.f86a = true;
                    ScheduledFuture scheduledFuture3 = (ScheduledFuture) g3.f88c;
                    this.f491v = null;
                    scheduledFuture = scheduledFuture3;
                } else {
                    scheduledFuture = null;
                }
                A2.G g5 = this.f492w;
                if (g5 != null) {
                    g5.f86a = true;
                    ScheduledFuture scheduledFuture4 = (ScheduledFuture) g5.f88c;
                    this.f492w = null;
                    scheduledFuture2 = scheduledFuture4;
                } else {
                    scheduledFuture2 = null;
                }
                return new I1(this, collection, v12, scheduledFuture, scheduledFuture2, 0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final V1 p(int i, boolean z4) {
        AtomicInteger atomicInteger;
        int i5;
        do {
            atomicInteger = this.f487r;
            i5 = atomicInteger.get();
            if (i5 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i5, i5 + 1));
        V1 v12 = new V1(i);
        N1 n12 = new N1(new P1(this, v12));
        z3.a0 a0Var = new z3.a0();
        a0Var.d(this.f476e);
        if (i > 0) {
            a0Var.f(f465E, String.valueOf(i));
        }
        C1079c c1079c = this.f469B;
        c1079c.getClass();
        List list = c1079c.f11289e;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(n12);
        K0.t tVarB = C1079c.b(c1079c);
        tVarB.f2185e = Collections.unmodifiableList(arrayList);
        C1079c c1079c2 = new C1079c(tVarB);
        AbstractC1083g[] abstractC1083gArrC = AbstractC0056k0.c(c1079c2, a0Var, i, z4);
        com.google.android.gms.common.api.internal.F f2 = this.f468A;
        A a5 = this.f471D.a(new C0099z1(f2, a0Var, c1079c2));
        C1091o c1091o = this.f470C;
        C1091o c1091oA = c1091o.a();
        try {
            InterfaceC0091x interfaceC0091xF = a5.f(f2, a0Var, c1079c2, abstractC1083gArrC);
            c1091o.c(c1091oA);
            v12.f577a = interfaceC0091xF;
            return v12;
        } catch (Throwable th) {
            c1091o.c(c1091oA);
            throw th;
        }
    }

    public final void q(O1 o12) {
        Collection collection;
        synchronized (this.i) {
            try {
                if (!this.f484o.f538a) {
                    this.f484o.f539b.add(o12);
                }
                collection = this.f484o.f540c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o12.a((V1) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r8.f474c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        r9.f577a.g(new B3.q2(4, r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        r0 = r9.f577a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        if (r8.f484o.f543f != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        r8 = r8.f494y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        r8 = B3.N0.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        r0.h(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0093, code lost:
    
        if (r0.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0095, code lost:
    
        r4 = (B3.O1) r0.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        if ((r4 instanceof B3.R1) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a2, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        r4 = r8.f484o;
        r5 = r4.f543f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a9, code lost:
    
        if (r5 == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ae, code lost:
    
        if (r4.f544g == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(B3.V1 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            java.lang.Object r4 = r8.i
            monitor-enter(r4)
            B3.S1 r5 = r8.f484o     // Catch: java.lang.Throwable -> L11
            B3.V1 r6 = r5.f543f     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L14
            if (r6 == r9) goto L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L38
        L11:
            r8 = move-exception
            goto Lb3
        L14:
            boolean r6 = r5.f544g     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L38
        L1a:
            java.util.List r6 = r5.f539b     // Catch: java.lang.Throwable -> L11
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L11
            if (r0 != r6) goto L5e
            B3.S1 r0 = r5.e(r9)     // Catch: java.lang.Throwable -> L11
            r8.f484o = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r8.d()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L30
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L30:
            B3.N r1 = new B3.N     // Catch: java.lang.Throwable -> L11
            r0 = 8
            r1.<init>(r8, r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
        L38:
            if (r1 == 0) goto L40
            z3.p0 r8 = r8.f474c
            r8.execute(r1)
            return
        L40:
            if (r2 != 0) goto L4d
            B3.x r0 = r9.f577a
            B3.q2 r1 = new B3.q2
            r2 = 4
            r1.<init>(r2, r8, r9)
            r0.g(r1)
        L4d:
            B3.x r0 = r9.f577a
            B3.S1 r1 = r8.f484o
            B3.V1 r1 = r1.f543f
            if (r1 != r9) goto L58
            z3.k0 r8 = r8.f494y
            goto L5a
        L58:
            z3.k0 r8 = B3.N0.G
        L5a:
            r0.h(r8)
            return
        L5e:
            boolean r6 = r9.f578b     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L64
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L64:
            int r6 = r0 + 128
            java.util.List r7 = r5.f539b     // Catch: java.lang.Throwable -> L11
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L11
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L7e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f539b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L11
            goto L8a
        L7e:
            r3.clear()     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f539b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.addAll(r0)     // Catch: java.lang.Throwable -> L11
        L8a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r3.iterator()
        L8f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lb0
            java.lang.Object r4 = r0.next()
            B3.O1 r4 = (B3.O1) r4
            r4.a(r9)
            boolean r4 = r4 instanceof B3.R1
            if (r4 == 0) goto La3
            r2 = 1
        La3:
            B3.S1 r4 = r8.f484o
            B3.V1 r5 = r4.f543f
            if (r5 == 0) goto Lac
            if (r5 == r9) goto Lac
            goto Lb0
        Lac:
            boolean r4 = r4.f544g
            if (r4 == 0) goto L8f
        Lb0:
            r0 = r6
            goto L4
        Lb3:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.N0.r(B3.V1):void");
    }

    public final void s() {
        ScheduledFuture scheduledFuture;
        synchronized (this.i) {
            try {
                A2.G g3 = this.f492w;
                scheduledFuture = null;
                if (g3 != null) {
                    g3.f86a = true;
                    ScheduledFuture scheduledFuture2 = (ScheduledFuture) g3.f88c;
                    this.f492w = null;
                    scheduledFuture = scheduledFuture2;
                }
                S1 s12 = this.f484o;
                if (!s12.h) {
                    s12 = new S1(s12.f539b, s12.f540c, s12.f541d, s12.f543f, s12.f544g, s12.f538a, true, s12.f542e);
                }
                this.f484o = s12;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final boolean t(S1 s12) {
        if (s12.f543f == null) {
            if (s12.f542e < this.f478g.f898a && !s12.h) {
                return true;
            }
        }
        return false;
    }

    public final void u(z3.k0 k0Var, EnumC0094y enumC0094y, z3.a0 a0Var) {
        this.f488s = new C0009i(k0Var, enumC0094y, a0Var, 6);
        if (this.f487r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f474c.execute(new RunnableC0029b(this, k0Var, enumC0094y, a0Var, 2));
        }
    }

    public final void v(com.google.protobuf.E e5) {
        S1 s12 = this.f484o;
        if (s12.f538a) {
            s12.f543f.f577a.j(this.f472a.d(e5));
        } else {
            q(new M1(this, e5));
        }
    }
}
