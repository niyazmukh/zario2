package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import java.util.Objects;
import o2.w;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzafk.smali */
final class zzafk implements zzafm {
    private final /* synthetic */ Status zza;

    public zzafk(zzafh zzafhVar, Status status) {
        this.zza = status;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafm
    public final void zza(w wVar, Object... objArr) {
        wVar.onVerificationFailed(zzaen.zza(this.zza));
    }
}
