package b3;

import com.google.firebase.auth.FirebaseAuth;

/* renamed from: b3.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\k.1.smali */
public final class C0316k {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseAuth f5270a;

    /* renamed from: b, reason: collision with root package name */
    public final C0294S f5271b;

    /* renamed from: c, reason: collision with root package name */
    public final C0327v f5272c;

    public C0316k(FirebaseAuth auth, C0294S userGateway, C0327v syncCoordinator) {
        kotlin.jvm.internal.i.e(auth, "auth");
        kotlin.jvm.internal.i.e(userGateway, "userGateway");
        kotlin.jvm.internal.i.e(syncCoordinator, "syncCoordinator");
        this.f5270a = auth;
        this.f5271b = userGateway;
        this.f5272c = syncCoordinator;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[Catch: IllegalArgumentException -> 0x0088, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x0088, blocks: (B:36:0x007e, B:38:0x0084), top: B:43:0x007e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final V2.o a(b3.C0316k r11, w2.h r12, java.lang.String r13, java.lang.String r14) {
        /*
            r11.getClass()
            java.lang.String r11 = "email"
            java.lang.String r11 = r12.c(r11)
            if (r11 != 0) goto Ld
            r1 = r14
            goto Le
        Ld:
            r1 = r11
        Le:
            java.lang.String r11 = "yearOfBirth"
            java.lang.String r11 = r12.c(r11)
            java.lang.String r14 = ""
            if (r11 != 0) goto L1a
            r3 = r14
            goto L1b
        L1a:
            r3 = r11
        L1b:
            java.lang.String r11 = "gender"
            java.lang.String r11 = r12.c(r11)
            if (r11 != 0) goto L25
            r4 = r14
            goto L26
        L25:
            r4 = r11
        L26:
            java.lang.String r11 = "condition"
            java.lang.String r11 = r12.c(r11)
            java.lang.String r14 = "pointsBalance"
            java.lang.Long r14 = r12.b(r14)
            if (r14 == 0) goto L3b
            long r5 = r14.longValue()
            int r14 = (int) r5
        L39:
            r6 = r14
            goto L3e
        L3b:
            r14 = 100
            goto L39
        L3e:
            java.lang.String r14 = "flexibleReward"
            java.lang.Long r14 = r12.b(r14)
            if (r14 == 0) goto L4d
            long r7 = r14.longValue()
            int r14 = (int) r7
        L4b:
            r7 = r14
            goto L4f
        L4d:
            r14 = 5
            goto L4b
        L4f:
            java.lang.String r14 = "flexiblePenalty"
            java.lang.Long r14 = r12.b(r14)
            if (r14 == 0) goto L5e
            long r8 = r14.longValue()
            int r14 = (int) r8
        L5c:
            r8 = r14
            goto L61
        L5e:
            r14 = 20
            goto L5c
        L61:
            java.lang.Class<java.lang.Boolean> r14 = java.lang.Boolean.class
            java.lang.String r0 = "hasSetFlexibleStakes"
            java.lang.Object r12 = r12.d(r14, r0)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            if (r12 == 0) goto L73
            boolean r12 = r12.booleanValue()
        L71:
            r9 = r12
            goto L75
        L73:
            r12 = 0
            goto L71
        L75:
            V2.o r12 = new V2.o
            J3.c r14 = V2.f.f3430a
            r14.getClass()
            if (r11 == 0) goto L84
            V2.f r11 = V2.f.valueOf(r11)     // Catch: java.lang.IllegalArgumentException -> L88
            if (r11 != 0) goto L86
        L84:
            V2.f r11 = V2.f.f3431b     // Catch: java.lang.IllegalArgumentException -> L88
        L86:
            r5 = r11
            goto L8b
        L88:
            V2.f r11 = V2.f.f3431b
            goto L86
        L8b:
            r10 = 192(0xc0, float:2.69E-43)
            r0 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0316k.a(b3.k, w2.h, java.lang.String, java.lang.String):V2.o");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r6, java.lang.String r7, Q3.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof b3.C0306c
            if (r0 == 0) goto L13
            r0 = r8
            b3.c r0 = (b3.C0306c) r0
            int r1 = r0.f5228c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5228c = r1
            goto L18
        L13:
            b3.c r0 = new b3.c
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f5226a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f5228c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0183a.m0(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            a.AbstractC0183a.m0(r8)
            m4.e r8 = f4.N.f7027a
            m4.d r8 = m4.d.f8928c
            b3.f r2 = new b3.f
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.f5228c = r3
            java.lang.Object r8 = f4.E.B(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            K3.g r8 = (K3.g) r8
            java.lang.Object r5 = r8.f2280a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0316k.b(java.lang.String, java.lang.String, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(R2.a r6, Q3.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof b3.C0312g
            if (r0 == 0) goto L13
            r0 = r7
            b3.g r0 = (b3.C0312g) r0
            int r1 = r0.f5255c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5255c = r1
            goto L18
        L13:
            b3.g r0 = new b3.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f5253a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f5255c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0183a.m0(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            a.AbstractC0183a.m0(r7)
            m4.e r7 = f4.N.f7027a
            m4.d r7 = m4.d.f8928c
            b3.j r2 = new b3.j
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f5255c = r3
            java.lang.Object r7 = f4.E.B(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            K3.g r7 = (K3.g) r7
            java.lang.Object r5 = r7.f2280a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0316k.c(R2.a, Q3.c):java.lang.Object");
    }
}
