package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzamx.smali */
final class zzamx {
    private static final zzamx zza = new zzamx();
    private final ConcurrentMap<Class<?>, zzanb<?>> zzc = new ConcurrentHashMap();
    private final zzane zzb = new zzama();

    private zzamx() {
    }

    public static zzamx zza() {
        return zza;
    }

    public final <T> zzanb<T> zza(Class<T> cls) {
        zzalh.zza(cls, "messageType");
        zzanb<T> zzanbVar = (zzanb) this.zzc.get(cls);
        if (zzanbVar != null) {
            return zzanbVar;
        }
        zzanb<T> zzanbVarZza = this.zzb.zza(cls);
        zzalh.zza(cls, "messageType");
        zzalh.zza(zzanbVarZza, "schema");
        zzanb<T> zzanbVar2 = (zzanb) this.zzc.putIfAbsent(cls, zzanbVarZza);
        return zzanbVar2 != null ? zzanbVar2 : zzanbVarZza;
    }

    public final <T> zzanb<T> zza(T t4) {
        return zza((Class) t4.getClass());
    }
}
