package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.o0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\o0.1.smali */
public final class C0416o0 extends AbstractC0390b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final C0416o0 f6559d = new C0416o0(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6560b;

    /* renamed from: c, reason: collision with root package name */
    public int f6561c;

    public C0416o0(Object[] objArr, int i, boolean z4) {
        super(z4);
        this.f6560b = objArr;
        this.f6561c = i;
    }

    @Override // com.google.protobuf.AbstractC0390b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i = this.f6561c;
        Object[] objArr = this.f6560b;
        if (i == objArr.length) {
            this.f6560b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f6560b;
        int i5 = this.f6561c;
        this.f6561c = i5 + 1;
        objArr2[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.K
    public final K c(int i) {
        if (i >= this.f6561c) {
            return new C0416o0(Arrays.copyOf(this.f6560b, i), this.f6561c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h(i);
        return this.f6560b[i];
    }

    public final void h(int i) {
        if (i < 0 || i >= this.f6561c) {
            StringBuilder sbN = B.a.n("Index:", i, ", Size:");
            sbN.append(this.f6561c);
            throw new IndexOutOfBoundsException(sbN.toString());
        }
    }

    @Override // com.google.protobuf.AbstractC0390b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        f();
        h(i);
        Object[] objArr = this.f6560b;
        Object obj = objArr[i];
        if (i < this.f6561c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f6561c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        f();
        h(i);
        Object[] objArr = this.f6560b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6561c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i5;
        f();
        if (i >= 0 && i <= (i5 = this.f6561c)) {
            Object[] objArr = this.f6560b;
            if (i5 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i5 - i);
            } else {
                Object[] objArr2 = new Object[B.a.d(i5, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f6560b, i, objArr2, i + 1, this.f6561c - i);
                this.f6560b = objArr2;
            }
            this.f6560b[i] = obj;
            this.f6561c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbN = B.a.n("Index:", i, ", Size:");
        sbN.append(this.f6561c);
        throw new IndexOutOfBoundsException(sbN.toString());
    }
}
