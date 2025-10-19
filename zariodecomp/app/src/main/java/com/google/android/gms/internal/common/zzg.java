package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\common\zzg.smali */
public class zzg extends Handler {
    private final Looper zza;

    public zzg() {
        this.zza = Looper.getMainLooper();
    }

    public zzg(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    public zzg(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zza = Looper.getMainLooper();
    }
}
