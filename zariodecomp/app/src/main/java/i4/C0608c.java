package i4;

import Q3.j;
import j4.AbstractC0636f;

/* renamed from: i4.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\c.1.smali */
public final class C0608c extends AbstractC0636f {

    /* renamed from: d, reason: collision with root package name */
    public final j f7901d;

    /* renamed from: e, reason: collision with root package name */
    public final j f7902e;

    /* JADX WARN: Multi-variable type inference failed */
    public C0608c(X3.p pVar, O3.i iVar, int i, h4.a aVar) {
        super(iVar, i, aVar);
        j jVar = (j) pVar;
        this.f7901d = jVar;
        this.f7902e = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [Q3.j, X3.p] */
    @Override // j4.AbstractC0636f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(h4.v r6, O3.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof i4.C0607b
            if (r0 == 0) goto L13
            r0 = r7
            i4.b r0 = (i4.C0607b) r0
            int r1 = r0.f7900d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7900d = r1
            goto L1a
        L13:
            i4.b r0 = new i4.b
            Q3.c r7 = (Q3.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.f7898b
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f7900d
            K3.k r3 = K3.k.f2288a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            h4.v r6 = r0.f7897a
            a.AbstractC0183a.m0(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            a.AbstractC0183a.m0(r7)
            r0.f7897a = r6
            r0.f7900d = r4
            Q3.j r5 = r5.f7901d
            java.lang.Object r5 = r5.invoke(r6, r0)
            if (r5 != r1) goto L45
            goto L46
        L45:
            r5 = r3
        L46:
            if (r5 != r1) goto L49
            return r1
        L49:
            h4.u r6 = (h4.u) r6
            h4.g r5 = r6.f7825d
            boolean r5 = r5.w()
            if (r5 == 0) goto L54
            return r3
        L54:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.C0608c.b(h4.v, O3.d):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Q3.j, X3.p] */
    @Override // j4.AbstractC0636f
    public final AbstractC0636f d(O3.i iVar, int i, h4.a aVar) {
        return new C0608c(this.f7902e, iVar, i, aVar);
    }

    @Override // j4.AbstractC0636f
    public final String toString() {
        return "block[" + this.f7901d + "] -> " + super.toString();
    }
}
