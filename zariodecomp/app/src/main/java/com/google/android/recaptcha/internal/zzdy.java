package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.l;
import a.AbstractC0183a;
import f4.E;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzdy.smali */
final class zzdy extends j implements l {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(long j5, zzec zzecVar, d dVar) {
        super(1, dVar);
        this.zzb = j5;
        this.zzc = zzecVar;
    }

    @Override // Q3.a
    public final d create(d dVar) {
        return new zzdy(this.zzb, this.zzc, dVar);
    }

    @Override // X3.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((d) obj)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2678a;
        int i = this.zza;
        AbstractC0183a.m0(obj);
        if (i == 0) {
            long j5 = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (E.C(j5, zzdxVar, this) == aVar) {
                return aVar;
            }
        }
        return k.f2288a;
    }
}
