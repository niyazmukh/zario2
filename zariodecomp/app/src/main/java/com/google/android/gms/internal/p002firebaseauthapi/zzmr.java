package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzmr.smali */
final class zzmr implements zzmf {
    private final zzzi zza;
    private final zzlz zzb;

    private zzmr(zzlz zzlzVar, zzzi zzziVar) {
        this.zzb = zzlzVar;
        this.zza = zzziVar;
    }

    public static zzmr zza(zzzi zzziVar) throws GeneralSecurityException {
        int i = zzmq.zza[zzziVar.ordinal()];
        if (i == 1) {
            return new zzmr(new zzlz("HmacSha256"), zzzi.NIST_P256);
        }
        if (i == 2) {
            return new zzmr(new zzlz("HmacSha384"), zzzi.NIST_P384);
        }
        if (i == 3) {
            return new zzmr(new zzlz("HmacSha512"), zzzi.NIST_P521);
        }
        throw new GeneralSecurityException("invalid curve type: ".concat(String.valueOf(zzziVar)));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmf
    public final byte[] zza(byte[] bArr, zzme zzmeVar) throws GeneralSecurityException {
        ECPrivateKey eCPrivateKeyZza = zzzf.zza(this.zza, zzmeVar.zza().zzb());
        zzzi zzziVar = this.zza;
        byte[] bArrZza = zzzf.zza(eCPrivateKeyZza, zzzf.zza(zzzf.zza(zzziVar), zzzh.UNCOMPRESSED, bArr));
        byte[] bArrZza2 = zzyz.zza(bArr, zzmeVar.zzb().zzb());
        byte[] bArrZza3 = zzmk.zza(zza());
        zzlz zzlzVar = this.zzb;
        return zzlzVar.zza(null, bArrZza, "eae_prk", bArrZza2, "shared_secret", bArrZza3, zzlzVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmf
    public final byte[] zza() throws GeneralSecurityException {
        int i = zzmq.zza[this.zza.ordinal()];
        if (i == 1) {
            return zzmk.zzc;
        }
        if (i == 2) {
            return zzmk.zzd;
        }
        if (i == 3) {
            return zzmk.zze;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
