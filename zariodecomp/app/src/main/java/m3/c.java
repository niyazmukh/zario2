package M3;

import a.AbstractC0183a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M3\c.smali */
public final class c extends L3.e implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final c f2501d;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f2502a;

    /* renamed from: b, reason: collision with root package name */
    public int f2503b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2504c;

    static {
        c cVar = new c(0);
        cVar.f2504c = true;
        f2501d = cVar;
    }

    public c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f2502a = new Object[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean add(Object obj) {
        k();
        int i = this.f2503b;
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.f2502a[i] = obj;
        return true;
    }

    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        k();
        int size = elements.size();
        i(this.f2503b, elements, size);
        return size > 0;
    }

    public final void clear() {
        k();
        n(0, this.f2503b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!p1.b.b(this.f2502a, 0, this.f2503b, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.f2503b;
    }

    public final Object g(int i) {
        k();
        int i5 = this.f2503b;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
        }
        return m(i);
    }

    public final Object get(int i) {
        int i5 = this.f2503b;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
        }
        return this.f2502a[i];
    }

    public final int hashCode() {
        Object[] objArr = this.f2502a;
        int i = this.f2503b;
        int iHashCode = 1;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(int i, Collection collection, int i5) {
        ((AbstractList) this).modCount++;
        l(i, i5);
        Iterator it = collection.iterator();
        for (int i6 = 0; i6 < i5; i6++) {
            this.f2502a[i + i6] = it.next();
        }
    }

    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f2503b; i++) {
            if (kotlin.jvm.internal.i.a(this.f2502a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.f2503b == 0;
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i, Object obj) {
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.f2502a[i] = obj;
    }

    public final void k() {
        if (this.f2504c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void l(int i, int i5) {
        int i6 = this.f2503b + i5;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f2502a;
        if (i6 > objArr.length) {
            int length = objArr.length;
            int i7 = length + (length >> 1);
            if (i7 - i6 < 0) {
                i7 = i6;
            }
            if (i7 - 2147483639 > 0) {
                i7 = i6 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i7);
            kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
            this.f2502a = objArrCopyOf;
        }
        Object[] objArr2 = this.f2502a;
        L3.i.t0(objArr2, i + i5, objArr2, i, this.f2503b);
        this.f2503b += i5;
    }

    public final int lastIndexOf(Object obj) {
        for (int i = this.f2503b - 1; i >= 0; i--) {
            if (kotlin.jvm.internal.i.a(this.f2502a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object m(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f2502a;
        Object obj = objArr[i];
        L3.i.t0(objArr, i, objArr, i + 1, this.f2503b);
        Object[] objArr2 = this.f2502a;
        int i5 = this.f2503b - 1;
        kotlin.jvm.internal.i.e(objArr2, "<this>");
        objArr2[i5] = null;
        this.f2503b--;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(int i, int i5) {
        if (i5 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f2502a;
        L3.i.t0(objArr, i, objArr, i + i5, this.f2503b);
        Object[] objArr2 = this.f2502a;
        int i6 = this.f2503b;
        p1.b.N(objArr2, i6 - i5, i6);
        this.f2503b -= i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o(int i, int i5, Collection collection, boolean z4) {
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            int i8 = i + i6;
            if (collection.contains(this.f2502a[i8]) == z4) {
                Object[] objArr = this.f2502a;
                i6++;
                objArr[i7 + i] = objArr[i8];
                i7++;
            } else {
                i6++;
            }
        }
        int i9 = i5 - i7;
        Object[] objArr2 = this.f2502a;
        L3.i.t0(objArr2, i + i7, objArr2, i5 + i, this.f2503b);
        Object[] objArr3 = this.f2502a;
        int i10 = this.f2503b;
        p1.b.N(objArr3, i10 - i9, i10);
        if (i9 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f2503b -= i9;
        return i9;
    }

    public final boolean remove(Object obj) {
        k();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            g(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        k();
        return o(0, this.f2503b, elements, false) > 0;
    }

    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        k();
        return o(0, this.f2503b, elements, true) > 0;
    }

    public final Object set(int i, Object obj) {
        k();
        int i5 = this.f2503b;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
        }
        Object[] objArr = this.f2502a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final List subList(int i, int i5) {
        S0.f.o(i, i5, this.f2503b);
        return new b(this.f2502a, i, i5 - i, null, this);
    }

    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i = this.f2503b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f2502a, 0, i, array.getClass());
            kotlin.jvm.internal.i.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        L3.i.t0(this.f2502a, 0, array, 0, i);
        p1.b.R(this.f2503b, array);
        return array;
    }

    public final String toString() {
        return p1.b.c(this.f2502a, 0, this.f2503b, this);
    }

    public final ListIterator listIterator(int i) {
        int i5 = this.f2503b;
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
        }
        return new a(this, i);
    }

    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        k();
        int i5 = this.f2503b;
        if (i >= 0 && i <= i5) {
            int size = elements.size();
            i(i, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
    }

    public final Object[] toArray() {
        Object[] objArr = this.f2502a;
        int i = this.f2503b;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        AbstractC0183a.t(i, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 0, i);
        kotlin.jvm.internal.i.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void add(int i, Object obj) {
        k();
        int i5 = this.f2503b;
        if (i >= 0 && i <= i5) {
            ((AbstractList) this).modCount++;
            l(i, 1);
            this.f2502a[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
    }
}
