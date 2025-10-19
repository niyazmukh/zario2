package com.google.android.recaptcha.internal;

import L3.i;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzha.smali */
public final class zzha implements zzgx {
    public static final zzha zza = new zzha();

    private zzha() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length == 0) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Class)) {
            objZza = null;
        }
        Class cls = (Class) objZza;
        if (cls == null) {
            throw new zzce(4, 5, null);
        }
        Class[] clsArrZzf = zzgdVar.zzc().zzf(i.z0(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i, cls.getConstructor((Class[]) Arrays.copyOf(clsArrZzf, clsArrZzf.length)));
        } catch (Exception e5) {
            throw new zzce(6, 9, e5);
        }
    }
}
