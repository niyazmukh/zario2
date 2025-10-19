package com.google.android.gms.internal.p000authapi;

import S0.f;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbbe.smali */
final class zbbe extends zbag {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbe(zbbg zbbgVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbah
    public final void zbb(Status status, PendingIntent pendingIntent) {
        f.X(status, pendingIntent, this.zba);
    }
}
