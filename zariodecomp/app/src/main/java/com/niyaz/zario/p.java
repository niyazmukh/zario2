package com.niyaz.zario;

import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\p.smali */
public final class p extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public V2.n f6662a;

    /* renamed from: b, reason: collision with root package name */
    public int f6663b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MinutesApp f6664c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(MinutesApp minutesApp, O3.d dVar) {
        super(2, dVar);
        this.f6664c = minutesApp;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new p(this.f6664c, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            P3.a r0 = P3.a.f2678a
            int r1 = r8.f6663b
            java.lang.String r2 = "evaluationRepository"
            r3 = 0
            r4 = 2
            com.niyaz.zario.MinutesApp r5 = r8.f6664c
            r6 = 1
            if (r1 == 0) goto L23
            if (r1 == r6) goto L1f
            if (r1 != r4) goto L17
            V2.n r8 = r8.f6662a
            a.AbstractC0183a.m0(r9)
            goto L4f
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1f:
            a.AbstractC0183a.m0(r9)
            goto L33
        L23:
            a.AbstractC0183a.m0(r9)
            S2.u r9 = r5.f6620d
            if (r9 == 0) goto L8d
            r8.f6663b = r6
            java.lang.Object r9 = r9.a(r8)
            if (r9 != r0) goto L33
            return r0
        L33:
            V2.n r9 = (V2.n) r9
            if (r9 == 0) goto L3a
            java.lang.Long r1 = r9.f3451e
            goto L3b
        L3a:
            r1 = r3
        L3b:
            if (r1 == 0) goto L8a
            S2.u r1 = r5.f6620d
            if (r1 == 0) goto L86
            r8.f6662a = r9
            r8.f6663b = r4
            java.lang.Object r8 = r1.h(r8)
            if (r8 != r0) goto L4c
            return r0
        L4c:
            r7 = r9
            r9 = r8
            r8 = r7
        L4f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L8a
            java.lang.String r8 = r8.f3449c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Boot recovery: Restarting monitoring for active evaluation ("
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = ")"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "MinutesApp"
            android.util.Log.i(r9, r8)
            com.niyaz.zario.worker.MonitoringWorkScheduler r8 = r5.f6622f
            if (r8 == 0) goto L80
            r0 = 0
            com.niyaz.zario.worker.MonitoringWorkScheduler.enqueueScheduler$default(r8, r0, r6, r3)
            java.lang.String r8 = "Boot recovery: Monitoring scheduler restarted successfully"
            android.util.Log.i(r9, r8)
            goto L8a
        L80:
            java.lang.String r8 = "monitoringWorkScheduler"
            kotlin.jvm.internal.i.i(r8)
            throw r3
        L86:
            kotlin.jvm.internal.i.i(r2)
            throw r3
        L8a:
            K3.k r8 = K3.k.f2288a
            return r8
        L8d:
            kotlin.jvm.internal.i.i(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.niyaz.zario.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
