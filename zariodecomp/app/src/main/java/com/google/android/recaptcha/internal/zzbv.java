package com.google.android.recaptcha.internal;

import java.util.concurrent.Executor;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzbv.smali */
final class zzbv implements Executor {
    public static final zzbv zza = new zzbv();

    private zzbv() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
