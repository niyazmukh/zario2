package f4;

import d4.f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\p0.smali */
public final class p0 extends Q3.i implements X3.p {

    /* renamed from: b, reason: collision with root package name */
    public w0 f7090b;

    /* renamed from: c, reason: collision with root package name */
    public k4.j f7091c;

    /* renamed from: d, reason: collision with root package name */
    public int f7092d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t0 f7094f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(O3.d dVar, t0 t0Var) {
        super(dVar);
        this.f7094f = t0Var;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        p0 p0Var = new p0(dVar, this.f7094f);
        p0Var.f7093e = obj;
        return p0Var;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p0) create((f) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0069 -> B:25:0x007e). Please report as a decompilation issue!!! */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            P3.a r0 = P3.a.f2678a
            int r1 = r6.f7092d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            k4.j r1 = r6.f7091c
            f4.w0 r3 = r6.f7090b
            java.lang.Object r4 = r6.f7093e
            d4.f r4 = (d4.f) r4
            a.AbstractC0183a.m0(r7)
            goto L7e
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L20:
            a.AbstractC0183a.m0(r7)
            goto L83
        L24:
            a.AbstractC0183a.m0(r7)
            java.lang.Object r7 = r6.f7093e
            d4.f r7 = (d4.f) r7
            f4.t0 r1 = r6.f7094f
            r1.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f4.t0.f7098a
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof f4.r
            if (r4 == 0) goto L44
            f4.r r1 = (f4.r) r1
            f4.s r1 = r1.e
            r6.f7092d = r3
            r7.c(r1, r6)
            return r0
        L44:
            boolean r3 = r1 instanceof f4.InterfaceC0501d0
            if (r3 == 0) goto L83
            f4.d0 r1 = (f4.InterfaceC0501d0) r1
            f4.w0 r1 = r1.c()
            if (r1 == 0) goto L83
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = k4.j.f8390a
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.i.c(r3, r4)
            k4.j r3 = (k4.j) r3
            r4 = r7
            r5 = r3
            r3 = r1
            r1 = r5
        L61:
            boolean r7 = r1.equals(r3)
            if (r7 != 0) goto L83
            boolean r7 = r1 instanceof f4.r
            if (r7 == 0) goto L7e
            r7 = r1
            f4.r r7 = (f4.r) r7
            r6.f7093e = r4
            r6.f7090b = r3
            r6.f7091c = r1
            r6.f7092d = r2
            f4.s r7 = r7.e
            r4.c(r7, r6)
            P3.a r6 = P3.a.f2678a
            return r0
        L7e:
            k4.j r1 = r1.g()
            goto L61
        L83:
            K3.k r6 = K3.k.f2288a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.p0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
