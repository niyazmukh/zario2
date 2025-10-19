package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzlo.smali */
final class zzlo implements zzpy {
    private final zzln zza;

    private zzlo(zzln zzlnVar) {
        byte[] bArr = zznl.zzb;
        this.zza = zzlnVar;
        zzlnVar.zza = this;
    }

    public static zzlo zza(zzln zzlnVar) {
        zzlo zzloVar = zzlnVar.zza;
        return zzloVar != null ? zzloVar : new zzlo(zzlnVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzA(int i, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zznx)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i6 += 8;
            }
            this.zza.zzt(i6);
            while (i5 < list.size()) {
                this.zza.zzi(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z4) {
            while (i5 < zznxVar.size()) {
                this.zza.zzh(i, zznxVar.zze(i5));
                i5++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zznxVar.size(); i9++) {
            zznxVar.zze(i9);
            i8 += 8;
        }
        this.zza.zzt(i8);
        while (i5 < zznxVar.size()) {
            this.zza.zzi(zznxVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzB(int i, int i5) {
        zzln zzlnVar = this.zza;
        zzlnVar.zzs(i, (i5 >> 31) ^ (i5 + i5));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzC(int i, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzne)) {
            if (!z4) {
                while (i5 < list.size()) {
                    zzln zzlnVar = this.zza;
                    int iIntValue = ((Integer) list.get(i5)).intValue();
                    zzlnVar.zzs(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i5++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                int iIntValue2 = ((Integer) list.get(i6)).intValue();
                iZzA += zzln.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzt(iZzA);
            while (i5 < list.size()) {
                zzln zzlnVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i5)).intValue();
                zzlnVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i5++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z4) {
            while (i5 < zzneVar.size()) {
                zzln zzlnVar3 = this.zza;
                int iZze = zzneVar.zze(i5);
                zzlnVar3.zzs(i, (iZze >> 31) ^ (iZze + iZze));
                i5++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzneVar.size(); i7++) {
            int iZze2 = zzneVar.zze(i7);
            iZzA2 += zzln.zzA((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzt(iZzA2);
        while (i5 < zzneVar.size()) {
            zzln zzlnVar4 = this.zza;
            int iZze3 = zzneVar.zze(i5);
            zzlnVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzD(int i, long j5) {
        zzln zzlnVar = this.zza;
        zzlnVar.zzu(i, (j5 >> 63) ^ (j5 + j5));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzE(int i, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zznx)) {
            if (!z4) {
                while (i5 < list.size()) {
                    zzln zzlnVar = this.zza;
                    long jLongValue = ((Long) list.get(i5)).longValue();
                    zzlnVar.zzu(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i5++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzB = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                long jLongValue2 = ((Long) list.get(i6)).longValue();
                iZzB += zzln.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzt(iZzB);
            while (i5 < list.size()) {
                zzln zzlnVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i5)).longValue();
                zzlnVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i5++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z4) {
            while (i5 < zznxVar.size()) {
                zzln zzlnVar3 = this.zza;
                long jZze = zznxVar.zze(i5);
                zzlnVar3.zzu(i, (jZze >> 63) ^ (jZze + jZze));
                i5++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzB2 = 0;
        for (int i7 = 0; i7 < zznxVar.size(); i7++) {
            long jZze2 = zznxVar.zze(i7);
            iZzB2 += zzln.zzB((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzt(iZzB2);
        while (i5 < zznxVar.size()) {
            zzln zzlnVar4 = this.zza;
            long jZze3 = zznxVar.zze(i5);
            zzlnVar4.zzv((jZze3 >> 63) ^ (jZze3 + jZze3));
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    @Deprecated
    public final void zzF(int i) {
        this.zza.zzr(i, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzG(int i, String str) {
        this.zza.zzp(i, str);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzH(int i, List list) {
        int i5 = 0;
        if (!(list instanceof zznu)) {
            while (i5 < list.size()) {
                this.zza.zzp(i, (String) list.get(i5));
                i5++;
            }
            return;
        }
        zznu zznuVar = (zznu) list;
        while (i5 < list.size()) {
            Object objZzc = zznuVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzp(i, (String) objZzc);
            } else {
                this.zza.zze(i, (zzle) objZzc);
            }
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzI(int i, int i5) {
        this.zza.zzs(i, i5);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzJ(int i, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzne)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzs(i, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzA += zzln.zzA(((Integer) list.get(i6)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i5 < list.size()) {
                this.zza.zzt(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z4) {
            while (i5 < zzneVar.size()) {
                this.zza.zzs(i, zzneVar.zze(i5));
                i5++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzneVar.size(); i7++) {
            iZzA2 += zzln.zzA(zzneVar.zze(i7));
        }
        this.zza.zzt(iZzA2);
        while (i5 < zzneVar.size()) {
            this.zza.zzt(zzneVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzK(int i, long j5) {
        this.zza.zzu(i, j5);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzL(int i, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zznx)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzu(i, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzB = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzB += zzln.zzB(((Long) list.get(i6)).longValue());
            }
            this.zza.zzt(iZzB);
            while (i5 < list.size()) {
                this.zza.zzv(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z4) {
            while (i5 < zznxVar.size()) {
                this.zza.zzu(i, zznxVar.zze(i5));
                i5++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzB2 = 0;
        for (int i7 = 0; i7 < zznxVar.size(); i7++) {
            iZzB2 += zzln.zzB(zznxVar.zze(i7));
        }
        this.zza.zzt(iZzB2);
        while (i5 < zznxVar.size()) {
            this.zza.zzv(zznxVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzb(int i, boolean z4) {
        this.zza.zzd(i, z4);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzc(int i, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzkv)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzd(i, ((Boolean) list.get(i5)).booleanValue());
                    i5++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Boolean) list.get(i7)).getClass();
                i6++;
            }
            this.zza.zzt(i6);
            while (i5 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
                i5++;
            }
            return;
        }
        zzkv zzkvVar = (zzkv) list;
        if (!z4) {
            while (i5 < zzkvVar.size()) {
                this.zza.zzd(i, zzkvVar.zzf(i5));
                i5++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzkvVar.size(); i9++) {
            zzkvVar.zzf(i9);
            i8++;
        }
        this.zza.zzt(i8);
        while (i5 < zzkvVar.size()) {
            this.zza.zzb(zzkvVar.zzf(i5) ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzd(int i, zzle zzleVar) {
        this.zza.zze(i, zzleVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zze(int i, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.zza.zze(i, (zzle) list.get(i5));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzf(int i, double d5) {
        this.zza.zzh(i, Double.doubleToRawLongBits(d5));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzg(int i, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzmi)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                    i5++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Double) list.get(i7)).getClass();
                i6 += 8;
            }
            this.zza.zzt(i6);
            while (i5 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
            return;
        }
        zzmi zzmiVar = (zzmi) list;
        if (!z4) {
            while (i5 < zzmiVar.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(zzmiVar.zze(i5)));
                i5++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmiVar.size(); i9++) {
            zzmiVar.zze(i9);
            i8 += 8;
        }
        this.zza.zzt(i8);
        while (i5 < zzmiVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzmiVar.zze(i5)));
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    @Deprecated
    public final void zzh(int i) {
        this.zza.zzr(i, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzi(int i, int i5) {
        this.zza.zzj(i, i5);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzj(int i, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzne)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzB = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzB += zzln.zzB(((Integer) list.get(i6)).intValue());
            }
            this.zza.zzt(iZzB);
            while (i5 < list.size()) {
                this.zza.zzk(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z4) {
            while (i5 < zzneVar.size()) {
                this.zza.zzj(i, zzneVar.zze(i5));
                i5++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzB2 = 0;
        for (int i7 = 0; i7 < zzneVar.size(); i7++) {
            iZzB2 += zzln.zzB(zzneVar.zze(i7));
        }
        this.zza.zzt(iZzB2);
        while (i5 < zzneVar.size()) {
            this.zza.zzk(zzneVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzk(int i, int i5) {
        this.zza.zzf(i, i5);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzl(int i, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzne)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzf(i, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            this.zza.zzt(i6);
            while (i5 < list.size()) {
                this.zza.zzg(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z4) {
            while (i5 < zzneVar.size()) {
                this.zza.zzf(i, zzneVar.zze(i5));
                i5++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzneVar.size(); i9++) {
            zzneVar.zze(i9);
            i8 += 4;
        }
        this.zza.zzt(i8);
        while (i5 < zzneVar.size()) {
            this.zza.zzg(zzneVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzm(int i, long j5) {
        this.zza.zzh(i, j5);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzn(int i, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zznx)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i6 += 8;
            }
            this.zza.zzt(i6);
            while (i5 < list.size()) {
                this.zza.zzi(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z4) {
            while (i5 < zznxVar.size()) {
                this.zza.zzh(i, zznxVar.zze(i5));
                i5++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zznxVar.size(); i9++) {
            zznxVar.zze(i9);
            i8 += 8;
        }
        this.zza.zzt(i8);
        while (i5 < zznxVar.size()) {
            this.zza.zzi(zznxVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzo(int i, float f2) {
        this.zza.zzf(i, Float.floatToRawIntBits(f2));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzp(int i, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzmv)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                    i5++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Float) list.get(i7)).getClass();
                i6 += 4;
            }
            this.zza.zzt(i6);
            while (i5 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
            return;
        }
        zzmv zzmvVar = (zzmv) list;
        if (!z4) {
            while (i5 < zzmvVar.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(zzmvVar.zze(i5)));
                i5++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmvVar.size(); i9++) {
            zzmvVar.zze(i9);
            i8 += 4;
        }
        this.zza.zzt(i8);
        while (i5 < zzmvVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzmvVar.zze(i5)));
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzq(int i, Object obj, zzow zzowVar) {
        zzln zzlnVar = this.zza;
        zzlnVar.zzr(i, 3);
        zzowVar.zzj((zzoi) obj, zzlnVar.zza);
        zzlnVar.zzr(i, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzr(int i, int i5) {
        this.zza.zzj(i, i5);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzs(int i, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzne)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzB = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzB += zzln.zzB(((Integer) list.get(i6)).intValue());
            }
            this.zza.zzt(iZzB);
            while (i5 < list.size()) {
                this.zza.zzk(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z4) {
            while (i5 < zzneVar.size()) {
                this.zza.zzj(i, zzneVar.zze(i5));
                i5++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzB2 = 0;
        for (int i7 = 0; i7 < zzneVar.size(); i7++) {
            iZzB2 += zzln.zzB(zzneVar.zze(i7));
        }
        this.zza.zzt(iZzB2);
        while (i5 < zzneVar.size()) {
            this.zza.zzk(zzneVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzt(int i, long j5) {
        this.zza.zzu(i, j5);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzu(int i, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zznx)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzu(i, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzB = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzB += zzln.zzB(((Long) list.get(i6)).longValue());
            }
            this.zza.zzt(iZzB);
            while (i5 < list.size()) {
                this.zza.zzv(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z4) {
            while (i5 < zznxVar.size()) {
                this.zza.zzu(i, zznxVar.zze(i5));
                i5++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzB2 = 0;
        for (int i7 = 0; i7 < zznxVar.size(); i7++) {
            iZzB2 += zzln.zzB(zznxVar.zze(i7));
        }
        this.zza.zzt(iZzB2);
        while (i5 < zznxVar.size()) {
            this.zza.zzv(zznxVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzv(int i, Object obj, zzow zzowVar) {
        this.zza.zzm(i, (zzoi) obj, zzowVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzw(int i, Object obj) {
        boolean z4 = obj instanceof zzle;
        zzln zzlnVar = this.zza;
        if (z4) {
            zzlnVar.zzo(i, (zzle) obj);
        } else {
            zzlnVar.zzn(i, (zzoi) obj);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzx(int i, int i5) {
        this.zza.zzf(i, i5);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzy(int i, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzne)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzf(i, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            this.zza.zzt(i6);
            while (i5 < list.size()) {
                this.zza.zzg(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z4) {
            while (i5 < zzneVar.size()) {
                this.zza.zzf(i, zzneVar.zze(i5));
                i5++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzneVar.size(); i9++) {
            zzneVar.zze(i9);
            i8 += 4;
        }
        this.zza.zzt(i8);
        while (i5 < zzneVar.size()) {
            this.zza.zzg(zzneVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzz(int i, long j5) {
        this.zza.zzh(i, j5);
    }
}
