package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzajr.smali */
final class zzajr {
    private static volatile int zza = 100;

    public static double zza(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzd(bArr, i));
    }

    public static float zzb(byte[] bArr, int i) {
        return Float.intBitsToFloat(zzc(bArr, i));
    }

    public static int zzc(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzd(byte[] bArr, int i, zzaju zzajuVar) {
        int i5 = i + 1;
        long j5 = bArr[i];
        if (j5 >= 0) {
            zzajuVar.zzb = j5;
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
        zzajuVar.zzb = j6;
        return i6;
    }

    public static int zza(byte[] bArr, int i, zzaju zzajuVar) {
        int iZzc = zzc(bArr, i, zzajuVar);
        int i5 = zzajuVar.zza;
        if (i5 < 0) {
            throw zzall.zzf();
        }
        if (i5 > bArr.length - iZzc) {
            throw zzall.zzj();
        }
        if (i5 == 0) {
            zzajuVar.zzc = zzajv.zza;
            return iZzc;
        }
        zzajuVar.zzc = zzajv.zza(bArr, iZzc, i5);
        return iZzc + i5;
    }

    public static int zzb(zzanb<?> zzanbVar, int i, byte[] bArr, int i5, int i6, zzalm<?> zzalmVar, zzaju zzajuVar) {
        int iZza = zza(zzanbVar, bArr, i5, i6, zzajuVar);
        zzalmVar.add(zzajuVar.zzc);
        while (iZza < i6) {
            int iZzc = zzc(bArr, iZza, zzajuVar);
            if (i != zzajuVar.zza) {
                break;
            }
            iZza = zza(zzanbVar, bArr, iZzc, i6, zzajuVar);
            zzalmVar.add(zzajuVar.zzc);
        }
        return iZza;
    }

    public static int zzc(byte[] bArr, int i, zzaju zzajuVar) {
        int i5 = i + 1;
        byte b5 = bArr[i];
        if (b5 < 0) {
            return zza(b5, bArr, i5, zzajuVar);
        }
        zzajuVar.zza = b5;
        return i5;
    }

    public static long zzd(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int zzb(byte[] bArr, int i, zzaju zzajuVar) {
        int iZzc = zzc(bArr, i, zzajuVar);
        int i5 = zzajuVar.zza;
        if (i5 < 0) {
            throw zzall.zzf();
        }
        if (i5 == 0) {
            zzajuVar.zzc = "";
            return iZzc;
        }
        zzajuVar.zzc = zzaoa.zzb(bArr, iZzc, i5);
        return iZzc + i5;
    }

    public static int zza(int i, byte[] bArr, int i5, int i6, Object obj, zzamm zzammVar, zzanu<zzanx, zzanx> zzanuVar, zzaju zzajuVar) {
        if (zzajuVar.zzd.zza(zzammVar, i >>> 3) == null) {
            return zza(i, bArr, i5, i6, zzamq.zzc(obj), zzajuVar);
        }
        zzalf.zzd zzdVar = (zzalf.zzd) obj;
        zzdVar.zza();
        zzakx<zzalf.zzc> zzakxVar = zzdVar.zzc;
        throw new NoSuchMethodError();
    }

    private static <T> int zza(zzanb<T> zzanbVar, byte[] bArr, int i, int i5, int i6, zzaju zzajuVar) {
        T tZza = zzanbVar.zza();
        int iZza = zza(tZza, zzanbVar, bArr, i, i5, i6, zzajuVar);
        zzanbVar.zzd(tZza);
        zzajuVar.zzc = tZza;
        return iZza;
    }

    public static int zza(zzanb<?> zzanbVar, int i, byte[] bArr, int i5, int i6, zzalm<Object> zzalmVar, zzaju zzajuVar) {
        int i7 = (i & (-8)) | 4;
        int iZza = zza(zzanbVar, bArr, i5, i6, i7, zzajuVar);
        zzalmVar.add(zzajuVar.zzc);
        while (iZza < i6) {
            int iZzc = zzc(bArr, iZza, zzajuVar);
            if (i != zzajuVar.zza) {
                break;
            }
            iZza = zza(zzanbVar, bArr, iZzc, i6, i7, zzajuVar);
            zzalmVar.add(zzajuVar.zzc);
        }
        return iZza;
    }

    public static <T> int zza(zzanb<T> zzanbVar, byte[] bArr, int i, int i5, zzaju zzajuVar) {
        T tZza = zzanbVar.zza();
        int iZza = zza(tZza, zzanbVar, bArr, i, i5, zzajuVar);
        zzanbVar.zzd(tZza);
        zzajuVar.zzc = tZza;
        return iZza;
    }

    public static int zza(byte[] bArr, int i, zzalm<?> zzalmVar, zzaju zzajuVar) {
        zzali zzaliVar = (zzali) zzalmVar;
        int iZzc = zzc(bArr, i, zzajuVar);
        int i5 = zzajuVar.zza + iZzc;
        while (iZzc < i5) {
            iZzc = zzc(bArr, iZzc, zzajuVar);
            zzaliVar.zzc(zzajuVar.zza);
        }
        if (iZzc == i5) {
            return iZzc;
        }
        throw zzall.zzj();
    }

    public static int zza(int i, byte[] bArr, int i5, int i6, zzanx zzanxVar, zzaju zzajuVar) {
        if ((i >>> 3) == 0) {
            throw zzall.zzc();
        }
        int i7 = i & 7;
        if (i7 == 0) {
            int iZzd = zzd(bArr, i5, zzajuVar);
            zzanxVar.zza(i, Long.valueOf(zzajuVar.zzb));
            return iZzd;
        }
        if (i7 == 1) {
            zzanxVar.zza(i, Long.valueOf(zzd(bArr, i5)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int iZzc = zzc(bArr, i5, zzajuVar);
            int i8 = zzajuVar.zza;
            if (i8 >= 0) {
                if (i8 > bArr.length - iZzc) {
                    throw zzall.zzj();
                }
                if (i8 == 0) {
                    zzanxVar.zza(i, zzajv.zza);
                } else {
                    zzanxVar.zza(i, zzajv.zza(bArr, iZzc, i8));
                }
                return iZzc + i8;
            }
            throw zzall.zzf();
        }
        if (i7 != 3) {
            if (i7 == 5) {
                zzanxVar.zza(i, Integer.valueOf(zzc(bArr, i5)));
                return i5 + 4;
            }
            throw zzall.zzc();
        }
        zzanx zzanxVarZzd = zzanx.zzd();
        int i9 = (i & (-8)) | 4;
        int i10 = zzajuVar.zze + 1;
        zzajuVar.zze = i10;
        zza(i10);
        int i11 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int iZzc2 = zzc(bArr, i5, zzajuVar);
            int i12 = zzajuVar.zza;
            i11 = i12;
            if (i12 == i9) {
                i5 = iZzc2;
                break;
            }
            int iZza = zza(i11, bArr, iZzc2, i6, zzanxVarZzd, zzajuVar);
            i11 = i12;
            i5 = iZza;
        }
        zzajuVar.zze--;
        if (i5 <= i6 && i11 == i9) {
            zzanxVar.zza(i, zzanxVarZzd);
            return i5;
        }
        throw zzall.zzg();
    }

    public static int zza(int i, byte[] bArr, int i5, zzaju zzajuVar) {
        int i6 = i & 127;
        int i7 = i5 + 1;
        byte b5 = bArr[i5];
        if (b5 >= 0) {
            zzajuVar.zza = i6 | (b5 << 7);
            return i7;
        }
        int i8 = i6 | ((b5 & 127) << 7);
        int i9 = i5 + 2;
        byte b6 = bArr[i7];
        if (b6 >= 0) {
            zzajuVar.zza = i8 | (b6 << 14);
            return i9;
        }
        int i10 = i8 | ((b6 & 127) << 14);
        int i11 = i5 + 3;
        byte b7 = bArr[i9];
        if (b7 >= 0) {
            zzajuVar.zza = i10 | (b7 << 21);
            return i11;
        }
        int i12 = i10 | ((b7 & 127) << 21);
        int i13 = i5 + 4;
        byte b8 = bArr[i11];
        if (b8 >= 0) {
            zzajuVar.zza = i12 | (b8 << 28);
            return i13;
        }
        int i14 = i12 | ((b8 & 127) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                zzajuVar.zza = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static int zza(int i, byte[] bArr, int i5, int i6, zzalm<?> zzalmVar, zzaju zzajuVar) {
        zzali zzaliVar = (zzali) zzalmVar;
        int iZzc = zzc(bArr, i5, zzajuVar);
        zzaliVar.zzc(zzajuVar.zza);
        while (iZzc < i6) {
            int iZzc2 = zzc(bArr, iZzc, zzajuVar);
            if (i != zzajuVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzajuVar);
            zzaliVar.zzc(zzajuVar.zza);
        }
        return iZzc;
    }

    public static <T> int zza(Object obj, zzanb<T> zzanbVar, byte[] bArr, int i, int i5, int i6, zzaju zzajuVar) {
        zzamq zzamqVar = (zzamq) zzanbVar;
        int i7 = zzajuVar.zze + 1;
        zzajuVar.zze = i7;
        zza(i7);
        int iZza = zzamqVar.zza((zzamq) obj, bArr, i, i5, i6, zzajuVar);
        zzajuVar.zze--;
        zzajuVar.zzc = obj;
        return iZza;
    }

    public static <T> int zza(Object obj, zzanb<T> zzanbVar, byte[] bArr, int i, int i5, zzaju zzajuVar) {
        int iZza = i + 1;
        int i6 = bArr[i];
        if (i6 < 0) {
            iZza = zza(i6, bArr, iZza, zzajuVar);
            i6 = zzajuVar.zza;
        }
        int i7 = iZza;
        if (i6 >= 0 && i6 <= i5 - i7) {
            int i8 = zzajuVar.zze + 1;
            zzajuVar.zze = i8;
            zza(i8);
            int i9 = i6 + i7;
            zzanbVar.zza(obj, bArr, i7, i9, zzajuVar);
            zzajuVar.zze--;
            zzajuVar.zzc = obj;
            return i9;
        }
        throw zzall.zzj();
    }

    public static int zza(int i, byte[] bArr, int i5, int i6, zzaju zzajuVar) {
        if ((i >>> 3) == 0) {
            throw zzall.zzc();
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return zzd(bArr, i5, zzajuVar);
        }
        if (i7 == 1) {
            return i5 + 8;
        }
        if (i7 == 2) {
            return zzc(bArr, i5, zzajuVar) + zzajuVar.zza;
        }
        if (i7 != 3) {
            if (i7 == 5) {
                return i5 + 4;
            }
            throw zzall.zzc();
        }
        int i8 = (i & (-8)) | 4;
        int i9 = 0;
        while (i5 < i6) {
            i5 = zzc(bArr, i5, zzajuVar);
            i9 = zzajuVar.zza;
            if (i9 == i8) {
                break;
            }
            i5 = zza(i9, bArr, i5, i6, zzajuVar);
        }
        if (i5 > i6 || i9 != i8) {
            throw zzall.zzg();
        }
        return i5;
    }

    private static void zza(int i) throws zzall {
        if (i >= zza) {
            throw zzall.zzh();
        }
    }
}
