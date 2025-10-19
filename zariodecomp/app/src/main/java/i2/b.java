package i2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i2.1\b.smali */
public final class b extends e {

    /* renamed from: d, reason: collision with root package name */
    public final char[] f7836d;

    public b(C0598a c0598a) {
        super(c0598a, (Character) null);
        this.f7836d = new char[512];
        char[] cArr = c0598a.f7830b;
        S0.f.h(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f7836d;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // i2.e
    public final int b(byte[] bArr, CharSequence charSequence) throws d {
        if (charSequence.length() % 2 == 1) {
            throw new d("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i5 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            C0598a c0598a = this.f7838a;
            bArr[i5] = (byte) ((c0598a.a(cCharAt) << 4) | c0598a.a(charSequence.charAt(i + 1)));
            i += 2;
            i5++;
        }
        return i5;
    }

    @Override // i2.e
    public final void e(StringBuilder sb, byte[] bArr, int i) {
        S0.f.n(0, i, bArr.length);
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = bArr[i5] & 255;
            char[] cArr = this.f7836d;
            sb.append(cArr[i6]);
            sb.append(cArr[i6 | 256]);
        }
    }
}
