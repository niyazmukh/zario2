package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import f4.C;
import f4.E;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzds.smali */
final class zzds extends j implements p {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzen zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzdt zzdtVar, zzen zzenVar, d dVar) {
        super(2, dVar);
        this.zzb = zzdtVar;
        this.zzc = zzenVar;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzds(this.zzb, this.zzc, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzds) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f2678a;
        int i = this.zza;
        AbstractC0183a.m0(obj);
        if (i == 0) {
            zzdt zzdtVar = this.zzb;
            this.zza = 1;
            obj = E.B(zzdtVar.zzi.zza().e(), new zzdh(zzdtVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zza();
        return zzscVar;
    }
}
