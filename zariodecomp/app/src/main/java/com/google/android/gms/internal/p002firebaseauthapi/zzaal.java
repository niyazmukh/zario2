package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaal.smali */
public final class zzaal {
    private final zzaaj zza;

    private zzaal(zzaaj zzaajVar) {
        this.zza = zzaajVar;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public static zzaal zza(byte[] bArr, zzch zzchVar) {
        if (zzchVar != null) {
            return new zzaal(zzaaj.zza(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static zzaal zza(int i) {
        return new zzaal(zzaaj.zza(zzqd.zza(i)));
    }

    public final byte[] zza(zzch zzchVar) {
        if (zzchVar != null) {
            return this.zza.zzb();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
