package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zznz.smali */
final class zznz implements zzog {
    private final zzog[] zza;

    public zznz(zzog... zzogVarArr) {
        this.zza = zzogVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zzog
    public final zzof zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzog zzogVar = this.zza[i];
            if (zzogVar.zzc(cls)) {
                return zzogVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.recaptcha.internal.zzog
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
