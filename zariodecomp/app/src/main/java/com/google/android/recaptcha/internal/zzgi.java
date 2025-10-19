package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzgi.smali */
public final class zzgi implements zzgx {
    public static final zzgi zza = new zzgi();

    private zzgi() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, zzce {
        if (zzueVarArr.length != 3) {
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
        Object objZza3 = zzgdVar.zzc().zza(zzueVarArr[2]);
        if (true != Objects.nonNull(objZza3)) {
            objZza3 = null;
        }
        if (objZza3 == null) {
            throw new zzce(4, 5, null);
        }
        try {
            Array.set(objZza, iIntValue, objZza3);
        } catch (Exception e5) {
            if (!(e5 instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzce(4, 25, e5);
            }
            throw new zzce(4, 22, e5);
        }
    }
}
