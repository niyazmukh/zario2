package h3;

import f4.C;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h3.1\a.smali */
public final class C0594a extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public Object f7703a;

    /* renamed from: b, reason: collision with root package name */
    public c f7704b;

    /* renamed from: c, reason: collision with root package name */
    public int f7705c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f7706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f7708f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0594a(c cVar, String str, String str2, O3.d dVar) {
        super(2, dVar);
        this.f7706d = cVar;
        this.f7707e = str;
        this.f7708f = str2;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0594a(this.f7706d, this.f7707e, this.f7708f, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0594a) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            P3.a r0 = P3.a.f2678a
            int r1 = r7.f7705c
            h3.c r2 = r7.f7706d
            r3 = 2
            r4 = 1
            r5 = 0
            i4.I r6 = r2.f7720d
            if (r1 == 0) goto L29
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            h3.c r0 = r7.f7704b
            java.lang.Object r7 = r7.f7703a
            a.AbstractC0183a.m0(r8)
            goto L5b
        L19:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L21:
            a.AbstractC0183a.m0(r8)
            K3.g r8 = (K3.g) r8
            java.lang.Object r8 = r8.f2280a
            goto L43
        L29:
            a.AbstractC0183a.m0(r8)
            V2.c r8 = V2.c.f3428a
            r6.getClass()
            r6.M(r5, r8)
            r7.f7705c = r4
            b3.k r8 = r2.f7719c
            java.lang.String r1 = r7.f7707e
            java.lang.String r4 = r7.f7708f
            java.lang.Object r8 = r8.b(r1, r4, r7)
            if (r8 != r0) goto L43
            return r0
        L43:
            boolean r1 = r8 instanceof K3.f
            if (r1 != 0) goto L66
            r1 = r8
            V2.o r1 = (V2.o) r1
            r7.f7703a = r8
            r7.f7704b = r2
            r7.f7705c = r3
            e3.o r3 = r2.f7718b
            java.lang.Object r7 = r3.e(r1, r7)
            if (r7 != r0) goto L59
            return r0
        L59:
            r7 = r8
            r0 = r2
        L5b:
            i4.I r8 = r0.f7720d
            V2.d r0 = V2.d.f3429a
            r8.getClass()
            r8.M(r5, r0)
            r8 = r7
        L66:
            java.lang.Throwable r7 = K3.g.a(r8)
            if (r7 == 0) goto L7b
            V2.a r8 = new V2.a
            java.lang.String r7 = h3.c.b(r2, r7)
            r8.<init>(r7)
            r6.getClass()
            r6.M(r5, r8)
        L7b:
            K3.k r7 = K3.k.f2288a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.C0594a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
