package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzdc.smali */
final class zzdc implements zzba {
    private final zzcz zza;
    private final zzpl<zzcz> zzb;
    private final zzoo zzc;
    private final zzoo zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzba
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzcz zzczVar : this.zzb.zza(bArr)) {
            try {
                byte[] bArrZza = zzczVar.zza.zza(bArr, bArr2);
                this.zzd.zza(zzczVar.zzb, bArr.length);
                return bArrZza;
            } catch (GeneralSecurityException unused) {
            }
        }
        this.zzd.zza();
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzba
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] bArrZzb = this.zza.zza.zzb(bArr, bArr2);
            this.zzc.zza(this.zza.zzb, bArr.length);
            return bArrZzb;
        } catch (GeneralSecurityException e5) {
            this.zzc.zza();
            throw e5;
        }
    }

    private zzdc(zzcz zzczVar, zzpl<zzcz> zzplVar, zzoo zzooVar, zzoo zzooVar2) {
        this.zza = zzczVar;
        this.zzb = zzplVar;
        this.zzc = zzooVar;
        this.zzd = zzooVar2;
    }
}
