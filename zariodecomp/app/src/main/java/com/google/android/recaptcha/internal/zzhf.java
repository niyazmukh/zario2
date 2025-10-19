package com.google.android.recaptcha.internal;

import L3.i;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzhf.smali */
public final class zzhf implements zzgx {
    public static final zzhf zza = new zzhf();

    private zzhf() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length < 2) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Method)) {
            objZza = null;
        }
        Method method = (Method) objZza;
        if (method == null) {
            throw new zzce(4, 5, null);
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        Object[] objArrZzg = zzgdVar.zzc().zzg(i.z0(zzueVarArr).subList(2, length));
        try {
            zzgdVar.zzc().zze(i, method.invoke(objZza2, Arrays.copyOf(objArrZzg, objArrZzg.length)));
        } catch (Exception e5) {
            throw new zzce(6, 15, e5);
        }
    }
}
