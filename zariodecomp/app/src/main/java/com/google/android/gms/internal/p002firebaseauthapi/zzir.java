package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzir.smali */
final class zzir extends ThreadLocal<Cipher> {
    private static Cipher zza() {
        try {
            Cipher cipherZza = zzzj.zza.zza("AES/GCM-SIV/NoPadding");
            if (zzgz.zza(cipherZza)) {
                return cipherZza;
            }
            return null;
        } catch (GeneralSecurityException e5) {
            throw new IllegalStateException(e5);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
