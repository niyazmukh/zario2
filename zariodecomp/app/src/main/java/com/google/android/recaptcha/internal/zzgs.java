package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzgs.smali */
public final class zzgs implements zzgx {
    public static final zzgs zza = new zzgs();

    private zzgs() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws IllegalArgumentException, zzce {
        int iIntValue;
        int length = zzueVarArr.length;
        if (length != 4 && length != 5) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            throw new zzce(4, 5, null);
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzce(4, 5, null);
        }
        Object objZza3 = zzgdVar.zzc().zza(zzueVarArr[2]);
        if (true != (objZza3 instanceof String)) {
            objZza3 = null;
        }
        String str2 = (String) objZza3;
        if (str2 == null) {
            throw new zzce(4, 5, null);
        }
        String strZza = zzgdVar.zzh().zza(str2);
        Object objZza4 = zzgdVar.zzc().zza(zzueVarArr[3]);
        if (length == 5) {
            Object objZza5 = zzgdVar.zzc().zza(zzueVarArr[4]);
            if (true != (objZza5 instanceof Integer)) {
                objZza5 = null;
            }
            Integer num = (Integer) objZza5;
            if (num == null) {
                throw new zzce(4, 5, null);
            }
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        try {
            if (objZza2 instanceof String) {
                objZza2 = zzgdVar.zzh().zza((String) objZza2);
            }
            Class clsZza = zzgc.zza(objZza2);
            zzgdVar.zzc().zze(i, Proxy.newProxyInstance(clsZza.getClassLoader(), new Class[]{clsZza}, new zzfy(new zzgr(zzgdVar, str, iIntValue), strZza, objZza4)));
        } catch (Exception e5) {
            throw new zzce(6, 20, e5);
        }
    }
}
