package com.google.android.gms.internal.auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzge.smali */
final class zzge {
    private static final zzge zza = new zzge();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzgi zzb = new zzfo();

    private zzge() {
    }

    public static zzge zza() {
        return zza;
    }

    public final zzgh zzb(Class cls) {
        zzez.zzf(cls, "messageType");
        zzgh zzghVarZza = (zzgh) this.zzc.get(cls);
        if (zzghVarZza == null) {
            zzghVarZza = this.zzb.zza(cls);
            zzez.zzf(cls, "messageType");
            zzez.zzf(zzghVarZza, "schema");
            zzgh zzghVar = (zzgh) this.zzc.putIfAbsent(cls, zzghVarZza);
            if (zzghVar != null) {
                return zzghVar;
            }
        }
        return zzghVarZza;
    }
}
