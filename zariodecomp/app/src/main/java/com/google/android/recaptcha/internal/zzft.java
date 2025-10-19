package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import P3.a;
import f4.C;
import f4.E;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzft.smali */
public final class zzft implements zzfo {
    private final C zza;
    private final zzgf zzb;
    private final zzhx zzc;
    private final Map zzd;

    public zzft(C c5, zzgf zzgfVar, zzhx zzhxVar, Map map) {
        this.zza = c5;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) throws zzce {
        zzjh zzjhVarZzb = zzjh.zzb();
        int iZza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar == null) {
            throw new zzce(5, 2, null);
        }
        int iZzg = zzufVar.zzg();
        zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
        zzgxVar.zza(iZzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
        if (iZza == zzgdVar.zza()) {
            zzgdVar.zzg(zzgdVar.zza() + 1);
        }
        zzjhVarZzb.zzf();
        long jZza = zzjhVarZzb.zza(TimeUnit.MICROSECONDS);
        int i = zzbk.zza;
        int iZzk = zzufVar.zzk();
        if (iZzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbk.zza(iZzk - 2, jZza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, d dVar) throws Throwable {
        Object objG = E.g(new zzfq(zzgdVar, list, this, null), dVar);
        return objG == a.f2678a ? objG : k.f2288a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, d dVar) throws Throwable {
        Object objG = E.g(new zzfr(exc, zzgdVar, this, null), dVar);
        return objG == a.f2678a ? objG : k.f2288a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(String str) {
        E.t(this.zza, null, null, new zzfs(new zzgd(this.zzb), this, str, null), 3);
    }
}
