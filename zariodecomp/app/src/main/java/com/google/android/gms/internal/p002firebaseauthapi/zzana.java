package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzana.smali */
final class zzana<E> extends zzajp<E> implements RandomAccess {
    private static final Object[] zza;
    private static final zzana<Object> zzb;
    private E[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzana<>(objArr, 0, false);
    }

    public zzana() {
        this(zza, 0, true);
    }

    private static int zzb(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzc(int i) {
        return a.h("Index:", i, this.zzd, ", Size:");
    }

    public static <E> zzana<E> zzd() {
        return (zzana<E>) zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final void add(int i, E e5) {
        int i5;
        zza();
        if (i < 0 || i > (i5 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
        E[] eArr = this.zzc;
        if (i5 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i5 - i);
        } else {
            E[] eArr2 = (E[]) new Object[zzb(eArr.length)];
            System.arraycopy(this.zzc, 0, eArr2, 0, i);
            System.arraycopy(this.zzc, i, eArr2, i + 1, this.zzd - i);
            this.zzc = eArr2;
        }
        this.zzc[i] = e5;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        zzd(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        zza();
        zzd(i);
        E[] eArr = this.zzc;
        E e5 = eArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return e5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final E set(int i, E e5) {
        zza();
        zzd(i);
        E[] eArr = this.zzc;
        E e6 = eArr[i];
        eArr[i] = e5;
        ((AbstractList) this).modCount++;
        return e6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
    public final /* synthetic */ zzalm zza(int i) {
        if (i >= this.zzd) {
            return new zzana(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzana(E[] eArr, int i, boolean z4) {
        super(z4);
        this.zzc = eArr;
        this.zzd = i;
    }

    private final void zzd(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e5) {
        zza();
        int i = this.zzd;
        E[] eArr = this.zzc;
        if (i == eArr.length) {
            this.zzc = (E[]) Arrays.copyOf(this.zzc, zzb(eArr.length));
        }
        E[] eArr2 = this.zzc;
        int i5 = this.zzd;
        this.zzd = i5 + 1;
        eArr2[i5] = e5;
        ((AbstractList) this).modCount++;
        return true;
    }
}
