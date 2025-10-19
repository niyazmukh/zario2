package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzakt.smali */
final class zzakt {
    private final Object zza;
    private final int zzb;

    public zzakt(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzakt)) {
            return false;
        }
        zzakt zzaktVar = (zzakt) obj;
        return this.zza == zzaktVar.zza && this.zzb == zzaktVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
