package com.google.android.recaptcha.internal;

import O3.d;
import Q3.c;
import com.google.android.recaptcha.RecaptchaAction;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzdu.smali */
final class zzdu extends c {
    double zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzec zzc;
    int zzd;
    zzec zze;
    String zzf;
    RecaptchaAction zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzec zzecVar, d dVar) {
        super(dVar);
        this.zzc = zzecVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zza(null, null, 0L, this);
    }
}
