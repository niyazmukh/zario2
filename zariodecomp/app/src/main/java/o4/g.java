package o4;

import K3.k;
import X3.q;
import f4.C0515m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.s;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o4\g.smali */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9277b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f9278c = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9279d = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f9280e = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9281f = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final C0515m f9282a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        i iVar = new i(0L, null, 2);
        this.head$volatile = iVar;
        this.tail$volatile = iVar;
        this._availablePermits$volatile = 1 - i;
        this.f9282a = new C0515m(this, 1);
    }

    public final void a(b bVar) {
        Object objD;
        e eVar;
        long j5;
        while (true) {
            int andDecrement = f9281f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = k.f2288a;
                q qVar = this.f9282a;
                if (andDecrement > 0) {
                    bVar.a(obj, qVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9279d;
                i iVar = (i) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f9280e.getAndIncrement(this);
                e eVar2 = e.f9275a;
                long j6 = andIncrement / h.f9288f;
                while (true) {
                    objD = k4.a.d(iVar, j6, eVar2);
                    if (!k4.a.g(objD)) {
                        s sVarE = k4.a.e(objD);
                        while (true) {
                            s sVar = (s) atomicReferenceFieldUpdater.get(this);
                            eVar = eVar2;
                            j5 = j6;
                            if (sVar.f8408c >= sVarE.f8408c) {
                                break;
                            }
                            if (!sVarE.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarE)) {
                                if (atomicReferenceFieldUpdater.get(this) != sVar) {
                                    if (sVarE.f()) {
                                        sVarE.e();
                                    }
                                    eVar2 = eVar;
                                    j6 = j5;
                                }
                            }
                            if (sVar.f()) {
                                sVar.e();
                            }
                        }
                    } else {
                        break;
                    }
                    eVar2 = eVar;
                    j6 = j5;
                }
                i iVar2 = (i) k4.a.e(objD);
                int i = (int) (andIncrement % h.f9288f);
                AtomicReferenceArray atomicReferenceArray = iVar2.f9289e;
                while (!atomicReferenceArray.compareAndSet(i, null, bVar)) {
                    if (atomicReferenceArray.get(i) != null) {
                        h1.i iVar3 = h.f9284b;
                        h1.i iVar4 = h.f9285c;
                        while (!atomicReferenceArray.compareAndSet(i, iVar3, iVar4)) {
                            if (atomicReferenceArray.get(i) != iVar3) {
                                break;
                            }
                        }
                        bVar.a(obj, qVar);
                        return;
                    }
                }
                bVar.b(iVar2, i);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.g.b():void");
    }
}
