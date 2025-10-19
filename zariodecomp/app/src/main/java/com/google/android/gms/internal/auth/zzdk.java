package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzdk.smali */
final class zzdk implements Serializable, zzdj {
    final zzdj zza;
    volatile transient boolean zzb;
    transient Object zzc;

    public zzdk(zzdj zzdjVar) {
        zzdjVar.getClass();
        this.zza = zzdjVar;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.zzb) {
            str = "<supplier that returned " + this.zzc + ">";
        } else {
            str = this.zza;
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
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
