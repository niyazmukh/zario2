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

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzeb.smali */
final class zzeb extends j implements p {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ InterfaceC0520t zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, InterfaceC0520t interfaceC0520t, long j5, d dVar) {
        super(2, dVar);
        this.zzb = zzecVar;
        this.zzc = interfaceC0520t;
        this.zzd = j5;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzeb(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Exception {
        a aVar = a.f2678a;
        try {
            if (this.zza != 0) {
                AbstractC0183a.m0(obj);
            } else {
                AbstractC0183a.m0(obj);
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ((Boolean) obj).getClass();
        } catch (zzbd e5) {
            this.zzb.zzf = zzcm.zzd;
            ((C0521u) this.zzc).R(e5);
        }
        return k.f2288a;
    }
}
