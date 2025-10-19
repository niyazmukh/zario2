package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzqk.smali */
final class zzqk {
    private final Class<? extends zzqf> zza;
    private final zzaaj zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqk)) {
            return false;
        }
        zzqk zzqkVar = (zzqk) obj;
        return zzqkVar.zza.equals(this.zza) && zzqkVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return AbstractC0854a.c(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }

    private zzqk(Class<? extends zzqf> cls, zzaaj zzaajVar) {
        this.zza = cls;
        this.zzb = zzaajVar;
    }
}
