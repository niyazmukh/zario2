package i2;

import a.AbstractC0183a;
import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i2.1\a.smali */
public final class C0598a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7829a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f7830b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7831c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7832d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7833e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7834f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f7835g;
    public final boolean[] h;

    public C0598a(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        while (true) {
            if (i >= cArr.length) {
                this.f7829a = str;
                this.f7830b = cArr;
                try {
                    int iC = p1.b.C(cArr.length, RoundingMode.UNNECESSARY);
                    this.f7832d = iC;
                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iC);
                    int i5 = 1 << (3 - iNumberOfTrailingZeros);
                    this.f7833e = i5;
                    this.f7834f = iC >> iNumberOfTrailingZeros;
                    this.f7831c = cArr.length - 1;
                    this.f7835g = bArr;
                    boolean[] zArr = new boolean[i5];
                    for (int i6 = 0; i6 < this.f7834f; i6++) {
                        zArr[p1.b.o(i6 * 8, this.f7832d, RoundingMode.CEILING)] = true;
                    }
                    this.h = zArr;
                    return;
                } catch (ArithmeticException e5) {
                    throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e5);
                }
            }
            char c5 = cArr[i];
            if (!(c5 < 128)) {
                throw new IllegalArgumentException(AbstractC0183a.U("Non-ASCII character: %s", Character.valueOf(c5)));
            }
            if (!(bArr[c5] == -1)) {
                throw new IllegalArgumentException(AbstractC0183a.U("Duplicate character: %s", Character.valueOf(c5)));
            }
            bArr[c5] = (byte) i;
            i++;
        }
    }

    public final int a(char c5) throws d {
        if (c5 > 127) {
            throw new d("Unrecognized character: 0x" + Integer.toHexString(c5));
        }
        byte b5 = this.f7835g[c5];
        if (b5 != -1) {
            return b5;
        }
        if (c5 <= ' ' || c5 == 127) {
            throw new d("Unrecognized character: 0x" + Integer.toHexString(c5));
        }
        throw new d("Unrecognized character: " + c5);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0598a)) {
            return false;
        }
        C0598a c0598a = (C0598a) obj;
        c0598a.getClass();
        return Arrays.equals(this.f7830b, c0598a.f7830b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7830b) + 1237;
    }

    public final String toString() {
        return this.f7829a;
    }
}
