package k4;

import f4.V;
import f4.W;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\x.smali */
public class x {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8415b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public V[] f8416a;

    public final void a(V v4) {
        v4.d((W) this);
        V[] vArr = this.f8416a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8415b;
        if (vArr == null) {
            vArr = new V[4];
            this.f8416a = vArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= vArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(vArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
            vArr = (V[]) objArrCopyOf;
            this.f8416a = vArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        vArr[i] = v4;
        v4.f7036b = i;
        c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f4.V b(int r9) {
        /*
            r8 = this;
            f4.V[] r0 = r8.f8416a
            kotlin.jvm.internal.i.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = k4.x.f8415b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.i.b(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.i.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            f4.V[] r5 = r8.f8416a
            kotlin.jvm.internal.i.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.i.b(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.i.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.i.b(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.i.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.i.b(r9)
            r2 = 0
            r9.d(r2)
            r9.f7036b = r3
            int r8 = r1.get(r8)
            r0[r8] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.x.b(int):f4.V");
    }

    public final void c(int i) {
        while (i > 0) {
            V[] vArr = this.f8416a;
            kotlin.jvm.internal.i.b(vArr);
            int i5 = (i - 1) / 2;
            V v4 = vArr[i5];
            kotlin.jvm.internal.i.b(v4);
            V v5 = vArr[i];
            kotlin.jvm.internal.i.b(v5);
            if (v4.compareTo(v5) <= 0) {
                return;
            }
            d(i, i5);
            i = i5;
        }
    }

    public final void d(int i, int i5) {
        V[] vArr = this.f8416a;
        kotlin.jvm.internal.i.b(vArr);
        V v4 = vArr[i5];
        kotlin.jvm.internal.i.b(v4);
        V v5 = vArr[i];
        kotlin.jvm.internal.i.b(v5);
        vArr[i] = v4;
        vArr[i5] = v5;
        v4.f7036b = i;
        v5.f7036b = i5;
    }
}
