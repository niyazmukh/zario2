package com.google.android.gms.internal.p000authapi;

import S0.f;
import c1.m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbav.smali */
final class zbav extends zbak {
    final /* synthetic */ TaskCompletionSource zba;

    public zbav(zbaw zbawVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbal
    public final void zbb(Status status, m mVar) {
        f.X(status, mVar, this.zba);
    }
}
