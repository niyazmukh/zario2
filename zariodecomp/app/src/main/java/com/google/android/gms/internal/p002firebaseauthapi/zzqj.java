package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzqj.smali */
final class zzqj {
    private final Class<?> zza;
    private final Class<? extends zzqf> zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqj)) {
            return false;
        }
        zzqj zzqjVar = (zzqj) obj;
        return zzqjVar.zza.equals(this.zza) && zzqjVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return AbstractC0854a.c(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }

    private zzqj(Class<?> cls, Class<? extends zzqf> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}
