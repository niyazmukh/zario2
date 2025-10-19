package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzku.smali */
final class zzku {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i, zzkt zzktVar) throws zznn {
        int iZzi = zzi(bArr, i, zzktVar);
        int i5 = zzktVar.zza;
        if (i5 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i5 > bArr.length - iZzi) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i5 == 0) {
            zzktVar.zzc = zzle.zzb;
            return iZzi;
        }
        zzktVar.zzc = zzle.zzk(bArr, iZzi, i5);
        return iZzi + i5;
    }

    public static int zzb(byte[] bArr, int i) {
        int i5 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i7 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16);
    }

    public static int zzc(zzow zzowVar, byte[] bArr, int i, int i5, int i6, zzkt zzktVar) throws zznn {
        Object objZze = zzowVar.zze();
        int iZzm = zzm(objZze, zzowVar, bArr, i, i5, i6, zzktVar);
        zzowVar.zzf(objZze);
        zzktVar.zzc = objZze;
        return iZzm;
    }

    public static int zzd(zzow zzowVar, byte[] bArr, int i, int i5, zzkt zzktVar) throws zznn {
        Object objZze = zzowVar.zze();
        int iZzn = zzn(objZze, zzowVar, bArr, i, i5, zzktVar);
        zzowVar.zzf(objZze);
        zzktVar.zzc = objZze;
        return iZzn;
    }

    public static int zze(zzow zzowVar, int i, byte[] bArr, int i5, int i6, zznk zznkVar, zzkt zzktVar) throws zznn {
        int iZzd = zzd(zzowVar, bArr, i5, i6, zzktVar);
        zznkVar.add(zzktVar.zzc);
        while (iZzd < i6) {
            int iZzi = zzi(bArr, iZzd, zzktVar);
            if (i != zzktVar.zza) {
                break;
            }
            iZzd = zzd(zzowVar, bArr, iZzi, i6, zzktVar);
            zznkVar.add(zzktVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zznk zznkVar, zzkt zzktVar) throws zznn {
        zzne zzneVar = (zzne) zznkVar;
        int iZzi = zzi(bArr, i, zzktVar);
        int i5 = zzktVar.zza + iZzi;
        while (iZzi < i5) {
            iZzi = zzi(bArr, iZzi, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        if (iZzi == i5) {
            return iZzi;
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(byte[] bArr, int i, zzkt zzktVar) throws zznn {
        int iZzi = zzi(bArr, i, zzktVar);
        int i5 = zzktVar.zza;
        if (i5 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i5 == 0) {
            zzktVar.zzc = "";
            return iZzi;
        }
        zzktVar.zzc = new String(bArr, iZzi, i5, zznl.zza);
        return iZzi + i5;
    }

    public static int zzh(int i, byte[] bArr, int i5, int i6, zzpm zzpmVar, zzkt zzktVar) throws zznn {
        if ((i >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i & 7;
        if (i7 == 0) {
            int iZzl = zzl(bArr, i5, zzktVar);
            zzpmVar.zzj(i, Long.valueOf(zzktVar.zzb));
            return iZzl;
        }
        if (i7 == 1) {
            zzpmVar.zzj(i, Long.valueOf(zzp(bArr, i5)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int iZzi = zzi(bArr, i5, zzktVar);
            int i8 = zzktVar.zza;
            if (i8 < 0) {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i8 > bArr.length - iZzi) {
                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i8 == 0) {
                zzpmVar.zzj(i, zzle.zzb);
            } else {
                zzpmVar.zzj(i, zzle.zzk(bArr, iZzi, i8));
            }
            return iZzi + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new zznn("Protocol message contained an invalid tag (zero).");
            }
            zzpmVar.zzj(i, Integer.valueOf(zzb(bArr, i5)));
            return i5 + 4;
        }
        int i9 = (i & (-8)) | 4;
        zzpm zzpmVarZzf = zzpm.zzf();
        int i10 = zzktVar.zze + 1;
        zzktVar.zze = i10;
        zzq(i10);
        int i11 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int iZzi2 = zzi(bArr, i5, zzktVar);
            i11 = zzktVar.zza;
            if (i11 == i9) {
                i5 = iZzi2;
                break;
            }
            i5 = zzh(i11, bArr, iZzi2, i6, zzpmVarZzf, zzktVar);
        }
        zzktVar.zze--;
        if (i5 > i6 || i11 != i9) {
            throw new zznn("Failed to parse the message.");
        }
        zzpmVar.zzj(i, zzpmVarZzf);
        return i5;
    }

    public static int zzi(byte[] bArr, int i, zzkt zzktVar) {
        int i5 = i + 1;
        byte b5 = bArr[i];
        if (b5 < 0) {
            return zzj(b5, bArr, i5, zzktVar);
        }
        zzktVar.zza = b5;
        return i5;
    }

    public static int zzj(int i, byte[] bArr, int i5, zzkt zzktVar) {
        byte b5 = bArr[i5];
        int i6 = i5 + 1;
        int i7 = i & 127;
        if (b5 >= 0) {
            zzktVar.zza = i7 | (b5 << 7);
            return i6;
        }
        int i8 = i7 | ((b5 & 127) << 7);
        int i9 = i5 + 2;
        byte b6 = bArr[i6];
        if (b6 >= 0) {
            zzktVar.zza = i8 | (b6 << 14);
            return i9;
        }
        int i10 = i8 | ((b6 & 127) << 14);
        int i11 = i5 + 3;
        byte b7 = bArr[i9];
        if (b7 >= 0) {
            zzktVar.zza = i10 | (b7 << 21);
            return i11;
        }
        int i12 = i10 | ((b7 & 127) << 21);
        int i13 = i5 + 4;
        byte b8 = bArr[i11];
        if (b8 >= 0) {
            zzktVar.zza = i12 | (b8 << 28);
            return i13;
        }
        int i14 = i12 | ((b8 & 127) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                zzktVar.zza = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static int zzk(int i, byte[] bArr, int i5, int i6, zznk zznkVar, zzkt zzktVar) {
        zzne zzneVar = (zzne) zznkVar;
        int iZzi = zzi(bArr, i5, zzktVar);
        zzneVar.zzh(zzktVar.zza);
        while (iZzi < i6) {
            int iZzi2 = zzi(bArr, iZzi, zzktVar);
            if (i != zzktVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        return iZzi;
    }

    public static int zzl(byte[] bArr, int i, zzkt zzktVar) {
        long j5 = bArr[i];
        int i5 = i + 1;
        if (j5 >= 0) {
            zzktVar.zzb = j5;
            return i5;
        }
        int i6 = i + 2;
        byte b5 = bArr[i5];
        long j6 = (j5 & 127) | ((b5 & 127) << 7);
        int i7 = 7;
        while (b5 < 0) {
            int i8 = i6 + 1;
            i7 += 7;
            j6 |= (r10 & 127) << i7;
            b5 = bArr[i6];
            i6 = i8;
        }
        zzktVar.zzb = j6;
        return i6;
    }

    public static int zzm(Object obj, zzow zzowVar, byte[] bArr, int i, int i5, int i6, zzkt zzktVar) throws zznn {
        zzol zzolVar = (zzol) zzowVar;
        int i7 = zzktVar.zze + 1;
        zzktVar.zze = i7;
        zzq(i7);
        int iZzc = zzolVar.zzc(obj, bArr, i, i5, i6, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return iZzc;
    }

    public static int zzn(Object obj, zzow zzowVar, byte[] bArr, int i, int i5, zzkt zzktVar) throws zznn {
        int iZzj = i + 1;
        int i6 = bArr[i];
        if (i6 < 0) {
            iZzj = zzj(i6, bArr, iZzj, zzktVar);
            i6 = zzktVar.zza;
        }
        int i7 = iZzj;
        if (i6 < 0 || i6 > i5 - i7) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i8 = zzktVar.zze + 1;
        zzktVar.zze = i8;
        zzq(i8);
        int i9 = i6 + i7;
        zzowVar.zzi(obj, bArr, i7, i9, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return i9;
    }

    public static int zzo(int i, byte[] bArr, int i5, int i6, zzkt zzktVar) throws zznn {
        if ((i >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return zzl(bArr, i5, zzktVar);
        }
        if (i7 == 1) {
            return i5 + 8;
        }
        if (i7 == 2) {
            return zzi(bArr, i5, zzktVar) + zzktVar.zza;
        }
        if (i7 != 3) {
            if (i7 == 5) {
                return i5 + 4;
            }
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i8 = (i & (-8)) | 4;
        int i9 = 0;
        while (i5 < i6) {
            i5 = zzi(bArr, i5, zzktVar);
            i9 = zzktVar.zza;
            if (i9 == i8) {
                break;
            }
            i5 = zzo(i9, bArr, i5, i6, zzktVar);
        }
        if (i5 > i6 || i9 != i8) {
            throw new zznn("Failed to parse the message.");
        }
        return i5;
    }

    public static long zzp(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    private static void zzq(int i) throws zznn {
        if (i >= zzb) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
