package j4;

import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\q.smali */
public final class q implements InterfaceC0613h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h4.g f8108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8109b;

    public q(h4.g gVar, int i) {
        this.f8108a = gVar;
        this.f8109b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // i4.InterfaceC0613h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7, O3.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof j4.p
            if (r0 == 0) goto L13
            r0 = r8
            j4.p r0 = (j4.p) r0
            int r1 = r0.f8107c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8107c = r1
            goto L18
        L13:
            j4.p r0 = new j4.p
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f8105a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f8107c
            K3.k r3 = K3.k.f2288a
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r5) goto L2c
            a.AbstractC0183a.m0(r8)
            goto L92
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            a.AbstractC0183a.m0(r8)
            goto L4d
        L38:
            a.AbstractC0183a.m0(r8)
            L3.v r8 = new L3.v
            int r2 = r6.f8109b
            r8.<init>(r2, r7)
            r0.f8107c = r4
            h4.g r6 = r6.f8108a
            java.lang.Object r6 = r6.d(r0, r8)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0.f8107c = r5
            O3.i r6 = r0.getContext()
            f4.E.i(r6)
            O3.d r7 = p1.b.x(r0)
            boolean r8 = r7 instanceof k4.f
            if (r8 == 0) goto L61
            k4.f r7 = (k4.f) r7
            goto L62
        L61:
            r7 = 0
        L62:
            if (r7 != 0) goto L66
            r6 = r3
            goto L89
        L66:
            f4.A r8 = r7.f8378d
            boolean r0 = r8.m(r6)
            if (r0 == 0) goto L76
            r7.f8380f = r3
            r7.f7025c = r4
            r8.l(r6, r7)
            goto L88
        L76:
            f4.J0 r0 = new f4.J0
            f4.B r2 = f4.J0.f7023b
            r0.<init>(r2)
            O3.i r6 = r6.plus(r0)
            r7.f8380f = r3
            r7.f7025c = r4
            r8.l(r6, r7)
        L88:
            r6 = r1
        L89:
            P3.a r7 = P3.a.f2678a
            if (r6 != r7) goto L8e
            goto L8f
        L8e:
            r6 = r3
        L8f:
            if (r6 != r1) goto L92
            return r1
        L92:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.q.b(java.lang.Object, O3.d):java.lang.Object");
    }
}
