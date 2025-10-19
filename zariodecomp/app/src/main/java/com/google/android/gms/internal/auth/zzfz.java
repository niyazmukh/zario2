package com.google.android.gms.internal.auth;

import N2.j0;
import N2.n0;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzfz.smali */
final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i, int i5, zzfw zzfwVar, boolean z4, boolean z5, int[] iArr2, int i6, int i7, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i5;
        this.zzh = z4;
        this.zzi = iArr2;
        this.zzj = i6;
        this.zzk = i7;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        long jZzv = zzv(i) & 1048575;
        if (zzG(obj2, i)) {
            Object objZzf = zzhi.zzf(obj, jZzv);
            Object objZzf2 = zzhi.zzf(obj2, jZzv);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, jZzv, zzez.zzg(objZzf, objZzf2));
                zzD(obj, i);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, jZzv, objZzf2);
                zzD(obj, i);
            }
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int iZzv = zzv(i);
        int i5 = this.zzc[i];
        long j5 = iZzv & 1048575;
        if (zzJ(obj2, i5, i)) {
            Object objZzf = zzJ(obj, i5, i) ? zzhi.zzf(obj, j5) : null;
            Object objZzf2 = zzhi.zzf(obj2, j5);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, j5, zzez.zzg(objZzf, objZzf2));
                zzE(obj, i5, i);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, j5, objZzf2);
                zzE(obj, i5, i);
            }
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzs = zzs(i);
        long j5 = 1048575 & iZzs;
        if (j5 == 1048575) {
            return;
        }
        zzhi.zzn(obj, j5, (1 << (iZzs >>> 20)) | zzhi.zzc(obj, j5));
    }

    private final void zzE(Object obj, int i, int i5) {
        zzhi.zzn(obj, zzs(i5) & 1048575, i);
    }

    private final boolean zzF(Object obj, Object obj2, int i) {
        return zzG(obj, i) == zzG(obj2, i);
    }

    private final boolean zzG(Object obj, int i) {
        int iZzs = zzs(i);
        long j5 = iZzs & 1048575;
        if (j5 != 1048575) {
            return (zzhi.zzc(obj, j5) & (1 << (iZzs >>> 20))) != 0;
        }
        int iZzv = zzv(i);
        long j6 = iZzv & 1048575;
        switch (zzu(iZzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j6)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j6)) != 0;
            case 2:
                return zzhi.zzd(obj, j6) != 0;
            case 3:
                return zzhi.zzd(obj, j6) != 0;
            case 4:
                return zzhi.zzc(obj, j6) != 0;
            case 5:
                return zzhi.zzd(obj, j6) != 0;
            case 6:
                return zzhi.zzc(obj, j6) != 0;
            case 7:
                return zzhi.zzt(obj, j6);
            case 8:
                Object objZzf = zzhi.zzf(obj, j6);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzee) {
                    return !zzee.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return zzhi.zzf(obj, j6) != null;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return !zzee.zzb.equals(zzhi.zzf(obj, j6));
            case 11:
                return zzhi.zzc(obj, j6) != 0;
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return zzhi.zzc(obj, j6) != 0;
            case 13:
                return zzhi.zzc(obj, j6) != 0;
            case 14:
                return zzhi.zzd(obj, j6) != 0;
            case 15:
                return zzhi.zzc(obj, j6) != 0;
            case 16:
                return zzhi.zzd(obj, j6) != 0;
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return zzhi.zzf(obj, j6) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i, int i5, int i6, int i7) {
        return i5 == 1048575 ? zzG(obj, i) : (i6 & i7) != 0;
    }

    private static boolean zzI(Object obj, int i, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i & 1048575));
    }

    private final boolean zzJ(Object obj, int i, int i5) {
        return zzhi.zzc(obj, (long) (zzs(i5) & 1048575)) == i;
    }

    public static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar != zzgz.zza()) {
            return zzgzVar;
        }
        zzgz zzgzVarZzc = zzgz.zzc();
        zzeuVar.zzc = zzgzVarZzc;
        return zzgzVarZzc;
    }

    public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0381  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.auth.zzfz zzk(com.google.android.gms.internal.auth.zzgg r34, com.google.android.gms.internal.auth.zzgb r35, com.google.android.gms.internal.auth.zzfk r36, com.google.android.gms.internal.auth.zzgy r37, com.google.android.gms.internal.auth.zzel r38, com.google.android.gms.internal.auth.zzfr r39) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzk(com.google.android.gms.internal.auth.zzgg, com.google.android.gms.internal.auth.zzgb, com.google.android.gms.internal.auth.zzfk, com.google.android.gms.internal.auth.zzgy, com.google.android.gms.internal.auth.zzel, com.google.android.gms.internal.auth.zzfr):com.google.android.gms.internal.auth.zzfz");
    }

    private static int zzl(Object obj, long j5) {
        return ((Integer) zzhi.zzf(obj, j5)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i, int i5, int i6, long j5, zzds zzdsVar) {
        Unsafe unsafe = zzb;
        Object objZzz = zzz(i6);
        Object object = unsafe.getObject(obj, j5);
        if (!((zzfq) object).zze()) {
            zzfq zzfqVarZzb = zzfq.zza().zzb();
            zzfr.zza(zzfqVarZzb, object);
            unsafe.putObject(obj, j5, zzfqVarZzb);
        }
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i, int i5, int i6, int i7, int i8, int i9, int i10, long j5, int i11, zzds zzdsVar) throws zzfa {
        Unsafe unsafe = zzb;
        long j6 = this.zzc[i11 + 2] & 1048575;
        switch (i10) {
            case 51:
                if (i8 == 1) {
                    unsafe.putObject(obj, j5, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i))));
                    unsafe.putInt(obj, j6, i7);
                    return i + 8;
                }
                break;
            case 52:
                if (i8 == 5) {
                    unsafe.putObject(obj, j5, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i))));
                    unsafe.putInt(obj, j6, i7);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i8 == 0) {
                    int iZzm = zzdt.zzm(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j5, Long.valueOf(zzdsVar.zzb));
                    unsafe.putInt(obj, j6, i7);
                    return iZzm;
                }
                break;
            case 55:
            case 62:
                if (i8 == 0) {
                    int iZzj = zzdt.zzj(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j5, Integer.valueOf(zzdsVar.zza));
                    unsafe.putInt(obj, j6, i7);
                    return iZzj;
                }
                break;
            case 56:
            case 65:
                if (i8 == 1) {
                    unsafe.putObject(obj, j5, Long.valueOf(zzdt.zzn(bArr, i)));
                    unsafe.putInt(obj, j6, i7);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i8 == 5) {
                    unsafe.putObject(obj, j5, Integer.valueOf(zzdt.zzb(bArr, i)));
                    unsafe.putInt(obj, j6, i7);
                    return i + 4;
                }
                break;
            case 58:
                if (i8 == 0) {
                    int iZzm2 = zzdt.zzm(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j5, Boolean.valueOf(zzdsVar.zzb != 0));
                    unsafe.putInt(obj, j6, i7);
                    return iZzm2;
                }
                break;
            case 59:
                if (i8 == 2) {
                    int iZzj2 = zzdt.zzj(bArr, i, zzdsVar);
                    int i12 = zzdsVar.zza;
                    if (i12 == 0) {
                        unsafe.putObject(obj, j5, "");
                    } else {
                        if ((i9 & 536870912) != 0 && !zzhm.zzd(bArr, iZzj2, iZzj2 + i12)) {
                            throw zzfa.zzb();
                        }
                        unsafe.putObject(obj, j5, new String(bArr, iZzj2, i12, zzez.zzb));
                        iZzj2 += i12;
                    }
                    unsafe.putInt(obj, j6, i7);
                    return iZzj2;
                }
                break;
            case 60:
                if (i8 == 2) {
                    int iZzd = zzdt.zzd(zzy(i11), bArr, i, i5, zzdsVar);
                    Object object = unsafe.getInt(obj, j6) == i7 ? unsafe.getObject(obj, j5) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j5, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j5, zzez.zzg(object, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j6, i7);
                    return iZzd;
                }
                break;
            case 61:
                if (i8 == 2) {
                    int iZza = zzdt.zza(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j5, zzdsVar.zzc);
                    unsafe.putInt(obj, j6, i7);
                    return iZza;
                }
                break;
            case 63:
                if (i8 == 0) {
                    int iZzj3 = zzdt.zzj(bArr, i, zzdsVar);
                    int i13 = zzdsVar.zza;
                    zzex zzexVarZzx = zzx(i11);
                    if (zzexVarZzx == null || zzexVarZzx.zza()) {
                        unsafe.putObject(obj, j5, Integer.valueOf(i13));
                        unsafe.putInt(obj, j6, i7);
                    } else {
                        zzc(obj).zzf(i6, Long.valueOf(i13));
                    }
                    return iZzj3;
                }
                break;
            case 66:
                if (i8 == 0) {
                    int iZzj4 = zzdt.zzj(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j5, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                    unsafe.putInt(obj, j6, i7);
                    return iZzj4;
                }
                break;
            case 67:
                if (i8 == 0) {
                    int iZzm3 = zzdt.zzm(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j5, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                    unsafe.putInt(obj, j6, i7);
                    return iZzm3;
                }
                break;
            case 68:
                if (i8 == 3) {
                    int iZzc = zzdt.zzc(zzy(i11), bArr, i, i5, (i6 & (-8)) | 4, zzdsVar);
                    Object object2 = unsafe.getInt(obj, j6) == i7 ? unsafe.getObject(obj, j5) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j5, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j5, zzez.zzg(object2, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j6, i7);
                    return iZzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0081. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    private final int zzo(Object obj, byte[] bArr, int i, int i5, zzds zzdsVar) throws zzfa {
        byte b5;
        int iZzk;
        int i6;
        int i7;
        int i8;
        Unsafe unsafe;
        int i9;
        int i10;
        int i11;
        int i12;
        int iZzm;
        int iZzd;
        int i13;
        int i14;
        int i15;
        zzfz<T> zzfzVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i16 = i5;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i17 = 1048575;
        int i18 = -1;
        int iZzi = i;
        int i19 = -1;
        int i20 = 1048575;
        int i21 = 0;
        int i22 = 0;
        while (iZzi < i16) {
            int i23 = iZzi + 1;
            byte b6 = bArr2[iZzi];
            if (b6 < 0) {
                iZzk = zzdt.zzk(b6, bArr2, i23, zzdsVar2);
                b5 = zzdsVar2.zza;
            } else {
                b5 = b6;
                iZzk = i23;
            }
            int i24 = b5 >>> 3;
            int i25 = b5 & 7;
            int iZzr = i24 > i19 ? zzfzVar.zzr(i24, i21 / 3) : zzfzVar.zzq(i24);
            if (iZzr == i18) {
                i6 = iZzk;
                i7 = i24;
                i8 = i18;
                unsafe = unsafe2;
                i9 = 0;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i26 = iArr[iZzr + 1];
                int iZzu = zzu(i26);
                long j5 = i26 & i17;
                if (iZzu <= 17) {
                    int i27 = iArr[iZzr + 2];
                    int i28 = 1 << (i27 >>> 20);
                    int i29 = i27 & 1048575;
                    if (i29 != i20) {
                        if (i20 != 1048575) {
                            unsafe2.putInt(obj2, i20, i22);
                        }
                        if (i29 != 1048575) {
                            i22 = unsafe2.getInt(obj2, i29);
                        }
                        i20 = i29;
                    }
                    switch (iZzu) {
                        case 0:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i11 = iZzk;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 1) {
                                i6 = i11;
                                unsafe = unsafe2;
                                i9 = i10;
                                i8 = -1;
                                break;
                            } else {
                                zzhi.zzl(obj2, j5, Double.longBitsToDouble(zzdt.zzn(bArr2, i11)));
                                iZzi = i11 + 8;
                                i22 |= i28;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                                break;
                            }
                        case 1:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i11 = iZzk;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 5) {
                                i6 = i11;
                                unsafe = unsafe2;
                                i9 = i10;
                                i8 = -1;
                                break;
                            } else {
                                zzhi.zzm(obj2, j5, Float.intBitsToFloat(zzdt.zzb(bArr2, i11)));
                                iZzi = i11 + 4;
                                i22 |= i28;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i11 = iZzk;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 0) {
                                i6 = i11;
                                unsafe = unsafe2;
                                i9 = i10;
                                i8 = -1;
                                break;
                            } else {
                                iZzm = zzdt.zzm(bArr2, i11, zzdsVar2);
                                unsafe2.putLong(obj, j5, zzdsVar2.zzb);
                                i22 |= i28;
                                iZzi = iZzm;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i11 = iZzk;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 0) {
                                i6 = i11;
                                unsafe = unsafe2;
                                i9 = i10;
                                i8 = -1;
                                break;
                            } else {
                                iZzi = zzdt.zzj(bArr2, i11, zzdsVar2);
                                unsafe2.putInt(obj2, j5, zzdsVar2.zza);
                                i22 |= i28;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 1) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe2;
                                i9 = i10;
                                i8 = -1;
                                break;
                            } else {
                                i11 = iZzk;
                                unsafe2.putLong(obj, j5, zzdt.zzn(bArr2, iZzk));
                                iZzi = i11 + 8;
                                i22 |= i28;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 5) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe2;
                                i9 = i10;
                                i8 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, j5, zzdt.zzb(bArr2, iZzk));
                                iZzi = iZzk + 4;
                                i22 |= i28;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                                break;
                            }
                        case 7:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 0) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe2;
                                i9 = i10;
                                i8 = -1;
                                break;
                            } else {
                                iZzi = zzdt.zzm(bArr2, iZzk, zzdsVar2);
                                zzhi.zzk(obj2, j5, zzdsVar2.zzb != 0);
                                i22 |= i28;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                                break;
                            }
                        case 8:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 2) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe2;
                                i9 = i10;
                                i8 = -1;
                                break;
                            } else {
                                iZzi = (536870912 & i26) == 0 ? zzdt.zzg(bArr2, iZzk, zzdsVar2) : zzdt.zzh(bArr2, iZzk, zzdsVar2);
                                unsafe2.putObject(obj2, j5, zzdsVar2.zzc);
                                i22 |= i28;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                                break;
                            }
                        case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 2) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe2;
                                i9 = i10;
                                i8 = -1;
                                break;
                            } else {
                                iZzd = zzdt.zzd(zzfzVar.zzy(i10), bArr2, iZzk, i16, zzdsVar2);
                                Object object = unsafe2.getObject(obj2, j5);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j5, zzdsVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j5, zzez.zzg(object, zzdsVar2.zzc));
                                }
                                i22 |= i28;
                                iZzi = iZzd;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                                break;
                            }
                        case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 2) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe2;
                                i9 = i10;
                                i8 = -1;
                                break;
                            } else {
                                iZzd = zzdt.zza(bArr2, iZzk, zzdsVar2);
                                unsafe2.putObject(obj2, j5, zzdsVar2.zzc);
                                i22 |= i28;
                                iZzi = iZzd;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                                break;
                            }
                        case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 0) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe2;
                                i9 = i10;
                                i8 = -1;
                                break;
                            } else {
                                iZzd = zzdt.zzj(bArr2, iZzk, zzdsVar2);
                                unsafe2.putInt(obj2, j5, zzdsVar2.zza);
                                i22 |= i28;
                                iZzi = iZzd;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                                break;
                            }
                        case 15:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 0) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe2;
                                i9 = i10;
                                i8 = -1;
                                break;
                            } else {
                                iZzd = zzdt.zzj(bArr2, iZzk, zzdsVar2);
                                unsafe2.putInt(obj2, j5, zzei.zzb(zzdsVar2.zza));
                                i22 |= i28;
                                iZzi = iZzd;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                                break;
                            }
                        case 16:
                            if (i25 != 0) {
                                i7 = i24;
                                i10 = iZzr;
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe2;
                                i9 = i10;
                                i8 = -1;
                                break;
                            } else {
                                zzdsVar2 = zzdsVar;
                                iZzm = zzdt.zzm(bArr2, iZzk, zzdsVar2);
                                i10 = iZzr;
                                i7 = i24;
                                i12 = 1048575;
                                unsafe2.putLong(obj, j5, zzei.zzc(zzdsVar2.zzb));
                                i22 |= i28;
                                iZzi = iZzm;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                                break;
                            }
                        default:
                            i7 = i24;
                            i10 = iZzr;
                            i11 = iZzk;
                            i6 = i11;
                            unsafe = unsafe2;
                            i9 = i10;
                            i8 = -1;
                            break;
                    }
                } else {
                    zzdsVar2 = zzdsVar;
                    i10 = iZzr;
                    int i30 = iZzk;
                    i12 = 1048575;
                    i7 = i24;
                    if (iZzu == 27) {
                        if (i25 == 2) {
                            zzey zzeyVarZzd = (zzey) unsafe2.getObject(obj2, j5);
                            if (!zzeyVarZzd.zzc()) {
                                int size = zzeyVarZzd.size();
                                zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j5, zzeyVarZzd);
                            }
                            iZzi = zzdt.zze(zzfzVar.zzy(i10), b5, bArr, i30, i5, zzeyVarZzd, zzdsVar);
                            i22 = i22;
                            i21 = i10;
                            i19 = i7;
                            i17 = i12;
                            i18 = -1;
                        } else {
                            i13 = i30;
                            i14 = i22;
                            i15 = i20;
                            unsafe = unsafe2;
                            i9 = i10;
                            i8 = -1;
                        }
                    } else if (iZzu <= 49) {
                        i14 = i22;
                        i15 = i20;
                        i8 = -1;
                        unsafe = unsafe2;
                        i9 = i10;
                        iZzi = zzp(obj, bArr, i30, i5, b5, i7, i25, i10, i26, iZzu, j5, zzdsVar);
                        if (iZzi != i30) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i16 = i5;
                            zzdsVar2 = zzdsVar;
                            i20 = i15;
                            i18 = i8;
                            i19 = i7;
                            i22 = i14;
                            i21 = i9;
                            unsafe2 = unsafe;
                            i17 = 1048575;
                            zzfzVar = this;
                        } else {
                            i6 = iZzi;
                            i20 = i15;
                            i22 = i14;
                        }
                    } else {
                        i13 = i30;
                        i14 = i22;
                        i15 = i20;
                        unsafe = unsafe2;
                        i9 = i10;
                        i8 = -1;
                        if (iZzu != 50) {
                            iZzi = zzn(obj, bArr, i13, i5, b5, i7, i25, i26, iZzu, j5, i9, zzdsVar);
                            if (iZzi != i13) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i16 = i5;
                                zzdsVar2 = zzdsVar;
                                i20 = i15;
                                i18 = i8;
                                i19 = i7;
                                i22 = i14;
                                i21 = i9;
                                unsafe2 = unsafe;
                                i17 = 1048575;
                                zzfzVar = this;
                            } else {
                                i6 = iZzi;
                                i20 = i15;
                                i22 = i14;
                            }
                        } else if (i25 == 2) {
                            iZzi = zzm(obj, bArr, i13, i5, i9, j5, zzdsVar);
                            if (iZzi != i13) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i16 = i5;
                                zzdsVar2 = zzdsVar;
                                i20 = i15;
                                i18 = i8;
                                i19 = i7;
                                i22 = i14;
                                i21 = i9;
                                unsafe2 = unsafe;
                                i17 = 1048575;
                                zzfzVar = this;
                            } else {
                                i6 = iZzi;
                                i20 = i15;
                                i22 = i14;
                            }
                        }
                    }
                    i6 = i13;
                    i20 = i15;
                    i22 = i14;
                }
            }
            iZzi = zzdt.zzi(b5, bArr, i6, i5, zzc(obj), zzdsVar);
            zzfzVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i16 = i5;
            zzdsVar2 = zzdsVar;
            i18 = i8;
            i19 = i7;
            i21 = i9;
            unsafe2 = unsafe;
            i17 = 1048575;
        }
        int i31 = i22;
        int i32 = i20;
        Unsafe unsafe3 = unsafe2;
        if (i32 != i17) {
            unsafe3.putInt(obj, i32, i31);
        }
        if (iZzi == i5) {
            return iZzi;
        }
        throw zzfa.zzd();
    }

    private final int zzp(Object obj, byte[] bArr, int i, int i5, int i6, int i7, int i8, int i9, long j5, int i10, long j6, zzds zzdsVar) throws zzfa {
        int iZzj;
        int iZzl;
        Unsafe unsafe = zzb;
        zzey zzeyVarZzd = (zzey) unsafe.getObject(obj, j6);
        if (!zzeyVarZzd.zzc()) {
            int size = zzeyVarZzd.size();
            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j6, zzeyVarZzd);
        }
        switch (i10) {
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 35:
                if (i8 == 2) {
                    zzej zzejVar = (zzej) zzeyVarZzd;
                    int iZzj2 = zzdt.zzj(bArr, i, zzdsVar);
                    int i11 = zzdsVar.zza + iZzj2;
                    while (iZzj2 < i11) {
                        zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj2)));
                        iZzj2 += 8;
                    }
                    if (iZzj2 == i11) {
                        return iZzj2;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 1) {
                    zzej zzejVar2 = (zzej) zzeyVarZzd;
                    zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i)));
                    int i12 = i + 8;
                    while (i12 < i5) {
                        int iZzj3 = zzdt.zzj(bArr, i12, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return i12;
                        }
                        zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj3)));
                        i12 = iZzj3 + 8;
                    }
                    return i12;
                }
                break;
            case 19:
            case 36:
                if (i8 == 2) {
                    zzeq zzeqVar = (zzeq) zzeyVarZzd;
                    int iZzj4 = zzdt.zzj(bArr, i, zzdsVar);
                    int i13 = zzdsVar.zza + iZzj4;
                    while (iZzj4 < i13) {
                        zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj4)));
                        iZzj4 += 4;
                    }
                    if (iZzj4 == i13) {
                        return iZzj4;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 5) {
                    zzeq zzeqVar2 = (zzeq) zzeyVarZzd;
                    zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i)));
                    int i14 = i + 4;
                    while (i14 < i5) {
                        int iZzj5 = zzdt.zzj(bArr, i14, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return i14;
                        }
                        zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj5)));
                        i14 = iZzj5 + 4;
                    }
                    return i14;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i8 == 2) {
                    zzfl zzflVar = (zzfl) zzeyVarZzd;
                    int iZzj6 = zzdt.zzj(bArr, i, zzdsVar);
                    int i15 = zzdsVar.zza + iZzj6;
                    while (iZzj6 < i15) {
                        iZzj6 = zzdt.zzm(bArr, iZzj6, zzdsVar);
                        zzflVar.zze(zzdsVar.zzb);
                    }
                    if (iZzj6 == i15) {
                        return iZzj6;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 0) {
                    zzfl zzflVar2 = (zzfl) zzeyVarZzd;
                    int iZzm = zzdt.zzm(bArr, i, zzdsVar);
                    zzflVar2.zze(zzdsVar.zzb);
                    while (iZzm < i5) {
                        int iZzj7 = zzdt.zzj(bArr, iZzm, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzdt.zzm(bArr, iZzj7, zzdsVar);
                        zzflVar2.zze(zzdsVar.zzb);
                    }
                    return iZzm;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i8 == 2) {
                    return zzdt.zzf(bArr, i, zzeyVarZzd, zzdsVar);
                }
                if (i8 == 0) {
                    return zzdt.zzl(i6, bArr, i, i5, zzeyVarZzd, zzdsVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i8 == 2) {
                    zzfl zzflVar3 = (zzfl) zzeyVarZzd;
                    int iZzj8 = zzdt.zzj(bArr, i, zzdsVar);
                    int i16 = zzdsVar.zza + iZzj8;
                    while (iZzj8 < i16) {
                        zzflVar3.zze(zzdt.zzn(bArr, iZzj8));
                        iZzj8 += 8;
                    }
                    if (iZzj8 == i16) {
                        return iZzj8;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 1) {
                    zzfl zzflVar4 = (zzfl) zzeyVarZzd;
                    zzflVar4.zze(zzdt.zzn(bArr, i));
                    int i17 = i + 8;
                    while (i17 < i5) {
                        int iZzj9 = zzdt.zzj(bArr, i17, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return i17;
                        }
                        zzflVar4.zze(zzdt.zzn(bArr, iZzj9));
                        i17 = iZzj9 + 8;
                    }
                    return i17;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i8 == 2) {
                    zzev zzevVar = (zzev) zzeyVarZzd;
                    int iZzj10 = zzdt.zzj(bArr, i, zzdsVar);
                    int i18 = zzdsVar.zza + iZzj10;
                    while (iZzj10 < i18) {
                        zzevVar.zze(zzdt.zzb(bArr, iZzj10));
                        iZzj10 += 4;
                    }
                    if (iZzj10 == i18) {
                        return iZzj10;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 5) {
                    zzev zzevVar2 = (zzev) zzeyVarZzd;
                    zzevVar2.zze(zzdt.zzb(bArr, i));
                    int i19 = i + 4;
                    while (i19 < i5) {
                        int iZzj11 = zzdt.zzj(bArr, i19, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return i19;
                        }
                        zzevVar2.zze(zzdt.zzb(bArr, iZzj11));
                        i19 = iZzj11 + 4;
                    }
                    return i19;
                }
                break;
            case 25:
            case 42:
                if (i8 == 2) {
                    zzdu zzduVar = (zzdu) zzeyVarZzd;
                    int iZzj12 = zzdt.zzj(bArr, i, zzdsVar);
                    int i20 = zzdsVar.zza + iZzj12;
                    while (iZzj12 < i20) {
                        iZzj12 = zzdt.zzm(bArr, iZzj12, zzdsVar);
                        zzduVar.zze(zzdsVar.zzb != 0);
                    }
                    if (iZzj12 == i20) {
                        return iZzj12;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 0) {
                    zzdu zzduVar2 = (zzdu) zzeyVarZzd;
                    int iZzm2 = zzdt.zzm(bArr, i, zzdsVar);
                    zzduVar2.zze(zzdsVar.zzb != 0);
                    while (iZzm2 < i5) {
                        int iZzj13 = zzdt.zzj(bArr, iZzm2, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzdt.zzm(bArr, iZzj13, zzdsVar);
                        zzduVar2.zze(zzdsVar.zzb != 0);
                    }
                    return iZzm2;
                }
                break;
            case 26:
                if (i8 == 2) {
                    if ((j5 & 536870912) == 0) {
                        int iZzj14 = zzdt.zzj(bArr, i, zzdsVar);
                        int i21 = zzdsVar.zza;
                        if (i21 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i21 == 0) {
                            zzeyVarZzd.add("");
                        } else {
                            zzeyVarZzd.add(new String(bArr, iZzj14, i21, zzez.zzb));
                            iZzj14 += i21;
                        }
                        while (iZzj14 < i5) {
                            int iZzj15 = zzdt.zzj(bArr, iZzj14, zzdsVar);
                            if (i6 != zzdsVar.zza) {
                                return iZzj14;
                            }
                            iZzj14 = zzdt.zzj(bArr, iZzj15, zzdsVar);
                            int i22 = zzdsVar.zza;
                            if (i22 < 0) {
                                throw zzfa.zzc();
                            }
                            if (i22 == 0) {
                                zzeyVarZzd.add("");
                            } else {
                                zzeyVarZzd.add(new String(bArr, iZzj14, i22, zzez.zzb));
                                iZzj14 += i22;
                            }
                        }
                        return iZzj14;
                    }
                    int iZzj16 = zzdt.zzj(bArr, i, zzdsVar);
                    int i23 = zzdsVar.zza;
                    if (i23 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i23 == 0) {
                        zzeyVarZzd.add("");
                        iZzj = iZzj16;
                    } else {
                        iZzj = iZzj16 + i23;
                        if (!zzhm.zzd(bArr, iZzj16, iZzj)) {
                            throw zzfa.zzb();
                        }
                        zzeyVarZzd.add(new String(bArr, iZzj16, i23, zzez.zzb));
                    }
                    while (iZzj < i5) {
                        int iZzj17 = zzdt.zzj(bArr, iZzj, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return iZzj;
                        }
                        iZzj = zzdt.zzj(bArr, iZzj17, zzdsVar);
                        int i24 = zzdsVar.zza;
                        if (i24 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i24 == 0) {
                            zzeyVarZzd.add("");
                        } else {
                            int i25 = iZzj + i24;
                            if (!zzhm.zzd(bArr, iZzj, i25)) {
                                throw zzfa.zzb();
                            }
                            zzeyVarZzd.add(new String(bArr, iZzj, i24, zzez.zzb));
                            iZzj = i25;
                        }
                    }
                    return iZzj;
                }
                break;
            case 27:
                if (i8 == 2) {
                    return zzdt.zze(zzy(i9), i6, bArr, i, i5, zzeyVarZzd, zzdsVar);
                }
                break;
            case 28:
                if (i8 == 2) {
                    int iZzj18 = zzdt.zzj(bArr, i, zzdsVar);
                    int i26 = zzdsVar.zza;
                    if (i26 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i26 > bArr.length - iZzj18) {
                        throw zzfa.zzf();
                    }
                    if (i26 == 0) {
                        zzeyVarZzd.add(zzee.zzb);
                    } else {
                        zzeyVarZzd.add(zzee.zzk(bArr, iZzj18, i26));
                        iZzj18 += i26;
                    }
                    while (iZzj18 < i5) {
                        int iZzj19 = zzdt.zzj(bArr, iZzj18, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return iZzj18;
                        }
                        iZzj18 = zzdt.zzj(bArr, iZzj19, zzdsVar);
                        int i27 = zzdsVar.zza;
                        if (i27 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i27 > bArr.length - iZzj18) {
                            throw zzfa.zzf();
                        }
                        if (i27 == 0) {
                            zzeyVarZzd.add(zzee.zzb);
                        } else {
                            zzeyVarZzd.add(zzee.zzk(bArr, iZzj18, i27));
                            iZzj18 += i27;
                        }
                    }
                    return iZzj18;
                }
                break;
            case 30:
            case 44:
                if (i8 == 2) {
                    iZzl = zzdt.zzf(bArr, i, zzeyVarZzd, zzdsVar);
                } else if (i8 == 0) {
                    iZzl = zzdt.zzl(i6, bArr, i, i5, zzeyVarZzd, zzdsVar);
                }
                zzeu zzeuVar = (zzeu) obj;
                zzgz zzgzVar = zzeuVar.zzc;
                if (zzgzVar == zzgz.zza()) {
                    zzgzVar = null;
                }
                Object objZzd = zzgj.zzd(i7, zzeyVarZzd, zzx(i9), zzgzVar, this.zzm);
                if (objZzd == null) {
                    return iZzl;
                }
                zzeuVar.zzc = (zzgz) objZzd;
                return iZzl;
            case 33:
            case 47:
                if (i8 == 2) {
                    zzev zzevVar3 = (zzev) zzeyVarZzd;
                    int iZzj20 = zzdt.zzj(bArr, i, zzdsVar);
                    int i28 = zzdsVar.zza + iZzj20;
                    while (iZzj20 < i28) {
                        iZzj20 = zzdt.zzj(bArr, iZzj20, zzdsVar);
                        zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                    }
                    if (iZzj20 == i28) {
                        return iZzj20;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 0) {
                    zzev zzevVar4 = (zzev) zzeyVarZzd;
                    int iZzj21 = zzdt.zzj(bArr, i, zzdsVar);
                    zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    while (iZzj21 < i5) {
                        int iZzj22 = zzdt.zzj(bArr, iZzj21, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return iZzj21;
                        }
                        iZzj21 = zzdt.zzj(bArr, iZzj22, zzdsVar);
                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    }
                    return iZzj21;
                }
                break;
            case 34:
            case 48:
                if (i8 == 2) {
                    zzfl zzflVar5 = (zzfl) zzeyVarZzd;
                    int iZzj23 = zzdt.zzj(bArr, i, zzdsVar);
                    int i29 = zzdsVar.zza + iZzj23;
                    while (iZzj23 < i29) {
                        iZzj23 = zzdt.zzm(bArr, iZzj23, zzdsVar);
                        zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    if (iZzj23 == i29) {
                        return iZzj23;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 0) {
                    zzfl zzflVar6 = (zzfl) zzeyVarZzd;
                    int iZzm3 = zzdt.zzm(bArr, i, zzdsVar);
                    zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    while (iZzm3 < i5) {
                        int iZzj24 = zzdt.zzj(bArr, iZzm3, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzdt.zzm(bArr, iZzj24, zzdsVar);
                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    return iZzm3;
                }
                break;
            default:
                if (i8 == 3) {
                    zzgh zzghVarZzy = zzy(i9);
                    int i30 = (i6 & (-8)) | 4;
                    int iZzc = zzdt.zzc(zzghVarZzy, bArr, i, i5, i30, zzdsVar);
                    zzeyVarZzd.add(zzdsVar.zzc);
                    while (iZzc < i5) {
                        int iZzj25 = zzdt.zzj(bArr, iZzc, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzdt.zzc(zzghVarZzy, bArr, iZzj25, i5, i30, zzdsVar);
                        zzeyVarZzd.add(zzdsVar.zzc);
                    }
                    return iZzc;
                }
                break;
        }
        return i;
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, 0);
    }

    private final int zzr(int i, int i5) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, i5);
    }

    private final int zzs(int i) {
        return this.zzc[i + 2];
    }

    private final int zzt(int i, int i5) {
        int length = (this.zzc.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i8 = this.zzc[i7];
            if (i == i8) {
                return i7;
            }
            if (i < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzv(int i) {
        return this.zzc[i + 1];
    }

    private static long zzw(Object obj, long j5) {
        return ((Long) zzhi.zzf(obj, j5)).longValue();
    }

    private final zzex zzx(int i) {
        int i5 = i / 3;
        return (zzex) this.zzd[i5 + i5 + 1];
    }

    private final zzgh zzy(int i) {
        int i5 = i / 3;
        int i6 = i5 + i5;
        zzgh zzghVar = (zzgh) this.zzd[i6];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzghVarZzb = zzge.zza().zzb((Class) this.zzd[i6 + 1]);
        this.zzd[i6] = zzghVarZzb;
        return zzghVarZzb;
    }

    private final Object zzz(int i) {
        int i5 = i / 3;
        return this.zzd[i5 + i5];
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i;
        int iZzc;
        int i5;
        int iZzc2;
        int length = this.zzc.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iZzv = zzv(i7);
            int i8 = this.zzc[i7];
            long j5 = 1048575 & iZzv;
            int iHashCode = 37;
            switch (zzu(iZzv)) {
                case 0:
                    i = i6 * 53;
                    iZzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j5)));
                    i6 = iZzc + i;
                    break;
                case 1:
                    i = i6 * 53;
                    iZzc = Float.floatToIntBits(zzhi.zzb(obj, j5));
                    i6 = iZzc + i;
                    break;
                case 2:
                    i = i6 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j5));
                    i6 = iZzc + i;
                    break;
                case 3:
                    i = i6 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j5));
                    i6 = iZzc + i;
                    break;
                case 4:
                    i5 = i6 * 53;
                    iZzc2 = zzhi.zzc(obj, j5);
                    i6 = i5 + iZzc2;
                    break;
                case 5:
                    i = i6 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j5));
                    i6 = iZzc + i;
                    break;
                case 6:
                    i5 = i6 * 53;
                    iZzc2 = zzhi.zzc(obj, j5);
                    i6 = i5 + iZzc2;
                    break;
                case 7:
                    i = i6 * 53;
                    iZzc = zzez.zza(zzhi.zzt(obj, j5));
                    i6 = iZzc + i;
                    break;
                case 8:
                    i = i6 * 53;
                    iZzc = ((String) zzhi.zzf(obj, j5)).hashCode();
                    i6 = iZzc + i;
                    break;
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    Object objZzf = zzhi.zzf(obj, j5);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i6 = (i6 * 53) + iHashCode;
                    break;
                case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    i = i6 * 53;
                    iZzc = zzhi.zzf(obj, j5).hashCode();
                    i6 = iZzc + i;
                    break;
                case 11:
                    i5 = i6 * 53;
                    iZzc2 = zzhi.zzc(obj, j5);
                    i6 = i5 + iZzc2;
                    break;
                case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    i5 = i6 * 53;
                    iZzc2 = zzhi.zzc(obj, j5);
                    i6 = i5 + iZzc2;
                    break;
                case 13:
                    i5 = i6 * 53;
                    iZzc2 = zzhi.zzc(obj, j5);
                    i6 = i5 + iZzc2;
                    break;
                case 14:
                    i = i6 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j5));
                    i6 = iZzc + i;
                    break;
                case 15:
                    i5 = i6 * 53;
                    iZzc2 = zzhi.zzc(obj, j5);
                    i6 = i5 + iZzc2;
                    break;
                case 16:
                    i = i6 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j5));
                    i6 = iZzc + i;
                    break;
                case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    Object objZzf2 = zzhi.zzf(obj, j5);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i6 = (i6 * 53) + iHashCode;
                    break;
                case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i6 * 53;
                    iZzc = zzhi.zzf(obj, j5).hashCode();
                    i6 = iZzc + i;
                    break;
                case 50:
                    i = i6 * 53;
                    iZzc = zzhi.zzf(obj, j5).hashCode();
                    i6 = iZzc + i;
                    break;
                case 51:
                    if (zzJ(obj, i8, i7)) {
                        i = i6 * 53;
                        iZzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j5)).doubleValue()));
                        i6 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzJ(obj, i8, i7)) {
                        i = i6 * 53;
                        iZzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j5)).floatValue());
                        i6 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzJ(obj, i8, i7)) {
                        i = i6 * 53;
                        iZzc = zzez.zzc(zzw(obj, j5));
                        i6 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzJ(obj, i8, i7)) {
                        i = i6 * 53;
                        iZzc = zzez.zzc(zzw(obj, j5));
                        i6 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzJ(obj, i8, i7)) {
                        i5 = i6 * 53;
                        iZzc2 = zzl(obj, j5);
                        i6 = i5 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzJ(obj, i8, i7)) {
                        i = i6 * 53;
                        iZzc = zzez.zzc(zzw(obj, j5));
                        i6 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzJ(obj, i8, i7)) {
                        i5 = i6 * 53;
                        iZzc2 = zzl(obj, j5);
                        i6 = i5 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzJ(obj, i8, i7)) {
                        i = i6 * 53;
                        iZzc = zzez.zza(((Boolean) zzhi.zzf(obj, j5)).booleanValue());
                        i6 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzJ(obj, i8, i7)) {
                        i = i6 * 53;
                        iZzc = ((String) zzhi.zzf(obj, j5)).hashCode();
                        i6 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzJ(obj, i8, i7)) {
                        i = i6 * 53;
                        iZzc = zzhi.zzf(obj, j5).hashCode();
                        i6 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzJ(obj, i8, i7)) {
                        i = i6 * 53;
                        iZzc = zzhi.zzf(obj, j5).hashCode();
                        i6 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzJ(obj, i8, i7)) {
                        i5 = i6 * 53;
                        iZzc2 = zzl(obj, j5);
                        i6 = i5 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzJ(obj, i8, i7)) {
                        i5 = i6 * 53;
                        iZzc2 = zzl(obj, j5);
                        i6 = i5 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzJ(obj, i8, i7)) {
                        i5 = i6 * 53;
                        iZzc2 = zzl(obj, j5);
                        i6 = i5 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzJ(obj, i8, i7)) {
                        i = i6 * 53;
                        iZzc = zzez.zzc(zzw(obj, j5));
                        i6 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzJ(obj, i8, i7)) {
                        i5 = i6 * 53;
                        iZzc2 = zzl(obj, j5);
                        i6 = i5 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzJ(obj, i8, i7)) {
                        i = i6 * 53;
                        iZzc = zzez.zzc(zzw(obj, j5));
                        i6 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzJ(obj, i8, i7)) {
                        i = i6 * 53;
                        iZzc = zzhi.zzf(obj, j5).hashCode();
                        i6 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this.zzm.zza(obj).hashCode() + (i6 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x03b8, code lost:
    
        if (r0 != r19) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03ba, code lost:
    
        r15 = r31;
        r14 = r32;
        r12 = r33;
        r13 = r35;
        r11 = r36;
        r9 = r37;
        r2 = r17;
        r3 = r18;
        r1 = r20;
        r5 = r22;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03d4, code lost:
    
        r7 = r36;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03fa, code lost:
    
        if (r0 != r15) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x041d, code lost:
    
        if (r0 != r15) goto L123;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x008f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.auth.zzds r37) throws com.google.android.gms.internal.auth.zzfa {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzds):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i;
        int i5 = this.zzj;
        while (true) {
            i = this.zzk;
            if (i5 >= i) {
                break;
            }
            long jZzv = zzv(this.zzi[i5]) & 1048575;
            Object objZzf = zzhi.zzf(obj, jZzv);
            if (objZzf != null) {
                ((zzfq) objZzf).zzc();
                zzhi.zzp(obj, jZzv, objZzf);
            }
            i5++;
        }
        int length = this.zzi.length;
        while (i < length) {
            this.zzl.zza(obj, this.zzi[i]);
            i++;
        }
        this.zzm.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzv = zzv(i);
            long j5 = 1048575 & iZzv;
            int i5 = this.zzc[i];
            switch (zzu(iZzv)) {
                case 0:
                    if (zzG(obj2, i)) {
                        zzhi.zzl(obj, j5, zzhi.zza(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzG(obj2, i)) {
                        zzhi.zzm(obj, j5, zzhi.zzb(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j5, zzhi.zzd(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j5, zzhi.zzd(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j5, zzhi.zzc(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j5, zzhi.zzd(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j5, zzhi.zzc(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzG(obj2, i)) {
                        zzhi.zzk(obj, j5, zzhi.zzt(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j5, zzhi.zzf(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    zzB(obj, obj2, i);
                    break;
                case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j5, zzhi.zzf(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j5, zzhi.zzc(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j5, zzhi.zzc(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j5, zzhi.zzc(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j5, zzhi.zzd(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j5, zzhi.zzc(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j5, zzhi.zzd(obj2, j5));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    zzB(obj, obj2, i);
                    break;
                case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j5);
                    break;
                case 50:
                    zzgj.zzi(this.zzp, obj, obj2, j5);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzJ(obj2, i5, i)) {
                        zzhi.zzp(obj, j5, zzhi.zzf(obj2, j5));
                        zzE(obj, i5, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzJ(obj2, i5, i)) {
                        zzhi.zzp(obj, j5, zzhi.zzf(obj2, j5));
                        zzE(obj, i5, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i, int i5, zzds zzdsVar) throws zzfa {
        if (this.zzh) {
            zzo(obj, bArr, i, i5, zzdsVar);
        } else {
            zzb(obj, bArr, i, i5, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzh;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzv = zzv(i);
            long j5 = iZzv & 1048575;
            switch (zzu(iZzv)) {
                case 0:
                    if (!zzF(obj, obj2, i) || Double.doubleToLongBits(zzhi.zza(obj, j5)) != Double.doubleToLongBits(zzhi.zza(obj2, j5))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzF(obj, obj2, i) || Float.floatToIntBits(zzhi.zzb(obj, j5)) != Float.floatToIntBits(zzhi.zzb(obj2, j5))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j5) != zzhi.zzd(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j5) != zzhi.zzd(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j5) != zzhi.zzc(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j5) != zzhi.zzd(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j5) != zzhi.zzc(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzF(obj, obj2, i) || zzhi.zzt(obj, j5) != zzhi.zzt(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j5), zzhi.zzf(obj2, j5))) {
                        return false;
                    }
                    continue;
                    break;
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j5), zzhi.zzf(obj2, j5))) {
                        return false;
                    }
                    continue;
                    break;
                case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j5), zzhi.zzf(obj2, j5))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j5) != zzhi.zzc(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j5) != zzhi.zzc(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j5) != zzhi.zzc(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j5) != zzhi.zzd(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j5) != zzhi.zzc(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j5) != zzhi.zzd(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j5), zzhi.zzf(obj2, j5))) {
                        return false;
                    }
                    continue;
                    break;
                case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j5), zzhi.zzf(obj2, j5));
                    break;
                case 50:
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j5), zzhi.zzf(obj2, j5));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzs = zzs(i) & 1048575;
                    if (zzhi.zzc(obj, jZzs) != zzhi.zzc(obj2, jZzs) || !zzgj.zzh(zzhi.zzf(obj, j5), zzhi.zzf(obj2, j5))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzh) {
                return false;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    @Override // com.google.android.gms.internal.auth.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzi(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzi(java.lang.Object):boolean");
    }
}
