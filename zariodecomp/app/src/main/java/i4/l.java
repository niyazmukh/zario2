package i4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\l.smali */
public final class l implements InterfaceC0612g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O0.i f7922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W.r f7923b;

    public l(O0.i iVar, W.r rVar) {
        this.f7922a = iVar;
        this.f7923b = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // i4.InterfaceC0612g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(i4.InterfaceC0613h r9, O3.d r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof i4.C0615k
            if (r0 == 0) goto L13
            r0 = r10
            i4.k r0 = (i4.C0615k) r0
            int r1 = r0.f7918b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7918b = r1
            goto L18
        L13:
            i4.k r0 = new i4.k
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f7917a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f7918b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L53
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r8 = r0.f7920d
            j4.y r8 = (j4.y) r8
            a.AbstractC0183a.m0(r10)     // Catch: java.lang.Throwable -> L32
            goto L7e
        L32:
            r9 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.f7920d
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            a.AbstractC0183a.m0(r10)
            goto L9e
        L44:
            i4.h r9 = r0.f7921e
            java.lang.Object r8 = r0.f7920d
            i4.l r8 = (i4.l) r8
            a.AbstractC0183a.m0(r10)     // Catch: java.lang.Throwable -> L4e
            goto L65
        L4e:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L8a
        L53:
            a.AbstractC0183a.m0(r10)
            O0.i r10 = r8.f7922a     // Catch: java.lang.Throwable -> L4e
            r0.f7920d = r8     // Catch: java.lang.Throwable -> L4e
            r0.f7921e = r9     // Catch: java.lang.Throwable -> L4e
            r0.f7918b = r5     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r10 = r10.c(r9, r0)     // Catch: java.lang.Throwable -> L4e
            if (r10 != r1) goto L65
            return r1
        L65:
            j4.y r10 = new j4.y
            O3.i r2 = r0.getContext()
            r10.<init>(r9, r2)
            W.r r8 = r8.f7923b     // Catch: java.lang.Throwable -> L84
            r0.f7920d = r10     // Catch: java.lang.Throwable -> L84
            r0.f7921e = r6     // Catch: java.lang.Throwable -> L84
            r0.f7918b = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r8 = r8.c(r10, r6, r0)     // Catch: java.lang.Throwable -> L84
            if (r8 != r1) goto L7d
            return r1
        L7d:
            r8 = r10
        L7e:
            r8.releaseIntercepted()
            K3.k r8 = K3.k.f2288a
            return r8
        L84:
            r9 = move-exception
            r8 = r10
        L86:
            r8.releaseIntercepted()
            throw r9
        L8a:
            i4.K r10 = new i4.K
            r10.<init>(r8)
            W.r r9 = r9.f7923b
            r0.f7920d = r8
            r0.f7921e = r6
            r0.f7918b = r4
            java.lang.Object r9 = i4.C.c(r10, r9, r8, r0)
            if (r9 != r1) goto L9e
            return r1
        L9e:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.l.c(i4.h, O3.d):java.lang.Object");
    }
}
