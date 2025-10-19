package com.google.android.recaptcha.internal;

import K3.g;
import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzd.smali */
final class zzd extends j implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ zzsc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zze zzeVar, zzsc zzscVar, d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = zzscVar;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzd(this.zzb, this.zzc, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        Object objZzh;
        a aVar = a.f2678a;
        int i = this.zza;
        AbstractC0183a.m0(obj);
        if (i != 0) {
            objZzh = ((g) obj).f2280a;
        } else {
            zze zzeVar = this.zzb;
            zzsc zzscVar = this.zzc;
            this.zza = 1;
            objZzh = zzeVar.zzh(zzscVar, this);
            if (objZzh == aVar) {
                return aVar;
            }
        }
        return new g(objZzh);
    }
}
