package com.google.android.gms.internal.fido;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzaw.smali */
final class zzaw extends zzar {
    private final zzaz zza;

    public zzaw(zzaz zzazVar, int i) {
        super(zzazVar.size(), i);
        this.zza = zzazVar;
    }

    @Override // com.google.android.gms.internal.fido.zzar
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
