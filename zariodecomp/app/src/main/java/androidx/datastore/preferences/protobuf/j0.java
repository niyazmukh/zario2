package androidx.datastore.preferences.protobuf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\j0.smali */
public final class j0 extends r1.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4517d;

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String s(byte[] r10, int r11, int r12) throws androidx.datastore.preferences.protobuf.C0222z {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.j0.s(byte[], int, int):java.lang.String");
    }

    public final int t(String str, byte[] bArr, int i, int i5) {
        int i6;
        int i7;
        char cCharAt;
        long j5;
        String str2;
        String str3;
        int i8;
        long j6;
        long j7;
        char cCharAt2;
        switch (this.f4517d) {
            case 0:
                int length = str.length();
                int i9 = i5 + i;
                int i10 = 0;
                while (i10 < length && (i7 = i10 + i) < i9 && (cCharAt = str.charAt(i10)) < 128) {
                    bArr[i7] = (byte) cCharAt;
                    i10++;
                }
                if (i10 == length) {
                    return i + length;
                }
                int i11 = i + i10;
                while (i10 < length) {
                    char cCharAt3 = str.charAt(i10);
                    if (cCharAt3 < 128 && i11 < i9) {
                        bArr[i11] = (byte) cCharAt3;
                        i11++;
                    } else if (cCharAt3 < 2048 && i11 <= i9 - 2) {
                        int i12 = i11 + 1;
                        bArr[i11] = (byte) ((cCharAt3 >>> 6) | 960);
                        i11 += 2;
                        bArr[i12] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i11 > i9 - 3) {
                            if (i11 > i9 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i6 = i10 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i6)))) {
                                    throw new k0(i10, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i11);
                            }
                            int i13 = i10 + 1;
                            if (i13 != str.length()) {
                                char cCharAt4 = str.charAt(i13);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i11] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i11 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i14 = i11 + 3;
                                    bArr[i11 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i11 += 4;
                                    bArr[i14] = (byte) ((codePoint & 63) | 128);
                                    i10 = i13;
                                } else {
                                    i10 = i13;
                                }
                            }
                            throw new k0(i10 - 1, length);
                        }
                        bArr[i11] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i15 = i11 + 2;
                        bArr[i11 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i11 += 3;
                        bArr[i15] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i10++;
                }
                return i11;
            default:
                long j8 = i;
                long j9 = i5 + j8;
                int length2 = str.length();
                String str4 = " at index ";
                String str5 = "Failed writing ";
                if (length2 > i5 || bArr.length - i5 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i5));
                }
                int i16 = 0;
                while (true) {
                    j5 = 1;
                    if (i16 < length2 && (cCharAt2 = str.charAt(i16)) < 128) {
                        i0.j(bArr, j8, (byte) cCharAt2);
                        i16++;
                        j8 = 1 + j8;
                    }
                }
                if (i16 != length2) {
                    while (i16 < length2) {
                        char cCharAt5 = str.charAt(i16);
                        if (cCharAt5 >= 128 || j8 >= j9) {
                            if (cCharAt5 >= 2048 || j8 > j9 - 2) {
                                str2 = str4;
                                str3 = str5;
                                if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j8 > j9 - 3) {
                                    if (j8 > j9 - 4) {
                                        if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i8 = i16 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i8)))) {
                                            throw new k0(i16, length2);
                                        }
                                        throw new ArrayIndexOutOfBoundsException(str3 + cCharAt5 + str2 + j8);
                                    }
                                    int i17 = i16 + 1;
                                    if (i17 != length2) {
                                        char cCharAt6 = str.charAt(i17);
                                        if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                            int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                            j6 = 1;
                                            i0.j(bArr, j8, (byte) ((codePoint2 >>> 18) | 240));
                                            j7 = j9;
                                            i0.j(bArr, j8 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                            long j10 = j8 + 3;
                                            i0.j(bArr, j8 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                            j8 += 4;
                                            i0.j(bArr, j10, (byte) ((codePoint2 & 63) | 128));
                                            i16 = i17;
                                        } else {
                                            i16 = i17;
                                        }
                                    }
                                    throw new k0(i16 - 1, length2);
                                }
                                i0.j(bArr, j8, (byte) ((cCharAt5 >>> '\f') | 480));
                                long j11 = j8 + 2;
                                i0.j(bArr, j8 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                                j8 += 3;
                                i0.j(bArr, j11, (byte) ((cCharAt5 & '?') | 128));
                            } else {
                                str2 = str4;
                                str3 = str5;
                                long j12 = j8 + j5;
                                i0.j(bArr, j8, (byte) ((cCharAt5 >>> 6) | 960));
                                j8 += 2;
                                i0.j(bArr, j12, (byte) ((cCharAt5 & '?') | 128));
                            }
                            j7 = j9;
                            j6 = 1;
                        } else {
                            i0.j(bArr, j8, (byte) cCharAt5);
                            j7 = j9;
                            str2 = str4;
                            j6 = j5;
                            j8 += j5;
                            str3 = str5;
                        }
                        i16++;
                        str4 = str2;
                        str5 = str3;
                        j5 = j6;
                        j9 = j7;
                    }
                }
                return (int) j8;
        }
    }
}
