package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import com.google.android.gms.internal.p002firebaseauthapi.zzjf;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzjb.smali */
public final class zzjb {
    private static final zzps<zzja, zzbe> zza = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzje
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzjb.zza((zzja) zzbiVar);
        }
    }, zzja.class, zzbe.class);
    private static final zzbh<zzbe> zzb = zzod.zza("type.googleapis.com/google.crypto.tink.AesSivKey", zzbe.class, zzwx.zzb.SYMMETRIC, zzup.zze());
    private static final zzot<zzjf> zzc = new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjd
    };
    private static final zzor<zzjf> zzd = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjg
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            return zzjb.zza((zzjf) zzcbVar, num);
        }
    };

    public static /* synthetic */ zzbe zza(zzja zzjaVar) throws InvalidAlgorithmParameterException {
        zza((zzjf) zzjaVar.zza());
        return zzyx.zza(zzjaVar);
    }

    public static zzja zza(zzjf zzjfVar, Integer num) throws InvalidAlgorithmParameterException {
        zza(zzjfVar);
        return zzja.zzc().zza(zzjfVar).zza(num).zza(zzaal.zza(zzjfVar.zzb())).zza();
    }

    public static void zza(boolean z4) throws GeneralSecurityException {
        if (zziv.zza.zza.zza()) {
            zzjs.zza();
            zzpa.zza().zza(zza);
            zzox zzoxVarZza = zzox.zza();
            HashMap map = new HashMap();
            map.put("AES256_SIV", zzjq.zza);
            map.put("AES256_SIV_RAW", zzjf.zzc().zza(64).zza(zzjf.zza.zzc).zza());
            zzoxVarZza.zza(Collections.unmodifiableMap(map));
            zzou.zza().zza(zzc, zzjf.class);
            zzop.zza().zza(zzd, zzjf.class);
            zznq.zza().zza((zzbh) zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
    }

    private static void zza(zzjf zzjfVar) throws InvalidAlgorithmParameterException {
        if (zzjfVar.zzb() != 64) {
            throw new InvalidAlgorithmParameterException(a.i("invalid key size: ", zzjfVar.zzb(), ". Valid keys must have 64 bytes."));
        }
    }
}
