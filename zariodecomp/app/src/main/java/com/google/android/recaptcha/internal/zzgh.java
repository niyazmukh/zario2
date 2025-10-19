package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzgh.smali */
public final class zzgh implements zzgx {
    public static final zzgh zza = new zzgh();

    private zzgh() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num = (Integer) objZza2;
        if (num == null) {
            throw new zzce(4, 5, null);
        }
        int iIntValue = num.intValue();
        try {
            zzgdVar.zzc().zze(i, objZza instanceof String ? String.valueOf(((String) objZza).charAt(iIntValue)) : objZza instanceof List ? ((List) objZza).get(iIntValue) : Array.get(objZza, iIntValue));
        } catch (Exception e5) {
            if (!(e5 instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzce(4, 23, e5);
            }
            throw new zzce(4, 22, e5);
        }
    }
}
