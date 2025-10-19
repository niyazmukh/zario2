package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzdq.smali */
public final class zzdq extends zzcy {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zzb zzd;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzdq$zzb.smali */
    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("NO_PREFIX");
        private final String zzd;

        private zzb(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public static zza zze() {
        return new zza((zzdr) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdq)) {
            return false;
        }
        zzdq zzdqVar = (zzdq) obj;
        return zzdqVar.zza == this.zza && zzdqVar.zzb == this.zzb && zzdqVar.zzc == this.zzc && zzdqVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzdq.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte IV, " + this.zzc + "-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final boolean zza() {
        return this.zzd != zzb.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final zzb zzf() {
        return this.zzd;
    }

    private zzdq(int i, int i5, int i6, zzb zzbVar) {
        this.zza = i;
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = zzbVar;
    }
}
