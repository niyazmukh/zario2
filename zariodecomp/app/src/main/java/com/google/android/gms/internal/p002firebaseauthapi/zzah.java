package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzah.smali */
public abstract class zzah<E> extends zzag<E> implements List<E>, RandomAccess {
    private static final zzax<Object> zza = new zzaj(zzap.zza, 0);

    public static <E> zzah<E> zzb(Object[] objArr, int i) {
        return i == 0 ? (zzah<E>) zzap.zza : new zzap(objArr, i);
    }

    public static <E> zzak<E> zzf() {
        return new zzak<>();
    }

    public static <E> zzah<E> zzg() {
        return (zzah<E>) zzap.zza;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == zzu.zza(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i5 = 0;
                while (true) {
                    if (i5 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e5 = get(i5);
                        i5++;
                        if (!Objects.equals(e5, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i = ~(~(get(i5).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (zzax) listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e5) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i + i5] = get(i5);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    @Deprecated
    public final zzah<E> zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzay<E> iterator() {
        return (zzax) listIterator();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i) {
        zzu.zzb(i, size());
        return isEmpty() ? zza : new zzaj(this, i);
    }

    public static <E> zzah<E> zza(Object[] objArr) {
        return zzb(objArr, objArr.length);
    }

    public static <E> zzah<E> zza(E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12) {
        Object[] objArr = {e5, e6, e7, e8, e9, e10, e11, e12};
        for (int i = 0; i < 8; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(a.g(i, "at index "));
            }
        }
        return zzb(objArr, 8);
    }

    @Override // java.util.List
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public zzah<E> subList(int i, int i5) {
        zzu.zza(i, i5, size());
        int i6 = i5 - i;
        if (i6 == size()) {
            return this;
        }
        if (i6 == 0) {
            return (zzah<E>) zzap.zza;
        }
        return new zzam(this, i, i6);
    }
}
