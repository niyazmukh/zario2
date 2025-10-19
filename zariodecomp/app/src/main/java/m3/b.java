package M3;

import a.AbstractC0183a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M3\b.smali */
public final class b extends L3.e implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f2496a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2497b;

    /* renamed from: c, reason: collision with root package name */
    public int f2498c;

    /* renamed from: d, reason: collision with root package name */
    public final b f2499d;

    /* renamed from: e, reason: collision with root package name */
    public final c f2500e;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Object[] backing, int i, int i5, b bVar, c root) {
        kotlin.jvm.internal.i.e(backing, "backing");
        kotlin.jvm.internal.i.e(root, "root");
        this.f2496a = backing;
        this.f2497b = i;
        this.f2498c = i5;
        this.f2499d = bVar;
        this.f2500e = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    public final boolean add(Object obj) {
        l();
        k();
        j(this.f2497b + this.f2498c, obj);
        return true;
    }

    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        l();
        k();
        int size = elements.size();
        i(this.f2497b + this.f2498c, elements, size);
        return size > 0;
    }

    public final void clear() {
        l();
        k();
        n(this.f2497b, this.f2498c);
    }

    public final boolean equals(Object obj) {
        k();
        if (obj != this) {
            if (obj instanceof List) {
                if (p1.b.b(this.f2496a, this.f2497b, this.f2498c, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int f() {
        k();
        return this.f2498c;
    }

    public final Object g(int i) {
        l();
        k();
        int i5 = this.f2498c;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
        }
        return m(this.f2497b + i);
    }

    public final Object get(int i) {
        k();
        int i5 = this.f2498c;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
        }
        return this.f2496a[this.f2497b + i];
    }

    public final int hashCode() {
        k();
        Object[] objArr = this.f2496a;
        int i = this.f2498c;
        int iHashCode = 1;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[this.f2497b + i5];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(int i, Collection collection, int i5) {
        ((AbstractList) this).modCount++;
        c cVar = this.f2500e;
        b bVar = this.f2499d;
        if (bVar != null) {
            bVar.i(i, collection, i5);
        } else {
            c cVar2 = c.f2501d;
            cVar.i(i, collection, i5);
        }
        this.f2496a = cVar.f2502a;
        this.f2498c += i5;
    }

    public final int indexOf(Object obj) {
        k();
        for (int i = 0; i < this.f2498c; i++) {
            if (kotlin.jvm.internal.i.a(this.f2496a[this.f2497b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        k();
        return this.f2498c == 0;
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f2500e;
        b bVar = this.f2499d;
        if (bVar != null) {
            bVar.j(i, obj);
        } else {
            c cVar2 = c.f2501d;
            cVar.j(i, obj);
        }
        this.f2496a = cVar.f2502a;
        this.f2498c++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        if (((AbstractList) this.f2500e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void l() {
        if (this.f2500e.f2504c) {
            throw new UnsupportedOperationException();
        }
    }

    public final int lastIndexOf(Object obj) {
        k();
        for (int i = this.f2498c - 1; i >= 0; i--) {
            if (kotlin.jvm.internal.i.a(this.f2496a[this.f2497b + i], obj)) {
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
        Object objM;
        ((AbstractList) this).modCount++;
        b bVar = this.f2499d;
        if (bVar != null) {
            objM = bVar.m(i);
        } else {
            c cVar = c.f2501d;
            objM = this.f2500e.m(i);
        }
        this.f2498c--;
        return objM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(int i, int i5) {
        if (i5 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f2499d;
        if (bVar != null) {
            bVar.n(i, i5);
        } else {
            c cVar = c.f2501d;
            this.f2500e.n(i, i5);
        }
        this.f2498c -= i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o(int i, int i5, Collection collection, boolean z4) {
        int iO;
        b bVar = this.f2499d;
        if (bVar != null) {
            iO = bVar.o(i, i5, collection, z4);
        } else {
            c cVar = c.f2501d;
            iO = this.f2500e.o(i, i5, collection, z4);
        }
        if (iO > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f2498c -= iO;
        return iO;
    }

    public final boolean remove(Object obj) {
        l();
        k();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            g(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        l();
        k();
        return o(this.f2497b, this.f2498c, elements, false) > 0;
    }

    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        l();
        k();
        return o(this.f2497b, this.f2498c, elements, true) > 0;
    }

    public final Object set(int i, Object obj) {
        l();
        k();
        int i5 = this.f2498c;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
        }
        Object[] objArr = this.f2496a;
        int i6 = this.f2497b;
        Object obj2 = objArr[i6 + i];
        objArr[i6 + i] = obj;
        return obj2;
    }

    public final List subList(int i, int i5) {
        S0.f.o(i, i5, this.f2498c);
        return new b(this.f2496a, this.f2497b + i, i5 - i, this, this.f2500e);
    }

    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        k();
        int length = array.length;
        int i = this.f2498c;
        int i5 = this.f2497b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f2496a, i5, i + i5, array.getClass());
            kotlin.jvm.internal.i.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        L3.i.t0(this.f2496a, 0, array, i5, i + i5);
        p1.b.R(this.f2498c, array);
        return array;
    }

    public final String toString() {
        k();
        return p1.b.c(this.f2496a, this.f2497b, this.f2498c, this);
    }

    public final ListIterator listIterator(int i) {
        k();
        int i5 = this.f2498c;
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
        }
        return new a(this, i);
    }

    public final void add(int i, Object obj) {
        l();
        k();
        int i5 = this.f2498c;
        if (i >= 0 && i <= i5) {
            j(this.f2497b + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
    }

    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        l();
        k();
        int i5 = this.f2498c;
        if (i >= 0 && i <= i5) {
            int size = elements.size();
            i(this.f2497b + i, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
    }

    public final Object[] toArray() {
        k();
        Object[] objArr = this.f2496a;
        int i = this.f2498c;
        int i5 = this.f2497b;
        int i6 = i + i5;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        AbstractC0183a.t(i6, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i5, i6);
        kotlin.jvm.internal.i.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }
}
