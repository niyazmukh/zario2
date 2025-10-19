package com.google.android.gms.internal.fido;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzbg.smali */
public final class zzbg extends zzbh implements NavigableMap {
    public static final /* synthetic */ int zzb = 0;
    private static final Comparator zzc;
    private static final zzbg zzd;
    private final transient zzbu zze;
    private final transient zzaz zzf;
    private final transient zzbg zzg;

    static {
        zzbp zzbpVar = zzbp.zza;
        zzc = zzbpVar;
        zzbu zzbuVarZzq = zzbi.zzq(zzbpVar);
        int i = zzaz.zzd;
        zzd = new zzbg(zzbuVarZzq, zzbs.zza, null);
    }

    public zzbg(zzbu zzbuVar, zzaz zzazVar, zzbg zzbgVar) {
        this.zze = zzbuVar;
        this.zzf = zzazVar;
        this.zzg = zzbgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzbg zzf(Map map) {
        final Comparator comparator = zzc;
        Comparator comparator2 = map.comparator();
        int i = 1;
        boolean zEquals = comparator2 == null ? true : comparator.equals(comparator2);
        Set setEntrySet = map.entrySet();
        Map.Entry[] entryArr = zzba.zza;
        if (setEntrySet == null) {
            Iterator it = setEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            setEntrySet = arrayList;
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) setEntrySet.toArray(entryArr);
        int length = entryArr2.length;
        if (length == 0) {
            return zzg(comparator);
        }
        if (length == 1) {
            Map.Entry entry = entryArr2[0];
            entry.getClass();
            return new zzbg(new zzbu(zzaz.zzj(entry.getKey()), comparator), zzaz.zzj(entry.getValue()), null);
        }
        Object[] objArr = new Object[length];
        Object[] objArr2 = new Object[length];
        if (zEquals) {
            for (int i5 = 0; i5 < length; i5++) {
                Map.Entry entry2 = entryArr2[i5];
                entry2.getClass();
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                zzas.zza(key, value);
                objArr[i5] = key;
                objArr2[i5] = value;
            }
        } else {
            Arrays.sort(entryArr2, 0, length, new Comparator() { // from class: com.google.android.gms.internal.fido.zzbd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Comparator comparator3 = comparator;
                    Map.Entry entry3 = (Map.Entry) obj;
                    Map.Entry entry4 = (Map.Entry) obj2;
                    int i6 = zzbg.zzb;
                    entry3.getClass();
                    entry4.getClass();
                    return comparator3.compare(entry3.getKey(), entry4.getKey());
                }
            });
            Map.Entry entry3 = entryArr2[0];
            entry3.getClass();
            Object key2 = entry3.getKey();
            objArr[0] = key2;
            Object value2 = entry3.getValue();
            objArr2[0] = value2;
            zzas.zza(objArr[0], value2);
            while (i < length) {
                Map.Entry entry4 = entryArr2[i - 1];
                entry4.getClass();
                Map.Entry entry5 = entryArr2[i];
                entry5.getClass();
                Object key3 = entry5.getKey();
                Object value3 = entry5.getValue();
                zzas.zza(key3, value3);
                objArr[i] = key3;
                objArr2[i] = value3;
                if (comparator.compare(key2, key3) == 0) {
                    throw new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(entry4) + " and " + String.valueOf(entry5));
                }
                i++;
                key2 = key3;
            }
        }
        return new zzbg(new zzbu(zzaz.zzh(objArr, length), comparator), zzaz.zzh(objArr2, length), null);
    }

    public static zzbg zzg(Comparator comparator) {
        if (zzbp.zza.equals(comparator)) {
            return zzd;
        }
        zzbu zzbuVarZzq = zzbi.zzq(comparator);
        int i = zzaz.zzd;
        return new zzbg(zzbuVarZzq, zzbs.zza, null);
    }

    private final zzbg zzl(int i, int i5) {
        if (i == 0) {
            if (i5 == this.zzf.size()) {
                return this;
            }
            i = 0;
        }
        return i == i5 ? zzg(((zzbi) this.zze).zza) : new zzbg(this.zze.zzu(i, i5), this.zzf.subList(i, i5), null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return zzbn.zza(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((zzbi) this.zze).zza;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.zze.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        zzbg zzbgVar = this.zzg;
        if (zzbgVar != null) {
            return zzbgVar;
        }
        if (!isEmpty()) {
            return new zzbg((zzbu) this.zze.descendingSet(), this.zzf.zzf(), this);
        }
        Comparator comparator = ((zzbi) this.zze).zza;
        return zzg((comparator instanceof zzbr ? (zzbr) comparator : new zzat(comparator)).zza());
    }

    @Override // com.google.android.gms.internal.fido.zzba, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzi().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.zze.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return zzbn.zza(floorEntry(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    @Override // com.google.android.gms.internal.fido.zzba, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.fido.zzbu r0 = r3.zze
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            com.google.android.gms.internal.fido.zzaz r2 = r0.zzd     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.zza     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r3 = 0
            return r3
        L16:
            com.google.android.gms.internal.fido.zzaz r3 = r3.zzf
            java.lang.Object r3 = r3.get(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzbg.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return zzbn.zza(higherEntry(obj));
    }

    @Override // com.google.android.gms.internal.fido.zzba, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.zze;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzi().get(this.zzf.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.zze.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return zzbn.zza(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.zze;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzf.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // com.google.android.gms.internal.fido.zzba, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.fido.zzba
    /* renamed from: zza */
    public final zzav values() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.fido.zzba
    public final zzbc zzb() {
        return isEmpty() ? zzbt.zza : new zzbf(this);
    }

    @Override // com.google.android.gms.internal.fido.zzba
    /* renamed from: zzd */
    public final /* synthetic */ zzbc keySet() {
        return this.zze;
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzbg headMap(Object obj, boolean z4) {
        zzbu zzbuVar = this.zze;
        obj.getClass();
        return zzl(0, zzbuVar.zzs(obj, z4));
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzbg subMap(Object obj, boolean z4, Object obj2, boolean z5) {
        obj.getClass();
        obj2.getClass();
        if (((zzbi) this.zze).zza.compare(obj, obj2) <= 0) {
            return headMap(obj2, z5).tailMap(obj, z4);
        }
        throw new IllegalArgumentException(zzaq.zza("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final zzbg tailMap(Object obj, boolean z4) {
        zzbu zzbuVar = this.zze;
        obj.getClass();
        return zzl(zzbuVar.zzt(obj, z4), this.zzf.size());
    }
}
