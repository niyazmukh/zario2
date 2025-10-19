package com.google.android.gms.internal.auth;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzhm.smali */
final class zzhm {
    private static final zzhk zza;

    static {
        if (zzhi.zzu() && zzhi.zzv()) {
            int i = zzdr.zza;
        }
        zza = new zzhl();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i5) {
        byte b5 = bArr[i - 1];
        int i6 = i5 - i;
        if (i6 != 0) {
            if (i6 == 1) {
                byte b6 = bArr[i];
                if (b5 <= -12 && b6 <= -65) {
                    return b5 ^ (b6 << 8);
                }
            } else {
                if (i6 != 2) {
                    throw new AssertionError();
                }
                byte b7 = bArr[i];
                byte b8 = bArr[i + 1];
                if (b5 <= -12 && b7 <= -65 && b8 <= -65) {
                    return ((b7 << 8) ^ b5) ^ (b8 << 16);
                }
            }
        } else if (b5 <= -12) {
            return b5;
        }
        return -1;
    }

    public static String zzb(byte[] bArr, int i, int i5) throws zzfa {
        int length = bArr.length;
        if ((i | i5 | ((length - i) - i5)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i5)));
        }
        int i6 = i + i5;
        char[] cArr = new char[i5];
        int i7 = 0;
        while (i < i6) {
            byte b5 = bArr[i];
            if (!zzhj.zzd(b5)) {
                break;
            }
            i++;
            cArr[i7] = (char) b5;
            i7++;
        }
        int i8 = i7;
        while (i < i6) {
            int i9 = i + 1;
            byte b6 = bArr[i];
            if (zzhj.zzd(b6)) {
                cArr[i8] = (char) b6;
                i8++;
                i = i9;
                while (i < i6) {
                    byte b7 = bArr[i];
                    if (!zzhj.zzd(b7)) {
                        break;
                    }
                    i++;
                    cArr[i8] = (char) b7;
                    i8++;
                }
            } else if (b6 < -32) {
                if (i9 >= i6) {
                    throw zzfa.zzb();
                }
                i += 2;
                zzhj.zzc(b6, bArr[i9], cArr, i8);
                i8++;
            } else if (b6 < -16) {
                if (i9 >= i6 - 1) {
                    throw zzfa.zzb();
                }
                int i10 = i + 2;
                i += 3;
                zzhj.zzb(b6, bArr[i9], bArr[i10], cArr, i8);
                i8++;
            } else {
                if (i9 >= i6 - 2) {
                    throw zzfa.zzb();
                }
                int i11 = i + 2;
                int i12 = i + 3;
                i += 4;
                zzhj.zza(b6, bArr[i9], bArr[i11], bArr[i12], cArr, i8);
                i8 += 2;
            }
        }
        return new String(cArr, 0, i8);
    }

    public static boolean zzc(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzd(byte[] bArr, int i, int i5) {
        return zza.zzb(bArr, i, i5);
    }
}
