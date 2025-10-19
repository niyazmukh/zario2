package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzbj.smali */
public final class zzbj {
    private final zzcb zza;

    private zzbj(zzcb zzcbVar) {
        this.zza = zzcbVar;
    }

    public static zzbj zza(zzcb zzcbVar) {
        return new zzbj(zzcbVar);
    }

    private final zzxb zzb() {
        try {
            zzcb zzcbVar = this.zza;
            return zzcbVar instanceof zzoi ? ((zzoi) zzcbVar).zzb().zza() : ((zzqe) zzoz.zza().zza((zzoz) this.zza, zzqe.class)).zza();
        } catch (GeneralSecurityException e5) {
            throw new zzql("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(this.zza)), e5);
        }
    }

    public final zzcb zza() {
        zzcb zzcbVar = this.zza;
        return zzcbVar != null ? zzcbVar : zzcj.zza(zzb().zzk());
    }
}
