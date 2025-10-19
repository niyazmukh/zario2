package com.google.android.recaptcha.internal;

import O3.d;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import f4.E;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzcq.smali */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j5, d dVar) {
        return zzcv.zzh(zza(application), str, j5, null, null, null, dVar, 28, null);
    }

    public static final Task zzc(Application application, String str, long j5) {
        return zzas.zza(E.e(zza(application).zzd().zza(), new zzco(application, str, j5, null)));
    }

    public static final Object zzd(Application application, String str, d dVar) {
        zzcv zzcvVarZza = zza(application);
        return zzcv.zzh(zzcvVarZza, str, 0L, null, zzcvVarZza.zzf, zzch.zzb, dVar, 2, null);
    }

    public static final Task zze(Application application, String str) {
        return zzas.zza(E.e(zza(application).zzd().zza(), new zzcp(application, str, null)));
    }
}
