package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzajy.smali */
final class zzajy extends zzaka {
    private int zza;
    private final int zzb;
    private final /* synthetic */ zzajv zzc;

    public zzajy(zzajv zzajvVar) {
        Objects.requireNonNull(zzajvVar);
        this.zzc = zzajvVar;
        this.zza = 0;
        this.zzb = zzajvVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final byte zza() {
        int i = this.zza;
        if (i >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i + 1;
        return this.zzc.zzb(i);
    }
}
