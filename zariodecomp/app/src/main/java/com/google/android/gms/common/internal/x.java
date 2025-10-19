package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\x.smali */
public final class x implements com.google.android.gms.common.api.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f5760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f5761b;

    public x(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, J3.c cVar) {
        this.f5760a = basePendingResult;
        this.f5761b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Status status) {
        boolean zC = status.c();
        TaskCompletionSource taskCompletionSource = this.f5761b;
        if (!zC) {
            taskCompletionSource.setException(C.j(status));
            return;
        }
        this.f5760a.await(0L, TimeUnit.MILLISECONDS);
        taskCompletionSource.setResult(null);
    }
}
