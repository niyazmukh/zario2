package W;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\Y.smali */
public final class Y extends Q {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6, Q3.c r7) throws java.io.IOException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof W.X
            if (r0 == 0) goto L13
            r0 = r7
            W.X r0 = (W.X) r0
            int r1 = r0.f3569e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3569e = r1
            goto L18
        L13:
            W.X r0 = new W.X
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f3567c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3569e
            K3.k r3 = K3.k.f2288a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.io.FileOutputStream r5 = r0.f3566b
            java.io.FileOutputStream r6 = r0.f3565a
            a.AbstractC0183a.m0(r7)     // Catch: java.lang.Throwable -> L2d
            goto L5e
        L2d:
            r5 = move-exception
            goto L6e
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            a.AbstractC0183a.m0(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r5.f3545b
            boolean r7 = r7.get()
            if (r7 != 0) goto L74
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r5 = r5.f3544a
            r7.<init>(r5)
            a0.g r5 = a0.g.f4024a     // Catch: java.lang.Throwable -> L6c
            B3.k1 r2 = new B3.k1     // Catch: java.lang.Throwable -> L6c
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L6c
            r0.f3565a = r7     // Catch: java.lang.Throwable -> L6c
            r0.f3566b = r7     // Catch: java.lang.Throwable -> L6c
            r0.f3569e = r4     // Catch: java.lang.Throwable -> L6c
            r5.b(r6, r2)     // Catch: java.lang.Throwable -> L6c
            if (r3 != r1) goto L5c
            return r1
        L5c:
            r5 = r7
            r6 = r5
        L5e:
            java.io.FileDescriptor r5 = r5.getFD()     // Catch: java.lang.Throwable -> L2d
            r5.sync()     // Catch: java.lang.Throwable -> L2d
            r5 = 0
            S0.f.t(r6, r5)
            return r3
        L6a:
            r6 = r7
            goto L6e
        L6c:
            r5 = move-exception
            goto L6a
        L6e:
            throw r5     // Catch: java.lang.Throwable -> L6f
        L6f:
            r7 = move-exception
            S0.f.t(r6, r5)
            throw r7
        L74:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This scope has already been closed."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: W.Y.b(java.lang.Object, Q3.c):java.lang.Object");
    }
}
