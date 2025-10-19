package M3;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M3\f.smali */
public final class f implements Map, Serializable, Y3.c {

    /* renamed from: r, reason: collision with root package name */
    public static final f f2508r;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f2509a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f2510b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2511c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f2512d;

    /* renamed from: e, reason: collision with root package name */
    public int f2513e;

    /* renamed from: f, reason: collision with root package name */
    public int f2514f;

    /* renamed from: k, reason: collision with root package name */
    public int f2515k;

    /* renamed from: l, reason: collision with root package name */
    public int f2516l;

    /* renamed from: m, reason: collision with root package name */
    public int f2517m;

    /* renamed from: n, reason: collision with root package name */
    public g f2518n;

    /* renamed from: o, reason: collision with root package name */
    public h f2519o;

    /* renamed from: p, reason: collision with root package name */
    public g f2520p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2521q;

    static {
        f fVar = new f(0);
        fVar.f2521q = true;
        f2508r = fVar;
    }

    public f() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i = this.f2513e * 2;
            int length = this.f2512d.length / 2;
            if (i > length) {
                i = length;
            }
            int i5 = 0;
            while (true) {
                int[] iArr = this.f2512d;
                int i6 = iArr[iJ];
                if (i6 <= 0) {
                    int i7 = this.f2514f;
                    Object[] objArr = this.f2509a;
                    if (i7 < objArr.length) {
                        int i8 = i7 + 1;
                        this.f2514f = i8;
                        objArr[i7] = obj;
                        this.f2511c[i7] = iJ;
                        iArr[iJ] = i8;
                        this.f2517m++;
                        this.f2516l++;
                        if (i5 > this.f2513e) {
                            this.f2513e = i5;
                        }
                        return i7;
                    }
                    g(1);
                } else {
                    if (kotlin.jvm.internal.i.a(this.f2509a[i6 - 1], obj)) {
                        return -i6;
                    }
                    i5++;
                    if (i5 > i) {
                        k(this.f2512d.length * 2);
                        break;
                    }
                    iJ = iJ == 0 ? this.f2512d.length - 1 : iJ - 1;
                }
            }
        }
    }

    public final f b() {
        c();
        this.f2521q = true;
        if (this.f2517m > 0) {
            return this;
        }
        f fVar = f2508r;
        kotlin.jvm.internal.i.c(fVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return fVar;
    }

    public final void c() {
        if (this.f2521q) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f2514f - 1;
        if (i >= 0) {
            int i5 = 0;
            while (true) {
                int[] iArr = this.f2511c;
                int i6 = iArr[i5];
                if (i6 >= 0) {
                    this.f2512d[i6] = 0;
                    iArr[i5] = -1;
                }
                if (i5 == i) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        p1.b.N(this.f2509a, 0, this.f2514f);
        Object[] objArr = this.f2510b;
        if (objArr != null) {
            p1.b.N(objArr, 0, this.f2514f);
        }
        this.f2517m = 0;
        this.f2514f = 0;
        this.f2516l++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z4) {
        int i;
        Object[] objArr = this.f2510b;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = this.f2514f;
            if (i5 >= i) {
                break;
            }
            int[] iArr = this.f2511c;
            int i7 = iArr[i5];
            if (i7 >= 0) {
                Object[] objArr2 = this.f2509a;
                objArr2[i6] = objArr2[i5];
                if (objArr != null) {
                    objArr[i6] = objArr[i5];
                }
                if (z4) {
                    iArr[i6] = i7;
                    this.f2512d[i7] = i6 + 1;
                }
                i6++;
            }
            i5++;
        }
        p1.b.N(this.f2509a, i6, i);
        if (objArr != null) {
            p1.b.N(objArr, i6, this.f2514f);
        }
        this.f2514f = i6;
    }

    public final boolean e(Collection m5) {
        kotlin.jvm.internal.i.e(m5, "m");
        for (Object obj : m5) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f2520p;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.f2520p = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f2517m != map.size() || !e(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(Map.Entry entry) {
        kotlin.jvm.internal.i.e(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.f2510b;
        kotlin.jvm.internal.i.b(objArr);
        return kotlin.jvm.internal.i.a(objArr[iH], entry.getValue());
    }

    public final void g(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f2509a;
        int length = objArr.length;
        int i5 = this.f2514f;
        int i6 = length - i5;
        int i7 = i5 - this.f2517m;
        if (i6 < i && i6 + i7 >= i && i7 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i8 = i5 + i;
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        if (i8 > objArr.length) {
            int length2 = objArr.length;
            int i9 = length2 + (length2 >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            if (i9 - 2147483639 > 0) {
                i9 = i8 > 2147483639 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i9);
            kotlin.jvm.internal.i.d(objArrCopyOf2, "copyOf(...)");
            this.f2509a = objArrCopyOf2;
            Object[] objArr2 = this.f2510b;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i9);
                kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f2510b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f2511c, i9);
            kotlin.jvm.internal.i.d(iArrCopyOf, "copyOf(...)");
            this.f2511c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i9 >= 1 ? i9 : 1) * 3);
            if (iHighestOneBit > this.f2512d.length) {
                k(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f2510b;
        kotlin.jvm.internal.i.b(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i = this.f2513e;
        while (true) {
            int i5 = this.f2512d[iJ];
            if (i5 == 0) {
                return -1;
            }
            if (i5 > 0) {
                int i6 = i5 - 1;
                if (kotlin.jvm.internal.i.a(this.f2509a[i6], obj)) {
                    return i6;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f2512d.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i = 0;
        while (dVar.hasNext()) {
            int i5 = dVar.f2433a;
            f fVar = (f) dVar.f2436d;
            if (i5 >= fVar.f2514f) {
                throw new NoSuchElementException();
            }
            dVar.f2433a = i5 + 1;
            dVar.f2434b = i5;
            Object obj = fVar.f2509a[i5];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.f2510b;
            kotlin.jvm.internal.i.b(objArr);
            Object obj2 = objArr[dVar.f2434b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int i = this.f2514f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f2511c[i] >= 0) {
                Object[] objArr = this.f2510b;
                kotlin.jvm.internal.i.b(objArr);
                if (kotlin.jvm.internal.i.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f2517m == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f2515k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f2511c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.f2516l
            int r0 = r0 + 1
            r5.f2516l = r0
            int r0 = r5.f2514f
            int r1 = r5.f2517m
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f2512d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f2515k = r6
        L1c:
            int r6 = r5.f2514f
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f2509a
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.f2513e
        L2c:
            int[] r3 = r5.f2512d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f2511c
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r5.<init>(r6)
            throw r5
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.f.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f2518n;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 1);
        this.f2518n = gVar2;
        return gVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f2509a
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.i.e(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f2510b
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f2511c
            r0 = r0[r12]
            int r1 = r11.f2513e
            int r1 = r1 * 2
            int[] r2 = r11.f2512d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.f2512d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f2513e
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f2512d
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f2512d
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f2509a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f2512d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f2511c
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f2512d
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f2511c
            r0[r12] = r6
            int r12 = r11.f2517m
            int r12 = r12 + r6
            r11.f2517m = r12
            int r12 = r11.f2516l
            int r12 = r12 + 1
            r11.f2516l = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.f.l(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f2510b;
        if (objArr == null) {
            int length = this.f2509a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f2510b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        kotlin.jvm.internal.i.e(from, "from");
        c();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f2510b;
            if (objArr == null) {
                int length = this.f2509a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f2510b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!kotlin.jvm.internal.i.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f2510b;
        kotlin.jvm.internal.i.b(objArr);
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f2517m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f2517m * 3) + 2);
        sb.append("{");
        d dVar = new d(this, 0);
        int i = 0;
        while (dVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i5 = dVar.f2433a;
            f fVar = (f) dVar.f2436d;
            if (i5 >= fVar.f2514f) {
                throw new NoSuchElementException();
            }
            dVar.f2433a = i5 + 1;
            dVar.f2434b = i5;
            Object obj = fVar.f2509a[i5];
            if (obj == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = fVar.f2510b;
            kotlin.jvm.internal.i.b(objArr);
            Object obj2 = objArr[dVar.f2434b];
            if (obj2 == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            dVar.e();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        h hVar = this.f2519o;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        this.f2519o = hVar2;
        return hVar2;
    }

    public f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f2509a = objArr;
        this.f2510b = null;
        this.f2511c = iArr;
        this.f2512d = new int[iHighestOneBit];
        this.f2513e = 2;
        this.f2514f = 0;
        this.f2515k = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
