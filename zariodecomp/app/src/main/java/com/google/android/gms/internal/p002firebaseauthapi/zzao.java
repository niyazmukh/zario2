package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzao.smali */
public final class zzao<K, V> {
    zzan zza;
    private Object[] zzb;
    private int zzc;

    public zzao() {
        this(4);
    }

    public final zzao<K, V> zza(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zza(((Collection) iterable).size() + this.zzc);
        }
        for (Map.Entry<? extends K, ? extends V> entry : iterable) {
            K key = entry.getKey();
            V value = entry.getValue();
            zza(this.zzc + 1);
            zzae.zza(key, value);
            Object[] objArr = this.zzb;
            int i = this.zzc;
            objArr[i * 2] = key;
            objArr[(i * 2) + 1] = value;
            this.zzc = i + 1;
        }
        return this;
    }

    public zzao(int i) {
        this.zzb = new Object[i * 2];
        this.zzc = 0;
    }

    public final zzal<K, V> zza() {
        zzan zzanVar = this.zza;
        if (zzanVar == null) {
            zzas zzasVarZza = zzas.zza(this.zzc, this.zzb, this);
            zzan zzanVar2 = this.zza;
            if (zzanVar2 == null) {
                return zzasVarZza;
            }
            throw zzanVar2.zza();
        }
        throw zzanVar.zza();
    }

    private final void zza(int i) {
        int i5 = i << 1;
        Object[] objArr = this.zzb;
        if (i5 > objArr.length) {
            this.zzb = Arrays.copyOf(objArr, zzai.zza(objArr.length, i5));
        }
    }
}
