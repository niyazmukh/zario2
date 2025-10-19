package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzbi.smali */
public abstract class zzbi extends zzbj implements NavigableSet, zzbz {
    final transient Comparator zza;
    transient zzbi zzb;

    public zzbi(Comparator comparator) {
        this.zza = comparator;
    }

    public static zzbu zzq(Comparator comparator) {
        if (zzbp.zza.equals(comparator)) {
            return zzbu.zzc;
        }
        int i = zzaz.zzd;
        return new zzbu(zzbs.zza, comparator);
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        obj.getClass();
        return zzbk.zza(zzp(obj, true), null);
    }

    @Override // java.util.SortedSet, com.google.android.gms.internal.fido.zzbz
    public final Comparator comparator() {
        return this.zza;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        obj.getClass();
        return zzbm.zza(zzm(obj, true).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return zzm(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        obj.getClass();
        return zzbk.zza(zzp(obj, false), null);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        obj.getClass();
        return zzbm.zza(zzm(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return zzp(obj, true);
    }

    @Override // com.google.android.gms.internal.fido.zzbc, com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzcb iterator();

    public abstract zzbi zzf();

    @Override // java.util.NavigableSet
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final zzbi descendingSet() {
        zzbi zzbiVar = this.zzb;
        if (zzbiVar != null) {
            return zzbiVar;
        }
        zzbi zzbiVarZzf = zzf();
        this.zzb = zzbiVarZzf;
        zzbiVarZzf.zzb = this;
        return zzbiVarZzf;
    }

    public abstract zzbi zzm(Object obj, boolean z4);

    @Override // java.util.NavigableSet
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzbi subSet(Object obj, boolean z4, Object obj2, boolean z5) {
        obj.getClass();
        obj2.getClass();
        zzap.zzc(this.zza.compare(obj, obj2) <= 0);
        return zzo(obj, z4, obj2, z5);
    }

    public abstract zzbi zzo(Object obj, boolean z4, Object obj2, boolean z5);

    public abstract zzbi zzp(Object obj, boolean z4);

    @Override // java.util.NavigableSet
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public abstract zzcb descendingIterator();

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z4) {
        obj.getClass();
        return zzm(obj, z4);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z4) {
        obj.getClass();
        return zzp(obj, z4);
    }
}
