package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\bt.smali */
final class bt {

    /* renamed from: a, reason: collision with root package name */
    private final bn f6334a;

    public bt(bn bnVar) {
        this.f6334a = bnVar;
    }

    public final /* synthetic */ Task a(long j5, long j6, int i, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f6334a.d(standardIntegrityTokenRequest.a(), j5, j6, 0);
    }
}
