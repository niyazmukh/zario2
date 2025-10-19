package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzaj.smali */
final class zzaj extends j implements p {
    int zza;
    final /* synthetic */ zzan zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzan zzanVar, d dVar) {
        super(2, dVar);
        this.zzb = zzanVar;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzaj(this.zzb, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaj) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2678a;
        int i = this.zza;
        AbstractC0183a.m0(obj);
        if (i == 0) {
            this.zzb.zze = zzao.zza;
            zzan zzanVar = this.zzb;
            this.zza = 1;
            if (zzanVar.zze(this) == aVar) {
                return aVar;
            }
        }
        return k.f2288a;
    }
}
