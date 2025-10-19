package com.google.android.recaptcha.internal;

import N2.j0;
import N2.n0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzol.smali */
final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i, int i5, zzoi zzoiVar, boolean z4, int[] iArr2, int i6, int i7, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i5;
        this.zzi = zzoiVar instanceof zznd;
        boolean z5 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z5 = true;
        }
        this.zzh = z5;
        this.zzj = iArr2;
        this.zzk = i6;
        this.zzl = i7;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i) {
        zzow zzowVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i5) {
        zzow zzowVarZzx = zzx(i5);
        if (!zzR(obj, i, i5)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i5) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j5 = iZzu;
            Object object = unsafe.getObject(obj2, j5);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j5, objZze);
                } else {
                    unsafe.putObject(obj, j5, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j5);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j5, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i5 = this.zzc[i];
        if (zzR(obj2, i5, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j5 = iZzu;
            Object object = unsafe.getObject(obj2, j5);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i);
            if (!zzR(obj, i5, i)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j5, objZze);
                } else {
                    unsafe.putObject(obj, j5, object);
                }
                zzI(obj, i5, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j5);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j5, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzov zzovVar) {
        long j5 = i & 1048575;
        if (zzM(i)) {
            zzps.zzs(obj, j5, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j5, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j5, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j5 = 1048575 & iZzr;
        if (j5 == 1048575) {
            return;
        }
        zzps.zzq(obj, j5, (1 << (iZzr >>> 20)) | zzps.zzc(obj, j5));
    }

    private final void zzI(Object obj, int i, int i5) {
        zzps.zzq(obj, zzr(i5) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i5, Object obj2) {
        zzb.putObject(obj, zzu(i5) & 1048575, obj2);
        zzI(obj, i, i5);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzr = zzr(i);
        long j5 = iZzr & 1048575;
        if (j5 != 1048575) {
            return ((1 << (iZzr >>> 20)) & zzps.zzc(obj, j5)) != 0;
        }
        int iZzu = zzu(i);
        long j6 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j6)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j6)) != 0;
            case 2:
                return zzps.zzd(obj, j6) != 0;
            case 3:
                return zzps.zzd(obj, j6) != 0;
            case 4:
                return zzps.zzc(obj, j6) != 0;
            case 5:
                return zzps.zzd(obj, j6) != 0;
            case 6:
                return zzps.zzc(obj, j6) != 0;
            case 7:
                return zzps.zzw(obj, j6);
            case 8:
                Object objZzf = zzps.zzf(obj, j6);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzle) {
                    return !zzle.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return zzps.zzf(obj, j6) != null;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return !zzle.zzb.equals(zzps.zzf(obj, j6));
            case 11:
                return zzps.zzc(obj, j6) != 0;
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return zzps.zzc(obj, j6) != 0;
            case 13:
                return zzps.zzc(obj, j6) != 0;
            case 14:
                return zzps.zzd(obj, j6) != 0;
            case 15:
                return zzps.zzc(obj, j6) != 0;
            case 16:
                return zzps.zzd(obj, j6) != 0;
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return zzps.zzf(obj, j6) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i5, int i6, int i7) {
        return i5 == 1048575 ? zzN(obj, i) : (i6 & i7) != 0;
    }

    private static boolean zzP(Object obj, int i, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i5) {
        return zzps.zzc(obj, (long) (zzr(i5) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j5) {
        return ((Boolean) zzps.zzf(obj, j5)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzpy zzpyVar) {
        if (obj instanceof String) {
            zzpyVar.zzG(i, (String) obj);
        } else {
            zzpyVar.zzd(i, (zzle) obj);
        }
    }

    public static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzpmVarZzf = zzpm.zzf();
        zzndVar.zzc = zzpmVarZzf;
        return zzpmVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0395  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.recaptcha.internal.zzol zzm(java.lang.Class r32, com.google.android.recaptcha.internal.zzof r33, com.google.android.recaptcha.internal.zzoo r34, com.google.android.recaptcha.internal.zznv r35, com.google.android.recaptcha.internal.zzpl r36, com.google.android.recaptcha.internal.zzmp r37, com.google.android.recaptcha.internal.zzod r38) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzof, com.google.android.recaptcha.internal.zzoo, com.google.android.recaptcha.internal.zznv, com.google.android.recaptcha.internal.zzpl, com.google.android.recaptcha.internal.zzmp, com.google.android.recaptcha.internal.zzod):com.google.android.recaptcha.internal.zzol");
    }

    private static double zzn(Object obj, long j5) {
        return ((Double) zzps.zzf(obj, j5)).doubleValue();
    }

    private static float zzo(Object obj, long j5) {
        return ((Float) zzps.zzf(obj, j5)).floatValue();
    }

    private static int zzp(Object obj, long j5) {
        return ((Integer) zzps.zzf(obj, j5)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i5) {
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

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j5) {
        return ((Long) zzps.zzf(obj, j5)).longValue();
    }

    private final zznh zzw(int i) {
        int i5 = i / 3;
        return (zznh) this.zzd[i5 + i5 + 1];
    }

    private final zzow zzx(int i) {
        Object[] objArr = this.zzd;
        int i5 = i / 3;
        int i6 = i5 + i5;
        zzow zzowVar = (zzow) objArr[i6];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzowVarZzb = zzos.zza().zzb((Class) objArr[i6 + 1]);
        this.zzd[i6] = zzowVarZzb;
        return zzowVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzpl zzplVar, Object obj3) {
        int i5 = this.zzc[i];
        Object objZzf = zzps.zzf(obj, zzu(i) & 1048575);
        if (objZzf == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i5 = i / 3;
        return this.zzd[i5 + i5];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r4v28 ?? I:int), method size: 2190
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zza(java.lang.Object):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i5;
        int iFloatToIntBits;
        int iZzc;
        int i6;
        int i7 = 0;
        for (int i8 = 0; i8 < this.zzc.length; i8 += 3) {
            int iZzu = zzu(i8);
            int[] iArr = this.zzc;
            int i9 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i10 = iArr[i8];
            long j5 = i9;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i = i7 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j5));
                    byte[] bArr = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iZzc;
                    break;
                case 1:
                    i5 = i7 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j5));
                    i7 = iFloatToIntBits + i5;
                    break;
                case 2:
                    i = i7 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j5);
                    byte[] bArr2 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iZzc;
                    break;
                case 3:
                    i = i7 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j5);
                    byte[] bArr3 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iZzc;
                    break;
                case 4:
                    i = i7 * 53;
                    iZzc = zzps.zzc(obj, j5);
                    i7 = i + iZzc;
                    break;
                case 5:
                    i = i7 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j5);
                    byte[] bArr4 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iZzc;
                    break;
                case 6:
                    i = i7 * 53;
                    iZzc = zzps.zzc(obj, j5);
                    i7 = i + iZzc;
                    break;
                case 7:
                    i5 = i7 * 53;
                    iFloatToIntBits = zznl.zza(zzps.zzw(obj, j5));
                    i7 = iFloatToIntBits + i5;
                    break;
                case 8:
                    i5 = i7 * 53;
                    iFloatToIntBits = ((String) zzps.zzf(obj, j5)).hashCode();
                    i7 = iFloatToIntBits + i5;
                    break;
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    i6 = i7 * 53;
                    Object objZzf = zzps.zzf(obj, j5);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i7 = i6 + iHashCode;
                    break;
                case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    i5 = i7 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j5).hashCode();
                    i7 = iFloatToIntBits + i5;
                    break;
                case 11:
                    i = i7 * 53;
                    iZzc = zzps.zzc(obj, j5);
                    i7 = i + iZzc;
                    break;
                case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    i = i7 * 53;
                    iZzc = zzps.zzc(obj, j5);
                    i7 = i + iZzc;
                    break;
                case 13:
                    i = i7 * 53;
                    iZzc = zzps.zzc(obj, j5);
                    i7 = i + iZzc;
                    break;
                case 14:
                    i = i7 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j5);
                    byte[] bArr5 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iZzc;
                    break;
                case 15:
                    i = i7 * 53;
                    iZzc = zzps.zzc(obj, j5);
                    i7 = i + iZzc;
                    break;
                case 16:
                    i = i7 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j5);
                    byte[] bArr6 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iZzc;
                    break;
                case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i6 = i7 * 53;
                    Object objZzf2 = zzps.zzf(obj, j5);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i7 = i6 + iHashCode;
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
                    i5 = i7 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j5).hashCode();
                    i7 = iFloatToIntBits + i5;
                    break;
                case 50:
                    i5 = i7 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j5).hashCode();
                    i7 = iFloatToIntBits + i5;
                    break;
                case 51:
                    if (zzR(obj, i10, i8)) {
                        i = i7 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j5));
                        byte[] bArr7 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i10, i8)) {
                        i5 = i7 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j5));
                        i7 = iFloatToIntBits + i5;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i10, i8)) {
                        i = i7 * 53;
                        jDoubleToLongBits = zzv(obj, j5);
                        byte[] bArr8 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i10, i8)) {
                        i = i7 * 53;
                        jDoubleToLongBits = zzv(obj, j5);
                        byte[] bArr9 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i10, i8)) {
                        i = i7 * 53;
                        iZzc = zzp(obj, j5);
                        i7 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i10, i8)) {
                        i = i7 * 53;
                        jDoubleToLongBits = zzv(obj, j5);
                        byte[] bArr10 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i10, i8)) {
                        i = i7 * 53;
                        iZzc = zzp(obj, j5);
                        i7 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i10, i8)) {
                        i5 = i7 * 53;
                        iFloatToIntBits = zznl.zza(zzS(obj, j5));
                        i7 = iFloatToIntBits + i5;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i10, i8)) {
                        i5 = i7 * 53;
                        iFloatToIntBits = ((String) zzps.zzf(obj, j5)).hashCode();
                        i7 = iFloatToIntBits + i5;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i10, i8)) {
                        i5 = i7 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j5).hashCode();
                        i7 = iFloatToIntBits + i5;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i10, i8)) {
                        i5 = i7 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j5).hashCode();
                        i7 = iFloatToIntBits + i5;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i10, i8)) {
                        i = i7 * 53;
                        iZzc = zzp(obj, j5);
                        i7 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i10, i8)) {
                        i = i7 * 53;
                        iZzc = zzp(obj, j5);
                        i7 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i10, i8)) {
                        i = i7 * 53;
                        iZzc = zzp(obj, j5);
                        i7 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i10, i8)) {
                        i = i7 * 53;
                        jDoubleToLongBits = zzv(obj, j5);
                        byte[] bArr11 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i10, i8)) {
                        i = i7 * 53;
                        iZzc = zzp(obj, j5);
                        i7 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i10, i8)) {
                        i = i7 * 53;
                        jDoubleToLongBits = zzv(obj, j5);
                        byte[] bArr12 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i10, i8)) {
                        i5 = i7 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j5).hashCode();
                        i7 = iFloatToIntBits + i5;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = ((zznd) obj).zzc.hashCode() + (i7 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzna) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0e07, code lost:
    
        if (r11 == 1048575) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0e09, code lost:
    
        r36.putInt(r7, r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0e0f, code lost:
    
        r11 = r6.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0e14, code lost:
    
        if (r11 >= r6.zzl) goto L645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0e16, code lost:
    
        zzy(r34, r6.zzj[r11], null, r6.zzm, r34);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0e2b, code lost:
    
        if (r9 != 0) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0e2d, code lost:
    
        if (r8 != r14) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0e35, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0e36, code lost:
    
        if (r8 > r14) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0e38, code lost:
    
        if (r10 != r9) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0e3a, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0e40, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0cb9 A[PHI: r0 r2 r8 r10 r19 r24 r36
  0x0cb9: PHI (r0v102 int) = (r0v73 int), (r0v74 int), (r0v80 int), (r0v85 int), (r0v93 int), (r0v99 int), (r0v103 int) binds: [B:483:0x0ca2, B:480:0x0c7c, B:459:0x0bb4, B:443:0x0b61, B:424:0x0aa5, B:418:0x0a69, B:413:0x0a23] A[DONT_GENERATE, DONT_INLINE]
  0x0cb9: PHI (r2v96 com.google.android.recaptcha.internal.zzkt) = 
  (r2v79 com.google.android.recaptcha.internal.zzkt)
  (r2v80 com.google.android.recaptcha.internal.zzkt)
  (r2v86 com.google.android.recaptcha.internal.zzkt)
  (r2v89 com.google.android.recaptcha.internal.zzkt)
  (r2v92 com.google.android.recaptcha.internal.zzkt)
  (r2v94 com.google.android.recaptcha.internal.zzkt)
  (r2v97 com.google.android.recaptcha.internal.zzkt)
 binds: [B:483:0x0ca2, B:480:0x0c7c, B:459:0x0bb4, B:443:0x0b61, B:424:0x0aa5, B:418:0x0a69, B:413:0x0a23] A[DONT_GENERATE, DONT_INLINE]
  0x0cb9: PHI (r8v86 int) = (r8v61 int), (r8v62 int), (r8v68 int), (r8v71 int), (r8v75 int), (r8v80 int), (r8v87 int) binds: [B:483:0x0ca2, B:480:0x0c7c, B:459:0x0bb4, B:443:0x0b61, B:424:0x0aa5, B:418:0x0a69, B:413:0x0a23] A[DONT_GENERATE, DONT_INLINE]
  0x0cb9: PHI (r10v54 int) = (r10v21 int), (r10v22 int), (r10v28 int), (r10v33 int), (r10v43 int), (r10v49 int), (r10v55 int) binds: [B:483:0x0ca2, B:480:0x0c7c, B:459:0x0bb4, B:443:0x0b61, B:424:0x0aa5, B:418:0x0a69, B:413:0x0a23] A[DONT_GENERATE, DONT_INLINE]
  0x0cb9: PHI (r19v51 int) = (r19v30 int), (r19v31 int), (r19v37 int), (r19v40 int), (r19v44 int), (r19v48 int), (r19v52 int) binds: [B:483:0x0ca2, B:480:0x0c7c, B:459:0x0bb4, B:443:0x0b61, B:424:0x0aa5, B:418:0x0a69, B:413:0x0a23] A[DONT_GENERATE, DONT_INLINE]
  0x0cb9: PHI (r24v25 int) = (r24v7 int), (r24v8 int), (r24v14 int), (r24v17 int), (r24v19 int), (r24v22 int), (r24v26 int) binds: [B:483:0x0ca2, B:480:0x0c7c, B:459:0x0bb4, B:443:0x0b61, B:424:0x0aa5, B:418:0x0a69, B:413:0x0a23] A[DONT_GENERATE, DONT_INLINE]
  0x0cb9: PHI (r36v37 sun.misc.Unsafe) = 
  (r36v15 sun.misc.Unsafe)
  (r36v16 sun.misc.Unsafe)
  (r36v22 sun.misc.Unsafe)
  (r36v25 sun.misc.Unsafe)
  (r36v29 sun.misc.Unsafe)
  (r36v34 sun.misc.Unsafe)
  (r36v38 sun.misc.Unsafe)
 binds: [B:483:0x0ca2, B:480:0x0c7c, B:459:0x0bb4, B:443:0x0b61, B:424:0x0aa5, B:418:0x0a69, B:413:0x0a23] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0cbc  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0cd1  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0dd5  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0989 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:634:0x09a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.recaptcha.internal.zzkt r39) {
        /*
            Method dump skipped, instructions count: 3834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzQ(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zznd
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.recaptcha.internal.zznd r0 = (com.google.android.recaptcha.internal.zznd) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzJ(r2)
            r0.zza = r1
            r0.zzH()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L87
            int r2 = r7.zzu(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzt(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L71
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L71;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L84
        L3d:
            sun.misc.Unsafe r2 = com.google.android.recaptcha.internal.zzol.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L84
            r6 = r5
            com.google.android.recaptcha.internal.zzoc r6 = (com.google.android.recaptcha.internal.zzoc) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L84
        L4f:
            java.lang.Object r2 = com.google.android.recaptcha.internal.zzps.zzf(r8, r3)
            com.google.android.recaptcha.internal.zznk r2 = (com.google.android.recaptcha.internal.zznk) r2
            r2.zzb()
            goto L84
        L59:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzR(r8, r2, r1)
            if (r2 == 0) goto L84
            com.google.android.recaptcha.internal.zzow r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.recaptcha.internal.zzol.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L84
        L71:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L84
            com.google.android.recaptcha.internal.zzow r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.recaptcha.internal.zzol.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L84:
            int r1 = r1 + 3
            goto L1d
        L87:
            com.google.android.recaptcha.internal.zzpl r0 = r7.zzm
            r0.zzi(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L95
            com.google.android.recaptcha.internal.zzmp r7 = r7.zzn
            r7.zza(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            int i5 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i6 = iArr[i];
            long j5 = i5;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzps.zzo(obj, j5, zzps.zza(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzps.zzp(obj, j5, zzps.zzb(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j5, zzps.zzd(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j5, zzps.zzd(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j5, zzps.zzc(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j5, zzps.zzd(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j5, zzps.zzc(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzps.zzm(obj, j5, zzps.zzw(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzps.zzs(obj, j5, zzps.zzf(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    zzE(obj, obj2, i);
                    break;
                case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (zzN(obj2, i)) {
                        zzps.zzs(obj, j5, zzps.zzf(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j5, zzps.zzc(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j5, zzps.zzc(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j5, zzps.zzc(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j5, zzps.zzd(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j5, zzps.zzc(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j5, zzps.zzd(obj2, j5));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    zzE(obj, obj2, i);
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
                    zznk zznkVarZzd = (zznk) zzps.zzf(obj, j5);
                    zznk zznkVar = (zznk) zzps.zzf(obj2, j5);
                    int size = zznkVarZzd.size();
                    int size2 = zznkVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVarZzd.zzc()) {
                            zznkVarZzd = zznkVarZzd.zzd(size2 + size);
                        }
                        zznkVarZzd.addAll(zznkVar);
                    }
                    if (size > 0) {
                        zznkVar = zznkVarZzd;
                    }
                    zzps.zzs(obj, j5, zznkVar);
                    break;
                case 50:
                    int i7 = zzoy.zza;
                    zzps.zzs(obj, j5, zzod.zzb(zzps.zzf(obj, j5), zzps.zzf(obj2, j5)));
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
                    if (zzR(obj2, i6, i)) {
                        zzps.zzs(obj, j5, zzps.zzf(obj2, j5));
                        zzI(obj, i6, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i6, i)) {
                        zzps.zzs(obj, j5, zzps.zzf(obj2, j5));
                        zzI(obj, i6, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) {
        Object objValueOf;
        Object objZze;
        zzmoVar.getClass();
        zzD(obj);
        zzpl zzplVar = this.zzm;
        Object objZza = null;
        zzmt zzmtVarZzi = null;
        while (true) {
            try {
                int iZzc = zzovVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    int iZzu = zzu(iZzq);
                    try {
                    } catch (zznm unused) {
                        if (objZza == null) {
                            objZza = zzplVar.zza(obj);
                        }
                        if (!zzplVar.zzk(objZza, zzovVar, 0)) {
                            for (int i = this.zzk; i < this.zzl; i++) {
                                zzy(obj, this.zzj[i], objZza, zzplVar, obj);
                            }
                        }
                    }
                    switch (zzt(iZzu)) {
                        case 0:
                            zzps.zzo(obj, iZzu & 1048575, zzovVar.zza());
                            zzH(obj, iZzq);
                        case 1:
                            zzps.zzp(obj, iZzu & 1048575, zzovVar.zzb());
                            zzH(obj, iZzq);
                        case 2:
                            zzps.zzr(obj, iZzu & 1048575, zzovVar.zzl());
                            zzH(obj, iZzq);
                        case 3:
                            zzps.zzr(obj, iZzu & 1048575, zzovVar.zzo());
                            zzH(obj, iZzq);
                        case 4:
                            zzps.zzq(obj, iZzu & 1048575, zzovVar.zzg());
                            zzH(obj, iZzq);
                        case 5:
                            zzps.zzr(obj, iZzu & 1048575, zzovVar.zzk());
                            zzH(obj, iZzq);
                        case 6:
                            zzps.zzq(obj, iZzu & 1048575, zzovVar.zzf());
                            zzH(obj, iZzq);
                        case 7:
                            zzps.zzm(obj, iZzu & 1048575, zzovVar.zzN());
                            zzH(obj, iZzq);
                        case 8:
                            zzG(obj, iZzu, zzovVar);
                            zzH(obj, iZzq);
                        case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            zzoi zzoiVar = (zzoi) zzA(obj, iZzq);
                            zzovVar.zzu(zzoiVar, zzx(iZzq), zzmoVar);
                            zzJ(obj, iZzq, zzoiVar);
                        case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            zzps.zzs(obj, iZzu & 1048575, zzovVar.zzp());
                            zzH(obj, iZzq);
                        case 11:
                            zzps.zzq(obj, iZzu & 1048575, zzovVar.zzj());
                            zzH(obj, iZzq);
                        case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            int iZze = zzovVar.zze();
                            zznh zznhVarZzw = zzw(iZzq);
                            if (zznhVarZzw == null || zznhVarZzw.zza(iZze)) {
                                zzps.zzq(obj, iZzu & 1048575, iZze);
                                zzH(obj, iZzq);
                            } else {
                                objZza = zzoy.zzo(obj, iZzc, iZze, objZza, zzplVar);
                            }
                            break;
                        case 13:
                            zzps.zzq(obj, iZzu & 1048575, zzovVar.zzh());
                            zzH(obj, iZzq);
                        case 14:
                            zzps.zzr(obj, iZzu & 1048575, zzovVar.zzm());
                            zzH(obj, iZzq);
                        case 15:
                            zzps.zzq(obj, iZzu & 1048575, zzovVar.zzi());
                            zzH(obj, iZzq);
                        case 16:
                            zzps.zzr(obj, iZzu & 1048575, zzovVar.zzn());
                            zzH(obj, iZzq);
                        case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            zzoi zzoiVar2 = (zzoi) zzA(obj, iZzq);
                            zzovVar.zzt(zzoiVar2, zzx(iZzq), zzmoVar);
                            zzJ(obj, iZzq, zzoiVar2);
                        case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            zzovVar.zzx(zznv.zza(obj, iZzu & 1048575));
                        case 19:
                            zzovVar.zzB(zznv.zza(obj, iZzu & 1048575));
                        case 20:
                            zzovVar.zzE(zznv.zza(obj, iZzu & 1048575));
                        case 21:
                            zzovVar.zzM(zznv.zza(obj, iZzu & 1048575));
                        case 22:
                            zzovVar.zzD(zznv.zza(obj, iZzu & 1048575));
                        case 23:
                            zzovVar.zzA(zznv.zza(obj, iZzu & 1048575));
                        case 24:
                            zzovVar.zzz(zznv.zza(obj, iZzu & 1048575));
                        case 25:
                            zzovVar.zzv(zznv.zza(obj, iZzu & 1048575));
                        case 26:
                            if (zzM(iZzu)) {
                                ((zzlj) zzovVar).zzK(zznv.zza(obj, iZzu & 1048575), true);
                            } else {
                                ((zzlj) zzovVar).zzK(zznv.zza(obj, iZzu & 1048575), false);
                            }
                        case 27:
                            zzovVar.zzF(zznv.zza(obj, iZzu & 1048575), zzx(iZzq), zzmoVar);
                        case 28:
                            zzovVar.zzw(zznv.zza(obj, iZzu & 1048575));
                        case 29:
                            zzovVar.zzL(zznv.zza(obj, iZzu & 1048575));
                        case 30:
                            List listZza = zznv.zza(obj, iZzu & 1048575);
                            zzovVar.zzy(listZza);
                            objZza = zzoy.zzn(obj, iZzc, listZza, zzw(iZzq), objZza, zzplVar);
                        case 31:
                            zzovVar.zzG(zznv.zza(obj, iZzu & 1048575));
                        case 32:
                            zzovVar.zzH(zznv.zza(obj, iZzu & 1048575));
                        case 33:
                            zzovVar.zzI(zznv.zza(obj, iZzu & 1048575));
                        case 34:
                            zzovVar.zzJ(zznv.zza(obj, iZzu & 1048575));
                        case 35:
                            zzovVar.zzx(zznv.zza(obj, iZzu & 1048575));
                        case 36:
                            zzovVar.zzB(zznv.zza(obj, iZzu & 1048575));
                        case 37:
                            zzovVar.zzE(zznv.zza(obj, iZzu & 1048575));
                        case 38:
                            zzovVar.zzM(zznv.zza(obj, iZzu & 1048575));
                        case 39:
                            zzovVar.zzD(zznv.zza(obj, iZzu & 1048575));
                        case 40:
                            zzovVar.zzA(zznv.zza(obj, iZzu & 1048575));
                        case 41:
                            zzovVar.zzz(zznv.zza(obj, iZzu & 1048575));
                        case 42:
                            zzovVar.zzv(zznv.zza(obj, iZzu & 1048575));
                        case 43:
                            zzovVar.zzL(zznv.zza(obj, iZzu & 1048575));
                        case 44:
                            List listZza2 = zznv.zza(obj, iZzu & 1048575);
                            zzovVar.zzy(listZza2);
                            objZza = zzoy.zzn(obj, iZzc, listZza2, zzw(iZzq), objZza, zzplVar);
                        case 45:
                            zzovVar.zzG(zznv.zza(obj, iZzu & 1048575));
                        case 46:
                            zzovVar.zzH(zznv.zza(obj, iZzu & 1048575));
                        case 47:
                            zzovVar.zzI(zznv.zza(obj, iZzu & 1048575));
                        case 48:
                            zzovVar.zzJ(zznv.zza(obj, iZzu & 1048575));
                        case 49:
                            zzovVar.zzC(zznv.zza(obj, iZzu & 1048575), zzx(iZzq), zzmoVar);
                        case 50:
                            Object objZzz = zzz(iZzq);
                            long jZzu = zzu(iZzq) & 1048575;
                            Object objZzf = zzps.zzf(obj, jZzu);
                            if (objZzf == null) {
                                objZzf = zzoc.zza().zzb();
                                zzps.zzs(obj, jZzu, objZzf);
                            } else if (zzod.zza(objZzf)) {
                                Object objZzb = zzoc.zza().zzb();
                                zzod.zzb(objZzb, objZzf);
                                zzps.zzs(obj, jZzu, objZzb);
                                objZzf = objZzb;
                            }
                            throw null;
                            break;
                        case 51:
                            zzps.zzs(obj, iZzu & 1048575, Double.valueOf(zzovVar.zza()));
                            zzI(obj, iZzc, iZzq);
                        case 52:
                            zzps.zzs(obj, iZzu & 1048575, Float.valueOf(zzovVar.zzb()));
                            zzI(obj, iZzc, iZzq);
                        case 53:
                            zzps.zzs(obj, iZzu & 1048575, Long.valueOf(zzovVar.zzl()));
                            zzI(obj, iZzc, iZzq);
                        case 54:
                            zzps.zzs(obj, iZzu & 1048575, Long.valueOf(zzovVar.zzo()));
                            zzI(obj, iZzc, iZzq);
                        case 55:
                            zzps.zzs(obj, iZzu & 1048575, Integer.valueOf(zzovVar.zzg()));
                            zzI(obj, iZzc, iZzq);
                        case 56:
                            zzps.zzs(obj, iZzu & 1048575, Long.valueOf(zzovVar.zzk()));
                            zzI(obj, iZzc, iZzq);
                        case 57:
                            zzps.zzs(obj, iZzu & 1048575, Integer.valueOf(zzovVar.zzf()));
                            zzI(obj, iZzc, iZzq);
                        case 58:
                            zzps.zzs(obj, iZzu & 1048575, Boolean.valueOf(zzovVar.zzN()));
                            zzI(obj, iZzc, iZzq);
                        case 59:
                            zzG(obj, iZzu, zzovVar);
                            zzI(obj, iZzc, iZzq);
                        case 60:
                            zzoi zzoiVar3 = (zzoi) zzB(obj, iZzc, iZzq);
                            zzovVar.zzu(zzoiVar3, zzx(iZzq), zzmoVar);
                            zzK(obj, iZzc, iZzq, zzoiVar3);
                        case 61:
                            zzps.zzs(obj, iZzu & 1048575, zzovVar.zzp());
                            zzI(obj, iZzc, iZzq);
                        case 62:
                            zzps.zzs(obj, iZzu & 1048575, Integer.valueOf(zzovVar.zzj()));
                            zzI(obj, iZzc, iZzq);
                        case 63:
                            int iZze2 = zzovVar.zze();
                            zznh zznhVarZzw2 = zzw(iZzq);
                            if (zznhVarZzw2 == null || zznhVarZzw2.zza(iZze2)) {
                                zzps.zzs(obj, iZzu & 1048575, Integer.valueOf(iZze2));
                                zzI(obj, iZzc, iZzq);
                            } else {
                                objZza = zzoy.zzo(obj, iZzc, iZze2, objZza, zzplVar);
                            }
                            break;
                        case 64:
                            zzps.zzs(obj, iZzu & 1048575, Integer.valueOf(zzovVar.zzh()));
                            zzI(obj, iZzc, iZzq);
                        case 65:
                            zzps.zzs(obj, iZzu & 1048575, Long.valueOf(zzovVar.zzm()));
                            zzI(obj, iZzc, iZzq);
                        case 66:
                            zzps.zzs(obj, iZzu & 1048575, Integer.valueOf(zzovVar.zzi()));
                            zzI(obj, iZzc, iZzq);
                        case 67:
                            zzps.zzs(obj, iZzu & 1048575, Long.valueOf(zzovVar.zzn()));
                            zzI(obj, iZzc, iZzq);
                        case 68:
                            zzoi zzoiVar4 = (zzoi) zzB(obj, iZzc, iZzq);
                            zzovVar.zzt(zzoiVar4, zzx(iZzq), zzmoVar);
                            zzK(obj, iZzc, iZzq, zzoiVar4);
                        default:
                            if (objZza == null) {
                                objZza = zzplVar.zza(obj);
                            }
                            if (!zzplVar.zzk(objZza, zzovVar, 0)) {
                                for (int i5 = this.zzk; i5 < this.zzl; i5++) {
                                    zzy(obj, this.zzj[i5], objZza, zzplVar, obj);
                                }
                                break;
                            }
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    for (int i6 = this.zzk; i6 < this.zzl; i6++) {
                        zzy(obj, this.zzj[i6], objZza, zzplVar, obj);
                    }
                } else {
                    zznc zzncVarZza = !this.zzh ? null : zzmoVar.zza(this.zzg, iZzc);
                    if (zzncVarZza != null) {
                        if (zzmtVarZzi == null) {
                            zzmtVarZzi = ((zzna) obj).zzi();
                        }
                        zznb zznbVar = zzncVarZza.zza;
                        zzpw zzpwVar = zzpw.zzn;
                        zzpw zzpwVar2 = zznbVar.zzb;
                        if (zzpwVar2 == zzpwVar) {
                            zzovVar.zzg();
                            throw null;
                        }
                        switch (zzpwVar2.ordinal()) {
                            case 0:
                                objValueOf = Double.valueOf(zzovVar.zza());
                                break;
                            case 1:
                                objValueOf = Float.valueOf(zzovVar.zzb());
                                break;
                            case 2:
                                objValueOf = Long.valueOf(zzovVar.zzl());
                                break;
                            case 3:
                                objValueOf = Long.valueOf(zzovVar.zzo());
                                break;
                            case 4:
                                objValueOf = Integer.valueOf(zzovVar.zzg());
                                break;
                            case 5:
                                objValueOf = Long.valueOf(zzovVar.zzk());
                                break;
                            case 6:
                                objValueOf = Integer.valueOf(zzovVar.zzf());
                                break;
                            case 7:
                                objValueOf = Boolean.valueOf(zzovVar.zzN());
                                break;
                            case 8:
                                objValueOf = zzovVar.zzr();
                                break;
                            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                                Object objZze2 = zzmtVarZzi.zze(zzncVarZza.zza);
                                if (!(objZze2 instanceof zznd)) {
                                    throw null;
                                }
                                zzow zzowVarZzb = zzos.zza().zzb(objZze2.getClass());
                                if (!((zznd) objZze2).zzL()) {
                                    Object objZze3 = zzowVarZzb.zze();
                                    zzowVarZzb.zzg(objZze3, objZze2);
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objZze3);
                                    objZze2 = objZze3;
                                }
                                zzovVar.zzt(objZze2, zzowVarZzb, zzmoVar);
                                continue;
                            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                                Object objZze4 = zzmtVarZzi.zze(zzncVarZza.zza);
                                if (!(objZze4 instanceof zznd)) {
                                    throw null;
                                }
                                zzow zzowVarZzb2 = zzos.zza().zzb(objZze4.getClass());
                                if (!((zznd) objZze4).zzL()) {
                                    Object objZze5 = zzowVarZzb2.zze();
                                    zzowVarZzb2.zzg(objZze5, objZze4);
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objZze5);
                                    objZze4 = objZze5;
                                }
                                zzovVar.zzu(objZze4, zzowVarZzb2, zzmoVar);
                                continue;
                            case 11:
                                objValueOf = zzovVar.zzp();
                                break;
                            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                                objValueOf = Integer.valueOf(zzovVar.zzj());
                                break;
                            case 13:
                                throw new IllegalStateException("Shouldn't reach here.");
                            case 14:
                                objValueOf = Integer.valueOf(zzovVar.zzh());
                                break;
                            case 15:
                                objValueOf = Long.valueOf(zzovVar.zzm());
                                break;
                            case 16:
                                objValueOf = Integer.valueOf(zzovVar.zzi());
                                break;
                            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                objValueOf = Long.valueOf(zzovVar.zzn());
                                break;
                            default:
                                objValueOf = null;
                                break;
                        }
                        int iOrdinal = zzncVarZza.zza.zzb.ordinal();
                        if ((iOrdinal == 9 || iOrdinal == 10) && (objZze = zzmtVarZzi.zze(zzncVarZza.zza)) != null) {
                            byte[] bArr = zznl.zzb;
                            objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                        }
                        zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                    } else {
                        if (objZza == null) {
                            objZza = zzplVar.zza(obj);
                        }
                        if (!zzplVar.zzk(objZza, zzovVar, 0)) {
                            for (int i7 = this.zzk; i7 < this.zzl; i7++) {
                                zzy(obj, this.zzj[i7], objZza, zzplVar, obj);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i8 = this.zzk; i8 < this.zzl; i8++) {
                    zzy(obj, this.zzj[i8], objZza, zzplVar, obj);
                }
                if (objZza != null) {
                    zzplVar.zzj(obj, objZza);
                }
                throw th;
            }
        }
        if (objZza != null) {
            zzplVar.zzj(obj, objZza);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i, int i5, zzkt zzktVar) {
        zzc(obj, bArr, i, i5, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r25, com.google.android.recaptcha.internal.zzpy r26) {
        /*
            Method dump skipped, instructions count: 2034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzpy):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j5 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzps.zza(obj, j5)) != Double.doubleToLongBits(zzps.zza(obj2, j5))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzps.zzb(obj, j5)) != Float.floatToIntBits(zzps.zzb(obj2, j5))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzps.zzd(obj, j5) != zzps.zzd(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzps.zzd(obj, j5) != zzps.zzd(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j5) != zzps.zzc(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzps.zzd(obj, j5) != zzps.zzd(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j5) != zzps.zzc(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzps.zzw(obj, j5) != zzps.zzw(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzoy.zzF(zzps.zzf(obj, j5), zzps.zzf(obj2, j5))) {
                        return false;
                    }
                    continue;
                    break;
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    if (!zzL(obj, obj2, i) || !zzoy.zzF(zzps.zzf(obj, j5), zzps.zzf(obj2, j5))) {
                        return false;
                    }
                    continue;
                    break;
                case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (!zzL(obj, obj2, i) || !zzoy.zzF(zzps.zzf(obj, j5), zzps.zzf(obj2, j5))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j5) != zzps.zzc(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j5) != zzps.zzc(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j5) != zzps.zzc(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzps.zzd(obj, j5) != zzps.zzd(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j5) != zzps.zzc(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzps.zzd(obj, j5) != zzps.zzd(obj2, j5)) {
                        return false;
                    }
                    continue;
                    break;
                case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (!zzL(obj, obj2, i) || !zzoy.zzF(zzps.zzf(obj, j5), zzps.zzf(obj2, j5))) {
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
                    zZzF = zzoy.zzF(zzps.zzf(obj, j5), zzps.zzf(obj2, j5));
                    break;
                case 50:
                    zZzF = zzoy.zzF(zzps.zzf(obj, j5), zzps.zzf(obj2, j5));
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
                    long jZzr = zzr(i) & 1048575;
                    if (zzps.zzc(obj, jZzr) != zzps.zzc(obj2, jZzr) || !zzoy.zzF(zzps.zzf(obj, j5), zzps.zzf(obj2, j5))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzl(java.lang.Object):boolean");
    }
}
