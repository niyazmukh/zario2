package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaks.smali */
final class zzaks extends zzajp<Double> implements zzalm<Double>, RandomAccess {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        new zzaks(dArr, 0, false);
    }

    public zzaks() {
        this(zza, 0, true);
    }

    private static int zzd(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zze(int i) {
        return a.h("Index:", i, this.zzc, ", Size:");
    }

    private final void zzf(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zze(i));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i5;
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i < 0 || i > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zze(i));
        }
        double[] dArr = this.zzb;
        if (i5 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i5 - i);
        } else {
            double[] dArr2 = new double[zzd(dArr.length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, i);
            System.arraycopy(this.zzb, i, dArr2, i + 1, this.zzc - i);
            this.zzb = dArr2;
        }
        this.zzb[i] = dDoubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        zza();
        zzalh.zza(collection);
        if (!(collection instanceof zzaks)) {
            return super.addAll(collection);
        }
        zzaks zzaksVar = (zzaks) collection;
        int i = zzaksVar.zzc;
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
        System.arraycopy(zzaksVar.zzb, 0, this.zzb, this.zzc, zzaksVar.zzc);
        this.zzc = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaks)) {
            return super.equals(obj);
        }
        zzaks zzaksVar = (zzaks) obj;
        if (this.zzc != zzaksVar.zzc) {
            return false;
        }
        double[] dArr = zzaksVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (Double.doubleToLongBits(this.zzb[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Double.valueOf(zzb(i));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i = 0; i < this.zzc; i++) {
            iZza = (iZza * 31) + zzalh.zza(Double.doubleToLongBits(this.zzb[i]));
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzb[i] == dDoubleValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        zzf(i);
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        zzf(i);
        double[] dArr = this.zzb;
        double d5 = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
    public final /* synthetic */ zzalm<Double> zza(int i) {
        if (i >= this.zzc) {
            return new zzaks(i == 0 ? zza : Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zzb(int i) {
        zzf(i);
        return this.zzb[i];
    }

    public final void zzc(int i) {
        double[] dArr = this.zzb;
        if (i <= dArr.length) {
            return;
        }
        if (dArr.length == 0) {
            this.zzb = new double[Math.max(i, 10)];
            return;
        }
        int length = dArr.length;
        while (length < i) {
            length = zzd(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzaks(double[] dArr, int i, boolean z4) {
        super(z4);
        this.zzb = dArr;
        this.zzc = i;
    }

    public final void zza(double d5) {
        zza();
        int i = this.zzc;
        double[] dArr = this.zzb;
        if (i == dArr.length) {
            double[] dArr2 = new double[zzd(dArr.length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, this.zzc);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        dArr3[i5] = d5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Double) obj).doubleValue());
        return true;
    }
}
