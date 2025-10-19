package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import o2.u;
import o2.w;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzafi.smali */
final class zzafi implements zzafm {
    private final /* synthetic */ u zza;

    public zzafi(zzafh zzafhVar, u uVar) {
        this.zza = uVar;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafm
    public final void zza(w wVar, Object... objArr) {
        wVar.onVerificationCompleted(this.zza);
    }
}
