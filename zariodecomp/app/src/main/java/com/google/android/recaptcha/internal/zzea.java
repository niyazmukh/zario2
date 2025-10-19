package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.l;
import a.AbstractC0183a;
import f4.C0521u;
import f4.InterfaceC0520t;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzea.smali */
final class zzea extends j implements l {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ InterfaceC0520t zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j5, InterfaceC0520t interfaceC0520t, d dVar) {
        super(1, dVar);
        this.zzc = zzecVar;
        this.zzd = j5;
        this.zze = interfaceC0520t;
    }

    @Override // Q3.a
    public final d create(d dVar) {
        return new zzea(this.zzc, this.zzd, this.zze, dVar);
    }

    @Override // X3.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((d) obj)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzen zzenVar;
        zzbd e5;
        zzen zzenVar2;
        a aVar = a.f2678a;
        int i = this.zzb;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            zzen zzenVarZzf = this.zzc.zzb.zzf(41);
            try {
                zzdt zzdtVar = this.zzc.zza;
                long j5 = this.zzd;
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objZzo = zzdtVar.zzo(j5, this);
                if (objZzo != aVar) {
                    zzenVar2 = zzenVarZzf;
                    obj = objZzo;
                }
                return aVar;
            } catch (zzbd e6) {
                zzenVar = zzenVarZzf;
                e5 = e6;
                this.zzc.zzd = e5;
                zzenVar.zzb(e5);
                throw e5;
            }
        }
        if (i != 1) {
            zzenVar = (zzen) this.zza;
            try {
                AbstractC0183a.m0(obj);
                zzenVar.zza();
                this.zzc.zzf = zzcm.zzb;
                return Boolean.valueOf(((C0521u) this.zze).D(k.f2288a));
            } catch (zzbd e7) {
                e5 = e7;
                this.zzc.zzd = e5;
                zzenVar.zzb(e5);
                throw e5;
            }
        }
        zzenVar2 = (zzen) this.zza;
        try {
            AbstractC0183a.m0(obj);
        } catch (zzbd e8) {
            e5 = e8;
            zzenVar = zzenVar2;
            this.zzc.zzd = e5;
            zzenVar.zzb(e5);
            throw e5;
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdt zzdtVar2 = this.zzc.zza;
        long j6 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j6, this) != aVar) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            this.zzc.zzf = zzcm.zzb;
            return Boolean.valueOf(((C0521u) this.zze).D(k.f2288a));
        }
        return aVar;
    }
}
