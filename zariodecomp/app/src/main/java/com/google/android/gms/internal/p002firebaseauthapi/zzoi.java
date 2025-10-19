package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzoi.smali */
public final class zzoi extends zzcb {
    private final zzqe zza;

    public zzoi(zzqe zzqeVar) {
        this.zza = zzqeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzoi)) {
            return false;
        }
        zzqe zzqeVar = ((zzoi) obj).zza;
        return this.zza.zza().zzd().equals(zzqeVar.zza().zzd()) && this.zza.zza().zzf().equals(zzqeVar.zza().zzf()) && this.zza.zza().zze().equals(zzqeVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzc());
    }

    public final String toString() {
        String strZzf = this.zza.zza().zzf();
        int i = zzoh.zza[this.zza.zza().zzd().ordinal()];
        return "(typeUrl=" + strZzf + ", outputPrefixType=" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK") + ")";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final boolean zza() {
        return this.zza.zza().zzd() != zzxz.RAW;
    }

    public final zzqe zzb() {
        return this.zza;
    }
}
