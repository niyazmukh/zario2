package K;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K\a.smali */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2100e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2101a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2102b;

    /* renamed from: c, reason: collision with root package name */
    public int f2103c;

    /* renamed from: d, reason: collision with root package name */
    public char f2104d;

    static {
        for (int i = 0; i < 1792; i++) {
            f2100e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f2101a = charSequence;
        this.f2102b = charSequence.length();
    }

    public final byte a() {
        int i = this.f2103c - 1;
        CharSequence charSequence = this.f2101a;
        char cCharAt = charSequence.charAt(i);
        this.f2104d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f2103c);
            this.f2103c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f2103c--;
        char c5 = this.f2104d;
        return c5 < 1792 ? f2100e[c5] : Character.getDirectionality(c5);
    }
}
