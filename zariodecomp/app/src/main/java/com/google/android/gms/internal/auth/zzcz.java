package com.google.android.gms.internal.auth;

import android.net.Uri;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzcz.smali */
public final class zzcz {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;
    final zzdg zzi;

    private zzcz(String str, Uri uri, String str2, String str3, boolean z4, boolean z5, boolean z6, boolean z7, zzdg zzdgVar) {
        this.zza = null;
        this.zzb = uri;
        this.zzc = "";
        this.zzd = "";
        this.zze = z4;
        this.zzf = false;
        this.zzg = z6;
        this.zzh = false;
        this.zzi = null;
    }

    public final zzcz zza() {
        return new zzcz(null, this.zzb, this.zzc, this.zzd, this.zze, false, true, false, null);
    }

    public final zzcz zzb() {
        if (this.zzc.isEmpty()) {
            return new zzcz(null, this.zzb, this.zzc, this.zzd, true, false, this.zzg, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzdc zzc(String str, double d5) {
        return new zzcx(this, str, Double.valueOf(0.0d), true);
    }

    public final zzdc zzd(String str, long j5) {
        return new zzcv(this, str, Long.valueOf(j5), true);
    }

    public final zzdc zze(String str, boolean z4) {
        return new zzcw(this, str, Boolean.valueOf(z4), true);
    }

    public final zzdc zzf(String str, Object obj, zzhu zzhuVar) {
        return new zzcy(this, "getTokenRefactor__blocked_packages", obj, true, zzhuVar, null);
    }

    public zzcz(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
