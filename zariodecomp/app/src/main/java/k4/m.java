package k4;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\m.smali */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8394e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8395f = AtomicLongFieldUpdater.newUpdater(m.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final h1.i f8396g = new h1.i("REMOVE_FROZEN", 18);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f8397a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8398b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8399c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f8400d;

    public m(int i, boolean z4) {
        this.f8397a = i;
        this.f8398b = z4;
        int i5 = i - 1;
        this.f8399c = i5;
        this.f8400d = new AtomicReferenceArray(i);
        if (i5 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i5) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Runnable r14) {
        /*
            r13 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = k4.m.f8395f
            long r2 = r6.get(r13)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L19
            r13 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r13 = r13 & r2
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r13 == 0) goto L18
            r1 = 2
        L18:
            return r1
        L19:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r10 = (int) r4
            int r4 = r10 + 2
            int r11 = r13.f8399c
            r4 = r4 & r11
            r5 = r0 & r11
            if (r4 != r5) goto L32
            return r1
        L32:
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r13.f8400d
            boolean r4 = r13.f8398b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L51
            r4 = r10 & r11
            java.lang.Object r4 = r12.get(r4)
            if (r4 == 0) goto L51
            r2 = 1024(0x400, float:1.435E-42)
            int r3 = r13.f8397a
            if (r3 < r2) goto L50
            int r10 = r10 - r0
            r0 = r10 & r5
            int r2 = r3 >> 1
            if (r0 <= r2) goto L0
        L50:
            return r1
        L51:
            int r0 = r10 + 1
            r0 = r0 & r5
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r0 = (long) r0
            long r0 = r0 << r9
            long r4 = r4 | r0
            r0 = r6
            r1 = r13
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            r0 = r10 & r11
            r12.set(r0, r14)
        L6a:
            long r0 = r6.get(r13)
            r2 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r0 = r0 & r2
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L93
            k4.m r13 = r13.c()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f8400d
            int r1 = r13.f8399c
            r1 = r1 & r10
            java.lang.Object r2 = r0.get(r1)
            boolean r3 = r2 instanceof k4.l
            if (r3 == 0) goto L90
            k4.l r2 = (k4.l) r2
            int r2 = r2.f8393a
            if (r2 != r10) goto L90
            r0.set(r1, r14)
            goto L91
        L90:
            r13 = 0
        L91:
            if (r13 != 0) goto L6a
        L93:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.m.a(java.lang.Runnable):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        do {
            atomicLongFieldUpdater = f8395f;
            j5 = atomicLongFieldUpdater.get(this);
            if ((j5 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j5) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, 2305843009213693952L | j5));
        return true;
    }

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        while (true) {
            atomicLongFieldUpdater = f8395f;
            j5 = atomicLongFieldUpdater.get(this);
            if ((j5 & 1152921504606846976L) != 0) {
                break;
            }
            long j6 = j5 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j5, j6)) {
                j5 = j6;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8394e;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar != null) {
                return mVar;
            }
            m mVar2 = new m(this.f8397a * 2, this.f8398b);
            int i = (int) (1073741823 & j5);
            int i5 = (int) ((1152921503533105152L & j5) >> 30);
            while (true) {
                int i6 = this.f8399c;
                int i7 = i & i6;
                if (i7 == (i6 & i5)) {
                    break;
                }
                Object lVar = this.f8400d.get(i7);
                if (lVar == null) {
                    lVar = new l(i);
                }
                mVar2.f8400d.set(mVar2.f8399c & i, lVar);
                i++;
            }
            atomicLongFieldUpdater.set(mVar2, (-1152921504606846977L) & j5);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8395f;
            long j5 = atomicLongFieldUpdater.get(this);
            if ((j5 & 1152921504606846976L) != 0) {
                return f8396g;
            }
            int i = (int) (j5 & 1073741823);
            int i5 = this.f8399c;
            int i6 = i & i5;
            if ((((int) ((1152921503533105152L & j5) >> 30)) & i5) == i6) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f8400d;
            Object obj = atomicReferenceArray.get(i6);
            boolean z4 = this.f8398b;
            if (obj == null) {
                if (z4) {
                    return null;
                }
            } else {
                if (obj instanceof l) {
                    return null;
                }
                long j6 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j5, (j5 & (-1073741824)) | j6)) {
                    atomicReferenceArray.set(i6, null);
                    return obj;
                }
                if (z4) {
                    m mVarC = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8395f;
                        long j7 = atomicLongFieldUpdater2.get(mVarC);
                        int i7 = (int) (j7 & 1073741823);
                        if ((j7 & 1152921504606846976L) != 0) {
                            mVarC = mVarC.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(mVarC, j7, (j7 & (-1073741824)) | j6)) {
                                mVarC.f8400d.set(mVarC.f8399c & i7, null);
                                mVarC = null;
                            } else {
                                continue;
                            }
                        }
                        if (mVarC == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
