package com.google.android.gms.internal.auth;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzfi.smali */
final class zzfi extends zzfk {
    public /* synthetic */ zzfi(zzfh zzfhVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zza(Object obj, long j5) {
        ((zzey) zzhi.zzf(obj, j5)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zzb(Object obj, Object obj2, long j5) {
        zzey zzeyVarZzd = (zzey) zzhi.zzf(obj, j5);
        zzey zzeyVar = (zzey) zzhi.zzf(obj2, j5);
        int size = zzeyVarZzd.size();
        int size2 = zzeyVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzeyVarZzd.zzc()) {
                zzeyVarZzd = zzeyVarZzd.zzd(size2 + size);
            }
            zzeyVarZzd.addAll(zzeyVar);
        }
        if (size > 0) {
            zzeyVar = zzeyVarZzd;
        }
        zzhi.zzp(obj, j5, zzeyVar);
    }

    private zzfi() {
        super(null);
    }
}
