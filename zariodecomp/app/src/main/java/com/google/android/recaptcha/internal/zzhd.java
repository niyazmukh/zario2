package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzhd.smali */
public final class zzhd implements zzgx {
    public static final zzhd zza = new zzhd();

    private zzhd() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Field)) {
            objZza = null;
        }
        Field field = (Field) objZza;
        if (field == null) {
            throw new zzce(4, 5, null);
        }
        try {
            zzgdVar.zzc().zze(i, field.get(zzgdVar.zzc().zza(zzueVarArr[1])));
        } catch (Exception e5) {
            throw new zzce(6, 16, e5);
        }
    }
}
