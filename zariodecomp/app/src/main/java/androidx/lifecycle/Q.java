package androidx.lifecycle;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\Q.smali */
public final class Q extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.r f4609a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.r f4610b;

    /* renamed from: c, reason: collision with root package name */
    public int f4611c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0242x f4612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f4.C f4613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q3.j f4614f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Q(C0242x c0242x, f4.C c5, X3.p pVar, O3.d dVar) {
        super(2, dVar);
        this.f4612d = c0242x;
        this.f4613e = c5;
        this.f4614f = (Q3.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Q3.j, X3.p] */
    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new Q(this.f4612d, this.f4613e, this.f4614f, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Type inference failed for: r15v0, types: [Q3.j, X3.p] */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f4611c
            K3.k r3 = K3.k.f2288a
            r4 = 0
            androidx.lifecycle.x r5 = r0.f4612d
            r6 = 1
            if (r2 == 0) goto L23
            if (r2 != r6) goto L1b
            kotlin.jvm.internal.r r1 = r0.f4610b
            kotlin.jvm.internal.r r2 = r0.f4609a
            a.AbstractC0183a.m0(r18)     // Catch: java.lang.Throwable -> L18
            goto L76
        L18:
            r0 = move-exception
            goto L8b
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L23:
            a.AbstractC0183a.m0(r18)
            androidx.lifecycle.o r2 = r5.f4672d
            androidx.lifecycle.o r7 = androidx.lifecycle.EnumC0236o.f4658a
            if (r2 != r7) goto L2d
            return r3
        L2d:
            kotlin.jvm.internal.r r2 = new kotlin.jvm.internal.r
            r2.<init>()
            kotlin.jvm.internal.r r7 = new kotlin.jvm.internal.r
            r7.<init>()
            androidx.lifecycle.o r8 = androidx.lifecycle.EnumC0236o.f4661d     // Catch: java.lang.Throwable -> L89
            f4.C r11 = r0.f4613e     // Catch: java.lang.Throwable -> L89
            Q3.j r15 = r0.f4614f     // Catch: java.lang.Throwable -> L89
            r0.f4609a = r2     // Catch: java.lang.Throwable -> L89
            r0.f4610b = r7     // Catch: java.lang.Throwable -> L89
            r0.f4611c = r6     // Catch: java.lang.Throwable -> L89
            f4.n r14 = new f4.n     // Catch: java.lang.Throwable -> L89
            O3.d r0 = p1.b.x(r17)     // Catch: java.lang.Throwable -> L89
            r14.<init>(r6, r0)     // Catch: java.lang.Throwable -> L89
            r14.s()     // Catch: java.lang.Throwable -> L89
            androidx.lifecycle.l r0 = androidx.lifecycle.n.Companion     // Catch: java.lang.Throwable -> L89
            r0.getClass()     // Catch: java.lang.Throwable -> L89
            androidx.lifecycle.n r9 = androidx.lifecycle.n.ON_START     // Catch: java.lang.Throwable -> L89
            androidx.lifecycle.n r12 = androidx.lifecycle.C0234l.a(r8)     // Catch: java.lang.Throwable -> L89
            o4.c r0 = o4.d.a()     // Catch: java.lang.Throwable -> L89
            androidx.lifecycle.P r6 = new androidx.lifecycle.P     // Catch: java.lang.Throwable -> L89
            r8 = r6
            r10 = r2
            r13 = r14
            r16 = r14
            r14 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L89
            r7.f8431a = r6     // Catch: java.lang.Throwable -> L89
            r5.a(r6)     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = r16.r()     // Catch: java.lang.Throwable -> L89
            if (r0 != r1) goto L75
            return r1
        L75:
            r1 = r7
        L76:
            java.lang.Object r0 = r2.f8431a
            f4.g0 r0 = (f4.InterfaceC0506g0) r0
            if (r0 == 0) goto L7f
            r0.cancel(r4)
        L7f:
            java.lang.Object r0 = r1.f8431a
            androidx.lifecycle.t r0 = (androidx.lifecycle.InterfaceC0239t) r0
            if (r0 == 0) goto L88
            r5.f(r0)
        L88:
            return r3
        L89:
            r0 = move-exception
            r1 = r7
        L8b:
            java.lang.Object r2 = r2.f8431a
            f4.g0 r2 = (f4.InterfaceC0506g0) r2
            if (r2 == 0) goto L94
            r2.cancel(r4)
        L94:
            java.lang.Object r1 = r1.f8431a
            androidx.lifecycle.t r1 = (androidx.lifecycle.InterfaceC0239t) r1
            if (r1 == 0) goto L9d
            r5.f(r1)
        L9d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
