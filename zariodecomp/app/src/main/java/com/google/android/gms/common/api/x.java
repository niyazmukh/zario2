package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\x.smali */
public final class x extends BasePendingResult {

    /* renamed from: a, reason: collision with root package name */
    public final Status f5654a;

    public x(Status status) {
        super(null);
        this.f5654a = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final s createFailedResult(Status status) {
        return this.f5654a;
    }
}
