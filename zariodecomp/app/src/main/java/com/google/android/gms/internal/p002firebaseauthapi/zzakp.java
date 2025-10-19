package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzakp.smali */
final class zzakp implements zzaol {
    private final zzakn zza;

    private zzakp(zzakn zzaknVar) {
        zzakn zzaknVar2 = (zzakn) zzalh.zza(zzaknVar, "output");
        this.zza = zzaknVar2;
        zzaknVar2.zza = this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzb(int i, List<Double> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzaks)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzb(i, list.get(i5).doubleValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int iZza = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZza += zzakn.zza(list.get(i6).doubleValue());
            }
            this.zza.zzm(iZza);
            while (i5 < list.size()) {
                this.zza.zzb(list.get(i5).doubleValue());
                i5++;
            }
            return;
        }
        zzaks zzaksVar = (zzaks) list;
        if (!z4) {
            while (i5 < zzaksVar.size()) {
                this.zza.zzb(i, zzaksVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int iZza2 = 0;
        for (int i7 = 0; i7 < zzaksVar.size(); i7++) {
            iZza2 += zzakn.zza(zzaksVar.zzb(i7));
        }
        this.zza.zzm(iZza2);
        while (i5 < zzaksVar.size()) {
            this.zza.zzb(zzaksVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzc(int i, List<Integer> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzali)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int iZza = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZza += zzakn.zza(list.get(i6).intValue());
            }
            this.zza.zzm(iZza);
            while (i5 < list.size()) {
                this.zza.zzk(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z4) {
            while (i5 < zzaliVar.size()) {
                this.zza.zzh(i, zzaliVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int iZza2 = 0;
        for (int i7 = 0; i7 < zzaliVar.size(); i7++) {
            iZza2 += zzakn.zza(zzaliVar.zzb(i7));
        }
        this.zza.zzm(iZza2);
        while (i5 < zzaliVar.size()) {
            this.zza.zzk(zzaliVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzd(int i, List<Integer> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzali)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzg(i, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int iZzb = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzb += zzakn.zzb(list.get(i6).intValue());
            }
            this.zza.zzm(iZzb);
            while (i5 < list.size()) {
                this.zza.zzj(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z4) {
            while (i5 < zzaliVar.size()) {
                this.zza.zzg(i, zzaliVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int iZzb2 = 0;
        for (int i7 = 0; i7 < zzaliVar.size(); i7++) {
            iZzb2 += zzakn.zzb(zzaliVar.zzb(i7));
        }
        this.zza.zzm(iZzb2);
        while (i5 < zzaliVar.size()) {
            this.zza.zzj(zzaliVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zze(int i, List<Long> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzalx)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzf(i, list.get(i5).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int iZza = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZza += zzakn.zza(list.get(i6).longValue());
            }
            this.zza.zzm(iZza);
            while (i5 < list.size()) {
                this.zza.zzf(list.get(i5).longValue());
                i5++;
            }
            return;
        }
        zzalx zzalxVar = (zzalx) list;
        if (!z4) {
            while (i5 < zzalxVar.size()) {
                this.zza.zzf(i, zzalxVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int iZza2 = 0;
        for (int i7 = 0; i7 < zzalxVar.size(); i7++) {
            iZza2 += zzakn.zza(zzalxVar.zzb(i7));
        }
        this.zza.zzm(iZza2);
        while (i5 < zzalxVar.size()) {
            this.zza.zzf(zzalxVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzf(int i, List<Float> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzald)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzb(i, list.get(i5).floatValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int iZza = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZza += zzakn.zza(list.get(i6).floatValue());
            }
            this.zza.zzm(iZza);
            while (i5 < list.size()) {
                this.zza.zzb(list.get(i5).floatValue());
                i5++;
            }
            return;
        }
        zzald zzaldVar = (zzald) list;
        if (!z4) {
            while (i5 < zzaldVar.size()) {
                this.zza.zzb(i, zzaldVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int iZza2 = 0;
        for (int i7 = 0; i7 < zzaldVar.size(); i7++) {
            iZza2 += zzakn.zza(zzaldVar.zzb(i7));
        }
        this.zza.zzm(iZza2);
        while (i5 < zzaldVar.size()) {
            this.zza.zzb(zzaldVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzg(int i, List<Integer> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzali)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int iZzc = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzc += zzakn.zzc(list.get(i6).intValue());
            }
            this.zza.zzm(iZzc);
            while (i5 < list.size()) {
                this.zza.zzk(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z4) {
            while (i5 < zzaliVar.size()) {
                this.zza.zzh(i, zzaliVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int iZzc2 = 0;
        for (int i7 = 0; i7 < zzaliVar.size(); i7++) {
            iZzc2 += zzakn.zzc(zzaliVar.zzb(i7));
        }
        this.zza.zzm(iZzc2);
        while (i5 < zzaliVar.size()) {
            this.zza.zzk(zzaliVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzh(int i, List<Long> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzalx)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i, list.get(i5).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int iZzb = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzb += zzakn.zzb(list.get(i6).longValue());
            }
            this.zza.zzm(iZzb);
            while (i5 < list.size()) {
                this.zza.zzh(list.get(i5).longValue());
                i5++;
            }
            return;
        }
        zzalx zzalxVar = (zzalx) list;
        if (!z4) {
            while (i5 < zzalxVar.size()) {
                this.zza.zzh(i, zzalxVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int iZzb2 = 0;
        for (int i7 = 0; i7 < zzalxVar.size(); i7++) {
            iZzb2 += zzakn.zzb(zzalxVar.zzb(i7));
        }
        this.zza.zzm(iZzb2);
        while (i5 < zzalxVar.size()) {
            this.zza.zzh(zzalxVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzi(int i, List<Integer> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzali)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzg(i, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int iZzf = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzf += zzakn.zzf(list.get(i6).intValue());
            }
            this.zza.zzm(iZzf);
            while (i5 < list.size()) {
                this.zza.zzj(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z4) {
            while (i5 < zzaliVar.size()) {
                this.zza.zzg(i, zzaliVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int iZzf2 = 0;
        for (int i7 = 0; i7 < zzaliVar.size(); i7++) {
            iZzf2 += zzakn.zzf(zzaliVar.zzb(i7));
        }
        this.zza.zzm(iZzf2);
        while (i5 < zzaliVar.size()) {
            this.zza.zzj(zzaliVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzj(int i, List<Long> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzalx)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzf(i, list.get(i5).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int iZzc = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzc += zzakn.zzc(list.get(i6).longValue());
            }
            this.zza.zzm(iZzc);
            while (i5 < list.size()) {
                this.zza.zzf(list.get(i5).longValue());
                i5++;
            }
            return;
        }
        zzalx zzalxVar = (zzalx) list;
        if (!z4) {
            while (i5 < zzalxVar.size()) {
                this.zza.zzf(i, zzalxVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int iZzc2 = 0;
        for (int i7 = 0; i7 < zzalxVar.size(); i7++) {
            iZzc2 += zzakn.zzc(zzalxVar.zzb(i7));
        }
        this.zza.zzm(iZzc2);
        while (i5 < zzalxVar.size()) {
            this.zza.zzf(zzalxVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzk(int i, List<Integer> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzali)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzi(i, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int iZzg = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzg += zzakn.zzg(list.get(i6).intValue());
            }
            this.zza.zzm(iZzg);
            while (i5 < list.size()) {
                this.zza.zzl(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z4) {
            while (i5 < zzaliVar.size()) {
                this.zza.zzi(i, zzaliVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int iZzg2 = 0;
        for (int i7 = 0; i7 < zzaliVar.size(); i7++) {
            iZzg2 += zzakn.zzg(zzaliVar.zzb(i7));
        }
        this.zza.zzm(iZzg2);
        while (i5 < zzaliVar.size()) {
            this.zza.zzl(zzaliVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzl(int i, List<Long> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzalx)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzg(i, list.get(i5).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int iZzd = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzd += zzakn.zzd(list.get(i6).longValue());
            }
            this.zza.zzm(iZzd);
            while (i5 < list.size()) {
                this.zza.zzg(list.get(i5).longValue());
                i5++;
            }
            return;
        }
        zzalx zzalxVar = (zzalx) list;
        if (!z4) {
            while (i5 < zzalxVar.size()) {
                this.zza.zzg(i, zzalxVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int iZzd2 = 0;
        for (int i7 = 0; i7 < zzalxVar.size(); i7++) {
            iZzd2 += zzakn.zzd(zzalxVar.zzb(i7));
        }
        this.zza.zzm(iZzd2);
        while (i5 < zzalxVar.size()) {
            this.zza.zzg(zzalxVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzm(int i, List<Integer> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzali)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzk(i, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int iZzi = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzi += zzakn.zzi(list.get(i6).intValue());
            }
            this.zza.zzm(iZzi);
            while (i5 < list.size()) {
                this.zza.zzm(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z4) {
            while (i5 < zzaliVar.size()) {
                this.zza.zzk(i, zzaliVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int iZzi2 = 0;
        for (int i7 = 0; i7 < zzaliVar.size(); i7++) {
            iZzi2 += zzakn.zzi(zzaliVar.zzb(i7));
        }
        this.zza.zzm(iZzi2);
        while (i5 < zzaliVar.size()) {
            this.zza.zzm(zzaliVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzn(int i, List<Long> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzalx)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i, list.get(i5).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int iZze = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZze += zzakn.zze(list.get(i6).longValue());
            }
            this.zza.zzm(iZze);
            while (i5 < list.size()) {
                this.zza.zzh(list.get(i5).longValue());
                i5++;
            }
            return;
        }
        zzalx zzalxVar = (zzalx) list;
        if (!z4) {
            while (i5 < zzalxVar.size()) {
                this.zza.zzh(i, zzalxVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int iZze2 = 0;
        for (int i7 = 0; i7 < zzalxVar.size(); i7++) {
            iZze2 += zzakn.zze(zzalxVar.zzb(i7));
        }
        this.zza.zzm(iZze2);
        while (i5 < zzalxVar.size()) {
            this.zza.zzh(zzalxVar.zzb(i5));
            i5++;
        }
    }

    public static zzakp zza(zzakn zzaknVar) {
        zzakp zzakpVar = zzaknVar.zza;
        return zzakpVar != null ? zzakpVar : new zzakp(zzaknVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zza(int i, boolean z4) {
        this.zza.zzb(i, z4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zza(int i, List<Boolean> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzajt)) {
            if (z4) {
                this.zza.zzj(i, 2);
                int iZza = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    iZza += zzakn.zza(list.get(i6).booleanValue());
                }
                this.zza.zzm(iZza);
                while (i5 < list.size()) {
                    this.zza.zzb(list.get(i5).booleanValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                this.zza.zzb(i, list.get(i5).booleanValue());
                i5++;
            }
            return;
        }
        zzajt zzajtVar = (zzajt) list;
        if (z4) {
            this.zza.zzj(i, 2);
            int iZza2 = 0;
            for (int i7 = 0; i7 < zzajtVar.size(); i7++) {
                iZza2 += zzakn.zza(zzajtVar.zzb(i7));
            }
            this.zza.zzm(iZza2);
            while (i5 < zzajtVar.size()) {
                this.zza.zzb(zzajtVar.zzb(i5));
                i5++;
            }
            return;
        }
        while (i5 < zzajtVar.size()) {
            this.zza.zzb(i, zzajtVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzb(int i, int i5) {
        this.zza.zzg(i, i5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzd(int i, int i5) {
        this.zza.zzg(i, i5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zze(int i, int i5) {
        this.zza.zzi(i, i5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzf(int i, int i5) {
        this.zza.zzk(i, i5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzb(int i, long j5) {
        this.zza.zzh(i, j5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zze(int i, long j5) {
        this.zza.zzh(i, j5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzd(int i, long j5) {
        this.zza.zzg(i, j5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzb(int i, Object obj, zzanb zzanbVar) {
        zzajm zzajmVar = (zzajm) obj;
        this.zza.zzj(i, 2);
        this.zza.zzm(zzajmVar.zza(zzanbVar));
        zzanbVar.zza((zzanb) zzajmVar, (zzaol) this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zza(int i, zzajv zzajvVar) {
        this.zza.zzc(i, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzc(int i, int i5) {
        this.zza.zzh(i, i5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zza(int i, List<zzajv> list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.zza.zzc(i, list.get(i5));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzc(int i, long j5) {
        this.zza.zzf(i, j5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zza(int i, double d5) {
        this.zza.zzb(i, d5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzb(int i, List<?> list, zzanb zzanbVar) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzb(i, list.get(i5), zzanbVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    @Deprecated
    public final void zza(int i) {
        this.zza.zzj(i, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zza(int i, int i5) {
        this.zza.zzh(i, i5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    @Deprecated
    public final void zzb(int i) {
        this.zza.zzj(i, 3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zzb(int i, List<String> list) {
        int i5 = 0;
        if (list instanceof zzalt) {
            zzalt zzaltVar = (zzalt) list;
            while (i5 < list.size()) {
                Object objZza = zzaltVar.zza(i5);
                if (objZza instanceof String) {
                    this.zza.zzb(i, (String) objZza);
                } else {
                    this.zza.zzc(i, (zzajv) objZza);
                }
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.zza.zzb(i, list.get(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zza(int i, long j5) {
        this.zza.zzf(i, j5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zza(int i, float f2) {
        this.zza.zzb(i, f2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zza(int i, Object obj, zzanb zzanbVar) {
        this.zza.zzj(i, 3);
        zzanbVar.zza((zzanb) obj, (zzaol) this);
        this.zza.zzj(i, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zza(int i, List<?> list, zzanb zzanbVar) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            zza(i, list.get(i5), zzanbVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final <K, V> void zza(int i, zzamd<K, V> zzamdVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzj(i, 2);
            this.zza.zzm(zzame.zza(zzamdVar, entry.getKey(), entry.getValue()));
            zzame.zza(this.zza, zzamdVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zza(int i, Object obj) {
        if (obj instanceof zzajv) {
            this.zza.zzd(i, (zzajv) obj);
        } else {
            this.zza.zzb(i, (zzamm) obj);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaol
    public final void zza(int i, String str) {
        this.zza.zzb(i, str);
    }
}
