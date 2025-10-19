package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import com.google.android.gms.internal.p002firebaseauthapi.zzxh;
import com.google.android.gms.internal.p002firebaseauthapi.zzxk;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzcm.smali */
final class zzcm {
    static {
        Charset.forName("UTF-8");
    }

    public static zzxk zza(zzxh zzxhVar) {
        zzxk.zza zzaVarZza = zzxk.zza().zza(zzxhVar.zzb());
        for (zzxh.zzb zzbVar : zzxhVar.zze()) {
            zzaVarZza.zza((zzxk.zzb) ((zzalf) zzxk.zzb.zza().zza(zzbVar.zzb().zzf()).zza(zzbVar.zzc()).zza(zzbVar.zzf()).zza(zzbVar.zza()).zze()));
        }
        return (zzxk) ((zzalf) zzaVarZza.zze());
    }

    public static void zzb(zzxh zzxhVar) {
        int iZzb = zzxhVar.zzb();
        int i = 0;
        boolean z4 = false;
        boolean z5 = true;
        for (zzxh.zzb zzbVar : zzxhVar.zze()) {
            if (zzbVar.zzc() == zzxc.ENABLED) {
                if (!zzbVar.zzg()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzbVar.zza())));
                }
                if (zzbVar.zzf() == zzxz.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzbVar.zza())));
                }
                if (zzbVar.zzc() == zzxc.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzbVar.zza())));
                }
                if (zzbVar.zza() == iZzb) {
                    if (z4) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z4 = true;
                }
                if (zzbVar.zzb().zzb() != zzwx.zzb.ASYMMETRIC_PUBLIC) {
                    z5 = false;
                }
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z4 && !z5) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
