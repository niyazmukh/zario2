package com.google.android.recaptcha.internal;

import O3.d;
import Q3.c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzcs.smali */
final class zzcs extends c {
    Object zza;
    Object zzb;
    Object zzc;
    long zzd;
    /* synthetic */ Object zze;
    final /* synthetic */ zzcv zzf;
    int zzg;
    String zzh;
    zzch zzi;
    zzbi zzj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcs(zzcv zzcvVar, d dVar) {
        super(dVar);
        this.zzf = zzcvVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= Integer.MIN_VALUE;
        return this.zzf.zzg(null, 0L, null, null, null, this);
    }
}
