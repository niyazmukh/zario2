package g;

import android.content.Context;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\k.smali */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f7207b;

    public /* synthetic */ k(Context context, int i) {
        this.f7206a = i;
        this.f7207b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            r10 = this;
            int r0 = r10.f7206a
            switch(r0) {
                case 0: goto L31;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            m.a r0 = new m.a
            r1 = 1
            r0.<init>(r1)
            G2.e r1 = r0.AbstractC0859d.f9578a
            r2 = 0
            android.content.Context r10 = r10.f7207b
            r0.AbstractC0859d.s(r10, r0, r1, r2)
            return
        L14:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            r4 = 0
            r5 = 1
            r6 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r8, r9)
            g.k r1 = new g.k
            android.content.Context r10 = r10.f7207b
            r2 = 2
            r1.<init>(r10, r2)
            r0.execute(r1)
            return
        L31:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 1
            if (r0 < r1) goto Lb2
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r10 = r10.f7207b
            java.lang.String r1 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r0.<init>(r10, r1)
            android.content.pm.PackageManager r1 = r10.getPackageManager()
            int r1 = r1.getComponentEnabledSetting(r0)
            if (r1 == r2) goto Lb2
            boolean r1 = I.b.a()
            java.lang.String r3 = "locale"
            if (r1 == 0) goto L8d
            q.c r1 = g.n.f7214k
            java.util.Iterator r1 = r1.iterator()
        L59:
            r4 = r1
            q.g r4 = (q.C0830g) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7b
            java.lang.Object r4 = r4.next()
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Object r4 = r4.get()
            g.n r4 = (g.n) r4
            if (r4 == 0) goto L59
            g.y r4 = (g.y) r4
            android.content.Context r4 = r4.f7287o
            if (r4 == 0) goto L59
            java.lang.Object r1 = r4.getSystemService(r3)
            goto L7c
        L7b:
            r1 = 0
        L7c:
            if (r1 == 0) goto L92
            android.os.LocaleList r1 = g.m.a(r1)
            I.k r4 = new I.k
            I.l r5 = new I.l
            r5.<init>(r1)
            r4.<init>(r5)
            goto L94
        L8d:
            I.k r4 = g.n.f7210c
            if (r4 == 0) goto L92
            goto L94
        L92:
            I.k r4 = I.k.f1917b
        L94:
            boolean r1 = r4.b()
            if (r1 == 0) goto Lab
            java.lang.String r1 = N2.AbstractC0156x.Z(r10)
            java.lang.Object r3 = r10.getSystemService(r3)
            if (r3 == 0) goto Lab
            android.os.LocaleList r1 = g.l.a(r1)
            g.m.b(r3, r1)
        Lab:
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            r10.setComponentEnabledSetting(r0, r2, r2)
        Lb2:
            g.n.f7213f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.k.run():void");
    }
}
