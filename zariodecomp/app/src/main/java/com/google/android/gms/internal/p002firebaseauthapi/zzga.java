package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzge;
import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzga.smali */
public final class zzga {
    private static final zzps<zzgb, zzba> zza = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgd
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzga.zza((zzgb) zzbiVar);
        }
    }, zzgb.class, zzba.class);
    private static final zzbh<zzba> zzb = zzod.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzba.class, zzwx.zzb.SYMMETRIC, zzyo.zze());
    private static final zzot<zzge> zzc = new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgc
    };
    private static final zzor<zzge> zzd = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgf
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            return zzga.zza((zzge) zzcbVar, num);
        }
    };

    public static /* synthetic */ zzba zza(zzgb zzgbVar) {
        return zzik.zza() ? zzik.zza(zzgbVar) : zzaak.zza(zzgbVar);
    }

    public static zzgb zza(zzge zzgeVar, Integer num) {
        return zzgb.zza(zzgeVar.zzb(), zzaal.zza(32), num);
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public static void zza(boolean z4) throws GeneralSecurityException {
        if (zziv.zza.zza.zza()) {
            zzij.zza();
            zzpa.zza().zza(zza);
            zzox zzoxVarZza = zzox.zza();
            HashMap map = new HashMap();
            map.put("XCHACHA20_POLY1305", zzge.zza(zzge.zza.zza));
            map.put("XCHACHA20_POLY1305_RAW", zzge.zza(zzge.zza.zzc));
            zzoxVarZza.zza(Collections.unmodifiableMap(map));
            zzop.zza().zza(zzd, zzge.class);
            zzou.zza().zza(zzc, zzge.class);
            zznq.zza().zza((zzbh) zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
    }
}
