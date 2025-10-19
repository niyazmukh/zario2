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
import java.util.Arrays;
import kotlin.jvm.internal.s;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzfr.smali */
final class zzfr extends j implements p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ zzft zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfr(Exception exc, zzgd zzgdVar, zzft zzftVar, d dVar) {
        super(2, dVar);
        this.zza = exc;
        this.zzb = zzgdVar;
        this.zzc = zzftVar;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        zzfr zzfrVar = new zzfr(this.zza, this.zzb, this.zzc, dVar);
        zzfrVar.zzd = obj;
        return zzfrVar;
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfr) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        zztd zztdVarZza;
        a aVar = a.f2678a;
        AbstractC0183a.m0(obj);
        C c5 = (C) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzce) {
            zztdVarZza = ((zzce) exc).zza();
            zztdVarZza.zze(this.zzb.zza());
        } else {
            zzgd zzgdVar = this.zzb;
            zztd zztdVarZzf = zzte.zzf();
            zztdVarZzf.zze(zzgdVar.zza());
            zztdVarZzf.zzr(2);
            zztdVarZzf.zzq(2);
            zztdVarZza = zztdVarZzf;
        }
        zzte zzteVar = (zzte) zztdVarZza.zzk();
        zzteVar.zzl();
        zzteVar.zzk();
        s.a(this.zza.getClass()).b();
        this.zza.getMessage();
        zzgd zzgdVar2 = this.zzb;
        zzbn zzbnVarZzb = zzgdVar2.zzb();
        zzbn zzbnVar = zzgdVar2.zza;
        if (zzbnVar == null) {
            zzbnVar = null;
        }
        zzrl zzrlVarZza = zzev.zza(zzbnVarZzb, zzbnVar);
        String strZzd = this.zzb.zzd();
        if (strZzd.length() == 0) {
            strZzd = "recaptcha.m.Main.rge";
        }
        InterfaceC0506g0 interfaceC0506g0 = (InterfaceC0506g0) c5.e().get(B.f7000b);
        if (interfaceC0506g0 != null ? interfaceC0506g0.isActive() : true) {
            zzft zzftVar = this.zzc;
            zzkh zzkhVarZzh = zzkh.zzh();
            byte[] bArrZzd = zzteVar.zzd();
            String strZzi = zzkhVarZzh.zzi(bArrZzd, 0, bArrZzd.length);
            zzkh zzkhVarZzh2 = zzkh.zzh();
            byte[] bArrZzd2 = zzrlVarZza.zzd();
            zzftVar.zzb.zzd().zzb(strZzd, (String[]) Arrays.copyOf(new String[]{strZzi, zzkhVarZzh2.zzi(bArrZzd2, 0, bArrZzd2.length)}, 2));
        }
        return k.f2288a;
    }
}
