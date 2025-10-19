package com.google.android.recaptcha.internal;

import K3.g;
import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import com.google.android.recaptcha.RecaptchaAction;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzcz.smali */
final class zzcz extends j implements p {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcz(zzdc zzdcVar, long j5, RecaptchaAction recaptchaAction, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzdcVar;
        this.zzc = j5;
        this.zzd = recaptchaAction;
        this.zze = str;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzcz(this.zzb, this.zzc, this.zzd, this.zze, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcz) create((zzek) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        a aVar = a.f2678a;
        int i = this.zza;
        AbstractC0183a.m0(obj);
        if (i == 0) {
            zzdc.zze(this.zzb, this.zzc, this.zzd);
            zzdc zzdcVar = this.zzb;
            String str = this.zze;
            RecaptchaAction recaptchaAction = this.zzd;
            long j5 = this.zzc;
            zzcn zzcnVar = zzdcVar.zzb;
            this.zza = 1;
            obj = zzcnVar.zza(str, recaptchaAction, j5, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new g((String) obj);
    }
}
