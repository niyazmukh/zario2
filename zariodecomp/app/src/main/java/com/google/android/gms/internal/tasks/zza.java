package com.google.android.gms.internal.tasks;

import android.os.Handler;
import android.os.Looper;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\tasks\zza.smali */
public final class zza extends Handler {
    private final Looper zza;

    public zza() {
        this.zza = Looper.getMainLooper();
    }

    public zza(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}
