package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzgv.smali */
public final class zzgv implements zzgx {
    public static final zzgv zza = new zzgv();

    private zzgv() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        Object array;
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
            if (objZza instanceof Integer) {
                array = Integer.valueOf(((Number) objZza).intValue() / iIntValue);
            } else {
                if (!(objZza instanceof int[])) {
                    throw new zzce(4, 5, null);
                }
                int[] iArr = (int[]) objZza;
                ArrayList arrayList = new ArrayList(iArr.length);
                for (int i5 : iArr) {
                    arrayList.add(Integer.valueOf(i5 / iIntValue));
                }
                array = arrayList.toArray(new Integer[0]);
            }
            zzgdVar.zzc().zze(i, array);
        } catch (ArithmeticException e5) {
            throw new zzce(4, 6, e5);
        }
    }
}
