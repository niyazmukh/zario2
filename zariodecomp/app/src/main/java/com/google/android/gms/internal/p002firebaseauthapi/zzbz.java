package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzbz.smali */
public final class zzbz {
    public static zzbm zza(zzbv zzbvVar, zzch zzchVar) {
        if (zzchVar != null) {
            return zzbm.zza(zzbvVar.zzb());
        }
        throw new NullPointerException("SecretKeyAccess cannot be null");
    }

    public static void zza(zzbm zzbmVar, zzby zzbyVar, zzch zzchVar) {
        if (zzchVar != null) {
            zzbyVar.zza(zzbmVar.zzd());
            return;
        }
        throw new NullPointerException("SecretKeyAccess cannot be null");
    }
}
