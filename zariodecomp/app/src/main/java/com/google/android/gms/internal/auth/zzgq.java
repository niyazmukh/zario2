package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzgq.smali */
final class zzgq implements Iterator {
    final /* synthetic */ zzgu zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = zzgu.zzh(this.zza).entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb + 1 >= zzgu.zzf(this.zza).size()) {
            return !zzgu.zzh(this.zza).isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        return i < zzgu.zzf(this.zza).size() ? (Map.Entry) zzgu.zzf(this.zza).get(this.zzb) : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzgu.zzi(this.zza);
        if (this.zzb >= zzgu.zzf(this.zza).size()) {
            zza().remove();
            return;
        }
        zzgu zzguVar = this.zza;
        int i = this.zzb;
        this.zzb = i - 1;
        zzgu.zzd(zzguVar, i);
    }
}
