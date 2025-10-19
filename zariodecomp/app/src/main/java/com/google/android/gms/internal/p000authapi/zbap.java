package com.google.android.gms.internal.p000authapi;

import c1.C0334a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbap.smali */
final class zbap extends zby {
    final /* synthetic */ TaskCompletionSource zba;

    public zbap(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbz
    public final void zbb(Status status, C0334a c0334a) {
        if (status.c()) {
            this.zba.setResult(c0334a);
        } else {
            this.zba.setException(C.j(status));
        }
    }
}
