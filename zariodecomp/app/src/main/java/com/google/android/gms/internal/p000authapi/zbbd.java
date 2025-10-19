package com.google.android.gms.internal.p000authapi;

import S0.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC0347i;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbbd.smali */
final class zbbd extends AbstractBinderC0347i {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbd(zbbg zbbgVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0348j
    public final void onResult(Status status) {
        f.X(status, null, this.zba);
    }
}
