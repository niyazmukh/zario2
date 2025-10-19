package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zznk.smali */
public final class zznk<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    public /* synthetic */ zznk(zznn zznnVar) {
        this();
    }

    public final zznk<E, O> zza(E e5, O o5) {
        this.zza.put(e5, o5);
        this.zzb.put(o5, e5);
        return this;
    }

    private zznk() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zznl<E, O> zza() {
        return new zznl<>(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }
}
