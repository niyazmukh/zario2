package W;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\E.smali */
public final class E extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public Object f3488a;

    /* renamed from: b, reason: collision with root package name */
    public int f3489b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f3490c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f3491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3492e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(O o5, int i, O3.d dVar) {
        super(2, dVar);
        this.f3491d = o5;
        this.f3492e = i;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        E e5 = new E(this.f3491d, this.f3492e, dVar);
        e5.f3490c = ((Boolean) obj).booleanValue();
        return e5;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) create(bool, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            P3.a r0 = P3.a.f2678a
            int r1 = r6.f3489b
            W.O r2 = r6.f3491d
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r6 = r6.f3488a
            a.AbstractC0183a.m0(r7)
            goto L46
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1c:
            boolean r1 = r6.f3490c
            a.AbstractC0183a.m0(r7)
            goto L32
        L22:
            a.AbstractC0183a.m0(r7)
            boolean r1 = r6.f3490c
            r6.f3490c = r1
            r6.f3489b = r4
            java.lang.Object r7 = r2.i(r6)
            if (r7 != r0) goto L32
            return r0
        L32:
            if (r1 == 0) goto L4d
            W.i0 r1 = r2.f()
            r6.f3488a = r7
            r6.f3489b = r3
            java.lang.Integer r6 = r1.a()
            if (r6 != r0) goto L43
            return r0
        L43:
            r5 = r7
            r7 = r6
            r6 = r5
        L46:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L52
        L4d:
            int r6 = r6.f3492e
            r5 = r7
            r7 = r6
            r6 = r5
        L52:
            W.d r0 = new W.d
            if (r6 == 0) goto L5b
            int r1 = r6.hashCode()
            goto L5c
        L5b:
            r1 = 0
        L5c:
            r0.<init>(r6, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W.E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
