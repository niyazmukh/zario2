package com.google.android.recaptcha.internal;

import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzhb.smali */
public final class zzhb implements zzgx {
    public static final zzhb zza = new zzhb();

    private zzhb() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Class<?> clsZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(clsZza)) {
            clsZza = null;
        }
        if (clsZza == null) {
            throw new zzce(4, 5, null);
        }
        Class<?> cls = clsZza instanceof Class ? clsZza : clsZza.getClass();
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            throw new zzce(4, 5, null);
        }
        try {
            zzgdVar.zzc().zze(i, cls.getField(zzgdVar.zzh().zza(str)));
        } catch (Exception e5) {
            throw new zzce(6, 10, e5);
        }
    }
}
