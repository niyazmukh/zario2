package com.google.android.gms.internal.fido;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzax.smali */
final class zzax extends zzaz {
    private final transient zzaz zza;

    public zzax(zzaz zzazVar) {
        this.zza = zzazVar;
    }

    private final int zzl(int i) {
        return (this.zza.size() - 1) - i;
    }

    @Override // com.google.android.gms.internal.fido.zzaz, com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzap.zza(i, this.zza.size(), "index");
        return this.zza.get(zzl(i));
    }

    @Override // com.google.android.gms.internal.fido.zzaz, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.zza.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return zzl(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.fido.zzaz, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.zza.indexOf(obj);
        if (iIndexOf >= 0) {
            return zzl(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.fido.zzaz
    public final zzaz zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzaz, java.util.List
    /* renamed from: zzg */
    public final zzaz subList(int i, int i5) {
        zzap.zze(i, i5, this.zza.size());
        zzaz zzazVar = this.zza;
        return zzazVar.subList(zzazVar.size() - i5, this.zza.size() - i).zzf();
    }
}
