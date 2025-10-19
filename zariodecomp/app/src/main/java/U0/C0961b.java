package u0;

import K3.k;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import java.util.concurrent.Callable;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\b.1.smali */
public final class C0961b extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public h4.c f10386a;

    /* renamed from: b, reason: collision with root package name */
    public int f10387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppDatabase_Impl f10388c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0962c f10389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h4.g f10390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Callable f10391f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h4.g f10392k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0961b(AppDatabase_Impl appDatabase_Impl, C0962c c0962c, h4.g gVar, Callable callable, h4.g gVar2, O3.d dVar) {
        super(2, dVar);
        this.f10388c = appDatabase_Impl;
        this.f10389d = c0962c;
        this.f10390e = gVar;
        this.f10391f = callable;
        this.f10392k = gVar2;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0961b(this.f10388c, this.f10389d, this.f10390e, this.f10391f, this.f10392k, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0961b) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0014, B:18:0x0035, B:21:0x0040, B:23:0x0048, B:14:0x0024, B:17:0x002e), top: B:30:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005b -> B:18:0x0035). Please report as a decompilation issue!!! */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            P3.a r0 = P3.a.f2678a
            int r1 = r7.f10387b
            u0.c r2 = r7.f10389d
            com.niyaz.zario.data.local.AppDatabase_Impl r3 = r7.f10388c
            r4 = 2
            r5 = 1
            u0.s r3 = r3.f10463e
            if (r1 == 0) goto L28
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            h4.c r1 = r7.f10386a
            a.AbstractC0183a.m0(r8)     // Catch: java.lang.Throwable -> L18
            goto L35
        L18:
            r7 = move-exception
            goto L64
        L1a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L22:
            h4.c r1 = r7.f10386a
            a.AbstractC0183a.m0(r8)     // Catch: java.lang.Throwable -> L18
            goto L40
        L28:
            a.AbstractC0183a.m0(r8)
            r3.a(r2)
            h4.g r8 = r7.f10390e     // Catch: java.lang.Throwable -> L18
            h4.c r1 = new h4.c     // Catch: java.lang.Throwable -> L18
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L18
        L35:
            r7.f10386a = r1     // Catch: java.lang.Throwable -> L18
            r7.f10387b = r5     // Catch: java.lang.Throwable -> L18
            java.lang.Object r8 = r1.a(r7)     // Catch: java.lang.Throwable -> L18
            if (r8 != r0) goto L40
            return r0
        L40:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L18
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L18
            if (r8 == 0) goto L5e
            r1.c()     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.Callable r8 = r7.f10391f     // Catch: java.lang.Throwable -> L18
            java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L18
            h4.g r6 = r7.f10392k     // Catch: java.lang.Throwable -> L18
            r7.f10386a = r1     // Catch: java.lang.Throwable -> L18
            r7.f10387b = r4     // Catch: java.lang.Throwable -> L18
            java.lang.Object r8 = r6.d(r7, r8)     // Catch: java.lang.Throwable -> L18
            if (r8 != r0) goto L35
            return r0
        L5e:
            r3.c(r2)
            K3.k r7 = K3.k.f2288a
            return r7
        L64:
            r3.c(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C0961b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
