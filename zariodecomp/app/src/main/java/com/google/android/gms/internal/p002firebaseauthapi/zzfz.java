package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzfz.smali */
public final class zzfz extends zzcy {
    private final zza zza;
    private final int zzb;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzfz$zza.smali */
    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("NO_PREFIX");
        private final String zzc;

        private zza(String str) {
            this.zzc = str;
        }

        public final String toString() {
            return this.zzc;
        }
    }

    private zzfz(zza zzaVar, int i) {
        this.zza = zzaVar;
        this.zzb = i;
    }

    public static zzfz zza(zza zzaVar, int i) throws GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzfz(zzaVar, i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfz)) {
            return false;
        }
        zzfz zzfzVar = (zzfz) obj;
        return zzfzVar.zza == this.zza && zzfzVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzfz.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + String.valueOf(this.zza) + "salt_size_bytes: " + this.zzb + ")";
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zza zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final boolean zza() {
        return this.zza != zza.zzb;
    }
}
