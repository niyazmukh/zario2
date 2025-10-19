package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzfb.smali */
final class zzfb extends j implements p {
    final /* synthetic */ zzff zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzto zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzff zzffVar, String str, zzto zztoVar, d dVar) {
        super(2, dVar);
        this.zza = zzffVar;
        this.zzb = str;
        this.zzc = zztoVar;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzfb(this.zza, this.zzb, this.zzc, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        a aVar = a.f2678a;
        AbstractC0183a.m0(obj);
        try {
            if (zzff.zzb(this.zza).zzb(this.zzb)) {
                return this.zza.zzg().zza(this.zzb, this.zzc);
            }
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        } catch (zzbd e5) {
            throw e5;
        } catch (Exception e6) {
            throw new zzbd(zzbb.zzb, zzba.zzaw, e6.getMessage());
        }
    }
}
