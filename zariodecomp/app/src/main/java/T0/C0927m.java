package t0;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: t0.m, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\m.1.smali */
public final class C0927m {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10062a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f10063b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f10064c;

    /* renamed from: d, reason: collision with root package name */
    public final K2.c f10065d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10066e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10067f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10068g;

    public C0927m(K2.c cVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
        this.f10062a = arrayList;
        this.f10063b = iArr;
        this.f10064c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f10065d = cVar;
        RunnableC0918c runnableC0918c = (RunnableC0918c) cVar.b;
        int size = runnableC0918c.f9960a.size();
        this.f10066e = size;
        int size2 = runnableC0918c.f9961b.size();
        this.f10067f = size2;
        this.f10068g = true;
        C0930p c0930p = arrayList.isEmpty() ? null : (C0930p) arrayList.get(0);
        if (c0930p == null || c0930p.f10096a != 0 || c0930p.f10097b != 0) {
            C0930p c0930p2 = new C0930p();
            c0930p2.f10096a = 0;
            c0930p2.f10097b = 0;
            c0930p2.f10099d = false;
            c0930p2.f10098c = 0;
            c0930p2.f10100e = false;
            arrayList.add(0, c0930p2);
        }
        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
            C0930p c0930p3 = (C0930p) arrayList.get(size3);
            int i = c0930p3.f10096a;
            int i5 = c0930p3.f10098c;
            int i6 = i + i5;
            int i7 = c0930p3.f10097b + i5;
            boolean z4 = this.f10068g;
            int[] iArr3 = this.f10064c;
            int[] iArr4 = this.f10063b;
            if (z4) {
                while (size > i6) {
                    if (iArr4[size - 1] == 0) {
                        a(size, size2, size3, false);
                    }
                    size--;
                }
                while (size2 > i7) {
                    if (iArr3[size2 - 1] == 0) {
                        a(size, size2, size3, true);
                    }
                    size2--;
                }
            }
            for (int i8 = 0; i8 < c0930p3.f10098c; i8++) {
                int i9 = c0930p3.f10096a + i8;
                int i10 = c0930p3.f10097b + i8;
                int i11 = this.f10065d.l(i9, i10) ? 1 : 2;
                iArr4[i9] = (i10 << 5) | i11;
                iArr3[i10] = (i9 << 5) | i11;
            }
            size = c0930p3.f10096a;
            size2 = c0930p3.f10097b;
        }
    }

    public static C0928n b(int i, ArrayList arrayList, boolean z4) {
        int size = arrayList.size() - 1;
        while (size >= 0) {
            C0928n c0928n = (C0928n) arrayList.get(size);
            if (c0928n.f10073a == i && c0928n.f10075c == z4) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    ((C0928n) arrayList.get(size)).f10074b += z4 ? 1 : -1;
                    size++;
                }
                return c0928n;
            }
            size--;
        }
        return null;
    }

    public final void a(int i, int i5, int i6, boolean z4) {
        int i7;
        int i8;
        int i9;
        if (z4) {
            i5--;
            i8 = i;
            i7 = i5;
        } else {
            i7 = i - 1;
            i8 = i7;
        }
        while (i6 >= 0) {
            C0930p c0930p = (C0930p) this.f10062a.get(i6);
            int i10 = c0930p.f10096a;
            int i11 = c0930p.f10098c;
            int i12 = i10 + i11;
            int i13 = c0930p.f10097b + i11;
            int[] iArr = this.f10063b;
            int[] iArr2 = this.f10064c;
            K2.c cVar = this.f10065d;
            if (z4) {
                for (int i14 = i8 - 1; i14 >= i12; i14--) {
                    if (cVar.m(i14, i7)) {
                        i9 = cVar.l(i14, i7) ? 8 : 4;
                        iArr2[i7] = (i14 << 5) | 16;
                        iArr[i14] = (i7 << 5) | i9;
                        return;
                    }
                }
            } else {
                for (int i15 = i5 - 1; i15 >= i13; i15--) {
                    if (cVar.m(i7, i15)) {
                        i9 = cVar.l(i7, i15) ? 8 : 4;
                        int i16 = i - 1;
                        iArr[i16] = (i15 << 5) | 16;
                        iArr2[i15] = (i16 << 5) | i9;
                        return;
                    }
                }
            }
            i8 = c0930p.f10096a;
            i5 = c0930p.f10097b;
            i6--;
        }
    }
}
