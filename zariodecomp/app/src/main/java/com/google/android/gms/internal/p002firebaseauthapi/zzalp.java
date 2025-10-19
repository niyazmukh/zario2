package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzalp.smali */
final class zzalp<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzalq> zza;

    public /* synthetic */ zzalp(Map.Entry entry, zzalr zzalrVar) {
        this(entry);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzamm) {
            return this.zza.getValue().zza((zzamm) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzalq zza() {
        return this.zza.getValue();
    }

    private zzalp(Map.Entry<K, zzalq> entry) {
        this.zza = entry;
    }
}
