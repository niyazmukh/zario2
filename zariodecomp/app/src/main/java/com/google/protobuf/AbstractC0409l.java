package com.google.protobuf;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\l.1.smali */
public abstract class AbstractC0409l implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final C0407k f6528b = new C0407k(L.f6426b);

    /* renamed from: c, reason: collision with root package name */
    public static final C0403i f6529c;

    /* renamed from: a, reason: collision with root package name */
    public int f6530a = 0;

    static {
        f6529c = AbstractC0392c.a() ? new C0403i(1) : new C0403i(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.protobuf.AbstractC0409l g(java.util.Iterator r8, int r9) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC0409l.g(java.util.Iterator, int):com.google.protobuf.l");
    }

    public static void i(int i, int i5) {
        if (((i5 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(B.a.h("Index > length: ", i, i5, ", "));
            }
            throw new ArrayIndexOutOfBoundsException(B.a.g(i, "Index < 0: "));
        }
    }

    public static int j(int i, int i5, int i6) {
        int i7 = i5 - i;
        if ((i | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(B.a.i("Beginning index: ", i, " < 0"));
        }
        if (i5 < i) {
            throw new IndexOutOfBoundsException(B.a.h("Beginning index larger than ending index: ", i, i5, ", "));
        }
        throw new IndexOutOfBoundsException(B.a.h("End index: ", i5, i6, " >= "));
    }

    public static C0407k k(byte[] bArr, int i, int i5) {
        byte[] bArrCopyOfRange;
        j(i, i + i5, bArr.length);
        switch (f6529c.f6518a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i5 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i5];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i5);
                break;
        }
        return new C0407k(bArrCopyOfRange);
    }

    public abstract boolean equals(Object obj);

    public abstract ByteBuffer f();

    public abstract byte h(int i);

    public final int hashCode() {
        int iR = this.f6530a;
        if (iR == 0) {
            int size = size();
            iR = r(size, 0, size);
            if (iR == 0) {
                iR = 1;
            }
            this.f6530a = iR;
        }
        return iR;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract void l(int i, byte[] bArr, int i5, int i6);

    public abstract int m();

    public abstract byte n(int i);

    public abstract boolean o();

    public abstract boolean p();

    public abstract AbstractC0417p q();

    public abstract int r(int i, int i5, int i6);

    public abstract int s(int i, int i5, int i6);

    public abstract int size();

    public abstract AbstractC0409l t(int i, int i5);

    public final String toString() {
        String strQ;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strQ = y0.Q(this);
        } else {
            strQ = y0.Q(t(0, 47)) + "...";
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return B.a.m(sb, strQ, "\">");
    }

    public final byte[] u() {
        int size = size();
        if (size == 0) {
            return L.f6426b;
        }
        byte[] bArr = new byte[size];
        l(0, bArr, 0, size);
        return bArr;
    }

    public abstract String v();

    public abstract void w(AbstractC0422s abstractC0422s);
}
