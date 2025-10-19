package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzmu.smali */
final class zzmu implements zzmf {
    private final zzlz zza;
    private final zzmt zzb;

    public zzmu(zzlz zzlzVar) {
        zzmt zzmxVar;
        this.zza = zzlzVar;
        try {
            zzmxVar = zzmv.zzb();
        } catch (GeneralSecurityException unused) {
            zzmxVar = new zzmx();
        }
        this.zzb = zzmxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmf
    public final byte[] zza(byte[] bArr, zzme zzmeVar) throws GeneralSecurityException {
        byte[] bArrZza = this.zzb.zza(zzmeVar.zza().zzb(), bArr);
        byte[] bArrZza2 = zzyz.zza(bArr, zzmeVar.zzb().zzb());
        byte[] bArrZza3 = zzmk.zza(zzmk.zzb);
        zzlz zzlzVar = this.zza;
        return zzlzVar.zza(null, bArrZza, "eae_prk", bArrZza2, "shared_secret", bArrZza3, zzlzVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmf
    public final byte[] zza() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzb(), zzmk.zzf)) {
            return zzmk.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
