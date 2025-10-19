package com.google.android.recaptcha.internal;

import B.a;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zznx.smali */
final class zznx extends zzkr implements RandomAccess, zznj, zzor {
    private static final long[] zza;
    private static final zznx zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zznx(jArr, 0, false);
    }

    public zznx() {
        this(zza, 0, true);
    }

    public static zznx zzf() {
        return zzb;
    }

    private static int zzi(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzj(int i) {
        return a.h("Index:", i, this.zzd, ", Size:");
    }

    private final void zzk(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzj(i));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i5;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i < 0 || i > (i5 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzj(i));
        }
        int i6 = i + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i5 < length) {
            System.arraycopy(jArr, i, jArr, i6, i5 - i);
        } else {
            long[] jArr2 = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i);
            System.arraycopy(this.zzc, i, jArr2, i6, this.zzd - i);
            this.zzc = jArr2;
        }
        this.zzc[i] = jLongValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zznl.zzb;
        collection.getClass();
        if (!(collection instanceof zznx)) {
            return super.addAll(collection);
        }
        zznx zznxVar = (zznx) collection;
        int i = zznxVar.zzd;
        if (i == 0) {
            return false;
        }
        int i5 = this.zzd;
        if (f.API_PRIORITY_OTHER - i5 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i;
        long[] jArr = this.zzc;
        if (i6 > jArr.length) {
            this.zzc = Arrays.copyOf(jArr, i6);
        }
        System.arraycopy(zznxVar.zzc, 0, this.zzc, this.zzd, zznxVar.zzd);
        this.zzd = i6;
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
        if (!(obj instanceof zznx)) {
            return super.equals(obj);
        }
        zznx zznxVar = (zznx) obj;
        if (this.zzd != zznxVar.zzd) {
            return false;
        }
        long[] jArr = zznxVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzk(i);
        return Long.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i5 = 0; i5 < this.zzd; i5++) {
            long j5 = this.zzc[i5];
            byte[] bArr = zznl.zzb;
            i = (i * 31) + ((int) (j5 ^ (j5 >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.zzd;
        for (int i5 = 0; i5 < i; i5++) {
            if (this.zzc[i5] == jLongValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzk(i);
        long[] jArr = this.zzc;
        long j5 = jArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i5) {
        zza();
        if (i5 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzc;
        System.arraycopy(jArr, i5, jArr, i, this.zzd - i5);
        this.zzd -= i5 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        zzk(i);
        long[] jArr = this.zzc;
        long j5 = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zznk
    public final /* bridge */ /* synthetic */ zznk zzd(int i) {
        if (i >= this.zzd) {
            return new zznx(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i) {
        zzk(i);
        return this.zzc[i];
    }

    public final void zzg(long j5) {
        zza();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            long[] jArr = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i5 = this.zzd;
        this.zzd = i5 + 1;
        jArr2[i5] = j5;
    }

    public final void zzh(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new long[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzi(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zznx(long[] jArr, int i, boolean z4) {
        super(z4);
        this.zzc = jArr;
        this.zzd = i;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
