package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzamg.smali */
public final class zzamg<K, V> extends LinkedHashMap<K, V> {
    private static final zzamg<?, ?> zza;
    private boolean zzb;

    static {
        zzamg<?, ?> zzamgVar = new zzamg<>();
        zza = zzamgVar;
        ((zzamg) zzamgVar).zzb = false;
    }

    private zzamg() {
        this.zzb = true;
    }

    private static int zza(Object obj) {
        if (obj instanceof byte[]) {
            return zzalh.zza((byte[]) obj);
        }
        if (obj instanceof zzalk) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void zze() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zze();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r6 = (java.util.Map) r6
            r0 = 1
            if (r5 == r6) goto L59
            int r2 = r5.size()
            int r3 = r6.size()
            if (r2 == r3) goto L16
        L14:
            r5 = r1
            goto L5a
        L16:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L1e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r6.containsKey(r3)
            if (r3 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r3 = r2.getValue()
            java.lang.Object r2 = r2.getKey()
            java.lang.Object r2 = r6.get(r2)
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L52
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L52
            byte[] r3 = (byte[]) r3
            byte[] r2 = (byte[]) r2
            boolean r2 = java.util.Arrays.equals(r3, r2)
            goto L56
        L52:
            boolean r2 = r3.equals(r2)
        L56:
            if (r2 != 0) goto L1e
            goto L14
        L59:
            r5 = r0
        L5a:
            if (r5 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamg.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iZza = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iZza += zza(entry.getValue()) ^ zza(entry.getKey());
        }
        return iZza;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k5, V v4) {
        zze();
        zzalh.zza(k5);
        zzalh.zza(v4);
        return (V) super.put(k5, v4);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        zze();
        for (K k5 : map.keySet()) {
            zzalh.zza(k5);
            zzalh.zza(map.get(k5));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zze();
        return (V) super.remove(obj);
    }

    public final zzamg<K, V> zzb() {
        return isEmpty() ? new zzamg<>() : new zzamg<>(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    private zzamg(Map<K, V> map) {
        super(map);
        this.zzb = true;
    }

    public static <K, V> zzamg<K, V> zza() {
        return (zzamg<K, V>) zza;
    }

    public final void zza(zzamg<K, V> zzamgVar) {
        zze();
        if (zzamgVar.isEmpty()) {
            return;
        }
        putAll(zzamgVar);
    }
}
