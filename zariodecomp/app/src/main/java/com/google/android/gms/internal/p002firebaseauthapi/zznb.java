package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zznb.smali */
public final class zznb implements zzba {
    private static final String zza = "zznb";
    private final zzba zzb;

    public zznb(String str) {
        this.zzb = zzmz.zza(str);
    }

    private static void zza() throws InterruptedException {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzba
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws InterruptedException {
        try {
            return this.zzb.zzb(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e5) {
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e5);
            zza();
            return this.zzb.zzb(bArr, bArr2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzba
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws BadPaddingException, InterruptedException {
        try {
            return this.zzb.zza(bArr, bArr2);
        } catch (BadPaddingException e5) {
            throw e5;
        } catch (GeneralSecurityException | ProviderException e6) {
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e6);
            zza();
            return this.zzb.zza(bArr, bArr2);
        }
    }
}
