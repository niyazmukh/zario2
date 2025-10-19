package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzat.smali */
final class zzat<K> extends zzaq<K> {
    private final transient zzal<K, ?> zza;
    private final transient zzah<K> zzb;

    public zzat(zzal<K, ?> zzalVar, zzah<K> zzahVar) {
        this.zza = zzalVar;
        this.zzb = zzahVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int zza(Object[] objArr, int i) {
        return zzc().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq, com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final zzah<K> zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq, com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public final zzay<K> iterator() {
        return (zzay) zzc().iterator();
    }
}
