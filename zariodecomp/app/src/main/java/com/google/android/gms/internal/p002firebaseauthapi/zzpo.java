package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzpo.smali */
final class zzpo implements Iterable {
    private final /* synthetic */ List zza;
    private final /* synthetic */ List zzb;

    public zzpo(zzpl zzplVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzplVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzpq(this.zza.iterator(), this.zzb.iterator());
    }
}
