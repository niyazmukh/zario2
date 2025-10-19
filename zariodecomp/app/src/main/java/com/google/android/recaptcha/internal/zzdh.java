package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import android.os.Build;
import f4.C;
import h1.e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzdh.smali */
final class zzdh extends j implements p {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdt zzdtVar, d dVar) {
        super(2, dVar);
        this.zzb = zzdtVar;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzdh(this.zzb, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2678a;
        int i = this.zza;
        AbstractC0183a.m0(obj);
        if (i == 0) {
            int iZza = new zzbs(e.f7633b).zza(this.zzb.zzr());
            zzdt zzdtVar = this.zzb;
            String str = zzdtVar.zza;
            String packageName = zzdtVar.zzr().getPackageName();
            String strZzd = this.zzb.zzb.zzd();
            zzbf zzbfVarZzt = this.zzb.zzt();
            int i5 = Build.VERSION.SDK_INT;
            String strZza = zzbfVarZzt.zza();
            zztn zztnVarZzf = zzto.zzf();
            zztnVarZzf.zzt(str);
            zztnVarZzf.zzq(packageName);
            zztnVarZzf.zzu(iZza);
            zztnVarZzf.zzr("18.6.1");
            zztnVarZzf.zzs(strZzd);
            zztnVarZzf.zzf(String.valueOf(i5));
            zztnVarZzf.zze(strZza);
            zzto zztoVar = (zzto) zztnVarZzf.zzk();
            zzdt zzdtVar2 = this.zzb;
            zzff zzffVarZzg = zzdt.zzg(zzdtVar2);
            String strZzb = zzdt.zzd(zzdtVar2).zzb();
            this.zza = 1;
            obj = zzffVarZzg.zzc(strZzb, zztoVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
