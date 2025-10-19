package com.google.android.recaptcha.internal;

import K3.g;
import O3.d;
import P3.a;
import Q3.c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzc.smali */
final class zzc extends c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zze zzeVar, d dVar) {
        super(dVar);
        this.zzc = zzeVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object objZze = this.zzc.zze(0L, null, this);
        return objZze == a.f2678a ? objZze : new g(objZze);
    }
}
