package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\H.smali */
public final class H extends AbstractC0390b implements J, RandomAccess, InterfaceC0412m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final H f6420d = new H(new int[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public int[] f6421b;

    /* renamed from: c, reason: collision with root package name */
    public int f6422c;

    public H(int[] iArr, int i, boolean z4) {
        super(z4);
        this.f6421b = iArr;
        this.f6422c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i5;
        int iIntValue = ((Integer) obj).intValue();
        f();
        if (i < 0 || i > (i5 = this.f6422c)) {
            StringBuilder sbN = B.a.n("Index:", i, ", Size:");
            sbN.append(this.f6422c);
            throw new IndexOutOfBoundsException(sbN.toString());
        }
        int[] iArr = this.f6421b;
        if (i5 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i5 - i);
        } else {
            int[] iArr2 = new int[B.a.d(i5, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f6421b, i, iArr2, i + 1, this.f6422c - i);
            this.f6421b = iArr2;
        }
        this.f6421b[i] = iIntValue;
        this.f6422c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0390b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        f();
        Charset charset = L.f6425a;
        collection.getClass();
        if (!(collection instanceof H)) {
            return super.addAll(collection);
        }
        H h = (H) collection;
        int i = h.f6422c;
        if (i == 0) {
            return false;
        }
        int i5 = this.f6422c;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i5 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i;
        int[] iArr = this.f6421b;
        if (i6 > iArr.length) {
            this.f6421b = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(h.f6421b, 0, this.f6421b, this.f6422c, h.f6422c);
        this.f6422c = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.K
    public final K c(int i) {
        if (i >= this.f6422c) {
            return new H(Arrays.copyOf(this.f6421b, i), this.f6422c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC0390b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return super.equals(obj);
        }
        H h = (H) obj;
        if (this.f6422c != h.f6422c) {
            return false;
        }
        int[] iArr = h.f6421b;
        for (int i = 0; i < this.f6422c; i++) {
            if (this.f6421b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        i(i);
        return Integer.valueOf(this.f6421b[i]);
    }

    public final void h(int i) {
        f();
        int i5 = this.f6422c;
        int[] iArr = this.f6421b;
        if (i5 == iArr.length) {
            int[] iArr2 = new int[B.a.d(i5, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            this.f6421b = iArr2;
        }
        int[] iArr3 = this.f6421b;
        int i6 = this.f6422c;
        this.f6422c = i6 + 1;
        iArr3[i6] = i;
    }

    @Override // com.google.protobuf.AbstractC0390b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i5 = 0; i5 < this.f6422c; i5++) {
            i = (i * 31) + this.f6421b[i5];
        }
        return i;
    }

    public final void i(int i) {
        if (i < 0 || i >= this.f6422c) {
            StringBuilder sbN = B.a.n("Index:", i, ", Size:");
            sbN.append(this.f6422c);
            throw new IndexOutOfBoundsException(sbN.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f6422c;
        for (int i5 = 0; i5 < i; i5++) {
            if (this.f6421b[i5] == iIntValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC0390b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        f();
        i(i);
        int[] iArr = this.f6421b;
        int i5 = iArr[i];
        if (i < this.f6422c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f6422c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i5) {
        f();
        if (i5 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f6421b;
        System.arraycopy(iArr, i5, iArr, i, this.f6422c - i5);
        this.f6422c -= i5 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        f();
        i(i);
        int[] iArr = this.f6421b;
        int i5 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6422c;
    }

    @Override // com.google.protobuf.AbstractC0390b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }
}
