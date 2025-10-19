package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzd.smali */
abstract class zzd<T> implements Iterator<T> {
    private int zza = 2;
    private T zzb;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zza;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int i5 = i - 1;
        if (i5 == 0) {
            return true;
        }
        if (i5 != 2) {
            this.zza = 4;
            this.zzb = zza();
            if (this.zza != 3) {
                this.zza = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.zza = 2;
        T t4 = this.zzb;
        this.zzb = null;
        return t4;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract T zza();

    public final T zzb() {
        this.zza = 3;
        return null;
    }
}
