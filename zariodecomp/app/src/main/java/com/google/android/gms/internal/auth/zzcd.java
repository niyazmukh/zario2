package com.google.android.gms.internal.auth;

import android.content.Context;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzcd.smali */
final class zzcd extends zzda {
    private final Context zza;
    private final zzdj zzb;

    public zzcd(Context context, zzdj zzdjVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = zzdjVar;
    }

    public final boolean equals(Object obj) {
        zzdj zzdjVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzda) {
            zzda zzdaVar = (zzda) obj;
            if (this.zza.equals(zzdaVar.zza()) && ((zzdjVar = this.zzb) != null ? zzdjVar.equals(zzdaVar.zzb()) : zzdaVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzdj zzdjVar = this.zzb;
        return (zzdjVar == null ? 0 : zzdjVar.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "FlagsContext{context=" + this.zza.toString() + ", hermeticFileOverrides=" + String.valueOf(this.zzb) + "}";
    }

    @Override // com.google.android.gms.internal.auth.zzda
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzda
    public final zzdj zzb() {
        return this.zzb;
    }
}
