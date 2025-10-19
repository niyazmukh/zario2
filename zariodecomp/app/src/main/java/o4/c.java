package o4;

import K3.k;
import f4.C0516n;
import f4.E;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o4\c.smali */
public final class c extends g implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9273g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c(boolean z4) {
        super(z4 ? 1 : 0);
        this.owner$volatile = z4 ? null : d.f9274a;
    }

    public final Object c(Q3.c cVar) {
        boolean zD = d(null);
        k kVar = k.f2288a;
        if (zD) {
            return kVar;
        }
        C0516n c0516nN = E.n(p1.b.x(cVar));
        try {
            a(new b(this, c0516nN));
            Object objR = c0516nN.r();
            P3.a aVar = P3.a.f2678a;
            if (objR != aVar) {
                objR = kVar;
            }
            return objR == aVar ? objR : kVar;
        } catch (Throwable th) {
            c0516nN.z();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r7 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.Object r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = o4.g.f9281f
            int r1 = r0.get(r7)
            r2 = 1
            if (r1 <= r2) goto L16
        L9:
            int r1 = r0.get(r7)
            if (r1 <= r2) goto L0
            boolean r1 = r0.compareAndSet(r7, r1, r2)
            if (r1 == 0) goto L9
            goto L0
        L16:
            r3 = 0
            r4 = 2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = o4.c.f9273g
            if (r1 > 0) goto L40
            if (r8 != 0) goto L20
        L1e:
            r7 = r2
            goto L4c
        L20:
            int r1 = r0.get(r7)
            int r1 = java.lang.Math.max(r1, r3)
            if (r1 != 0) goto L38
            java.lang.Object r1 = r5.get(r7)
            h1.i r6 = o4.d.f9274a
            if (r1 == r6) goto L20
            if (r1 != r8) goto L36
            r0 = r2
            goto L39
        L36:
            r0 = r4
            goto L39
        L38:
            r0 = r3
        L39:
            if (r0 == r2) goto L3e
            if (r0 == r4) goto L1e
            goto L0
        L3e:
            r7 = r4
            goto L4c
        L40:
            int r6 = r1 + (-1)
            boolean r0 = r0.compareAndSet(r7, r1, r6)
            if (r0 == 0) goto L0
            r5.set(r7, r8)
            r7 = r3
        L4c:
            if (r7 == 0) goto L73
            if (r7 == r2) goto L72
            if (r7 == r4) goto L5a
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "unexpected"
            r7.<init>(r8)
            throw r7
        L5a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "This mutex is already locked by the specified owner: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L72:
            r2 = r3
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.c.d(java.lang.Object):boolean");
    }

    public final void e(Object obj) {
        while (Math.max(g.f9281f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9273g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            h1.i iVar = d.f9274a;
            if (obj2 != iVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, iVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(E.m(this));
        sb.append("[isLocked=");
        sb.append(Math.max(g.f9281f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f9273g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
