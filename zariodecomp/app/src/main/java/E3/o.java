package e3;

import V2.p;
import W.InterfaceC0167i;
import android.content.Context;
import b3.C0294S;
import b3.C0297V;
import f4.C;
import f4.E;
import i4.I;
import i4.x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e3.1\o.smali */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final C0294S f6940a;

    /* renamed from: b, reason: collision with root package name */
    public final X2.g f6941b;

    /* renamed from: c, reason: collision with root package name */
    public final C0297V f6942c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0167i f6943d;

    /* renamed from: e, reason: collision with root package name */
    public final I f6944e;

    /* renamed from: f, reason: collision with root package name */
    public final x f6945f;

    public o(Context context, C applicationScope, C0294S userGateway, X2.g remoteSyncDao, C0297V remoteSyncScheduler) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(applicationScope, "applicationScope");
        kotlin.jvm.internal.i.e(userGateway, "userGateway");
        kotlin.jvm.internal.i.e(remoteSyncDao, "remoteSyncDao");
        kotlin.jvm.internal.i.e(remoteSyncScheduler, "remoteSyncScheduler");
        this.f6940a = userGateway;
        this.f6941b = remoteSyncDao;
        this.f6942c = remoteSyncScheduler;
        this.f6943d = V2.g.f3435b.a(context, V2.g.f3434a[0]);
        I iB = i4.C.b(new p());
        this.f6944e = iB;
        this.f6945f = new x(iB);
        E.t(applicationScope, null, null, new C0479b(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: IllegalArgumentException -> 0x0066, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x0066, blocks: (B:24:0x005c, B:26:0x0062), top: B:51:0x005c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static V2.p f(a0.b r15) throws java.security.NoSuchAlgorithmException {
        /*
            a0.d r0 = e3.AbstractC0480c.f6891a
            java.lang.Object r0 = r15.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1 = 0
            if (r0 == 0) goto L10
            boolean r0 = r0.booleanValue()
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 == 0) goto Lb7
            a0.d r2 = e3.AbstractC0480c.f6892b
            java.lang.Object r2 = r15.c(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ""
            if (r2 != 0) goto L21
            r5 = r3
            goto L22
        L21:
            r5 = r2
        L22:
            a0.d r2 = e3.AbstractC0480c.f6893c
            java.lang.Object r2 = r15.c(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L30
            java.lang.String r2 = a.AbstractC0183a.A(r5)
        L30:
            r6 = r2
            V2.o r2 = new V2.o
            a0.d r4 = e3.AbstractC0480c.f6894d
            java.lang.Object r4 = r15.c(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L3f
            r7 = r3
            goto L40
        L3f:
            r7 = r4
        L40:
            a0.d r4 = e3.AbstractC0480c.f6895e
            java.lang.Object r4 = r15.c(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L4c
            r8 = r3
            goto L4d
        L4c:
            r8 = r4
        L4d:
            J3.c r3 = V2.f.f3430a
            a0.d r4 = e3.AbstractC0480c.f6896f
            java.lang.Object r4 = r15.c(r4)
            java.lang.String r4 = (java.lang.String) r4
            r3.getClass()
            if (r4 == 0) goto L62
            V2.f r3 = V2.f.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> L66
            if (r3 != 0) goto L64
        L62:
            V2.f r3 = V2.f.f3431b     // Catch: java.lang.IllegalArgumentException -> L66
        L64:
            r9 = r3
            goto L69
        L66:
            V2.f r3 = V2.f.f3431b
            goto L64
        L69:
            a0.d r3 = e3.AbstractC0480c.f6897g
            java.lang.Object r3 = r15.c(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L79
            int r3 = r3.intValue()
        L77:
            r10 = r3
            goto L7c
        L79:
            r3 = 100
            goto L77
        L7c:
            a0.d r3 = e3.AbstractC0480c.h
            java.lang.Object r3 = r15.c(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L8c
            int r3 = r3.intValue()
        L8a:
            r11 = r3
            goto L8e
        L8c:
            r3 = 5
            goto L8a
        L8e:
            a0.d r3 = e3.AbstractC0480c.i
            java.lang.Object r3 = r15.c(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L9e
            int r3 = r3.intValue()
        L9c:
            r12 = r3
            goto La1
        L9e:
            r3 = 20
            goto L9c
        La1:
            a0.d r3 = e3.AbstractC0480c.f6898j
            java.lang.Object r15 = r15.c(r3)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            if (r15 == 0) goto Laf
            boolean r1 = r15.booleanValue()
        Laf:
            r13 = r1
            r14 = 192(0xc0, float:2.69E-43)
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto Lb8
        Lb7:
            r2 = 0
        Lb8:
            V2.p r15 = new V2.p
            r15.<init>(r0, r2)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.o.f(a0.b):V2.p");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r11, Q3.c r12) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.o.a(int, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(Q3.c r5) throws java.security.NoSuchAlgorithmException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof e3.C0484g
            if (r0 == 0) goto L13
            r0 = r5
            e3.g r0 = (e3.C0484g) r0
            int r1 = r0.f6914d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6914d = r1
            goto L18
        L13:
            e3.g r0 = new e3.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6912b
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f6914d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            e3.o r4 = r0.f6911a
            a.AbstractC0183a.m0(r5)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            a.AbstractC0183a.m0(r5)
            W.i r5 = r4.f6943d
            i4.g r5 = r5.p()
            r0.f6911a = r4
            r0.f6914d = r3
            java.lang.Object r5 = i4.C.i(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            a0.b r5 = (a0.b) r5
            r4.getClass()
            V2.p r5 = f(r5)
            i4.I r4 = r4.f6944e
            r4.getClass()
            r0 = 0
            r4.M(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.o.b(Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(Q3.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof e3.C0485h
            if (r0 == 0) goto L13
            r0 = r7
            e3.h r0 = (e3.C0485h) r0
            int r1 = r0.f6918d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6918d = r1
            goto L18
        L13:
            e3.h r0 = new e3.h
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f6916b
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f6918d
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            e3.o r6 = r0.f6915a
            a.AbstractC0183a.m0(r7)
            goto L76
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            e3.o r6 = r0.f6915a
            a.AbstractC0183a.m0(r7)
            goto L50
        L3b:
            a.AbstractC0183a.m0(r7)
            e3.i r7 = new e3.i
            r7.<init>(r4, r5)
            r0.f6915a = r6
            r0.f6918d = r3
            W.i r2 = r6.f6943d
            java.lang.Object r7 = N2.AbstractC0156x.B(r2, r7, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            b3.V r7 = r6.f6942c
            android.content.Context r7 = r7.f5192a
            K0.r r7 = K0.r.b(r7)
            java.lang.String r2 = "getInstance(...)"
            kotlin.jvm.internal.i.d(r7, r2)
            java.lang.String r2 = "remote_firestore_sync"
            r7.a(r2)
            m4.e r7 = f4.N.f7027a
            m4.d r7 = m4.d.f8928c
            e3.j r2 = new e3.j
            r2.<init>(r6, r5)
            r0.f6915a = r6
            r0.f6918d = r4
            java.lang.Object r7 = f4.E.B(r7, r2, r0)
            if (r7 != r1) goto L76
            return r1
        L76:
            i4.I r6 = r6.f6944e
            V2.p r7 = new V2.p
            r7.<init>()
            r6.getClass()
            r6.M(r5, r7)
            K3.k r6 = K3.k.f2288a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.o.c(Q3.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(10:12|53|13|14|40|41|51|42|49|50)(2:17|18))(1:19))(4:20|(1:22)(1:23)|24|(2:26|27)(2:28|(1:30)(1:31)))|32|55|33|(1:35)(1:36)|(1:38)(7:39|40|41|51|42|49|50)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0161, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0162, code lost:
    
        r1 = r21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(int r25, int r26, Q3.c r27) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.o.d(int, int, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(V2.o r6, Q3.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof e3.m
            if (r0 == 0) goto L13
            r0 = r7
            e3.m r0 = (e3.m) r0
            int r1 = r0.f6937e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6937e = r1
            goto L18
        L13:
            e3.m r0 = new e3.m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f6935c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f6937e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            V2.o r6 = r0.f6934b
            e3.o r5 = r0.f6933a
            a.AbstractC0183a.m0(r7)
            goto L4b
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            a.AbstractC0183a.m0(r7)
            e3.n r7 = new e3.n
            r7.<init>(r6, r3)
            r0.f6933a = r5
            r0.f6934b = r6
            r0.f6937e = r4
            W.i r2 = r5.f6943d
            java.lang.Object r7 = N2.AbstractC0156x.B(r2, r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            i4.I r5 = r5.f6944e
            V2.p r7 = new V2.p
            r7.<init>(r4, r6)
            r5.getClass()
            r5.M(r3, r7)
            K3.k r5 = K3.k.f2288a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.o.e(V2.o, Q3.c):java.lang.Object");
    }
}
