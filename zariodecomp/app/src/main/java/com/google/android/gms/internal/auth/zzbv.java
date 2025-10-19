package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.internal.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzbv.smali */
public final class zzbv implements s {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        C.f(status);
        this.zza = status;
        this.zzb = "";
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        C.f(str);
        this.zzb = str;
        this.zza = Status.f5530e;
    }
}
