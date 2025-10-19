package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzal.smali */
public abstract class zzal<K, V> implements Serializable, Map<K, V> {
    private transient zzaq<Map.Entry<K, V>> zza;
    private transient zzaq<K> zzb;
    private transient zzag<V> zzc;

    public static <K, V> zzal<K, V> zza(Map<? extends K, ? extends V> map) {
        if ((map instanceof zzal) && !(map instanceof SortedMap)) {
            zzal<K, V> zzalVar = (zzal) map;
            zzalVar.zzd();
            return zzalVar;
        }
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        zzao zzaoVar = new zzao(setEntrySet != null ? setEntrySet.size() : 4);
        zzaoVar.zza(setEntrySet);
        return zzaoVar.zza();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return ((zzag) values()).contains(obj);
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzaq<Map.Entry<K, V>> zzaqVar = this.zza;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        zzaq<Map.Entry<K, V>> zzaqVarZzb = zzb();
        this.zza = zzaqVarZzb;
        return zzaqVarZzb;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v4) {
        V v5 = get(obj);
        return v5 != null ? v5 : v4;
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzav.zza((zzaq) entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzaq<K> zzaqVar = this.zzb;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        zzaq<K> zzaqVarZzc = zzc();
        this.zzb = zzaqVarZzc;
        return zzaqVarZzc;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k5, V v4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        zzae.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb.append('{');
        boolean z4 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z4) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z4 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        zzag<V> zzagVar = this.zzc;
        if (zzagVar != null) {
            return zzagVar;
        }
        zzag<V> zzagVarZza = zza();
        this.zzc = zzagVarZza;
        return zzagVarZza;
    }

    public abstract zzag<V> zza();

    public abstract zzaq<Map.Entry<K, V>> zzb();

    public abstract zzaq<K> zzc();

    public abstract boolean zzd();
}
