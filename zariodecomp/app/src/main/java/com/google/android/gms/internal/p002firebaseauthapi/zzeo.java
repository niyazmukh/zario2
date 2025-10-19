package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzeo.smali */
public final class zzeo {
    private static final zzps<zzet, zzba> zza = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzen
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            zzet zzetVar = (zzet) zzbiVar;
            return zzia.zza(zzca.zza(((zzev) ((zzcy) zzetVar.zza())).zzc()).zza(((zzev) ((zzcy) zzetVar.zza())).zzc()), zzetVar.zzd());
        }
    }, zzet.class, zzba.class);
    private static final zzbh<zzba> zzb = zzod.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzba.class, zzwx.zzb.REMOTE, zzxn.zze());
    private static final zzor<zzev> zzc = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeq
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            return zzet.zza((zzev) zzcbVar, num);
        }
    };

    public static void zza(boolean z4) throws GeneralSecurityException {
        if (zziv.zza.zza.zza()) {
            zzex.zza();
            zzpa.zza().zza(zza);
            zzop.zza().zza(zzc, zzev.class);
            zznq.zza().zza((zzbh) zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
    }
}
