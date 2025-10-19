package com.google.android.recaptcha.internal;

import K3.g;
import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import com.google.android.recaptcha.RecaptchaAction;
import f4.C;
import java.util.MissingResourceException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzda.smali */
final class zzda extends j implements p {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzda(zzdc zzdcVar, RecaptchaAction recaptchaAction, long j5, d dVar) {
        super(2, dVar);
        this.zzb = zzdcVar;
        this.zzc = recaptchaAction;
        this.zzd = j5;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzda(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzda) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        Object objZzf;
        a aVar = a.f2678a;
        int i = this.zza;
        AbstractC0183a.m0(obj);
        if (i != 0) {
            objZzf = ((g) obj).f2280a;
        } else {
            zzdc zzdcVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j5 = this.zzd;
            this.zza = 1;
            objZzf = zzdcVar.zzf(recaptchaAction, j5, this);
            if (objZzf == aVar) {
                return aVar;
            }
        }
        AbstractC0183a.m0(objZzf);
        return objZzf;
    }
}
