package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0343e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbk.smali */
final class zbk extends zbd {
    private final InterfaceC0343e zba;

    public zbk(InterfaceC0343e interfaceC0343e) {
        this.zba = interfaceC0343e;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbd, com.google.android.gms.internal.p000authapi.zbs
    public final void zbc(Status status) {
        this.zba.setResult(status);
    }
}
