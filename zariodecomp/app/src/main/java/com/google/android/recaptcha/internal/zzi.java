package com.google.android.recaptcha.internal;

import K3.g;
import O3.d;
import P3.a;
import Q3.c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzi.smali */
final class zzi extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzl zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(zzl zzlVar, d dVar) {
        super(dVar);
        this.zzb = zzlVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzc = this.zzb.zzc(0L, null, null, this);
        return objZzc == a.f2678a ? objZzc : new g(objZzc);
    }
}
