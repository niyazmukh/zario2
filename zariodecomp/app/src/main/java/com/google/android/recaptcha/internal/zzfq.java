package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import f4.B;
import f4.C;
import f4.InterfaceC0506g0;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzfq.smali */
final class zzfq extends j implements p {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, d dVar) {
        super(2, dVar);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, dVar);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2678a;
        int i = this.zza;
        k kVar = k.f2288a;
        AbstractC0183a.m0(obj);
        if (i == 0) {
            C c5 = (C) this.zze;
            while (true) {
                zzgd zzgdVar = this.zzb;
                if (zzgdVar.zza() < 0) {
                    break;
                }
                if (zzgdVar.zza() < this.zzc.size()) {
                    InterfaceC0506g0 interfaceC0506g0 = (InterfaceC0506g0) c5.e().get(B.f7000b);
                    if (!(interfaceC0506g0 != null ? interfaceC0506g0.isActive() : true)) {
                        break;
                    }
                    zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
                    try {
                        zzft.zzf(this.zzd, zzufVar, this.zzb);
                    } catch (Exception e5) {
                        zzufVar.zzk();
                        new Integer(zzufVar.zzg());
                        L3.j.h0(zzufVar.zzj(), null, null, null, new zzfp(this.zzd), 31);
                        zzft zzftVar = this.zzd;
                        zzgd zzgdVar2 = this.zzb;
                        this.zza = 1;
                        if (zzftVar.zzh(e5, zzgdVar2, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        return kVar;
    }
}
