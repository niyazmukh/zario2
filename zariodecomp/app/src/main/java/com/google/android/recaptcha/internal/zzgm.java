package com.google.android.recaptcha.internal;

import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzgm.smali */
public final class zzgm implements zzgx {
    public static final zzgm zza = new zzgm();

    private zzgm() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        boolean z4 = true;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        try {
            try {
                if (objZza instanceof String) {
                    objZza = zzgdVar.zzh().zza((String) objZza);
                }
                zzge zzgeVarZzc = zzgdVar.zzc();
                try {
                    zzgc.zza(objZza);
                } catch (zzce e5) {
                    if (e5.zzb() == 8 || e5.zzb() == 6) {
                        z4 = false;
                    } else if (e5.zzb() != 47) {
                        throw e5;
                    }
                }
                zzgeVarZzc.zze(i, Boolean.valueOf(z4));
            } catch (Exception e6) {
                throw new zzce(6, 8, e6);
            }
        } catch (zzce e7) {
            throw e7;
        }
    }
}
