package W;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\i0.smali */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final o4.c f3615a = o4.d.a();

    /* renamed from: b, reason: collision with root package name */
    public final K2.c f3616b = new K2.c(12);

    /* renamed from: c, reason: collision with root package name */
    public final O0.i f3617c = new O0.i(new h0(2, null));

    public i0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f3616b.b).get());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [W.i0] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o4.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(X3.l r7, Q3.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof W.f0
            if (r0 == 0) goto L13
            r0 = r8
            W.f0 r0 = (W.f0) r0
            int r1 = r0.f3600e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3600e = r1
            goto L18
        L13:
            W.f0 r0 = new W.f0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f3598c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3600e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f3596a
            o4.a r6 = (o4.a) r6
            a.AbstractC0183a.m0(r8)     // Catch: java.lang.Throwable -> L2f
            goto L62
        L2f:
            r7 = move-exception
            goto L68
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            o4.c r6 = r0.f3597b
            java.lang.Object r7 = r0.f3596a
            X3.l r7 = (X3.l) r7
            a.AbstractC0183a.m0(r8)
            goto L55
        L43:
            a.AbstractC0183a.m0(r8)
            r0.f3596a = r7
            o4.c r6 = r6.f3615a
            r0.f3597b = r6
            r0.f3600e = r4
            java.lang.Object r8 = r6.c(r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            r0.f3596a = r6     // Catch: java.lang.Throwable -> L2f
            r0.f3597b = r5     // Catch: java.lang.Throwable -> L2f
            r0.f3600e = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L62
            return r1
        L62:
            o4.c r6 = (o4.c) r6
            r6.e(r5)
            return r8
        L68:
            o4.c r6 = (o4.c) r6
            r6.e(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: W.i0.b(X3.l, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(X3.p r7, Q3.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof W.g0
            if (r0 == 0) goto L13
            r0 = r8
            W.g0 r0 = (W.g0) r0
            int r1 = r0.f3607e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3607e = r1
            goto L18
        L13:
            W.g0 r0 = new W.g0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f3605c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3607e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r6 = r0.f3604b
            o4.c r7 = r0.f3603a
            a.AbstractC0183a.m0(r8)     // Catch: java.lang.Throwable -> L2c
            goto L54
        L2c:
            r8 = move-exception
            goto L5f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            a.AbstractC0183a.m0(r8)
            o4.c r6 = r6.f3615a
            boolean r8 = r6.d(r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L5a
            r0.f3603a = r6     // Catch: java.lang.Throwable -> L5a
            r0.f3604b = r8     // Catch: java.lang.Throwable -> L5a
            r0.f3607e = r3     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L5a
            if (r7 != r1) goto L50
            return r1
        L50:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L54:
            if (r6 == 0) goto L59
            r7.e(r4)
        L59:
            return r8
        L5a:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L5f:
            if (r6 == 0) goto L64
            r7.e(r4)
        L64:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: W.i0.c(X3.p, Q3.c):java.lang.Object");
    }
}
