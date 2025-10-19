package com.google.android.recaptcha.internal;

import O3.d;
import Q3.c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzee.smali */
final class zzee extends c {
    double zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzef zzc;
    int zzd;
    zzef zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzef zzefVar, d dVar) {
        super(dVar);
        this.zzc = zzefVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzb(0L, this);
    }
}
