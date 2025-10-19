package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\common\zzv.smali */
abstract class zzv extends zzk {
    final CharSequence zzb;
    final zzp zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = f.API_PRIORITY_OTHER;

    public zzv(zzw zzwVar, CharSequence charSequence) {
        this.zzc = zzwVar.zzf();
        this.zzd = zzwVar.zzg();
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzk
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int iZzd;
        int i = this.zze;
        while (true) {
            int i5 = this.zze;
            if (i5 == -1) {
                zzb();
                return null;
            }
            iZzc = zzc(i5);
            if (iZzc == -1) {
                iZzc = this.zzb.length();
                this.zze = -1;
                iZzd = -1;
            } else {
                iZzd = zzd(iZzc);
                this.zze = iZzd;
            }
            if (iZzd == i) {
                int i6 = iZzd + 1;
                this.zze = i6;
                if (i6 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i < iZzc) {
                    this.zzb.charAt(i);
                }
                if (i < iZzc) {
                    this.zzb.charAt(iZzc - 1);
                }
                if (!this.zzd || i != iZzc) {
                    break;
                }
                i = this.zze;
            }
        }
        int i7 = this.zzf;
        if (i7 == 1) {
            CharSequence charSequence = this.zzb;
            int length = charSequence.length();
            this.zze = -1;
            if (length > i) {
                charSequence.charAt(length - 1);
            }
            iZzc = length;
        } else {
            this.zzf = i7 - 1;
        }
        return this.zzb.subSequence(i, iZzc).toString();
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}
