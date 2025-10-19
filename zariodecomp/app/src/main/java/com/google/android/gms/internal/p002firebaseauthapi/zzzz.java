package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzzz.smali */
public final class zzzz implements zzsq {
    public static zzsq zza(zzso zzsoVar) {
        zzsq zzsqVarZza = zzsv.zza(zzsoVar);
        try {
            return new zzaac(zzsqVarZza, zzsx.zza(zzsoVar), (zzaab) null);
        } catch (GeneralSecurityException unused) {
            return zzsqVarZza;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsq
    public final byte[] zza(byte[] bArr, int i) {
        throw new NoSuchMethodError();
    }
}
