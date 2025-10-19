package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import f4.C;
import f4.C0521u;
import f4.InterfaceC0520t;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzdx.smali */
final class zzdx extends j implements p {
    int zza;
    final /* synthetic */ zzec zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzec zzecVar, d dVar) {
        super(2, dVar);
        this.zzb = zzecVar;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzdx(this.zzb, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2678a;
        int i = this.zza;
        AbstractC0183a.m0(obj);
        if (i == 0) {
            InterfaceC0520t interfaceC0520t = this.zzb.zzc;
            this.zza = 1;
            if (((C0521u) interfaceC0520t).k(this) == aVar) {
                return aVar;
            }
        }
        return k.f2288a;
    }
}
