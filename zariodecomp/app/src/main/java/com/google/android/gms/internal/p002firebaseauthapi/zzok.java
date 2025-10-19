package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzok.smali */
public final class zzok {
    public static final zzok zza = new zzoj().zza();
    private final Map<String, String> zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzok) {
            return this.zzb.equals(((zzok) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final boolean zza() {
        return this.zzb.isEmpty();
    }

    private zzok(Map<String, String> map) {
        this.zzb = map;
    }
}
