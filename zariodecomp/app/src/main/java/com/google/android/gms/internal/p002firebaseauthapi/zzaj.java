package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaj.smali */
final class zzaj<E> extends zzab<E> {
    private final zzah<E> zza;

    public zzaj(zzah<E> zzahVar, int i) {
        super(zzahVar.size(), i);
        this.zza = zzahVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzab
    public final E zza(int i) {
        return this.zza.get(i);
    }
}
