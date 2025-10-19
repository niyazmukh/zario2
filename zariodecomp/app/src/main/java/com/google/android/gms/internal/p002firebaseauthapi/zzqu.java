package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzqu.smali */
public final class zzqu extends zzrn {
    private final int zza;
    private final int zzb;
    private final zza zzc;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzqu$zza.smali */
    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("LEGACY");
        public static final zza zzd = new zza("NO_PREFIX");
        private final String zze;

        private zza(String str) {
            this.zze = str;
        }

        public final String toString() {
            return this.zze;
        }
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzqu$zzb.smali */
    public static final class zzb {
        private Integer zza;
        private Integer zzb;
        private zza zzc;

        public final zzb zza(int i) throws InvalidAlgorithmParameterException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i << 3)));
            }
            this.zza = Integer.valueOf(i);
            return this;
        }

        public final zzb zzb(int i) throws GeneralSecurityException {
            if (i < 10 || 16 < i) {
                throw new GeneralSecurityException(a.g(i, "Invalid tag size for AesCmacParameters: "));
            }
            this.zzb = Integer.valueOf(i);
            return this;
        }

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = zza.zzd;
        }

        public final zzb zza(zza zzaVar) {
            this.zzc = zzaVar;
            return this;
        }

        public final zzqu zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        return new zzqu(num.intValue(), this.zzb.intValue(), this.zzc);
                    }
                    throw new GeneralSecurityException("variant not set");
                }
                throw new GeneralSecurityException("tag size not set");
            }
            throw new GeneralSecurityException("key size not set");
        }
    }

    public static zzb zzd() {
        return new zzb();
    }

    private final int zzf() {
        zza zzaVar = this.zzc;
        if (zzaVar == zza.zzd) {
            return this.zzb;
        }
        if (zzaVar != zza.zza && zzaVar != zza.zzb && zzaVar != zza.zzc) {
            throw new IllegalStateException("Unknown variant");
        }
        int i = this.zzb;
        return i + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqu)) {
            return false;
        }
        zzqu zzquVar = (zzqu) obj;
        return zzquVar.zza == this.zza && zzquVar.zzf() == zzf() && zzquVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzqu.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.zzc) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final boolean zza() {
        return this.zzc != zza.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zza zze() {
        return this.zzc;
    }

    private zzqu(int i, int i5, zza zzaVar) {
        this.zza = i;
        this.zzb = i5;
        this.zzc = zzaVar;
    }
}
