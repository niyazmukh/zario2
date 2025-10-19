package com.google.android.recaptcha.internal;

import K3.g;
import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzj.smali */
final class zzj extends j implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzsc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zze zzeVar, long j5, zzsc zzscVar, d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = j5;
        this.zzd = zzscVar;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzj(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZze;
        a aVar = a.f2678a;
        int i = this.zza;
        AbstractC0183a.m0(obj);
        if (i != 0) {
            objZze = ((g) obj).f2280a;
        } else {
            zze zzeVar = this.zzb;
            long j5 = this.zzc;
            zzsc zzscVar = this.zzd;
            this.zza = 1;
            objZze = zzeVar.zze(j5, zzscVar, this);
            if (objZze == aVar) {
                return aVar;
            }
        }
        return new g(objZze);
    }
}
