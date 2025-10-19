package h4;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h4\o.smali */
public final class o extends k4.s {

    /* renamed from: e, reason: collision with root package name */
    public final g f7818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f7819f;

    public o(long j5, o oVar, g gVar, int i) {
        super(j5, oVar, i);
        this.f7818e = gVar;
        this.f7819f = new AtomicReferenceArray(i.f7796b * 2);
    }

    @Override // k4.s
    public final int g() {
        return i.f7796b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        n(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        kotlin.jvm.internal.i.b(r4);
        r6 = r4.f7793b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        if (r6 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
    
        k4.a.a(r6, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // k4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r7, O3.i r8) {
        /*
            r6 = this;
            int r0 = h4.i.f7796b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f7819f
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.l(r7)
            boolean r3 = r2 instanceof f4.I0
            h4.g r4 = r6.f7818e
            r5 = 0
            if (r3 != 0) goto L6b
            boolean r3 = r2 instanceof h4.z
            if (r3 == 0) goto L22
            goto L6b
        L22:
            h1.i r3 = h4.i.f7802j
            if (r2 == r3) goto L5b
            h1.i r3 = h4.i.f7803k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            h1.i r3 = h4.i.f7801g
            if (r2 == r3) goto L12
            h1.i r3 = h4.i.f7800f
            if (r2 != r3) goto L34
            goto L12
        L34:
            h1.i r6 = h4.i.i
            if (r2 == r6) goto L5a
            h1.i r6 = h4.i.f7798d
            if (r2 != r6) goto L3d
            goto L5a
        L3d:
            h1.i r6 = h4.i.f7804l
            if (r2 != r6) goto L42
            return
        L42:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "unexpected state: "
            r7.<init>(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L5a:
            return
        L5b:
            r6.n(r7, r5)
            if (r1 == 0) goto L6a
            kotlin.jvm.internal.i.b(r4)
            X3.l r6 = r4.f7793b
            if (r6 == 0) goto L6a
            k4.a.a(r6, r0, r8)
        L6a:
            return
        L6b:
            if (r1 == 0) goto L70
            h1.i r3 = h4.i.f7802j
            goto L72
        L70:
            h1.i r3 = h4.i.f7803k
        L72:
            boolean r2 = r6.k(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.n(r7, r5)
            r2 = r1 ^ 1
            r6.m(r7, r2)
            if (r1 == 0) goto L8c
            kotlin.jvm.internal.i.b(r4)
            X3.l r6 = r4.f7793b
            if (r6 == 0) goto L8c
            k4.a.a(r6, r0, r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.o.h(int, O3.i):void");
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f7819f;
        int i5 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i5, obj, obj2)) {
            if (atomicReferenceArray.get(i5) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object l(int i) {
        return this.f7819f.get((i * 2) + 1);
    }

    public final void m(int i, boolean z4) {
        if (z4) {
            g gVar = this.f7818e;
            kotlin.jvm.internal.i.b(gVar);
            gVar.I((this.f8408c * i.f7796b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.f7819f.set(i * 2, obj);
    }

    public final void o(int i, h1.i iVar) {
        this.f7819f.set((i * 2) + 1, iVar);
    }
}
