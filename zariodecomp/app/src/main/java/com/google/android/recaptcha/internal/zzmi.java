package com.google.android.recaptcha.internal;

import B.a;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzmi.smali */
final class zzmi extends zzkr implements RandomAccess, zznk, zzor {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        new zzmi(dArr, 0, false);
    }

    public zzmi() {
        this(zza, 0, true);
    }

    private static int zzh(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzi(int i) {
        return a.h("Index:", i, this.zzc, ", Size:");
    }

    private final void zzj(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i5;
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i < 0 || i > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
        int i6 = i + 1;
        double[] dArr = this.zzb;
        int length = dArr.length;
        if (i5 < length) {
            System.arraycopy(dArr, i, dArr, i6, i5 - i);
        } else {
            double[] dArr2 = new double[zzh(length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, i);
            System.arraycopy(this.zzb, i, dArr2, i6, this.zzc - i);
            this.zzb = dArr2;
        }
        this.zzb[i] = dDoubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zznl.zzb;
        collection.getClass();
        if (!(collection instanceof zzmi)) {
            return super.addAll(collection);
        }
        zzmi zzmiVar = (zzmi) collection;
        int i = zzmiVar.zzc;
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
        System.arraycopy(zzmiVar.zzb, 0, this.zzb, this.zzc, zzmiVar.zzc);
        this.zzc = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmi)) {
            return super.equals(obj);
        }
        zzmi zzmiVar = (zzmi) obj;
        if (this.zzc != zzmiVar.zzc) {
            return false;
        }
        double[] dArr = zzmiVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (Double.doubleToLongBits(this.zzb[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzj(i);
        return Double.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zzb[i5]);
            byte[] bArr = zznl.zzb;
            i = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i;
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

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzj(i);
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

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        zzj(i);
        double[] dArr = this.zzb;
        double d5 = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zznk
    public final /* bridge */ /* synthetic */ zznk zzd(int i) {
        if (i >= this.zzc) {
            return new zzmi(i == 0 ? zza : Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zze(int i) {
        zzj(i);
        return this.zzb[i];
    }

    public final void zzf(double d5) {
        zza();
        int i = this.zzc;
        int length = this.zzb.length;
        if (i == length) {
            double[] dArr = new double[zzh(length)];
            System.arraycopy(this.zzb, 0, dArr, 0, this.zzc);
            this.zzb = dArr;
        }
        double[] dArr2 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        dArr2[i5] = d5;
    }

    public final void zzg(int i) {
        int length = this.zzb.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new double[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzh(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzmi(double[] dArr, int i, boolean z4) {
        super(z4);
        this.zzb = dArr;
        this.zzc = i;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}
