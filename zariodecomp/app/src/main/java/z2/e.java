package z2;

import java.math.RoundingMode;
import java.util.Arrays;
import u0.o;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z2.1\e.smali */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[][] f11224c = {new byte[]{0, 0}, new byte[]{-128, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, -128}, new byte[]{-1, -64}};

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11225a;

    /* renamed from: b, reason: collision with root package name */
    public int f11226b;

    public final void a(int i) {
        int i5 = i + this.f11226b;
        byte[] bArr = this.f11225a;
        if (i5 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i5) {
            i5 = length;
        }
        this.f11225a = Arrays.copyOf(bArr, i5);
    }

    public final void b(byte b5) {
        if (b5 == 0) {
            d((byte) 0);
            d((byte) -1);
        } else if (b5 != -1) {
            d(b5);
        } else {
            d((byte) -1);
            d((byte) 0);
        }
    }

    public final void c(byte b5) {
        if (b5 == 0) {
            e((byte) 0);
            e((byte) -1);
        } else if (b5 != -1) {
            e(b5);
        } else {
            e((byte) -1);
            e((byte) 0);
        }
    }

    public final void d(byte b5) {
        a(1);
        byte[] bArr = this.f11225a;
        int i = this.f11226b;
        this.f11226b = i + 1;
        bArr[i] = b5;
    }

    public final void e(byte b5) {
        a(1);
        byte[] bArr = this.f11225a;
        int i = this.f11226b;
        this.f11226b = i + 1;
        bArr[i] = (byte) (~b5);
    }

    public final void f(long j5) {
        int i;
        long j6 = j5 < 0 ? ~j5 : j5;
        byte[][] bArr = f11224c;
        if (j6 < 64) {
            a(1);
            byte[] bArr2 = this.f11225a;
            int i5 = this.f11226b;
            this.f11226b = i5 + 1;
            bArr2[i5] = (byte) (bArr[1][0] ^ j5);
            return;
        }
        if (j6 < 0) {
            j6 = ~j6;
        }
        int iB = o.b(65 - Long.numberOfLeadingZeros(j6), 7, RoundingMode.UP);
        a(iB);
        if (iB < 2) {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(iB)));
        }
        byte b5 = j5 < 0 ? (byte) -1 : (byte) 0;
        int i6 = this.f11226b;
        if (iB == 10) {
            i = i6 + 2;
            byte[] bArr3 = this.f11225a;
            bArr3[i6] = b5;
            bArr3[i6 + 1] = b5;
        } else if (iB == 9) {
            i = i6 + 1;
            this.f11225a[i6] = b5;
        } else {
            i = i6;
        }
        for (int i7 = (iB - 1) + i6; i7 >= i; i7--) {
            this.f11225a[i7] = (byte) (255 & j5);
            j5 >>= 8;
        }
        byte[] bArr4 = this.f11225a;
        int i8 = this.f11226b;
        byte b6 = bArr4[i8];
        byte[] bArr5 = bArr[iB];
        bArr4[i8] = (byte) (b6 ^ bArr5[0]);
        int i9 = i8 + 1;
        bArr4[i9] = (byte) (bArr5[1] ^ bArr4[i9]);
        this.f11226b = i8 + iB;
    }
}
