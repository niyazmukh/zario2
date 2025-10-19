package W;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\I.smali */
public final class I extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public Object f3503a;

    /* renamed from: b, reason: collision with root package name */
    public int f3504b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f3505c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O3.i f3506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q3.j f3507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(O o5, O3.i iVar, X3.p pVar, O3.d dVar) {
        super(1, dVar);
        this.f3505c = o5;
        this.f3506d = iVar;
        this.f3507e = (Q3.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Q3.j, X3.p] */
    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new I(this.f3505c, this.f3506d, this.f3507e, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((I) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Type inference failed for: r6v0, types: [Q3.j, X3.p] */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            P3.a r0 = P3.a.f2678a
            int r1 = r8.f3504b
            W.O r2 = r8.f3505c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            java.lang.Object r8 = r8.f3503a
            a.AbstractC0183a.m0(r9)
            goto L71
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1f:
            java.lang.Object r1 = r8.f3503a
            W.d r1 = (W.C0162d) r1
            a.AbstractC0183a.m0(r9)
            goto L4f
        L27:
            a.AbstractC0183a.m0(r9)
            goto L37
        L2b:
            a.AbstractC0183a.m0(r9)
            r8.f3504b = r5
            java.lang.Object r9 = W.O.e(r2, r5, r8)
            if (r9 != r0) goto L37
            return r0
        L37:
            r1 = r9
            W.d r1 = (W.C0162d) r1
            W.H r9 = new W.H
            Q3.j r6 = r8.f3507e
            r7 = 0
            r9.<init>(r6, r1, r7)
            r8.f3503a = r1
            r8.f3504b = r4
            O3.i r4 = r8.f3506d
            java.lang.Object r9 = f4.E.B(r4, r9, r8)
            if (r9 != r0) goto L4f
            return r0
        L4f:
            java.lang.Object r4 = r1.f3581b
            if (r4 == 0) goto L58
            int r4 = r4.hashCode()
            goto L59
        L58:
            r4 = 0
        L59:
            int r6 = r1.f3582c
            if (r4 != r6) goto L73
            java.lang.Object r1 = r1.f3581b
            boolean r1 = kotlin.jvm.internal.i.a(r1, r9)
            if (r1 != 0) goto L72
            r8.f3503a = r9
            r8.f3504b = r3
            java.lang.Object r8 = r2.j(r9, r5, r8)
            if (r8 != r0) goto L70
            return r0
        L70:
            r8 = r9
        L71:
            r9 = r8
        L72:
            return r9
        L73:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: W.I.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
