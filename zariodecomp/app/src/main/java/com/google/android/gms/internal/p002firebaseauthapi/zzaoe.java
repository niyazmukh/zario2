package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaoe.smali */
final class zzaoe extends zzaob {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaob
    public final int zza(String str, byte[] bArr, int i, int i5) {
        int i6;
        int i7;
        char cCharAt;
        int length = str.length();
        int i8 = i5 + i;
        int i9 = 0;
        while (i9 < length && (i7 = i9 + i) < i8 && (cCharAt = str.charAt(i9)) < 128) {
            bArr[i7] = (byte) cCharAt;
            i9++;
        }
        if (i9 == length) {
            return i + length;
        }
        int i10 = i + i9;
        while (i9 < length) {
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 128 && i10 < i8) {
                bArr[i10] = (byte) cCharAt2;
                i10++;
            } else if (cCharAt2 < 2048 && i10 <= i8 - 2) {
                int i11 = i10 + 1;
                bArr[i10] = (byte) ((cCharAt2 >>> 6) | 960);
                i10 += 2;
                bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i10 > i8 - 3) {
                    if (i10 > i8 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i6 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i6)))) {
                            throw new zzaod(i9, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i10);
                    }
                    int i12 = i9 + 1;
                    if (i12 != str.length()) {
                        char cCharAt3 = str.charAt(i12);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i13 = i10 + 3;
                            bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i10 += 4;
                            bArr[i13] = (byte) ((codePoint & 63) | 128);
                            i9 = i12;
                        } else {
                            i9 = i12;
                        }
                    }
                    throw new zzaod(i9 - 1, length);
                }
                bArr[i10] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i14 = i10 + 2;
                bArr[i10 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i10 += 3;
                bArr[i14] = (byte) ((cCharAt2 & '?') | 128);
            }
            i9++;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaob
    public final int zza(int i, byte[] bArr, int i5, int i6) {
        while (i5 < i6 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 >= i6) {
            return 0;
        }
        while (i5 < i6) {
            int i7 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 < 0) {
                if (b5 < -32) {
                    if (i7 >= i6) {
                        return b5;
                    }
                    if (b5 >= -62) {
                        i5 += 2;
                        if (bArr[i7] > -65) {
                        }
                    }
                    return -1;
                }
                if (b5 < -16) {
                    if (i7 >= i6 - 1) {
                        return zzaoa.zza(bArr, i7, i6);
                    }
                    int i8 = i5 + 2;
                    byte b6 = bArr[i7];
                    if (b6 <= -65 && ((b5 != -32 || b6 >= -96) && (b5 != -19 || b6 < -96))) {
                        i5 += 3;
                        if (bArr[i8] > -65) {
                        }
                    }
                    return -1;
                }
                if (i7 >= i6 - 2) {
                    return zzaoa.zza(bArr, i7, i6);
                }
                int i9 = i5 + 2;
                byte b7 = bArr[i7];
                if (b7 <= -65) {
                    if ((((b7 + 112) + (b5 << 28)) >> 30) == 0) {
                        int i10 = i5 + 3;
                        if (bArr[i9] <= -65) {
                            i5 += 4;
                            if (bArr[i10] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i5 = i7;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaob
    public final String zza(byte[] bArr, int i, int i5) throws zzall {
        if ((i | i5 | ((bArr.length - i) - i5)) >= 0) {
            int i6 = i + i5;
            char[] cArr = new char[i5];
            int i7 = 0;
            while (i < i6) {
                byte b5 = bArr[i];
                if (b5 < 0) {
                    break;
                }
                i++;
                zzaoc.zza(b5, cArr, i7);
                i7++;
            }
            int i8 = i7;
            while (i < i6) {
                int i9 = i + 1;
                byte b6 = bArr[i];
                if (b6 >= 0) {
                    int i10 = i8 + 1;
                    zzaoc.zza(b6, cArr, i8);
                    while (i9 < i6) {
                        byte b7 = bArr[i9];
                        if (b7 < 0) {
                            break;
                        }
                        i9++;
                        zzaoc.zza(b7, cArr, i10);
                        i10++;
                    }
                    i8 = i10;
                    i = i9;
                } else if (b6 < -32) {
                    if (i9 < i6) {
                        i += 2;
                        zzaoc.zza(b6, bArr[i9], cArr, i8);
                        i8++;
                    } else {
                        throw zzall.zzd();
                    }
                } else if (b6 < -16) {
                    if (i9 < i6 - 1) {
                        int i11 = i + 2;
                        i += 3;
                        zzaoc.zza(b6, bArr[i9], bArr[i11], cArr, i8);
                        i8++;
                    } else {
                        throw zzall.zzd();
                    }
                } else if (i9 < i6 - 2) {
                    byte b8 = bArr[i9];
                    int i12 = i + 3;
                    byte b9 = bArr[i + 2];
                    i += 4;
                    zzaoc.zza(b6, b8, b9, bArr[i12], cArr, i8);
                    i8 += 2;
                } else {
                    throw zzall.zzd();
                }
            }
            return new String(cArr, 0, i8);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i5)));
    }
}
