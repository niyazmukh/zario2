package com.google.android.recaptcha.internal;

import L3.i;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzhj.smali */
public final class zzhj implements zzgx {
    public static final zzhj zza = new zzhj();

    private zzhj() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length == 0) {
            throw new zzce(4, 3, null);
        }
        Constructor<?> constructorZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(constructorZza)) {
            constructorZza = null;
        }
        if (constructorZza == null) {
            throw new zzce(4, 5, null);
        }
        Constructor<?> constructor = constructorZza instanceof Constructor ? constructorZza : constructorZza.getClass().getConstructor(null);
        Object[] objArrZzg = zzgdVar.zzc().zzg(i.z0(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i, constructor.newInstance(Arrays.copyOf(objArrZzg, objArrZzg.length)));
        } catch (Exception e5) {
            throw new zzce(6, 14, e5);
        }
    }
}
