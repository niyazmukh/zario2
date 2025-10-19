package com.google.android.gms.internal.auth;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzdl.smali */
final class zzdl implements zzdj {
    volatile zzdj zza;
    volatile boolean zzb;
    Object zzc;

    public zzdl(zzdj zzdjVar) {
        zzdjVar.getClass();
        this.zza = zzdjVar;
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (str == null) {
            str = "<supplier that returned " + this.zzc + ">";
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }

    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        zzdj zzdjVar = this.zza;
                        zzdjVar.getClass();
                        Object objZza = zzdjVar.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        this.zza = null;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
