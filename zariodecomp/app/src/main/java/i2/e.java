package i2;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i2.1\e.smali */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public static final c f7837c = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* renamed from: a, reason: collision with root package name */
    public final C0598a f7838a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f7839b;

    static {
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new b(new C0598a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(i2.C0598a r3, java.lang.Character r4) {
        /*
            r2 = this;
            r2.<init>()
            r3.getClass()
            r2.f7838a = r3
            if (r4 == 0) goto L1a
            char r0 = r4.charValue()
            byte[] r3 = r3.f7835g
            int r1 = r3.length
            if (r0 >= r1) goto L1a
            r3 = r3[r0]
            r0 = -1
            if (r3 == r0) goto L1a
            r3 = 0
            goto L1b
        L1a:
            r3 = 1
        L1b:
            java.lang.String r0 = "Padding character %s was already in alphabet"
            S0.f.e(r4, r0, r3)
            r2.f7839b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.e.<init>(i2.a, java.lang.Character):void");
    }

    public final byte[] a(String str) {
        try {
            int length = (int) (((this.f7838a.f7832d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int iB = b(bArr, f(str));
            if (iB == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (d e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) throws d {
        int i;
        int i5;
        CharSequence charSequenceF = f(charSequence);
        int length = charSequenceF.length();
        C0598a c0598a = this.f7838a;
        if (!c0598a.h[length % c0598a.f7833e]) {
            throw new d("Invalid input length " + charSequenceF.length());
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < charSequenceF.length()) {
            long jA = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                i = c0598a.f7832d;
                i5 = c0598a.f7833e;
                if (i8 >= i5) {
                    break;
                }
                jA <<= i;
                if (i6 + i8 < charSequenceF.length()) {
                    jA |= c0598a.a(charSequenceF.charAt(i9 + i6));
                    i9++;
                }
                i8++;
            }
            int i10 = c0598a.f7834f;
            int i11 = (i10 * 8) - (i9 * i);
            int i12 = (i10 - 1) * 8;
            while (i12 >= i11) {
                bArr[i7] = (byte) ((jA >>> i12) & 255);
                i12 -= 8;
                i7++;
            }
            i6 += i5;
        }
        return i7;
    }

    public final String c(byte[] bArr) {
        int length = bArr.length;
        S0.f.n(0, length, bArr.length);
        C0598a c0598a = this.f7838a;
        StringBuilder sb = new StringBuilder(p1.b.o(length, c0598a.f7834f, RoundingMode.CEILING) * c0598a.f7833e);
        try {
            e(sb, bArr, length);
            return sb.toString();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    public final void d(StringBuilder sb, byte[] bArr, int i, int i5) {
        S0.f.n(i, i + i5, bArr.length);
        C0598a c0598a = this.f7838a;
        int i6 = 0;
        S0.f.h(i5 <= c0598a.f7834f);
        long j5 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            j5 = (j5 | (bArr[i + i7] & 255)) << 8;
        }
        int i8 = c0598a.f7832d;
        int i9 = ((i5 + 1) * 8) - i8;
        while (i6 < i5 * 8) {
            sb.append(c0598a.f7830b[((int) (j5 >>> (i9 - i6))) & c0598a.f7831c]);
            i6 += i8;
        }
        Character ch = this.f7839b;
        if (ch != null) {
            while (i6 < c0598a.f7834f * 8) {
                sb.append(ch.charValue());
                i6 += i8;
            }
        }
    }

    public void e(StringBuilder sb, byte[] bArr, int i) {
        int i5 = 0;
        S0.f.n(0, i, bArr.length);
        while (i5 < i) {
            C0598a c0598a = this.f7838a;
            d(sb, bArr, i5, Math.min(c0598a.f7834f, i - i5));
            i5 += c0598a.f7834f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f7838a.equals(eVar.f7838a) && Objects.equals(this.f7839b, eVar.f7839b);
    }

    public final CharSequence f(CharSequence charSequence) {
        Character ch = this.f7839b;
        if (ch == null) {
            return charSequence;
        }
        char cCharValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == cCharValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f7839b) ^ this.f7838a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C0598a c0598a = this.f7838a;
        sb.append(c0598a);
        if (8 % c0598a.f7832d != 0) {
            Character ch = this.f7839b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public e(String str, String str2) {
        this(new C0598a(str, str2.toCharArray()), (Character) '=');
    }
}
