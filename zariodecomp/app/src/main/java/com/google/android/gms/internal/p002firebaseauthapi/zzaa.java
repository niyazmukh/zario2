package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaa.smali */
abstract class zzaa extends zzd<String> {
    final CharSequence zza;
    private final zzf zzb;
    private int zze;
    private int zzd = 0;
    private final boolean zzc = false;

    public zzaa(zzt zztVar, CharSequence charSequence) {
        this.zzb = zztVar.zza;
        this.zze = zztVar.zzc;
        this.zza = charSequence;
    }

    public abstract int zza(int i);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzd
    public final /* synthetic */ String zza() {
        int i = this.zzd;
        while (true) {
            int i5 = this.zzd;
            if (i5 == -1) {
                zzb();
                return null;
            }
            int iZzb = zzb(i5);
            if (iZzb == -1) {
                iZzb = this.zza.length();
                this.zzd = -1;
            } else {
                this.zzd = zza(iZzb);
            }
            int i6 = this.zzd;
            if (i6 != i) {
                while (i < iZzb && this.zzb.zza(this.zza.charAt(i))) {
                    i++;
                }
                while (iZzb > i && this.zzb.zza(this.zza.charAt(iZzb - 1))) {
                    iZzb--;
                }
                int i7 = this.zze;
                if (i7 == 1) {
                    iZzb = this.zza.length();
                    this.zzd = -1;
                    while (iZzb > i && this.zzb.zza(this.zza.charAt(iZzb - 1))) {
                        iZzb--;
                    }
                } else {
                    this.zze = i7 - 1;
                }
                return this.zza.subSequence(i, iZzb).toString();
            }
            int i8 = i6 + 1;
            this.zzd = i8;
            if (i8 > this.zza.length()) {
                this.zzd = -1;
            }
        }
    }

    public abstract int zzb(int i);
}
