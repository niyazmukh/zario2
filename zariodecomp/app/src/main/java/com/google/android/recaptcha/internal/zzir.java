package com.google.android.recaptcha.internal;

import K3.g;
import O3.d;
import P3.a;
import Q3.c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzir.smali */
final class zzir extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzir(zzja zzjaVar, d dVar) {
        super(dVar);
        this.zzb = zzjaVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzh = this.zzb.zzh(null, this);
        return objZzh == a.f2678a ? objZzh : new g(objZzh);
    }
}
