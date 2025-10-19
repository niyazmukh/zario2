package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzln.smali */
public final class zzln {
    private static final byte[] zza = new byte[0];

    public static zzlr zza(zzkb zzkbVar) throws GeneralSecurityException {
        Object objZzb = zzkbVar.zzb();
        if (objZzb instanceof zzdx) {
            return new zzlp((zzdx) objZzb);
        }
        if (objZzb instanceof zzdi) {
            return new zzlm((zzdi) objZzb);
        }
        if (objZzb instanceof zzjf) {
            return new zzlo((zzjf) objZzb);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(objZzb)));
    }
}
