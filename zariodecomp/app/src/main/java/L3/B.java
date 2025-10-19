package L3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\B.smali */
public final class B extends AbstractC0115d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2323a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2324b;

    /* renamed from: c, reason: collision with root package name */
    public int f2325c;

    /* renamed from: d, reason: collision with root package name */
    public int f2326d;

    public B(Object[] objArr, int i) {
        this.f2323a = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(B.a.g(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.f2324b = objArr.length;
            this.f2326d = i;
        } else {
            StringBuilder sbN = B.a.n("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
            sbN.append(objArr.length);
            throw new IllegalArgumentException(sbN.toString().toString());
        }
    }

    @Override // L3.AbstractC0115d
    public final int f() {
        return this.f2326d;
    }

    public final void g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(B.a.g(i, "n shouldn't be negative but it is ").toString());
        }
        if (i > this.f2326d) {
            StringBuilder sbN = B.a.n("n shouldn't be greater than the buffer size: n = ", i, ", size = ");
            sbN.append(this.f2326d);
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        if (i > 0) {
            int i5 = this.f2325c;
            int i6 = this.f2324b;
            int i7 = (i5 + i) % i6;
            Object[] objArr = this.f2323a;
            if (i5 > i7) {
                i.u0(objArr, null, i5, i6);
                Arrays.fill(objArr, 0, i7, (Object) null);
            } else {
                i.u0(objArr, null, i5, i7);
            }
            this.f2325c = i7;
            this.f2326d -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int iF = f();
        if (i < 0 || i >= iF) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, iF, ", size: "));
        }
        return this.f2323a[(this.f2325c + i) % this.f2324b];
    }

    @Override // L3.AbstractC0115d, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new A(this);
    }

    @Override // L3.AbstractC0115d, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[f()]);
    }

    @Override // L3.AbstractC0115d, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i = this.f2326d;
        if (length < i) {
            array = Arrays.copyOf(array, i);
            kotlin.jvm.internal.i.d(array, "copyOf(...)");
        }
        int i5 = this.f2326d;
        int i6 = this.f2325c;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            objArr = this.f2323a;
            if (i8 >= i5 || i6 >= this.f2324b) {
                break;
            }
            array[i8] = objArr[i6];
            i8++;
            i6++;
        }
        while (i8 < i5) {
            array[i8] = objArr[i7];
            i8++;
            i7++;
        }
        p1.b.R(i5, array);
        return array;
    }
}
