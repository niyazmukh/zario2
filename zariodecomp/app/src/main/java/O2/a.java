package O2;

import N2.j0;
import N2.n0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import t.h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\O2\a.smali */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final StringReader f2640a;

    /* renamed from: l, reason: collision with root package name */
    public long f2647l;

    /* renamed from: m, reason: collision with root package name */
    public int f2648m;

    /* renamed from: n, reason: collision with root package name */
    public String f2649n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f2650o;

    /* renamed from: q, reason: collision with root package name */
    public String[] f2652q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f2653r;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f2641b = new char[1024];

    /* renamed from: c, reason: collision with root package name */
    public int f2642c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2643d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2644e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f2645f = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f2646k = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f2651p = 1;

    public a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f2650o = iArr;
        iArr[0] = 6;
        this.f2652q = new String[32];
        this.f2653r = new int[32];
        this.f2640a = stringReader;
    }

    public final void a() throws b {
        u("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f2646k = 0;
        this.f2650o[0] = 8;
        this.f2651p = 1;
        this.f2640a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ae, code lost:
    
        if (n(r10) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01b0, code lost:
    
        if (r12 != 2) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b2, code lost:
    
        if (r13 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01b8, code lost:
    
        if (r14 != Long.MIN_VALUE) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01ba, code lost:
    
        if (r16 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01be, code lost:
    
        if (r14 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01c0, code lost:
    
        if (r16 != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01c2, code lost:
    
        if (r16 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01c5, code lost:
    
        r14 = -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01c6, code lost:
    
        r20.f2647l = r14;
        r20.f2642c += r5;
        r9 = 15;
        r20.f2646k = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01d2, code lost:
    
        if (r12 == 2) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01d5, code lost:
    
        if (r12 == 4) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01d8, code lost:
    
        if (r12 != 7) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01da, code lost:
    
        r20.f2648m = r5;
        r9 = 16;
        r20.f2646k = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0215 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.a.e():int");
    }

    public final boolean k(int i) throws IOException {
        int i5;
        int i6;
        int i7 = this.f2645f;
        int i8 = this.f2642c;
        this.f2645f = i7 - i8;
        int i9 = this.f2643d;
        char[] cArr = this.f2641b;
        if (i9 != i8) {
            int i10 = i9 - i8;
            this.f2643d = i10;
            System.arraycopy(cArr, i8, cArr, 0, i10);
        } else {
            this.f2643d = 0;
        }
        this.f2642c = 0;
        do {
            int i11 = this.f2643d;
            int i12 = this.f2640a.read(cArr, i11, cArr.length - i11);
            if (i12 == -1) {
                return false;
            }
            i5 = this.f2643d + i12;
            this.f2643d = i5;
            if (this.f2644e == 0 && (i6 = this.f2645f) == 0 && i5 > 0 && cArr[0] == 65279) {
                this.f2642c++;
                this.f2645f = i6 + 1;
                i++;
            }
        } while (i5 < i);
        return true;
    }

    public final String l() {
        StringBuilder sb = new StringBuilder("$");
        for (int i = 0; i < this.f2651p; i++) {
            int i5 = this.f2650o[i];
            if (i5 == 1 || i5 == 2) {
                int i6 = this.f2653r[i];
                sb.append('[');
                sb.append(i6);
                sb.append(']');
            } else if (i5 == 3 || i5 == 4 || i5 == 5) {
                sb.append('.');
                String str = this.f2652q[i];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public final boolean m() throws IOException {
        int iE = this.f2646k;
        if (iE == 0) {
            iE = e();
        }
        return (iE == 2 || iE == 4 || iE == 17) ? false : true;
    }

    public final boolean n(char c5) throws b {
        if (c5 == '\t' || c5 == '\n' || c5 == '\f' || c5 == '\r' || c5 == ' ') {
            return false;
        }
        if (c5 != '#') {
            if (c5 == ',') {
                return false;
            }
            if (c5 != '/' && c5 != '=') {
                if (c5 == '{' || c5 == '}' || c5 == ':') {
                    return false;
                }
                if (c5 != ';') {
                    switch (c5) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        a();
        throw null;
    }

    public final String o() {
        return " at line " + (this.f2644e + 1) + " column " + ((this.f2642c - this.f2645f) + 1) + " path " + l();
    }

    public final int p(boolean z4) throws IOException {
        int i = this.f2642c;
        int i5 = this.f2643d;
        while (true) {
            if (i == i5) {
                this.f2642c = i;
                if (!k(1)) {
                    if (!z4) {
                        return -1;
                    }
                    throw new EOFException("End of input" + o());
                }
                i = this.f2642c;
                i5 = this.f2643d;
            }
            int i6 = i + 1;
            char c5 = this.f2641b[i];
            if (c5 == '\n') {
                this.f2644e++;
                this.f2645f = i6;
            } else if (c5 != ' ' && c5 != '\r' && c5 != '\t') {
                if (c5 != '/') {
                    if (c5 != '#') {
                        this.f2642c = i6;
                        return c5;
                    }
                    this.f2642c = i6;
                    a();
                    throw null;
                }
                this.f2642c = i6;
                if (i6 == i5) {
                    this.f2642c = i;
                    boolean zK = k(2);
                    this.f2642c++;
                    if (!zK) {
                        return c5;
                    }
                }
                a();
                throw null;
            }
            i = i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00fe, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        r11.f2642c = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r1.append(r5, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r11.f2642c != r11.f2643d) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (k(1) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        u("Unterminated escape sequence");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r2 = r11.f2642c;
        r3 = r2 + 1;
        r11.f2642c = r3;
        r7 = r5[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r7 == '\n') goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r7 == '\"') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r7 == '\'') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        if (r7 == '/') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r7 == '\\') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        if (r7 == 'b') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if (r7 == 'f') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r7 == 'n') goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        if (r7 == 'r') goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        if (r7 == 't') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
    
        if (r7 != 'u') goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008c, code lost:
    
        if ((r2 + 5) <= r11.f2643d) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0092, code lost:
    
        if (k(4) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        u("Unterminated escape sequence");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0098, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        r2 = r11.f2642c;
        r4 = r2 + 4;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009f, code lost:
    
        if (r2 >= r4) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a1, code lost:
    
        r6 = r5[r2];
        r8 = (char) (r9 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
    
        if (r6 < '0') goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ac, code lost:
    
        if (r6 > '9') goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
    
        r6 = r6 - '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
    
        r9 = (char) (r6 + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b6, code lost:
    
        if (r6 < 'a') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b8, code lost:
    
        if (r6 > 'f') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ba, code lost:
    
        r6 = r6 - 'W';
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bf, code lost:
    
        if (r6 < 'A') goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c3, code lost:
    
        if (r6 > 'F') goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c5, code lost:
    
        r6 = r6 - '7';
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c8, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00de, code lost:
    
        r11.f2642c += 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e4, code lost:
    
        u("Invalid escape sequence");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ea, code lost:
    
        r9 = '\t';
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ed, code lost:
    
        r9 = '\r';
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f0, code lost:
    
        r9 = '\f';
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f3, code lost:
    
        r9 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f6, code lost:
    
        r11.f2644e++;
        r11.f2645f = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fd, code lost:
    
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0113, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0115, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0123, code lost:
    
        r1.append(r5, r3, r2 - r3);
        r11.f2642c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String q(char r12) throws O2.b {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.a.q(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004b, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String r() throws O2.b {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r3 = r0
        L3:
            r2 = r1
        L4:
            int r4 = r8.f2642c
            int r5 = r4 + r2
            int r6 = r8.f2643d
            char[] r7 = r8.f2641b
            if (r5 >= r6) goto L4f
            int r4 = r4 + r2
            char r4 = r7[r4]
            r5 = 9
            if (r4 == r5) goto L5b
            r5 = 10
            if (r4 == r5) goto L5b
            r5 = 12
            if (r4 == r5) goto L5b
            r5 = 13
            if (r4 == r5) goto L5b
            r5 = 32
            if (r4 == r5) goto L5b
            r5 = 35
            if (r4 == r5) goto L4b
            r5 = 44
            if (r4 == r5) goto L5b
            r5 = 47
            if (r4 == r5) goto L4b
            r5 = 61
            if (r4 == r5) goto L4b
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L5b
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L5b
            r5 = 58
            if (r4 == r5) goto L5b
            r5 = 59
            if (r4 == r5) goto L4b
            switch(r4) {
                case 91: goto L5b;
                case 92: goto L4b;
                case 93: goto L5b;
                default: goto L48;
            }
        L48:
            int r2 = r2 + 1
            goto L4
        L4b:
            r8.a()
            throw r0
        L4f:
            int r4 = r7.length
            if (r2 >= r4) goto L5d
            int r4 = r2 + 1
            boolean r4 = r8.k(r4)
            if (r4 == 0) goto L5b
            goto L4
        L5b:
            r1 = r2
            goto L7b
        L5d:
            if (r3 != 0) goto L6a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 16
            int r4 = java.lang.Math.max(r2, r4)
            r3.<init>(r4)
        L6a:
            int r4 = r8.f2642c
            r3.append(r7, r4, r2)
            int r4 = r8.f2642c
            int r4 = r4 + r2
            r8.f2642c = r4
            r2 = 1
            boolean r2 = r8.k(r2)
            if (r2 != 0) goto L3
        L7b:
            if (r3 != 0) goto L85
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f2642c
            r0.<init>(r7, r2, r1)
            goto L8e
        L85:
            int r0 = r8.f2642c
            r3.append(r7, r0, r1)
            java.lang.String r0 = r3.toString()
        L8e:
            int r2 = r8.f2642c
            int r2 = r2 + r1
            r8.f2642c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.a.r():java.lang.String");
    }

    public final int s() throws IOException {
        int iE = this.f2646k;
        if (iE == 0) {
            iE = e();
        }
        switch (iE) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
            case 11:
                return 6;
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void t(int i) {
        int i5 = this.f2651p;
        int[] iArr = this.f2650o;
        if (i5 == iArr.length) {
            int i6 = i5 * 2;
            this.f2650o = Arrays.copyOf(iArr, i6);
            this.f2653r = Arrays.copyOf(this.f2653r, i6);
            this.f2652q = (String[]) Arrays.copyOf(this.f2652q, i6);
        }
        int[] iArr2 = this.f2650o;
        int i7 = this.f2651p;
        this.f2651p = i7 + 1;
        iArr2[i7] = i;
    }

    public final String toString() {
        return a.class.getSimpleName() + o();
    }

    public final void u(String str) throws b {
        StringBuilder sbB = h.b(str);
        sbB.append(o());
        throw new b(sbB.toString());
    }
}
