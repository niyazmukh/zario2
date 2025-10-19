package com.google.android.recaptcha.internal;

import K3.g;
import O3.d;
import P3.a;
import Q3.c;
import java.util.MissingResourceException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzcw.smali */
final class zzcw extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(zzdc zzdcVar, d dVar) {
        super(dVar);
        this.zzb = zzdcVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo3execute0E7RQCE = this.zzb.mo3execute0E7RQCE(null, 0L, this);
        return objMo3execute0E7RQCE == a.f2678a ? objMo3execute0E7RQCE : new g(objMo3execute0E7RQCE);
    }
}
