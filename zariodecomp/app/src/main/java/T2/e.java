package T2;

import f4.C;
import i4.x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\e.smali */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final u f3210a;

    /* renamed from: b, reason: collision with root package name */
    public final x f3211b;

    public e(u planPreferencesDataSource, C applicationScope) {
        kotlin.jvm.internal.i.e(planPreferencesDataSource, "planPreferencesDataSource");
        kotlin.jvm.internal.i.e(applicationScope, "applicationScope");
        this.f3210a = planPreferencesDataSource;
        this.f3211b = i4.C.l(new d(0, planPreferencesDataSource.f3254b, this), applicationScope, a.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(Q3.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof T2.b
            if (r0 == 0) goto L13
            r0 = r9
            T2.b r0 = (T2.b) r0
            int r1 = r0.f3203d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3203d = r1
            goto L18
        L13:
            T2.b r0 = new T2.b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f3201b
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3203d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            T2.e r8 = r0.f3200a
            a.AbstractC0183a.m0(r9)
            goto L43
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            a.AbstractC0183a.m0(r9)
            r0.f3200a = r8
            r0.f3203d = r3
            T2.u r9 = r8.f3210a
            i4.x r9 = r9.f3254b
            java.lang.Object r9 = i4.C.i(r9, r0)
            if (r9 != r1) goto L43
            return r1
        L43:
            T2.v r9 = (T2.v) r9
            r8.getClass()
            T2.a r8 = new T2.a
            V2.n r1 = r9.f3255a
            boolean r4 = r9.f3258d
            java.lang.Long r5 = r9.f3259e
            int r2 = r9.f3256b
            java.lang.Long r3 = r9.f3257c
            boolean r6 = r9.f3260f
            int r7 = r9.f3261g
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.e.a(Q3.c):java.lang.Object");
    }
}
