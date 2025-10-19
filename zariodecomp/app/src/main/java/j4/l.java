package j4;

import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\l.smali */
public final class l implements InterfaceC0613h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f8096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f4.C f8097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f8098c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0613h f8099d;

    public l(kotlin.jvm.internal.r rVar, f4.C c5, n nVar, InterfaceC0613h interfaceC0613h) {
        this.f8096a = rVar;
        this.f8097b = c5;
        this.f8098c = nVar;
        this.f8099d = interfaceC0613h;
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
            boolean r0 = r8 instanceof j4.k
            if (r0 == 0) goto L13
            r0 = r8
            j4.k r0 = (j4.k) r0
            int r1 = r0.f8095e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8095e = r1
            goto L18
        L13:
            j4.k r0 = new j4.k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f8093c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f8095e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f8092b
            j4.l r6 = r0.f8091a
            a.AbstractC0183a.m0(r8)
            goto L55
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            a.AbstractC0183a.m0(r8)
            kotlin.jvm.internal.r r8 = r6.f8096a
            java.lang.Object r8 = r8.f8431a
            f4.g0 r8 = (f4.InterfaceC0506g0) r8
            if (r8 == 0) goto L55
            j4.o r2 = new j4.o
            java.lang.String r4 = "Child of the scoped flow was cancelled"
            r2.<init>(r4)
            r8.cancel(r2)
            r0.f8091a = r6
            r0.f8092b = r7
            r0.f8095e = r3
            java.lang.Object r8 = r8.join(r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            kotlin.jvm.internal.r r8 = r6.f8096a
            f4.D r0 = f4.D.f7005d
            j4.j r1 = new j4.j
            i4.h r2 = r6.f8099d
            j4.n r4 = r6.f8098c
            r5 = 0
            r1.<init>(r4, r2, r7, r5)
            f4.C r6 = r6.f8097b
            f4.A0 r6 = f4.E.t(r6, r5, r0, r1, r3)
            r8.f8431a = r6
            K3.k r6 = K3.k.f2288a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.l.b(java.lang.Object, O3.d):java.lang.Object");
    }
}
