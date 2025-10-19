package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzanj.smali */
final class zzanj implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzang zzd;

    public /* synthetic */ zzanj(zzang zzangVar, zzanl zzanlVar) {
        this(zzangVar);
    }

    private final Iterator zza() {
        if (this.zzc == null) {
            this.zzc = this.zzd.zzc.entrySet().iterator();
        }
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza + 1 < this.zzd.zzb || (!this.zzd.zzc.isEmpty() && zza().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.zzb = true;
        int i = this.zza + 1;
        this.zza = i;
        return i < this.zzd.zzb ? (zzank) this.zzd.zza[this.zza] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        this.zzd.zzg();
        if (this.zza >= this.zzd.zzb) {
            zza().remove();
            return;
        }
        zzang zzangVar = this.zzd;
        int i = this.zza;
        this.zza = i - 1;
        zzangVar.zzb(i);
    }

    private zzanj(zzang zzangVar) {
        Objects.requireNonNull(zzangVar);
        this.zzd = zzangVar;
        this.zza = -1;
    }
}
