package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzam.smali */
final class zzam extends zzah {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzah zzc;

    public zzam(zzah zzahVar, int i, int i5) {
        Objects.requireNonNull(zzahVar);
        this.zzc = zzahVar;
        this.zza = i;
        this.zzb = i5;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzu.zza(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzah, java.util.List
    /* renamed from: zza */
    public final zzah subList(int i, int i5) {
        zzu.zza(i, i5, this.zzb);
        zzah zzahVar = this.zzc;
        int i6 = this.zza;
        return (zzah) zzahVar.subList(i + i6, i5 + i6);
    }
}
