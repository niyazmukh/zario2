package com.google.android.gms.internal.p002firebaseauthapi;

import N2.j0;
import N2.n0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzamq.smali */
final class zzamq<T> implements zzanb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzanz.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzamm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzamu zzn;
    private final zzalw zzo;
    private final zzanu<?, ?> zzp;
    private final zzakw<?> zzq;
    private final zzamf zzr;

    private zzamq(int[] iArr, Object[] objArr, int i, int i5, zzamm zzammVar, boolean z4, int[] iArr2, int i6, int i7, zzamu zzamuVar, zzalw zzalwVar, zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamf zzamfVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i5;
        this.zzi = zzammVar instanceof zzalf;
        this.zzh = zzakwVar != null && zzakwVar.zza(zzammVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i6;
        this.zzm = i7;
        this.zzn = zzamuVar;
        this.zzo = zzalwVar;
        this.zzp = zzanuVar;
        this.zzq = zzakwVar;
        this.zzg = zzammVar;
        this.zzr = zzamfVar;
    }

    private static <T> double zza(T t4, long j5) {
        return ((Double) zzanz.zze(t4, j5)).doubleValue();
    }

    private static <T> float zzb(T t4, long j5) {
        return ((Float) zzanz.zze(t4, j5)).floatValue();
    }

    private static <T> int zzc(T t4, long j5) {
        return ((Integer) zzanz.zze(t4, j5)).intValue();
    }

    private static <T> long zzd(T t4, long j5) {
        return ((Long) zzanz.zze(t4, j5)).longValue();
    }

    private final zzanb zze(int i) {
        int i5 = (i / 3) << 1;
        zzanb zzanbVar = (zzanb) this.zzd[i5];
        if (zzanbVar != null) {
            return zzanbVar;
        }
        zzanb<T> zzanbVarZza = zzamx.zza().zza((Class) this.zzd[i5 + 1]);
        this.zzd[i5] = zzanbVarZza;
        return zzanbVarZza;
    }

    private final Object zzf(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private static boolean zzg(int i) {
        return (i & 536870912) != 0;
    }

    private static int zza(byte[] bArr, int i, int i5, zzaog zzaogVar, Class<?> cls, zzaju zzajuVar) {
        switch (zzamp.zza[zzaogVar.ordinal()]) {
            case 1:
                int iZzd = zzajr.zzd(bArr, i, zzajuVar);
                zzajuVar.zzc = Boolean.valueOf(zzajuVar.zzb != 0);
                return iZzd;
            case 2:
                return zzajr.zza(bArr, i, zzajuVar);
            case 3:
                zzajuVar.zzc = Double.valueOf(zzajr.zza(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzajuVar.zzc = Integer.valueOf(zzajr.zzc(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzajuVar.zzc = Long.valueOf(zzajr.zzd(bArr, i));
                return i + 8;
            case 8:
                zzajuVar.zzc = Float.valueOf(zzajr.zzb(bArr, i));
                return i + 4;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
            case 11:
                int iZzc = zzajr.zzc(bArr, i, zzajuVar);
                zzajuVar.zzc = Integer.valueOf(zzajuVar.zza);
                return iZzc;
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
                int iZzd2 = zzajr.zzd(bArr, i, zzajuVar);
                zzajuVar.zzc = Long.valueOf(zzajuVar.zzb);
                return iZzd2;
            case 14:
                return zzajr.zza(zzamx.zza().zza((Class) cls), bArr, i, i5, zzajuVar);
            case 15:
                int iZzc2 = zzajr.zzc(bArr, i, zzajuVar);
                zzajuVar.zzc = Integer.valueOf(zzakh.zza(zzajuVar.zza));
                return iZzc2;
            case 16:
                int iZzd3 = zzajr.zzd(bArr, i, zzajuVar);
                zzajuVar.zzc = Long.valueOf(zzakh.zza(zzajuVar.zzb));
                return iZzd3;
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return zzajr.zzb(bArr, i, zzajuVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i) {
        return this.zzc[i + 1];
    }

    private final zzalj zzd(int i) {
        return (zzalj) this.zzd[((i / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (!zzg(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzalf) {
            return ((zzalf) obj).zzw();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zzb(T t4) {
        int i;
        int iZza;
        int i5;
        int iZzc;
        int length = this.zzc.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iZzc2 = zzc(i7);
            int i8 = this.zzc[i7];
            long j5 = 1048575 & iZzc2;
            int iHashCode = 37;
            switch ((iZzc2 & 267386880) >>> 20) {
                case 0:
                    i = i6 * 53;
                    iZza = zzalh.zza(Double.doubleToLongBits(zzanz.zza(t4, j5)));
                    i6 = iZza + i;
                    break;
                case 1:
                    i = i6 * 53;
                    iZza = Float.floatToIntBits(zzanz.zzb(t4, j5));
                    i6 = iZza + i;
                    break;
                case 2:
                    i = i6 * 53;
                    iZza = zzalh.zza(zzanz.zzd(t4, j5));
                    i6 = iZza + i;
                    break;
                case 3:
                    i = i6 * 53;
                    iZza = zzalh.zza(zzanz.zzd(t4, j5));
                    i6 = iZza + i;
                    break;
                case 4:
                    i5 = i6 * 53;
                    iZzc = zzanz.zzc(t4, j5);
                    i6 = i5 + iZzc;
                    break;
                case 5:
                    i = i6 * 53;
                    iZza = zzalh.zza(zzanz.zzd(t4, j5));
                    i6 = iZza + i;
                    break;
                case 6:
                    i5 = i6 * 53;
                    iZzc = zzanz.zzc(t4, j5);
                    i6 = i5 + iZzc;
                    break;
                case 7:
                    i = i6 * 53;
                    iZza = zzalh.zza(zzanz.zzh(t4, j5));
                    i6 = iZza + i;
                    break;
                case 8:
                    i = i6 * 53;
                    iZza = ((String) zzanz.zze(t4, j5)).hashCode();
                    i6 = iZza + i;
                    break;
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    Object objZze = zzanz.zze(t4, j5);
                    if (objZze != null) {
                        iHashCode = objZze.hashCode();
                    }
                    i6 = (i6 * 53) + iHashCode;
                    break;
                case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    i = i6 * 53;
                    iZza = zzanz.zze(t4, j5).hashCode();
                    i6 = iZza + i;
                    break;
                case 11:
                    i5 = i6 * 53;
                    iZzc = zzanz.zzc(t4, j5);
                    i6 = i5 + iZzc;
                    break;
                case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    i5 = i6 * 53;
                    iZzc = zzanz.zzc(t4, j5);
                    i6 = i5 + iZzc;
                    break;
                case 13:
                    i5 = i6 * 53;
                    iZzc = zzanz.zzc(t4, j5);
                    i6 = i5 + iZzc;
                    break;
                case 14:
                    i = i6 * 53;
                    iZza = zzalh.zza(zzanz.zzd(t4, j5));
                    i6 = iZza + i;
                    break;
                case 15:
                    i5 = i6 * 53;
                    iZzc = zzanz.zzc(t4, j5);
                    i6 = i5 + iZzc;
                    break;
                case 16:
                    i = i6 * 53;
                    iZza = zzalh.zza(zzanz.zzd(t4, j5));
                    i6 = iZza + i;
                    break;
                case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    Object objZze2 = zzanz.zze(t4, j5);
                    if (objZze2 != null) {
                        iHashCode = objZze2.hashCode();
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
                    iZza = zzanz.zze(t4, j5).hashCode();
                    i6 = iZza + i;
                    break;
                case 50:
                    i = i6 * 53;
                    iZza = zzanz.zze(t4, j5).hashCode();
                    i6 = iZza + i;
                    break;
                case 51:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i = i6 * 53;
                        iZza = zzalh.zza(Double.doubleToLongBits(zza(t4, j5)));
                        i6 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i = i6 * 53;
                        iZza = Float.floatToIntBits(zzb(t4, j5));
                        i6 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i = i6 * 53;
                        iZza = zzalh.zza(zzd(t4, j5));
                        i6 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i = i6 * 53;
                        iZza = zzalh.zza(zzd(t4, j5));
                        i6 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i5 = i6 * 53;
                        iZzc = zzc(t4, j5);
                        i6 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i = i6 * 53;
                        iZza = zzalh.zza(zzd(t4, j5));
                        i6 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i5 = i6 * 53;
                        iZzc = zzc(t4, j5);
                        i6 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i = i6 * 53;
                        iZza = zzalh.zza(zze(t4, j5));
                        i6 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i = i6 * 53;
                        iZza = ((String) zzanz.zze(t4, j5)).hashCode();
                        i6 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i = i6 * 53;
                        iZza = zzanz.zze(t4, j5).hashCode();
                        i6 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i = i6 * 53;
                        iZza = zzanz.zze(t4, j5).hashCode();
                        i6 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i5 = i6 * 53;
                        iZzc = zzc(t4, j5);
                        i6 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i5 = i6 * 53;
                        iZzc = zzc(t4, j5);
                        i6 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i5 = i6 * 53;
                        iZzc = zzc(t4, j5);
                        i6 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i = i6 * 53;
                        iZza = zzalh.zza(zzd(t4, j5));
                        i6 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i5 = i6 * 53;
                        iZzc = zzc(t4, j5);
                        i6 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i = i6 * 53;
                        iZza = zzalh.zza(zzd(t4, j5));
                        i6 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzamq<T>) t4, i8, i7)) {
                        i = i6 * 53;
                        iZza = zzanz.zze(t4, j5).hashCode();
                        i6 = iZza + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.zzp.zzd(t4).hashCode() + (i6 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzq.zza(t4).hashCode() : iHashCode2;
    }

    public static zzanx zzc(Object obj) {
        zzalf zzalfVar = (zzalf) obj;
        zzanx zzanxVar = zzalfVar.zzb;
        if (zzanxVar != zzanx.zzc()) {
            return zzanxVar;
        }
        zzanx zzanxVarZzd = zzanx.zzd();
        zzalfVar.zzb = zzanxVarZzd;
        return zzanxVarZzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(T r8) {
        /*
            r7 = this;
            boolean r0 = zzg(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzalf
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.firebase-auth-api.zzalf r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzalf) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzb(r2)
            r0.zza = r1
            r0.zzu()
        L1a:
            int[] r0 = r7.zzc
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L83
            int r2 = r7.zzc(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r5
            int r2 = r2 >>> 20
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L55
            r5 = 68
            if (r2 == r5) goto L55
            switch(r2) {
                case 17: goto L6d;
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
            goto L80
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            com.google.android.gms.internal.firebase-auth-api.zzamf r6 = r7.zzr
            java.lang.Object r5 = r6.zzc(r5)
            r2.putObject(r8, r3, r5)
            goto L80
        L4f:
            com.google.android.gms.internal.firebase-auth-api.zzalw r2 = r7.zzo
            r2.zzb(r8, r3)
            goto L80
        L55:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzc(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.firebase-auth-api.zzanb r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
            goto L80
        L6d:
            boolean r2 = r7.zzc(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.firebase-auth-api.zzanb r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
        L80:
            int r1 = r1 + 3
            goto L1d
        L83:
            com.google.android.gms.internal.firebase-auth-api.zzanu<?, ?> r0 = r7.zzp
            r0.zzf(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L91
            com.google.android.gms.internal.firebase-auth-api.zzakw<?> r7 = r7.zzq
            r7.zzc(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzd(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.firebase-auth-api.zzanb] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.firebase-auth-api.zzanb] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(T r18) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zze(java.lang.Object):boolean");
    }

    private final boolean zzc(T t4, T t5, int i) {
        return zzc((zzamq<T>) t4, i) == zzc((zzamq<T>) t5, i);
    }

    private final boolean zzc(T t4, int i) {
        int iZzb = zzb(i);
        long j5 = iZzb & 1048575;
        if (j5 != 1048575) {
            return ((1 << (iZzb >>> 20)) & zzanz.zzc(t4, j5)) != 0;
        }
        int iZzc = zzc(i);
        long j6 = iZzc & 1048575;
        switch ((iZzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzanz.zza(t4, j6)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzanz.zzb(t4, j6)) != 0;
            case 2:
                return zzanz.zzd(t4, j6) != 0;
            case 3:
                return zzanz.zzd(t4, j6) != 0;
            case 4:
                return zzanz.zzc(t4, j6) != 0;
            case 5:
                return zzanz.zzd(t4, j6) != 0;
            case 6:
                return zzanz.zzc(t4, j6) != 0;
            case 7:
                return zzanz.zzh(t4, j6);
            case 8:
                Object objZze = zzanz.zze(t4, j6);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzajv) {
                    return !zzajv.zza.equals(objZze);
                }
                throw new IllegalArgumentException();
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return zzanz.zze(t4, j6) != null;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return !zzajv.zza.equals(zzanz.zze(t4, j6));
            case 11:
                return zzanz.zzc(t4, j6) != 0;
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return zzanz.zzc(t4, j6) != 0;
            case 13:
                return zzanz.zzc(t4, j6) != 0;
            case 14:
                return zzanz.zzd(t4, j6) != 0;
            case 15:
                return zzanz.zzc(t4, j6) != 0;
            case 16:
                return zzanz.zzd(t4, j6) != 0;
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return zzanz.zze(t4, j6) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zza(T t4) {
        int i;
        int i5;
        int i6;
        int iZza;
        int iZza2;
        int iZza3;
        int iZzd;
        boolean z4;
        int iZzc;
        int iZzd2;
        int iZzh;
        int iZzi;
        Unsafe unsafe = zzb;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.zzc.length) {
            int iZzc2 = zzc(i10);
            int i12 = (267386880 & iZzc2) >>> 20;
            int[] iArr = this.zzc;
            int i13 = iArr[i10];
            int i14 = iArr[i10 + 2];
            int i15 = i14 & i7;
            if (i12 <= 17) {
                if (i15 != i8) {
                    i9 = i15 == i7 ? 0 : unsafe.getInt(t4, i15);
                    i8 = i15;
                }
                i = i8;
                i5 = i9;
                i6 = 1 << (i14 >>> 20);
            } else {
                i = i8;
                i5 = i9;
                i6 = 0;
            }
            long j5 = iZzc2 & i7;
            if (i12 >= zzalc.zza.zza()) {
                zzalc.zzb.zza();
            }
            switch (i12) {
                case 0:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza = zzakn.zza(i13, 0.0d);
                        i11 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza = zzakn.zza(i13, 0.0f);
                        i11 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza = zzakn.zzb(i13, unsafe.getLong(t4, j5));
                        i11 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza = zzakn.zze(i13, unsafe.getLong(t4, j5));
                        i11 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza = zzakn.zzc(i13, unsafe.getInt(t4, j5));
                        i11 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza = zzakn.zza(i13, 0L);
                        i11 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza = zzakn.zzb(i13, 0);
                        i11 += iZza;
                        break;
                    }
                    break;
                case 7:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza2 = zzakn.zza(i13, true);
                        i11 += iZza2;
                    }
                    break;
                case 8:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        Object object = unsafe.getObject(t4, j5);
                        if (object instanceof zzajv) {
                            iZza2 = zzakn.zza(i13, (zzajv) object);
                        } else {
                            iZza2 = zzakn.zza(i13, (String) object);
                        }
                        i11 += iZza2;
                    }
                    break;
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza3 = zzand.zza(i13, unsafe.getObject(t4, j5), (zzanb<?>) zze(i10));
                        i11 += iZza3;
                    }
                    break;
                case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza2 = zzakn.zza(i13, (zzajv) unsafe.getObject(t4, j5));
                        i11 += iZza2;
                    }
                    break;
                case 11:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza2 = zzakn.zzf(i13, unsafe.getInt(t4, j5));
                        i11 += iZza2;
                    }
                    break;
                case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza2 = zzakn.zza(i13, unsafe.getInt(t4, j5));
                        i11 += iZza2;
                    }
                    break;
                case 13:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZzd = zzakn.zzd(i13, 0);
                        i11 += iZzd;
                    }
                    break;
                case 14:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza2 = zzakn.zzc(i13, 0L);
                        i11 += iZza2;
                    }
                    break;
                case 15:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza2 = zzakn.zze(i13, unsafe.getInt(t4, j5));
                        i11 += iZza2;
                    }
                    break;
                case 16:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza2 = zzakn.zzd(i13, unsafe.getLong(t4, j5));
                        i11 += iZza2;
                    }
                    break;
                case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (zza((zzamq<T>) t4, i10, i, i5, i6)) {
                        iZza3 = zzand.zza(i13, (zzamm) unsafe.getObject(t4, j5), zze(i10));
                        i11 += iZza3;
                    }
                    break;
                case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    iZza3 = zzand.zzd(i13, (List) unsafe.getObject(t4, j5), false);
                    i11 += iZza3;
                    break;
                case 19:
                    z4 = false;
                    iZzc = zzand.zzc(i13, (List) unsafe.getObject(t4, j5), false);
                    i11 += iZzc;
                    break;
                case 20:
                    z4 = false;
                    iZzc = zzand.zzf(i13, (List) unsafe.getObject(t4, j5), false);
                    i11 += iZzc;
                    break;
                case 21:
                    z4 = false;
                    iZzc = zzand.zzj(i13, (List) unsafe.getObject(t4, j5), false);
                    i11 += iZzc;
                    break;
                case 22:
                    z4 = false;
                    iZzc = zzand.zze(i13, (List) unsafe.getObject(t4, j5), false);
                    i11 += iZzc;
                    break;
                case 23:
                    z4 = false;
                    iZzc = zzand.zzd(i13, (List) unsafe.getObject(t4, j5), false);
                    i11 += iZzc;
                    break;
                case 24:
                    z4 = false;
                    iZzc = zzand.zzc(i13, (List) unsafe.getObject(t4, j5), false);
                    i11 += iZzc;
                    break;
                case 25:
                    z4 = false;
                    iZzc = zzand.zza(i13, (List<?>) unsafe.getObject(t4, j5), false);
                    i11 += iZzc;
                    break;
                case 26:
                    iZza3 = zzand.zzb(i13, (List) unsafe.getObject(t4, j5));
                    i11 += iZza3;
                    break;
                case 27:
                    iZza3 = zzand.zzb(i13, (List<?>) unsafe.getObject(t4, j5), (zzanb<?>) zze(i10));
                    i11 += iZza3;
                    break;
                case 28:
                    iZza3 = zzand.zza(i13, (List<zzajv>) unsafe.getObject(t4, j5));
                    i11 += iZza3;
                    break;
                case 29:
                    iZza3 = zzand.zzi(i13, (List) unsafe.getObject(t4, j5), false);
                    i11 += iZza3;
                    break;
                case 30:
                    z4 = false;
                    iZzc = zzand.zzb(i13, (List<Integer>) unsafe.getObject(t4, j5), false);
                    i11 += iZzc;
                    break;
                case 31:
                    z4 = false;
                    iZzc = zzand.zzc(i13, (List) unsafe.getObject(t4, j5), false);
                    i11 += iZzc;
                    break;
                case 32:
                    z4 = false;
                    iZzc = zzand.zzd(i13, (List) unsafe.getObject(t4, j5), false);
                    i11 += iZzc;
                    break;
                case 33:
                    z4 = false;
                    iZzc = zzand.zzg(i13, (List) unsafe.getObject(t4, j5), false);
                    i11 += iZzc;
                    break;
                case 34:
                    z4 = false;
                    iZzc = zzand.zzh(i13, (List) unsafe.getObject(t4, j5), false);
                    i11 += iZzc;
                    break;
                case 35:
                    iZzd2 = zzand.zzd((List) unsafe.getObject(t4, j5));
                    if (iZzd2 > 0) {
                        iZzh = zzakn.zzh(i13);
                        iZzi = zzakn.zzi(iZzd2);
                        i11 += iZzi + iZzh + iZzd2;
                    }
                    break;
                case 36:
                    iZzd2 = zzand.zzc((List) unsafe.getObject(t4, j5));
                    if (iZzd2 > 0) {
                        iZzh = zzakn.zzh(i13);
                        iZzi = zzakn.zzi(iZzd2);
                        i11 += iZzi + iZzh + iZzd2;
                    }
                    break;
                case 37:
                    iZzd2 = zzand.zzf((List) unsafe.getObject(t4, j5));
                    if (iZzd2 > 0) {
                        iZzh = zzakn.zzh(i13);
                        iZzi = zzakn.zzi(iZzd2);
                        i11 += iZzi + iZzh + iZzd2;
                    }
                    break;
                case 38:
                    iZzd2 = zzand.zzj((List) unsafe.getObject(t4, j5));
                    if (iZzd2 > 0) {
                        iZzh = zzakn.zzh(i13);
                        iZzi = zzakn.zzi(iZzd2);
                        i11 += iZzi + iZzh + iZzd2;
                    }
                    break;
                case 39:
                    iZzd2 = zzand.zze((List) unsafe.getObject(t4, j5));
                    if (iZzd2 > 0) {
                        iZzh = zzakn.zzh(i13);
                        iZzi = zzakn.zzi(iZzd2);
                        i11 += iZzi + iZzh + iZzd2;
                    }
                    break;
                case 40:
                    iZzd2 = zzand.zzd((List) unsafe.getObject(t4, j5));
                    if (iZzd2 > 0) {
                        iZzh = zzakn.zzh(i13);
                        iZzi = zzakn.zzi(iZzd2);
                        i11 += iZzi + iZzh + iZzd2;
                    }
                    break;
                case 41:
                    iZzd2 = zzand.zzc((List) unsafe.getObject(t4, j5));
                    if (iZzd2 > 0) {
                        iZzh = zzakn.zzh(i13);
                        iZzi = zzakn.zzi(iZzd2);
                        i11 += iZzi + iZzh + iZzd2;
                    }
                    break;
                case 42:
                    iZzd2 = zzand.zza((List<?>) unsafe.getObject(t4, j5));
                    if (iZzd2 > 0) {
                        iZzh = zzakn.zzh(i13);
                        iZzi = zzakn.zzi(iZzd2);
                        i11 += iZzi + iZzh + iZzd2;
                    }
                    break;
                case 43:
                    iZzd2 = zzand.zzi((List) unsafe.getObject(t4, j5));
                    if (iZzd2 > 0) {
                        iZzh = zzakn.zzh(i13);
                        iZzi = zzakn.zzi(iZzd2);
                        i11 += iZzi + iZzh + iZzd2;
                    }
                    break;
                case 44:
                    iZzd2 = zzand.zzb((List) unsafe.getObject(t4, j5));
                    if (iZzd2 > 0) {
                        iZzh = zzakn.zzh(i13);
                        iZzi = zzakn.zzi(iZzd2);
                        i11 += iZzi + iZzh + iZzd2;
                    }
                    break;
                case 45:
                    iZzd2 = zzand.zzc((List) unsafe.getObject(t4, j5));
                    if (iZzd2 > 0) {
                        iZzh = zzakn.zzh(i13);
                        iZzi = zzakn.zzi(iZzd2);
                        i11 += iZzi + iZzh + iZzd2;
                    }
                    break;
                case 46:
                    iZzd2 = zzand.zzd((List) unsafe.getObject(t4, j5));
                    if (iZzd2 > 0) {
                        iZzh = zzakn.zzh(i13);
                        iZzi = zzakn.zzi(iZzd2);
                        i11 += iZzi + iZzh + iZzd2;
                    }
                    break;
                case 47:
                    iZzd2 = zzand.zzg((List) unsafe.getObject(t4, j5));
                    if (iZzd2 > 0) {
                        iZzh = zzakn.zzh(i13);
                        iZzi = zzakn.zzi(iZzd2);
                        i11 += iZzi + iZzh + iZzd2;
                    }
                    break;
                case 48:
                    iZzd2 = zzand.zzh((List) unsafe.getObject(t4, j5));
                    if (iZzd2 > 0) {
                        iZzh = zzakn.zzh(i13);
                        iZzi = zzakn.zzi(iZzd2);
                        i11 += iZzi + iZzh + iZzd2;
                    }
                    break;
                case 49:
                    iZza3 = zzand.zza(i13, (List<zzamm>) unsafe.getObject(t4, j5), (zzanb<?>) zze(i10));
                    i11 += iZza3;
                    break;
                case 50:
                    iZza3 = this.zzr.zza(i13, unsafe.getObject(t4, j5), zzf(i10));
                    i11 += iZza3;
                    break;
                case 51:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZza2 = zzakn.zza(i13, 0.0d);
                        i11 += iZza2;
                    }
                    break;
                case 52:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZza2 = zzakn.zza(i13, 0.0f);
                        i11 += iZza2;
                    }
                    break;
                case 53:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZza2 = zzakn.zzb(i13, zzd(t4, j5));
                        i11 += iZza2;
                    }
                    break;
                case 54:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZza2 = zzakn.zze(i13, zzd(t4, j5));
                        i11 += iZza2;
                    }
                    break;
                case 55:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZza2 = zzakn.zzc(i13, zzc(t4, j5));
                        i11 += iZza2;
                    }
                    break;
                case 56:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZza2 = zzakn.zza(i13, 0L);
                        i11 += iZza2;
                    }
                    break;
                case 57:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZzd = zzakn.zzb(i13, 0);
                        i11 += iZzd;
                    }
                    break;
                case 58:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZza2 = zzakn.zza(i13, true);
                        i11 += iZza2;
                    }
                    break;
                case 59:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        Object object2 = unsafe.getObject(t4, j5);
                        if (object2 instanceof zzajv) {
                            iZza2 = zzakn.zza(i13, (zzajv) object2);
                        } else {
                            iZza2 = zzakn.zza(i13, (String) object2);
                        }
                        i11 += iZza2;
                    }
                    break;
                case 60:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZza3 = zzand.zza(i13, unsafe.getObject(t4, j5), (zzanb<?>) zze(i10));
                        i11 += iZza3;
                    }
                    break;
                case 61:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZza2 = zzakn.zza(i13, (zzajv) unsafe.getObject(t4, j5));
                        i11 += iZza2;
                    }
                    break;
                case 62:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZza2 = zzakn.zzf(i13, zzc(t4, j5));
                        i11 += iZza2;
                    }
                    break;
                case 63:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZza2 = zzakn.zza(i13, zzc(t4, j5));
                        i11 += iZza2;
                    }
                    break;
                case 64:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZzd = zzakn.zzd(i13, 0);
                        i11 += iZzd;
                    }
                    break;
                case 65:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZza2 = zzakn.zzc(i13, 0L);
                        i11 += iZza2;
                    }
                    break;
                case 66:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZza2 = zzakn.zze(i13, zzc(t4, j5));
                        i11 += iZza2;
                    }
                    break;
                case 67:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZza2 = zzakn.zzd(i13, zzd(t4, j5));
                        i11 += iZza2;
                    }
                    break;
                case 68:
                    if (zzc((zzamq<T>) t4, i13, i10)) {
                        iZza3 = zzand.zza(i13, (zzamm) unsafe.getObject(t4, j5), zze(i10));
                        i11 += iZza3;
                    }
                    break;
            }
            i10 += 3;
            i8 = i;
            i9 = i5;
            i7 = 1048575;
        }
        int iZza4 = 0;
        zzanu<?, ?> zzanuVar = this.zzp;
        int iZza5 = i11 + zzanuVar.zza((zzanu<?, ?>) zzanuVar.zzd(t4));
        if (!this.zzh) {
            return iZza5;
        }
        zzakx<T> zzakxVarZza = this.zzq.zza(t4);
        int iZzb = zzakxVarZza.zza.zzb();
        for (int i16 = 0; i16 < iZzb; i16++) {
            Map.Entry entryZza = zzakxVarZza.zza.zza(i16);
            iZza4 += zzakx.zza((zzakz<?>) entryZza.getKey(), entryZza.getValue());
        }
        for (Map.Entry entry : zzakxVarZza.zza.zzc()) {
            iZza4 += zzakx.zza((zzakz<?>) entry.getKey(), entry.getValue());
        }
        return iZza5 + iZza4;
    }

    private static <T> boolean zze(T t4, long j5) {
        return ((Boolean) zzanz.zze(t4, j5)).booleanValue();
    }

    private final boolean zzc(T t4, int i, int i5) {
        return zzanz.zzc(t4, (long) (zzb(i5) & 1048575)) == i;
    }

    private final int zzb(int i) {
        return this.zzc[i + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t4, T t5, int i) {
        int i5 = this.zzc[i];
        if (zzc((zzamq<T>) t5, i5, i)) {
            long jZzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t5, jZzc);
            if (object != null) {
                zzanb zzanbVarZze = zze(i);
                if (!zzc((zzamq<T>) t4, i5, i)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t4, jZzc, object);
                    } else {
                        Object objZza = zzanbVarZze.zza();
                        zzanbVarZze.zza(objZza, object);
                        unsafe.putObject(t4, jZzc, objZza);
                    }
                    zzb((zzamq<T>) t4, i5, i);
                    return;
                }
                Object object2 = unsafe.getObject(t4, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzanbVarZze.zza();
                    zzanbVarZze.zza(objZza2, object2);
                    unsafe.putObject(t4, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzanbVarZze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t5));
        }
    }

    private final void zzb(T t4, int i) {
        int iZzb = zzb(i);
        long j5 = 1048575 & iZzb;
        if (j5 == 1048575) {
            return;
        }
        zzanz.zza((Object) t4, j5, (1 << (iZzb >>> 20)) | zzanz.zzc(t4, j5));
    }

    private final void zzb(T t4, int i, int i5) {
        zzanz.zza((Object) t4, zzb(i5) & 1048575, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:437:0x0a7c, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzall.zzj();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:592:0x094c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0d53 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0cd6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:645:0x093d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v60, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.p002firebaseauthapi.zzaju r38) throws com.google.android.gms.internal.p002firebaseauthapi.zzall {
        /*
            Method dump skipped, instructions count: 3668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzaju):int");
    }

    private final int zza(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zza(i, 0);
    }

    private final int zza(int i, int i5) {
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

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.p002firebaseauthapi.zzamq<T> zza(java.lang.Class<T> r32, com.google.android.gms.internal.p002firebaseauthapi.zzamk r33, com.google.android.gms.internal.p002firebaseauthapi.zzamu r34, com.google.android.gms.internal.p002firebaseauthapi.zzalw r35, com.google.android.gms.internal.p002firebaseauthapi.zzanu<?, ?> r36, com.google.android.gms.internal.p002firebaseauthapi.zzakw<?> r37, com.google.android.gms.internal.p002firebaseauthapi.zzamf r38) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzamk, com.google.android.gms.internal.firebase-auth-api.zzamu, com.google.android.gms.internal.firebase-auth-api.zzalw, com.google.android.gms.internal.firebase-auth-api.zzanu, com.google.android.gms.internal.firebase-auth-api.zzakw, com.google.android.gms.internal.firebase-auth-api.zzamf):com.google.android.gms.internal.firebase-auth-api.zzamq");
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzanu<UT, UB> zzanuVar, Object obj2) {
        zzalj zzaljVarZzd;
        int i5 = this.zzc[i];
        Object objZze = zzanz.zze(obj, zzc(i) & 1048575);
        return (objZze == null || (zzaljVarZzd = zzd(i)) == null) ? ub : (UB) zza(i, i5, this.zzr.zze(objZze), zzaljVarZzd, (zzalj) ub, (zzanu<UT, zzalj>) zzanuVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i, int i5, Map<K, V> map, zzalj zzaljVar, UB ub, zzanu<UT, UB> zzanuVar, Object obj) {
        zzamd<?, ?> zzamdVarZza = this.zzr.zza(zzf(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzaljVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzanuVar.zzc(obj);
                }
                zzake zzakeVarZzc = zzajv.zzc(zzame.zza(zzamdVarZza, next.getKey(), next.getValue()));
                try {
                    zzame.zza(zzakeVarZzc.zzb(), zzamdVarZza, next.getKey(), next.getValue());
                    zzanuVar.zza((zzanu<UT, UB>) ub, i5, zzakeVarZzc.zza());
                    it.remove();
                } catch (IOException e5) {
                    throw new RuntimeException(e5);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t4, int i) {
        zzanb zzanbVarZze = zze(i);
        long jZzc = zzc(i) & 1048575;
        if (!zzc((zzamq<T>) t4, i)) {
            return zzanbVarZze.zza();
        }
        Object object = zzb.getObject(t4, jZzc);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzanbVarZze.zza();
        if (object != null) {
            zzanbVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t4, int i, int i5) {
        zzanb zzanbVarZze = zze(i5);
        if (!zzc((zzamq<T>) t4, i, i5)) {
            return zzanbVarZze.zza();
        }
        Object object = zzb.getObject(t4, zzc(i5) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzanbVarZze.zza();
        if (object != null) {
            zzanbVarZze.zza(objZza, object);
        }
        return objZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e5) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e5);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t4, T t5) {
        zzf(t4);
        t5.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzc = zzc(i);
            long j5 = 1048575 & iZzc;
            int i5 = this.zzc[i];
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zza(t4, j5, zzanz.zza(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zza((Object) t4, j5, zzanz.zzb(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zza((Object) t4, j5, zzanz.zzd(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zza((Object) t4, j5, zzanz.zzd(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zza((Object) t4, j5, zzanz.zzc(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zza((Object) t4, j5, zzanz.zzd(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zza((Object) t4, j5, zzanz.zzc(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zzc(t4, j5, zzanz.zzh(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zza(t4, j5, zzanz.zze(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    zza(t4, t5, i);
                    break;
                case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zza(t4, j5, zzanz.zze(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zza((Object) t4, j5, zzanz.zzc(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zza((Object) t4, j5, zzanz.zzc(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zza((Object) t4, j5, zzanz.zzc(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zza((Object) t4, j5, zzanz.zzd(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zza((Object) t4, j5, zzanz.zzc(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzamq<T>) t5, i)) {
                        zzanz.zza((Object) t4, j5, zzanz.zzd(t5, j5));
                        zzb((zzamq<T>) t4, i);
                        break;
                    } else {
                        break;
                    }
                case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    zza(t4, t5, i);
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
                    this.zzo.zza(t4, t5, j5);
                    break;
                case 50:
                    zzand.zza(this.zzr, t4, t5, j5);
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
                    if (zzc((zzamq<T>) t5, i5, i)) {
                        zzanz.zza(t4, j5, zzanz.zze(t5, j5));
                        zzb((zzamq<T>) t4, i5, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t4, t5, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzamq<T>) t5, i5, i)) {
                        zzanz.zza(t4, j5, zzanz.zze(t5, j5));
                        zzb((zzamq<T>) t4, i5, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t4, t5, i);
                    break;
            }
        }
        zzand.zza(this.zzp, t4, t5);
        if (this.zzh) {
            zzand.zza(this.zzq, t4, t5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0630 A[Catch: all -> 0x00cb, TryCatch #6 {all -> 0x00cb, blocks: (B:49:0x00c5, B:54:0x00d3, B:166:0x062b, B:168:0x0630, B:169:0x0635, B:65:0x00ff, B:67:0x0114, B:68:0x0125, B:69:0x0136, B:70:0x0147, B:71:0x0158, B:73:0x0162, B:76:0x0169, B:77:0x016e, B:78:0x017b, B:79:0x018c, B:80:0x019a, B:81:0x01ac, B:82:0x01b4, B:83:0x01c6, B:84:0x01d8, B:85:0x01ea, B:86:0x01fc, B:87:0x020e, B:88:0x0220, B:89:0x0232, B:90:0x0244, B:92:0x0254, B:96:0x0275, B:93:0x025e, B:95:0x0266, B:97:0x0286, B:98:0x0298, B:99:0x02a6, B:100:0x02b4, B:101:0x02c2), top: B:196:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0665 A[LOOP:3: B:181:0x0661->B:183:0x0665, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x063b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.firebase-auth-api.zzanc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r18, com.google.android.gms.internal.p002firebaseauthapi.zzanc r19, com.google.android.gms.internal.p002firebaseauthapi.zzaku r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzanc, com.google.android.gms.internal.firebase-auth-api.zzaku):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t4, byte[] bArr, int i, int i5, zzaju zzajuVar) throws zzall {
        zza((zzamq<T>) t4, bArr, i, i5, 0, zzajuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t4, T t5, int i) {
        if (zzc((zzamq<T>) t5, i)) {
            long jZzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t5, jZzc);
            if (object != null) {
                zzanb zzanbVarZze = zze(i);
                if (!zzc((zzamq<T>) t4, i)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t4, jZzc, object);
                    } else {
                        Object objZza = zzanbVarZze.zza();
                        zzanbVarZze.zza(objZza, object);
                        unsafe.putObject(t4, jZzc, objZza);
                    }
                    zzb((zzamq<T>) t4, i);
                    return;
                }
                Object object2 = unsafe.getObject(t4, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzanbVarZze.zza();
                    zzanbVarZze.zza(objZza2, object2);
                    unsafe.putObject(t4, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzanbVarZze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t5));
        }
    }

    private final void zza(Object obj, int i, zzanc zzancVar) {
        if (zzg(i)) {
            zzanz.zza(obj, i & 1048575, zzancVar.zzr());
        } else if (this.zzi) {
            zzanz.zza(obj, i & 1048575, zzancVar.zzq());
        } else {
            zzanz.zza(obj, i & 1048575, zzancVar.zzp());
        }
    }

    private final void zza(T t4, int i, Object obj) {
        zzb.putObject(t4, zzc(i) & 1048575, obj);
        zzb((zzamq<T>) t4, i);
    }

    private final void zza(T t4, int i, int i5, Object obj) {
        zzb.putObject(t4, zzc(i5) & 1048575, obj);
        zzb((zzamq<T>) t4, i, i5);
    }

    private final <K, V> void zza(zzaol zzaolVar, int i, Object obj, int i5) {
        if (obj != null) {
            zzaolVar.zza(i, this.zzr.zza(zzf(i5)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i, Object obj, zzaol zzaolVar) {
        if (obj instanceof String) {
            zzaolVar.zza(i, (String) obj);
        } else {
            zzaolVar.zza(i, (zzajv) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:176:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r24, com.google.android.gms.internal.p002firebaseauthapi.zzaol r25) {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzaol):void");
    }

    private static <UT, UB> void zza(zzanu<UT, UB> zzanuVar, T t4, zzaol zzaolVar) {
        zzanuVar.zzb((zzanu<UT, UB>) zzanuVar.zzd(t4), zzaolVar);
    }

    private final boolean zza(T t4, int i, int i5, int i6, int i7) {
        if (i5 == 1048575) {
            return zzc((zzamq<T>) t4, i);
        }
        return (i6 & i7) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzanb zzanbVar) {
        return zzanbVar.zze(zzanz.zze(obj, i & 1048575));
    }
}
