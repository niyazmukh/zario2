package D3;

import javax.security.auth.x500.X500Principal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D3\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f1349a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1350b;

    /* renamed from: c, reason: collision with root package name */
    public int f1351c;

    /* renamed from: d, reason: collision with root package name */
    public int f1352d;

    /* renamed from: e, reason: collision with root package name */
    public int f1353e;

    /* renamed from: f, reason: collision with root package name */
    public int f1354f;

    /* renamed from: g, reason: collision with root package name */
    public char[] f1355g;

    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f1349a = name;
        this.f1350b = name.length();
    }

    public final int a(int i) {
        int i5;
        int i6;
        int i7 = i + 1;
        int i8 = this.f1350b;
        String str = this.f1349a;
        if (i7 >= i8) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = this.f1355g;
        char c5 = cArr[i];
        if (c5 >= '0' && c5 <= '9') {
            i5 = c5 - '0';
        } else if (c5 >= 'a' && c5 <= 'f') {
            i5 = c5 - 'W';
        } else {
            if (c5 < 'A' || c5 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i5 = c5 - '7';
        }
        char c6 = cArr[i7];
        if (c6 >= '0' && c6 <= '9') {
            i6 = c6 - '0';
        } else if (c6 >= 'a' && c6 <= 'f') {
            i6 = c6 - 'W';
        } else {
            if (c6 < 'A' || c6 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i6 = c6 - '7';
        }
        return (i5 << 4) + i6;
    }

    public final char b() {
        int i;
        int i5 = this.f1351c + 1;
        this.f1351c = i5;
        int i6 = this.f1350b;
        if (i5 == i6) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f1349a);
        }
        char c5 = this.f1355g[i5];
        if (c5 != ' ' && c5 != '%' && c5 != '\\' && c5 != '_' && c5 != '\"' && c5 != '#') {
            switch (c5) {
                default:
                    switch (c5) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iA = a(i5);
                            this.f1351c++;
                            if (iA >= 128) {
                                if (iA >= 192 && iA <= 247) {
                                    if (iA <= 223) {
                                        iA &= 31;
                                        i = 1;
                                    } else if (iA <= 239) {
                                        iA &= 15;
                                        i = 2;
                                    } else {
                                        iA &= 7;
                                        i = 3;
                                    }
                                    for (int i7 = 0; i7 < i; i7++) {
                                        int i8 = this.f1351c;
                                        int i9 = i8 + 1;
                                        this.f1351c = i9;
                                        if (i9 != i6 && this.f1355g[i9] == '\\') {
                                            int i10 = i8 + 2;
                                            this.f1351c = i10;
                                            int iA2 = a(i10);
                                            this.f1351c++;
                                            if ((iA2 & 192) == 128) {
                                                iA = (iA << 6) + (iA2 & 63);
                                            }
                                        }
                                    }
                                }
                                return '?';
                            }
                            return (char) iA;
                    }
                case '*':
                case '+':
                case ',':
                    return c5;
            }
        }
        return c5;
    }

    public final String c() {
        int i;
        int i5;
        int i6;
        char c5;
        int i7;
        char c6;
        char c7;
        while (true) {
            i = this.f1351c;
            i5 = this.f1350b;
            if (i >= i5 || this.f1355g[i] != ' ') {
                break;
            }
            this.f1351c = i + 1;
        }
        if (i == i5) {
            return null;
        }
        this.f1352d = i;
        this.f1351c = i + 1;
        while (true) {
            i6 = this.f1351c;
            if (i6 >= i5 || (c7 = this.f1355g[i6]) == '=' || c7 == ' ') {
                break;
            }
            this.f1351c = i6 + 1;
        }
        String str = this.f1349a;
        if (i6 >= i5) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.f1353e = i6;
        if (this.f1355g[i6] == ' ') {
            while (true) {
                i7 = this.f1351c;
                if (i7 >= i5 || (c6 = this.f1355g[i7]) == '=' || c6 != ' ') {
                    break;
                }
                this.f1351c = i7 + 1;
            }
            if (this.f1355g[i7] != '=' || i7 == i5) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.f1351c++;
        while (true) {
            int i8 = this.f1351c;
            if (i8 >= i5 || this.f1355g[i8] != ' ') {
                break;
            }
            this.f1351c = i8 + 1;
        }
        int i9 = this.f1353e;
        int i10 = this.f1352d;
        if (i9 - i10 > 4) {
            char[] cArr = this.f1355g;
            if (cArr[i10 + 3] == '.' && (((c5 = cArr[i10]) == 'O' || c5 == 'o') && ((cArr[i10 + 1] == 'I' || cArr[i10 + 1] == 'i') && (cArr[i10 + 2] == 'D' || cArr[i10 + 2] == 'd')))) {
                this.f1352d = i10 + 4;
            }
        }
        char[] cArr2 = this.f1355g;
        int i11 = this.f1352d;
        return new String(cArr2, i11, i9 - i11);
    }
}
