package L3;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\h.smali */
public final class h extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f2344d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f2345a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f2346b = f2344d;

    /* renamed from: c, reason: collision with root package name */
    public int f2347c;

    public final void add(int i, Object obj) {
        int length;
        int i5 = this.f2347c;
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
        }
        if (i == i5) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        o();
        i(this.f2347c + 1);
        int iN = n(this.f2345a + i);
        int i6 = this.f2347c;
        if (i < ((i6 + 1) >> 1)) {
            if (iN == 0) {
                Object[] objArr = this.f2346b;
                kotlin.jvm.internal.i.e(objArr, "<this>");
                iN = objArr.length;
            }
            int i7 = iN - 1;
            int i8 = this.f2345a;
            if (i8 == 0) {
                Object[] objArr2 = this.f2346b;
                kotlin.jvm.internal.i.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i8 - 1;
            }
            int i9 = this.f2345a;
            if (i7 >= i9) {
                Object[] objArr3 = this.f2346b;
                objArr3[length] = objArr3[i9];
                i.t0(objArr3, i9, objArr3, i9 + 1, i7 + 1);
            } else {
                Object[] objArr4 = this.f2346b;
                i.t0(objArr4, i9 - 1, objArr4, i9, objArr4.length);
                Object[] objArr5 = this.f2346b;
                objArr5[objArr5.length - 1] = objArr5[0];
                i.t0(objArr5, 0, objArr5, 1, i7 + 1);
            }
            this.f2346b[i7] = obj;
            this.f2345a = length;
        } else {
            int iN2 = n(i6 + this.f2345a);
            if (iN < iN2) {
                Object[] objArr6 = this.f2346b;
                i.t0(objArr6, iN + 1, objArr6, iN, iN2);
            } else {
                Object[] objArr7 = this.f2346b;
                i.t0(objArr7, 1, objArr7, 0, iN2);
                Object[] objArr8 = this.f2346b;
                objArr8[0] = objArr8[objArr8.length - 1];
                i.t0(objArr8, iN + 1, objArr8, iN, objArr8.length - 1);
            }
            this.f2346b[iN] = obj;
        }
        this.f2347c++;
    }

    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        int i5 = this.f2347c;
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i == this.f2347c) {
            return addAll(elements);
        }
        o();
        i(elements.size() + this.f2347c);
        int iN = n(this.f2347c + this.f2345a);
        int iN2 = n(this.f2345a + i);
        int size = elements.size();
        if (i < ((this.f2347c + 1) >> 1)) {
            int i6 = this.f2345a;
            int length = i6 - size;
            if (iN2 < i6) {
                Object[] objArr = this.f2346b;
                i.t0(objArr, length, objArr, i6, objArr.length);
                if (size >= iN2) {
                    Object[] objArr2 = this.f2346b;
                    i.t0(objArr2, objArr2.length - size, objArr2, 0, iN2);
                } else {
                    Object[] objArr3 = this.f2346b;
                    i.t0(objArr3, objArr3.length - size, objArr3, 0, size);
                    Object[] objArr4 = this.f2346b;
                    i.t0(objArr4, 0, objArr4, size, iN2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f2346b;
                i.t0(objArr5, length, objArr5, i6, iN2);
            } else {
                Object[] objArr6 = this.f2346b;
                length += objArr6.length;
                int i7 = iN2 - i6;
                int length2 = objArr6.length - length;
                if (length2 >= i7) {
                    i.t0(objArr6, length, objArr6, i6, iN2);
                } else {
                    i.t0(objArr6, length, objArr6, i6, i6 + length2);
                    Object[] objArr7 = this.f2346b;
                    i.t0(objArr7, 0, objArr7, this.f2345a + length2, iN2);
                }
            }
            this.f2345a = length;
            h(l(iN2 - size), elements);
        } else {
            int i8 = iN2 + size;
            if (iN2 < iN) {
                int i9 = size + iN;
                Object[] objArr8 = this.f2346b;
                if (i9 <= objArr8.length) {
                    i.t0(objArr8, i8, objArr8, iN2, iN);
                } else if (i8 >= objArr8.length) {
                    i.t0(objArr8, i8 - objArr8.length, objArr8, iN2, iN);
                } else {
                    int length3 = iN - (i9 - objArr8.length);
                    i.t0(objArr8, 0, objArr8, length3, iN);
                    Object[] objArr9 = this.f2346b;
                    i.t0(objArr9, i8, objArr9, iN2, length3);
                }
            } else {
                Object[] objArr10 = this.f2346b;
                i.t0(objArr10, size, objArr10, 0, iN);
                Object[] objArr11 = this.f2346b;
                if (i8 >= objArr11.length) {
                    i.t0(objArr11, i8 - objArr11.length, objArr11, iN2, objArr11.length);
                } else {
                    i.t0(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f2346b;
                    i.t0(objArr12, i8, objArr12, iN2, objArr12.length - size);
                }
            }
            h(iN2, elements);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        o();
        i(this.f2347c + 1);
        int length = this.f2345a;
        if (length == 0) {
            Object[] objArr = this.f2346b;
            kotlin.jvm.internal.i.e(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f2345a = i;
        this.f2346b[i] = obj;
        this.f2347c++;
    }

    public final void addLast(Object obj) {
        o();
        i(f() + 1);
        this.f2346b[n(f() + this.f2345a)] = obj;
        this.f2347c = f() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void clear() {
        if (!isEmpty()) {
            o();
            m(this.f2345a, n(f() + this.f2345a));
        }
        this.f2345a = 0;
        this.f2347c = 0;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int f() {
        return this.f2347c;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f2346b[this.f2345a];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(int i) {
        int i5 = this.f2347c;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
        }
        if (i == k.X(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        o();
        int iN = n(this.f2345a + i);
        Object[] objArr = this.f2346b;
        Object obj = objArr[iN];
        if (i < (this.f2347c >> 1)) {
            int i6 = this.f2345a;
            if (iN >= i6) {
                i.t0(objArr, i6 + 1, objArr, i6, iN);
            } else {
                i.t0(objArr, 1, objArr, 0, iN);
                Object[] objArr2 = this.f2346b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f2345a;
                i.t0(objArr2, i7 + 1, objArr2, i7, objArr2.length - 1);
            }
            Object[] objArr3 = this.f2346b;
            int i8 = this.f2345a;
            objArr3[i8] = null;
            this.f2345a = j(i8);
        } else {
            int iN2 = n(k.X(this) + this.f2345a);
            if (iN <= iN2) {
                Object[] objArr4 = this.f2346b;
                i.t0(objArr4, iN, objArr4, iN + 1, iN2 + 1);
            } else {
                Object[] objArr5 = this.f2346b;
                i.t0(objArr5, iN, objArr5, iN + 1, objArr5.length);
                Object[] objArr6 = this.f2346b;
                objArr6[objArr6.length - 1] = objArr6[0];
                i.t0(objArr6, 0, objArr6, 1, iN2 + 1);
            }
            this.f2346b[iN2] = null;
        }
        this.f2347c--;
        return obj;
    }

    public final Object get(int i) {
        int iF = f();
        if (i < 0 || i >= iF) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, iF, ", size: "));
        }
        return this.f2346b[n(this.f2345a + i)];
    }

    public final void h(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2346b.length;
        while (i < length && it.hasNext()) {
            this.f2346b[i] = it.next();
            i++;
        }
        int i5 = this.f2345a;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f2346b[i6] = it.next();
        }
        this.f2347c = collection.size() + f();
    }

    public final void i(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f2346b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f2344d) {
            if (i < 10) {
                i = 10;
            }
            this.f2346b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i5 = length + (length >> 1);
        if (i5 - i < 0) {
            i5 = i;
        }
        if (i5 - 2147483639 > 0) {
            i5 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i5];
        i.t0(objArr, 0, objArr2, this.f2345a, objArr.length);
        Object[] objArr3 = this.f2346b;
        int length2 = objArr3.length;
        int i6 = this.f2345a;
        i.t0(objArr3, length2 - i6, objArr2, 0, i6);
        this.f2345a = 0;
        this.f2346b = objArr2;
    }

    public final int indexOf(Object obj) {
        int i;
        int iN = n(f() + this.f2345a);
        int length = this.f2345a;
        if (length < iN) {
            while (length < iN) {
                if (kotlin.jvm.internal.i.a(obj, this.f2346b[length])) {
                    i = this.f2345a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iN) {
            return -1;
        }
        int length2 = this.f2346b.length;
        while (true) {
            if (length >= length2) {
                for (int i5 = 0; i5 < iN; i5++) {
                    if (kotlin.jvm.internal.i.a(obj, this.f2346b[i5])) {
                        length = i5 + this.f2346b.length;
                        i = this.f2345a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.i.a(obj, this.f2346b[length])) {
                i = this.f2345a;
                break;
            }
            length++;
        }
        return length - i;
    }

    public final boolean isEmpty() {
        return f() == 0;
    }

    public final int j(int i) {
        kotlin.jvm.internal.i.e(this.f2346b, "<this>");
        if (i == r1.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object k() {
        if (isEmpty()) {
            return null;
        }
        return this.f2346b[n(k.X(this) + this.f2345a)];
    }

    public final int l(int i) {
        return i < 0 ? i + this.f2346b.length : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f2346b[n(k.X(this) + this.f2345a)];
    }

    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iN = n(this.f2347c + this.f2345a);
        int i5 = this.f2345a;
        if (i5 < iN) {
            length = iN - 1;
            if (i5 <= length) {
                while (!kotlin.jvm.internal.i.a(obj, this.f2346b[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i = this.f2345a;
                return length - i;
            }
            return -1;
        }
        if (i5 > iN) {
            int i6 = iN - 1;
            while (true) {
                if (-1 >= i6) {
                    Object[] objArr = this.f2346b;
                    kotlin.jvm.internal.i.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i7 = this.f2345a;
                    if (i7 <= length) {
                        while (!kotlin.jvm.internal.i.a(obj, this.f2346b[length])) {
                            if (length != i7) {
                                length--;
                            }
                        }
                        i = this.f2345a;
                    }
                } else {
                    if (kotlin.jvm.internal.i.a(obj, this.f2346b[i6])) {
                        length = i6 + this.f2346b.length;
                        i = this.f2345a;
                        break;
                    }
                    i6--;
                }
            }
        }
        return -1;
    }

    public final void m(int i, int i5) {
        if (i < i5) {
            i.u0(this.f2346b, null, i, i5);
            return;
        }
        Object[] objArr = this.f2346b;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        i.u0(this.f2346b, null, 0, i5);
    }

    public final int n(int i) {
        Object[] objArr = this.f2346b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o() {
        ((AbstractList) this).modCount++;
    }

    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        g(iIndexOf);
        return true;
    }

    public final boolean removeAll(Collection elements) {
        int iN;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f2346b.length != 0) {
            int iN2 = n(this.f2347c + this.f2345a);
            int i = this.f2345a;
            if (i < iN2) {
                iN = i;
                while (i < iN2) {
                    Object obj = this.f2346b[i];
                    if (elements.contains(obj)) {
                        z4 = true;
                    } else {
                        this.f2346b[iN] = obj;
                        iN++;
                    }
                    i++;
                }
                i.u0(this.f2346b, null, iN, iN2);
            } else {
                int length = this.f2346b.length;
                boolean z5 = false;
                int i5 = i;
                while (i < length) {
                    Object[] objArr = this.f2346b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.f2346b[i5] = obj2;
                        i5++;
                    }
                    i++;
                }
                iN = n(i5);
                for (int i6 = 0; i6 < iN2; i6++) {
                    Object[] objArr2 = this.f2346b;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (elements.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.f2346b[iN] = obj3;
                        iN = j(iN);
                    }
                }
                z4 = z5;
            }
            if (z4) {
                o();
                this.f2347c = l(iN - this.f2345a);
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        Object[] objArr = this.f2346b;
        int i = this.f2345a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f2345a = j(i);
        this.f2347c = f() - 1;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        int iN = n(k.X(this) + this.f2345a);
        Object[] objArr = this.f2346b;
        Object obj = objArr[iN];
        objArr[iN] = null;
        this.f2347c = f() - 1;
        return obj;
    }

    public final void removeRange(int i, int i5) {
        S0.f.o(i, i5, this.f2347c);
        int i6 = i5 - i;
        if (i6 == 0) {
            return;
        }
        if (i6 == this.f2347c) {
            clear();
            return;
        }
        if (i6 == 1) {
            g(i);
            return;
        }
        o();
        if (i < this.f2347c - i5) {
            int iN = n((i - 1) + this.f2345a);
            int iN2 = n((i5 - 1) + this.f2345a);
            while (i > 0) {
                int i7 = iN + 1;
                int iMin = Math.min(i, Math.min(i7, iN2 + 1));
                Object[] objArr = this.f2346b;
                int i8 = iN2 - iMin;
                int i9 = iN - iMin;
                i.t0(objArr, i8 + 1, objArr, i9 + 1, i7);
                iN = l(i9);
                iN2 = l(i8);
                i -= iMin;
            }
            int iN3 = n(this.f2345a + i6);
            m(this.f2345a, iN3);
            this.f2345a = iN3;
        } else {
            int iN4 = n(this.f2345a + i5);
            int iN5 = n(this.f2345a + i);
            int i10 = this.f2347c;
            while (true) {
                i10 -= i5;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f2346b;
                i5 = Math.min(i10, Math.min(objArr2.length - iN4, objArr2.length - iN5));
                Object[] objArr3 = this.f2346b;
                int i11 = iN4 + i5;
                i.t0(objArr3, iN5, objArr3, iN4, i11);
                iN4 = n(i11);
                iN5 = n(iN5 + i5);
            }
            int iN6 = n(this.f2347c + this.f2345a);
            m(l(iN6 - i6), iN6);
        }
        this.f2347c -= i6;
    }

    public final boolean retainAll(Collection elements) {
        int iN;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f2346b.length != 0) {
            int iN2 = n(this.f2347c + this.f2345a);
            int i = this.f2345a;
            if (i < iN2) {
                iN = i;
                while (i < iN2) {
                    Object obj = this.f2346b[i];
                    if (elements.contains(obj)) {
                        this.f2346b[iN] = obj;
                        iN++;
                    } else {
                        z4 = true;
                    }
                    i++;
                }
                i.u0(this.f2346b, null, iN, iN2);
            } else {
                int length = this.f2346b.length;
                boolean z5 = false;
                int i5 = i;
                while (i < length) {
                    Object[] objArr = this.f2346b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.f2346b[i5] = obj2;
                        i5++;
                    } else {
                        z5 = true;
                    }
                    i++;
                }
                iN = n(i5);
                for (int i6 = 0; i6 < iN2; i6++) {
                    Object[] objArr2 = this.f2346b;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (elements.contains(obj3)) {
                        this.f2346b[iN] = obj3;
                        iN = j(iN);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                o();
                this.f2347c = l(iN - this.f2345a);
            }
        }
        return z4;
    }

    public final Object set(int i, Object obj) {
        int iF = f();
        if (i < 0 || i >= iF) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, iF, ", size: "));
        }
        int iN = n(this.f2345a + i);
        Object[] objArr = this.f2346b;
        Object obj2 = objArr[iN];
        objArr[iN] = obj;
        return obj2;
    }

    public final Object[] toArray() {
        return toArray(new Object[f()]);
    }

    public final Object[] toArray(Object[] array) throws NegativeArraySizeException {
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i = this.f2347c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i);
            kotlin.jvm.internal.i.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iN = n(this.f2347c + this.f2345a);
        int i5 = this.f2345a;
        if (i5 < iN) {
            i.t0(this.f2346b, 0, array, i5, iN);
        } else if (!isEmpty()) {
            Object[] objArr = this.f2346b;
            i.t0(objArr, 0, array, this.f2345a, objArr.length);
            Object[] objArr2 = this.f2346b;
            i.t0(objArr2, objArr2.length - this.f2345a, array, 0, iN);
        }
        p1.b.R(this.f2347c, array);
        return array;
    }

    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        o();
        i(elements.size() + f());
        h(n(f() + this.f2345a), elements);
        return true;
    }
}
