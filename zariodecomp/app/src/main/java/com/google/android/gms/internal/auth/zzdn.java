package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzdn.smali */
public final class zzdn {
    public static zzdj zza(zzdj zzdjVar) {
        return ((zzdjVar instanceof zzdl) || (zzdjVar instanceof zzdk)) ? zzdjVar : zzdjVar instanceof Serializable ? new zzdk(zzdjVar) : new zzdl(zzdjVar);
    }

    public static zzdj zzb(Object obj) {
        return new zzdm(obj);
    }
}
