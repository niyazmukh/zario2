package T0;

import J0.z;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T0\d.smali */
public final class d implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final String f3139c = J0.t.f("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final K0.m f3140a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.c f3141b;

    public d(K0.m mVar) {
        S0.c cVar = new S0.c(5);
        this.f3140a = mVar;
        this.f3141b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0195  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(K0.m r24) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.d.a(K0.m):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        S0.c cVar = this.f3141b;
        K0.m mVar = this.f3140a;
        try {
            mVar.getClass();
            HashSet hashSet = new HashSet();
            hashSet.addAll(mVar.f2162f);
            HashSet hashSetY0 = K0.m.y0(mVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(mVar.f2162f);
                    z4 = false;
                    break;
                } else if (hashSetY0.contains((String) it.next())) {
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                throw new IllegalStateException("WorkContinuation has cycles (" + mVar + ")");
            }
            K0.r rVar = mVar.f2158b;
            WorkDatabase workDatabase = rVar.f2174c;
            workDatabase.c();
            try {
                S0.f.j(workDatabase, rVar.f2173b, mVar);
                boolean zA = a(mVar);
                workDatabase.o();
                if (zA) {
                    k.a(rVar.f2172a, RescheduleReceiver.class, true);
                    K0.k.b(rVar.f2173b, rVar.f2174c, rVar.f2176e);
                }
                cVar.n(z.f2070g);
            } finally {
                workDatabase.j();
            }
        } catch (Throwable th) {
            cVar.n(new J0.w(th));
        }
    }
}
