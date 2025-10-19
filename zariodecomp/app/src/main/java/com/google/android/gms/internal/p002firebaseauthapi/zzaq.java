package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaq.smali */
public abstract class zzaq<E> extends zzag<E> implements Set<E> {
    private transient zzah<E> zza;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return zzav.zza(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzav.zza(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public zzah<E> zzc() {
        zzah<E> zzahVar = this.zza;
        if (zzahVar != null) {
            return zzahVar;
        }
        zzah<E> zzahVarZzf = zzf();
        this.zza = zzahVarZzf;
        return zzahVarZzf;
    }

    public zzah<E> zzf() {
        return zzah.zza(toArray());
    }
}
