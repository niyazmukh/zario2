package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzct.smali */
final class zzct extends j implements p {
    Object zza;
    int zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzcv zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzcn zzg;
    final /* synthetic */ zzch zzh;
    final /* synthetic */ zzbi zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzct(zzcv zzcvVar, String str, long j5, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, d dVar) {
        super(2, dVar);
        this.zzd = zzcvVar;
        this.zze = str;
        this.zzf = j5;
        this.zzg = zzcnVar;
        this.zzi = zzbiVar;
        this.zzh = zzchVar;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        zzct zzctVar = new zzct(this.zzd, this.zze, this.zzf, this.zzg, this.zzi, this.zzh, dVar);
        zzctVar.zzc = obj;
        return zzctVar;
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzct) create((zzek) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzek zzekVar;
        zzcn zzcnVar;
        a aVar = a.f2678a;
        if (this.zzb != 0) {
            zzcnVar = (zzcn) this.zza;
            zzekVar = (zzek) this.zzc;
            AbstractC0183a.m0(obj);
        } else {
            AbstractC0183a.m0(obj);
            zzekVar = (zzek) this.zzc;
            zzdc zzdcVarZza = zzcv.zza(this.zzd, this.zze);
            if (zzdcVarZza != null) {
                return zzdcVarZza;
            }
            zzcv.zzc(this.zzd, this.zzf);
            zzcn zzcnVarZze = this.zzg;
            if (zzcnVarZze == null) {
                zzcnVarZze = zzcv.zze(this.zzd, this.zze, this.zzi, this.zzh, zzekVar);
            }
            long j5 = this.zzf;
            this.zzc = zzekVar;
            this.zza = zzcnVarZze;
            this.zzb = 1;
            if (zzcnVarZze.zzb(j5, this) == aVar) {
                return aVar;
            }
            zzcnVar = zzcnVarZze;
        }
        zzdc zzdcVar = new zzdc(zzcnVar, this.zze, this.zzi, zzekVar);
        this.zzd.zzc = zzdcVar;
        return zzdcVar;
    }
}
