package W;

import f4.A0;
import i4.InterfaceC0612g;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\O.smali */
public final class O implements InterfaceC0167i {

    /* renamed from: a, reason: collision with root package name */
    public final T f3527a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0161c f3528b;

    /* renamed from: c, reason: collision with root package name */
    public final f4.C f3529c;

    /* renamed from: f, reason: collision with root package name */
    public int f3532f;

    /* renamed from: k, reason: collision with root package name */
    public A0 f3533k;

    /* renamed from: m, reason: collision with root package name */
    public final S0.n f3535m;

    /* renamed from: n, reason: collision with root package name */
    public final K3.h f3536n;

    /* renamed from: o, reason: collision with root package name */
    public final K3.h f3537o;

    /* renamed from: p, reason: collision with root package name */
    public final S0.i f3538p;

    /* renamed from: d, reason: collision with root package name */
    public final O0.i f3530d = new O0.i(new t(this, null));

    /* renamed from: e, reason: collision with root package name */
    public final o4.c f3531e = o4.d.a();

    /* renamed from: l, reason: collision with root package name */
    public final g1.i f3534l = new g1.i(12);

    public O(T t4, List list, InterfaceC0161c interfaceC0161c, f4.C c5) {
        this.f3527a = t4;
        this.f3528b = interfaceC0161c;
        this.f3529c = c5;
        S0.n nVar = new S0.n();
        nVar.f2875d = this;
        nVar.f2872a = o4.d.a();
        nVar.f2873b = f4.E.a();
        nVar.f2874c = L3.j.u0(list);
        this.f3535m = nVar;
        this.f3536n = S0.f.P(new C0172n(this, 1));
        this.f3537o = S0.f.P(new C0172n(this, 0));
        this.f3538p = new S0.i(c5, new J0.m(this, 3), new L(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(W.O r4, Q3.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof W.C0177u
            if (r0 == 0) goto L16
            r0 = r5
            W.u r0 = (W.C0177u) r0
            int r1 = r0.f3669e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f3669e = r1
            goto L1b
        L16:
            W.u r0 = new W.u
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f3667c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3669e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            o4.c r4 = r0.f3666b
            W.O r0 = r0.f3665a
            a.AbstractC0183a.m0(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            a.AbstractC0183a.m0(r5)
            r0.f3665a = r4
            o4.c r5 = r4.f3531e
            r0.f3666b = r5
            r0.f3669e = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L4a
            goto L64
        L4a:
            r0 = 0
            int r1 = r4.f3532f     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 + (-1)
            r4.f3532f = r1     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L5f
            f4.A0 r1 = r4.f3533k     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5a
            r1.cancel(r0)     // Catch: java.lang.Throwable -> L5d
        L5a:
            r4.f3533k = r0     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r4 = move-exception
            goto L65
        L5f:
            r5.e(r0)
            K3.k r1 = K3.k.f2288a
        L64:
            return r1
        L65:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: W.O.a(W.O, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(2:4|(1:6)(1:7))(0)|8|(7:73|(1:(1:(1:13)(2:18|19))(3:20|21|22))(1:23)|14|63|(1:65)(1:66)|67|68)(4:24|74|25|(9:27|71|28|(1:76)|31|63|(0)(0)|67|68)(3:38|(1:40)(1:41)|(2:43|(2:45|(2:47|75))(2:54|55))(2:56|(2:58|59)(2:60|61))))|48|69|49|(1:77)|31|63|(0)(0)|67|68|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r2v3, types: [Q3.j, X3.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [Q3.j, X3.p] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(W.O r9, W.a0 r10, Q3.c r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.O.b(W.O, W.a0, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(W.O r4, Q3.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof W.C0180x
            if (r0 == 0) goto L16
            r0 = r5
            W.x r0 = (W.C0180x) r0
            int r1 = r0.f3682e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f3682e = r1
            goto L1b
        L16:
            W.x r0 = new W.x
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f3680c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3682e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            o4.c r4 = r0.f3679b
            W.O r0 = r0.f3678a
            a.AbstractC0183a.m0(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            a.AbstractC0183a.m0(r5)
            r0.f3678a = r4
            o4.c r5 = r4.f3531e
            r0.f3679b = r5
            r0.f3682e = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L4a
            goto L68
        L4a:
            r0 = 0
            int r1 = r4.f3532f     // Catch: java.lang.Throwable -> L61
            int r1 = r1 + r3
            r4.f3532f = r1     // Catch: java.lang.Throwable -> L61
            if (r1 != r3) goto L63
            f4.C r1 = r4.f3529c     // Catch: java.lang.Throwable -> L61
            W.y r2 = new W.y     // Catch: java.lang.Throwable -> L61
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L61
            r3 = 3
            f4.A0 r1 = f4.E.t(r1, r0, r0, r2, r3)     // Catch: java.lang.Throwable -> L61
            r4.f3533k = r1     // Catch: java.lang.Throwable -> L61
            goto L63
        L61:
            r4 = move-exception
            goto L69
        L63:
            r5.e(r0)
            K3.k r1 = K3.k.f2288a
        L68:
            return r1
        L69:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: W.O.c(W.O, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(W.O r8, boolean r9, O3.d r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.O.d(W.O, boolean, O3.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[Catch: b -> 0x0062, TryCatch #0 {b -> 0x0062, blocks: (B:19:0x005d, B:54:0x0103, B:24:0x006b, B:51:0x00e5, B:32:0x0088, B:40:0x00a2, B:42:0x00a8, B:36:0x0091, B:48:0x00d2), top: B:78:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142 A[Catch: all -> 0x016e, TryCatch #2 {all -> 0x016e, blocks: (B:61:0x0130, B:63:0x0142, B:64:0x014a), top: B:81:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a A[Catch: all -> 0x016e, TRY_LEAVE, TryCatch #2 {all -> 0x016e, blocks: (B:61:0x0130, B:63:0x0142, B:64:0x014a), top: B:81:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(W.O r9, boolean r10, Q3.c r11) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.O.e(W.O, boolean, Q3.c):java.lang.Object");
    }

    public final i0 f() {
        return (i0) this.f3537o.getValue();
    }

    @Override // W.InterfaceC0167i
    public final Object g(X3.p pVar, O3.d dVar) {
        m0 m0Var = (m0) dVar.getContext().get(l0.f3636a);
        if (m0Var != null) {
            m0Var.a(this);
        }
        return f4.E.B(new m0(m0Var, this), new J(this, pVar, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(Q3.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof W.C0182z
            if (r0 == 0) goto L13
            r0 = r7
            W.z r0 = (W.C0182z) r0
            int r1 = r0.f3689e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3689e = r1
            goto L18
        L13:
            W.z r0 = new W.z
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f3687c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3689e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.f3686b
            W.O r0 = r0.f3685a
            a.AbstractC0183a.m0(r7)     // Catch: java.lang.Throwable -> L2e
            goto L65
        L2e:
            r7 = move-exception
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            W.O r6 = r0.f3685a
            a.AbstractC0183a.m0(r7)
            goto L50
        L3e:
            a.AbstractC0183a.m0(r7)
            W.i0 r7 = r6.f()
            r0.f3685a = r6
            r0.f3689e = r4
            java.lang.Integer r7 = r7.a()
            if (r7 != r1) goto L50
            return r1
        L50:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            S0.n r2 = r6.f3535m     // Catch: java.lang.Throwable -> L6d
            r0.f3685a = r6     // Catch: java.lang.Throwable -> L6d
            r0.f3686b = r7     // Catch: java.lang.Throwable -> L6d
            r0.f3689e = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r2.p(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L65
            return r1
        L65:
            K3.k r6 = K3.k.f2288a
            return r6
        L68:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L6f
        L6d:
            r0 = move-exception
            goto L68
        L6f:
            g1.i r0 = r0.f3534l
            W.b0 r1 = new W.b0
            r1.<init>(r6, r7)
            r0.E(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: W.O.h(Q3.c):java.lang.Object");
    }

    public final Object i(Q3.c cVar) {
        return ((W) this.f3536n.getValue()).a(new r(3, (O3.d) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Object r12, boolean r13, Q3.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof W.M
            if (r0 == 0) goto L13
            r0 = r14
            W.M r0 = (W.M) r0
            int r1 = r0.f3519d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3519d = r1
            goto L18
        L13:
            W.M r0 = new W.M
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f3517b
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3519d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.p r11 = r0.f3516a
            a.AbstractC0183a.m0(r14)
            goto L58
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            a.AbstractC0183a.m0(r14)
            kotlin.jvm.internal.p r14 = new kotlin.jvm.internal.p
            r14.<init>()
            K3.h r2 = r11.f3536n
            java.lang.Object r2 = r2.getValue()
            W.W r2 = (W.W) r2
            W.N r10 = new W.N
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f3516a = r14
            r0.f3519d = r3
            java.lang.Object r11 = r2.b(r10, r0)
            if (r11 != r1) goto L57
            return r1
        L57:
            r11 = r14
        L58:
            int r11 = r11.f8429a
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: W.O.j(java.lang.Object, boolean, Q3.c):java.lang.Object");
    }

    @Override // W.InterfaceC0167i
    public final InterfaceC0612g p() {
        return this.f3530d;
    }
}
