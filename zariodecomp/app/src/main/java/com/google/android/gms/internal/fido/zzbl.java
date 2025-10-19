package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzbl.smali */
final class zzbl extends zzcb {
    boolean zza;
    final /* synthetic */ Object zzb;

    public zzbl(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza) {
            throw new NoSuchElementException();
        }
        this.zza = true;
        return this.zzb;
    }
}
