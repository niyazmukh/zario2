package com.google.android.gms.internal.common;

import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\common\zzag.smali */
final class zzag extends zzah {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzah zzc;

    public zzag(zzah zzahVar, int i, int i5) {
        Objects.requireNonNull(zzahVar);
        this.zzc = zzahVar;
        this.zza = i;
        this.zzb = i5;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzr.zzb(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* renamed from: zzi */
    public final zzah subList(int i, int i5) {
        zzr.zzd(i, i5, this.zzb);
        int i6 = this.zza;
        return this.zzc.subList(i + i6, i5 + i6);
    }
}
