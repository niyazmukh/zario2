package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import o2.v;
import o2.w;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzafj.smali */
final class zzafj implements zzafm {
    private final /* synthetic */ String zza;

    public zzafj(zzafh zzafhVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafm
    public final void zza(w wVar, Object... objArr) {
        wVar.onCodeSent(this.zza, new v());
    }
}
