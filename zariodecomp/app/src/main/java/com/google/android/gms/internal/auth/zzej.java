package com.google.android.gms.internal.auth;

import B.a;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzej.smali */
final class zzej extends zzdq implements RandomAccess, zzey, zzgd {
    private static final zzej zza;
    private double[] zzb;
    private int zzc;

    static {
        zzej zzejVar = new zzej(new double[0], 0);
        zza = zzejVar;
        zzejVar.zzb();
    }

    public zzej() {
        this(new double[10], 0);
    }

    private final String zzf(int i) {
        return a.h("Index:", i, this.zzc, ", Size:");
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i5;
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i < 0 || i > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        double[] dArr = this.zzb;
        if (i5 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i5 - i);
        } else {
            double[] dArr2 = new double[a.d(i5, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.zzb, i, dArr2, i + 1, this.zzc - i);
            this.zzb = dArr2;
        }
        this.zzb[i] = dDoubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        zzez.zze(collection);
        if (!(collection instanceof zzej)) {
            return super.addAll(collection);
        }
        zzej zzejVar = (zzej) collection;
        int i = zzejVar.zzc;
        if (i == 0) {
            return false;
        }
        int i5 = this.zzc;
        if (f.API_PRIORITY_OTHER - i5 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i;
        double[] dArr = this.zzb;
        if (i6 > dArr.length) {
            this.zzb = Arrays.copyOf(dArr, i6);
        }
        System.arraycopy(zzejVar.zzb, 0, this.zzb, this.zzc, zzejVar.zzc);
        this.zzc = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzej)) {
            return super.equals(obj);
        }
        zzej zzejVar = (zzej) obj;
        if (this.zzc != zzejVar.zzc) {
            return false;
        }
        double[] dArr = zzejVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (Double.doubleToLongBits(this.zzb[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Double.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzc = 1;
        for (int i = 0; i < this.zzc; i++) {
            iZzc = (iZzc * 31) + zzez.zzc(Double.doubleToLongBits(this.zzb[i]));
        }
        return iZzc;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.zzc;
        for (int i5 = 0; i5 < i; i5++) {
            if (this.zzb[i5] == dDoubleValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzg(i);
        double[] dArr = this.zzb;
        double d5 = dArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i5) {
        zza();
        if (i5 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i5, dArr, i, this.zzc - i5);
        this.zzc -= i5 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        zzg(i);
        double[] dArr = this.zzb;
        double d5 = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzey
    public final /* bridge */ /* synthetic */ zzey zzd(int i) {
        if (i >= this.zzc) {
            return new zzej(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d5) {
        zza();
        int i = this.zzc;
        double[] dArr = this.zzb;
        if (i == dArr.length) {
            double[] dArr2 = new double[a.d(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        dArr3[i5] = d5;
    }

    private zzej(double[] dArr, int i) {
        this.zzb = dArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }
}
