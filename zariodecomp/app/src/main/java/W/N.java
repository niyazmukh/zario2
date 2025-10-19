package W;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\N.smali */
public final class N extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.p f3520a;

    /* renamed from: b, reason: collision with root package name */
    public int f3521b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3522c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f3523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f3524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3525f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f3526k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(kotlin.jvm.internal.p pVar, O o5, Object obj, boolean z4, O3.d dVar) {
        super(2, dVar);
        this.f3523d = pVar;
        this.f3524e = o5;
        this.f3525f = obj;
        this.f3526k = z4;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        N n5 = new N(this.f3523d, this.f3524e, this.f3525f, this.f3526k, dVar);
        n5.f3522c = obj;
        return n5;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((Y) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            P3.a r0 = P3.a.f2678a
            int r1 = r8.f3521b
            kotlin.jvm.internal.p r2 = r8.f3523d
            java.lang.Object r3 = r8.f3525f
            W.O r4 = r8.f3524e
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            a.AbstractC0183a.m0(r9)
            goto L65
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1e:
            kotlin.jvm.internal.p r1 = r8.f3520a
            java.lang.Object r6 = r8.f3522c
            W.Y r6 = (W.Y) r6
            a.AbstractC0183a.m0(r9)
            goto L4f
        L28:
            a.AbstractC0183a.m0(r9)
            java.lang.Object r9 = r8.f3522c
            W.Y r9 = (W.Y) r9
            W.i0 r1 = r4.f()
            r8.f3522c = r9
            r8.f3520a = r2
            r8.f3521b = r6
            K2.c r1 = r1.f3616b
            java.lang.Object r1 = r1.b
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            if (r6 != r0) goto L4b
            return r0
        L4b:
            r1 = r2
            r7 = r6
            r6 = r9
            r9 = r7
        L4f:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r1.f8429a = r9
            r9 = 0
            r8.f3522c = r9
            r8.f3520a = r9
            r8.f3521b = r5
            java.lang.Object r9 = r6.b(r3, r8)
            if (r9 != r0) goto L65
            return r0
        L65:
            boolean r8 = r8.f3526k
            if (r8 == 0) goto L7d
            g1.i r8 = r4.f3534l
            W.d r9 = new W.d
            if (r3 == 0) goto L74
            int r0 = r3.hashCode()
            goto L75
        L74:
            r0 = 0
        L75:
            int r1 = r2.f8429a
            r9.<init>(r3, r0, r1)
            r8.E(r9)
        L7d:
            K3.k r8 = K3.k.f2288a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: W.N.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
