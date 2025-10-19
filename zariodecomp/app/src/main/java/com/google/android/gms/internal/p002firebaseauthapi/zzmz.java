package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzmz.smali */
public final class zzmz {
    public static zzba zza(String str) {
        return new zznc(str, zza());
    }

    public static boolean zzb(String str) {
        return zza().containsAlias(str);
    }

    private static KeyStore zza() throws GeneralSecurityException, IOException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException e5) {
            throw new GeneralSecurityException(e5);
        }
    }
}
