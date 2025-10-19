package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzhr.smali */
public final class zzhr implements zzgx {
    public static final zzhr zza = new zzhr();

    private zzhr() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof int[])) {
            objZza = null;
        }
        int[] iArr = (int[]) objZza;
        if (iArr == null) {
            throw new zzce(4, 5, null);
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (objZza2 instanceof String)) {
            objZza2 = null;
        }
        String str = (String) objZza2;
        if (str == null) {
            throw new zzce(4, 5, null);
        }
        zzge zzgeVarZzc = zzgdVar.zzc();
        StringBuilder sb = new StringBuilder();
        try {
            for (int i5 : iArr) {
                sb.append(str.charAt(i5));
            }
            zzgeVarZzc.zze(i, sb.toString());
        } catch (Exception e5) {
            throw new zzce(4, 22, e5);
        }
    }
}
