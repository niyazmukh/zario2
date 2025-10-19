package q;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: q.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q.1\k.smali */
public class C0834k {

    /* renamed from: d, reason: collision with root package name */
    public static Object[] f9422d;

    /* renamed from: e, reason: collision with root package name */
    public static int f9423e;

    /* renamed from: f, reason: collision with root package name */
    public static Object[] f9424f;

    /* renamed from: k, reason: collision with root package name */
    public static int f9425k;

    /* renamed from: a, reason: collision with root package name */
    public int[] f9426a = AbstractC0827d.f9402a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f9427b = AbstractC0827d.f9404c;

    /* renamed from: c, reason: collision with root package name */
    public int f9428c = 0;

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0834k.class) {
                try {
                    if (f9425k < 10) {
                        objArr[0] = f9424f;
                        objArr[1] = iArr;
                        for (int i5 = (i << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f9424f = objArr;
                        f9425k++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0834k.class) {
                try {
                    if (f9423e < 10) {
                        objArr[0] = f9422d;
                        objArr[1] = iArr;
                        for (int i6 = (i << 1) - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f9422d = objArr;
                        f9423e++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (C0834k.class) {
                try {
                    Object[] objArr = f9424f;
                    if (objArr != null) {
                        this.f9427b = objArr;
                        f9424f = (Object[]) objArr[0];
                        this.f9426a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f9425k--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (C0834k.class) {
                try {
                    Object[] objArr2 = f9422d;
                    if (objArr2 != null) {
                        this.f9427b = objArr2;
                        f9422d = (Object[]) objArr2[0];
                        this.f9426a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f9423e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f9426a = new int[i];
        this.f9427b = new Object[i << 1];
    }

    public final void b(int i) {
        int i5 = this.f9428c;
        int[] iArr = this.f9426a;
        if (iArr.length < i) {
            Object[] objArr = this.f9427b;
            a(i);
            if (this.f9428c > 0) {
                System.arraycopy(iArr, 0, this.f9426a, 0, i5);
                System.arraycopy(objArr, 0, this.f9427b, 0, i5 << 1);
            }
            c(iArr, objArr, i5);
        }
        if (this.f9428c != i5) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.f9428c;
        if (i > 0) {
            int[] iArr = this.f9426a;
            Object[] objArr = this.f9427b;
            this.f9426a = AbstractC0827d.f9402a;
            this.f9427b = AbstractC0827d.f9404c;
            this.f9428c = 0;
            c(iArr, objArr, i);
        }
        if (this.f9428c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i, Object obj) {
        int i5 = this.f9428c;
        if (i5 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC0827d.a(i5, i, this.f9426a);
            if (iA < 0 || obj.equals(this.f9427b[iA << 1])) {
                return iA;
            }
            int i6 = iA + 1;
            while (i6 < i5 && this.f9426a[i6] == i) {
                if (obj.equals(this.f9427b[i6 << 1])) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = iA - 1; i7 >= 0 && this.f9426a[i7] == i; i7--) {
                if (obj.equals(this.f9427b[i7 << 1])) {
                    return i7;
                }
            }
            return ~i6;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0834k) {
            C0834k c0834k = (C0834k) obj;
            if (this.f9428c != c0834k.f9428c) {
                return false;
            }
            for (int i = 0; i < this.f9428c; i++) {
                try {
                    Object objH = h(i);
                    Object objJ = j(i);
                    Object orDefault = c0834k.getOrDefault(objH, null);
                    if (objJ == null) {
                        if (orDefault != null || !c0834k.containsKey(objH)) {
                            return false;
                        }
                    } else if (!objJ.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f9428c != map.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f9428c; i5++) {
                try {
                    Object objH2 = h(i5);
                    Object objJ2 = j(i5);
                    Object obj2 = map.get(objH2);
                    if (objJ2 == null) {
                        if (obj2 != null || !map.containsKey(objH2)) {
                            return false;
                        }
                    } else if (!objJ2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i = this.f9428c;
        if (i == 0) {
            return -1;
        }
        try {
            int iA = AbstractC0827d.a(i, 0, this.f9426a);
            if (iA < 0 || this.f9427b[iA << 1] == null) {
                return iA;
            }
            int i5 = iA + 1;
            while (i5 < i && this.f9426a[i5] == 0) {
                if (this.f9427b[i5 << 1] == null) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = iA - 1; i6 >= 0 && this.f9426a[i6] == 0; i6--) {
                if (this.f9427b[i6 << 1] == null) {
                    return i6;
                }
            }
            return ~i5;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i = this.f9428c * 2;
        Object[] objArr = this.f9427b;
        if (obj == null) {
            for (int i5 = 1; i5 < i; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.f9427b[(iE << 1) + 1] : obj2;
    }

    public final Object h(int i) {
        return this.f9427b[i << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f9426a;
        Object[] objArr = this.f9427b;
        int i = this.f9428c;
        int i5 = 1;
        int i6 = 0;
        int iHashCode = 0;
        while (i6 < i) {
            Object obj = objArr[i5];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i6];
            i6++;
            i5 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i) {
        Object[] objArr = this.f9427b;
        int i5 = i << 1;
        Object obj = objArr[i5 + 1];
        int i6 = this.f9428c;
        int i7 = 0;
        if (i6 <= 1) {
            c(this.f9426a, objArr, i6);
            this.f9426a = AbstractC0827d.f9402a;
            this.f9427b = AbstractC0827d.f9404c;
        } else {
            int i8 = i6 - 1;
            int[] iArr = this.f9426a;
            if (iArr.length <= 8 || i6 >= iArr.length / 3) {
                if (i < i8) {
                    int i9 = i + 1;
                    int i10 = i8 - i;
                    System.arraycopy(iArr, i9, iArr, i, i10);
                    Object[] objArr2 = this.f9427b;
                    System.arraycopy(objArr2, i9 << 1, objArr2, i5, i10 << 1);
                }
                Object[] objArr3 = this.f9427b;
                int i11 = i8 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            } else {
                a(i6 > 8 ? i6 + (i6 >> 1) : 8);
                if (i6 != this.f9428c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f9426a, 0, i);
                    System.arraycopy(objArr, 0, this.f9427b, 0, i5);
                }
                if (i < i8) {
                    int i12 = i + 1;
                    int i13 = i8 - i;
                    System.arraycopy(iArr, i12, this.f9426a, i, i13);
                    System.arraycopy(objArr, i12 << 1, this.f9427b, i5, i13 << 1);
                }
            }
            i7 = i8;
        }
        if (i6 != this.f9428c) {
            throw new ConcurrentModificationException();
        }
        this.f9428c = i7;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f9428c <= 0;
    }

    public final Object j(int i) {
        return this.f9427b[(i << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int iD;
        int i5 = this.f9428c;
        if (obj == null) {
            iD = f();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iD = d(iHashCode, obj);
        }
        if (iD >= 0) {
            int i6 = (iD << 1) + 1;
            Object[] objArr = this.f9427b;
            Object obj3 = objArr[i6];
            objArr[i6] = obj2;
            return obj3;
        }
        int i7 = ~iD;
        int[] iArr = this.f9426a;
        if (i5 >= iArr.length) {
            int i8 = 8;
            if (i5 >= 8) {
                i8 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i8 = 4;
            }
            Object[] objArr2 = this.f9427b;
            a(i8);
            if (i5 != this.f9428c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f9426a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f9427b, 0, objArr2.length);
            }
            c(iArr, objArr2, i5);
        }
        if (i7 < i5) {
            int[] iArr3 = this.f9426a;
            int i9 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i9, i5 - i7);
            Object[] objArr3 = this.f9427b;
            System.arraycopy(objArr3, i7 << 1, objArr3, i9 << 1, (this.f9428c - i7) << 1);
        }
        int i10 = this.f9428c;
        if (i5 == i10) {
            int[] iArr4 = this.f9426a;
            if (i7 < iArr4.length) {
                iArr4[i7] = i;
                Object[] objArr4 = this.f9427b;
                int i11 = i7 << 1;
                objArr4[i11] = obj;
                objArr4[i11 + 1] = obj2;
                this.f9428c = i10 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return i(iE);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            return null;
        }
        int i = (iE << 1) + 1;
        Object[] objArr = this.f9427b;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f9428c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9428c * 28);
        sb.append('{');
        for (int i = 0; i < this.f9428c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objH = h(i);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i);
            if (objJ != this) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        Object objJ = j(iE);
        if (obj2 != objJ && (obj2 == null || !obj2.equals(objJ))) {
            return false;
        }
        i(iE);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        Object objJ = j(iE);
        if (objJ != obj2 && (obj2 == null || !obj2.equals(objJ))) {
            return false;
        }
        int i = (iE << 1) + 1;
        Object[] objArr = this.f9427b;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return true;
    }
}
