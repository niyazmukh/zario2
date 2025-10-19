package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import e1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzbu.smali */
final class zzbu implements s {
    private final Status zza;
    private b zzb;

    public zzbu(Status status) {
        this.zza = status;
    }

    public final b getResponse() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.zza;
    }

    public zzbu(b bVar) {
        this.zzb = bVar;
        this.zza = Status.f5530e;
    }
}
