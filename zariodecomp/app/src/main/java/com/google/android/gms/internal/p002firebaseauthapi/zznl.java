package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zznl.smali */
public final class zznl<E extends Enum<E>, O> {
    private final Map<E, O> zza;
    private final Map<O, E> zzb;

    public /* synthetic */ zznl(Map map, Map map2, zznn zznnVar) {
        this(map, map2);
    }

    public static <E extends Enum<E>, O> zznk<E, O> zza() {
        return new zznk<>(null);
    }

    private zznl(Map<E, O> map, Map<O, E> map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final E zza(O o5) throws GeneralSecurityException {
        E e5 = this.zzb.get(o5);
        if (e5 != null) {
            return e5;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(o5)));
    }

    public final O zza(E e5) throws GeneralSecurityException {
        O o5 = this.zza.get(e5);
        if (o5 != null) {
            return o5;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(e5)));
    }
}
