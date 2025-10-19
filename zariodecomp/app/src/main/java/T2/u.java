package T2;

import W.InterfaceC0167i;
import android.content.Context;
import f4.C;
import i4.x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\u.smali */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0167i f3253a;

    /* renamed from: b, reason: collision with root package name */
    public final x f3254b;

    public u(Context context, C applicationScope) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(applicationScope, "applicationScope");
        h1.i iVarA = V2.g.f3436c.a(context, V2.g.f3434a[1]);
        this.f3253a = iVarA;
        this.f3254b = i4.C.l(new d(1, iVarA.p(), this), applicationScope, v.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(Q3.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof T2.g
            if (r0 == 0) goto L13
            r0 = r5
            T2.g r0 = (T2.g) r0
            int r1 = r0.f3224c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3224c = r1
            goto L18
        L13:
            T2.g r0 = new T2.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3222a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3224c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0183a.m0(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            a.AbstractC0183a.m0(r5)
            W.i r4 = r4.f3253a
            i4.g r4 = r4.p()
            r0.f3224c = r3
            java.lang.Object r5 = i4.C.i(r4, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            a0.b r5 = (a0.b) r5
            a0.d r4 = T2.f.f3221l
            java.lang.Object r4 = r5.c(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.u.a(Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(Q3.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof T2.h
            if (r0 == 0) goto L13
            r0 = r6
            T2.h r0 = (T2.h) r0
            int r1 = r0.f3228d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3228d = r1
            goto L18
        L13:
            T2.h r0 = new T2.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f3226b
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3228d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.p r5 = r0.f3225a
            a.AbstractC0183a.m0(r6)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            a.AbstractC0183a.m0(r6)
            kotlin.jvm.internal.p r6 = new kotlin.jvm.internal.p
            r6.<init>()
            T2.i r2 = new T2.i
            r4 = 0
            r2.<init>(r6, r4)
            r0.f3225a = r6
            r0.f3228d = r3
            W.i r5 = r5.f3253a
            java.lang.Object r5 = N2.AbstractC0156x.B(r5, r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = r6
        L4d:
            int r5 = r5.f8429a
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.u.b(Q3.c):java.lang.Object");
    }
}
