package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\T.smali */
public final class T extends AbstractC0199b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final T f4451d = new T(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4452b;

    /* renamed from: c, reason: collision with root package name */
    public int f4453c;

    public T(Object[] objArr, int i, boolean z4) {
        this.f4477a = z4;
        this.f4452b = objArr;
        this.f4453c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i = this.f4453c;
        Object[] objArr = this.f4452b;
        if (i == objArr.length) {
            this.f4452b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4452b;
        int i5 = this.f4453c;
        this.f4453c = i5 + 1;
        objArr2[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void g(int i) {
        if (i < 0 || i >= this.f4453c) {
            StringBuilder sbN = B.a.n("Index:", i, ", Size:");
            sbN.append(this.f4453c);
            throw new IndexOutOfBoundsException(sbN.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g(i);
        return this.f4452b[i];
    }

    public final T h(int i) {
        if (i >= this.f4453c) {
            return new T(Arrays.copyOf(this.f4452b, i), this.f4453c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0199b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        f();
        g(i);
        Object[] objArr = this.f4452b;
        Object obj = objArr[i];
        if (i < this.f4453c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f4453c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        f();
        g(i);
        Object[] objArr = this.f4452b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4453c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i5;
        f();
        if (i >= 0 && i <= (i5 = this.f4453c)) {
            Object[] objArr = this.f4452b;
            if (i5 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i5 - i);
            } else {
                Object[] objArr2 = new Object[B.a.d(i5, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f4452b, i, objArr2, i + 1, this.f4453c - i);
                this.f4452b = objArr2;
            }
            this.f4452b[i] = obj;
            this.f4453c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbN = B.a.n("Index:", i, ", Size:");
        sbN.append(this.f4453c);
        throw new IndexOutOfBoundsException(sbN.toString());
    }
}
