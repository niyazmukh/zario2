package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzak.smali */
final class zzak implements s {
    private final Status zza;

    public zzak(Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.zza;
    }
}
