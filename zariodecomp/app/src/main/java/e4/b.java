package e4;

import Y3.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e4\b.smali */
public final class b implements Iterator, a {

    /* renamed from: a, reason: collision with root package name */
    public int f6946a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f6947b;

    /* renamed from: c, reason: collision with root package name */
    public int f6948c;

    /* renamed from: d, reason: collision with root package name */
    public b4.f f6949d;

    /* renamed from: e, reason: collision with root package name */
    public int f6950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f6951f;

    public b(c cVar) {
        this.f6951f = cVar;
        int iW = S0.f.w(cVar.f6953b, 0, cVar.f6952a.length());
        this.f6947b = iW;
        this.f6948c = iW;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Type inference failed for: r0v1, types: [X3.p, kotlin.jvm.internal.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r8 = this;
            int r0 = r8.f6948c
            r1 = 0
            if (r0 >= 0) goto Lb
            r8.f6946a = r1
            r0 = 0
            r8.f6949d = r0
            goto L75
        Lb:
            e4.c r2 = r8.f6951f
            int r3 = r2.f6954c
            java.lang.CharSequence r4 = r2.f6952a
            r5 = -1
            r6 = 1
            if (r3 <= 0) goto L1c
            int r7 = r8.f6950e
            int r7 = r7 + r6
            r8.f6950e = r7
            if (r7 >= r3) goto L22
        L1c:
            int r3 = r4.length()
            if (r0 <= r3) goto L32
        L22:
            b4.f r0 = new b4.f
            int r1 = r8.f6947b
            int r2 = e4.m.n0(r4)
            r0.<init>(r1, r2, r6)
            r8.f6949d = r0
            r8.f6948c = r5
            goto L73
        L32:
            kotlin.jvm.internal.j r0 = r2.f6955d
            int r2 = r8.f6948c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r4, r2)
            K3.e r0 = (K3.e) r0
            if (r0 != 0) goto L52
            b4.f r0 = new b4.f
            int r1 = r8.f6947b
            int r2 = e4.m.n0(r4)
            r0.<init>(r1, r2, r6)
            r8.f6949d = r0
            r8.f6948c = r5
            goto L73
        L52:
            java.lang.Object r2 = r0.f2277a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f2278b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r8.f6947b
            b4.f r3 = S0.f.e0(r3, r2)
            r8.f6949d = r3
            int r2 = r2 + r0
            r8.f6947b = r2
            if (r0 != 0) goto L70
            r1 = r6
        L70:
            int r2 = r2 + r1
            r8.f6948c = r2
        L73:
            r8.f6946a = r6
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.b.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6946a == -1) {
            a();
        }
        return this.f6946a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6946a == -1) {
            a();
        }
        if (this.f6946a == 0) {
            throw new NoSuchElementException();
        }
        b4.f fVar = this.f6949d;
        kotlin.jvm.internal.i.c(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f6949d = null;
        this.f6946a = -1;
        return fVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
