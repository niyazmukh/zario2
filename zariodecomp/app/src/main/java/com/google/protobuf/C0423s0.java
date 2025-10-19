package com.google.protobuf;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.s0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\s0.1.smali */
public final class C0423s0 extends AbstractC0409l {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f6581m = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, com.google.android.gms.common.api.f.API_PRIORITY_OTHER};

    /* renamed from: d, reason: collision with root package name */
    public final int f6582d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0409l f6583e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0409l f6584f;

    /* renamed from: k, reason: collision with root package name */
    public final int f6585k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6586l;

    public C0423s0(AbstractC0409l abstractC0409l, AbstractC0409l abstractC0409l2) {
        this.f6583e = abstractC0409l;
        this.f6584f = abstractC0409l2;
        int size = abstractC0409l.size();
        this.f6585k = size;
        this.f6582d = abstractC0409l2.size() + size;
        this.f6586l = Math.max(abstractC0409l.m(), abstractC0409l2.m()) + 1;
    }

    public static int x(int i) {
        return i >= 47 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : f6581m[i];
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0409l)) {
            return false;
        }
        AbstractC0409l abstractC0409l = (AbstractC0409l) obj;
        int size = abstractC0409l.size();
        int i = this.f6582d;
        if (i != size) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int i5 = this.f6530a;
        int i6 = abstractC0409l.f6530a;
        if (i5 != 0 && i6 != 0 && i5 != i6) {
            return false;
        }
        C0421r0 c0421r0 = new C0421r0(this);
        C0407k c0407kA = c0421r0.a();
        C0421r0 c0421r02 = new C0421r0(abstractC0409l);
        C0407k c0407kA2 = c0421r02.a();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int size2 = c0407kA.size() - i7;
            int size3 = c0407kA2.size() - i8;
            int iMin = Math.min(size2, size3);
            if (!(i7 == 0 ? c0407kA.x(c0407kA2, i8, iMin) : c0407kA2.x(c0407kA, i7, iMin))) {
                return false;
            }
            i9 += iMin;
            if (i9 >= i) {
                if (i9 == i) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size2) {
                c0407kA = c0421r0.a();
                i7 = 0;
            } else {
                i7 += iMin;
            }
            if (iMin == size3) {
                c0407kA2 = c0421r02.a();
                i8 = 0;
            } else {
                i8 += iMin;
            }
        }
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final ByteBuffer f() {
        return ByteBuffer.wrap(u()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final byte h(int i) {
        AbstractC0409l.i(i, this.f6582d);
        return n(i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0420q0(this);
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final void l(int i, byte[] bArr, int i5, int i6) {
        int i7 = i + i6;
        AbstractC0409l abstractC0409l = this.f6583e;
        int i8 = this.f6585k;
        if (i7 <= i8) {
            abstractC0409l.l(i, bArr, i5, i6);
            return;
        }
        AbstractC0409l abstractC0409l2 = this.f6584f;
        if (i >= i8) {
            abstractC0409l2.l(i - i8, bArr, i5, i6);
            return;
        }
        int i9 = i8 - i;
        abstractC0409l.l(i, bArr, i5, i9);
        abstractC0409l2.l(0, bArr, i5 + i9, i6 - i9);
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final int m() {
        return this.f6586l;
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final byte n(int i) {
        int i5 = this.f6585k;
        return i < i5 ? this.f6583e.n(i) : this.f6584f.n(i - i5);
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final boolean o() {
        return this.f6582d >= x(this.f6586l);
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final boolean p() {
        int iS = this.f6583e.s(0, 0, this.f6585k);
        AbstractC0409l abstractC0409l = this.f6584f;
        return abstractC0409l.s(iS, 0, abstractC0409l.size()) == 0;
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final AbstractC0417p q() {
        C0407k c0407k;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f6586l);
        arrayDeque.push(this);
        AbstractC0409l abstractC0409l = this.f6583e;
        while (abstractC0409l instanceof C0423s0) {
            C0423s0 c0423s0 = (C0423s0) abstractC0409l;
            arrayDeque.push(c0423s0);
            abstractC0409l = c0423s0.f6583e;
        }
        C0407k c0407k2 = (C0407k) abstractC0409l;
        while (true) {
            if (!(c0407k2 != null)) {
                Iterator it = arrayList.iterator();
                int i = 0;
                int iRemaining = 0;
                while (it.hasNext()) {
                    ByteBuffer byteBuffer = (ByteBuffer) it.next();
                    iRemaining += byteBuffer.remaining();
                    i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
                }
                if (i == 2) {
                    return new C0413n(iRemaining, arrayList);
                }
                O o5 = new O();
                o5.f6438a = arrayList.iterator();
                o5.f6440c = 0;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    o5.f6440c++;
                }
                o5.f6441d = -1;
                if (!o5.a()) {
                    o5.f6439b = L.f6427c;
                    o5.f6441d = 0;
                    o5.f6442e = 0;
                    o5.f6446m = 0L;
                }
                return new C0415o(o5);
            }
            if (c0407k2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    c0407k = null;
                    break;
                }
                AbstractC0409l abstractC0409l2 = ((C0423s0) arrayDeque.pop()).f6584f;
                while (abstractC0409l2 instanceof C0423s0) {
                    C0423s0 c0423s02 = (C0423s0) abstractC0409l2;
                    arrayDeque.push(c0423s02);
                    abstractC0409l2 = c0423s02.f6583e;
                }
                c0407k = (C0407k) abstractC0409l2;
                if (!c0407k.isEmpty()) {
                    break;
                }
            }
            arrayList.add(c0407k2.f());
            c0407k2 = c0407k;
        }
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final int r(int i, int i5, int i6) {
        int i7 = i5 + i6;
        AbstractC0409l abstractC0409l = this.f6583e;
        int i8 = this.f6585k;
        if (i7 <= i8) {
            return abstractC0409l.r(i, i5, i6);
        }
        AbstractC0409l abstractC0409l2 = this.f6584f;
        if (i5 >= i8) {
            return abstractC0409l2.r(i, i5 - i8, i6);
        }
        int i9 = i8 - i5;
        return abstractC0409l2.r(abstractC0409l.r(i, i5, i9), 0, i6 - i9);
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final int s(int i, int i5, int i6) {
        int i7 = i5 + i6;
        AbstractC0409l abstractC0409l = this.f6583e;
        int i8 = this.f6585k;
        if (i7 <= i8) {
            return abstractC0409l.s(i, i5, i6);
        }
        AbstractC0409l abstractC0409l2 = this.f6584f;
        if (i5 >= i8) {
            return abstractC0409l2.s(i, i5 - i8, i6);
        }
        int i9 = i8 - i5;
        return abstractC0409l2.s(abstractC0409l.s(i, i5, i9), 0, i6 - i9);
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final int size() {
        return this.f6582d;
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final AbstractC0409l t(int i, int i5) {
        int i6 = this.f6582d;
        int iJ = AbstractC0409l.j(i, i5, i6);
        if (iJ == 0) {
            return AbstractC0409l.f6528b;
        }
        if (iJ == i6) {
            return this;
        }
        AbstractC0409l abstractC0409l = this.f6583e;
        int i7 = this.f6585k;
        if (i5 <= i7) {
            return abstractC0409l.t(i, i5);
        }
        AbstractC0409l abstractC0409l2 = this.f6584f;
        return i >= i7 ? abstractC0409l2.t(i - i7, i5 - i7) : new C0423s0(abstractC0409l.t(i, abstractC0409l.size()), abstractC0409l2.t(0, i5 - i7));
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final String v() {
        return new String(u(), L.f6425a);
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final void w(AbstractC0422s abstractC0422s) {
        this.f6583e.w(abstractC0422s);
        this.f6584f.w(abstractC0422s);
    }
}
