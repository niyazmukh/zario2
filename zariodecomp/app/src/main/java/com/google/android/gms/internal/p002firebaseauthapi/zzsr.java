package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzsr.smali */
public final class zzsr extends zzss {
    private final int zza;

    private zzsr(int i) {
        this.zza = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzsr) && ((zzsr) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzsr.class, Integer.valueOf(this.zza));
    }

    public final String toString() {
        return a.i("AesCmac PRF Parameters (", this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final boolean zza() {
        return false;
    }

    public final int zzb() {
        return this.zza;
    }

    public static zzsr zza(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return new zzsr(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i << 3)));
    }
}
