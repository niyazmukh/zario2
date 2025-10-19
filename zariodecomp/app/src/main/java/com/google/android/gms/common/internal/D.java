package com.google.android.gms.common.internal;

import h1.C0588a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\D.smali */
public final class D extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final C0588a f5665a;

    public D(C0588a c0588a) {
        C.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (c0588a.f7621b == 0 || c0588a.f7622c == null) ? false : true);
        this.f5665a = c0588a;
    }
}
