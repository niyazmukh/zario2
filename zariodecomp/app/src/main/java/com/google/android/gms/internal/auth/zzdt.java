package com.google.android.gms.internal.auth;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzdt.smali */
final class zzdt {
    public static int zza(byte[] bArr, int i, zzds zzdsVar) {
        int iZzj = zzj(bArr, i, zzdsVar);
        int i5 = zzdsVar.zza;
        if (i5 < 0) {
            throw zzfa.zzc();
        }
        if (i5 > bArr.length - iZzj) {
            throw zzfa.zzf();
        }
        if (i5 == 0) {
            zzdsVar.zzc = zzee.zzb;
            return iZzj;
        }
        zzdsVar.zzc = zzee.zzk(bArr, iZzj, i5);
        return iZzj + i5;
    }

    public static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzc(zzgh zzghVar, byte[] bArr, int i, int i5, int i6, zzds zzdsVar) {
        zzfz zzfzVar = (zzfz) zzghVar;
        Object objZzd = zzfzVar.zzd();
        int iZzb = zzfzVar.zzb(objZzd, bArr, i, i5, i6, zzdsVar);
        zzfzVar.zze(objZzd);
        zzdsVar.zzc = objZzd;
        return iZzb;
    }

    public static int zzd(zzgh zzghVar, byte[] bArr, int i, int i5, zzds zzdsVar) {
        int iZzk = i + 1;
        int i6 = bArr[i];
        if (i6 < 0) {
            iZzk = zzk(i6, bArr, iZzk, zzdsVar);
            i6 = zzdsVar.zza;
        }
        int i7 = iZzk;
        if (i6 < 0 || i6 > i5 - i7) {
            throw zzfa.zzf();
        }
        Object objZzd = zzghVar.zzd();
        int i8 = i6 + i7;
        zzghVar.zzg(objZzd, bArr, i7, i8, zzdsVar);
        zzghVar.zze(objZzd);
        zzdsVar.zzc = objZzd;
        return i8;
    }

    public static int zze(zzgh zzghVar, int i, byte[] bArr, int i5, int i6, zzey zzeyVar, zzds zzdsVar) {
        int iZzd = zzd(zzghVar, bArr, i5, i6, zzdsVar);
        zzeyVar.add(zzdsVar.zzc);
        while (iZzd < i6) {
            int iZzj = zzj(bArr, iZzd, zzdsVar);
            if (i != zzdsVar.zza) {
                break;
            }
            iZzd = zzd(zzghVar, bArr, iZzj, i6, zzdsVar);
            zzeyVar.add(zzdsVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int iZzj = zzj(bArr, i, zzdsVar);
        int i5 = zzdsVar.zza + iZzj;
        while (iZzj < i5) {
            iZzj = zzj(bArr, iZzj, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        if (iZzj == i5) {
            return iZzj;
        }
        throw zzfa.zzf();
    }

    public static int zzg(byte[] bArr, int i, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i, zzdsVar);
        int i5 = zzdsVar.zza;
        if (i5 < 0) {
            throw zzfa.zzc();
        }
        if (i5 == 0) {
            zzdsVar.zzc = "";
            return iZzj;
        }
        zzdsVar.zzc = new String(bArr, iZzj, i5, zzez.zzb);
        return iZzj + i5;
    }

    public static int zzh(byte[] bArr, int i, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i, zzdsVar);
        int i5 = zzdsVar.zza;
        if (i5 < 0) {
            throw zzfa.zzc();
        }
        if (i5 == 0) {
            zzdsVar.zzc = "";
            return iZzj;
        }
        zzdsVar.zzc = zzhm.zzb(bArr, iZzj, i5);
        return iZzj + i5;
    }

    public static int zzi(int i, byte[] bArr, int i5, int i6, zzgz zzgzVar, zzds zzdsVar) {
        if ((i >>> 3) == 0) {
            throw zzfa.zza();
        }
        int i7 = i & 7;
        if (i7 == 0) {
            int iZzm = zzm(bArr, i5, zzdsVar);
            zzgzVar.zzf(i, Long.valueOf(zzdsVar.zzb));
            return iZzm;
        }
        if (i7 == 1) {
            zzgzVar.zzf(i, Long.valueOf(zzn(bArr, i5)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int iZzj = zzj(bArr, i5, zzdsVar);
            int i8 = zzdsVar.zza;
            if (i8 < 0) {
                throw zzfa.zzc();
            }
            if (i8 > bArr.length - iZzj) {
                throw zzfa.zzf();
            }
            if (i8 == 0) {
                zzgzVar.zzf(i, zzee.zzb);
            } else {
                zzgzVar.zzf(i, zzee.zzk(bArr, iZzj, i8));
            }
            return iZzj + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw zzfa.zza();
            }
            zzgzVar.zzf(i, Integer.valueOf(zzb(bArr, i5)));
            return i5 + 4;
        }
        int i9 = (i & (-8)) | 4;
        zzgz zzgzVarZzc = zzgz.zzc();
        int i10 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int iZzj2 = zzj(bArr, i5, zzdsVar);
            int i11 = zzdsVar.zza;
            if (i11 == i9) {
                i10 = i11;
                i5 = iZzj2;
                break;
            }
            i10 = i11;
            i5 = zzi(i11, bArr, iZzj2, i6, zzgzVarZzc, zzdsVar);
        }
        if (i5 > i6 || i10 != i9) {
            throw zzfa.zzd();
        }
        zzgzVar.zzf(i, zzgzVarZzc);
        return i5;
    }

    public static int zzj(byte[] bArr, int i, zzds zzdsVar) {
        int i5 = i + 1;
        byte b5 = bArr[i];
        if (b5 < 0) {
            return zzk(b5, bArr, i5, zzdsVar);
        }
        zzdsVar.zza = b5;
        return i5;
    }

    public static int zzk(int i, byte[] bArr, int i5, zzds zzdsVar) {
        int i6 = i & 127;
        int i7 = i5 + 1;
        byte b5 = bArr[i5];
        if (b5 >= 0) {
            zzdsVar.zza = i6 | (b5 << 7);
            return i7;
        }
        int i8 = i6 | ((b5 & 127) << 7);
        int i9 = i5 + 2;
        byte b6 = bArr[i7];
        if (b6 >= 0) {
            zzdsVar.zza = i8 | (b6 << 14);
            return i9;
        }
        int i10 = i8 | ((b6 & 127) << 14);
        int i11 = i5 + 3;
        byte b7 = bArr[i9];
        if (b7 >= 0) {
            zzdsVar.zza = i10 | (b7 << 21);
            return i11;
        }
        int i12 = i10 | ((b7 & 127) << 21);
        int i13 = i5 + 4;
        byte b8 = bArr[i11];
        if (b8 >= 0) {
            zzdsVar.zza = i12 | (b8 << 28);
            return i13;
        }
        int i14 = i12 | ((b8 & 127) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                zzdsVar.zza = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static int zzl(int i, byte[] bArr, int i5, int i6, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int iZzj = zzj(bArr, i5, zzdsVar);
        zzevVar.zze(zzdsVar.zza);
        while (iZzj < i6) {
            int iZzj2 = zzj(bArr, iZzj, zzdsVar);
            if (i != zzdsVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i, zzds zzdsVar) {
        int i5 = i + 1;
        long j5 = bArr[i];
        if (j5 >= 0) {
            zzdsVar.zzb = j5;
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
        zzdsVar.zzb = j6;
        return i6;
    }

    public static long zzn(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
