package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzcj.smali */
public final class zzcj {
    public static zzcb zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzxb zzxbVarZza = zzxb.zza(bArr, zzaku.zza());
            zzoz zzozVarZza = zzoz.zza();
            zzqe zzqeVarZza = zzqe.zza(zzxbVarZza);
            return !zzozVarZza.zzc(zzqeVarZza) ? new zzoi(zzqeVarZza) : zzozVarZza.zza((zzoz) zzqeVarZza);
        } catch (IOException e5) {
            throw new GeneralSecurityException("Failed to parse proto", e5);
        }
    }

    public static byte[] zza(zzcb zzcbVar) {
        if (zzcbVar instanceof zzoi) {
            return ((zzoi) zzcbVar).zzb().zza().zzk();
        }
        return ((zzqe) zzoz.zza().zza((zzoz) zzcbVar, zzqe.class)).zza().zzk();
    }
}
