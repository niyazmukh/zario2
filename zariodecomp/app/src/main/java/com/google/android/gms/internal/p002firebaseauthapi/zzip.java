package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzip.smali */
public final class zzip implements zzba {
    private static final ThreadLocal<Cipher> zza = new zzir();

    /* JADX INFO: Access modifiers changed from: private */
    public static Cipher zzb() throws GeneralSecurityException {
        try {
            Cipher cipher = zza.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e5) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e5);
        }
    }

    public static zzba zza(zzdz zzdzVar) {
        return zzgz.zza(zzdzVar, (zzhc<Cipher>) new zzhc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzis
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhc
            public final Object zza() {
                return zzip.zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzba
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzba
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        throw new NoSuchMethodError();
    }
}
