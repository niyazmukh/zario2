package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzajt.smali */
final class zzajt extends zzajp<Boolean> implements zzalm<Boolean>, RandomAccess {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzajt(zArr, 0, false);
    }

    public zzajt() {
        this(zza, 0, true);
    }

    private static int zzc(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzd(int i) {
        return a.h("Index:", i, this.zzc, ", Size:");
    }

    private final void zze(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzd(i));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i5;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i < 0 || i > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzd(i));
        }
        boolean[] zArr = this.zzb;
        if (i5 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i5 - i);
        } else {
            boolean[] zArr2 = new boolean[zzc(zArr.length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i);
            System.arraycopy(this.zzb, i, zArr2, i + 1, this.zzc - i);
            this.zzb = zArr2;
        }
        this.zzb[i] = zBooleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zza();
        zzalh.zza(collection);
        if (!(collection instanceof zzajt)) {
            return super.addAll(collection);
        }
        zzajt zzajtVar = (zzajt) collection;
        int i = zzajtVar.zzc;
        if (i == 0) {
            return false;
        }
        int i5 = this.zzc;
        if (f.API_PRIORITY_OTHER - i5 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i;
        boolean[] zArr = this.zzb;
        if (i6 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i6);
        }
        System.arraycopy(zzajtVar.zzb, 0, this.zzb, this.zzc, zzajtVar.zzc);
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
        if (!(obj instanceof zzajt)) {
            return super.equals(obj);
        }
        zzajt zzajtVar = (zzajt) obj;
        if (this.zzc != zzajtVar.zzc) {
            return false;
        }
        boolean[] zArr = zzajtVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Boolean.valueOf(zzb(i));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i = 0; i < this.zzc; i++) {
            iZza = (iZza * 31) + zzalh.zza(this.zzb[i]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzb[i] == zBooleanValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        zze(i);
        boolean[] zArr = this.zzb;
        boolean z4 = zArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i5) {
        zza();
        if (i5 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i5, zArr, i, this.zzc - i5);
        this.zzc -= i5 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        zze(i);
        boolean[] zArr = this.zzb;
        boolean z4 = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
    public final /* synthetic */ zzalm<Boolean> zza(int i) {
        if (i >= this.zzc) {
            return new zzajt(i == 0 ? zza : Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zzb(int i) {
        zze(i);
        return this.zzb[i];
    }

    private zzajt(boolean[] zArr, int i, boolean z4) {
        super(z4);
        this.zzb = zArr;
        this.zzc = i;
    }

    public final void zza(boolean z4) {
        zza();
        int i = this.zzc;
        boolean[] zArr = this.zzb;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[zzc(zArr.length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, this.zzc);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        zArr3[i5] = z4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Boolean) obj).booleanValue());
        return true;
    }
}
