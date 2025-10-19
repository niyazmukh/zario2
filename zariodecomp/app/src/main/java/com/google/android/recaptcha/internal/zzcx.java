package com.google.android.recaptcha.internal;

import K3.g;
import O3.d;
import P3.a;
import Q3.c;
import java.util.MissingResourceException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzcx.smali */
final class zzcx extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzdc zzdcVar, d dVar) {
        super(dVar);
        this.zzb = zzdcVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo4executegIAlus = this.zzb.mo4executegIAlus(null, this);
        return objMo4executegIAlus == a.f2678a ? objMo4executegIAlus : new g(objMo4executegIAlus);
    }
}
