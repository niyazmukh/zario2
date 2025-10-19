package b3;

import android.util.Log;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: b3.s, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\s.1.smali */
public final class C0324s implements S2.b {

    /* renamed from: a, reason: collision with root package name */
    public final C0294S f5306a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseAuth f5307b;

    /* renamed from: c, reason: collision with root package name */
    public final X2.g f5308c;

    /* renamed from: d, reason: collision with root package name */
    public final C0297V f5309d;

    public C0324s(C0294S userGateway, FirebaseAuth auth, X2.g remoteSyncDao, C0297V remoteSyncScheduler) {
        kotlin.jvm.internal.i.e(userGateway, "userGateway");
        kotlin.jvm.internal.i.e(auth, "auth");
        kotlin.jvm.internal.i.e(remoteSyncDao, "remoteSyncDao");
        kotlin.jvm.internal.i.e(remoteSyncScheduler, "remoteSyncScheduler");
        this.f5306a = userGateway;
        this.f5307b = auth;
        this.f5308c = remoteSyncDao;
        this.f5309d = remoteSyncScheduler;
    }

    public final C0317l a() {
        o2.o oVar = this.f5307b.f6373f;
        if (oVar == null) {
            Log.w("FirebaseEvalRemote", "Skipping remote sync – user not authenticated");
            return null;
        }
        p2.e eVar = (p2.e) oVar;
        String str = eVar.f9329b.f9320a;
        kotlin.jvm.internal.i.d(str, "getUid(...)");
        String str2 = eVar.f9329b.f9324e;
        if (str2 == null) {
            str2 = "";
        }
        return new C0317l(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(Y2.b r16, java.util.List r17, int r18, Q3.c r19) {
        /*
            r15 = this;
            r8 = r15
            r0 = r19
            boolean r1 = r0 instanceof b3.C0318m
            if (r1 == 0) goto L17
            r1 = r0
            b3.m r1 = (b3.C0318m) r1
            int r2 = r1.f5278d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f5278d = r2
        L15:
            r9 = r1
            goto L1d
        L17:
            b3.m r1 = new b3.m
            r1.<init>(r15, r0)
            goto L15
        L1d:
            java.lang.Object r0 = r9.f5276b
            P3.a r10 = P3.a.f2678a
            int r1 = r9.f5278d
            K3.k r11 = K3.k.f2288a
            r12 = 1
            if (r1 == 0) goto L38
            if (r1 != r12) goto L30
            b3.s r1 = r9.f5275a
            a.AbstractC0183a.m0(r0)
            goto L64
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            a.AbstractC0183a.m0(r0)
            b3.l r0 = r15.a()
            if (r0 != 0) goto L42
            return r11
        L42:
            m4.e r1 = f4.N.f7027a
            m4.d r13 = m4.d.f8928c
            b3.n r14 = new b3.n
            java.lang.String r2 = r0.f5274b
            java.lang.String r1 = r0.f5273a
            r7 = 0
            r0 = r14
            r3 = r16
            r4 = r18
            r5 = r17
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.f5275a = r8
            r9.f5278d = r12
            java.lang.Object r0 = f4.E.B(r13, r14, r9)
            if (r0 != r10) goto L63
            return r10
        L63:
            r1 = r8
        L64:
            b3.V r0 = r1.f5309d
            r0.a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0324s.b(Y2.b, java.util.List, int, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(int r6, Q3.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof b3.C0320o
            if (r0 == 0) goto L13
            r0 = r7
            b3.o r0 = (b3.C0320o) r0
            int r1 = r0.f5288c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5288c = r1
            goto L18
        L13:
            b3.o r0 = new b3.o
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f5286a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f5288c
            K3.k r3 = K3.k.f2288a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            a.AbstractC0183a.m0(r7)     // Catch: java.lang.Throwable -> L29
            goto L59
        L29:
            r5 = move-exception
            goto L5b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            a.AbstractC0183a.m0(r7)
            b3.l r7 = r5.a()
            if (r7 == 0) goto L6c
            java.lang.String r7 = r7.f5273a
            if (r7 != 0) goto L41
            goto L6c
        L41:
            b3.S r5 = r5.f5306a     // Catch: java.lang.Throwable -> L29
            r0.f5288c = r4     // Catch: java.lang.Throwable -> L29
            r5.getClass()     // Catch: java.lang.Throwable -> L29
            b3.J r2 = new b3.J     // Catch: java.lang.Throwable -> L29
            r4 = 0
            r2.<init>(r5, r7, r6, r4)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = p1.b.U(r2, r0)     // Catch: java.lang.Throwable -> L29
            if (r5 != r1) goto L55
            goto L56
        L55:
            r5 = r3
        L56:
            if (r5 != r1) goto L59
            return r1
        L59:
            r5 = r3
            goto L5f
        L5b:
            K3.f r5 = a.AbstractC0183a.v(r5)
        L5f:
            java.lang.Throwable r5 = K3.g.a(r5)
            if (r5 == 0) goto L6c
            java.lang.String r6 = "FirebaseEvalRemote"
            java.lang.String r7 = "Failed to sync streak"
            android.util.Log.w(r6, r7, r5)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0324s.c(int, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r20, long r21, java.util.List r23, Q3.c r24) {
        /*
            r19 = this;
            r11 = r19
            r0 = r24
            boolean r1 = r0 instanceof b3.C0321p
            if (r1 == 0) goto L18
            r1 = r0
            b3.p r1 = (b3.C0321p) r1
            int r2 = r1.f5292d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f5292d = r2
        L16:
            r12 = r1
            goto L1e
        L18:
            b3.p r1 = new b3.p
            r1.<init>(r11, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r12.f5290b
            P3.a r13 = P3.a.f2678a
            int r1 = r12.f5292d
            K3.k r14 = K3.k.f2288a
            r15 = 1
            if (r1 == 0) goto L3a
            if (r1 != r15) goto L32
            b3.s r1 = r12.f5289a
            a.AbstractC0183a.m0(r0)
            r11 = r1
            goto L99
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            a.AbstractC0183a.m0(r0)
            b3.l r0 = r19.a()
            if (r0 != 0) goto L44
            return r14
        L44:
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1
            long r1 = r1 - r3
            java.time.Instant r1 = java.time.Instant.ofEpochMilli(r1)
            java.time.ZoneId r2 = java.time.ZoneId.systemDefault()
            java.time.ZonedDateTime r1 = java.time.ZonedDateTime.ofInstant(r1, r2)
            java.time.temporal.ChronoUnit r2 = java.time.temporal.ChronoUnit.HOURS
            java.time.ZonedDateTime r1 = r1.truncatedTo(r2)
            java.time.Instant r1 = r1.toInstant()
            long r6 = r1.toEpochMilli()
            boolean r1 = r23.isEmpty()
            if (r1 == 0) goto L6c
            return r14
        L6c:
            m4.e r1 = f4.N.f7027a
            m4.d r10 = m4.d.f8928c
            b3.q r9 = new b3.q
            java.lang.String r8 = r0.f5274b
            java.lang.String r1 = r0.f5273a
            r16 = 0
            r0 = r9
            r2 = r21
            r4 = r19
            r5 = r23
            r17 = r9
            r9 = r20
            r18 = r10
            r10 = r16
            r0.<init>(r1, r2, r4, r5, r6, r8, r9, r10)
            r12.f5289a = r11
            r12.f5292d = r15
            r1 = r17
            r0 = r18
            java.lang.Object r0 = f4.E.B(r0, r1, r12)
            if (r0 != r13) goto L99
            return r13
        L99:
            b3.V r0 = r11.f5309d
            r0.a()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0324s.d(java.lang.String, long, java.util.List, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(V2.n r11, Q3.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof b3.C0323r
            if (r0 == 0) goto L13
            r0 = r12
            b3.r r0 = (b3.C0323r) r0
            int r1 = r0.f5305c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5305c = r1
            goto L18
        L13:
            b3.r r0 = new b3.r
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f5303a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f5305c
            K3.k r3 = K3.k.f2288a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            a.AbstractC0183a.m0(r12)     // Catch: java.lang.Throwable -> L2a
            goto L9c
        L2a:
            r10 = move-exception
            goto L9e
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            a.AbstractC0183a.m0(r12)
            b3.l r12 = r10.a()
            if (r12 == 0) goto Laf
            java.lang.String r12 = r12.f5273a
            if (r12 != 0) goto L43
            goto Laf
        L43:
            long r5 = r11.f3447a
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            K3.e r5 = new K3.e
            java.lang.String r6 = "goalTimeMs"
            r5.<init>(r6, r2)
            long r6 = r11.f3448b
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            K3.e r6 = new K3.e
            java.lang.String r7 = "dailyAverageMs"
            r6.<init>(r7, r2)
            K3.e r2 = new K3.e
            java.lang.String r7 = "label"
            java.lang.String r8 = r11.f3449c
            r2.<init>(r7, r8)
            long r7 = r11.f3450d
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            K3.e r8 = new K3.e
            java.lang.String r9 = "planCreatedAt"
            r8.<init>(r9, r7)
            K3.e r7 = new K3.e
            java.lang.String r9 = "evaluationStartTime"
            java.lang.Long r11 = r11.f3451e
            r7.<init>(r9, r11)
            K3.e[] r11 = new K3.e[]{r5, r6, r2, r8, r7}
            java.util.Map r11 = L3.x.c0(r11)
            b3.S r10 = r10.f5306a     // Catch: java.lang.Throwable -> L2a
            r0.f5305c = r4     // Catch: java.lang.Throwable -> L2a
            r10.getClass()     // Catch: java.lang.Throwable -> L2a
            b3.K r2 = new b3.K     // Catch: java.lang.Throwable -> L2a
            r4 = 0
            r2.<init>(r10, r12, r11, r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r10 = p1.b.U(r2, r0)     // Catch: java.lang.Throwable -> L2a
            if (r10 != r1) goto L98
            goto L99
        L98:
            r10 = r3
        L99:
            if (r10 != r1) goto L9c
            return r1
        L9c:
            r10 = r3
            goto La2
        L9e:
            K3.f r10 = a.AbstractC0183a.v(r10)
        La2:
            java.lang.Throwable r10 = K3.g.a(r10)
            if (r10 == 0) goto Laf
            java.lang.String r11 = "FirebaseEvalRemote"
            java.lang.String r12 = "Failed to sync plan"
            android.util.Log.w(r11, r12, r10)
        Laf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0324s.e(V2.n, Q3.c):java.lang.Object");
    }
}
