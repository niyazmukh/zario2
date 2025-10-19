package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzpv.smali */
final class zzpv {
    static {
        if (zzps.zzx() && zzps.zzy()) {
            int i = zzks.zza;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i5) {
        int i6 = i5 - i;
        byte b5 = bArr[i - 1];
        if (i6 == 0) {
            if (b5 <= -12) {
                return b5;
            }
            return -1;
        }
        if (i6 == 1) {
            byte b6 = bArr[i];
            if (b5 > -12 || b6 > -65) {
                return -1;
            }
            return (b6 << 8) ^ b5;
        }
        if (i6 != 2) {
            throw new AssertionError();
        }
        byte b7 = bArr[i];
        byte b8 = bArr[i + 1];
        if (b5 > -12 || b7 > -65 || b8 > -65) {
            return -1;
        }
        return (b8 << 16) ^ ((b7 << 8) ^ b5);
    }

    public static int zzb(String str, byte[] bArr, int i, int i5) {
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int length = str.length();
        int i9 = 0;
        while (true) {
            i6 = i + i5;
            if (i9 >= length || (i8 = i9 + i) >= i6 || (cCharAt = str.charAt(i9)) >= 128) {
                break;
            }
            bArr[i8] = (byte) cCharAt;
            i9++;
        }
        if (i9 == length) {
            return i + length;
        }
        int i10 = i + i9;
        while (i9 < length) {
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 128 && i10 < i6) {
                bArr[i10] = (byte) cCharAt2;
                i10++;
            } else if (cCharAt2 < 2048 && i10 <= i6 - 2) {
                bArr[i10] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i10 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i10 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i10 > i6 - 3) {
                    if (i10 > i6 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i7 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i7)))) {
                            throw new zzpu(i9, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i10);
                    }
                    int i11 = i9 + 1;
                    if (i11 != str.length()) {
                        char cCharAt3 = str.charAt(i11);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i12 = i10 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i10 += 4;
                            bArr[i12] = (byte) ((codePoint & 63) | 128);
                            i9 = i11;
                        } else {
                            i9 = i11;
                        }
                    }
                    throw new zzpu(i9 - 1, length);
                }
                bArr[i10] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i10 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i10 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i10 += 3;
            }
            i9++;
        }
        return i10;
    }

    public static int zzc(String str) {
        int length = str.length();
        int i = 0;
        int i5 = 0;
        while (i5 < length && str.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char cCharAt = str.charAt(i5);
            if (cCharAt < 2048) {
                i6 += (127 - cCharAt) >>> 31;
                i5++;
            } else {
                int length2 = str.length();
                while (i5 < length2) {
                    char cCharAt2 = str.charAt(i5);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i5) < 65536) {
                                throw new zzpu(i5, length2);
                            }
                            i5++;
                        }
                    }
                    i5++;
                }
                i6 += i;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i6 + 4294967296L));
    }

    public static String zzd(byte[] bArr, int i, int i5) throws zznn {
        int i6;
        int length = bArr.length;
        if ((((length - i) - i5) | i | i5) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i5)));
        }
        int i7 = i + i5;
        char[] cArr = new char[i5];
        int i8 = 0;
        while (i < i7) {
            byte b5 = bArr[i];
            if (!zzpt.zzd(b5)) {
                break;
            }
            i++;
            cArr[i8] = (char) b5;
            i8++;
        }
        int i9 = i8;
        while (i < i7) {
            int i10 = i + 1;
            byte b6 = bArr[i];
            if (zzpt.zzd(b6)) {
                cArr[i9] = (char) b6;
                i9++;
                i = i10;
                while (i < i7) {
                    byte b7 = bArr[i];
                    if (zzpt.zzd(b7)) {
                        i++;
                        cArr[i9] = (char) b7;
                        i9++;
                    }
                }
            } else {
                if (b6 < -32) {
                    if (i10 >= i7) {
                        throw new zznn("Protocol message had invalid UTF-8.");
                    }
                    i6 = i9 + 1;
                    i += 2;
                    zzpt.zzc(b6, bArr[i10], cArr, i9);
                } else if (b6 < -16) {
                    if (i10 >= i7 - 1) {
                        throw new zznn("Protocol message had invalid UTF-8.");
                    }
                    i6 = i9 + 1;
                    int i11 = i + 2;
                    i += 3;
                    zzpt.zzb(b6, bArr[i10], bArr[i11], cArr, i9);
                } else {
                    if (i10 >= i7 - 2) {
                        throw new zznn("Protocol message had invalid UTF-8.");
                    }
                    byte b8 = bArr[i10];
                    int i12 = i + 3;
                    byte b9 = bArr[i + 2];
                    i += 4;
                    zzpt.zza(b6, b8, b9, bArr[i12], cArr, i9);
                    i9 += 2;
                }
                i9 = i6;
            }
        }
        return new String(cArr, 0, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zze(byte[] r6, int r7, int r8) {
        /*
        L0:
            if (r7 >= r8) goto L9
            r0 = r6[r7]
            if (r0 < 0) goto L9
            int r7 = r7 + 1
            goto L0
        L9:
            if (r7 < r8) goto Ld
            goto L7a
        Ld:
            if (r7 >= r8) goto L7a
            int r0 = r7 + 1
            r1 = r6[r7]
            if (r1 >= 0) goto L78
            r2 = -32
            r3 = -65
            if (r1 >= r2) goto L29
            if (r0 < r8) goto L1e
            goto L57
        L1e:
            r2 = -62
            if (r1 < r2) goto L76
            int r7 = r7 + 2
            r0 = r6[r0]
            if (r0 <= r3) goto Ld
            goto L76
        L29:
            r4 = -16
            if (r1 >= r4) goto L4f
            int r4 = r8 + (-1)
            if (r0 < r4) goto L36
            int r1 = zza(r6, r0, r8)
            goto L57
        L36:
            int r4 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            r5 = -96
            if (r1 != r2) goto L42
            if (r0 < r5) goto L76
        L42:
            r2 = -19
            if (r1 != r2) goto L48
            if (r0 >= r5) goto L76
        L48:
            int r7 = r7 + 3
            r0 = r6[r4]
            if (r0 <= r3) goto Ld
            goto L76
        L4f:
            int r2 = r8 + (-2)
            if (r0 < r2) goto L5a
            int r1 = zza(r6, r0, r8)
        L57:
            if (r1 == 0) goto L7a
            goto L76
        L5a:
            int r2 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L76
            int r0 = r7 + 3
            r1 = r6[r2]
            if (r1 > r3) goto L76
            int r7 = r7 + 4
            r0 = r6[r0]
            if (r0 > r3) goto L76
            goto Ld
        L76:
            r6 = 0
            return r6
        L78:
            r7 = r0
            goto Ld
        L7a:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzpv.zze(byte[], int, int):boolean");
    }
}
