package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzbq.smali */
public final class zzbq {
    private boolean zza;
    private zzbk zzb;
    private final zzcb zzc;
    private zzbp zzd;
    private zzbn zze;

    private zzbq(zzcb zzcbVar) {
        this.zzb = zzbk.zza;
        this.zzd = null;
        this.zze = null;
        this.zzc = zzcbVar;
    }

    public final zzbq zzb() {
        this.zzd = zzbp.zza;
        return this;
    }

    public final zzbq zza() {
        zzbn zzbnVar = this.zze;
        if (zzbnVar != null) {
            zzbnVar.zzb();
        }
        this.zza = true;
        return this;
    }
}
