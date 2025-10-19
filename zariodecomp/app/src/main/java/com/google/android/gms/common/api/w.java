package com.google.android.gms.common.api;

import h1.C0590c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\w.smali */
public final class w extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final C0590c f5653a;

    public w(C0590c c0590c) {
        this.f5653a = c0590c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f5653a));
    }
}
