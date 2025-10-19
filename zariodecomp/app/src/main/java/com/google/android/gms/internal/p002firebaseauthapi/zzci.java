package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzci.smali */
public final class zzci {
    static {
        Logger.getLogger(zzci.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(zzba.class);
        hashSet.add(zzbe.class);
        hashSet.add(zzck.class);
        hashSet.add(zzbg.class);
        hashSet.add(zzbd.class);
        hashSet.add(zzcc.class);
        hashSet.add(zzsq.class);
        hashSet.add(zzcg.class);
        hashSet.add(zzcf.class);
        Collections.unmodifiableSet(hashSet);
    }

    private zzci() {
    }

    @Deprecated
    public static zzwx zza(String str, zzajv zzajvVar) throws GeneralSecurityException {
        zzbh<?> zzbhVarZza = zznq.zza().zza(str);
        if (zzbhVarZza instanceof zzcd) {
            return ((zzcd) zzbhVarZza).zzc(zzajvVar);
        }
        throw new GeneralSecurityException(a.l("manager for key type ", str, " is not a PrivateKeyManager"));
    }
}
