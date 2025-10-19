package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\N0.smali */
public final class N0 extends y0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6437c;

    public /* synthetic */ N0(int i) {
        this.f6437c = i;
    }

    public static int X(byte[] bArr, int i, long j5, int i5) {
        if (i5 == 0) {
            y0 y0Var = P0.f6458a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i5 == 1) {
            return P0.d(i, M0.g(bArr, j5));
        }
        if (i5 == 2) {
            return P0.e(i, M0.g(bArr, j5), M0.g(bArr, j5 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // com.google.protobuf.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String H(byte[] r9, int r10, int r11) throws com.google.protobuf.N {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N0.H(byte[], int, int):java.lang.String");
    }

    @Override // com.google.protobuf.y0
    public final String J(ByteBuffer byteBuffer, int i, int i5) throws N {
        long j5;
        switch (this.f6437c) {
            case 0:
                return y0.I(byteBuffer, i, i5);
            default:
                if ((i | i5 | ((byteBuffer.limit() - i) - i5)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i5)));
                }
                long j6 = M0.f6430b.j(byteBuffer, M0.f6434f) + i;
                long j7 = i5 + j6;
                char[] cArr = new char[i5];
                int i6 = 0;
                while (true) {
                    j5 = 1;
                    if (j6 < j7) {
                        byte bE = M0.f6430b.e(j6);
                        if (y0.b(bE)) {
                            j6++;
                            cArr[i6] = (char) bE;
                            i6++;
                        }
                    }
                }
                int i7 = i6;
                while (j6 < j7) {
                    long j8 = j6 + j5;
                    L0 l02 = M0.f6430b;
                    byte bE2 = l02.e(j6);
                    if (y0.b(bE2)) {
                        int i8 = i7 + 1;
                        cArr[i7] = (char) bE2;
                        while (j8 < j7) {
                            byte bE3 = M0.f6430b.e(j8);
                            if (y0.b(bE3)) {
                                j8 += j5;
                                cArr[i8] = (char) bE3;
                                i8++;
                            } else {
                                i7 = i8;
                                j6 = j8;
                            }
                        }
                        i7 = i8;
                        j6 = j8;
                    } else {
                        if (!(bE2 < -32)) {
                            if (bE2 < -16) {
                                if (j8 >= j7 - j5) {
                                    throw N.c();
                                }
                                long j9 = j6 + 2;
                                j6 += 3;
                                y0.d(bE2, l02.e(j8), l02.e(j9), cArr, i7);
                                i7++;
                            } else {
                                if (j8 >= j7 - 2) {
                                    throw N.c();
                                }
                                byte bE4 = l02.e(j8);
                                long j10 = j6 + 3;
                                byte bE5 = l02.e(j6 + 2);
                                j6 += 4;
                                y0.a(bE2, bE4, bE5, l02.e(j10), cArr, i7);
                                i7 += 2;
                            }
                        } else {
                            if (j8 >= j7) {
                                throw N.c();
                            }
                            j6 += 2;
                            y0.c(bE2, l02.e(j8), cArr, i7);
                            i7++;
                        }
                    }
                    j5 = 1;
                }
                return new String(cArr, 0, i7);
        }
    }

    @Override // com.google.protobuf.y0
    public final int P(String str, byte[] bArr, int i, int i5) {
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
        switch (this.f6437c) {
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
                                    throw new O0(i10, length);
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
                            throw new O0(i10 - 1, length);
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
                        M0.l(bArr, j8, (byte) cCharAt2);
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
                                            throw new O0(i16, length2);
                                        }
                                        throw new ArrayIndexOutOfBoundsException(str3 + cCharAt5 + str2 + j8);
                                    }
                                    int i17 = i16 + 1;
                                    if (i17 != length2) {
                                        char cCharAt6 = str.charAt(i17);
                                        if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                            int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                            j6 = 1;
                                            M0.l(bArr, j8, (byte) ((codePoint2 >>> 18) | 240));
                                            j7 = j9;
                                            M0.l(bArr, j8 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                            long j10 = j8 + 3;
                                            M0.l(bArr, j8 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                            j8 += 4;
                                            M0.l(bArr, j10, (byte) ((codePoint2 & 63) | 128));
                                            i16 = i17;
                                        } else {
                                            i16 = i17;
                                        }
                                    }
                                    throw new O0(i16 - 1, length2);
                                }
                                M0.l(bArr, j8, (byte) ((cCharAt5 >>> '\f') | 480));
                                long j11 = j8 + 2;
                                M0.l(bArr, j8 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                                j8 += 3;
                                M0.l(bArr, j11, (byte) ((cCharAt5 & '?') | 128));
                            } else {
                                str2 = str4;
                                str3 = str5;
                                long j12 = j8 + j5;
                                M0.l(bArr, j8, (byte) ((cCharAt5 >>> 6) | 960));
                                j8 += 2;
                                M0.l(bArr, j12, (byte) ((cCharAt5 & '?') | 128));
                            }
                            j7 = j9;
                            j6 = 1;
                        } else {
                            M0.l(bArr, j8, (byte) cCharAt5);
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

    /* JADX WARN: Code restructure failed: missing block: B:149:0x020e, code lost:
    
        if (r23[r0] > (-65)) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (com.google.protobuf.M0.g(r23, r2) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0251, code lost:
    
        if (r23[r0] > (-65)) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0279, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (com.google.protobuf.M0.g(r23, r2) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        if (com.google.protobuf.M0.g(r23, r2) > (-65)) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012a  */
    @Override // com.google.protobuf.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int U(int r22, byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N0.U(int, byte[], int, int):int");
    }
}
