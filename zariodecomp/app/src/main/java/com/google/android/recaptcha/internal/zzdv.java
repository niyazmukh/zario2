package com.google.android.recaptcha.internal;

import O3.d;
import Q3.c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzdv.smali */
final class zzdv extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzec zzb;
    int zzc;
    zzbn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzec zzecVar, d dVar) {
        super(dVar);
        this.zzb = zzecVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzl(null, this);
    }
}
