package com.google.android.gms.internal.fido;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzay.smali */
final class zzay extends zzaz {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzaz zzc;

    public zzay(zzaz zzazVar, int i, int i5) {
        this.zzc = zzazVar;
        this.zza = i;
        this.zzb = i5;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzap.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.fido.zzaz, java.util.List
    /* renamed from: zzg */
    public final zzaz subList(int i, int i5) {
        zzap.zze(i, i5, this.zzb);
        zzaz zzazVar = this.zzc;
        int i6 = this.zza;
        return zzazVar.subList(i + i6, i5 + i6);
    }
}
