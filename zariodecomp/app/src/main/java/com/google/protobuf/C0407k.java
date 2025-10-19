package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\k.1.smali */
public class C0407k extends AbstractC0409l {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f6523d;

    public C0407k(byte[] bArr) {
        bArr.getClass();
        this.f6523d = bArr;
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0409l) || size() != ((AbstractC0409l) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0407k)) {
            return obj.equals(this);
        }
        C0407k c0407k = (C0407k) obj;
        int i = this.f6530a;
        int i5 = c0407k.f6530a;
        if (i == 0 || i5 == 0 || i == i5) {
            return x(c0407k, 0, size());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final ByteBuffer f() {
        return ByteBuffer.wrap(this.f6523d, y(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC0409l
    public byte h(int i) {
        return this.f6523d[i];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0399g(this);
    }

    @Override // com.google.protobuf.AbstractC0409l
    public void l(int i, byte[] bArr, int i5, int i6) {
        System.arraycopy(this.f6523d, i, bArr, i5, i6);
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final int m() {
        return 0;
    }

    @Override // com.google.protobuf.AbstractC0409l
    public byte n(int i) {
        return this.f6523d[i];
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final boolean o() {
        return true;
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final boolean p() {
        int iY = y();
        return P0.f6458a.U(0, this.f6523d, iY, size() + iY) == 0;
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final AbstractC0417p q() {
        return AbstractC0417p.m(this.f6523d, y(), size(), true);
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final int r(int i, int i5, int i6) {
        int iY = y() + i5;
        Charset charset = L.f6425a;
        for (int i7 = iY; i7 < iY + i6; i7++) {
            i = (i * 31) + this.f6523d[i7];
        }
        return i;
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final int s(int i, int i5, int i6) {
        int iY = y() + i5;
        return P0.f6458a.U(i, this.f6523d, iY, i6 + iY);
    }

    @Override // com.google.protobuf.AbstractC0409l
    public int size() {
        return this.f6523d.length;
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final AbstractC0409l t(int i, int i5) {
        int iJ = AbstractC0409l.j(i, i5, size());
        if (iJ == 0) {
            return AbstractC0409l.f6528b;
        }
        return new C0405j(this.f6523d, y() + i, iJ);
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final String v() {
        Charset charset = L.f6425a;
        return new String(this.f6523d, y(), size(), charset);
    }

    @Override // com.google.protobuf.AbstractC0409l
    public final void w(AbstractC0422s abstractC0422s) {
        abstractC0422s.W(this.f6523d, y(), size());
    }

    public final boolean x(C0407k c0407k, int i, int i5) {
        if (i5 > c0407k.size()) {
            throw new IllegalArgumentException("Length too large: " + i5 + size());
        }
        int i6 = i + i5;
        if (i6 > c0407k.size()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i5 + ", " + c0407k.size());
        }
        if (!(c0407k instanceof C0407k)) {
            return c0407k.t(i, i6).equals(t(0, i5));
        }
        int iY = y() + i5;
        int iY2 = y();
        int iY3 = c0407k.y() + i;
        while (iY2 < iY) {
            if (this.f6523d[iY2] != c0407k.f6523d[iY3]) {
                return false;
            }
            iY2++;
            iY3++;
        }
        return true;
    }

    public int y() {
        return 0;
    }
}
