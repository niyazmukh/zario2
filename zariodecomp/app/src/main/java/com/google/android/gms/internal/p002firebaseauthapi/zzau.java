package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzau.smali */
final class zzau extends zzah {
    private final /* synthetic */ zzar zza;

    public zzau(zzar zzarVar) {
        Objects.requireNonNull(zzarVar);
        this.zza = zzarVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        zzu.zza(i, this.zza.zzc);
        int i5 = i * 2;
        Object obj = this.zza.zzb[i5];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i5 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
