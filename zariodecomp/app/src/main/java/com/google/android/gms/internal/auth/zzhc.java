package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzhc.smali */
final class zzhc implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzhd zzb;

    public zzhc(zzhd zzhdVar) {
        this.zzb = zzhdVar;
        this.zza = zzhdVar.zza.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
