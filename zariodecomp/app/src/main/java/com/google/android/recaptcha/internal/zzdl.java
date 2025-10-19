package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzdl.smali */
final class zzdl extends j implements p {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzsc zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzdt zzdtVar, zzsc zzscVar, long j5, d dVar) {
        super(2, dVar);
        this.zzb = zzdtVar;
        this.zzc = zzscVar;
        this.zzd = j5;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzdl(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdl) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2678a;
        int i = this.zza;
        AbstractC0183a.m0(obj);
        if (i == 0) {
            zzdt zzdtVar = this.zzb;
            zzsc zzscVar = this.zzc;
            long j5 = this.zzd;
            this.zza = 1;
            if (zzdtVar.zzv(zzscVar, j5, this) == aVar) {
                return aVar;
            }
        }
        return k.f2288a;
    }
}
