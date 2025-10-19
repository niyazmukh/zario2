package com.google.android.gms.internal.p000authapi;

import c1.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbau.smali */
final class zbau extends zbai {
    final /* synthetic */ TaskCompletionSource zba;

    public zbau(zbaw zbawVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbaj
    public final void zbb(Status status, k kVar) {
        if (status.c()) {
            this.zba.setResult(kVar);
        } else {
            this.zba.setException(C.j(status));
        }
    }
}
