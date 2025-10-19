package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzhl.smali */
public final class zzhl implements zzgx {
    public static final zzhl zza = new zzhl();

    private zzhl() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        zzgdVar.zzc().zze(i, zzgdVar.zzc().zza(zzueVarArr[0]));
    }
}
