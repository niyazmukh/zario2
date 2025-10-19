package h3;

import f4.C;

/* renamed from: h3.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h3.1\b.smali */
public final class C0595b extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public Object f7709a;

    /* renamed from: b, reason: collision with root package name */
    public c f7710b;

    /* renamed from: c, reason: collision with root package name */
    public int f7711c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f7712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f7714f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f7715k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f7716l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0595b(c cVar, String str, String str2, String str3, String str4, O3.d dVar) {
        super(2, dVar);
        this.f7712d = cVar;
        this.f7713e = str;
        this.f7714f = str2;
        this.f7715k = str3;
        this.f7716l = str4;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0595b(this.f7712d, this.f7713e, this.f7714f, this.f7715k, this.f7716l, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0595b) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            P3.a r0 = P3.a.f2678a
            int r1 = r13.f7711c
            h3.c r2 = r13.f7712d
            r3 = 2
            r4 = 1
            r5 = 0
            i4.I r6 = r2.f7720d
            if (r1 == 0) goto L29
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            h3.c r0 = r13.f7710b
            java.lang.Object r13 = r13.f7709a
            a.AbstractC0183a.m0(r14)
            goto L81
        L19:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L21:
            a.AbstractC0183a.m0(r14)
            K3.g r14 = (K3.g) r14
            java.lang.Object r14 = r14.f2280a
            goto L69
        L29:
            a.AbstractC0183a.m0(r14)
            V2.c r14 = V2.c.f3428a
            r6.getClass()
            r6.M(r5, r14)
            V2.f[] r14 = V2.f.values()
            Z3.d r1 = Z3.e.f4014a
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.i.e(r14, r7)
            java.lang.String r7 = "random"
            kotlin.jvm.internal.i.e(r1, r7)
            int r1 = r14.length
            if (r1 == 0) goto La4
            int r1 = r14.length
            Z3.a r7 = Z3.e.f4015b
            int r1 = r7.b(r1)
            r12 = r14[r1]
            R2.a r14 = new R2.a
            java.lang.String r10 = r13.f7715k
            java.lang.String r11 = r13.f7716l
            java.lang.String r8 = r13.f7713e
            java.lang.String r9 = r13.f7714f
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            r13.f7711c = r4
            b3.k r1 = r2.f7719c
            java.lang.Object r14 = r1.c(r14, r13)
            if (r14 != r0) goto L69
            return r0
        L69:
            boolean r1 = r14 instanceof K3.f
            if (r1 != 0) goto L8c
            r1 = r14
            V2.o r1 = (V2.o) r1
            r13.f7709a = r14
            r13.f7710b = r2
            r13.f7711c = r3
            e3.o r3 = r2.f7718b
            java.lang.Object r13 = r3.e(r1, r13)
            if (r13 != r0) goto L7f
            return r0
        L7f:
            r13 = r14
            r0 = r2
        L81:
            i4.I r14 = r0.f7720d
            V2.d r0 = V2.d.f3429a
            r14.getClass()
            r14.M(r5, r0)
            r14 = r13
        L8c:
            java.lang.Throwable r13 = K3.g.a(r14)
            if (r13 == 0) goto La1
            V2.a r14 = new V2.a
            java.lang.String r13 = h3.c.b(r2, r13)
            r14.<init>(r13)
            r6.getClass()
            r6.M(r5, r14)
        La1:
            K3.k r13 = K3.k.f2288a
            return r13
        La4:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            java.lang.String r14 = "Array is empty."
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.C0595b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
