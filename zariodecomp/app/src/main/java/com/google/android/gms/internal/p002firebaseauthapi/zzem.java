package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzem.smali */
public final class zzem extends zzcy {
    private final zza zza;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzem$zza.smali */
    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        private zza(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    private zzem(zza zzaVar) {
        this.zza = zzaVar;
    }

    public static zzem zza(zza zzaVar) {
        return new zzem(zzaVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzem) && ((zzem) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzem.class, this.zza);
    }

    public final String toString() {
        return a.l("ChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.zza), ")");
    }

    public final zza zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final boolean zza() {
        return this.zza != zza.zzc;
    }
}
