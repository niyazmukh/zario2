package com.google.android.gms.internal.fido;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzbu.smali */
final class zzbu extends zzbi {
    static final zzbu zzc;
    final transient zzaz zzd;

    static {
        int i = zzaz.zzd;
        zzc = new zzbu(zzbs.zza, zzbp.zza);
    }

    public zzbu(zzaz zzazVar, Comparator comparator) {
        super(comparator);
        this.zzd = zzazVar;
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iZzt = zzt(obj, true);
        if (iZzt == this.zzd.size()) {
            return null;
        }
        return this.zzd.get(iZzt);
    }

    @Override // com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.zzd, obj, ((zzbi) this).zza) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzbo) {
            collection = ((zzbo) collection).zza();
        }
        if (!zzca.zza(((zzbi) this).zza, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zzcc zzccVarListIterator = this.zzd.listIterator(0);
        Iterator it = collection.iterator();
        if (!zzccVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = zzccVarListIterator.next();
        while (true) {
            try {
                int iCompare = ((zzbi) this).zza.compare(next2, next);
                if (iCompare >= 0) {
                    if (iCompare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!zzccVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = zzccVarListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzbc, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.zzd.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!zzca.zza(((zzbi) this).zza, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            zzcc zzccVarListIterator = this.zzd.listIterator(0);
            while (zzccVarListIterator.hasNext()) {
                E next = zzccVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || ((zzbi) this).zza.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.zzd.get(0);
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iZzs = zzs(obj, true) - 1;
        if (iZzs == -1) {
            return null;
        }
        return this.zzd.get(iZzs);
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iZzt = zzt(obj, false);
        if (iZzt == this.zzd.size()) {
            return null;
        }
        return this.zzd.get(iZzt);
    }

    @Override // com.google.android.gms.internal.fido.zzbi, com.google.android.gms.internal.fido.zzbc, com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.zzd.get(r1.size() - 1);
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iZzs = zzs(obj, false) - 1;
        if (iZzs == -1) {
            return null;
        }
        return this.zzd.get(iZzs);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int zza(Object[] objArr, int i) {
        return this.zzd.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int zzb() {
        return this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.fido.zzbi, com.google.android.gms.internal.fido.zzbc, com.google.android.gms.internal.fido.zzav
    /* renamed from: zzd */
    public final zzcb iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final Object[] zze() {
        return this.zzd.zze();
    }

    @Override // com.google.android.gms.internal.fido.zzbi
    public final zzbi zzf() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(((zzbi) this).zza);
        return isEmpty() ? zzbi.zzq(comparatorReverseOrder) : new zzbu(this.zzd.zzf(), comparatorReverseOrder);
    }

    @Override // com.google.android.gms.internal.fido.zzbc
    public final zzaz zzi() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzbi
    public final zzbi zzm(Object obj, boolean z4) {
        return zzu(0, zzs(obj, z4));
    }

    @Override // com.google.android.gms.internal.fido.zzbi
    public final zzbi zzo(Object obj, boolean z4, Object obj2, boolean z5) {
        return zzp(obj, z4).zzm(obj2, z5);
    }

    @Override // com.google.android.gms.internal.fido.zzbi
    public final zzbi zzp(Object obj, boolean z4) {
        return zzu(zzt(obj, z4), this.zzd.size());
    }

    @Override // com.google.android.gms.internal.fido.zzbi, java.util.NavigableSet
    /* renamed from: zzr */
    public final zzcb descendingIterator() {
        return this.zzd.zzf().listIterator(0);
    }

    public final int zzs(Object obj, boolean z4) {
        zzaz zzazVar = this.zzd;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(zzazVar, obj, ((zzbi) this).zza);
        return iBinarySearch >= 0 ? z4 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int zzt(Object obj, boolean z4) {
        zzaz zzazVar = this.zzd;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(zzazVar, obj, ((zzbi) this).zza);
        return iBinarySearch >= 0 ? z4 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    public final zzbu zzu(int i, int i5) {
        if (i == 0) {
            if (i5 == this.zzd.size()) {
                return this;
            }
            i = 0;
        }
        return i < i5 ? new zzbu(this.zzd.subList(i, i5), ((zzbi) this).zza) : zzbi.zzq(((zzbi) this).zza);
    }
}
