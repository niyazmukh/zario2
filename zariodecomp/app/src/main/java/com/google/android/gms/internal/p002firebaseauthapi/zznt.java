package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zznt.smali */
public abstract class zznt<SerializationT extends zzqf> {
    private final zzaaj zza;
    private final Class<SerializationT> zzb;

    public static <SerializationT extends zzqf> zznt<SerializationT> zza(zznv<SerializationT> zznvVar, zzaaj zzaajVar, Class<SerializationT> cls) {
        return new zzns(zzaajVar, cls, zznvVar);
    }

    public abstract zzbi zza(SerializationT serializationt, zzch zzchVar);

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zznt(zzaaj zzaajVar, Class<SerializationT> cls) {
        this.zza = zzaajVar;
        this.zzb = cls;
    }

    public final zzaaj zza() {
        return this.zza;
    }
}
