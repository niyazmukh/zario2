package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzhe.smali */
public final class zzhe implements zzgx {
    public static final zzhe zza = new zzhe();

    private zzhe() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 1) {
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
            zzgdVar.zzc().zze(i, field.get(null));
        } catch (Exception e5) {
            throw new zzce(6, 16, e5);
        }
    }
}
