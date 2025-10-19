package com.google.android.recaptcha;

import K3.g;
import O3.d;
import P3.a;
import Q3.c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\Recaptcha$getClient$1.smali */
public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM2getClientBWLJW6A = this.zzb.m2getClientBWLJW6A(null, null, 0L, this);
        return objM2getClientBWLJW6A == a.f2678a ? objM2getClientBWLJW6A : new g(objM2getClientBWLJW6A);
    }
}
