package com.google.android.gms.internal.p000authapi;

import S0.f;
import c1.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbbc.smali */
final class zbbc extends zbab {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbc(zbbg zbbgVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbac
    public final void zbb(Status status, g gVar) {
        f.X(status, gVar, this.zba);
    }
}
