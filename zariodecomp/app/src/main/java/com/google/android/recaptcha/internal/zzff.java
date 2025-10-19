package com.google.android.recaptcha.internal;

import K3.c;
import O3.d;
import S0.f;
import e4.m;
import f4.E;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzff.smali */
public final class zzff {
    private final c zza;
    private final c zzb;
    private final c zzc;

    public zzff() {
        int i = zzav.zza;
        this.zza = f.P(zzfc.zza);
        this.zzb = f.P(zzfd.zza);
        this.zzc = f.P(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, d dVar) throws Exception {
        String strZza;
        try {
            String strZzl = zzscVar.zzl();
            String strZzM = zzscVar.zzM();
            zzaq zzaqVarZzf = zzffVar.zzf();
            String strZzb = null;
            if (zzaqVarZzf != null && zzaqVarZzf.zzd(strZzM)) {
                zzen zzenVarZzf = zzekVar.zzf(25);
                try {
                    strZza = zzffVar.zzf().zza(strZzM);
                } catch (Exception e5) {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzR, e5.getMessage()));
                }
                if (strZza != null) {
                    zzenVarZzf.zza();
                    strZzb = strZza;
                } else {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
                }
            }
            if (strZzb == null) {
                zzaq zzaqVarZzf2 = zzffVar.zzf();
                if (zzaqVarZzf2 != null) {
                    zzaqVarZzf2.zzb();
                }
                zzen zzenVarZzf2 = zzekVar.zzf(23);
                try {
                    strZzb = zzffVar.zzg().zzb(strZzl);
                    zzenVarZzf2.zza();
                    zzen zzenVarZzf3 = zzekVar.zzf(24);
                    try {
                        zzaq zzaqVarZzf3 = zzffVar.zzf();
                        if (zzaqVarZzf3 != null) {
                            zzaqVarZzf3.zzc(strZzM, strZzb);
                        }
                        zzenVarZzf3.zza();
                    } catch (Exception e6) {
                        zzenVarZzf3.zzb(new zzbd(zzbb.zzk, zzba.zzT, e6.getMessage()));
                    }
                } catch (zzbd e7) {
                    zzenVarZzf2.zzb(e7);
                    throw e7;
                }
            }
            return m.v0(zzscVar.zzk(), "JAVASCRIPT_TAG", strZzb);
        } catch (Exception e8) {
            if (e8 instanceof zzbd) {
                throw e8;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e8.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(String str, zzto zztoVar, d dVar) {
        return E.g(new zzfb(this, str, zztoVar, null), dVar);
    }

    public final Object zzd(zzsc zzscVar, zzek zzekVar, d dVar) {
        return zze(this, zzscVar, zzekVar, dVar);
    }
}
