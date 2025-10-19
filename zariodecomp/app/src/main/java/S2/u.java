package S2;

import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\u.smali */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final T2.u f3083a;

    /* renamed from: b, reason: collision with root package name */
    public final T2.e f3084b;

    /* renamed from: c, reason: collision with root package name */
    public final X2.a f3085c;

    /* renamed from: d, reason: collision with root package name */
    public final X2.c f3086d;

    /* renamed from: e, reason: collision with root package name */
    public final b f3087e;

    /* renamed from: f, reason: collision with root package name */
    public final i4.x f3088f;

    public u(T2.u planPreferencesDataSource, T2.e cycleStateStore, X2.a historyDao, X2.c hourlyUsageDao, b remoteDataSource, C applicationScope) {
        kotlin.jvm.internal.i.e(planPreferencesDataSource, "planPreferencesDataSource");
        kotlin.jvm.internal.i.e(cycleStateStore, "cycleStateStore");
        kotlin.jvm.internal.i.e(historyDao, "historyDao");
        kotlin.jvm.internal.i.e(hourlyUsageDao, "hourlyUsageDao");
        kotlin.jvm.internal.i.e(remoteDataSource, "remoteDataSource");
        kotlin.jvm.internal.i.e(applicationScope, "applicationScope");
        this.f3083a = planPreferencesDataSource;
        this.f3084b = cycleStateStore;
        this.f3085c = historyDao;
        this.f3086d = hourlyUsageDao;
        this.f3087e = remoteDataSource;
        this.f3088f = i4.C.l(new q(i4.C.l(new q(cycleStateStore.f3211b, 0), applicationScope, y.h), 1), applicationScope, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(Q3.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof S2.c
            if (r0 == 0) goto L13
            r0 = r5
            S2.c r0 = (S2.c) r0
            int r1 = r0.f3026c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3026c = r1
            goto L18
        L13:
            S2.c r0 = new S2.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3024a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3026c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0183a.m0(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            a.AbstractC0183a.m0(r5)
            r0.f3026c = r3
            T2.u r4 = r4.f3083a
            i4.x r4 = r4.f3254b
            java.lang.Object r5 = i4.C.i(r4, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            T2.v r5 = (T2.v) r5
            V2.n r4 = r5.f3255a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.u.a(Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(Q3.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof S2.d
            if (r0 == 0) goto L13
            r0 = r5
            S2.d r0 = (S2.d) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            S2.d r0 = new S2.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0183a.m0(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            a.AbstractC0183a.m0(r5)
            r0.c = r3
            T2.e r4 = r4.f3084b
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            T2.a r5 = (T2.a) r5
            int r4 = r5.f3194b
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.u.b(Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(Q3.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof S2.e
            if (r0 == 0) goto L13
            r0 = r5
            S2.e r0 = (S2.e) r0
            int r1 = r0.f3029c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3029c = r1
            goto L18
        L13:
            S2.e r0 = new S2.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3027a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3029c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0183a.m0(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            a.AbstractC0183a.m0(r5)
            r0.f3029c = r3
            T2.e r4 = r4.f3084b
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            T2.a r5 = (T2.a) r5
            java.lang.Long r4 = r5.f3195c
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.u.c(Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(Q3.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof S2.f
            if (r0 == 0) goto L13
            r0 = r7
            S2.f r0 = (S2.f) r0
            int r1 = r0.f3032c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3032c = r1
            goto L18
        L13:
            S2.f r0 = new S2.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f3030a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3032c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0183a.m0(r7)
            goto L3d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.AbstractC0183a.m0(r7)
            r0.f3032c = r3
            T2.e r6 = r6.f3084b
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            T2.a r7 = (T2.a) r7
            V2.n r6 = r7.f3193a
            if (r6 != 0) goto L46
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L46:
            java.lang.Long r6 = r6.f3451e
            if (r6 == 0) goto L61
            long r0 = r6.longValue()
            long r4 = java.lang.System.currentTimeMillis()
            boolean r6 = r7.f3196d
            if (r6 != 0) goto L5b
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 < 0) goto L5b
            goto L5c
        L5b:
            r3 = 0
        L5c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L61:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.u.d(Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(Q3.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof S2.g
            if (r0 == 0) goto L13
            r0 = r5
            S2.g r0 = (S2.g) r0
            int r1 = r0.f3035c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3035c = r1
            goto L18
        L13:
            S2.g r0 = new S2.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3033a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3035c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0183a.m0(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            a.AbstractC0183a.m0(r5)
            r0.f3035c = r3
            T2.u r4 = r4.f3083a
            i4.x r4 = r4.f3254b
            java.lang.Object r5 = i4.C.i(r4, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            T2.v r5 = (T2.v) r5
            V2.n r4 = r5.f3255a
            if (r4 == 0) goto L46
            goto L47
        L46:
            r3 = 0
        L47:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.u.e(Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(Q3.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof S2.h
            if (r0 == 0) goto L13
            r0 = r5
            S2.h r0 = (S2.h) r0
            int r1 = r0.f3038c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3038c = r1
            goto L18
        L13:
            S2.h r0 = new S2.h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3036a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3038c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0183a.m0(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            a.AbstractC0183a.m0(r5)
            r0.f3038c = r3
            T2.e r4 = r4.f3084b
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            T2.a r5 = (T2.a) r5
            boolean r4 = r5.f3196d
            if (r4 == 0) goto L48
            boolean r4 = r5.f3198f
            if (r4 != 0) goto L48
            goto L49
        L48:
            r3 = 0
        L49:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.u.f(Q3.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(5:12|36|13|32|33)(2:17|18))(1:19))(2:20|(1:22))|23|34|24|(1:26)(3:27|32|33)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        r7 = r6;
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(Q3.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof S2.i
            if (r0 == 0) goto L13
            r0 = r7
            S2.i r0 = (S2.i) r0
            int r1 = r0.f3043e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3043e = r1
            goto L18
        L13:
            S2.i r0 = new S2.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f3041c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3043e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r6 = r0.f3040b
            a.AbstractC0183a.m0(r7)     // Catch: java.lang.Throwable -> L2c
            goto L71
        L2c:
            r7 = move-exception
            goto L6e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            S2.u r6 = r0.f3039a
            a.AbstractC0183a.m0(r7)
            goto L4e
        L3c:
            a.AbstractC0183a.m0(r7)
            r0.f3039a = r6
            r0.f3043e = r4
            T2.e r7 = r6.f3084b
            T2.u r7 = r7.f3210a
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            S2.b r6 = r6.f3087e     // Catch: java.lang.Throwable -> L6c
            r2 = 0
            r0.f3039a = r2     // Catch: java.lang.Throwable -> L6c
            r0.f3040b = r7     // Catch: java.lang.Throwable -> L6c
            r0.f3043e = r3     // Catch: java.lang.Throwable -> L6c
            b3.s r6 = (b3.C0324s) r6     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r6 = r6.c(r7, r0)     // Catch: java.lang.Throwable -> L6c
            if (r6 != r1) goto L66
            return r1
        L66:
            r6 = r7
            goto L71
        L68:
            r5 = r7
            r7 = r6
            r6 = r5
            goto L6e
        L6c:
            r6 = move-exception
            goto L68
        L6e:
            a.AbstractC0183a.v(r7)
        L71:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.u.g(Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(Q3.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof S2.j
            if (r0 == 0) goto L13
            r0 = r5
            S2.j r0 = (S2.j) r0
            int r1 = r0.f3046c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3046c = r1
            goto L18
        L13:
            S2.j r0 = new S2.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3044a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3046c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0183a.m0(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            a.AbstractC0183a.m0(r5)
            r0.f3046c = r3
            T2.e r4 = r4.f3084b
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            T2.a r5 = (T2.a) r5
            V2.n r4 = r5.f3193a
            if (r4 != 0) goto L46
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L46:
            boolean r0 = r5.f3196d
            if (r0 != 0) goto L4d
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4d:
            java.lang.Long r5 = r5.f3197e
            if (r5 == 0) goto L91
            long r0 = r5.longValue()
            java.lang.Long r4 = r4.f3451e
            if (r4 == 0) goto L8e
            long r4 = r4.longValue()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L88
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            java.time.ZoneId r1 = java.time.ZoneId.systemDefault()
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.ofInstant(r0, r1)
            java.time.LocalDate r0 = r0.toLocalDate()
            java.time.Instant r4 = java.time.Instant.ofEpochMilli(r4)
            java.time.ZoneId r5 = java.time.ZoneId.systemDefault()
            java.time.ZonedDateTime r4 = java.time.ZonedDateTime.ofInstant(r4, r5)
            java.time.LocalDate r4 = r4.toLocalDate()
            boolean r4 = kotlin.jvm.internal.i.a(r0, r4)
            if (r4 == 0) goto L88
            goto L89
        L88:
            r3 = 0
        L89:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L8e:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L91:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.u.h(Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(Q3.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof S2.k
            if (r0 == 0) goto L13
            r0 = r8
            S2.k r0 = (S2.k) r0
            int r1 = r0.f3050d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3050d = r1
            goto L18
        L13:
            S2.k r0 = new S2.k
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f3048b
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3050d
            K3.k r3 = K3.k.f2288a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2d
            a.AbstractC0183a.m0(r8)
            goto L80
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            S2.u r7 = r0.f3047a
            a.AbstractC0183a.m0(r8)
            goto L5f
        L3b:
            a.AbstractC0183a.m0(r8)
            r0.f3047a = r7
            r0.f3050d = r6
            T2.e r8 = r7.f3084b
            T2.u r8 = r8.f3210a
            r8.getClass()
            T2.l r2 = new T2.l
            r2.<init>(r5, r4)
            W.i r8 = r8.f3253a
            java.lang.Object r8 = N2.AbstractC0156x.B(r8, r2, r0)
            if (r8 != r1) goto L57
            goto L58
        L57:
            r8 = r3
        L58:
            if (r8 != r1) goto L5b
            goto L5c
        L5b:
            r8 = r3
        L5c:
            if (r8 != r1) goto L5f
            return r1
        L5f:
            T2.e r7 = r7.f3084b
            r0.f3047a = r4
            r0.f3050d = r5
            T2.u r7 = r7.f3210a
            r7.getClass()
            T2.n r8 = new T2.n
            r8.<init>(r6, r4)
            W.i r7 = r7.f3253a
            java.lang.Object r7 = N2.AbstractC0156x.B(r7, r8, r0)
            if (r7 != r1) goto L78
            goto L79
        L78:
            r7 = r3
        L79:
            if (r7 != r1) goto L7c
            goto L7d
        L7c:
            r7 = r3
        L7d:
            if (r7 != r1) goto L80
            return r1
        L80:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.u.i(Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(Q3.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof S2.l
            if (r0 == 0) goto L13
            r0 = r8
            S2.l r0 = (S2.l) r0
            int r1 = r0.f3054d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3054d = r1
            goto L18
        L13:
            S2.l r0 = new S2.l
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f3052b
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3054d
            K3.k r3 = K3.k.f2288a
            r4 = 0
            r5 = 1
            r6 = 2
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r6) goto L2f
            a.AbstractC0183a.m0(r8)     // Catch: java.lang.Throwable -> L2d
            goto L74
        L2d:
            r7 = move-exception
            goto L71
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            S2.u r7 = r0.f3051a
            a.AbstractC0183a.m0(r8)
            goto L61
        L3d:
            a.AbstractC0183a.m0(r8)
            r0.f3051a = r7
            r0.f3054d = r5
            T2.e r8 = r7.f3084b
            T2.u r8 = r8.f3210a
            r8.getClass()
            T2.o r2 = new T2.o
            r2.<init>(r6, r4)
            W.i r8 = r8.f3253a
            java.lang.Object r8 = N2.AbstractC0156x.B(r8, r2, r0)
            if (r8 != r1) goto L59
            goto L5a
        L59:
            r8 = r3
        L5a:
            if (r8 != r1) goto L5d
            goto L5e
        L5d:
            r8 = r3
        L5e:
            if (r8 != r1) goto L61
            return r1
        L61:
            S2.b r7 = r7.f3087e     // Catch: java.lang.Throwable -> L2d
            r0.f3051a = r4     // Catch: java.lang.Throwable -> L2d
            r0.f3054d = r6     // Catch: java.lang.Throwable -> L2d
            b3.s r7 = (b3.C0324s) r7     // Catch: java.lang.Throwable -> L2d
            r8 = 0
            java.lang.Object r7 = r7.c(r8, r0)     // Catch: java.lang.Throwable -> L2d
            if (r7 != r1) goto L74
            return r1
        L71:
            a.AbstractC0183a.v(r7)
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.u.j(Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(V2.n r8, Q3.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof S2.m
            if (r0 == 0) goto L13
            r0 = r9
            S2.m r0 = (S2.m) r0
            int r1 = r0.f3059e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3059e = r1
            goto L18
        L13:
            S2.m r0 = new S2.m
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f3057c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3059e
            K3.k r3 = K3.k.f2288a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            a.AbstractC0183a.m0(r9)     // Catch: java.lang.Throwable -> L2d
            goto L73
        L2d:
            r7 = move-exception
            goto L70
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            V2.n r8 = r0.f3056b
            S2.u r7 = r0.f3055a
            a.AbstractC0183a.m0(r9)
            goto L5f
        L3f:
            a.AbstractC0183a.m0(r9)
            r0.f3055a = r7
            r0.f3056b = r8
            r0.f3059e = r5
            T2.u r9 = r7.f3083a
            r9.getClass()
            T2.q r2 = new T2.q
            r2.<init>(r8, r6)
            W.i r9 = r9.f3253a
            java.lang.Object r9 = N2.AbstractC0156x.B(r9, r2, r0)
            if (r9 != r1) goto L5b
            goto L5c
        L5b:
            r9 = r3
        L5c:
            if (r9 != r1) goto L5f
            return r1
        L5f:
            S2.b r7 = r7.f3087e     // Catch: java.lang.Throwable -> L2d
            r0.f3055a = r6     // Catch: java.lang.Throwable -> L2d
            r0.f3056b = r6     // Catch: java.lang.Throwable -> L2d
            r0.f3059e = r4     // Catch: java.lang.Throwable -> L2d
            b3.s r7 = (b3.C0324s) r7     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r7 = r7.e(r8, r0)     // Catch: java.lang.Throwable -> L2d
            if (r7 != r1) goto L73
            return r1
        L70:
            a.AbstractC0183a.v(r7)
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.u.k(V2.n, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(Q3.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof S2.n
            if (r0 == 0) goto L13
            r0 = r9
            S2.n r0 = (S2.n) r0
            int r1 = r0.f3062c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3062c = r1
            goto L18
        L13:
            S2.n r0 = new S2.n
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f3060a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3062c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0183a.m0(r9)
            goto L3d
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            a.AbstractC0183a.m0(r9)
            r0.f3062c = r3
            T2.e r8 = r8.f3084b
            java.lang.Object r9 = r8.a(r0)
            if (r9 != r1) goto L3d
            return r1
        L3d:
            T2.a r9 = (T2.a) r9
            V2.n r8 = r9.f3193a
            if (r8 != 0) goto L46
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L46:
            java.lang.Long r8 = r8.f3451e
            if (r8 == 0) goto Lb4
            long r0 = r8.longValue()
            long r4 = java.lang.System.currentTimeMillis()
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 <= 0) goto L59
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L59:
            boolean r8 = u0.v.g(r0)
            r2 = 0
            if (r8 == 0) goto L6b
            long r6 = u0.v.e()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L69
            goto L6b
        L69:
            r8 = r2
            goto L6c
        L6b:
            r8 = r3
        L6c:
            boolean r4 = r9.f3196d
            if (r4 == 0) goto La8
            java.lang.Long r9 = r9.f3197e
            if (r9 == 0) goto La8
            long r4 = r9.longValue()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto La8
            long r4 = r9.longValue()
            java.time.Instant r9 = java.time.Instant.ofEpochMilli(r4)
            java.time.ZoneId r4 = java.time.ZoneId.systemDefault()
            java.time.ZonedDateTime r9 = java.time.ZonedDateTime.ofInstant(r9, r4)
            java.time.LocalDate r9 = r9.toLocalDate()
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            java.time.ZoneId r1 = java.time.ZoneId.systemDefault()
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.ofInstant(r0, r1)
            java.time.LocalDate r0 = r0.toLocalDate()
            boolean r9 = kotlin.jvm.internal.i.a(r9, r0)
            if (r9 == 0) goto La8
            r9 = r3
            goto La9
        La8:
            r9 = r2
        La9:
            if (r8 != 0) goto Laf
            if (r9 == 0) goto Lae
            goto Laf
        Lae:
            r3 = r2
        Laf:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        Lb4:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.u.l(Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(Q3.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof S2.s
            if (r0 == 0) goto L13
            r0 = r10
            S2.s r0 = (S2.s) r0
            int r1 = r0.f3077e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3077e = r1
            goto L18
        L13:
            S2.s r0 = new S2.s
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f3075c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3077e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            long r1 = r0.f3074b
            java.lang.Object r9 = r0.f3073a
            V2.n r9 = (V2.n) r9
            a.AbstractC0183a.m0(r10)
            goto Lb6
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r0.f3073a
            S2.u r9 = (S2.u) r9
            a.AbstractC0183a.m0(r10)
            goto L53
        L41:
            a.AbstractC0183a.m0(r10)
            r0.f3073a = r9
            r0.f3077e = r4
            T2.u r10 = r9.f3083a
            i4.x r10 = r10.f3254b
            java.lang.Object r10 = i4.C.i(r10, r0)
            if (r10 != r1) goto L53
            return r1
        L53:
            T2.v r10 = (T2.v) r10
            V2.n r2 = r10.f3255a
            r4 = 0
            if (r2 != 0) goto L5b
            return r4
        L5b:
            java.lang.Long r5 = r2.f3451e
            if (r5 == 0) goto L60
            return r2
        L60:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Long r10 = r10.f3257c
            if (r10 == 0) goto L78
            long r7 = r10.longValue()
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 >= 0) goto L78
            java.lang.String r9 = "EvaluationRepository"
            java.lang.String r10 = "startEvaluation deferred until next cycle window opens"
            android.util.Log.d(r9, r10)
            return r2
        L78:
            java.time.LocalDate r10 = java.time.LocalDate.now()
            java.time.LocalDateTime r10 = r10.atStartOfDay()
            java.time.ZoneId r5 = java.time.ZoneId.systemDefault()
            java.time.ZonedDateTime r10 = r10.atZone(r5)
            java.time.Instant r10 = r10.toInstant()
            long r5 = r10.toEpochMilli()
            T2.e r9 = r9.f3084b
            r0.f3073a = r2
            r0.f3074b = r5
            r0.f3077e = r3
            T2.u r9 = r9.f3210a
            r9.getClass()
            T2.k r10 = new T2.k
            r10.<init>(r5, r4)
            W.i r9 = r9.f3253a
            java.lang.Object r9 = N2.AbstractC0156x.B(r9, r10, r0)
            K3.k r10 = K3.k.f2288a
            if (r9 != r1) goto Lad
            goto Lae
        Lad:
            r9 = r10
        Lae:
            if (r9 != r1) goto Lb1
            r10 = r9
        Lb1:
            if (r10 != r1) goto Lb4
            return r1
        Lb4:
            r9 = r2
            r1 = r5
        Lb6:
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r1)
            V2.n r9 = V2.n.a(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.u.m(Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Long r10, Q3.c r11) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.u.n(java.lang.Long, Q3.c):java.lang.Object");
    }
}
