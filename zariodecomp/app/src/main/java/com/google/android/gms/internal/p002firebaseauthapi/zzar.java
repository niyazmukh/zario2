package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzar.smali */
final class zzar<K, V> extends zzaq<Map.Entry<K, V>> {
    private final transient zzal<K, V> zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzar(zzal<K, V> zzalVar, Object[] objArr, int i, int i5) {
        this.zza = zzalVar;
        this.zzb = objArr;
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq, com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public final zzay<Map.Entry<K, V>> iterator() {
        return (zzay) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq
    public final zzah<Map.Entry<K, V>> zzf() {
        return new zzau(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int zza(Object[] objArr, int i) {
        return zzc().zza(objArr, i);
    }
}
