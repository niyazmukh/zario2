package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzsx.smali */
public final class zzsx implements zzsq {
    private static final zziv.zza zza = zziv.zza.zza;
    private final Key zzb;
    private final Provider zzc;

    private zzsx(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.zzb = new SecretKeySpec(bArr, "AES");
        this.zzc = provider;
    }

    public static zzsq zza(zzso zzsoVar) throws GeneralSecurityException {
        Provider providerZza = zznh.zza();
        if (providerZza == null) {
            throw new GeneralSecurityException("Conscrypt not available");
        }
        Mac.getInstance("AESCMAC", providerZza);
        return new zzsx(zzsoVar.zzd().zza(zzbf.zza()), providerZza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsq
    public final byte[] zza(byte[] bArr, int i) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i <= 16) {
            Mac mac = Mac.getInstance("AESCMAC", this.zzc);
            mac.init(this.zzb);
            byte[] bArrDoFinal = mac.doFinal(bArr);
            return i == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i);
        }
        throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
    }
}
