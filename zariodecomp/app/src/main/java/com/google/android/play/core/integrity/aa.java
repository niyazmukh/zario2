package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\aa.smali */
final class aa implements IntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    private final aj f6237a;

    public aa(aj ajVar) {
        this.f6237a = ajVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f6237a.c(integrityTokenRequest);
    }
}
