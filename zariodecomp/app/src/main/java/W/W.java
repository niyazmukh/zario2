package W;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\W.smali */
public final class W implements InterfaceC0159a {

    /* renamed from: a, reason: collision with root package name */
    public final File f3560a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f3561b;

    /* renamed from: c, reason: collision with root package name */
    public final O0.g f3562c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3563d;

    /* renamed from: e, reason: collision with root package name */
    public final o4.c f3564e;

    public W(File file, i0 coordinator, O0.g gVar) {
        kotlin.jvm.internal.i.e(coordinator, "coordinator");
        this.f3560a = file;
        this.f3561b = coordinator;
        this.f3562c = gVar;
        this.f3563d = new AtomicBoolean(false);
        this.f3564e = o4.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(W.r r8, Q3.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof W.U
            if (r0 == 0) goto L13
            r0 = r9
            W.U r0 = (W.U) r0
            int r1 = r0.f3552f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3552f = r1
            goto L18
        L13:
            W.U r0 = new W.U
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f3550d
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3552f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            boolean r7 = r0.f3549c
            W.Q r8 = r0.f3548b
            W.W r0 = r0.f3547a
            a.AbstractC0183a.m0(r9)     // Catch: java.lang.Throwable -> L2e
            goto L6b
        L2e:
            r9 = move-exception
            r6 = r9
            r9 = r7
            r7 = r0
            r0 = r6
            goto L83
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            a.AbstractC0183a.m0(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.f3563d
            boolean r9 = r9.get()
            if (r9 != 0) goto L95
            o4.c r9 = r7.f3564e
            boolean r9 = r9.d(r3)
            W.Q r2 = new W.Q     // Catch: java.lang.Throwable -> L8c
            java.io.File r5 = r7.f3560a     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L80
            r0.f3547a = r7     // Catch: java.lang.Throwable -> L80
            r0.f3548b = r2     // Catch: java.lang.Throwable -> L80
            r0.f3549c = r9     // Catch: java.lang.Throwable -> L80
            r0.f3552f = r4     // Catch: java.lang.Throwable -> L80
            java.lang.Object r8 = r8.c(r2, r5, r0)     // Catch: java.lang.Throwable -> L80
            if (r8 != r1) goto L67
            return r1
        L67:
            r0 = r7
            r7 = r9
            r9 = r8
            r8 = r2
        L6b:
            r8.close()     // Catch: java.lang.Throwable -> L70
            r8 = r3
            goto L71
        L70:
            r8 = move-exception
        L71:
            if (r8 != 0) goto L7b
            if (r7 == 0) goto L7a
            o4.c r7 = r0.f3564e
            r7.e(r3)
        L7a:
            return r9
        L7b:
            throw r8     // Catch: java.lang.Throwable -> L7c
        L7c:
            r8 = move-exception
            r9 = r7
            r7 = r0
            goto L8d
        L80:
            r8 = move-exception
            r0 = r8
            r8 = r2
        L83:
            r8.close()     // Catch: java.lang.Throwable -> L87
            goto L8b
        L87:
            r8 = move-exception
            N2.AbstractC0156x.c(r0, r8)     // Catch: java.lang.Throwable -> L8c
        L8b:
            throw r0     // Catch: java.lang.Throwable -> L8c
        L8c:
            r8 = move-exception
        L8d:
            if (r9 == 0) goto L94
            o4.c r7 = r7.f3564e
            r7.e(r3)
        L94:
            throw r8
        L95:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "StorageConnection has already been disposed."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: W.W.a(W.r, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da A[Catch: all -> 0x011b, IOException -> 0x011d, TRY_ENTER, TryCatch #6 {all -> 0x011b, blocks: (B:42:0x00da, B:44:0x00e0, B:45:0x00e2, B:50:0x00fa, B:51:0x011a, B:58:0x0129, B:65:0x0137, B:64:0x0134), top: B:90:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129 A[Catch: all -> 0x011b, IOException -> 0x011d, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x011b, blocks: (B:42:0x00da, B:44:0x00e0, B:45:0x00e2, B:50:0x00fa, B:51:0x011a, B:58:0x0129, B:65:0x0137, B:64:0x0134), top: B:90:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(W.N r11, Q3.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.W.b(W.N, Q3.c):java.lang.Object");
    }

    @Override // W.InterfaceC0159a
    public final void close() {
        this.f3563d.set(true);
        this.f3562c.invoke();
    }
}
