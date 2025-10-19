package E3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E3\g.smali */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f1562a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1563b = new String[64];

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f1564c = new String[256];

    static {
        int i = 0;
        int i5 = 0;
        while (true) {
            String[] strArr = f1564c;
            if (i5 >= strArr.length) {
                break;
            }
            strArr[i5] = String.format("%8s", Integer.toBinaryString(i5)).replace(' ', '0');
            i5++;
        }
        String[] strArr2 = f1563b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i6 = iArr[0];
        strArr2[i6 | 8] = B.a.m(new StringBuilder(), strArr2[i6], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i7 = 0; i7 < 3; i7++) {
            int i8 = iArr2[i7];
            int i9 = iArr[0];
            String[] strArr3 = f1563b;
            int i10 = i9 | i8;
            strArr3[i10] = strArr3[i9] + '|' + strArr3[i8];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i9]);
            sb.append('|');
            strArr3[i10 | 8] = B.a.m(sb, strArr3[i8], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f1563b;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = f1564c[i];
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(boolean r3, int r4, int r5, byte r6, byte r7) {
        /*
            r0 = 10
            if (r6 >= r0) goto L9
            java.lang.String[] r0 = E3.g.f1562a
            r0 = r0[r6]
            goto L17
        L9:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "0x%02x"
            java.lang.String r0 = java.lang.String.format(r1, r0)
        L17:
            if (r7 != 0) goto L1c
            java.lang.String r6 = ""
            goto L68
        L1c:
            java.lang.String[] r1 = E3.g.f1564c
            r2 = 2
            if (r6 == r2) goto L66
            r2 = 3
            if (r6 == r2) goto L66
            r2 = 4
            if (r6 == r2) goto L5d
            r2 = 6
            if (r6 == r2) goto L5d
            r2 = 7
            if (r6 == r2) goto L66
            r2 = 8
            if (r6 == r2) goto L66
            r2 = 64
            if (r7 >= r2) goto L3a
            java.lang.String[] r1 = E3.g.f1563b
            r1 = r1[r7]
            goto L3c
        L3a:
            r1 = r1[r7]
        L3c:
            r2 = 5
            if (r6 != r2) goto L4c
            r2 = r7 & 4
            if (r2 == 0) goto L4c
            java.lang.String r6 = "HEADERS"
            java.lang.String r7 = "PUSH_PROMISE"
            java.lang.String r6 = r1.replace(r6, r7)
            goto L68
        L4c:
            if (r6 != 0) goto L5b
            r6 = r7 & 32
            if (r6 == 0) goto L5b
            java.lang.String r6 = "PRIORITY"
            java.lang.String r7 = "COMPRESSED"
            java.lang.String r6 = r1.replace(r6, r7)
            goto L68
        L5b:
            r6 = r1
            goto L68
        L5d:
            r6 = 1
            if (r7 != r6) goto L63
            java.lang.String r6 = "ACK"
            goto L68
        L63:
            r6 = r1[r7]
            goto L68
        L66:
            r6 = r1[r7]
        L68:
            java.util.Locale r7 = java.util.Locale.US
            if (r3 == 0) goto L6f
            java.lang.String r3 = "<<"
            goto L71
        L6f:
            java.lang.String r3 = ">>"
        L71:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r0, r6}
            java.lang.String r4 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r3 = java.lang.String.format(r7, r4, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.g.a(boolean, int, int, byte, byte):java.lang.String");
    }
}
