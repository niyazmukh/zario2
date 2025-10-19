package T0;

import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T0\n.smali */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final K0.f f3162a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.l f3163b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3164c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3165d;

    public n(K0.f processor, K0.l token, boolean z4, int i) {
        kotlin.jvm.internal.i.e(processor, "processor");
        kotlin.jvm.internal.i.e(token, "token");
        this.f3162a = processor;
        this.f3163b = token;
        this.f3164c = z4;
        this.f3165d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zD;
        K0.u uVarB;
        if (this.f3164c) {
            K0.f fVar = this.f3162a;
            K0.l lVar = this.f3163b;
            int i = this.f3165d;
            fVar.getClass();
            String str = lVar.f2156a.f2862a;
            synchronized (fVar.f2144k) {
                uVarB = fVar.b(str);
            }
            zD = K0.f.d(str, uVarB, i);
        } else {
            K0.f fVar2 = this.f3162a;
            K0.l lVar2 = this.f3163b;
            int i5 = this.f3165d;
            fVar2.getClass();
            String str2 = lVar2.f2156a.f2862a;
            synchronized (fVar2.f2144k) {
                try {
                    if (fVar2.f2141f.get(str2) != null) {
                        J0.t.d().a(K0.f.f2135l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) fVar2.h.get(str2);
                        if (set != null && set.contains(lVar2)) {
                            zD = K0.f.d(str2, fVar2.b(str2), i5);
                        }
                    }
                    zD = false;
                } finally {
                }
            }
        }
        J0.t.d().a(J0.t.f("StopWorkRunnable"), "StopWorkRunnable for " + this.f3163b.f2156a.f2862a + "; Processor.stopWork = " + zD);
    }
}
