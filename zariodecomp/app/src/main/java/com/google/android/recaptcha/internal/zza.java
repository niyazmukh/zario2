package com.google.android.recaptcha.internal;

import K3.g;
import O3.d;
import P3.a;
import Q3.c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zza.smali */
final class zza extends c {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zze zzd;
    int zze;
    String zzf;
    zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(zze zzeVar, d dVar) {
        super(dVar);
        this.zzd = zzeVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        Object objZzc = this.zzd.zzc(null, 0L, this);
        return objZzc == a.f2678a ? objZzc : new g(objZzc);
    }
}
