package i2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i2.1\c.smali */
public final class c extends e {
    public c(String str, String str2) {
        this(new C0598a(str, str2.toCharArray()), (Character) '=');
    }

    @Override // i2.e
    public final int b(byte[] bArr, CharSequence charSequence) throws d {
        CharSequence charSequenceF = f(charSequence);
        int length = charSequenceF.length();
        C0598a c0598a = this.f7838a;
        if (!c0598a.h[length % c0598a.f7833e]) {
            throw new d("Invalid input length " + charSequenceF.length());
        }
        int i = 0;
        int i5 = 0;
        while (i < charSequenceF.length()) {
            int i6 = i + 2;
            int iA = (c0598a.a(charSequenceF.charAt(i + 1)) << 12) | (c0598a.a(charSequenceF.charAt(i)) << 18);
            int i7 = i5 + 1;
            bArr[i5] = (byte) (iA >>> 16);
            if (i6 < charSequenceF.length()) {
                int i8 = i + 3;
                int iA2 = iA | (c0598a.a(charSequenceF.charAt(i6)) << 6);
                int i9 = i5 + 2;
                bArr[i7] = (byte) ((iA2 >>> 8) & 255);
                if (i8 < charSequenceF.length()) {
                    i += 4;
                    i5 += 3;
                    bArr[i9] = (byte) ((iA2 | c0598a.a(charSequenceF.charAt(i8))) & 255);
                } else {
                    i5 = i9;
                    i = i8;
                }
            } else {
                i5 = i7;
                i = i6;
            }
        }
        return i5;
    }

    @Override // i2.e
    public final void e(StringBuilder sb, byte[] bArr, int i) {
        int i5 = 0;
        S0.f.n(0, i, bArr.length);
        for (int i6 = i; i6 >= 3; i6 -= 3) {
            int i7 = i5 + 2;
            int i8 = ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5] & 255) << 16);
            i5 += 3;
            int i9 = i8 | (bArr[i7] & 255);
            C0598a c0598a = this.f7838a;
            sb.append(c0598a.f7830b[i9 >>> 18]);
            char[] cArr = c0598a.f7830b;
            sb.append(cArr[(i9 >>> 12) & 63]);
            sb.append(cArr[(i9 >>> 6) & 63]);
            sb.append(cArr[i9 & 63]);
        }
        if (i5 < i) {
            d(sb, bArr, i5, i - i5);
        }
    }

    public c(C0598a c0598a, Character ch) {
        super(c0598a, ch);
        S0.f.h(c0598a.f7830b.length == 64);
    }
}
