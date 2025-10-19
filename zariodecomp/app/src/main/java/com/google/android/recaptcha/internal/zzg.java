package com.google.android.recaptcha.internal;

import K3.g;
import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzg.smali */
final class zzg extends j implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(zze zzeVar, String str, long j5, d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = str;
        this.zzd = j5;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzg(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzg) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZzc;
        a aVar = a.f2678a;
        int i = this.zza;
        AbstractC0183a.m0(obj);
        if (i != 0) {
            objZzc = ((g) obj).f2280a;
        } else {
            zze zzeVar = this.zzb;
            String str = this.zzc;
            long j5 = this.zzd;
            this.zza = 1;
            objZzc = zzeVar.zzc(str, j5, this);
            if (objZzc == aVar) {
                return aVar;
            }
        }
        return new g(objZzc);
    }
}
